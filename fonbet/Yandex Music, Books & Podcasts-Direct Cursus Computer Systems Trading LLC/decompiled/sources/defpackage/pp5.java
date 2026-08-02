package defpackage;

/* loaded from: classes.dex */
public final class pp5 extends IllegalStateException {
    public final String a;

    public pp5(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
