package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractView;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FamilyHomePresenter$models$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FormBlocker.Element.UpsellElement.OnDemandMessageData $messageData;
    public final /* synthetic */ FamilyHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyHomePresenter$models$3$1$1(FamilyHomePresenter familyHomePresenter, FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = familyHomePresenter;
        this.$messageData = onDemandMessageData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyHomePresenter$models$3$1$1(this.this$0, this.$messageData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyHomePresenter$models$3$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        FamilyUpsellAnalytics familyUpsellAnalytics = this.this$0.familyUpsellAnalytics;
        Analytics analytics = familyUpsellAnalytics.analytics;
        FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData = this.$messageData;
        String str = onDemandMessageData.campaign_token;
        String str2 = onDemandMessageData.template_token;
        Integer num = onDemandMessageData.template_version;
        Placement placement = Placement.FAMILY_APPLET;
        String str3 = onDemandMessageData.product_type;
        long millis = familyUpsellAnalytics.clock.millis();
        analytics.track(new OnDemandMessageInteractView(str, Long.valueOf(millis), placement, str2, num, AppMessageFormat.CARD, str3), null);
        return Unit.INSTANCE;
    }
}
