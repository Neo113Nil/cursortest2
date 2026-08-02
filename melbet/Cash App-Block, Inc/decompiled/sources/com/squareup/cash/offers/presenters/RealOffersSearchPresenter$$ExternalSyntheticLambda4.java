package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import com.squareup.cash.offers.backend.api.TrackingAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealOffersSearchPresenter$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealOffersSearchPresenter f$0;

    public /* synthetic */ RealOffersSearchPresenter$$ExternalSyntheticLambda4(RealOffersSearchPresenter realOffersSearchPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = realOffersSearchPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RealOffersSearchPresenter realOffersSearchPresenter = this.f$0;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(realOffersSearchPresenter, 24);
            default:
                TrackingAction trackingAction = (TrackingAction) obj;
                trackingAction.getClass();
                if (!trackingAction.equals(TrackingAction.EndTracking.INSTANCE) && !(trackingAction instanceof TrackingAction.StartTracking)) {
                    realOffersSearchPresenter.trackingManager.onAction(trackingAction);
                }
                return Unit.INSTANCE;
        }
    }
}
