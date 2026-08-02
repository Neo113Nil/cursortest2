package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fc8 extends uif implements Function0 {
    public final /* synthetic */ g23 r;
    public final /* synthetic */ f23 s;
    public final /* synthetic */ gc8 t;
    public final /* synthetic */ rv8 u;
    public final /* synthetic */ rv8 v;
    public final /* synthetic */ qv8 w;
    public final /* synthetic */ qv8 x;
    public final /* synthetic */ View y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc8(g23 g23Var, f23 f23Var, gc8 gc8Var, rv8 rv8Var, rv8 rv8Var2, qv8 qv8Var, qv8 qv8Var2, View view, boolean z) {
        super(0);
        this.r = g23Var;
        this.s = f23Var;
        this.t = gc8Var;
        this.u = rv8Var;
        this.v = rv8Var2;
        this.w = qv8Var;
        this.x = qv8Var2;
        this.y = view;
        this.z = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f23 f23Var = this.s;
        this.r.d();
        try {
            gc8 gc8Var = this.t;
            rv8 rv8Var = this.u;
            rv8 rv8Var2 = this.v;
            qv8 qv8Var = this.w;
            jc8 jc8Var = qv8Var != null ? qv8Var.a : null;
            qv8 qv8Var2 = this.x;
            View view = this.y;
            boolean z = this.z;
            int i = gc8.D0;
            gc8Var.q(rv8Var, rv8Var2, jc8Var, qv8Var2, view, z, false);
            g23.b(f23Var);
            return Unit.a;
        } catch (Throwable th) {
            g23.b(f23Var);
            throw th;
        }
    }
}
