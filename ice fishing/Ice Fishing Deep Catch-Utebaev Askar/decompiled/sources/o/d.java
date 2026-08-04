package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 'entries'  o.d[], still in use, count: 2, list:
  (r0v1 'entries' o.d[]) from 0x0020: INVOKE (r0v1 'entries' o.d[]), ("entries") STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java.lang.Object, java.lang.String):void A[MD:(java.lang.Object, java.lang.String):void (m)]
  (r0v1 'entries' o.d[]) from 0x0025: CONSTRUCTOR (r1v3 g.a) = (r0v1 'entries' o.d[]) A[MD:(java.lang.Enum[]):void (m)] call: g.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    /* JADX INFO: Fake field, exist only in values array */
    INVARIANT,
    /* JADX INFO: Fake field, exist only in values array */
    IN,
    /* JADX INFO: Fake field, exist only in values array */
    OUT;

    static {
        Intrinsics.checkNotNullParameter(entries, "entries");
        new g.a(entries);
    }

    public d() {
        super(str, i);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f221a.clone();
    }
}
