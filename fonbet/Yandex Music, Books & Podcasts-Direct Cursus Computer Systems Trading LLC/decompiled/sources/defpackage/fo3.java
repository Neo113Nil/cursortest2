package defpackage;

/* loaded from: classes.dex */
public final class fo3 implements do3 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.do3
    public final boolean a(llo lloVar) {
        switch (this.a) {
            case 0:
                if (!(lloVar instanceof jlo) || ((jlo) lloVar).a().size() == 0) {
                }
                break;
            case 1:
                if (lloVar.b == null) {
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
