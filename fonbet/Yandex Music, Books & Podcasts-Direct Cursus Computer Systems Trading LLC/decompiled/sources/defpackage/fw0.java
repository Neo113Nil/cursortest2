package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class fw0 implements v7o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public fw0(gw0 gw0Var, un4 un4Var) {
        this.a = 0;
        this.b = gw0Var;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        switch (this.a) {
            case 0:
                ((gw0) this.b).m = false;
                break;
            case 1:
                ((ew0) ((ew0) ((fw0) this.b).b).c).onError(veb.a(r0.a, new zeb("ERROR_CONNECT_FAILED").a(), vebVar.toString()));
                break;
            case 2:
                ((ew0) ((ew0) this.b).c).onError(veb.a(r0.a, new zeb("ERROR_HOST_UNREACHABLE").a(), vebVar.toString()));
                break;
            case 3:
                break;
            default:
                ((k4h) this.b).b = false;
                break;
        }
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                gw0 gw0Var = (gw0) this.b;
                gw0Var.m = false;
                synchronized (gw0Var.n) {
                    try {
                        if (((gw0) this.b).n.booleanValue()) {
                            ((gw0) this.b).e(null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((ew0) ((ew0) ((fw0) this.b).b).c).onSuccess((un4) obj);
                return;
            case 2:
                gw0 gw0Var2 = (gw0) ((ew0) this.b).b;
                gw0Var2.a = (vjp) obj;
                Uri g = gw0Var2.g();
                gw0.h(g);
                gw0Var2.c(g, new fw0(1, this));
                return;
            case 3:
                ((g4h) ((pv7) this.b).b).a.a((vjp) obj);
                return;
            default:
                ((k4h) this.b).a = false;
                jjo.b(new pv7(25, this, (vjp) obj));
                return;
        }
    }

    public /* synthetic */ fw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(veb vebVar) {
    }
}
