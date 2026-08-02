package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.moneybot.MoneybotErrorNextBestActionError;
import com.squareup.cash.cdf.moneybot.MoneybotErrorWidgetError;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.observability.types.ErrorReporter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotHomePresenter$loadContent$nbaDeferred$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $homeSessionId;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MoneybotHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotHomePresenter$loadContent$nbaDeferred$1(MoneybotHomePresenter moneybotHomePresenter, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneybotHomePresenter;
        this.$homeSessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new MoneybotHomePresenter$loadContent$nbaDeferred$1(this.this$0, this.$homeSessionId, continuation, 0);
            default:
                return new MoneybotHomePresenter$loadContent$nbaDeferred$1(this.this$0, this.$homeSessionId, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotHomePresenter$loadContent$nbaDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$homeSessionId;
        MoneybotHomePresenter moneybotHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = (EglCore) moneybotHomePresenter.nextBestActionManager;
                    this.label = 1;
                    obj = eglCore.getNextBestActions(this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    ((ParcelableSnapshotMutableState) moneybotHomePresenter.loadableNbas$delegate).setValue(new Loadable.Loaded(((ApiResult.Success) apiResult).response));
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService).analytics.track(new MoneybotErrorNextBestActionError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult), "getNextBestAction"), null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((MoneybotFlagsHelper) moneybotHomePresenter.moneybotFlagsHelper).moneybotHomeWidgetsEnabled()) {
                        RealMoneybotWidgetManager realMoneybotWidgetManager = (RealMoneybotWidgetManager) moneybotHomePresenter.widgetManager;
                        this.label = 1;
                        obj = realMoneybotWidgetManager.listWidgets(this);
                        if (obj == coroutineSingletons2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                if (apiResult2 instanceof ApiResult.Success) {
                    List list = (List) ((ApiResult.Success) apiResult2).response;
                    moneybotHomePresenter.getClass();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Widget) it.next()).widgetId);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String str2 = (String) next;
                        Object obj2 = linkedHashMap.get(str2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str2, obj2);
                        }
                        ((List) obj2).add(next);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((List) entry.getValue()).size() > 1) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set keySet = linkedHashMap2.keySet();
                    if (!keySet.isEmpty()) {
                        moneybotHomePresenter.errorReporter.report(new GeneralMoneybotError("Duplicate widget ids detected on Moneybot Home: " + CollectionsKt.sorted(keySet)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                    ((ParcelableSnapshotMutableState) moneybotHomePresenter.widgets$delegate).setValue(list);
                } else if (!(apiResult2 instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService).analytics.track(new MoneybotErrorWidgetError(str, AnalyticsMappersKt.toErrorName((ApiResult.Failure) apiResult2), "getWidgets"), null);
                }
                break;
        }
        return null;
    }
}
