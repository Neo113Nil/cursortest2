package com.squareup.cash.common.moneyformatter.currency;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ISOTextCode {
    public static final /* synthetic */ ISOTextCode[] $VALUES;
    public static final ISOTextCode AUD;
    public static final ISOTextCode BTC;
    public static final ISOTextCode CAD;
    public static final ISOTextCode EUR;
    public static final ISOTextCode GBP;
    public static final ISOTextCode JPY;
    public static final ISOTextCode MXN;
    public static final ISOTextCode USD;
    public static final ISOTextCode XTS;
    public static final ISOTextCode XXX;

    static {
        ISOTextCode iSOTextCode = new ISOTextCode("AUD", 0);
        AUD = iSOTextCode;
        ISOTextCode iSOTextCode2 = new ISOTextCode("BTC", 1);
        BTC = iSOTextCode2;
        ISOTextCode iSOTextCode3 = new ISOTextCode("CAD", 2);
        CAD = iSOTextCode3;
        ISOTextCode iSOTextCode4 = new ISOTextCode("EUR", 3);
        EUR = iSOTextCode4;
        ISOTextCode iSOTextCode5 = new ISOTextCode("GBP", 4);
        GBP = iSOTextCode5;
        ISOTextCode iSOTextCode6 = new ISOTextCode("JPY", 5);
        JPY = iSOTextCode6;
        ISOTextCode iSOTextCode7 = new ISOTextCode("MXN", 6);
        MXN = iSOTextCode7;
        ISOTextCode iSOTextCode8 = new ISOTextCode("USD", 7);
        USD = iSOTextCode8;
        ISOTextCode iSOTextCode9 = new ISOTextCode("XTS", 8);
        XTS = iSOTextCode9;
        ISOTextCode iSOTextCode10 = new ISOTextCode("XUS", 9);
        ISOTextCode iSOTextCode11 = new ISOTextCode("XXX", 10);
        XXX = iSOTextCode11;
        $VALUES = new ISOTextCode[]{iSOTextCode, iSOTextCode2, iSOTextCode3, iSOTextCode4, iSOTextCode5, iSOTextCode6, iSOTextCode7, iSOTextCode8, iSOTextCode9, iSOTextCode10, iSOTextCode11};
    }

    public static ISOTextCode valueOf(String str) {
        return (ISOTextCode) Enum.valueOf(ISOTextCode.class, str);
    }

    public static ISOTextCode[] values() {
        return (ISOTextCode[]) $VALUES.clone();
    }
}
