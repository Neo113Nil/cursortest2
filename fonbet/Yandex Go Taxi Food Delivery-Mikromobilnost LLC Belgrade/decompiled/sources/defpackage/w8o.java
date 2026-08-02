package defpackage;

/* loaded from: classes2.dex */
public interface w8o {
    void a();

    void reportError(String str, String str2, Throwable th);

    default void reportUnhandledException(Throwable th) {
    }
}
