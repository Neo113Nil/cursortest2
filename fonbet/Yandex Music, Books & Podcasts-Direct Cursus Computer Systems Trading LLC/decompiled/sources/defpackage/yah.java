package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class yah implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ezc b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yah(int i, Function0 function0) {
        this.a = i;
        this.b = (ezc) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ezc, java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ezc, java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                ?? r2 = this.b;
                boolean f = oq5Var2.f(r2);
                Object K = oq5Var2.K();
                if (f || K == gq5.a) {
                    K = new ncq(r2);
                    oq5Var2.k0(K);
                }
                ivf.o((ncq) K, r2, null, null, null, oq5Var2, 0, 28);
                break;
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var;
                ?? r22 = this.b;
                boolean f2 = oq5Var4.f(r22);
                Object K2 = oq5Var4.K();
                if (f2 || K2 == gq5.a) {
                    K2 = new qcq(r22);
                    oq5Var4.k0(K2);
                }
                ivf.o((qcq) K2, r22, null, null, null, oq5Var4, 0, 28);
                break;
        }
        return Unit.a;
    }
}
