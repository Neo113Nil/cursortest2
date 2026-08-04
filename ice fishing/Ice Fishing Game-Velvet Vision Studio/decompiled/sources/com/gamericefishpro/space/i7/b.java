package com.gamericefishpro.space.i7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.gamericefishpro.space.i7.b[], still in use, count: 1, list:
  (r0v1 com.gamericefishpro.space.i7.b[]) from 0x0032: INVOKE (r0v1 com.gamericefishpro.space.i7.b[]) STATIC call: com.gamericefishpro.space.i9.a4.t(java.lang.Enum[]):com.gamericefishpro.space.wh.b A[MD:(java.lang.Enum[]):com.gamericefishpro.space.wh.b (m)] (LINE:51)
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
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    RED_FISH(R.drawable.red_fish),
    /* JADX INFO: Fake field, exist only in values array */
    ORANGE_FISH(R.drawable.orange_fish),
    /* JADX INFO: Fake field, exist only in values array */
    GREEN_FISH(R.drawable.green_fish),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE_FISH(R.drawable.blue_fish);

    public final int d;

    static {
        a4.t(bVarArr);
    }

    public b(int i) {
        super(str, i);
        this.d = i;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
