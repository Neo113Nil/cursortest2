package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.squareup.cash.graphics.swampgl.Engine;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class WandEffectKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Engine f$0;
    public final /* synthetic */ Engine f$1;

    public /* synthetic */ WandEffectKt$$ExternalSyntheticLambda2(Engine engine, Engine engine2, int i) {
        this.$r8$classId = i;
        this.f$0 = engine;
        this.f$1 = engine2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (this.$r8$classId) {
            case 0:
                disposableEffectScope.getClass();
                final int i = 0;
                final Engine engine = this.f$0;
                final Engine engine2 = this.f$1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect_37dI38Q$lambda$4$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        switch (i) {
                            case 0:
                                if (engine == null) {
                                    engine2.shutdown();
                                    break;
                                }
                                break;
                            case 1:
                                if (engine == null) {
                                    engine2.shutdown();
                                    break;
                                }
                                break;
                            default:
                                if (engine == null) {
                                    engine2.shutdown();
                                    break;
                                }
                                break;
                        }
                    }
                };
            case 1:
                disposableEffectScope.getClass();
                final int i2 = 1;
                final Engine engine3 = this.f$0;
                final Engine engine4 = this.f$1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect_37dI38Q$lambda$4$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        switch (i2) {
                            case 0:
                                if (engine3 == null) {
                                    engine4.shutdown();
                                    break;
                                }
                                break;
                            case 1:
                                if (engine3 == null) {
                                    engine4.shutdown();
                                    break;
                                }
                                break;
                            default:
                                if (engine3 == null) {
                                    engine4.shutdown();
                                    break;
                                }
                                break;
                        }
                    }
                };
            default:
                disposableEffectScope.getClass();
                final int i3 = 2;
                final Engine engine5 = this.f$0;
                final Engine engine6 = this.f$1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect_37dI38Q$lambda$4$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        switch (i3) {
                            case 0:
                                if (engine5 == null) {
                                    engine6.shutdown();
                                    break;
                                }
                                break;
                            case 1:
                                if (engine5 == null) {
                                    engine6.shutdown();
                                    break;
                                }
                                break;
                            default:
                                if (engine5 == null) {
                                    engine6.shutdown();
                                    break;
                                }
                                break;
                        }
                    }
                };
        }
    }
}
