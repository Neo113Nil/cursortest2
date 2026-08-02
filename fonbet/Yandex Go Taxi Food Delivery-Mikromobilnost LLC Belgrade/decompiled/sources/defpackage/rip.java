package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class rip implements v7p {
    public final /* synthetic */ int a;
    public final wj0 b;

    public /* synthetic */ rip(Object obj, wj0 wj0Var, int i) {
        this.a = i;
        this.b = wj0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wj0 wj0Var = this.b;
        switch (i) {
            case 0:
                w3i w3iVar = (w3i) wj0Var.get();
                return new vj0((ah00) w3iVar.b, (xm00) w3iVar.c, (Context) w3iVar.w, (yj0) w3iVar.x, (yvf0) w3iVar.y, (ze0) w3iVar.z, (uqx) w3iVar.A, (oep0) w3iVar.B);
            default:
                w3i w3iVar2 = (w3i) wj0Var.get();
                return new vj0((ah00) w3iVar2.b, (xm00) w3iVar2.c, (Context) w3iVar2.w, (yj0) w3iVar2.x, (yvf0) w3iVar2.y, (ze0) w3iVar2.z, (uqx) w3iVar2.A, (oep0) w3iVar2.B);
        }
    }
}
