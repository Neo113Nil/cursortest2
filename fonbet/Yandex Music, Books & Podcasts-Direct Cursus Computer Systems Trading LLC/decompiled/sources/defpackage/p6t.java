package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p6t {
    public static final /* synthetic */ p6t[] a = {new p6t("PURCHASE", 0), new p6t("CASH_ADVANCE", 1), new p6t("CASHBACK", 2), new p6t("REFUND", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    p6t EF5;

    public static p6t valueOf(String str) {
        return (p6t) Enum.valueOf(p6t.class, str);
    }

    public static p6t[] values() {
        return (p6t[]) a.clone();
    }
}
