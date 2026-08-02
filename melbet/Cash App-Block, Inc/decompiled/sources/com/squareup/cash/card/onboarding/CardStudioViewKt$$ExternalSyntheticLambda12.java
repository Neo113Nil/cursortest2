package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.squareup.cardcustomizations.signature.SavedSignature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SignatureState f$1;
    public final /* synthetic */ StampState f$2;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda12(Function1 function1, SignatureState signatureState, StampState stampState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = signatureState;
        this.f$2 = stampState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final StampState stampState = this.f$2;
        final SignatureState signatureState = this.f$1;
        final Function1 function1 = this.f$0;
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (i) {
            case 0:
                disposableEffectScope.getClass();
                LifecycleRegistry lifecycleRegistry = ProcessLifecycleOwner.newInstance.registry;
                final int i2 = 0;
                DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$CardStudio$3$1$observer$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final void onPause(LifecycleOwner lifecycleOwner) {
                        int i3 = i2;
                        StampState stampState2 = stampState;
                        SignatureState signatureState2 = signatureState;
                        Function1 function12 = function1;
                        switch (i3) {
                            case 0:
                                SavedSignature savedState = signatureState2.getSavedState();
                                function12.invoke(new CardStudioViewEvent.UpdateTempCustomization(TouchdatasKt.createTouchData(savedState, stampState2.getSavedState().a, savedState.width, savedState.height)));
                                break;
                            default:
                                function12.invoke(new CardStudioViewEventV2.UpdateTempCustomization(TouchdatasKt.createLandscapeTouchData$default(signatureState2.getSavedState(), stampState2.getSavedState().a)));
                                break;
                        }
                    }
                };
                lifecycleRegistry.addObserver(defaultLifecycleObserver);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(18, lifecycleRegistry, defaultLifecycleObserver);
            default:
                disposableEffectScope.getClass();
                LifecycleRegistry lifecycleRegistry2 = ProcessLifecycleOwner.newInstance.registry;
                final int i3 = 1;
                DefaultLifecycleObserver defaultLifecycleObserver2 = new DefaultLifecycleObserver() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$CardStudio$3$1$observer$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final void onPause(LifecycleOwner lifecycleOwner) {
                        int i32 = i3;
                        StampState stampState2 = stampState;
                        SignatureState signatureState2 = signatureState;
                        Function1 function12 = function1;
                        switch (i32) {
                            case 0:
                                SavedSignature savedState = signatureState2.getSavedState();
                                function12.invoke(new CardStudioViewEvent.UpdateTempCustomization(TouchdatasKt.createTouchData(savedState, stampState2.getSavedState().a, savedState.width, savedState.height)));
                                break;
                            default:
                                function12.invoke(new CardStudioViewEventV2.UpdateTempCustomization(TouchdatasKt.createLandscapeTouchData$default(signatureState2.getSavedState(), stampState2.getSavedState().a)));
                                break;
                        }
                    }
                };
                lifecycleRegistry2.addObserver(defaultLifecycleObserver2);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(19, lifecycleRegistry2, defaultLifecycleObserver2);
        }
    }
}
