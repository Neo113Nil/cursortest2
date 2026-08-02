package com.squareup.cash.mosaic.resources.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class FontStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FontStyle.Companion.getClass();
        if (i == 0) {
            return FontStyle.FONT_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return FontStyle.FONT_STYLE_NORMAL;
        }
        if (i == 2) {
            return FontStyle.FONT_STYLE_ITALIC;
        }
        if (i != 3) {
            return null;
        }
        return FontStyle.FONT_STYLE_OBLIQUE;
    }
}
