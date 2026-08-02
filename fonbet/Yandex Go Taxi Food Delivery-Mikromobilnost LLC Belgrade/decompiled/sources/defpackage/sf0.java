package defpackage;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;

/* loaded from: classes13.dex */
public final /* synthetic */ class sf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ sf0(tf0 tf0Var, int i) {
        this.a = i;
        this.b = tf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tf0 tf0Var = this.b;
        switch (i) {
            case 0:
                tf0Var.x.b.a.d();
                break;
            default:
                vnr0 vnr0Var = tf0Var.B;
                String str = tf0Var.Lg().a;
                qf0 qf0Var = tf0Var.x;
                vnr0Var.n(str, qf0Var.c, SharedPaymentAnalytics$Button.BACK);
                qf0Var.b.a.d();
                break;
        }
    }
}
