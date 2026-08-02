package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class jld extends ContextWrapper {
    public static final x5d k;
    public final z98 a;
    public final u76 b;
    public final ovn c;
    public final d51 d;
    public final List e;
    public final xy0 f;
    public final q7b g;
    public final qzc h;
    public final int i;
    public g1o j;

    static {
        x5d x5dVar = new x5d();
        x5dVar.a = w7j.a;
        k = x5dVar;
    }

    public jld(Context context, z98 z98Var, r0o r0oVar, ovn ovnVar, d51 d51Var, xy0 xy0Var, List list, q7b q7bVar, qzc qzcVar) {
        super(context.getApplicationContext());
        this.a = z98Var;
        this.c = ovnVar;
        this.d = d51Var;
        this.e = list;
        this.f = xy0Var;
        this.g = q7bVar;
        this.h = qzcVar;
        this.i = 4;
        this.b = new u76(r0oVar);
    }

    public final nsn a() {
        return (nsn) this.b.get();
    }
}
