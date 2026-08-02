package com.squareup.cash.card.onboarding.core.instancing;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardDesignLibraryScene$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardDesignLibraryScene f$0;

    public /* synthetic */ CardDesignLibraryScene$$ExternalSyntheticLambda0(CardDesignLibraryScene cardDesignLibraryScene, int i) {
        this.$r8$classId = i;
        this.f$0 = cardDesignLibraryScene;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardDesignLibraryScene cardDesignLibraryScene = this.f$0;
        switch (i) {
            case 0:
                cardDesignLibraryScene.wakeAnimationLoop();
                break;
            case 1:
                cardDesignLibraryScene.zoomOut();
                break;
            default:
                cardDesignLibraryScene.zoomIn();
                break;
        }
        return Unit.INSTANCE;
    }
}
