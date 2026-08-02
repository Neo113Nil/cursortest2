package defpackage;

import java.util.concurrent.Callable;
import ru.kinopoisk.sdk.easylogin.internal.T0;
import ru.kinopoisk.sdk.easylogin.internal.X0;

/* loaded from: classes5.dex */
public final class dm5 extends aij {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ dm5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        switch (this.a) {
            case 0:
                cm5 cm5Var = new cm5(wjjVar, (oij) this.c);
                wjjVar.b(cm5Var);
                ((bm5) this.b).a(cm5Var);
                break;
            default:
                ka8 ka8Var = t4b.a;
                try {
                    h5n h5nVar = (h5n) this.c;
                    hjj d = T0.d((X0) h5nVar.b, this.b);
                    up6.L(d, "The mapper returned a null ObservableSource");
                    if (!(d instanceof Callable)) {
                        d.a(wjjVar);
                        break;
                    } else {
                        try {
                            Object call = ((Callable) d).call();
                            if (call != null) {
                                gjj gjjVar = new gjj(wjjVar, call);
                                wjjVar.b(gjjVar);
                                gjjVar.run();
                                break;
                            } else {
                                wjjVar.b(ka8Var);
                                wjjVar.onComplete();
                                break;
                            }
                        } catch (Throwable th) {
                            leu.a0(th);
                            wjjVar.b(ka8Var);
                            wjjVar.onError(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    wjjVar.b(ka8Var);
                    wjjVar.onError(th2);
                }
        }
    }
}
