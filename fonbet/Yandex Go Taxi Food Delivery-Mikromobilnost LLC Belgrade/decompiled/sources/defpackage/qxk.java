package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class qxk implements eg90 {
    public final /* synthetic */ int c;

    private final void c(Exception exc) {
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        switch (this.c) {
            case 0:
                sv90 sv90Var = qv90.a;
                String message = exc.getMessage();
                if (message == null) {
                    message = exc.toString();
                }
                sv90Var.getClass();
                sv90.n(message).c();
                return;
            case 1:
                throw exc;
            default:
                return;
        }
    }
}
