package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class th60 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vh60 b;

    public /* synthetic */ th60(vh60 vh60Var) {
        this.b = vh60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vh60 vh60Var = this.b;
        switch (i) {
            case 0:
                e5g0 e5g0Var = vh60Var.f;
                nci0 nci0Var = e5g0Var.h;
                if (nci0Var != null) {
                    nci0Var.cancel();
                }
                e5g0Var.h = null;
                break;
            default:
                vh60Var.d.b("wm_push_set_token_complete");
                vh60Var.j = true;
                break;
        }
    }

    public /* synthetic */ th60(vh60 vh60Var, au50 au50Var) {
        this.b = vh60Var;
    }
}
