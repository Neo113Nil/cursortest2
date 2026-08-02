package defpackage;

import java.util.concurrent.Callable;
import ru.kinopoisk.sdk.easylogin.internal.T0;
import ru.kinopoisk.sdk.easylogin.internal.X0;

/* loaded from: classes5.dex */
public final class rij extends k8 {
    public final /* synthetic */ int b;
    public final int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rij(aij aijVar, Object obj, int i, int i2) {
        super(aijVar);
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        switch (this.b) {
            case 0:
                this.a.a(new qij(wjjVar, ((gsd) this.d).a(), this.c));
                break;
            default:
                ka8 ka8Var = t4b.a;
                h5n h5nVar = (h5n) this.d;
                hjj hjjVar = this.a;
                if (!(hjjVar instanceof Callable)) {
                    hjjVar.a(new jjj(wjjVar, h5nVar, this.c));
                    break;
                } else {
                    try {
                        Object call = ((Callable) hjjVar).call();
                        if (call == null) {
                            wjjVar.b(ka8Var);
                            wjjVar.onComplete();
                            break;
                        } else {
                            try {
                                hjj d = T0.d((X0) h5nVar.b, call);
                                up6.L(d, "The mapper returned a null ObservableSource");
                                if (!(d instanceof Callable)) {
                                    d.a(wjjVar);
                                    break;
                                } else {
                                    try {
                                        Object call2 = ((Callable) d).call();
                                        if (call2 != null) {
                                            gjj gjjVar = new gjj(wjjVar, call2);
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
                                leu.a0(th2);
                                wjjVar.b(ka8Var);
                                wjjVar.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        leu.a0(th3);
                        wjjVar.b(ka8Var);
                        wjjVar.onError(th3);
                        return;
                    }
                }
        }
    }
}
