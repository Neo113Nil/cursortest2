package com.squareup.cash.lynx.api.v1_0.model;

import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum AuthResultCode implements WireEnum {
    UNKNOWN_AUTH_RESULT(0),
    SUCCESSFUL_AUTH(1),
    DECLINED_AUTH(2),
    AUTH_ERROR(3);

    public static final AuthResultCode$Companion$ADAPTER$1 ADAPTER;
    public static final zzd Companion;
    public final int value;

    static {
        AuthResultCode authResultCode = UNKNOWN_AUTH_RESULT;
        Companion = new zzd(27);
        ADAPTER = new AuthResultCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AuthResultCode.class), Syntax.PROTO_2, authResultCode);
    }

    AuthResultCode(int i) {
        this.value = i;
    }

    public static final AuthResultCode fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN_AUTH_RESULT;
        }
        if (i == 1) {
            return SUCCESSFUL_AUTH;
        }
        if (i == 2) {
            return DECLINED_AUTH;
        }
        if (i != 3) {
            return null;
        }
        return AUTH_ERROR;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
