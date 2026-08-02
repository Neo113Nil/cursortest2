package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ncg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ vs3 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ ncg(AtomicBoolean atomicBoolean, vs3 vs3Var, Function0 function0, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = vs3Var;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vs3 vs3Var = this.c;
                Function0 function0 = this.d;
                if (!this.b.get()) {
                    try {
                        vs3Var.a(function0.invoke());
                        break;
                    } catch (Throwable th) {
                        vs3Var.b(th);
                        return;
                    }
                }
                break;
            default:
                vs3 vs3Var2 = this.c;
                Function0 function02 = this.d;
                if (!this.b.get()) {
                    try {
                        vs3Var2.a(function02.invoke());
                        break;
                    } catch (Throwable th2) {
                        vs3Var2.b(th2);
                    }
                }
                break;
        }
    }
}
