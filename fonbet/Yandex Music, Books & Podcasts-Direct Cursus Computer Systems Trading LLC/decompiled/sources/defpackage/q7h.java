package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class q7h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia0 b;

    public /* synthetic */ q7h(ia0 ia0Var, int i) {
        this.a = i;
        this.b = ia0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                fi4 fi4Var = (fi4) this.b.m;
                if (fi4Var != null) {
                    fi4Var.j(bi4.t);
                    qgv qgvVar = fi4Var.P;
                    qgvVar.b();
                    qgvVar.d.postDelayed(new ogv(qgvVar, 0), 500L);
                }
                return Unit.a;
            default:
                ia0 ia0Var = this.b;
                q0v q0vVar = ((vbv) ia0Var.b).A;
                t requireActivity = ((p7h) ia0Var.a).requireActivity();
                requireActivity.getClass();
                return (yes) q0vVar.invoke(requireActivity);
        }
    }
}
