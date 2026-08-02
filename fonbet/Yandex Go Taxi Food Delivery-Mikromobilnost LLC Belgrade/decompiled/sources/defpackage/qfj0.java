package defpackage;

import ru.yandex.taxi.ui.RequirementDetailsModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class qfj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tfj0 b;

    public /* synthetic */ qfj0(tfj0 tfj0Var, int i) {
        this.a = i;
        this.b = tfj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tfj0 tfj0Var = this.b;
        switch (i) {
            case 0:
                RequirementDetailsModalView.onAttachedToWindow$quit(tfj0Var);
                break;
            default:
                tfj0Var.B.a().p();
                break;
        }
    }
}
