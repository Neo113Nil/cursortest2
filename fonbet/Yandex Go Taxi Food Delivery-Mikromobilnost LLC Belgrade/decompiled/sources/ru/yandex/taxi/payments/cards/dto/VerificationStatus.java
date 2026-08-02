package ru.yandex.taxi.payments.cards.dto;

import defpackage.b931;
import defpackage.c931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/payments/cards/dto/VerificationStatus;", "", "Companion", "c931", "CREATED", "IN_PROGRESS", "SUCCESS", "FAILURE", "REQUIRED_3DS", "RECEIVED_3DS_STATUS", "AMOUNT_EXPECTED", "CVN_EXPECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerificationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerificationStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final VerificationStatus AMOUNT_EXPECTED;
    public static final VerificationStatus CREATED;
    public static final VerificationStatus CVN_EXPECTED;
    public static final c931 Companion;
    public static final VerificationStatus FAILURE;
    public static final VerificationStatus IN_PROGRESS;
    public static final VerificationStatus RECEIVED_3DS_STATUS;
    public static final VerificationStatus REQUIRED_3DS;
    public static final VerificationStatus SUCCESS;

    static {
        VerificationStatus verificationStatus = new VerificationStatus("CREATED", 0);
        CREATED = verificationStatus;
        VerificationStatus verificationStatus2 = new VerificationStatus("IN_PROGRESS", 1);
        IN_PROGRESS = verificationStatus2;
        VerificationStatus verificationStatus3 = new VerificationStatus("SUCCESS", 2);
        SUCCESS = verificationStatus3;
        VerificationStatus verificationStatus4 = new VerificationStatus("FAILURE", 3);
        FAILURE = verificationStatus4;
        VerificationStatus verificationStatus5 = new VerificationStatus("REQUIRED_3DS", 4);
        REQUIRED_3DS = verificationStatus5;
        VerificationStatus verificationStatus6 = new VerificationStatus("RECEIVED_3DS_STATUS", 5);
        RECEIVED_3DS_STATUS = verificationStatus6;
        VerificationStatus verificationStatus7 = new VerificationStatus("AMOUNT_EXPECTED", 6);
        AMOUNT_EXPECTED = verificationStatus7;
        VerificationStatus verificationStatus8 = new VerificationStatus("CVN_EXPECTED", 7);
        CVN_EXPECTED = verificationStatus8;
        VerificationStatus[] verificationStatusArr = {verificationStatus, verificationStatus2, verificationStatus3, verificationStatus4, verificationStatus5, verificationStatus6, verificationStatus7, verificationStatus8};
        $VALUES = verificationStatusArr;
        $ENTRIES = a.a(verificationStatusArr);
        Companion = new c931();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(0));
    }

    public static VerificationStatus valueOf(String str) {
        return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
    }

    public static VerificationStatus[] values() {
        return (VerificationStatus[]) $VALUES.clone();
    }
}
