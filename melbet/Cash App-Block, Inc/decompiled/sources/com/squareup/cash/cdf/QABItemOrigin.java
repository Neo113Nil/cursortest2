package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class QABItemOrigin {
    public static final /* synthetic */ QABItemOrigin[] $VALUES;
    public static final QABItemOrigin ACTIVITY;
    public static final QABItemOrigin GLOBAL_SEARCH;

    static {
        QABItemOrigin qABItemOrigin = new QABItemOrigin("ACTIVITY", 0);
        ACTIVITY = qABItemOrigin;
        QABItemOrigin qABItemOrigin2 = new QABItemOrigin("GLOBAL_SEARCH", 1);
        GLOBAL_SEARCH = qABItemOrigin2;
        $VALUES = new QABItemOrigin[]{qABItemOrigin, qABItemOrigin2};
    }

    public static QABItemOrigin valueOf(String str) {
        return (QABItemOrigin) Enum.valueOf(QABItemOrigin.class, str);
    }

    public static QABItemOrigin[] values() {
        return (QABItemOrigin[]) $VALUES.clone();
    }
}
