package yads;

import com.samsung.android.sdk.samsungpay.v2.card.Card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ja2 {
    public static final ja2 b;
    public static final ja2 c;
    public static final ja2 d;
    public static final /* synthetic */ ja2[] e;

    static {
        ja2 ja2Var = new ja2("INVALIDATED", 0);
        b = ja2Var;
        ja2 ja2Var2 = new ja2(Card.ACTIVE, 1);
        c = ja2Var2;
        ja2 ja2Var3 = new ja2("PAUSED", 2);
        d = ja2Var3;
        e = new ja2[]{ja2Var, ja2Var2, ja2Var3};
    }

    public static ja2 valueOf(String str) {
        return (ja2) Enum.valueOf(ja2.class, str);
    }

    public static ja2[] values() {
        return (ja2[]) e.clone();
    }
}
