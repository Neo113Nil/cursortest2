package defpackage;

/* loaded from: classes10.dex */
public final class s97 implements q97 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q97
    public final boolean a(yml0 yml0Var) {
        switch (this.a) {
            case 0:
                if ((yml0Var instanceof wml0) && ((wml0) yml0Var).getChildren().size() != 0) {
                    break;
                }
                break;
            case 1:
                if (yml0Var.b != null) {
                    break;
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
