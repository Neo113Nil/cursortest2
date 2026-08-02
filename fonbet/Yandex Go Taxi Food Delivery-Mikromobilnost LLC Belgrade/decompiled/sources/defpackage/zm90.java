package defpackage;

import android.content.Intent;
import android.os.Handler;
import com.yandex.messaging.auth.passport.b;
import com.yandex.passport.internal.a0;

/* loaded from: classes15.dex */
public final class zm90 {
    public final xqi0 a;
    public final b00 b;
    public final b c;
    public final x22 d;

    public zm90(xqi0 xqi0Var, y120 y120Var, b00 b00Var, b bVar, x22 x22Var) {
        this.a = xqi0Var;
        this.b = b00Var;
        this.c = bVar;
        this.d = x22Var;
    }

    public final void a(int i) {
        if (i != -1) {
            return;
        }
        this.d.reportEvent("phone_bind_success");
        this.a.e();
        b00 b00Var = this.b;
        ((Handler) b00Var.a.get()).post(new uz(0, b00Var));
    }

    public final boolean b(int i, Intent intent) {
        if (i != -1 || intent == null) {
            return false;
        }
        if (this.c == null) {
            ika1.d(this.d, "PassportActivityResultProcessor_onLoginResult");
            return false;
        }
        this.a.f(jjo.e(a0.e(intent.getExtras()).a));
        return true;
    }
}
