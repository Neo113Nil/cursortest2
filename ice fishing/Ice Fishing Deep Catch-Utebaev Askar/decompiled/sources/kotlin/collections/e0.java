package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 'entries'  kotlin.collections.e0[], still in use, count: 2, list:
  (r0v1 'entries' kotlin.collections.e0[]) from 0x0030: INVOKE (r0v1 'entries' kotlin.collections.e0[]), ("entries") STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNullParameter(java.lang.Object, java.lang.String):void A[MD:(java.lang.Object, java.lang.String):void (m)]
  (r0v1 'entries' kotlin.collections.e0[]) from 0x0035: CONSTRUCTOR (r1v3 g.a) = (r0v1 'entries' kotlin.collections.e0[]) A[MD:(java.lang.Enum[]):void (m)] call: g.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e0 {
    Ready,
    NotReady,
    Done,
    Failed;

    static {
        Intrinsics.checkNotNullParameter(entries, "entries");
        new g.a(entries);
    }

    public e0() {
        super(str, i);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f168e.clone();
    }
}
