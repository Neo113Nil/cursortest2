package com.squareup.cash.overlays;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import com.squareup.cash.cdf.cashcard.CashCardHero3DSwipes;
import com.squareup.cash.cdf.crypto.CryptoLearnComplete;
import com.squareup.cash.cdf.crypto.LearnContentType;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $scope$inlined;
    public final /* synthetic */ Object $session$inlined;
    public final /* synthetic */ Object $visibilityState$inlined;

    public /* synthetic */ OverlayKt$Overlay$lambda$0$1$0$$inlined$onDispose$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$visibilityState$inlined = obj;
        this.$scope$inlined = obj2;
        this.$session$inlined = obj3;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        Continuation continuation = null;
        Object obj = this.$visibilityState$inlined;
        Object obj2 = this.$session$inlined;
        Object obj3 = this.$scope$inlined;
        switch (i) {
            case 0:
                MutableTransitionState mutableTransitionState = (MutableTransitionState) obj;
                mutableTransitionState.setTargetState(Boolean.FALSE);
                JobKt.launch$default((CoroutineScope) obj3, null, null, new OverlayKt$Overlay$1$1$1$1$1((OverlayLayer.Session) obj2, mutableTransitionState, continuation, 0), 3);
                break;
            case 1:
                ((LifecycleOwner) obj).getLifecycle().removeObserver((MenuHostHelper$$ExternalSyntheticLambda0) obj3);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) ((Ref$ObjectRef) obj2).element;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                    break;
                }
                break;
            case 2:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                ((DialogNavigator) obj).getState().markTransitionComplete(navBackStackEntry);
                ((SnapshotStateList) obj2).remove(navBackStackEntry);
                break;
            case 3:
                EducationStoryPresenter educationStoryPresenter = (EducationStoryPresenter) obj;
                Analytics analytics = educationStoryPresenter.analytics;
                Integer valueOf = Integer.valueOf(((ParcelableSnapshotMutableIntState) obj2).getIntValue());
                CryptoLearnComplete.LearnExitSource learnExitSource = (CryptoLearnComplete.LearnExitSource) educationStoryPresenter.exitSource$delegate.getValue();
                LearnContentType learnContentType = LearnContentType.STORY;
                String slug = EducationStoryPresenter.getSlug((HttpUrl) obj3);
                if (slug == null) {
                    slug = educationStoryPresenter.args.storyUrl;
                }
                analytics.track(new CryptoLearnComplete(null, valueOf, learnExitSource, learnContentType, slug, 1), null);
                break;
            default:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj2;
                if (parcelableSnapshotMutableIntState2.getIntValue() + parcelableSnapshotMutableIntState.getIntValue() > 0) {
                    ((CardSchemePresenter) obj).analytics.track(new CashCardHero3DSwipes(Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue()), Integer.valueOf(parcelableSnapshotMutableIntState2.getIntValue())), null);
                    break;
                }
                break;
        }
    }
}
