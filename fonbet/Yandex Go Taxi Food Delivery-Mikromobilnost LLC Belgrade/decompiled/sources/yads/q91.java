package yads;

/* loaded from: classes7.dex */
public final class q91 extends RuntimeException {
    public final String b;
    public final String c;

    public q91(String str) {
        super(str);
        this.b = str;
        this.c = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
