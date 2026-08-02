package com.squareup.cash.lynx.api.v1_0.model;

import com.google.mlkit.vision.text.zzb;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum CvcResultCode implements WireEnum {
    UNKNOWN_CVC_RESULT(0),
    CVC_MATCH(1),
    CVC_NO_MATCH(2),
    CVC_SKIPPED(3),
    CVC_UNAVAILABLE(4);

    public static final CvcResultCode$Companion$ADAPTER$1 ADAPTER;
    public static final zzb Companion;
    public final int value;

    static {
        CvcResultCode cvcResultCode = UNKNOWN_CVC_RESULT;
        Companion = new zzb(27);
        ADAPTER = new CvcResultCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CvcResultCode.class), Syntax.PROTO_2, cvcResultCode);
    }

    CvcResultCode(int i) {
        this.value = i;
    }

    public static final CvcResultCode fromValue(int i) {
        Companion.getClass();
        return zzb.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
