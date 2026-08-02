package defpackage;

/* loaded from: classes5.dex */
public class r7w extends RuntimeException {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7w(String str, Throwable th) {
        super(str, th);
        str.getClass();
        this.a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a;
    }
}
