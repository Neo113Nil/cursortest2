package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.Recorder;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ResolutionsMerger {
    public static final double SAME_AREA_WIDTH_HEIGHT_RATIO = Math.sqrt(2.3703703703703702d);
    public final CameraInfoInternal mCameraInfo;
    public final HashMap mChildSizesCache;
    public final HashSet mChildrenConfigs;
    public final Rational mFallbackAspectRatio;
    public final Rational mSensorAspectRatio;
    public final Size mSensorSize;
    public final Recorder.AnonymousClass3 mSizeSorter;

    public ResolutionsMerger(CameraInternal cameraInternal, HashSet hashSet) {
        Size rectToSize = TransformUtils.rectToSize(cameraInternal.getCameraInfoInternal().getSensorRect());
        CameraInfoInternal cameraInfoInternal = cameraInternal.getCameraInfoInternal();
        Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(cameraInfoInternal, rectToSize);
        this.mChildSizesCache = new HashMap();
        this.mSensorSize = rectToSize;
        Rational rational = ((double) rectToSize.getWidth()) / ((double) rectToSize.getHeight()) > SAME_AREA_WIDTH_HEIGHT_RATIO ? AspectRatioUtil.ASPECT_RATIO_16_9 : AspectRatioUtil.ASPECT_RATIO_4_3;
        StringUtilsKt.d("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + rectToSize + ") is " + rational + ".");
        this.mSensorAspectRatio = rational;
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
        if (rational.equals(rational2)) {
            rational2 = AspectRatioUtil.ASPECT_RATIO_16_9;
        } else if (!rational.equals(AspectRatioUtil.ASPECT_RATIO_16_9)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.mFallbackAspectRatio = rational2;
        this.mCameraInfo = cameraInfoInternal;
        this.mChildrenConfigs = hashSet;
        this.mSizeSorter = anonymousClass3;
    }

    public static Rect getCropRectOfReferenceAspectRatio(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rational = toRational(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = toRational(size);
        if (rational.floatValue() == rational2.floatValue()) {
            rectF2 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, width, height);
        } else {
            if (rational.floatValue() > rational2.floatValue()) {
                float f = width;
                float floatValue = f / rational.floatValue();
                float f2 = (height - floatValue) / 2.0f;
                rectF = new RectF(RecyclerView.DECELERATION_RATE, f2, f, floatValue + f2);
            } else {
                float f3 = height;
                float floatValue2 = rational.floatValue() * f3;
                float f4 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f4, RecyclerView.DECELERATION_RATE, floatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean hasUpscaling(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational toRational(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final PreferredChildSize getPreferredChildSize(UseCaseConfig useCaseConfig, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair create;
        if (TransformUtils.is90or270(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size rectToSize = TransformUtils.rectToSize(rect);
            Iterator it = getSortedChildSizes(useCaseConfig).iterator();
            while (true) {
                if (!it.hasNext()) {
                    create = Pair.create(rectToSize, rectToSize);
                    break;
                }
                Size size3 = (Size) it.next();
                Size rectToSize2 = TransformUtils.rectToSize(getCropRectOfReferenceAspectRatio(size3, rectToSize));
                if (!hasUpscaling(rectToSize2, rectToSize)) {
                    create = Pair.create(size3, rectToSize2);
                    break;
                }
            }
            size = (Size) create.first;
            size2 = (Size) create.second;
        } else {
            Size rectToSize3 = TransformUtils.rectToSize(rect);
            List sortedChildSizes = getSortedChildSizes(useCaseConfig);
            Iterator it2 = sortedChildSizes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = sortedChildSizes.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = rectToSize3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!hasUpscaling(size, rectToSize3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rational = AspectRatioUtil.ASPECT_RATIO_4_3;
                    Size size5 = SizeUtil.RESOLUTION_VGA;
                    if (!AspectRatioUtil.hasMatchingAspectRatio(rectToSize3, rational, size5)) {
                        rational = AspectRatioUtil.ASPECT_RATIO_16_9;
                        if (!AspectRatioUtil.hasMatchingAspectRatio(rectToSize3, rational, size5)) {
                            rational = toRational(rectToSize3);
                        }
                    }
                    if (!isDoubleCropping(rational, size4) && !hasUpscaling(size4, rectToSize3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = getCropRectOfReferenceAspectRatio(rectToSize3, size);
            size2 = size;
        }
        return z2 ? new PreferredChildSize(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new PreferredChildSize(rect, size2, size);
    }

    public final List getSortedChildSizes(UseCaseConfig useCaseConfig) {
        Rational rational;
        if (!this.mChildrenConfigs.contains(useCaseConfig)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) useCaseConfig, "Invalid child config: ");
            return null;
        }
        HashMap hashMap = this.mChildSizesCache;
        if (hashMap.containsKey(useCaseConfig)) {
            List list = (List) hashMap.get(useCaseConfig);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList sortedSupportedOutputSizes = this.mSizeSorter.getSortedSupportedOutputSizes(useCaseConfig);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = sortedSupportedOutputSizes.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = hashMap2.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it2.next();
                Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap2.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = toRational(size);
            }
            arrayList.add(size);
            hashMap2.put(rational, size);
        }
        hashMap.put(useCaseConfig, arrayList);
        return arrayList;
    }

    public final boolean isDoubleCropping(Rational rational, Size size) {
        Rational rational2 = this.mSensorAspectRatio;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AspectRatioUtil.ASPECT_RATIO_4_3;
        Size size2 = SizeUtil.RESOLUTION_VGA;
        if (AspectRatioUtil.hasMatchingAspectRatio(size, rational, size2)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational4 = AspectRatioUtil.ASPECT_RATIO_4_3;
        if (!AspectRatioUtil.hasMatchingAspectRatio(size, rational4, size2)) {
            rational4 = AspectRatioUtil.ASPECT_RATIO_16_9;
            if (!AspectRatioUtil.hasMatchingAspectRatio(size, rational4, size2)) {
                rational4 = toRational(size);
            }
        }
        float floatValue3 = rational4.floatValue();
        if (floatValue == floatValue2 || floatValue2 == floatValue3) {
            return false;
        }
        return floatValue > floatValue2 ? floatValue2 < floatValue3 : floatValue2 > floatValue3;
    }

    public final ArrayList selectOtherAspectRatioParentResolutionsWithFovPriority(List list, boolean z) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_16_9;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, rational3, SizeUtil.RESOLUTION_VGA)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational rational4 = toRational(size);
                    arrayList.add(rational4);
                    hashMap.put(rational4, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new SemanticsSortKt$special$$inlined$thenBy$1(toRational(this.mSensorSize), 2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational5 = (Rational) it3.next();
            if (!rational5.equals(AspectRatioUtil.ASPECT_RATIO_16_9) && !rational5.equals(AspectRatioUtil.ASPECT_RATIO_4_3)) {
                List list3 = (List) hashMap.get(rational5);
                Objects.requireNonNull(list3);
                arrayList3.addAll(selectParentResolutionsByAspectRatio(rational5, list3, z));
            }
        }
        return arrayList3;
    }

    public final ArrayList selectParentResolutionsByAspectRatio(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
            if (AspectRatioUtil.hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new CompareSizesByArea(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.mChildrenConfigs.iterator();
        while (it2.hasNext()) {
            List<Size> sortedChildSizes = getSortedChildSizes((UseCaseConfig) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : sortedChildSizes) {
                    if (!isDoubleCropping(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                sortedChildSizes = arrayList3;
            }
            if (sortedChildSizes.isEmpty()) {
                return new ArrayList();
            }
            if (sortedChildSizes.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = sortedChildSizes.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!hasUpscaling((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (sortedChildSizes.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = sortedChildSizes.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (hasUpscaling((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
