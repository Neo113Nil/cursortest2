package defpackage;

/* loaded from: classes5.dex */
public abstract class aob {
    public static final znb a = new znb("No further exceptions");

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
