package com.squareup.cash.mosaic.resources.api.v2;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum FontStyle implements WireEnum {
    FONT_STYLE_UNSPECIFIED(0),
    FONT_STYLE_NORMAL(1),
    FONT_STYLE_ITALIC(2),
    FONT_STYLE_OBLIQUE(3);

    public static final FontStyle$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        FontStyle fontStyle = FONT_STYLE_UNSPECIFIED;
        Companion = new Error.Code.Companion(5);
        ADAPTER = new FontStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FontStyle.class), Syntax.PROTO_2, fontStyle);
    }

    FontStyle(int i) {
        this.value = i;
    }

    public static final FontStyle fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return FONT_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return FONT_STYLE_NORMAL;
        }
        if (i == 2) {
            return FONT_STYLE_ITALIC;
        }
        if (i != 3) {
            return null;
        }
        return FONT_STYLE_OBLIQUE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
