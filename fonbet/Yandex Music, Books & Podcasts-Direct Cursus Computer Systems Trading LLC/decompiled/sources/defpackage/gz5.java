package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class gz5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv5 b;

    public /* synthetic */ gz5(wv5 wv5Var, int i) {
        this.a = i;
        this.b = wv5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, this.b.g);
                break;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.k(jfpVar2, this.b.g);
                break;
            case 2:
                kn0 kn0Var = (kn0) obj;
                kn0Var.getClass();
                ct5 ct5Var = this.b.f;
                String str = ct5Var.i;
                if (str != null && !StringsKt.U(str)) {
                    kn0Var.d(" • ");
                }
                kn0Var.d(ct5Var.d);
                break;
            case 3:
                kn0 kn0Var2 = (kn0) obj;
                kn0Var2.getClass();
                String str2 = this.b.f.j;
                if (str2 != null) {
                    kn0Var2.d(" • ");
                    kn0Var2.d(str2);
                }
                break;
            default:
                kn0 kn0Var3 = (kn0) obj;
                kn0Var3.getClass();
                ct5 ct5Var2 = this.b.f;
                String str3 = ct5Var2.i;
                if (str3 != null && !StringsKt.U(str3)) {
                    kn0Var3.d(" • ");
                }
                kn0Var3.d(ct5Var2.d);
                String str4 = ct5Var2.j;
                if (str4 != null) {
                    kn0Var3.d(" • ");
                    kn0Var3.d(str4);
                }
                break;
        }
        return Unit.a;
    }
}
