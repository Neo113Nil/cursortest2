package com.squareup.cash.mosaic.resources.api.v1;

import com.squareup.cash.mosaic.resources.api.v1.StickerResource;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class StickerResource$StickerEffect$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StickerResource.StickerEffect.Companion.getClass();
        if (i == 0) {
            return StickerResource.StickerEffect.STICKER_EFFECT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return StickerResource.StickerEffect.STICKER_EFFECT_GLITTER;
    }
}
