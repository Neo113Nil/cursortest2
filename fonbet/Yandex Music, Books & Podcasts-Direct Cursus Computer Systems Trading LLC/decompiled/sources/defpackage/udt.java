package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class udt {
    public final ges a;
    public final ges b;
    public final ges c;
    public final ges d;
    public final ges e;
    public final ges f;
    public final ges g;
    public final ges h;
    public final ges i;
    public final ges j;
    public final ges k;
    public final ges l;
    public final ges m;

    public udt(ges gesVar, int i) {
        tqc tqcVar;
        ges gesVar2;
        ges gesVar3 = wdt.a;
        tqc tqcVar2 = tqc.l;
        ges b = ges.b(gesVar3, 0L, v7g.z(96), tqcVar2, null, v7g.y(-1.5d), 0, v7g.z(112), null, null, 0, 0, 16646009);
        ges b2 = ges.b(gesVar3, 0L, v7g.z(60), tqcVar2, null, v7g.y(-0.5d), 0, v7g.z(72), null, null, 0, 0, 16646009);
        tqc tqcVar3 = tqc.m;
        ges b3 = ges.b(gesVar3, 0L, v7g.z(48), tqcVar3, null, v7g.z(0), 0, v7g.z(56), null, null, 0, 0, 16646009);
        ges b4 = ges.b(gesVar3, 0L, v7g.z(34), tqcVar3, null, v7g.y(0.25d), 0, v7g.z(36), null, null, 0, 0, 16646009);
        ges b5 = ges.b(gesVar3, 0L, v7g.z(24), tqcVar3, null, v7g.z(0), 0, v7g.z(24), null, null, 0, 0, 16646009);
        tqc tqcVar4 = tqc.n;
        ges b6 = ges.b(gesVar3, 0L, v7g.z(20), tqcVar4, null, v7g.y(0.15d), 0, v7g.z(24), null, null, 0, 0, 16646009);
        ges b7 = ges.b(gesVar3, 0L, v7g.z(16), tqcVar3, null, v7g.y(0.15d), 0, v7g.z(24), null, null, 0, 0, 16646009);
        ges b8 = ges.b(gesVar3, 0L, v7g.z(14), tqcVar4, null, v7g.y(0.1d), 0, v7g.z(24), null, null, 0, 0, 16646009);
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            tqcVar = tqcVar3;
            gesVar2 = ges.b(gesVar3, 0L, v7g.z(16), tqcVar, null, v7g.y(0.5d), 0, v7g.z(24), null, null, 0, 0, 16646009);
        } else {
            tqcVar = tqcVar3;
            gesVar2 = gesVar;
        }
        ges b9 = ges.b(gesVar3, 0L, v7g.z(14), tqcVar, null, v7g.y(0.25d), 0, v7g.z(20), null, null, 0, 0, 16646009);
        tqc tqcVar5 = tqcVar;
        ges b10 = ges.b(gesVar3, 0L, v7g.z(14), tqcVar4, null, v7g.y(1.25d), 0, v7g.z(16), null, null, 0, 0, 16646009);
        ges b11 = ges.b(gesVar3, 0L, v7g.z(12), tqcVar5, null, v7g.y(0.4d), 0, v7g.z(16), null, null, 0, 0, 16646009);
        ges b12 = ges.b(gesVar3, 0L, v7g.z(10), tqcVar5, null, v7g.y(1.5d), 0, v7g.z(16), null, null, 0, 0, 16646009);
        ges a = wdt.a(b);
        ges a2 = wdt.a(b2);
        ges a3 = wdt.a(b3);
        ges a4 = wdt.a(b4);
        ges a5 = wdt.a(b5);
        ges a6 = wdt.a(b6);
        ges a7 = wdt.a(b7);
        ges a8 = wdt.a(b8);
        ges a9 = wdt.a(gesVar2);
        ges a10 = wdt.a(b9);
        ges a11 = wdt.a(b10);
        ges a12 = wdt.a(b11);
        ges a13 = wdt.a(b12);
        this.a = a;
        this.b = a2;
        this.c = a3;
        this.d = a4;
        this.e = a5;
        this.f = a6;
        this.g = a7;
        this.h = a8;
        this.i = a9;
        this.j = a10;
        this.k = a11;
        this.l = a12;
        this.m = a13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udt)) {
            return false;
        }
        udt udtVar = (udt) obj;
        return Intrinsics.d(this.a, udtVar.a) && Intrinsics.d(this.b, udtVar.b) && Intrinsics.d(this.c, udtVar.c) && Intrinsics.d(this.d, udtVar.d) && Intrinsics.d(this.e, udtVar.e) && Intrinsics.d(this.f, udtVar.f) && Intrinsics.d(this.g, udtVar.g) && Intrinsics.d(this.h, udtVar.h) && Intrinsics.d(this.i, udtVar.i) && Intrinsics.d(this.j, udtVar.j) && Intrinsics.d(this.k, udtVar.k) && Intrinsics.d(this.l, udtVar.l) && Intrinsics.d(this.m, udtVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + tlm.d(this.l, tlm.d(this.k, tlm.d(this.j, tlm.d(this.i, tlm.d(this.h, tlm.d(this.g, tlm.d(this.f, tlm.d(this.e, tlm.d(this.d, tlm.d(this.c, tlm.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
