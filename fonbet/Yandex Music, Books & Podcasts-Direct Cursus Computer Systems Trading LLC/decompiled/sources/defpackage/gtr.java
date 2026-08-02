package defpackage;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 gtr, still in use, count: 1, list:
  (r7v3 gtr) from 0x0077: FILLED_NEW_ARRAY (r0v0 gtr), (r1v1 gtr), (r9v3 gtr), (r7v3 gtr) A[WRAPPED] (LINE:120) elemType: gtr
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class gtr {
    /* JADX INFO: Fake field, exist only in values array */
    ENGLISH("en"),
    RUSSIAN("ru"),
    /* JADX INFO: Fake field, exist only in values array */
    TURKISH("tr"),
    /* JADX INFO: Fake field, exist only in values array */
    UKRAINIAN("uk"),
    /* JADX INFO: Fake field, exist only in values array */
    AZERBAIJANI("az"),
    /* JADX INFO: Fake field, exist only in values array */
    HEBREW("he"),
    /* JADX INFO: Fake field, exist only in values array */
    ARMENIAN("hy"),
    /* JADX INFO: Fake field, exist only in values array */
    KAZAKH("kk"),
    /* JADX INFO: Fake field, exist only in values array */
    ARABIAN("ar"),
    /* JADX INFO: Fake field, exist only in values array */
    UZBEK("uz");

    public static final euk b;
    public static final List c;
    public static final gtr d;
    public static final List e;
    public final String a;

    static {
        gtr gtrVar = ENGLISH;
        gtr gtrVar2 = RUSSIAN;
        b = new euk();
        c = u75.h(gtrVar, gtrVar2, r9, r7);
        u75.h(gtrVar, r8);
        d = gtrVar;
        e = t75.c("be");
    }

    public gtr(String str) {
        this.a = str;
    }

    public static gtr valueOf(String str) {
        return (gtr) Enum.valueOf(gtr.class, str);
    }

    public static gtr[] values() {
        return (gtr[]) g.clone();
    }
}
