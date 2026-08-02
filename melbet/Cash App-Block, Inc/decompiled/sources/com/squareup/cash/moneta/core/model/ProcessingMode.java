package com.squareup.cash.moneta.core.model;

import com.fillr.e;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum ProcessingMode implements WireEnum {
    SYNCHRONOUS(0),
    ASYNCHRONOUS(1);

    public static final ProcessingMode$Companion$ADAPTER$1 ADAPTER;
    public static final e Companion;
    public final int value;

    static {
        ProcessingMode processingMode = SYNCHRONOUS;
        Companion = new e();
        ADAPTER = new ProcessingMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProcessingMode.class), Syntax.PROTO_2, processingMode);
    }

    ProcessingMode(int i) {
        this.value = i;
    }

    public static final ProcessingMode fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SYNCHRONOUS;
        }
        if (i != 1) {
            return null;
        }
        return ASYNCHRONOUS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
