package defpackage;

import ru.kinopoisk.sdk.easylogin.internal.T0;

/* loaded from: classes5.dex */
public final class km5 implements jm5, ka8, xeh {
    public final /* synthetic */ int a = 0;
    public ka8 b;
    public final Object c;
    public final Object d;

    public km5(xeh xehVar, h5n h5nVar) {
        this.c = xehVar;
        this.d = h5nVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                ka8 ka8Var = this.b;
                this.b = ra8.a;
                ka8Var.a();
                break;
        }
    }

    @Override // defpackage.jm5, defpackage.xeh
    public final void b(ka8 ka8Var) {
        switch (this.a) {
            case 0:
                jm5 jm5Var = (jm5) this.c;
                try {
                    ((lm5) this.d).b.accept(ka8Var);
                    if (ra8.h(this.b, ka8Var)) {
                        this.b = ka8Var;
                        jm5Var.b(this);
                        break;
                    }
                } catch (Throwable th) {
                    leu.a0(th);
                    ka8Var.a();
                    this.b = ra8.a;
                    jm5Var.b(t4b.a);
                    jm5Var.onError(th);
                    return;
                }
                break;
            default:
                if (ra8.h(this.b, ka8Var)) {
                    this.b = ka8Var;
                    ((xeh) this.c).b(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jm5, defpackage.xeh
    public final void onComplete() {
        switch (this.a) {
            case 0:
                jm5 jm5Var = (jm5) this.c;
                lm5 lm5Var = (lm5) this.d;
                if (this.b != ra8.a) {
                    try {
                        lm5Var.d.mo32run();
                        jm5Var.onComplete();
                        break;
                    } catch (Throwable th) {
                        leu.a0(th);
                        jm5Var.onError(th);
                        return;
                    }
                }
                break;
            default:
                ((xeh) this.c).onComplete();
                break;
        }
    }

    @Override // defpackage.jm5, defpackage.xeh
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                lm5 lm5Var = (lm5) this.d;
                if (this.b != ra8.a) {
                    try {
                        lm5Var.c.accept(th);
                    } catch (Throwable th2) {
                        leu.a0(th2);
                        th = new ar5(th, th2);
                    }
                    ((jm5) this.c).onError(th);
                    break;
                } else {
                    y5g.g0(th);
                    break;
                }
            default:
                ((xeh) this.c).onError(th);
                break;
        }
    }

    @Override // defpackage.xeh
    public void onSuccess(Object obj) {
        xeh xehVar = (xeh) this.c;
        try {
            if (T0.f((T0.d) ((h5n) this.d).b, obj)) {
                xehVar.onSuccess(obj);
            } else {
                xehVar.onComplete();
            }
        } catch (Throwable th) {
            leu.a0(th);
            xehVar.onError(th);
        }
    }

    public km5(lm5 lm5Var, jm5 jm5Var) {
        this.d = lm5Var;
        this.c = jm5Var;
    }
}
