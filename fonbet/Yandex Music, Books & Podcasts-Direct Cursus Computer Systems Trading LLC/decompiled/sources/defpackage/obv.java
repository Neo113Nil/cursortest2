package defpackage;

/* loaded from: classes3.dex */
public final class obv extends RuntimeException {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obv(String str, String str2) {
        super(str2 + " : " + str);
        str.getClass();
        str2.getClass();
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
