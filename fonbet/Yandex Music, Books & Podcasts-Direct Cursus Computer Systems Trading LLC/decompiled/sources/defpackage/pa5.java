package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes.dex */
public abstract class pa5 {
    public static final agr a = new agr(na5.s);

    public static final long a(ma5 ma5Var, long j) {
        long d = ma5Var.d();
        x6k x6kVar = ma5Var.i;
        x6k x6kVar2 = ma5Var.h;
        return d85.c(j, d) ? ((d85) x6kVar2.getValue()).a : d85.c(j, ((d85) ma5Var.b.getValue()).a) ? ((d85) x6kVar2.getValue()).a : d85.c(j, ((d85) ma5Var.c.getValue()).a) ? ((d85) x6kVar.getValue()).a : d85.c(j, ma5Var.e()) ? ((d85) x6kVar.getValue()).a : d85.c(j, ma5Var.a()) ? ((d85) ma5Var.j.getValue()).a : d85.c(j, ma5Var.f()) ? ma5Var.c() : d85.c(j, ma5Var.b()) ? ((d85) ma5Var.l.getValue()).a : d85.n;
    }

    public static final long b(long j, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-702388415);
        long a2 = a((ma5) oq5Var.j(a), j);
        if (a2 == 16) {
            a2 = ((d85) oq5Var.j(sb6.a)).a;
        }
        oq5Var.p(false);
        return a2;
    }

    public static ma5 c(long j, long j2, long j3, long j4, long j5, int i) {
        long h = (i & 1) != 0 ? c3x.h(4284612846L) : j;
        long h2 = c3x.h(4281794739L);
        long h3 = c3x.h(4278442694L);
        long h4 = (i & 8) != 0 ? c3x.h(4278290310L) : j2;
        long j6 = d85.f;
        long j7 = (i & 32) != 0 ? j6 : j3;
        long h5 = c3x.h(4289724448L);
        long j8 = d85.b;
        return new ma5(h, h2, h3, h4, j6, j7, h5, j6, j8, (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? j8 : j4, (i & 1024) != 0 ? j8 : j5, j6, true);
    }
}
