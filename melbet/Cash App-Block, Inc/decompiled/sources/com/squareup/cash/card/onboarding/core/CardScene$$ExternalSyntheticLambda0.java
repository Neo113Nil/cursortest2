package com.squareup.cash.card.onboarding.core;

import android.graphics.BitmapFactory;
import com.squareup.cash.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardScene$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardScene f$0;

    public /* synthetic */ CardScene$$ExternalSyntheticLambda0(CardScene cardScene, int i) {
        this.$r8$classId = i;
        this.f$0 = cardScene;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardScene cardScene = this.f$0;
        switch (i) {
            case 0:
                cardScene.markDirty();
                return Unit.INSTANCE;
            default:
                return BitmapFactory.decodeResource(cardScene.context.getResources(), R.drawable.card_mood_hand_heat_map);
        }
    }
}
