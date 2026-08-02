package yads;

import com.samsung.android.sdk.samsungpay.v2.card.Card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ts {
    public static final ts b;
    public static final ts c;
    public static final /* synthetic */ ts[] d;

    static {
        ts tsVar = new ts(Card.ACTIVE, 0);
        b = tsVar;
        ts tsVar2 = new ts("CANCELED", 1);
        c = tsVar2;
        d = new ts[]{tsVar, tsVar2};
    }

    public static ts valueOf(String str) {
        return (ts) Enum.valueOf(ts.class, str);
    }

    public static ts[] values() {
        return (ts[]) d.clone();
    }
}
