package com.gamericefishpro.space.i7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.gamericefishpro.space.i7.d[], still in use, count: 1, list:
  (r0v1 com.gamericefishpro.space.i7.d[]) from 0x0039: INVOKE (r0v1 com.gamericefishpro.space.i7.d[]) STATIC call: com.gamericefishpro.space.i9.a4.t(java.lang.Enum[]):com.gamericefishpro.space.wh.b A[MD:(java.lang.Enum[]):com.gamericefishpro.space.wh.b (m)] (LINE:58)
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
public final class d {
    CRIMSON_BOMB(R.drawable.crimson_bonus_item, "Bomb", 60),
    ICE_BLAST(R.drawable.ice_bonus_item, "Ice Blast", 80),
    GOLD_STRIKE(R.drawable.golden_bonus_item, "Gold Strike", 80);

    public final int d;
    public final String e;
    public final int i;

    static {
        a4.t(dVarArr);
    }

    public d(int i, String str, int i2) {
        super(str, i);
        this.d = i;
        this.e = str;
        this.i = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) z.clone();
    }
}
