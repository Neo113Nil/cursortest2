package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class GpsLocationConsentBlockerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ GpsLocationConsentBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GpsLocationConsentBlockerPresenter$models$1$1(GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = gpsLocationConsentBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = this.this$0;
        switch (i) {
            case 0:
                return new GpsLocationConsentBlockerPresenter$models$1$1(gpsLocationConsentBlockerPresenter, continuation, 0);
            case 1:
                return new GpsLocationConsentBlockerPresenter$models$1$1(gpsLocationConsentBlockerPresenter, continuation, 1);
            default:
                return new GpsLocationConsentBlockerPresenter$models$1$1(gpsLocationConsentBlockerPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GpsLocationConsentBlockerPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object collectGpsLocation;
        Object collectGpsLocation2;
        int i = this.$r8$classId;
        GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = this.this$0;
        switch (i) {
            case 0:
                BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen = gpsLocationConsentBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealGpsLocationManager realGpsLocationManager = gpsLocationConsentBlockerPresenter.gpsLocationManager;
                    String str = gpsLocationConsentBlockerScreen.blocker.trigger_source_text;
                    str.getClass();
                    String str2 = gpsLocationConsentBlockerScreen.blocker.event_token;
                    str2.getClass();
                    this.label = 1;
                    collectGpsLocation = realGpsLocationManager.collectGpsLocation(str, str2, (r13 & 4) == 0, (r13 & 8) == 0, this);
                    if (collectGpsLocation == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper = gpsLocationConsentBlockerPresenter.blockersHelper;
                    BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen2 = gpsLocationConsentBlockerPresenter.args;
                    BlockerAction blockerAction = gpsLocationConsentBlockerScreen2.dismissAction;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, gpsLocationConsentBlockerScreen2, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen3 = gpsLocationConsentBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealGpsLocationManager realGpsLocationManager2 = gpsLocationConsentBlockerPresenter.gpsLocationManager;
                    String str3 = gpsLocationConsentBlockerScreen3.blocker.trigger_source_text;
                    str3.getClass();
                    String str4 = gpsLocationConsentBlockerScreen3.blocker.event_token;
                    str4.getClass();
                    this.label = 1;
                    collectGpsLocation2 = realGpsLocationManager2.collectGpsLocation(str3, str4, (r13 & 4) == 0, (r13 & 8) == 0, this);
                    if (collectGpsLocation2 == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
