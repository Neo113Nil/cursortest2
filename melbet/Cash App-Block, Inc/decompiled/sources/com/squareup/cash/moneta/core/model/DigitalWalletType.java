package com.squareup.cash.moneta.core.model;

import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum DigitalWalletType implements WireEnum {
    APPLE_PAY(0),
    GOOGLE_PAY(1);

    public static final DigitalWalletType$Companion$ADAPTER$1 ADAPTER;
    public static final zzd Companion;
    public final int value;

    static {
        DigitalWalletType digitalWalletType = APPLE_PAY;
        Companion = new zzd(29);
        ADAPTER = new DigitalWalletType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DigitalWalletType.class), Syntax.PROTO_2, digitalWalletType);
    }

    DigitalWalletType(int i) {
        this.value = i;
    }

    public static final DigitalWalletType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return APPLE_PAY;
        }
        if (i != 1) {
            return null;
        }
        return GOOGLE_PAY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
