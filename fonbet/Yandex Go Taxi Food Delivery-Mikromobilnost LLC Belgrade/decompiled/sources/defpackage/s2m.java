package defpackage;

/* loaded from: classes.dex */
public final class s2m implements r2m {
    public final qeu a;

    public s2m(qeu qeuVar) {
        this.a = qeuVar;
    }

    @Override // defpackage.r2m
    public final void handleDocumentParseError(u1m u1mVar, String str, Throwable th) {
        this.a.r(u1mVar, th);
    }

    @Override // defpackage.r2m
    public final void handleDocumentRequestError(u1m u1mVar, String str, Throwable th, Integer num) {
        this.a.k(u1mVar, th);
    }
}
