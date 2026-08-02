package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class cd implements s9 {
    public final ta a;
    public final r7 b;
    public final m9 c;
    public final ue d;
    public final x3 e;
    public final e2 f;
    public final a7 g;

    public cd(ta taVar, r7 r7Var, m9 m9Var, ue ueVar, x3 x3Var, e2 e2Var, a7 a7Var) {
        taVar.getClass();
        r7Var.getClass();
        m9Var.getClass();
        ueVar.getClass();
        x3Var.getClass();
        e2Var.getClass();
        a7Var.getClass();
        this.a = taVar;
        this.b = r7Var;
        this.c = m9Var;
        this.d = ueVar;
        this.e = x3Var;
        this.f = e2Var;
        this.g = a7Var;
    }

    @Override // bo.app.s9
    public final void a(id idVar, dd ddVar) {
        idVar.getClass();
        ddVar.getClass();
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new bd(this, idVar, ddVar, null), 3);
    }
}
