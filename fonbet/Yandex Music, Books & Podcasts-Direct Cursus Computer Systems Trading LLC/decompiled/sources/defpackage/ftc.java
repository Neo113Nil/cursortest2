package defpackage;

import androidx.fragment.app.o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ftc extends htc {
    public final /* synthetic */ yyc a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ uh c;
    public final /* synthetic */ rh d;
    public final /* synthetic */ o e;

    public ftc(o oVar, yyc yycVar, AtomicReference atomicReference, uh uhVar, rh rhVar) {
        this.e = oVar;
        this.a = yycVar;
        this.b = atomicReference;
        this.c = uhVar;
        this.d = rhVar;
    }

    @Override // defpackage.htc
    public final void a() {
        o oVar = this.e;
        this.b.set(((fi) this.a.apply(null)).d(oVar.generateActivityResultKey(), oVar, this.c, this.d));
    }
}
