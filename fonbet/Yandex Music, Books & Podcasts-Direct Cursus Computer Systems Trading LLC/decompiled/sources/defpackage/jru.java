package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class jru implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kru b;

    public /* synthetic */ jru(kru kruVar, int i) {
        this.a = i;
        this.b = kruVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        nru nruVar;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                kru kruVar = this.b;
                jf0.a(new qzm[0], kruVar.j, false, ild.C(1982862442, new jru(kruVar, 1), hq5Var), hq5Var, 0, 4);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                kru kruVar2 = this.b;
                mpu mpuVar = kruVar2.k;
                t requireActivity = kruVar2.requireActivity();
                requireActivity.getClass();
                Object d = kruVar2.d();
                Object x = kruVar2.x();
                apo apoVar = mpuVar.a;
                oq5 oq5Var3 = (oq5) hq5Var2;
                oq5Var3.Z(-603280567);
                if (((Boolean) oq5Var3.j(koe.a)).booleanValue()) {
                    nruVar = new mru();
                    oq5Var3.p(false);
                } else {
                    boolean h = oq5Var3.h(mpuVar) | oq5Var3.h(d) | oq5Var3.h(x);
                    Object K = oq5Var3.K();
                    Object obj3 = gq5.a;
                    if (h || K == obj3) {
                        K = new zzq(17, mpuVar, d, x);
                        oq5Var3.k0(K);
                    }
                    oq5Var3.a0(419377738);
                    bfu R = ngg.R(ern.a(uru.class), requireActivity, null, k5r.g(uru.class, new p97(1), (Function1) K), requireActivity.getDefaultViewModelCreationExtras(), oq5Var3);
                    oq5Var3.p(false);
                    uru uruVar = (uru) R;
                    boolean f = oq5Var3.f(requireActivity);
                    Object K2 = oq5Var3.K();
                    if (f || K2 == obj3) {
                        apoVar.getClass();
                        K2 = new lru(requireActivity);
                        oq5Var3.k0(K2);
                    }
                    lru lruVar = (lru) K2;
                    boolean f2 = oq5Var3.f(requireActivity);
                    Object K3 = oq5Var3.K();
                    if (f2 || K3 == obj3) {
                        apoVar.getClass();
                        K3 = new lpu(requireActivity);
                        oq5Var3.k0(K3);
                    }
                    lpu lpuVar = (lpu) K3;
                    boolean f3 = oq5Var3.f(requireActivity) | oq5Var3.f(uruVar) | oq5Var3.f(lruVar) | oq5Var3.f(lpuVar);
                    Object K4 = oq5Var3.K();
                    if (f3 || K4 == obj3) {
                        apoVar.getClass();
                        lruVar.getClass();
                        lpuVar.getClass();
                        K4 = new oru(requireActivity, uruVar, lruVar, lpuVar, (nmj) ((gqu) apoVar.b).d.getValue());
                        oq5Var3.k0(K4);
                    }
                    nruVar = (nru) K4;
                    oq5Var3.p(false);
                }
                dsu dsuVar = kruVar2.l;
                t requireActivity2 = kruVar2.requireActivity();
                requireActivity2.getClass();
                zdg.i(dsuVar, requireActivity2, nruVar.b(), hq5Var2, 0);
                y parentFragmentManager = kruVar2.getParentFragmentManager();
                parentFragmentManager.getClass();
                ezf.m(nruVar, parentFragmentManager, kruVar2.j, hq5Var2, 0);
                hag.i(nruVar, null, hq5Var2, 0);
        }
        return Unit.a;
    }
}
