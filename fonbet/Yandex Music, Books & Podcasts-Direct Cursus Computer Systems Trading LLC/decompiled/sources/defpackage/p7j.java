package defpackage;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class p7j implements ps3 {
    public final /* synthetic */ int a;

    @Override // defpackage.ps3
    public final void a(es3 es3Var, l3o l3oVar) {
        int i = this.a;
        es3Var.getClass();
        l3oVar.getClass();
        switch (i) {
            case 0:
                break;
            default:
                o3o o3oVar = l3oVar.g;
                if (o3oVar != null) {
                    o3oVar.close();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        int i = this.a;
        es3Var.getClass();
    }
}
