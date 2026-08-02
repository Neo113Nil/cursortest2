package com.squareup.cash.mosaic.resources.api.v1;

import com.squareup.cash.mosaic.resources.api.v1.BackgroundResource;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class BackgroundResource$BackgroundEffect$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BackgroundResource.BackgroundEffect.Companion.getClass();
        if (i == 0) {
            return BackgroundResource.BackgroundEffect.BACKGROUND_EFFECT_UNSPECIFIED;
        }
        if (i == 1) {
            return BackgroundResource.BackgroundEffect.BACKGROUND_EFFECT_GLITTER;
        }
        if (i != 2) {
            return null;
        }
        return BackgroundResource.BackgroundEffect.BACKGROUND_EFFECT_TORTOISE;
    }
}
