package com.squareup.cash.lynx.api.v1_0.model.link;

import com.google.mlkit.vision.text.zzb;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum LinkedReason implements WireEnum {
    UNKNOWN_REASON(0),
    LINK(1),
    REPLACE(2),
    RTAU(3),
    NETWORK_TOKEN_UPDATE(4),
    ASYNC_ACCOUNT_UPDATE(5);

    public static final LinkedReason$Companion$ADAPTER$1 ADAPTER;
    public static final zzb Companion;
    public final int value;

    static {
        LinkedReason linkedReason = UNKNOWN_REASON;
        Companion = new zzb(28);
        ADAPTER = new LinkedReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LinkedReason.class), Syntax.PROTO_2, linkedReason);
    }

    LinkedReason(int i) {
        this.value = i;
    }

    public static final LinkedReason fromValue(int i) {
        Companion.getClass();
        return zzb.m2066fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
