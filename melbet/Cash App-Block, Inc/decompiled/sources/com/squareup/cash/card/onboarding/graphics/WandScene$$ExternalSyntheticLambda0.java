package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import com.squareup.cash.graphics.swampgl.components.Entity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class WandScene$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WandScene f$0;

    public /* synthetic */ WandScene$$ExternalSyntheticLambda0(WandScene wandScene, int i) {
        this.$r8$classId = i;
        this.f$0 = wandScene;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        WandScene wandScene = this.f$0;
        switch (i) {
            case 0:
                Entity entity = (Entity) obj;
                entity.getClass();
                wandScene.addEntity(entity);
                return Unit.INSTANCE;
            default:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(wandScene, 18);
        }
    }
}
