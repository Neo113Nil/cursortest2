package com.gamericefishpro.space.mi;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.gamericefishpro.space.mi.f[], still in use, count: 1, list:
  (r0v1 com.gamericefishpro.space.mi.f[]) from 0x0060: INVOKE (r0v1 com.gamericefishpro.space.mi.f[]) STATIC call: com.gamericefishpro.space.i9.a4.t(java.lang.Enum[]):com.gamericefishpro.space.wh.b A[MD:(java.lang.Enum[]):com.gamericefishpro.space.wh.b (m)] (LINE:97)
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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    IGNORE_CASE(2, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128, 0, 2, null);

    public final int d;

    static {
        a4.t(fVarArr);
    }

    public f(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i);
        this.d = i2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) i.clone();
    }
}
