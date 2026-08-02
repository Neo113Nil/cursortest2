package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class a6c implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a6c(t5c t5cVar, int i) {
        this.a = 0;
        this.c = t5cVar;
        this.b = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                t5c t5cVar = (t5c) obj4;
                oho ohoVar = (oho) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ohoVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(ohoVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    t5cVar.getClass();
                    w4k E = a0g.E(2131231418, 0, oq5Var);
                    vci vciVar = vci.a;
                    irf.r(E, null, a.a(d.m(vciVar, 88), "collection_favourite_playlist_header_cover"), null, null, 0.0f, null, oq5Var, 432, 120);
                    yci a = ohoVar.a(1.0f, vciVar, true);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i3 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var, i3, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    bg3.a(null, null, false, wdp.b, oq5Var, 3072, 7);
                    u1g.l(oq5Var, d.e(vciVar, 4));
                    xv7.j(rvf.H(R.plurals.contest_playlist_min_tracks_quantity, i2, new Object[]{tt0.C(i2)}, oq5Var), a.a(vciVar, "collection_favourite_playlist_header_counter"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 0, false, 2, 0, null, nu0.i(), oq5Var, 48, 3072, 57336);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                int max = Math.max(0, ((u6k) obj4).h() - i2);
                ksk M = ffhVar.M(((ga6) obj3).a);
                return mfh.m0(mfhVar, M.a, M.b, new b4k(max, 1, M));
            default:
                aqi aqiVar = (aqi) obj4;
                mfh mfhVar2 = (mfh) obj;
                ffh ffhVar2 = (ffh) obj2;
                mfhVar2.getClass();
                ffhVar2.getClass();
                ksk M2 = ffhVar2.M(ga6.b(((ga6) obj3).a, 0, 0, 0, ((Number) aqiVar.getValue()).intValue() != 0 ? ((Number) aqiVar.getValue()).intValue() * 5 : i2 * 5, 7));
                int i4 = M2.a;
                int i5 = M2.b;
                int intValue2 = ((Number) aqiVar.getValue()).intValue() * 5;
                if (i5 > intValue2) {
                    i5 = intValue2;
                }
                return mfh.m0(mfhVar2, i4, i5, new zj(M2, 8));
        }
    }

    public /* synthetic */ a6c(int i, aqi aqiVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = aqiVar;
    }
}
