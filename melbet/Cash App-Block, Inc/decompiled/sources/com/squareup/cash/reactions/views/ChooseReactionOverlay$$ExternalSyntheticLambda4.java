package com.squareup.cash.reactions.views;

import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChooseReactionOverlay$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChooseReactionOverlay f$0;

    public /* synthetic */ ChooseReactionOverlay$$ExternalSyntheticLambda4(ChooseReactionOverlay chooseReactionOverlay, int i) {
        this.$r8$classId = i;
        this.f$0 = chooseReactionOverlay;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ChooseReactionOverlay chooseReactionOverlay = this.f$0;
        switch (i) {
            case 0:
                OverlayLayer.Session session = chooseReactionOverlay.sheetOverlaySession;
                if (session != null) {
                    session.dismiss();
                }
                chooseReactionOverlay.sheetOverlaySession = null;
                break;
            default:
                OverlayLayer.Session session2 = chooseReactionOverlay.sheetOverlaySession;
                if (session2 != null) {
                    session2.dismiss();
                }
                chooseReactionOverlay.sheetOverlaySession = null;
                OverlaysKt.getOverlayLayer(chooseReactionOverlay).onBack();
                break;
        }
        return Unit.INSTANCE;
    }
}
