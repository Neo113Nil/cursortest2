package defpackage;

/* loaded from: classes3.dex */
public final class jln extends IllegalArgumentException {
    public final String a;

    public jln(Class cls) {
        this.a = cls + " is unsupported by complex rebind";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
