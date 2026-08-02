package defpackage;

/* loaded from: classes.dex */
public final class jmt extends UnsupportedOperationException {
    public final i6c a;

    public jmt(i6c i6cVar) {
        this.a = i6cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
