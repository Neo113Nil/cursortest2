package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.text.android.CanvasCompatO;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.protos.franklin.ui.FullCashtag;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealPinScreensTitleGenerator$generateTitle$cashtag$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealPinScreensTitleGenerator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPinScreensTitleGenerator$generateTitle$cashtag$1(RealPinScreensTitleGenerator realPinScreensTitleGenerator, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realPinScreensTitleGenerator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealPinScreensTitleGenerator realPinScreensTitleGenerator = this.this$0;
        switch (i) {
            case 0:
                return new RealPinScreensTitleGenerator$generateTitle$cashtag$1(realPinScreensTitleGenerator, continuation, 0);
            default:
                return new RealPinScreensTitleGenerator$generateTitle$cashtag$1(realPinScreensTitleGenerator, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealPinScreensTitleGenerator$generateTitle$cashtag$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FullCashtag fullCashtag;
        int i = this.$r8$classId;
        RealPinScreensTitleGenerator realPinScreensTitleGenerator = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest publicProfile = realPinScreensTitleGenerator.profileManager.publicProfile();
                    this.label = 1;
                    obj = FlowKt.firstOrNull(publicProfile, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                PublicProfile publicProfile2 = (PublicProfile) obj;
                if (publicProfile2 == null || (fullCashtag = publicProfile2.fullCashtag) == null) {
                    return null;
                }
                return FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow select = realPinScreensTitleGenerator.p2pSettingsManager.select();
                    this.label = 1;
                    obj = FlowKt.firstOrNull(select, this);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) obj;
                if (p2pSettingsManager$P2pSettings != null) {
                    return Boolean.valueOf(CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings));
                }
                return null;
        }
    }
}
