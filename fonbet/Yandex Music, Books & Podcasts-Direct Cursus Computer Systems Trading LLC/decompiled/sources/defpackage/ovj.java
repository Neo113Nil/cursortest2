package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class ovj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rvj b;

    public /* synthetic */ ovj(rvj rvjVar, int i) {
        this.a = 1;
        this.b = rvjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        kjn kjnVar = gq5.a;
        rvj rvjVar = this.b;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    fkn fknVar = rvjVar.e;
                    boolean h = oq5Var.h(rvjVar);
                    Object K = oq5Var.K();
                    Continuation continuation = null;
                    if (h || K == kjnVar) {
                        K = new h1j(rvjVar, continuation, 12);
                        oq5Var.k0(K);
                    }
                    gwj gwjVar = gwj.a;
                    iwj iwjVar = (iwj) szf.l0(gwjVar, fknVar, (Function2) K, oq5Var).getValue();
                    if (Intrinsics.d(iwjVar, gwjVar)) {
                        oq5Var.Z(-1674956318);
                        szf.k(1, 6, 2, oq5Var, null);
                        oq5Var.p(false);
                    } else if (iwjVar instanceof dwj) {
                        oq5Var.Z(-1674953922);
                        p6g.a((dwj) iwjVar, oq5Var, 0);
                        oq5Var.p(false);
                    } else if (iwjVar instanceof ewj) {
                        oq5Var.Z(-1674950522);
                        p6g.f((ewj) iwjVar, rvjVar, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        if (!Intrinsics.d(iwjVar, hwj.a)) {
                            throw vz1.i(oq5Var, -1674958104, false);
                        }
                        oq5Var.Z(-1674945962);
                        oq5Var.p(false);
                        hag.x(rvjVar.b.a, R.string.check_internet_connection, 0);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                p6g.e(rvjVar, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                s9f[] s9fVarArr = vvj.e;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(-1866466829, new ovj(rvjVar, 3, objArr == true ? 1 : 0), oq5Var2), oq5Var2, 432, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            default:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                s9f[] s9fVarArr2 = vvj.e;
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    rvj rvjVar2 = this.b;
                    boolean h2 = oq5Var3.h(rvjVar2);
                    Object K2 = oq5Var3.K();
                    if (h2 || K2 == kjnVar) {
                        msj msjVar = new msj(0, rvjVar2, rvj.class, "reloadScreen", "reloadScreen()V", 0, 2);
                        oq5Var3.k0(msjVar);
                        K2 = msjVar;
                    }
                    Function0 function0 = (Function0) ((h9f) K2);
                    boolean h3 = oq5Var3.h(rvjVar2);
                    Object K3 = oq5Var3.K();
                    if (h3 || K3 == kjnVar) {
                        msj msjVar2 = new msj(0, rvjVar2, rvj.class, "close", "close()V", 0, 3);
                        oq5Var3.k0(msjVar2);
                        K3 = msjVar2;
                    }
                    qwp.q(function0, (Function0) ((h9f) K3), null, oq5Var3, 0, 4);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ovj(rvj rvjVar, int i, byte b) {
        this.a = i;
        this.b = rvjVar;
    }
}
