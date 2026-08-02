package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oyn implements uyf {
    public final /* synthetic */ kyf a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ kyf d;
    public final /* synthetic */ zt3 e;
    public final /* synthetic */ qqi f;
    public final /* synthetic */ aur g;

    /* JADX WARN: Multi-variable type inference failed */
    public oyn(kyf kyfVar, xqn xqnVar, mm6 mm6Var, kyf kyfVar2, zt3 zt3Var, qqi qqiVar, Function2 function2) {
        this.a = kyfVar;
        this.b = xqnVar;
        this.c = mm6Var;
        this.d = kyfVar2;
        this.e = zt3Var;
        this.f = qqiVar;
        this.g = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        kyf kyfVar2 = this.a;
        xqn xqnVar = this.b;
        if (kyfVar == kyfVar2) {
            xqnVar.a = x97.y(this.c, null, null, new rfg(this.f, (Function2) this.g, (Continuation) null), 3);
            return;
        }
        if (kyfVar == this.d) {
            r2f r2fVar = (r2f) xqnVar.a;
            if (r2fVar != null) {
                r2fVar.g(null);
            }
            xqnVar.a = null;
        }
        if (kyfVar == kyf.ON_DESTROY) {
            r7o r7oVar = z7o.b;
            this.e.resumeWith(Unit.a);
        }
    }
}
