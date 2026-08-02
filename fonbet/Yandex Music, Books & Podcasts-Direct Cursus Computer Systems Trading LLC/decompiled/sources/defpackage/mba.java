package defpackage;

import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class mba implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mba(az2 az2Var, boolean z, Function0 function0, Function0 function02, boolean z2) {
        this.f = az2Var;
        this.b = z;
        this.d = function0;
        this.c = function02;
        this.e = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                laa laaVar = (laa) this.f;
                d85 d85Var = (d85) this.c;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci a = a.a(vci.a, "download_button");
                laaVar.getClass();
                if (!laaVar.equals(haa.a)) {
                    if (!(laaVar instanceof iaa)) {
                        if (!laaVar.equals(jaa.a)) {
                            if (!(laaVar instanceof kaa)) {
                                b6e.s();
                                break;
                            } else {
                                str = "ready_to_download_button_state";
                            }
                        } else {
                            str = "no_tracks_button_state";
                        }
                    } else {
                        str = "progress_button_state";
                    }
                } else {
                    str = "download_button_state";
                }
                yci c = b.c(a, "state", str);
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new c68(19);
                    oq5Var2.k0(K);
                }
                yci a2 = nfp.a(c, (Function1) K);
                if (d85Var == null) {
                    oq5Var2.Z(1129972282);
                    d85Var = ((q9b) oq5Var2.j(s9b.a)).a();
                } else {
                    oq5Var2.Z(1129970484);
                }
                oq5Var2.p(false);
                a0g.p(this.d, a2, this.b, this.e, 0L, d85Var, ild.C(401034798, new tt5(10, laaVar), oq5Var2), oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 16);
            case 1:
                d85 d85Var2 = (d85) this.c;
                d85 d85Var3 = (d85) this.f;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                yci a3 = a.a(vci.a, "like_button");
                boolean z = this.b;
                yci c2 = b.c(a3, "state", z ? "like" : "no_like");
                oq5 oq5Var4 = (oq5) hq5Var2;
                Object K2 = oq5Var4.K();
                if (K2 == gq5.a) {
                    K2 = new xjf(9);
                    oq5Var4.k0(K2);
                }
                yci a4 = nfp.a(c2, (Function1) K2);
                if (d85Var2 == null) {
                    oq5Var4.Z(-494548917);
                    d85Var2 = ((q9b) oq5Var4.j(s9b.a)).a();
                } else {
                    oq5Var4.Z(-494550715);
                }
                oq5Var4.p(false);
                a0g.p(this.d, a4, true, this.e, 0L, d85Var2, ild.C(1879914731, new o91(z, d85Var3, 4), oq5Var4), oq5Var4, ScreenMirroringConfig.Video.BITRATE_1_5MB, 16);
            default:
                az2 az2Var = (az2) this.f;
                Function0 function0 = (Function0) this.c;
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(intValue & 1, (intValue & 3) != 2)) {
                    if (az2Var.b) {
                        oq5Var5.Z(-802957051);
                        nho a5 = lho.a(qx0.a, b2c.l, oq5Var5, 48);
                        int i = oq5Var5.P;
                        androidx.compose.runtime.internal.a l = oq5Var5.l();
                        yci H = vnj.H(oq5Var5, vci.a);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var5.d0();
                        if (oq5Var5.O) {
                            oq5Var5.k(grbVar);
                        } else {
                            oq5Var5.n0();
                        }
                        g0g.U(oq5Var5, a5, wp5.f);
                        g0g.U(oq5Var5, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i))) {
                            ouj.x(i, oq5Var5, i, kb5Var);
                        }
                        g0g.U(oq5Var5, H, wp5.d);
                        szf.b(this.b, this.d, null, null, ((dq0) oq5Var5.j(eq0.a)).a.g, 0L, oq5Var5, 0, 44);
                        xp3.h(0, oq5Var5, null, function0, this.e);
                        oq5Var5.p(true);
                    } else {
                        oq5Var5.Z(-804194230);
                    }
                    oq5Var5.p(false);
                } else {
                    oq5Var5.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mba(laa laaVar, d85 d85Var, Function0 function0, boolean z, boolean z2) {
        this.f = laaVar;
        this.c = d85Var;
        this.d = function0;
        this.b = z;
        this.e = z2;
    }

    public /* synthetic */ mba(boolean z, d85 d85Var, Function0 function0, boolean z2, d85 d85Var2) {
        this.b = z;
        this.c = d85Var;
        this.d = function0;
        this.e = z2;
        this.f = d85Var2;
    }
}
