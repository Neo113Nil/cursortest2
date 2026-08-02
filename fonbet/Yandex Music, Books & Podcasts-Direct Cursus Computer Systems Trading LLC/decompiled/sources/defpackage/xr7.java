package defpackage;

import com.yandex.passport.common.mvi.h;

/* loaded from: classes.dex */
public final class xr7 {
    public final wc3 a;
    public final h b;
    public final sqn c;
    public final s0n d;
    public final s0n e;
    public final xy2 f;
    public final s0n g;
    public boolean h;

    public xr7(Object obj, wc3 wc3Var, h hVar, sqn sqnVar) {
        hVar.getClass();
        this.a = wc3Var;
        this.b = hVar;
        this.c = sqnVar;
        this.d = new s0n();
        this.e = new s0n();
        xy2 xy2Var = new xy2();
        xy2Var.c = obj;
        this.f = xy2Var;
        this.g = new s0n();
    }

    public final void a(Object obj) {
        obj.getClass();
        l7h.a();
        this.d.onNext(obj);
    }

    public final void b() {
        l7h.a();
        xy2 xy2Var = this.f;
        if (xy2Var.b != null) {
            wc3 wc3Var = this.a;
            if (wc3Var != null) {
                wc3Var.a();
            }
            this.b.b();
            this.d.onComplete();
            xy2Var.onComplete();
            this.g.onComplete();
        }
    }
}
