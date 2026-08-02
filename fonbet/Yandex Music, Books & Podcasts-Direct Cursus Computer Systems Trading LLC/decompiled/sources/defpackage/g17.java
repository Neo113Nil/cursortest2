package defpackage;

import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g17 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j17 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g17(j17 j17Var, int i) {
        super(0);
        this.r = i;
        this.s = j17Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ww3 ww3Var;
        switch (this.r) {
            case 0:
                this.s.c();
                break;
            case 1:
                this.s.d();
                break;
            case 2:
                this.s.f.a();
                break;
            case 3:
                j17 j17Var = this.s;
                if (j17Var.f.c() == null && (ww3Var = j17Var.n) != null) {
                    ww3Var.invoke(new hne(fbs.CVN));
                }
                j17.a(j17Var);
                break;
            default:
                k17 k17Var = (k17) this.s.a.b;
                Object systemService = k17Var.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(k17Var.getWindowToken(), 0);
                }
                break;
        }
        return Unit.a;
    }
}
