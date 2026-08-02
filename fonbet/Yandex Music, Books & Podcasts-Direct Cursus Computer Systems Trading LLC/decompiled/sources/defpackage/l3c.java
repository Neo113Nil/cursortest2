package defpackage;

/* loaded from: classes.dex */
public final class l3c extends c3c {
    private static final long serialVersionUID = 1;
    public final g3c a;

    public l3c(g3c g3cVar, String str) {
        super(str);
        this.a = g3cVar;
    }

    @Override // defpackage.c3c, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        g3c g3cVar = this.a;
        sb.append(g3cVar.c);
        sb.append(", facebookErrorCode: ");
        sb.append(g3cVar.d);
        sb.append(", facebookErrorType: ");
        sb.append(g3cVar.f);
        sb.append(", message: ");
        sb.append(g3cVar.d());
        sb.append("}");
        return sb.toString();
    }
}
