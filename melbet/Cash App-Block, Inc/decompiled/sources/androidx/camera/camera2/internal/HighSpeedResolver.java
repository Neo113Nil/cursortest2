package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.internal.utils.SizeUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class HighSpeedResolver {
    public static final Range DEFAULT_FPS = new Range(120, 120);
    public final CameraMetadata cameraMetadata;
    public final Lazy isHighSpeedSupported$delegate;
    public final Lazy maxSize$delegate;
    public final Lazy streamConfigurationMapCompat$delegate;
    public final Lazy supportedSizes$delegate;

    public HighSpeedResolver(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        this.cameraMetadata = cameraMetadata;
        final int i = 0;
        this.isHighSpeedSupported$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda0
            public final /* synthetic */ HighSpeedResolver f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i2 = i;
                HighSpeedResolver highSpeedResolver = this.f$0;
                switch (i2) {
                    case 0:
                        CameraMetadata cameraMetadata2 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata2).get(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    if (iArr[i3] == 9) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list2 = (List) highSpeedResolver.supportedSizes$delegate.getValue();
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        if (list2 == null) {
                            return null;
                        }
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int area = SizeUtil.getArea((Size) next);
                            do {
                                Object next2 = it.next();
                                int area2 = SizeUtil.getArea((Size) next2);
                                if (area < area2) {
                                    next = next2;
                                    area = area2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        CameraMetadata cameraMetadata3 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata3).get(key2);
                        if (streamConfigurationMap != null) {
                            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadata3));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((StreamConfigurationMapCompat) highSpeedResolver.streamConfigurationMapCompat$delegate.getValue()).impl.mClientFragmentManager;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (list = ArraysKt___ArraysKt.toList(highSpeedVideoSizes)) == null) ? EmptyList.INSTANCE : list;
                }
            }
        });
        final int i2 = 1;
        this.maxSize$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda0
            public final /* synthetic */ HighSpeedResolver f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i2;
                HighSpeedResolver highSpeedResolver = this.f$0;
                switch (i22) {
                    case 0:
                        CameraMetadata cameraMetadata2 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata2).get(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    if (iArr[i3] == 9) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list2 = (List) highSpeedResolver.supportedSizes$delegate.getValue();
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        if (list2 == null) {
                            return null;
                        }
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int area = SizeUtil.getArea((Size) next);
                            do {
                                Object next2 = it.next();
                                int area2 = SizeUtil.getArea((Size) next2);
                                if (area < area2) {
                                    next = next2;
                                    area = area2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        CameraMetadata cameraMetadata3 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata3).get(key2);
                        if (streamConfigurationMap != null) {
                            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadata3));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((StreamConfigurationMapCompat) highSpeedResolver.streamConfigurationMapCompat$delegate.getValue()).impl.mClientFragmentManager;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (list = ArraysKt___ArraysKt.toList(highSpeedVideoSizes)) == null) ? EmptyList.INSTANCE : list;
                }
            }
        });
        final int i3 = 2;
        this.streamConfigurationMapCompat$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda0
            public final /* synthetic */ HighSpeedResolver f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i3;
                HighSpeedResolver highSpeedResolver = this.f$0;
                switch (i22) {
                    case 0:
                        CameraMetadata cameraMetadata2 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata2).get(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length) {
                                    if (iArr[i32] == 9) {
                                        z = true;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list2 = (List) highSpeedResolver.supportedSizes$delegate.getValue();
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        if (list2 == null) {
                            return null;
                        }
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int area = SizeUtil.getArea((Size) next);
                            do {
                                Object next2 = it.next();
                                int area2 = SizeUtil.getArea((Size) next2);
                                if (area < area2) {
                                    next = next2;
                                    area = area2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        CameraMetadata cameraMetadata3 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata3).get(key2);
                        if (streamConfigurationMap != null) {
                            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadata3));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((StreamConfigurationMapCompat) highSpeedResolver.streamConfigurationMapCompat$delegate.getValue()).impl.mClientFragmentManager;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (list = ArraysKt___ArraysKt.toList(highSpeedVideoSizes)) == null) ? EmptyList.INSTANCE : list;
                }
            }
        });
        final int i4 = 3;
        this.supportedSizes$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda0
            public final /* synthetic */ HighSpeedResolver f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i4;
                HighSpeedResolver highSpeedResolver = this.f$0;
                switch (i22) {
                    case 0:
                        CameraMetadata cameraMetadata2 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata2).get(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length) {
                                    if (iArr[i32] == 9) {
                                        z = true;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list2 = (List) highSpeedResolver.supportedSizes$delegate.getValue();
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        if (list2 == null) {
                            return null;
                        }
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int area = SizeUtil.getArea((Size) next);
                            do {
                                Object next2 = it.next();
                                int area2 = SizeUtil.getArea((Size) next2);
                                if (area < area2) {
                                    next = next2;
                                    area = area2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        CameraMetadata cameraMetadata3 = highSpeedResolver.cameraMetadata;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata3).get(key2);
                        if (streamConfigurationMap != null) {
                            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadata3));
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((StreamConfigurationMapCompat) highSpeedResolver.streamConfigurationMapCompat$delegate.getValue()).impl.mClientFragmentManager;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (list = ArraysKt___ArraysKt.toList(highSpeedVideoSizes)) == null) ? EmptyList.INSTANCE : list;
                }
            }
        });
    }

    public static List findCommonElements(List list) {
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.first(list));
        Iterator it = CollectionsKt.drop(list, 1).iterator();
        while (it.hasNext()) {
            mutableList.retainAll((List) it.next());
        }
        return mutableList;
    }

    public final Range[] getFrameRateRangesFor(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && CollectionsKt.toList(CollectionsKt.toMutableSet(list)).size() == 1) {
            List highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((Size) list.get(0));
            if (highSpeedVideoFpsRangesFor.isEmpty()) {
                highSpeedVideoFpsRangesFor = null;
            }
            if (highSpeedVideoFpsRangesFor != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : highSpeedVideoFpsRangesFor) {
                        Range range = (Range) obj;
                        if (Intrinsics.areEqual(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    highSpeedVideoFpsRangesFor = arrayList;
                }
                return (Range[]) highSpeedVideoFpsRangesFor.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List getHighSpeedVideoFpsRangesFor(Size size) {
        Object failure;
        List list;
        try {
            Result.Companion companion = Result.Companion;
            StreamConfigurationMapCompat streamConfigurationMapCompat = (StreamConfigurationMapCompat) this.streamConfigurationMapCompat$delegate.getValue();
            streamConfigurationMapCompat.getClass();
            size.getClass();
            BiometricPrompt biometricPrompt = streamConfigurationMapCompat.impl;
            biometricPrompt.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) biometricPrompt.mClientFragmentManager;
            failure = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Range<Integer>[] rangeArr = (Range[]) (failure instanceof Result.Failure ? null : failure);
        return (rangeArr == null || (list = CollectionsKt.toList(ArraysKt___ArraysKt.filterNotNull(rangeArr))) == null) ? EmptyList.INSTANCE : list;
    }
}
