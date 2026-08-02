package defpackage;

/* loaded from: classes5.dex */
public abstract class i3f {
    public static final js3 a = new js3("COMPLETING_ALREADY", 2);
    public static final js3 b = new js3("COMPLETING_WAITING_CHILDREN", 2);
    public static final js3 c = new js3("COMPLETING_RETRY", 2);
    public static final js3 d = new js3("TOO_LATE_TO_CANCEL", 2);
    public static final js3 e = new js3("SEALED", 2);
    public static final l4b f = new l4b(false);
    public static final l4b g = new l4b(true);

    public static final Object a(Object obj) {
        iie iieVar;
        lie lieVar = obj instanceof lie ? (lie) obj : null;
        return (lieVar == null || (iieVar = lieVar.a) == null) ? obj : iieVar;
    }
}
