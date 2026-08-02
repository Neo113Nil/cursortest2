package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class InstrumentLinkFlowEntryPoint {
    public static final /* synthetic */ InstrumentLinkFlowEntryPoint[] $VALUES;
    public static final InstrumentLinkFlowEntryPoint EXCHANGE_CURRENCY;
    public static final InstrumentLinkFlowEntryPoint EXCHANGE_EQUITY;
    public static final InstrumentLinkFlowEntryPoint ONBOARDING;
    public static final InstrumentLinkFlowEntryPoint PAYMENT;
    public static final InstrumentLinkFlowEntryPoint PROFILE;
    public static final InstrumentLinkFlowEntryPoint TRANSFER_FUNDS;

    static {
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = new InstrumentLinkFlowEntryPoint("ONBOARDING", 0);
        ONBOARDING = instrumentLinkFlowEntryPoint;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint2 = new InstrumentLinkFlowEntryPoint("PROFILE", 1);
        PROFILE = instrumentLinkFlowEntryPoint2;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint3 = new InstrumentLinkFlowEntryPoint("PAYMENT", 2);
        PAYMENT = instrumentLinkFlowEntryPoint3;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint4 = new InstrumentLinkFlowEntryPoint("TRANSFER_FUNDS", 3);
        TRANSFER_FUNDS = instrumentLinkFlowEntryPoint4;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint5 = new InstrumentLinkFlowEntryPoint("EXCHANGE_CURRENCY", 4);
        EXCHANGE_CURRENCY = instrumentLinkFlowEntryPoint5;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint6 = new InstrumentLinkFlowEntryPoint("EXCHANGE_EQUITY", 5);
        EXCHANGE_EQUITY = instrumentLinkFlowEntryPoint6;
        $VALUES = new InstrumentLinkFlowEntryPoint[]{instrumentLinkFlowEntryPoint, instrumentLinkFlowEntryPoint2, instrumentLinkFlowEntryPoint3, instrumentLinkFlowEntryPoint4, instrumentLinkFlowEntryPoint5, instrumentLinkFlowEntryPoint6};
    }

    public static InstrumentLinkFlowEntryPoint valueOf(String str) {
        return (InstrumentLinkFlowEntryPoint) Enum.valueOf(InstrumentLinkFlowEntryPoint.class, str);
    }

    public static InstrumentLinkFlowEntryPoint[] values() {
        return (InstrumentLinkFlowEntryPoint[]) $VALUES.clone();
    }
}
