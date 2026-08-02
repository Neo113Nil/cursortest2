package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.moneybot.MoneybotErrorNextBestActionError;
import com.squareup.cash.cdf.moneybot.MoneybotErrorWidgetError;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotHomePresenter$processEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $homeSessionId;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoneybotHomeViewEvent $this_processEvent;
    public int label;
    public final /* synthetic */ MoneybotHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotHomePresenter$processEvent$1(MoneybotHomePresenter moneybotHomePresenter, MoneybotHomeViewEvent moneybotHomeViewEvent, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneybotHomePresenter;
        this.$this_processEvent = moneybotHomeViewEvent;
        this.$homeSessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new MoneybotHomePresenter$processEvent$1(this.this$0, this.$this_processEvent, this.$homeSessionId, continuation, 0);
            case 1:
                return new MoneybotHomePresenter$processEvent$1(this.this$0, this.$this_processEvent, this.$homeSessionId, continuation, 1);
            default:
                return new MoneybotHomePresenter$processEvent$1(this.this$0, this.$this_processEvent, this.$homeSessionId, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotHomePresenter$processEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$homeSessionId;
        MoneybotHomePresenter moneybotHomePresenter = this.this$0;
        MoneybotHomeViewEvent moneybotHomeViewEvent = this.$this_processEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = (EglCore) moneybotHomePresenter.nextBestActionManager;
                    String str2 = ((MoneybotHomeViewEvent.LaunchNextBestAction) moneybotHomeViewEvent).nextBestActionId;
                    this.label = 1;
                    obj = eglCore.updateNextBestAction(str2, this);
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
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    ((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService).analytics.track(new MoneybotErrorNextBestActionError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "updateNextBestAction"), null);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotWidgetManager realMoneybotWidgetManager = (RealMoneybotWidgetManager) moneybotHomePresenter.widgetManager;
                    String str3 = ((MoneybotHomeViewEvent.WidgetTapped) moneybotHomeViewEvent).widgetId;
                    this.label = 1;
                    obj = realMoneybotWidgetManager.markWidgetAsUsed(str3, this);
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
                ApiResult apiResult2 = (ApiResult) obj;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService).analytics.track(new MoneybotErrorWidgetError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult2), "markWidgetAsUsed"), null);
                }
                return Unit.INSTANCE;
            default:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) moneybotHomePresenter.widgets$delegate;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotWidgetManager realMoneybotWidgetManager2 = (RealMoneybotWidgetManager) moneybotHomePresenter.widgetManager;
                    String str4 = ((MoneybotHomeViewEvent.DeleteWidget) moneybotHomeViewEvent).widgetId;
                    this.label = 1;
                    obj = realMoneybotWidgetManager2.deleteWidget(str4, this);
                    if (obj == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult3 = (ApiResult) obj;
                if (apiResult3 instanceof ApiResult.Success) {
                    List list = (List) parcelableSnapshotMutableState.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!Intrinsics.areEqual(((Widget) obj2).widgetId, ((MoneybotHomeViewEvent.DeleteWidget) moneybotHomeViewEvent).widgetId)) {
                            arrayList.add(obj2);
                        }
                    }
                    parcelableSnapshotMutableState.setValue(arrayList);
                } else {
                    if (!(apiResult3 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService).analytics.track(new MoneybotErrorWidgetError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult3), "deleteWidget"), null);
                }
                return Unit.INSTANCE;
        }
    }
}
