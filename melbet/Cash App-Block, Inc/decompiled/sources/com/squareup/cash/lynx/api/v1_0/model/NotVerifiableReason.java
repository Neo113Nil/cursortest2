package com.squareup.cash.lynx.api.v1_0.model;

import com.google.mlkit.vision.text.zzc;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum NotVerifiableReason implements WireEnum {
    UNSPECIFIED_REASON(0),
    INSTRUMENT_INELIGIBLE(1),
    INSTRUMENT_INACTIVE(2),
    INSTRUMENT_UNLINKED(3),
    CARD_FUNDING_TYPE_NOT_ENABLED_FOR_SUB_REGION(4),
    RESIDENTIAL_ADDRESS_MISSING(5);

    public static final NotVerifiableReason$Companion$ADAPTER$1 ADAPTER;
    public static final zzc Companion;
    public final int value;

    static {
        NotVerifiableReason notVerifiableReason = UNSPECIFIED_REASON;
        Companion = new zzc(27);
        ADAPTER = new NotVerifiableReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotVerifiableReason.class), Syntax.PROTO_2, notVerifiableReason);
    }

    NotVerifiableReason(int i) {
        this.value = i;
    }

    public static final NotVerifiableReason fromValue(int i) {
        Companion.getClass();
        return zzc.m2069fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
