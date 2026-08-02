package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraState;
import androidx.camera.core.a;
import androidx.camera.core.impl.Timebase;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class rm7 implements ar7 {
    public final String a;
    public final ep7 b;
    public final pm7 c;
    public b e;
    public final hmi0 h;
    public final a73 j;
    public final rn7 k;
    public final kr7 l;
    public final Object d = new Object();
    public hmi0 f = null;
    public hmi0 g = null;
    public ArrayList i = null;

    public rm7(kr7 kr7Var, String str) {
        str.getClass();
        this.a = str;
        this.l = kr7Var;
        ep7 a = kr7Var.a(str);
        this.b = a;
        pm7 pm7Var = new pm7();
        pm7Var.a = this;
        this.c = pm7Var;
        a73 b = ydb1.b(a);
        this.j = b;
        this.k = new rn7(str, b);
        this.h = new hmi0(new a(CameraState.Type.CLOSED, null));
    }

    @Override // defpackage.ar7
    public final Object A(String str) {
        Set<String> set;
        try {
            sr4 sr4Var = this.b.b;
            sr4Var.getClass();
            try {
                set = ((CameraCharacteristics) sr4Var.b).getPhysicalCameraIds();
            } catch (Exception e) {
                sgb1.e("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e);
                set = Collections.EMPTY_SET;
            }
            if (set.contains(str)) {
                return (CameraCharacteristics) this.l.a(str).b.b;
            }
            return null;
        } catch (CameraAccessExceptionCompat e2) {
            sgb1.e("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e2);
            return null;
        }
    }

    public final void C(b bVar) {
        synchronized (this.d) {
            try {
                this.e = bVar;
                hmi0 hmi0Var = this.g;
                if (hmi0Var != null) {
                    hmi0Var.o((dy40) bVar.i.x);
                }
                hmi0 hmi0Var2 = this.f;
                if (hmi0Var2 != null) {
                    hmi0Var2.o(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        b bVar2 = this.e;
                        bVar2.c.execute(new d1(9, bVar2, (Executor) pair.second, (uo7) pair.first));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        sgb1.f("Camera2CameraInfo", "Device Level: ".concat(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? oyr.i(intValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"));
    }

    @Override // defpackage.ar7
    public final v a() {
        return this.h;
    }

    @Override // defpackage.ar7
    public final Set b() {
        return ((u8n) gym.l(this.b).a).b();
    }

    @Override // defpackage.ar7
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ar7
    public final int d() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        d6z.m("Unable to get the lens facing of the camera.", num != null);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        sgb1.g(5, "LensFacingUtil");
        return -1;
    }

    @Override // defpackage.ar7
    public final void e(Executor executor, uo7 uo7Var) {
        synchronized (this.d) {
            try {
                b bVar = this.e;
                if (bVar != null) {
                    bVar.c.execute(new d1(9, bVar, executor, uo7Var));
                    return;
                }
                if (this.i == null) {
                    this.i = new ArrayList();
                }
                this.i.add(new Pair(uo7Var, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ar7
    public final void f(uo7 uo7Var) {
        synchronized (this.d) {
            try {
                b bVar = this.e;
                if (bVar != null) {
                    bVar.c.execute(new mh3(28, bVar, uo7Var));
                    return;
                }
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == uo7Var) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ar7
    public final List g(Range range) {
        Size[] sizeArr;
        try {
            sizeArr = ((StreamConfigurationMap) ((wor0) this.b.c().a).a).getHighSpeedVideoSizesFor(range);
        } catch (IllegalArgumentException unused) {
            Objects.toString(range);
            sgb1.g(5, "Camera2CameraInfo");
            sizeArr = null;
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.ar7
    public final boolean h() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ar7
    public final int i(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return xdb1.c(xdb1.g(i), num.intValue(), 1 == d());
    }

    @Override // defpackage.ar7
    public final izn j() {
        return this.k;
    }

    @Override // defpackage.ar7
    public final v k() {
        synchronized (this.d) {
            try {
                b bVar = this.e;
                hmi0 hmi0Var = this.g;
                if (bVar != null) {
                    if (hmi0Var != null) {
                        return hmi0Var;
                    }
                    return (dy40) bVar.i.x;
                }
                if (hmi0Var == null) {
                    ye61 d = no6.d(this.b);
                    lf61 lf61Var = new lf61(d.getMaxZoom(), d.getMinZoom());
                    lf61Var.f(1.0f);
                    this.g = new hmi0(uiv.e(lf61Var));
                }
                return this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ar7
    public final Set l() {
        int[] iArr;
        wor0 wor0Var = (wor0) this.b.c().a;
        wor0Var.getClass();
        try {
            iArr = ((StreamConfigurationMap) wor0Var.a).getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException unused) {
            sgb1.g(5, "StreamConfigurationMapCompatBaseImpl");
            iArr = null;
        }
        int[] iArr2 = iArr != null ? (int[]) iArr.clone() : null;
        if (iArr2 == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr2) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    @Override // defpackage.ar7
    public final int m() {
        return i(0);
    }

    @Override // defpackage.ar7
    public final Rect n() {
        Rect rect = (Rect) this.b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.ar7
    public final Object o() {
        return (CameraCharacteristics) this.b.b.b;
    }

    @Override // defpackage.ar7
    public final boolean p() {
        ep7 ep7Var = this.b;
        Objects.requireNonNull(ep7Var);
        return dpa1.d(new qm7(ep7Var, 0));
    }

    @Override // defpackage.ar7
    public final a73 q() {
        return this.j;
    }

    @Override // defpackage.ar7
    public final List r(int i) {
        Size[] I = this.b.c().I(i);
        return I != null ? Arrays.asList(I) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.ar7
    public final Set s() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        }
        return hashSet;
    }

    @Override // defpackage.ar7
    public final boolean t() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ar7
    public final v u() {
        synchronized (this.d) {
            try {
                b bVar = this.e;
                hmi0 hmi0Var = this.f;
                if (bVar == null) {
                    if (hmi0Var == null) {
                        this.f = new hmi0(0);
                    }
                    return this.f;
                }
                if (hmi0Var != null) {
                    return hmi0Var;
                }
                return bVar.j.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ar7
    public final gvo v() {
        synchronized (this.d) {
            try {
                b bVar = this.e;
                if (bVar == null) {
                    return new hvo(this.b);
                }
                return (hvo) bVar.l.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ar7
    public final Timebase w() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? Timebase.UPTIME : Timebase.REALTIME;
    }

    @Override // defpackage.ar7
    public final String y() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.ar7
    public final List z() {
        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((wor0) this.b.c().a).a).getHighSpeedVideoSizes();
        return highSpeedVideoSizes != null ? Arrays.asList(highSpeedVideoSizes) : Collections.EMPTY_LIST;
    }
}
