package defpackage;

/* loaded from: classes5.dex */
public abstract class mi0 {
    public static final gsd a;

    static {
        try {
            gsd gsdVar = li0.a;
            if (gsdVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = gsdVar;
        } catch (Throwable th) {
            throw aob.a(th);
        }
    }
}
