package defpackage;

import android.os.Bundle;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class mva implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qva b;

    public /* synthetic */ mva(qva qvaVar, int i) {
        this.a = i;
        this.b = qvaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Bundle arguments = this.b.getArguments();
                fva fvaVar = arguments != null ? (fva) arguments.getParcelable("data") : null;
                if (fvaVar == null) {
                    xq0.x("Required value was null.");
                    break;
                } else {
                    break;
                }
            default:
                t requireActivity = this.b.requireActivity();
                requireActivity.getClass();
                tka tkaVar = new tka(5);
                lm4 a = ern.a(fwa.class);
                jfu viewModelStore = requireActivity.getViewModelStore();
                s40 s40Var = new s40(12, tkaVar);
                gs6 gs6Var = gs6.b;
                viewModelStore.getClass();
                gs6Var.getClass();
                bjt bjtVar = new bjt(viewModelStore, s40Var, gs6Var);
                String f = a.f();
                if (f == null) {
                    xq0.x("Local and anonymous classes can not be ViewModels");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
