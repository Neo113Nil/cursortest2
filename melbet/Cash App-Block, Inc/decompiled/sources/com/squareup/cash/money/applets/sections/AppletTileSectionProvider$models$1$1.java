package com.squareup.cash.money.applets.sections;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AppletTileSectionProvider$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AppletTileSectionProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppletTileSectionProvider$models$1$1(AppletTileSectionProvider appletTileSectionProvider, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = appletTileSectionProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AppletTileSectionProvider appletTileSectionProvider = this.this$0;
        switch (i) {
            case 0:
                return new AppletTileSectionProvider$models$1$1(appletTileSectionProvider, continuation, 0);
            default:
                return new AppletTileSectionProvider$models$1$1(appletTileSectionProvider, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AppletTileSectionProvider$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AppletTileSectionProvider appletTileSectionProvider = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = appletTileSectionProvider.contentSpanTrackingService;
                if (realMoneyContentSpanTrackingService.moneyTabLoadSpanId == null) {
                    String m = Boxes$$ExternalSyntheticOutline1.m();
                    realMoneyContentSpanTrackingService.moneyTabLoadSpanId = m;
                    realMoneyContentSpanTrackingService.openSpans.put(m, RealObservabilityManager.startTrackingSpan$default(realMoneyContentSpanTrackingService.observabilityManager, m, "money_tab_load", Thread$State$EnumUnboxingLocalUtility.m("home_version", realMoneyContentSpanTrackingService.version), null, 8));
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (appletTileSectionProvider.missingAppletIds.isEmpty()) {
                    RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService2 = appletTileSectionProvider.contentSpanTrackingService;
                    SpanTracking spanTracking = (SpanTracking) realMoneyContentSpanTrackingService2.openSpans.get(realMoneyContentSpanTrackingService2.moneyTabLoadSpanId);
                    if (spanTracking != null) {
                        SpanTracking.spanEnded$default(spanTracking, null, 3);
                    }
                    realMoneyContentSpanTrackingService2.moneyTabLoadSpanId = null;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
