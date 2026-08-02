package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class sg1 implements q3b, lci {
    public Context a;

    public sg1(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
            default:
                context.getClass();
                this.a = context;
                break;
            case 3:
                this.a = context.getApplicationContext();
                break;
            case 4:
                this.a = context;
                break;
        }
    }

    public static Object d(Context context, n7d n7dVar, cg6 cg6Var) {
        zt3 zt3Var = new zt3(1, qxe.b(cg6Var));
        zt3Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        zt3Var.u(new up5(cancellationSignal, 2));
        jzi jziVar = new jzi(zt3Var);
        gx0 gx0Var = new gx0(1);
        context.getClass();
        ns6 a = pd5.a(new pd5(context), n7dVar);
        if (a == null) {
            jziVar.f(new l7d(3, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            a.onGetCredential(context, n7dVar, cancellationSignal, gx0Var, jziVar);
        }
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    @Override // defpackage.q3b
    public void a(men menVar) {
        y36 y36Var = new y36("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), y36Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new cy1(17, this, menVar, threadPoolExecutor));
    }

    public v77 b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        v77 v77Var = new v77();
        v77Var.a = u8a.a(lxe.e);
        fs6 fs6Var = new fs6(1, context);
        v77Var.b = fs6Var;
        v77Var.c = u8a.a(new w2i(fs6Var, new fs6(0, fs6Var), 0));
        fs6 fs6Var2 = v77Var.b;
        v77Var.d = new yib(fs6Var2, 1);
        int i = 1;
        szm a = u8a.a(new w2i(v77Var.d, u8a.a(new yib(fs6Var2, 0)), i));
        v77Var.e = a;
        sob sobVar = new sob(1);
        fs6 fs6Var3 = v77Var.b;
        uto utoVar = new uto(fs6Var3, a, sobVar, 0);
        szm szmVar = v77Var.a;
        szm szmVar2 = v77Var.c;
        v77Var.f = u8a.a(new uto(new fq7(szmVar, szmVar2, utoVar, a, a), new xot(fs6Var3, szmVar2, a, utoVar, szmVar, a, a), new e4w(szmVar, a, utoVar, a), i));
        return v77Var;
    }

    public Object c(Context context, ar6 ar6Var, cg6 cg6Var) {
        zt3 zt3Var = new zt3(1, qxe.b(cg6Var));
        zt3Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        zt3Var.u(new up5(cancellationSignal, 1));
        rp7 rp7Var = new rp7(zt3Var);
        gx0 gx0Var = new gx0(1);
        context.getClass();
        ns6 a = pd5.a(new pd5(this.a), ar6Var);
        if (a == null) {
            rp7Var.f(new yq6("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 3));
        } else {
            a.onCreateCredential(context, ar6Var, cancellationSignal, gx0Var, rp7Var);
        }
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new qwh(this.a, 1);
    }
}
