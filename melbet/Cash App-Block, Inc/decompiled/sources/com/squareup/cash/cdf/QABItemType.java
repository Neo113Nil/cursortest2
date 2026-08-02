package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class QABItemType {
    public static final /* synthetic */ QABItemType[] $VALUES;
    public static final QABItemType INVITE_FRIENDS;
    public static final QABItemType MERCHANT;
    public static final QABItemType P2P;

    static {
        QABItemType qABItemType = new QABItemType("INVITE_FRIENDS", 0);
        INVITE_FRIENDS = qABItemType;
        QABItemType qABItemType2 = new QABItemType("MERCHANT", 1);
        MERCHANT = qABItemType2;
        QABItemType qABItemType3 = new QABItemType("P2P", 2);
        P2P = qABItemType3;
        $VALUES = new QABItemType[]{qABItemType, qABItemType2, qABItemType3};
    }

    public static QABItemType valueOf(String str) {
        return (QABItemType) Enum.valueOf(QABItemType.class, str);
    }

    public static QABItemType[] values() {
        return (QABItemType[]) $VALUES.clone();
    }
}
