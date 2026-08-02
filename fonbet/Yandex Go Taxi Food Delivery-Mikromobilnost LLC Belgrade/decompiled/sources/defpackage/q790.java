package defpackage;

import com.yandex.go.platform.ui.components.SpinnerProgressView;

/* loaded from: classes13.dex */
public final class q790 extends x3 {
    @Override // defpackage.x3
    public final x3 Og() {
        w040 w040Var = (w040) this.b;
        ujf0 ujf0Var = (ujf0) w040Var.c;
        if (ujf0Var instanceof rjf0) {
            oj91.a(((rjf0) ujf0Var).a, 0L);
        } else if (ujf0Var instanceof tjf0) {
            SpinnerProgressView spinnerProgressView = ((tjf0) ujf0Var).a;
            spinnerProgressView.getSpinner().setAlpha(1.0f);
            oj91.a(spinnerProgressView, 0L);
        }
        return new p790(12, w040Var);
    }
}
