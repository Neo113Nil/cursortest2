package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PdpPanelState {
    public final ParcelableSnapshotMutableState displayedModel$delegate;
    public final ParcelableSnapshotMutableState overlayHeight$delegate;
    public final ScrollState scrollState;
    public final ParcelableSnapshotMutableState visible$delegate;

    public PdpPanelState(ScrollState scrollState) {
        scrollState.getClass();
        this.scrollState = scrollState;
        this.visible$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.overlayHeight$delegate = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
        this.displayedModel$delegate = Updater.mutableStateOf$default(null);
    }

    public final boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateFocusedModel(ProductDetailsPageViewModel productDetailsPageViewModel, ContinuationImpl continuationImpl) {
        PdpPanelState$updateFocusedModel$1 pdpPanelState$updateFocusedModel$1;
        int i;
        if (continuationImpl instanceof PdpPanelState$updateFocusedModel$1) {
            pdpPanelState$updateFocusedModel$1 = (PdpPanelState$updateFocusedModel$1) continuationImpl;
            int i2 = pdpPanelState$updateFocusedModel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pdpPanelState$updateFocusedModel$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pdpPanelState$updateFocusedModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdpPanelState$updateFocusedModel$1.label;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.visible$delegate;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (productDetailsPageViewModel != null) {
                        this.displayedModel$delegate.setValue(productDetailsPageViewModel);
                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    } else if (getVisible()) {
                        pdpPanelState$updateFocusedModel$1.label = 1;
                        if (ScrollState.animateScrollTo$default(this.scrollState, 0, pdpPanelState$updateFocusedModel$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        pdpPanelState$updateFocusedModel$1 = new PdpPanelState$updateFocusedModel$1(this, continuationImpl);
        Object obj2 = pdpPanelState$updateFocusedModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdpPanelState$updateFocusedModel$1.label;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.visible$delegate;
        if (i != 0) {
        }
        parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
