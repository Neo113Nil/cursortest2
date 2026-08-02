package defpackage;

import core.divkit.state.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class yvl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ yvl(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                j6x j6xVar = aVar.d;
                if (j6xVar != null) {
                    j6xVar.x();
                }
                aVar.d = null;
                break;
            default:
                if (aVar.d == null) {
                    aVar.d = aVar.a.c(new zvl(0, aVar));
                    break;
                }
                break;
        }
    }
}
