package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class nii {
    public final void a(final int i, final int i2, final int i3, final float f, final yci yciVar, final o0k o0kVar, final float f2, final wn5 wn5Var, hq5 hq5Var, final int i4) {
        int i5;
        oq5 oq5Var;
        yciVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-86616485);
        if ((i4 & 6) == 0) {
            i5 = (oq5Var2.d(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= oq5Var2.d(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= oq5Var2.d(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= oq5Var2.c(f) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= oq5Var2.g(false) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i4) == 0) {
            i5 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i4) == 0) {
            i5 |= oq5Var2.f(o0kVar) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= oq5Var2.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i4) == 0) {
            i5 |= oq5Var2.h(wn5Var) ? 67108864 : 33554432;
        }
        if (oq5Var2.P(i5 & 1, (38347923 & i5) != 38347922)) {
            int i6 = i5 << 9;
            oq5Var = oq5Var2;
            d3e.a(i, o0kVar, yciVar, f2, i2, i3, f, false, null, wn5Var, oq5Var, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 9) & 896) | ((i5 >> 12) & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (i6 & 29360128) | ((i5 << 3) & 1879048192), 256);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: mii
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nii.this.a(i, i2, i3, f, yciVar, o0kVar, f2, wn5Var, (hq5) obj, rvf.R(i4 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public final void b(ArrayList arrayList, o3e o3eVar, yci yciVar, pyc pycVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        o3eVar.getClass();
        yciVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1109951997);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(o3eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(pycVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            zsd.u(arrayList, o3eVar, yciVar, pycVar, o0kVar, null, oq5Var, i2 & 65534, 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bz7(this, arrayList, o3eVar, yciVar, pycVar, o0kVar, i, 1);
        }
    }

    public final void c(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yci yciVar2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1758265927);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            yciVar2 = yciVar;
            z2 = z;
            zsd.v(3, i2 & 1022, 0, oq5Var, yciVar2, z2);
        } else {
            yciVar2 = yciVar;
            z2 = z;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cz7(this, z2, yciVar2, i, 1);
        }
    }
}
