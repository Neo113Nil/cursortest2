package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.FlashMode;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* loaded from: classes3.dex */
public final class GraphState3A {
    public final AtomicRef _state = AtomicFU.atomic(new State3A(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6 A[LOOP:0: B:33:0x0057->B:73:0x00f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c5  */
    /* renamed from: update-7jOEVJU$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m87update7jOEVJU$default(GraphState3A graphState3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        FlashMode flashMode2;
        List list4;
        List list5;
        List list6;
        List list7;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        AeMode aeMode2 = (i & 1) != 0 ? null : aeMode;
        AfMode afMode2 = (i & 2) != 0 ? null : afMode;
        AwbMode awbMode2 = (i & 4) != 0 ? null : awbMode;
        FlashMode flashMode3 = (i & 8) != 0 ? null : flashMode;
        List list8 = (i & 16) != 0 ? null : list;
        List list9 = (i & 32) != 0 ? null : list2;
        List list10 = (i & 64) != 0 ? null : list3;
        Boolean bool7 = (i & 128) != 0 ? null : bool;
        Boolean bool8 = (i & 256) != 0 ? null : bool2;
        Boolean bool9 = (i & 512) != 0 ? null : bool3;
        AtomicRef atomicRef = graphState3A._state;
        while (true) {
            Object obj = atomicRef.value;
            State3A state3A = (State3A) obj;
            AeMode aeMode3 = aeMode2 == null ? state3A.aeMode : aeMode2;
            AfMode afMode3 = afMode2 == null ? state3A.afMode : afMode2;
            AwbMode awbMode3 = awbMode2 == null ? state3A.awbMode : awbMode2;
            Boolean bool10 = bool9;
            FlashMode flashMode4 = flashMode3 == null ? state3A.flashMode : flashMode3;
            if (list8 != null) {
                List list11 = list8;
                if (list11.isEmpty()) {
                    list11 = null;
                }
                list4 = list11;
                if (list4 != null) {
                    flashMode2 = flashMode4;
                    if (list9 != null) {
                        List list12 = list9;
                        if (list12.isEmpty()) {
                            list12 = null;
                        }
                        list5 = list12;
                    }
                    list5 = state3A.afRegions;
                    if (list10 != null) {
                        List list13 = list10;
                        if (list13.isEmpty()) {
                            list13 = null;
                        }
                        list7 = list13;
                        if (list7 != null) {
                            list6 = list5;
                            bool4 = bool7 == null ? state3A.aeLock : bool7;
                            bool5 = bool8 == null ? state3A.afLock : bool8;
                            bool6 = bool10 == null ? state3A.awbLock : bool10;
                            state3A.getClass();
                            if (atomicRef.compareAndSet(obj, new State3A(aeMode3, afMode3, awbMode3, flashMode2, list4, list6, list7, bool4, bool5, bool6))) {
                                return;
                            } else {
                                bool9 = bool10;
                            }
                        }
                    }
                    list6 = list5;
                    list7 = state3A.awbRegions;
                    bool4 = bool7 == null ? state3A.aeLock : bool7;
                    bool5 = bool8 == null ? state3A.afLock : bool8;
                    if (bool10 == null) {
                    }
                    state3A.getClass();
                    if (atomicRef.compareAndSet(obj, new State3A(aeMode3, afMode3, awbMode3, flashMode2, list4, list6, list7, bool4, bool5, bool6))) {
                    }
                }
            }
            flashMode2 = flashMode4;
            list4 = state3A.aeRegions;
            if (list9 != null) {
            }
            list5 = state3A.afRegions;
            if (list10 != null) {
            }
            list6 = list5;
            list7 = state3A.awbRegions;
            bool4 = bool7 == null ? state3A.aeLock : bool7;
            bool5 = bool8 == null ? state3A.afLock : bool8;
            if (bool10 == null) {
            }
            state3A.getClass();
            if (atomicRef.compareAndSet(obj, new State3A(aeMode3, afMode3, awbMode3, flashMode2, list4, list6, list7, bool4, bool5, bool6))) {
            }
        }
    }

    public final LinkedHashMap toCaptureRequestParametersMap() {
        State3A state3A = (State3A) this._state.value;
        state3A.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AeMode aeMode = state3A.aeMode;
        if (aeMode != null) {
            int i = aeMode.value;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i));
        }
        AfMode afMode = state3A.afMode;
        if (afMode != null) {
            int i2 = afMode.value;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(i2));
        }
        AwbMode awbMode = state3A.awbMode;
        if (awbMode != null) {
            int i3 = awbMode.value;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(i3));
        }
        FlashMode flashMode = state3A.flashMode;
        if (flashMode != null) {
            int i4 = flashMode.value;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(i4));
        }
        List list = state3A.aeRegions;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = state3A.afRegions;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = state3A.awbRegions;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = state3A.aeLock;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = state3A.awbLock;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
