package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class okr {
    public static final /* synthetic */ okr[] a = {new okr("SBP", 0), new okr("NEW_SBP_TOKEN", 1), new okr("SBP_TOKEN", 2), new okr("NEW_CARD_LIGHT", 3), new okr("NEW_CARD_DARK", 4), new okr("ADD_CARD", 5), new okr("YANDEX_BANK", 6), new okr("CARD", 7), new okr("GOOGLE", 8), new okr("CASH", 9), new okr("SPLIT", 10), new okr("CHALLENGE_POLLING", 11)};

    /* JADX INFO: Fake field, exist only in values array */
    okr EF5;

    public static okr valueOf(String str) {
        return (okr) Enum.valueOf(okr.class, str);
    }

    public static okr[] values() {
        return (okr[]) a.clone();
    }
}
