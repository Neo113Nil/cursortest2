package com.squareup.cash.common.composeui.animations;

import com.squareup.cash.R;

/* loaded from: classes8.dex */
public enum IntroPhase {
    WAND(R.drawable.hype_wand),
    HEART(R.drawable.hype_heart),
    CARD(R.drawable.hype_card),
    COMPLETE(0);

    public final int drawableId;

    IntroPhase(int i) {
        this.drawableId = i;
    }
}
