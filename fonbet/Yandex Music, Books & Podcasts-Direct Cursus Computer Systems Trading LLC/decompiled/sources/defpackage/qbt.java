package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class qbt implements nbt {
    public static final String b;
    public static final String c;
    public final nbt a = ovn.j;

    static {
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS_NO_CROP;
        b = new jcv("https://avatars.mds.yandex.net/get-music-misc/2419084/img.67c1b65883cfcb15f0182859/%%", webPath$Storage).getPathForSize(wct.t());
        c = new jcv("https://avatars.mds.yandex.net/get-music-misc/70683/img.67c1ba6f2898722c0144c15b/%%", webPath$Storage).getPathForSize(wct.t());
    }

    @Override // defpackage.nbt
    public final int a() {
        return this.a.a();
    }

    public final void b(int i, hq5 hq5Var, yci yciVar, String str) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(430974227);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            pd.b(new qzm[0], false, ild.C(-1297341750, new cb1(yciVar, str), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(this, yciVar, str, i, 18);
        }
    }

    @Override // defpackage.nbt
    public final void c(yci yciVar, zbt zbtVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1919339496);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(this) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 8195) != 8194)) {
            b(((i2 >> 6) & 896) | (i2 & 14) | 48, oq5Var, yciVar, b);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(this, yciVar, zbtVar, z, i);
        }
    }

    @Override // defpackage.nbt
    public final int d(boolean z) {
        return this.a.d(z);
    }

    @Override // defpackage.nbt
    public final void e(boolean z, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1757735578);
        if ((i & 48) == 0) {
            i2 = (oq5Var.f(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 17) != 16)) {
            b(((i2 << 3) & 896) | 54, oq5Var, vci.a, b);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o48(this, z, i, 3);
        }
    }

    @Override // defpackage.nbt
    public final void f(yci yciVar, hq5 hq5Var, int i) {
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(714666117);
        int i2 = (oq5Var.f(this) ? 32 : 16) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            b(((i2 << 3) & 896) | 54, oq5Var, yciVar, c);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pbt(this, yciVar, i, 1);
        }
    }

    @Override // defpackage.nbt
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.nbt
    public final void h(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-842905818);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (oq5Var.f(this) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 131) != 130)) {
            b((i3 & 896) | (i3 & 14) | 48, oq5Var, yciVar, b);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new obt(this, yciVar, z, i, 0);
        }
    }

    @Override // defpackage.nbt
    public final int j(boolean z) {
        return this.a.j(z);
    }

    @Override // defpackage.nbt
    public final int k() {
        return this.a.k();
    }

    @Override // defpackage.nbt
    public final void o(yci yciVar, hq5 hq5Var, int i) {
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1812852180);
        int i2 = (oq5Var.f(this) ? 32 : 16) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            b(((i2 << 3) & 896) | 54, oq5Var, yciVar, b);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pbt(this, yciVar, i, 0);
        }
    }

    @Override // defpackage.nbt
    public final int p() {
        return this.a.p();
    }

    @Override // defpackage.nbt
    public final int r() {
        return this.a.r();
    }

    @Override // defpackage.nbt
    public final void s(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-518461353);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(this) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 131) != 130)) {
            b((i2 & 896) | (i2 & 14) | 48, oq5Var, yciVar, b);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new obt(this, yciVar, z, i, 1);
        }
    }

    @Override // defpackage.nbt
    public final int v() {
        return this.a.v();
    }

    @Override // defpackage.nbt
    public final void w(yci yciVar, zbt zbtVar, boolean z, hq5 hq5Var, int i) {
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2108194662);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i | (oq5Var.f(this) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1027) != 1026)) {
            b(((i2 >> 3) & 896) | (i2 & 14) | 48, oq5Var, yciVar, b);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(this, yciVar, zbtVar, z, i, 27);
        }
    }

    @Override // defpackage.nbt
    public final int x() {
        return this.a.x();
    }
}
