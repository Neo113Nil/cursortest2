package com.squareup.cash.afterpayapplet.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzms;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityPageRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.franklin.ui.UiCustomer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterpayAppletPageRequestHandler extends WireAdapter {
    public final ActivityClientService appService;
    public final String baseURL;
    public final RealObservabilityManager observabilityManager;
    public final String onScreen;
    public final RealSyncEntityReader syncEntityReader;
    public final RealUuidGenerator uuidGenerator;

    public AfterpayAppletPageRequestHandler(String str, RealObservabilityManager realObservabilityManager, ActivityClientService activityClientService, RealUuidGenerator realUuidGenerator, String str2, RealSyncEntityReader realSyncEntityReader) {
        super(activityClientService);
        this.onScreen = str;
        this.observabilityManager = realObservabilityManager;
        this.appService = activityClientService;
        this.uuidGenerator = realUuidGenerator;
        this.baseURL = str2;
        this.syncEntityReader = realSyncEntityReader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01dd -> B:12:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x01ed -> B:13:0x01eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01f9 -> B:15:0x0204). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01ff -> B:15:0x0204). Please report as a decompilation issue!!! */
    @Override // com.squareup.cash.db.WireAdapter, com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        AfterpayAppletPageRequestHandler$requestPage$1 afterpayAppletPageRequestHandler$requestPage$1;
        int i;
        String str;
        ApiResult apiResult;
        long j;
        ActivityPageResponse activityPageResponse;
        ActivitiesManager.ActivityPage activityPage;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        ArrayList arrayList2;
        OrderActivityData orderActivityData;
        long j2;
        String str2;
        Object obj;
        Iterator it2;
        ArrayList arrayList3;
        String str3;
        ActivitiesManager.ActivityPage activityPage2;
        int i4;
        int i5;
        int i6;
        int i7;
        UiCustomer uiCustomer;
        String str4;
        UiCustomer uiCustomer2;
        if (continuation instanceof AfterpayAppletPageRequestHandler$requestPage$1) {
            afterpayAppletPageRequestHandler$requestPage$1 = (AfterpayAppletPageRequestHandler$requestPage$1) continuation;
            int i8 = afterpayAppletPageRequestHandler$requestPage$1.label;
            if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                afterpayAppletPageRequestHandler$requestPage$1.label = i8 - PKIFailureInfo.systemUnavail;
                Object obj2 = afterpayAppletPageRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterpayAppletPageRequestHandler$requestPage$1.label;
                RealSyncEntityReader realSyncEntityReader = this.syncEntityReader;
                RealObservabilityManager realObservabilityManager = this.observabilityManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    this.uuidGenerator.getClass();
                    String str5 = "PurchasesRequest-" + RealUuidGenerator.generate();
                    realObservabilityManager.startResource(str5, Recorder$$ExternalSyntheticOutline2.m$1(this.baseURL, "/cash-app/activity/v1.0/page"), MapsKt__MapsJVMKt.mapOf(new Pair("screen", this.onScreen)));
                    ActivityPageRequest buildPageRequest = WireAdapter.buildPageRequest(activityContext, pageOffset);
                    afterpayAppletPageRequestHandler$requestPage$1.L$2 = str5;
                    afterpayAppletPageRequestHandler$requestPage$1.label = 1;
                    Object activityPage3 = this.appService.activityPage(buildPageRequest, afterpayAppletPageRequestHandler$requestPage$1);
                    if (activityPage3 != coroutineSingletons) {
                        obj2 = activityPage3;
                        str = str5;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    str = afterpayAppletPageRequestHandler$requestPage$1.L$2;
                    SafeTrace.throwOnFailure(obj2);
                } else if (i == 2) {
                    int i9 = afterpayAppletPageRequestHandler$requestPage$1.I$3;
                    int i10 = afterpayAppletPageRequestHandler$requestPage$1.I$2;
                    int i11 = afterpayAppletPageRequestHandler$requestPage$1.I$1;
                    int i12 = afterpayAppletPageRequestHandler$requestPage$1.I$0;
                    long j3 = afterpayAppletPageRequestHandler$requestPage$1.J$0;
                    Collection collection = afterpayAppletPageRequestHandler$requestPage$1.L$14;
                    String str6 = afterpayAppletPageRequestHandler$requestPage$1.L$13;
                    orderActivityData = afterpayAppletPageRequestHandler$requestPage$1.L$11;
                    Iterator it3 = afterpayAppletPageRequestHandler$requestPage$1.L$9;
                    Collection collection2 = afterpayAppletPageRequestHandler$requestPage$1.L$8;
                    ActivitiesManager.ActivityPage activityPage4 = afterpayAppletPageRequestHandler$requestPage$1.L$5;
                    SafeTrace.throwOnFailure(obj2);
                    i6 = i9;
                    i7 = i11;
                    i4 = i10;
                    i5 = i12;
                    activityPage2 = activityPage4;
                    obj = obj2;
                    arrayList2 = collection2;
                    it2 = it3;
                    str3 = str6;
                    j2 = j3;
                    str2 = null;
                    arrayList3 = collection;
                    uiCustomer = (UiCustomer) obj;
                    if (uiCustomer != null) {
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = afterpayAppletPageRequestHandler$requestPage$1.I$1;
                    i5 = afterpayAppletPageRequestHandler$requestPage$1.I$0;
                    long j4 = afterpayAppletPageRequestHandler$requestPage$1.J$0;
                    Collection collection3 = afterpayAppletPageRequestHandler$requestPage$1.L$14;
                    OrderActivityData orderActivityData2 = afterpayAppletPageRequestHandler$requestPage$1.L$11;
                    Iterator it4 = afterpayAppletPageRequestHandler$requestPage$1.L$9;
                    Collection collection4 = afterpayAppletPageRequestHandler$requestPage$1.L$8;
                    activityPage2 = afterpayAppletPageRequestHandler$requestPage$1.L$5;
                    SafeTrace.throwOnFailure(obj2);
                    it2 = it4;
                    j2 = j4;
                    ArrayList arrayList4 = collection3;
                    ArrayList arrayList5 = collection4;
                    OrderActivityData orderActivityData3 = orderActivityData2;
                    i3 = i7;
                    Iterator it5 = it2;
                    OrderActivityData orderActivityData4 = orderActivityData3;
                    uiCustomer = (UiCustomer) obj2;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i2 = i5;
                    it = it5;
                    activityPage = activityPage2;
                    UiCustomer uiCustomer3 = uiCustomer;
                    j = j2;
                    CashAppPayOrderRenderData cashAppPayOrderRenderData = orderActivityData4.orderRenderData;
                    OrderRow.OrderRowLoanUiState orderRowLoanUiState = orderActivityData4.orderRowState;
                    long j5 = orderActivityData4.activityItemDisplayDateMs;
                    ActivityItemGlobalId activityItemGlobalId = orderActivityData4.activityItemGlobalId;
                    AfterpayAppletPageRequestHandler$requestPage$1 afterpayAppletPageRequestHandler$requestPage$12 = afterpayAppletPageRequestHandler$requestPage$1;
                    long j6 = orderActivityData4.version;
                    ActivitiesManager.ActivityPage activityPage5 = activityPage;
                    String str7 = orderActivityData4.rowId;
                    ActivityRowSection activityRowSection = orderActivityData4.section;
                    Set set = orderActivityData4.productClassifiers;
                    String str8 = orderActivityData4.senderId;
                    String str9 = orderActivityData4.recipientId;
                    UiCustomer uiCustomer4 = orderActivityData4.recipient;
                    UiCustomer uiCustomer5 = orderActivityData4.sender;
                    ActivityItemGlobalId activityItemGlobalId2 = orderActivityData4.referenceItemId;
                    cashAppPayOrderRenderData.getClass();
                    orderRowLoanUiState.getClass();
                    activityItemGlobalId.getClass();
                    str7.getClass();
                    set.getClass();
                    arrayList.add(new OrderActivityData(cashAppPayOrderRenderData, orderRowLoanUiState, j5, activityItemGlobalId, j6, str7, activityRowSection, set, uiCustomer3, str8, str9, uiCustomer4, uiCustomer5, activityItemGlobalId2));
                    afterpayAppletPageRequestHandler$requestPage$1 = afterpayAppletPageRequestHandler$requestPage$12;
                    activityPage = activityPage5;
                    arrayList = arrayList2;
                    coroutineSingletons = coroutineSingletons;
                    if (!it.hasNext()) {
                        return ActivitiesManager.ActivityPage.copy$default(activityPage, arrayList);
                    }
                    orderActivityData4 = (OrderActivityData) it.next();
                    String str10 = orderActivityData4.recipientId;
                    if (str10 == null) {
                        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = orderActivityData4.orderRenderData.merchant;
                        if (cashAppPayMerchantRenderData != null) {
                            str10 = cashAppPayMerchantRenderData.merchant_token;
                        } else {
                            str4 = null;
                            uiCustomer2 = orderActivityData4.recipient;
                            if (uiCustomer2 != null) {
                                arrayList2 = arrayList;
                                uiCustomer3 = uiCustomer2;
                            } else {
                                if (str4 != null) {
                                    afterpayAppletPageRequestHandler$requestPage$1.L$2 = null;
                                    afterpayAppletPageRequestHandler$requestPage$1.L$5 = activityPage;
                                    ArrayList arrayList6 = arrayList;
                                    afterpayAppletPageRequestHandler$requestPage$1.L$8 = arrayList6;
                                    afterpayAppletPageRequestHandler$requestPage$1.L$9 = it;
                                    afterpayAppletPageRequestHandler$requestPage$1.L$11 = orderActivityData4;
                                    afterpayAppletPageRequestHandler$requestPage$1.L$13 = str4;
                                    afterpayAppletPageRequestHandler$requestPage$1.L$14 = arrayList6;
                                    afterpayAppletPageRequestHandler$requestPage$1.J$0 = j;
                                    afterpayAppletPageRequestHandler$requestPage$1.I$0 = i2;
                                    afterpayAppletPageRequestHandler$requestPage$1.I$1 = i3;
                                    afterpayAppletPageRequestHandler$requestPage$1.I$2 = 0;
                                    afterpayAppletPageRequestHandler$requestPage$1.I$3 = 0;
                                    afterpayAppletPageRequestHandler$requestPage$1.label = 2;
                                    str2 = null;
                                    obj = FlowKt.firstOrNull(FlowKt.mapLatest(new zzms(str4, null, 2), realSyncEntityReader.getAllEntitiesFlow(AndroidSyncValueSpecs.Customer)), afterpayAppletPageRequestHandler$requestPage$1);
                                    if (obj != coroutineSingletons) {
                                        str3 = str4;
                                        j2 = j;
                                        activityPage2 = activityPage;
                                        arrayList2 = arrayList;
                                        i7 = i3;
                                        orderActivityData = orderActivityData4;
                                        arrayList3 = arrayList2;
                                        it2 = it;
                                        i5 = i2;
                                        i6 = 0;
                                        i4 = 0;
                                        uiCustomer = (UiCustomer) obj;
                                        if (uiCustomer != null) {
                                            afterpayAppletPageRequestHandler$requestPage$1.L$2 = str2;
                                            afterpayAppletPageRequestHandler$requestPage$1.L$5 = activityPage2;
                                            afterpayAppletPageRequestHandler$requestPage$1.L$8 = arrayList2;
                                            afterpayAppletPageRequestHandler$requestPage$1.L$9 = it2;
                                            afterpayAppletPageRequestHandler$requestPage$1.L$11 = orderActivityData;
                                            afterpayAppletPageRequestHandler$requestPage$1.L$13 = str2;
                                            afterpayAppletPageRequestHandler$requestPage$1.L$14 = arrayList3;
                                            afterpayAppletPageRequestHandler$requestPage$1.J$0 = j2;
                                            afterpayAppletPageRequestHandler$requestPage$1.I$0 = i5;
                                            afterpayAppletPageRequestHandler$requestPage$1.I$1 = i7;
                                            afterpayAppletPageRequestHandler$requestPage$1.I$2 = i4;
                                            afterpayAppletPageRequestHandler$requestPage$1.I$3 = i6;
                                            afterpayAppletPageRequestHandler$requestPage$1.label = 3;
                                            obj2 = FlowKt.firstOrNull(FlowKt.mapLatest(new zzms(str3, null, 3), realSyncEntityReader.getAllEntitiesFlow(AndroidSyncValueSpecs.Merchant)), afterpayAppletPageRequestHandler$requestPage$1);
                                            if (obj2 != coroutineSingletons) {
                                                arrayList4 = arrayList3;
                                                orderActivityData2 = orderActivityData;
                                                arrayList5 = arrayList2;
                                                OrderActivityData orderActivityData32 = orderActivityData2;
                                                i3 = i7;
                                                Iterator it52 = it2;
                                                OrderActivityData orderActivityData42 = orderActivityData32;
                                                uiCustomer = (UiCustomer) obj2;
                                                arrayList = arrayList4;
                                                arrayList2 = arrayList5;
                                                i2 = i5;
                                                it = it52;
                                                activityPage = activityPage2;
                                                UiCustomer uiCustomer32 = uiCustomer;
                                                j = j2;
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i3 = i7;
                                            it52 = it2;
                                            orderActivityData42 = orderActivityData;
                                            i2 = i5;
                                            it = it52;
                                            activityPage = activityPage2;
                                            UiCustomer uiCustomer322 = uiCustomer;
                                            j = j2;
                                        }
                                    }
                                    return coroutineSingletons;
                                }
                                arrayList2 = arrayList;
                                uiCustomer322 = null;
                            }
                            CashAppPayOrderRenderData cashAppPayOrderRenderData2 = orderActivityData42.orderRenderData;
                            OrderRow.OrderRowLoanUiState orderRowLoanUiState2 = orderActivityData42.orderRowState;
                            long j52 = orderActivityData42.activityItemDisplayDateMs;
                            ActivityItemGlobalId activityItemGlobalId3 = orderActivityData42.activityItemGlobalId;
                            AfterpayAppletPageRequestHandler$requestPage$1 afterpayAppletPageRequestHandler$requestPage$122 = afterpayAppletPageRequestHandler$requestPage$1;
                            long j62 = orderActivityData42.version;
                            ActivitiesManager.ActivityPage activityPage52 = activityPage;
                            String str72 = orderActivityData42.rowId;
                            ActivityRowSection activityRowSection2 = orderActivityData42.section;
                            Set set2 = orderActivityData42.productClassifiers;
                            String str82 = orderActivityData42.senderId;
                            String str92 = orderActivityData42.recipientId;
                            UiCustomer uiCustomer42 = orderActivityData42.recipient;
                            UiCustomer uiCustomer52 = orderActivityData42.sender;
                            ActivityItemGlobalId activityItemGlobalId22 = orderActivityData42.referenceItemId;
                            cashAppPayOrderRenderData2.getClass();
                            orderRowLoanUiState2.getClass();
                            activityItemGlobalId3.getClass();
                            str72.getClass();
                            set2.getClass();
                            arrayList.add(new OrderActivityData(cashAppPayOrderRenderData2, orderRowLoanUiState2, j52, activityItemGlobalId3, j62, str72, activityRowSection2, set2, uiCustomer322, str82, str92, uiCustomer42, uiCustomer52, activityItemGlobalId22));
                            afterpayAppletPageRequestHandler$requestPage$1 = afterpayAppletPageRequestHandler$requestPage$122;
                            activityPage = activityPage52;
                            arrayList = arrayList2;
                            coroutineSingletons = coroutineSingletons;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                    str4 = str10;
                    uiCustomer2 = orderActivityData42.recipient;
                    if (uiCustomer2 != null) {
                    }
                    CashAppPayOrderRenderData cashAppPayOrderRenderData22 = orderActivityData42.orderRenderData;
                    OrderRow.OrderRowLoanUiState orderRowLoanUiState22 = orderActivityData42.orderRowState;
                    long j522 = orderActivityData42.activityItemDisplayDateMs;
                    ActivityItemGlobalId activityItemGlobalId32 = orderActivityData42.activityItemGlobalId;
                    AfterpayAppletPageRequestHandler$requestPage$1 afterpayAppletPageRequestHandler$requestPage$1222 = afterpayAppletPageRequestHandler$requestPage$1;
                    long j622 = orderActivityData42.version;
                    ActivitiesManager.ActivityPage activityPage522 = activityPage;
                    String str722 = orderActivityData42.rowId;
                    ActivityRowSection activityRowSection22 = orderActivityData42.section;
                    Set set22 = orderActivityData42.productClassifiers;
                    String str822 = orderActivityData42.senderId;
                    String str922 = orderActivityData42.recipientId;
                    UiCustomer uiCustomer422 = orderActivityData42.recipient;
                    UiCustomer uiCustomer522 = orderActivityData42.sender;
                    ActivityItemGlobalId activityItemGlobalId222 = orderActivityData42.referenceItemId;
                    cashAppPayOrderRenderData22.getClass();
                    orderRowLoanUiState22.getClass();
                    activityItemGlobalId32.getClass();
                    str722.getClass();
                    set22.getClass();
                    arrayList.add(new OrderActivityData(cashAppPayOrderRenderData22, orderRowLoanUiState22, j522, activityItemGlobalId32, j622, str722, activityRowSection22, set22, uiCustomer322, str822, str922, uiCustomer422, uiCustomer522, activityItemGlobalId222));
                    afterpayAppletPageRequestHandler$requestPage$1 = afterpayAppletPageRequestHandler$requestPage$1222;
                    activityPage = activityPage522;
                    arrayList = arrayList2;
                    coroutineSingletons = coroutineSingletons;
                    if (!it.hasNext()) {
                    }
                }
                apiResult = (ApiResult) obj2;
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    j = ((ApiResult.Failure.HttpFailure) apiResult).code;
                } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    j = -1;
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    j = 200;
                }
                realObservabilityManager.stopResource(new Integer((int) j), str);
                activityPageResponse = (ActivityPageResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (activityPageResponse != null) {
                    return null;
                }
                activityPage = ActivitiesManager.ActivityPage.Companion.toActivityPage(activityPageResponse);
                List list = activityPage.activities;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof OrderActivityData) {
                        arrayList7.add(obj3);
                    }
                }
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                it = arrayList7.iterator();
                i2 = 0;
                i3 = 0;
                if (!it.hasNext()) {
                }
            }
        }
        afterpayAppletPageRequestHandler$requestPage$1 = new AfterpayAppletPageRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
        Object obj22 = afterpayAppletPageRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpayAppletPageRequestHandler$requestPage$1.label;
        RealSyncEntityReader realSyncEntityReader2 = this.syncEntityReader;
        RealObservabilityManager realObservabilityManager2 = this.observabilityManager;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
        }
        realObservabilityManager2.stopResource(new Integer((int) j), str);
        activityPageResponse = (ActivityPageResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
        if (activityPageResponse != null) {
        }
    }
}
