package com.google.common.base;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import android.widget.RemoteViews;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.Braze$Companion$$ExternalSyntheticLambda21;
import com.google.android.gms.stats.zza;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.crypto.tink.internal.PrefixMap;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.WriterException;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.MinimalEncoder$Edge;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.miteksystems.misnap.camera.a.b;
import com.miteksystems.misnap.camera.a.d;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class Splitter implements CameraSelectorFilter {
    public final /* synthetic */ int $r8$classId;
    public int limit;
    public boolean omitEmptyStrings;
    public final Object strategy;
    public final Object trimmer;

    /* renamed from: com.google.common.base.Splitter$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator {
        public final /* synthetic */ int $r8$classId;
        public int limit;
        public String next;
        public final boolean omitEmptyStrings;
        public final CharSequence toSplit;
        public final CharMatcher$FastMatcher trimmer;
        public final /* synthetic */ Object val$separatorMatcher;
        public int state = 2;
        public int offset = 0;

        public AnonymousClass1(Splitter splitter, CharSequence charSequence, Object obj, int i) {
            this.$r8$classId = i;
            this.val$separatorMatcher = obj;
            this.trimmer = (CharMatcher$FastMatcher) splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            r3 = r3 + 1;
         */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean hasNext() {
            int i;
            String str;
            CharSequence charSequence;
            int i2;
            CharMatcher$FastMatcher charMatcher$FastMatcher;
            Trace.checkState(this.state != 4);
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.state);
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.state = 4;
                int i3 = this.offset;
                while (true) {
                    i = this.offset;
                    if (i != -1) {
                        int i4 = this.$r8$classId;
                        Object obj = this.val$separatorMatcher;
                        charSequence = this.toSplit;
                        switch (i4) {
                            case 0:
                                CharMatcher$Is charMatcher$Is = (CharMatcher$Is) obj;
                                int length = charSequence.length();
                                Trace.checkPositionIndex(i, length);
                                while (i < length) {
                                    if (charMatcher$Is.matches(charSequence.charAt(i))) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                i = -1;
                                break;
                            default:
                                String str2 = (String) obj;
                                int length2 = str2.length();
                                int length3 = charSequence.length() - length2;
                                while (i <= length3) {
                                    for (int i5 = 0; i5 < length2; i5++) {
                                        if (charSequence.charAt(i5 + i) != str2.charAt(i5)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                i = -1;
                                break;
                        }
                        if (i == -1) {
                            i = charSequence.length();
                            this.offset = -1;
                        } else {
                            switch (i4) {
                                case 0:
                                    i2 = i + 1;
                                    break;
                                default:
                                    i2 = ((String) obj).length() + i;
                                    break;
                            }
                            this.offset = i2;
                        }
                        int i6 = this.offset;
                        if (i6 == i3) {
                            int i7 = i6 + 1;
                            this.offset = i7;
                            if (i7 > charSequence.length()) {
                                this.offset = -1;
                            }
                        } else {
                            while (true) {
                                charMatcher$FastMatcher = this.trimmer;
                                if (i3 < i && charMatcher$FastMatcher.matches(charSequence.charAt(i3))) {
                                    i3++;
                                }
                            }
                            while (i > i3 && charMatcher$FastMatcher.matches(charSequence.charAt(i - 1))) {
                                i--;
                            }
                            if (this.omitEmptyStrings && i3 == i) {
                                i3 = this.offset;
                            }
                        }
                    } else {
                        this.state = 3;
                        str = null;
                    }
                }
                int i8 = this.limit;
                if (i8 == 1) {
                    i = charSequence.length();
                    this.offset = -1;
                    while (i > i3 && charMatcher$FastMatcher.matches(charSequence.charAt(i - 1))) {
                        i--;
                    }
                } else {
                    this.limit = i8 - 1;
                }
                str = charSequence.subSequence(i3, i).toString();
                this.next = str;
                if (this.state != 3) {
                    this.state = 1;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.state = 2;
            String str = this.next;
            this.next = null;
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface Strategy {
        Iterator iterator(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.$r8$classId = 1;
        this.trimmer = jArr;
        this.strategy = remoteViewsArr;
        this.omitEmptyStrings = false;
        this.limit = 1;
        if (jArr.length != remoteViewsArr.length) {
            a$$ExternalSyntheticBUOutline0.m$3("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList)).size();
        if (size <= 1) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
        throw null;
    }

    public static void addEdge(MinimalEncoder$Edge[][][] minimalEncoder$EdgeArr, int i, MinimalEncoder$Edge minimalEncoder$Edge) {
        MinimalEncoder$Edge[] minimalEncoder$EdgeArr2 = minimalEncoder$EdgeArr[i + minimalEncoder$Edge.characterLength][minimalEncoder$Edge.charsetEncoderIndex];
        Mode mode = minimalEncoder$Edge.mode;
        int ordinal = mode.ordinal();
        char c = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c = 1;
            } else if (ordinal == 4) {
                c = 3;
            } else {
                if (ordinal != 6) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(mode, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        MinimalEncoder$Edge minimalEncoder$Edge2 = minimalEncoder$EdgeArr2[c];
        if (minimalEncoder$Edge2 == null || minimalEncoder$Edge2.cachedTotalSize > minimalEncoder$Edge.cachedTotalSize) {
            minimalEncoder$EdgeArr2[c] = minimalEncoder$Edge;
        }
    }

    public static boolean canEncode(Mode mode, char c) {
        int ordinal = mode.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c < '`' ? Encoder.ALPHANUMERIC_TABLE[c] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return Encoder.isOnlyDoubleByteKanji(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static Version getVersion(int i) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        return ordinal != 0 ? ordinal != 1 ? Version.getVersionForNumber(40) : Version.getVersionForNumber(26) : Version.getVersionForNumber(9);
    }

    public static Splitter on(String str) {
        int i = 1;
        Trace.checkArgument("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? on(str.charAt(0)) : new Splitter(new Braze$Companion$$ExternalSyntheticLambda21(str, i));
    }

    public void addEdges(Version version, MinimalEncoder$Edge[][][] minimalEncoder$EdgeArr, int i, MinimalEncoder$Edge minimalEncoder$Edge) {
        int i2;
        String str = (String) this.trimmer;
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) this.strategy;
        int length = eCIEncoderSet.encoders.length;
        int i3 = eCIEncoderSet.priorityEncoderIndex;
        if (i3 < 0 || !eCIEncoderSet.canEncode(str.charAt(i), i3)) {
            i3 = 0;
        } else {
            length = i3 + 1;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            if (eCIEncoderSet.canEncode(str.charAt(i), i5)) {
                addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, Mode.BYTE, i, i5, 1, minimalEncoder$Edge, version));
            }
        }
        char charAt = str.charAt(i);
        Mode mode = Mode.KANJI;
        if (canEncode(mode, charAt)) {
            addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, mode, i, 0, 1, minimalEncoder$Edge, version));
        }
        int length2 = str.length();
        char charAt2 = str.charAt(i);
        Mode mode2 = Mode.ALPHANUMERIC;
        int i6 = 2;
        if (canEncode(mode2, charAt2)) {
            int i7 = i + 1;
            addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, mode2, i, 0, (i7 >= length2 || !canEncode(mode2, str.charAt(i7))) ? 1 : 2, minimalEncoder$Edge, version));
        }
        char charAt3 = str.charAt(i);
        Mode mode3 = Mode.NUMERIC;
        if (canEncode(mode3, charAt3)) {
            int i8 = i + 1;
            if (i8 >= length2 || !canEncode(mode3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && canEncode(mode3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, mode3, i, 0, i2, minimalEncoder$Edge, version));
        }
    }

    public void continueSettlingToState(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.trimmer;
        Object obj2 = this.strategy;
        switch (i2) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.viewRef;
                if (weakReference != null && weakReference.get() != null) {
                    this.limit = i;
                    if (!this.omitEmptyStrings) {
                        ((View) bottomSheetBehavior.viewRef.get()).postOnAnimation((zza) obj);
                        this.omitEmptyStrings = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.viewRef;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.limit = i;
                    if (!this.omitEmptyStrings) {
                        ((View) sideSheetBehavior.viewRef.get()).postOnAnimation((KnotView$$ExternalSyntheticLambda1) obj);
                        this.omitEmptyStrings = true;
                        break;
                    }
                }
                break;
        }
    }

    public n encodeSpecificVersion(Version version) {
        int i;
        String str = (String) this.trimmer;
        int length = str.length();
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) this.strategy;
        CharsetEncoder[] charsetEncoderArr = eCIEncoderSet.encoders;
        CharsetEncoder[] charsetEncoderArr2 = eCIEncoderSet.encoders;
        MinimalEncoder$Edge[][][] minimalEncoder$EdgeArr = (MinimalEncoder$Edge[][][]) Array.newInstance((Class<?>) MinimalEncoder$Edge.class, length + 1, charsetEncoderArr.length, 4);
        addEdges(version, minimalEncoder$EdgeArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr2.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    MinimalEncoder$Edge minimalEncoder$Edge = minimalEncoder$EdgeArr[i2][i3][i4];
                    if (minimalEncoder$Edge != null && i2 < length) {
                        addEdges(version, minimalEncoder$EdgeArr, i2, minimalEncoder$Edge);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr2.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                MinimalEncoder$Edge minimalEncoder$Edge2 = minimalEncoder$EdgeArr[length][i8][i9];
                if (minimalEncoder$Edge2 != null && (i = minimalEncoder$Edge2.cachedTotalSize) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new n(this, version, minimalEncoder$EdgeArr[length][i5][i7]);
        }
        throw new WriterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Internal error: failed to encode \"", str, "\""));
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public ArrayList filterCameras(ArrayList arrayList) {
        boolean z = this.omitEmptyStrings;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (isCameraSufficient$camera_release((Camera2CameraInfo) next, true, true, z)) {
                arrayList2.add(next);
            }
        }
        if (z && arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (isCameraSufficient$camera_release((Camera2CameraInfo) next2, true, true, false)) {
                    arrayList2.add(next2);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (isCameraSufficient$camera_release((Camera2CameraInfo) next3, false, false, false)) {
                arrayList3.add(next3);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public MiSnapCameraInfo getCameraInfo(Camera2CameraInfo camera2CameraInfo) {
        List list;
        List list2;
        Object obj;
        boolean z;
        Size size;
        Size size2;
        boolean z2;
        Size[] outputSizes;
        Rational rational = (Rational) this.strategy;
        List list3 = (List) this.trimmer;
        camera2CameraInfo.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) == null || (list = ArraysKt___ArraysKt.toList(outputSizes)) == null) {
            list = EmptyList.INSTANCE;
        }
        List a = b.a(camera2CameraInfo, 35);
        List a2 = b.a(camera2CameraInfo, 256);
        List d = b.d(camera2CameraInfo);
        Boolean bool = (Boolean) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        Integer num = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            num = r4;
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int intValue2 = (num2 != null ? num2 : Integer.MAX_VALUE).intValue();
        d dVar = (d.values().length - 1 <= intValue2 || intValue2 < 0) ? d.h : d.values()[intValue2];
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null || (list2 = ArraysKt___ArraysKt.toList(iArr)) == null) {
            list2 = EmptyList.INSTANCE;
        }
        list.getClass();
        a.getClass();
        a2.getClass();
        d.getClass();
        dVar.getClass();
        list2.getClass();
        if (intValue != this.limit) {
            return null;
        }
        b.a aVar = new b.a(d, 0);
        if (aVar.a(1) || aVar.a(3) || aVar.a(2)) {
            obj = null;
            z = true;
        } else {
            obj = null;
            z = false;
        }
        boolean a3 = b.a(dVar, list2);
        MiSnapCameraInfo miSnapCameraInfo = obj;
        boolean contains = CollectionsKt__CollectionsKt.listOf((Object[]) new d[]{d.e, d.c, d.d, d.f}).contains(dVar);
        Size a4 = b.a(list, list3);
        Size a5 = b.a(a, list3);
        Size a6 = b.a(a2, list3);
        if (a4 == null || a5 == null) {
            if (a4 == null) {
                a4 = b.a(list, new Size(1920, 1080), rational);
            }
            if (a5 == null) {
                a5 = b.a(a, (Size) CollectionsKt.first(list3), rational);
            }
            size = a4;
            size2 = a5;
            z2 = false;
        } else {
            size = a4;
            z2 = true;
            size2 = a5;
        }
        Size maxHighResolutionImageSize$camera_release = a3 ? getMaxHighResolutionImageSize$camera_release(a) : miSnapCameraInfo;
        Size maxHighResolutionImageSize$camera_release2 = contains ? getMaxHighResolutionImageSize$camera_release(a2) : miSnapCameraInfo;
        if (size == null || size2 == null || a6 == null) {
            return miSnapCameraInfo;
        }
        return new MiSnapCameraInfo(z && z2, z, booleanValue, size, size2, a6, dVar.toString(), b.a(intValue), maxHighResolutionImageSize$camera_release, maxHighResolutionImageSize$camera_release2);
    }

    public /* synthetic */ Size getMaxHighResolutionImageSize$camera_release(List list) {
        Size a = b.a(list, new Size(2688, 1512), (Rational) this.strategy);
        if (a == null || b.a(a) <= b.a(new Size(1920, 1080))) {
            return null;
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        if (getMaxHighResolutionImageSize$camera_release(r6) != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0167, code lost:
    
        if (getMaxHighResolutionImageSize$camera_release(r7) != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015a, code lost:
    
        if (com.miteksystems.misnap.camera.a.b.a(r6, (android.util.Size) kotlin.collections.CollectionsKt.first(r3), r2) != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0119, code lost:
    
        if (com.miteksystems.misnap.camera.a.b.a(r5, new android.util.Size(1920, 1080), r2) != null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isCameraSufficient$camera_release(Camera2CameraInfo camera2CameraInfo, boolean z, boolean z2, boolean z3) {
        List list;
        List list2;
        boolean z4;
        boolean z5;
        boolean z6;
        Size[] outputSizes;
        Rational rational = (Rational) this.strategy;
        List<Size> list3 = (List) this.trimmer;
        camera2CameraInfo.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) == null || (list = ArraysKt___ArraysKt.toList(outputSizes)) == null) {
            list = EmptyList.INSTANCE;
        }
        List a = b.a(camera2CameraInfo, 35);
        List a2 = b.a(camera2CameraInfo, 256);
        List d = b.d(camera2CameraInfo);
        Integer num = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            num = r4;
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int intValue2 = (num2 != null ? num2 : Integer.MAX_VALUE).intValue();
        d dVar = (d.values().length - 1 <= intValue2 || intValue2 < 0) ? d.h : d.values()[intValue2];
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null || (list2 = ArraysKt___ArraysKt.toList(iArr)) == null) {
            list2 = EmptyList.INSTANCE;
        }
        list.getClass();
        a.getClass();
        a2.getClass();
        d.getClass();
        dVar.getClass();
        list2.getClass();
        b.a aVar = new b.a(d, 0);
        boolean z7 = intValue == this.limit;
        boolean z8 = !z || (aVar.a(1) || aVar.a(3) || aVar.a(2));
        boolean a3 = b.a(dVar, list2);
        boolean contains = CollectionsKt__CollectionsKt.listOf((Object[]) new d[]{d.e, d.c, d.d, d.f}).contains(dVar);
        if (z2) {
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Size size : list3) {
                    size.getClass();
                    if (list.contains(size)) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
        }
        if (z3) {
            if (a3) {
            }
            z5 = false;
        } else if (z2) {
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Size size2 : list3) {
                    size2.getClass();
                    if (a.contains(size2)) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
        }
        if (z3) {
            if (contains) {
            }
            z6 = false;
        } else {
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Size size3 : list3) {
                    size3.getClass();
                    if (a2.contains(size3)) {
                        z6 = true;
                        break;
                    }
                }
            }
            z6 = false;
        }
        return z7 && z8 && z4 && z6 && z5;
    }

    public Splitter omitEmptyStrings() {
        return new Splitter((Strategy) this.strategy, true, (CharMatcher$FastMatcher) this.trimmer, this.limit);
    }

    public AnonymousClass5 split(String str) {
        return new AnonymousClass5(this, str);
    }

    public List splitToList(CharSequence charSequence) {
        charSequence.getClass();
        Iterator it = ((Strategy) this.strategy).iterator(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) it;
            if (!anonymousClass1.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) anonymousClass1.next());
        }
    }

    /* renamed from: com.google.common.base.Splitter$5, reason: invalid class name */
    public final class AnonymousClass5 implements Iterable {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ Object this$0;
        public final /* synthetic */ Object val$sequence;

        public AnonymousClass5(List list, List list2) {
            this.val$sequence = list;
            this.this$0 = list2;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$sequence;
            switch (i) {
                case 0:
                    Splitter splitter = (Splitter) obj;
                    return ((Strategy) splitter.strategy).iterator(splitter, (String) obj2);
                default:
                    return new PrefixMap.ConcatenatedIterator(((List) obj2).iterator(), ((List) obj).iterator());
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    StringBuilder sb = new StringBuilder();
                    sb.append('[');
                    Iterator it = iterator();
                    try {
                        if (it.hasNext()) {
                            sb.append(Joiner.toString(it.next()));
                            while (it.hasNext()) {
                                sb.append((CharSequence) ", ");
                                sb.append(Joiner.toString(it.next()));
                            }
                        }
                        sb.append(']');
                        return sb.toString();
                    } catch (IOException e) {
                        a$$ExternalSyntheticBUOutline0.m$1(e);
                        return null;
                    }
                default:
                    return super.toString();
            }
        }

        public AnonymousClass5(Splitter splitter, String str) {
            this.val$sequence = str;
            this.this$0 = splitter;
        }
    }

    public static Splitter on(char c) {
        return new Splitter(new MaterialButton$$ExternalSyntheticLambda3(new CharMatcher$Is(c), 5));
    }

    public Splitter(String str, Charset charset, boolean z, int i) {
        this.$r8$classId = 4;
        this.trimmer = str;
        this.omitEmptyStrings = z;
        this.strategy = new ECIEncoderSet(str, charset, -1);
        this.limit = i;
    }

    public Splitter(MiSnapSettings.Camera camera) {
        this.$r8$classId = 5;
        camera.getClass();
        Boolean bool = camera.c;
        this.omitEmptyStrings = bool != null ? bool.booleanValue() : false;
        this.trimmer = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(1920, 1080), new Size(1280, 720)});
        this.strategy = new Rational(16, 9);
        this.limit = 1;
    }

    public Splitter(Strategy strategy, boolean z, CharMatcher$FastMatcher charMatcher$FastMatcher, int i) {
        this.$r8$classId = 0;
        this.strategy = strategy;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher$FastMatcher;
        this.limit = i;
    }

    public Splitter(Parcel parcel) {
        this.$r8$classId = 1;
        parcel.getClass();
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.trimmer = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                Path$$ExternalSyntheticBUOutline0.m("null element found in ", 46, remoteViewsArr);
                throw null;
            }
        }
        this.strategy = remoteViewsArr;
        this.omitEmptyStrings = parcel.readInt() == 1;
        this.limit = parcel.readInt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Splitter(Strategy strategy) {
        this(strategy, false, (CharMatcher$FastMatcher) CharMatcher$None.INSTANCE, Integer.MAX_VALUE);
        this.$r8$classId = 0;
    }

    public Splitter(SideSheetBehavior sideSheetBehavior) {
        this.$r8$classId = 3;
        this.strategy = sideSheetBehavior;
        this.trimmer = new KnotView$$ExternalSyntheticLambda1(this, 6);
    }

    public Splitter(BottomSheetBehavior bottomSheetBehavior) {
        this.$r8$classId = 2;
        this.strategy = bottomSheetBehavior;
        this.trimmer = new zza(this, 9);
    }
}
