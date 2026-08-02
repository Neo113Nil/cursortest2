package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.google.mlkit.vision.text.zza;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public enum Prominence implements WireEnum {
    UNSPECIFIED(0),
    PROMINENT(1),
    STANDARD(2),
    SUBTLE(3);

    public static final Prominence$Companion$ADAPTER$1 ADAPTER;
    public static final zza Companion;
    public final int value;

    static {
        Prominence prominence = UNSPECIFIED;
        Companion = new zza(16);
        ADAPTER = new Prominence$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Prominence.class), Syntax.PROTO_2, prominence);
    }

    Prominence(int i) {
        this.value = i;
    }

    public static final Prominence fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return PROMINENT;
        }
        if (i == 2) {
            return STANDARD;
        }
        if (i != 3) {
            return null;
        }
        return SUBTLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
