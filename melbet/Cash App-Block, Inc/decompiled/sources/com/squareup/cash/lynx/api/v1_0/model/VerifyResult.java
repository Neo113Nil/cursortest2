package com.squareup.cash.lynx.api.v1_0.model;

import com.google.mlkit.vision.text.zza;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum VerifyResult implements WireEnum {
    UNSPECIFIED(0),
    VERIFY_SUCCESSFUL(1),
    VERIFY_FAILED(2),
    THREEDS_AUTHENTICATION_REQUIRED(3),
    NOT_VERIFIABLE(4),
    INVALID_ARGUMENT(5),
    INVALID_POSTAL_CODE_FOR_COUNTRY(6);

    public static final VerifyResult$Companion$ADAPTER$1 ADAPTER;
    public static final zza Companion;
    public final int value;

    static {
        VerifyResult verifyResult = UNSPECIFIED;
        Companion = new zza(28);
        ADAPTER = new VerifyResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerifyResult.class), Syntax.PROTO_2, verifyResult);
    }

    VerifyResult(int i) {
        this.value = i;
    }

    public static final VerifyResult fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return VERIFY_SUCCESSFUL;
            case 2:
                return VERIFY_FAILED;
            case 3:
                return THREEDS_AUTHENTICATION_REQUIRED;
            case 4:
                return NOT_VERIFIABLE;
            case 5:
                return INVALID_ARGUMENT;
            case 6:
                return INVALID_POSTAL_CODE_FOR_COUNTRY;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
