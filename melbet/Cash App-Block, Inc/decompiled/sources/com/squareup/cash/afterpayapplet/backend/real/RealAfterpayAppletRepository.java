package com.squareup.cash.afterpayapplet.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.draw.RotateKt;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.redwood.yoga.internal.YGFloatOptional;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletEntrypointHttpError;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletStaleResponseError;
import com.squareup.cash.afterpayapplet.backend.AfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.afterpayapplet.backend.AppletCreditLineState;
import com.squareup.cash.afterpayapplet.backend.DatabaseError;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.db.AfterpayAppletQueries$forKey$2;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletRequest;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.common.Money;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningsHomeUi;

/* loaded from: classes.dex */
public final class RealAfterpayAppletRepository implements HasObservability {
    public final CashAccountDatabaseImpl accountDatabase;
    public final CashSuggestClientService appService;
    public final AndroidClock clock;
    public final ErrorReporter errorReporter;
    public final StateFlowImpl expiredAfterpayAppletResponse;
    public final KeyValue hasViewedApplet;
    public final CoroutineContext ioContext;
    public final MoneyFormatter moneyFormatter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final AfterpayEligibleRetroTransactionsProvider retroTransactions;
    public final CoroutineScope scope;
    public final KeyValue viewedDisplayMessageIds;
    public final KeyValue viewedSectionIds;

    public RealAfterpayAppletRepository(CashSuggestClientService cashSuggestClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, ErrorReporter errorReporter, SampleStrategy sampleStrategy, LocalizedMoneyFormatter.Factory factory, CoroutineContext coroutineContext, CoroutineScope coroutineScope, AfterpayEligibleRetroTransactionsProvider afterpayEligibleRetroTransactionsProvider, KeyValue keyValue, KeyValue keyValue2, KeyValue keyValue3) {
        cashSuggestClientService.getClass();
        cashAccountDatabaseImpl.getClass();
        androidClock.getClass();
        errorReporter.getClass();
        sampleStrategy.getClass();
        factory.getClass();
        coroutineContext.getClass();
        this.appService = cashSuggestClientService;
        this.accountDatabase = cashAccountDatabaseImpl;
        this.clock = androidClock;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.ioContext = coroutineContext;
        this.scope = coroutineScope;
        this.retroTransactions = afterpayEligibleRetroTransactionsProvider;
        this.viewedDisplayMessageIds = keyValue;
        this.viewedSectionIds = keyValue2;
        this.hasViewedApplet = keyValue3;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.expiredAfterpayAppletResponse = FlowKt.MutableStateFlow(null);
    }

    public static final Object access$emitCreditLineStateFromResponse(RealAfterpayAppletRepository realAfterpayAppletRepository, FlowCollector flowCollector, AfterpayAppletResponse afterpayAppletResponse, FormattedDetail formattedDetail, RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1 realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) {
        LocalizedString localizedString;
        LocalizedString localizedString2;
        Money remainingINNCredit = EarningTool.Tool.remainingINNCredit(afterpayAppletResponse);
        FormattedDetail.CreditInfoCheck creditInfoCheck = formattedDetail.credit_check;
        if (remainingINNCredit == null) {
            if (creditInfoCheck != null && (localizedString2 = creditInfoCheck.l_limit_unknown) != null) {
                r1 = localizedString2.translated_value;
            }
            r1.getClass();
            Object emit = flowCollector.emit(new AppletCreditLineState.Error(r1), realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
            return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
        }
        Money money = creditInfoCheck != null ? creditInfoCheck.min_credit : null;
        if (money != null) {
            Long l = money.amount;
            l.getClass();
            long longValue = l.longValue();
            Long l2 = remainingINNCredit.amount;
            l2.getClass();
            if (longValue > l2.longValue()) {
                if (creditInfoCheck != null && (localizedString = creditInfoCheck.l_credit_limit_reached) != null) {
                    r1 = localizedString.translated_value;
                }
                r1.getClass();
                Object emit2 = flowCollector.emit(new AppletCreditLineState.LimitReached(r1), realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : Unit.INSTANCE;
            }
        }
        String str = creditInfoCheck != null ? creditInfoCheck.string_to_replace : null;
        str.getClass();
        LocalizedString localizedString3 = formattedDetail.l_text;
        localizedString3.getClass();
        String str2 = localizedString3.translated_value;
        r1 = str2 != null ? StringsKt__StringsJVMKt.replace$default(str2, str, realAfterpayAppletRepository.moneyFormatter.format(remainingINNCredit)) : null;
        r1.getClass();
        Object emit3 = flowCollector.emit(new AppletCreditLineState.AvailableCredit(r1), realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
        return emit3 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit3 : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0181, code lost:
    
        if (r2.emit(com.squareup.cash.afterpayapplet.backend.HomeResult.HomeError.INSTANCE, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0142, code lost:
    
        if (r10.emitHomeData(r8, r6, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0145, code lost:
    
        r10 = r11;
        r11 = r12;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0162, code lost:
    
        if (r8.emit(com.squareup.cash.afterpayapplet.backend.HomeResult.Empty.INSTANCE, r0) != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
    
        if (r12 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshOrEmitError(RealAfterpayAppletRepository realAfterpayAppletRepository, FlowCollector flowCollector, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$refreshOrEmitError$1 realAfterpayAppletRepository$refreshOrEmitError$1;
        List list;
        FlowCollector flowCollector2;
        boolean booleanValue;
        Object obj;
        CashSuggestClientService cashSuggestClientService;
        FlowCollector flowCollector3;
        FlowCollector flowCollector4;
        ApiResult apiResult;
        AfterpayAppletResponse afterpayAppletResponse;
        FlowCollector flowCollector5;
        int i;
        int i2;
        if (continuationImpl instanceof RealAfterpayAppletRepository$refreshOrEmitError$1) {
            realAfterpayAppletRepository$refreshOrEmitError$1 = (RealAfterpayAppletRepository$refreshOrEmitError$1) continuationImpl;
            int i3 = realAfterpayAppletRepository$refreshOrEmitError$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$refreshOrEmitError$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realAfterpayAppletRepository$refreshOrEmitError$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (realAfterpayAppletRepository$refreshOrEmitError$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj2);
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector;
                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 1;
                        obj2 = realAfterpayAppletRepository.getAllViewedMessageIds(realAfterpayAppletRepository$refreshOrEmitError$1);
                        break;
                    case 1:
                        flowCollector = realAfterpayAppletRepository$refreshOrEmitError$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        List list2 = (List) obj2;
                        KeyValue keyValue = realAfterpayAppletRepository.hasViewedApplet;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = list2;
                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 2;
                        Object obj4 = keyValue.get(realAfterpayAppletRepository$refreshOrEmitError$1);
                        if (obj4 != obj3) {
                            list = list2;
                            obj2 = obj4;
                            flowCollector2 = flowCollector;
                            booleanValue = ((Boolean) obj2).booleanValue();
                            CashSuggestClientService cashSuggestClientService2 = realAfterpayAppletRepository.appService;
                            KeyValue keyValue2 = realAfterpayAppletRepository.viewedSectionIds;
                            realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector2;
                            realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = list;
                            realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = cashSuggestClientService2;
                            realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                            realAfterpayAppletRepository$refreshOrEmitError$1.label = 3;
                            obj = keyValue2.get(realAfterpayAppletRepository$refreshOrEmitError$1);
                            if (obj != obj3) {
                                FlowCollector flowCollector6 = flowCollector2;
                                cashSuggestClientService = cashSuggestClientService2;
                                obj2 = obj;
                                flowCollector3 = flowCollector6;
                                AfterpayAppletRequest afterpayAppletRequest = new AfterpayAppletRequest(list, Boolean.valueOf(booleanValue), CollectionsKt.toList((Iterable) obj2));
                                realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector3;
                                realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                                realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = null;
                                realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                                realAfterpayAppletRepository$refreshOrEmitError$1.label = 4;
                                obj2 = cashSuggestClientService.afterpayAppletHome(afterpayAppletRequest, realAfterpayAppletRepository$refreshOrEmitError$1);
                                if (obj2 != obj3) {
                                    flowCollector4 = flowCollector3;
                                    apiResult = (ApiResult) obj2;
                                    if (apiResult instanceof ApiResult.Success) {
                                        afterpayAppletResponse = (AfterpayAppletResponse) ((ApiResult.Success) apiResult).response;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector4;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = apiResult;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$3 = afterpayAppletResponse;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.I$0 = 0;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.I$1 = 0;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 5;
                                        if (realAfterpayAppletRepository.handleSuccessfulAppletResponse(afterpayAppletResponse, "Failed to save response to cache during refresh", realAfterpayAppletRepository$refreshOrEmitError$1) != obj3) {
                                            flowCollector5 = flowCollector4;
                                            i = 0;
                                            i2 = 0;
                                            afterpayAppletResponse.getClass();
                                            if (afterpayAppletResponse.credit_line_snapshot == null && afterpayAppletResponse.home != null) {
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector5;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = apiResult;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$3 = null;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.I$0 = i2;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.I$1 = i;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.label = 7;
                                                break;
                                            } else {
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector5;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = apiResult;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.L$3 = null;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.I$0 = i2;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.I$1 = i;
                                                realAfterpayAppletRepository$refreshOrEmitError$1.label = 6;
                                                break;
                                            }
                                            apiResult = r11;
                                            booleanValue = r10;
                                        }
                                    }
                                    if (apiResult instanceof ApiResult.Failure) {
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = null;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = apiResult;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.L$3 = null;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.I$0 = 0;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.I$1 = 0;
                                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 8;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        return obj3;
                    case 2:
                        List list3 = realAfterpayAppletRepository$refreshOrEmitError$1.L$1;
                        flowCollector2 = realAfterpayAppletRepository$refreshOrEmitError$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        list = list3;
                        booleanValue = ((Boolean) obj2).booleanValue();
                        CashSuggestClientService cashSuggestClientService22 = realAfterpayAppletRepository.appService;
                        KeyValue keyValue22 = realAfterpayAppletRepository.viewedSectionIds;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector2;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = list;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = cashSuggestClientService22;
                        realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 3;
                        obj = keyValue22.get(realAfterpayAppletRepository$refreshOrEmitError$1);
                        if (obj != obj3) {
                        }
                        return obj3;
                    case 3:
                        booleanValue = realAfterpayAppletRepository$refreshOrEmitError$1.Z$0;
                        cashSuggestClientService = (CashSuggestClientService) realAfterpayAppletRepository$refreshOrEmitError$1.L$2;
                        list = realAfterpayAppletRepository$refreshOrEmitError$1.L$1;
                        flowCollector3 = realAfterpayAppletRepository$refreshOrEmitError$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        AfterpayAppletRequest afterpayAppletRequest2 = new AfterpayAppletRequest(list, Boolean.valueOf(booleanValue), CollectionsKt.toList((Iterable) obj2));
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector3;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = null;
                        realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 4;
                        obj2 = cashSuggestClientService.afterpayAppletHome(afterpayAppletRequest2, realAfterpayAppletRepository$refreshOrEmitError$1);
                        if (obj2 != obj3) {
                        }
                        return obj3;
                    case 4:
                        booleanValue = realAfterpayAppletRepository$refreshOrEmitError$1.Z$0;
                        flowCollector4 = realAfterpayAppletRepository$refreshOrEmitError$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        apiResult = (ApiResult) obj2;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        int i4 = realAfterpayAppletRepository$refreshOrEmitError$1.I$1;
                        int i5 = realAfterpayAppletRepository$refreshOrEmitError$1.I$0;
                        boolean z = realAfterpayAppletRepository$refreshOrEmitError$1.Z$0;
                        afterpayAppletResponse = realAfterpayAppletRepository$refreshOrEmitError$1.L$3;
                        ApiResult apiResult2 = (ApiResult) realAfterpayAppletRepository$refreshOrEmitError$1.L$2;
                        flowCollector5 = realAfterpayAppletRepository$refreshOrEmitError$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        i = i4;
                        booleanValue = z;
                        i2 = i5;
                        apiResult = apiResult2;
                        afterpayAppletResponse.getClass();
                        if (afterpayAppletResponse.credit_line_snapshot == null) {
                            break;
                        }
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$0 = flowCollector5;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$1 = null;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$2 = apiResult;
                        realAfterpayAppletRepository$refreshOrEmitError$1.L$3 = null;
                        realAfterpayAppletRepository$refreshOrEmitError$1.Z$0 = booleanValue;
                        realAfterpayAppletRepository$refreshOrEmitError$1.I$0 = i2;
                        realAfterpayAppletRepository$refreshOrEmitError$1.I$1 = i;
                        realAfterpayAppletRepository$refreshOrEmitError$1.label = 6;
                        break;
                    case 6:
                    case 7:
                        boolean z2 = realAfterpayAppletRepository$refreshOrEmitError$1.Z$0;
                        ApiResult apiResult3 = (ApiResult) realAfterpayAppletRepository$refreshOrEmitError$1.L$2;
                        flowCollector4 = realAfterpayAppletRepository$refreshOrEmitError$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        apiResult = apiResult3;
                        booleanValue = z2;
                        if (apiResult instanceof ApiResult.Failure) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realAfterpayAppletRepository$refreshOrEmitError$1 = new RealAfterpayAppletRepository$refreshOrEmitError$1(realAfterpayAppletRepository, continuationImpl);
        Object obj22 = realAfterpayAppletRepository$refreshOrEmitError$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (realAfterpayAppletRepository$refreshOrEmitError$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.set(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addViewedMessageId(String str, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$addViewedMessageId$1 realAfterpayAppletRepository$addViewedMessageId$1;
        int i;
        LinkedHashSet mutableSet;
        if (continuationImpl instanceof RealAfterpayAppletRepository$addViewedMessageId$1) {
            realAfterpayAppletRepository$addViewedMessageId$1 = (RealAfterpayAppletRepository$addViewedMessageId$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$addViewedMessageId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$addViewedMessageId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$addViewedMessageId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$addViewedMessageId$1.label;
                KeyValue keyValue = this.viewedDisplayMessageIds;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletRepository$addViewedMessageId$1.L$0 = str;
                    realAfterpayAppletRepository$addViewedMessageId$1.label = 1;
                    obj = keyValue.get(realAfterpayAppletRepository$addViewedMessageId$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realAfterpayAppletRepository$addViewedMessageId$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableSet = CollectionsKt.toMutableSet((Iterable) obj);
                if (mutableSet.add(str)) {
                    return Unit.INSTANCE;
                }
                realAfterpayAppletRepository$addViewedMessageId$1.L$0 = null;
                realAfterpayAppletRepository$addViewedMessageId$1.label = 2;
            }
        }
        realAfterpayAppletRepository$addViewedMessageId$1 = new RealAfterpayAppletRepository$addViewedMessageId$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$addViewedMessageId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$addViewedMessageId$1.label;
        KeyValue keyValue2 = this.viewedDisplayMessageIds;
        if (i != 0) {
        }
        mutableSet = CollectionsKt.toMutableSet((Iterable) obj2);
        if (mutableSet.add(str)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.set(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addViewedSectionId(String str, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$addViewedSectionId$1 realAfterpayAppletRepository$addViewedSectionId$1;
        int i;
        LinkedHashSet mutableSet;
        if (continuationImpl instanceof RealAfterpayAppletRepository$addViewedSectionId$1) {
            realAfterpayAppletRepository$addViewedSectionId$1 = (RealAfterpayAppletRepository$addViewedSectionId$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$addViewedSectionId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$addViewedSectionId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$addViewedSectionId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$addViewedSectionId$1.label;
                KeyValue keyValue = this.viewedSectionIds;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletRepository$addViewedSectionId$1.L$0 = str;
                    realAfterpayAppletRepository$addViewedSectionId$1.label = 1;
                    obj = keyValue.get(realAfterpayAppletRepository$addViewedSectionId$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realAfterpayAppletRepository$addViewedSectionId$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableSet = CollectionsKt.toMutableSet((Iterable) obj);
                if (mutableSet.add(str)) {
                    return Unit.INSTANCE;
                }
                realAfterpayAppletRepository$addViewedSectionId$1.L$0 = null;
                realAfterpayAppletRepository$addViewedSectionId$1.label = 2;
            }
        }
        realAfterpayAppletRepository$addViewedSectionId$1 = new RealAfterpayAppletRepository$addViewedSectionId$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$addViewedSectionId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$addViewedSectionId$1.label;
        KeyValue keyValue2 = this.viewedSectionIds;
        if (i != 0) {
        }
        mutableSet = CollectionsKt.toMutableSet((Iterable) obj2);
        if (mutableSet.add(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable displayMessage(AfterpayAppletResponse afterpayAppletResponse, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$displayMessage$1 realAfterpayAppletRepository$displayMessage$1;
        Object obj;
        int i;
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage;
        String str;
        try {
            if (continuationImpl instanceof RealAfterpayAppletRepository$displayMessage$1) {
                realAfterpayAppletRepository$displayMessage$1 = (RealAfterpayAppletRepository$displayMessage$1) continuationImpl;
                int i2 = realAfterpayAppletRepository$displayMessage$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realAfterpayAppletRepository$displayMessage$1.label = i2 - PKIFailureInfo.systemUnavail;
                    obj = realAfterpayAppletRepository$displayMessage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAfterpayAppletRepository$displayMessage$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        AfterpayAppletHome afterpayAppletHome = afterpayAppletResponse.home;
                        if (afterpayAppletHome != null && (onDisplayMessage = afterpayAppletHome.on_display_message) != null && (str = onDisplayMessage.message_id) != null) {
                            realAfterpayAppletRepository$displayMessage$1.L$1 = onDisplayMessage;
                            realAfterpayAppletRepository$displayMessage$1.label = 1;
                            obj = hasMessageBeenDisplayed(str, realAfterpayAppletRepository$displayMessage$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    onDisplayMessage = realAfterpayAppletRepository$displayMessage$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return onDisplayMessage;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.errorReporter.report(new DatabaseError(e2, Recorder$$ExternalSyntheticOutline2.m("Failed to check if display message should be shown: ", e2.getMessage())), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
        realAfterpayAppletRepository$displayMessage$1 = new RealAfterpayAppletRepository$displayMessage$1(this, continuationImpl);
        obj = realAfterpayAppletRepository$displayMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$displayMessage$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r10.emit(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitHomeData(FlowCollector flowCollector, AfterpayAppletResponse afterpayAppletResponse, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$emitHomeData$1 realAfterpayAppletRepository$emitHomeData$1;
        Serializable serializable;
        int i;
        Serializable eligibleRetroTransactions;
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage;
        FlowCollector flowCollector2;
        AfterpayAppletResponse afterpayAppletResponse2;
        if (continuationImpl instanceof RealAfterpayAppletRepository$emitHomeData$1) {
            realAfterpayAppletRepository$emitHomeData$1 = (RealAfterpayAppletRepository$emitHomeData$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$emitHomeData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$emitHomeData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$emitHomeData$1.result;
                serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$emitHomeData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletRepository$emitHomeData$1.L$0 = flowCollector;
                    realAfterpayAppletRepository$emitHomeData$1.L$1 = afterpayAppletResponse;
                    realAfterpayAppletRepository$emitHomeData$1.label = 1;
                    obj = displayMessage(afterpayAppletResponse, realAfterpayAppletRepository$emitHomeData$1);
                } else if (i == 1) {
                    afterpayAppletResponse = realAfterpayAppletRepository$emitHomeData$1.L$1;
                    flowCollector = realAfterpayAppletRepository$emitHomeData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    onDisplayMessage = realAfterpayAppletRepository$emitHomeData$1.L$2;
                    afterpayAppletResponse2 = realAfterpayAppletRepository$emitHomeData$1.L$1;
                    flowCollector2 = realAfterpayAppletRepository$emitHomeData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    HomeResult.HomeData homeData = new HomeResult.HomeData(afterpayAppletResponse2, (List) obj, onDisplayMessage);
                    realAfterpayAppletRepository$emitHomeData$1.L$0 = null;
                    realAfterpayAppletRepository$emitHomeData$1.L$1 = null;
                    realAfterpayAppletRepository$emitHomeData$1.L$2 = null;
                    realAfterpayAppletRepository$emitHomeData$1.label = 3;
                }
                AfterpayAppletHome.OnDisplayMessage onDisplayMessage2 = (AfterpayAppletHome.OnDisplayMessage) obj;
                realAfterpayAppletRepository$emitHomeData$1.L$0 = flowCollector;
                realAfterpayAppletRepository$emitHomeData$1.L$1 = afterpayAppletResponse;
                realAfterpayAppletRepository$emitHomeData$1.L$2 = onDisplayMessage2;
                realAfterpayAppletRepository$emitHomeData$1.label = 2;
                eligibleRetroTransactions = getEligibleRetroTransactions(afterpayAppletResponse, realAfterpayAppletRepository$emitHomeData$1);
                if (eligibleRetroTransactions != serializable) {
                    obj = eligibleRetroTransactions;
                    onDisplayMessage = onDisplayMessage2;
                    AfterpayAppletResponse afterpayAppletResponse3 = afterpayAppletResponse;
                    flowCollector2 = flowCollector;
                    afterpayAppletResponse2 = afterpayAppletResponse3;
                    HomeResult.HomeData homeData2 = new HomeResult.HomeData(afterpayAppletResponse2, (List) obj, onDisplayMessage);
                    realAfterpayAppletRepository$emitHomeData$1.L$0 = null;
                    realAfterpayAppletRepository$emitHomeData$1.L$1 = null;
                    realAfterpayAppletRepository$emitHomeData$1.L$2 = null;
                    realAfterpayAppletRepository$emitHomeData$1.label = 3;
                }
                return serializable;
            }
        }
        realAfterpayAppletRepository$emitHomeData$1 = new RealAfterpayAppletRepository$emitHomeData$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$emitHomeData$1.result;
        serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$emitHomeData$1.label;
        if (i != 0) {
        }
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage22 = (AfterpayAppletHome.OnDisplayMessage) obj2;
        realAfterpayAppletRepository$emitHomeData$1.L$0 = flowCollector;
        realAfterpayAppletRepository$emitHomeData$1.L$1 = afterpayAppletResponse;
        realAfterpayAppletRepository$emitHomeData$1.L$2 = onDisplayMessage22;
        realAfterpayAppletRepository$emitHomeData$1.label = 2;
        eligibleRetroTransactions = getEligibleRetroTransactions(afterpayAppletResponse, realAfterpayAppletRepository$emitHomeData$1);
        if (eligibleRetroTransactions != serializable) {
        }
        return serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceExpireAfterpayAppletCache(ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$forceExpireAfterpayAppletCache$1 realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1;
        int i;
        if (continuationImpl instanceof RealAfterpayAppletRepository$forceExpireAfterpayAppletCache$1) {
            realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1 = (RealAfterpayAppletRepository$forceExpireAfterpayAppletCache$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label = 1;
                    this.expiredAfterpayAppletResponse.setValue(null);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AmountPickerCondensedView.AnonymousClass14 anonymousClass14 = new AmountPickerCondensedView.AnonymousClass14(this, continuation, 3);
                realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label = 2;
                Object withContext = JobKt.withContext(this.ioContext, anonymousClass14, realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1);
                return withContext != coroutineSingletons ? coroutineSingletons : withContext;
            }
        }
        realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1 = new RealAfterpayAppletRepository$forceExpireAfterpayAppletCache$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        AmountPickerCondensedView.AnonymousClass14 anonymousClass142 = new AmountPickerCondensedView.AnonymousClass14(this, continuation2, 3);
        realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1.label = 2;
        Object withContext2 = JobKt.withContext(this.ioContext, anonymousClass142, realAfterpayAppletRepository$forceExpireAfterpayAppletCache$1);
        if (withContext2 != coroutineSingletons2) {
        }
    }

    public final FlowQuery$mapToList$$inlined$map$1 getAfterpayAppletCache() {
        LocalTabContentQueries localTabContentQueries = this.accountDatabase.afterpayAppletQueries;
        localTabContentQueries.getClass();
        AfterpayAppletQueries$forKey$2 afterpayAppletQueries$forKey$2 = AfterpayAppletQueries$forKey$2.INSTANCE;
        return DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(localTabContentQueries, new ContextKt$$ExternalSyntheticLambda1(localTabContentQueries, (byte) 0), 2)), this.ioContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAllViewedMessageIds(ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$getAllViewedMessageIds$1 realAfterpayAppletRepository$getAllViewedMessageIds$1;
        int i;
        if (continuationImpl instanceof RealAfterpayAppletRepository$getAllViewedMessageIds$1) {
            realAfterpayAppletRepository$getAllViewedMessageIds$1 = (RealAfterpayAppletRepository$getAllViewedMessageIds$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$getAllViewedMessageIds$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$getAllViewedMessageIds$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$getAllViewedMessageIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$getAllViewedMessageIds$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletRepository$getAllViewedMessageIds$1.label = 1;
                    obj = this.viewedDisplayMessageIds.get(realAfterpayAppletRepository$getAllViewedMessageIds$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return CollectionsKt.toList((Iterable) obj);
            }
        }
        realAfterpayAppletRepository$getAllViewedMessageIds$1 = new RealAfterpayAppletRepository$getAllViewedMessageIds$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$getAllViewedMessageIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$getAllViewedMessageIds$1.label;
        if (i != 0) {
        }
        return CollectionsKt.toList((Iterable) obj2);
    }

    public final Serializable getEligibleRetroTransactions(AfterpayAppletResponse afterpayAppletResponse, ContinuationImpl continuationImpl) {
        List<AfterpayAppletHomeSection> list;
        AppletCardSection access$getCardSection;
        zzuv zzuvVar;
        AppletCardSection.TransactionList access$getTransactionList;
        List list2;
        OrderListSection access$getOrderList;
        YGFloatOptional yGFloatOptional;
        OrderListSection.EligibleRetroOrders access$getEligibleOrders;
        List list3;
        ArrayList arrayList = new ArrayList();
        AfterpayAppletHome afterpayAppletHome = afterpayAppletResponse.home;
        if (afterpayAppletHome != null && (list = afterpayAppletHome.sections) != null) {
            for (AfterpayAppletHomeSection afterpayAppletHomeSection : list) {
                LocalMenuHoursViewKt localMenuHoursViewKt = afterpayAppletHomeSection.section;
                if (localMenuHoursViewKt != null && (access$getOrderList = EarningsHomeUi.Section.AbstractC0087Section.access$getOrderList(localMenuHoursViewKt)) != null && (yGFloatOptional = access$getOrderList.screen_content) != null && (access$getEligibleOrders = EarningsHomeUi.Section.AbstractC0087Section.access$getEligibleOrders(yGFloatOptional)) != null && (list3 = access$getEligibleOrders.order_rows) != null) {
                    arrayList.addAll(list3);
                }
                LocalMenuHoursViewKt localMenuHoursViewKt2 = afterpayAppletHomeSection.section;
                if (localMenuHoursViewKt2 != null && (access$getCardSection = EarningsHomeUi.Section.AbstractC0087Section.access$getCardSection(localMenuHoursViewKt2)) != null && (zzuvVar = access$getCardSection.content) != null && (access$getTransactionList = EarningsHomeUi.Section.AbstractC0087Section.access$getTransactionList(zzuvVar)) != null && (list2 = access$getTransactionList.order_rows) != null) {
                    arrayList.addAll(list2);
                }
            }
        }
        return arrayList.isEmpty() ? EmptyList.INSTANCE : ((RealAfterpayEligibleRetroTransactionsProvider) this.retroTransactions).processTransactions(arrayList, continuationImpl);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final Flow getHome() {
        return FlowKt.distinctUntilChanged(new SafeFlow(new EditProfilePresenter$models$2$1(FlowKt.combine(getAfterpayAppletCache(), this.viewedDisplayMessageIds.observe(), this.expiredAfterpayAppletResponse, new RealAfterpayAppletRepository$getHome$1()), (Continuation) null, this, 23)));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleSuccessfulAppletResponse(AfterpayAppletResponse afterpayAppletResponse, String str, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$handleSuccessfulAppletResponse$1 realAfterpayAppletRepository$handleSuccessfulAppletResponse$1;
        int i;
        long j;
        long j2;
        ProtoParsingError protoParsingExceptionFor;
        if (continuationImpl instanceof RealAfterpayAppletRepository$handleSuccessfulAppletResponse$1) {
            realAfterpayAppletRepository$handleSuccessfulAppletResponse$1 = (RealAfterpayAppletRepository$handleSuccessfulAppletResponse$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.label;
                SampleStrategy sampleStrategy = this.oneErrorPerAppSessionStrategy;
                ErrorReporter errorReporter = this.errorReporter;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    try {
                        AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
                        try {
                            Long l = afterpayAppletResponse.expired_at_ms;
                            if (l == null) {
                                try {
                                    throw new IllegalArgumentException("expired_at_ms");
                                } catch (Exception e) {
                                    errorReporter.report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletResponse.class), afterpayAppletParsingErrorFactory, null), sampleStrategy);
                                    l = null;
                                }
                            }
                            m.element = l;
                        } catch (Exception e2) {
                            protoParsingExceptionFor = RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(afterpayAppletResponse.getClass()), afterpayAppletParsingErrorFactory, null);
                            throw protoParsingExceptionFor;
                        }
                    } catch (com.squareup.cash.banking.observability.ProtoParsingError e3) {
                        errorReporter.report(e3, sampleStrategy);
                    }
                    Long l2 = (Long) m.element;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        long millis = this.clock.millis();
                        if (longValue < millis) {
                            realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.J$0 = longValue;
                            realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.J$1 = millis;
                            realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.label = 1;
                            this.expiredAfterpayAppletResponse.setValue(afterpayAppletResponse);
                            if (Unit.INSTANCE == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            j = longValue;
                            j2 = millis;
                        } else {
                            JobKt.launch$default(this.scope, null, null, new RepeatOnIntervalTaskRunner$repeatOn$2(11, longValue, this, afterpayAppletResponse, str, (Continuation) null), 3);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.J$1;
                j = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.J$0;
                SafeTrace.throwOnFailure(obj);
                errorReporter.report(new AfterpayAppletStaleResponseError(j, j2), sampleStrategy);
                return Unit.INSTANCE;
            }
        }
        realAfterpayAppletRepository$handleSuccessfulAppletResponse$1 = new RealAfterpayAppletRepository$handleSuccessfulAppletResponse$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$handleSuccessfulAppletResponse$1.label;
        SampleStrategy sampleStrategy2 = this.oneErrorPerAppSessionStrategy;
        ErrorReporter errorReporter2 = this.errorReporter;
        if (i != 0) {
        }
        errorReporter2.report(new AfterpayAppletStaleResponseError(j, j2), sampleStrategy2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasMessageBeenDisplayed(String str, ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$hasMessageBeenDisplayed$1 realAfterpayAppletRepository$hasMessageBeenDisplayed$1;
        int i;
        if (continuationImpl instanceof RealAfterpayAppletRepository$hasMessageBeenDisplayed$1) {
            realAfterpayAppletRepository$hasMessageBeenDisplayed$1 = (RealAfterpayAppletRepository$hasMessageBeenDisplayed$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$hasMessageBeenDisplayed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$hasMessageBeenDisplayed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayAppletRepository$hasMessageBeenDisplayed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$hasMessageBeenDisplayed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletRepository$hasMessageBeenDisplayed$1.L$0 = str;
                    realAfterpayAppletRepository$hasMessageBeenDisplayed$1.label = 1;
                    obj = this.viewedDisplayMessageIds.get(realAfterpayAppletRepository$hasMessageBeenDisplayed$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realAfterpayAppletRepository$hasMessageBeenDisplayed$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(((Set) obj).contains(str));
            }
        }
        realAfterpayAppletRepository$hasMessageBeenDisplayed$1 = new RealAfterpayAppletRepository$hasMessageBeenDisplayed$1(this, continuationImpl);
        Object obj2 = realAfterpayAppletRepository$hasMessageBeenDisplayed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$hasMessageBeenDisplayed$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((Set) obj2).contains(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (r12 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshAfterpayApplet(ContinuationImpl continuationImpl) {
        RealAfterpayAppletRepository$refreshAfterpayApplet$1 realAfterpayAppletRepository$refreshAfterpayApplet$1;
        Object obj;
        int i;
        Object obj2;
        List list;
        Object obj3;
        boolean z;
        CashSuggestClientService cashSuggestClientService;
        ApiResult apiResult;
        ApiResult apiResult2;
        if (continuationImpl instanceof RealAfterpayAppletRepository$refreshAfterpayApplet$1) {
            realAfterpayAppletRepository$refreshAfterpayApplet$1 = (RealAfterpayAppletRepository$refreshAfterpayApplet$1) continuationImpl;
            int i2 = realAfterpayAppletRepository$refreshAfterpayApplet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletRepository$refreshAfterpayApplet$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj4 = realAfterpayAppletRepository$refreshAfterpayApplet$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletRepository$refreshAfterpayApplet$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj4);
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 1;
                    obj4 = getAllViewedMessageIds(realAfterpayAppletRepository$refreshAfterpayApplet$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj4);
                } else {
                    if (i == 2) {
                        List list2 = realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        list = list2;
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = list;
                        CashSuggestClientService cashSuggestClientService2 = this.appService;
                        realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1 = cashSuggestClientService2;
                        realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0 = booleanValue;
                        realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 3;
                        obj3 = this.viewedSectionIds.get(realAfterpayAppletRepository$refreshAfterpayApplet$1);
                        if (obj3 != obj) {
                            z = booleanValue;
                            obj4 = obj3;
                            cashSuggestClientService = cashSuggestClientService2;
                            AfterpayAppletRequest afterpayAppletRequest = new AfterpayAppletRequest(list, Boolean.valueOf(z), CollectionsKt.toList((Iterable) obj4));
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = null;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1 = null;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0 = z;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 4;
                            obj4 = cashSuggestClientService.afterpayAppletHome(afterpayAppletRequest, realAfterpayAppletRepository$refreshAfterpayApplet$1);
                        }
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            apiResult2 = (ApiResult) realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1;
                            List list3 = realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0;
                            SafeTrace.throwOnFailure(obj4);
                            apiResult = apiResult2;
                            if (apiResult instanceof ApiResult.Failure) {
                                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                                if (failure instanceof ApiResult.Failure.HttpFailure) {
                                    this.errorReporter.report(new AfterpayAppletEntrypointHttpError(((ApiResult.Failure.HttpFailure) failure).code), this.oneErrorPerAppSessionStrategy);
                                }
                            }
                            return apiResult;
                        }
                        z = realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0;
                        List list4 = realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        apiResult = (ApiResult) obj4;
                        if (apiResult instanceof ApiResult.Success) {
                            AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) ((ApiResult.Success) apiResult).response;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = null;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1 = apiResult;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0 = z;
                            realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 5;
                            if (handleSuccessfulAppletResponse(afterpayAppletResponse, "Failed to save afterpay response to cache", realAfterpayAppletRepository$refreshAfterpayApplet$1) != obj) {
                                apiResult2 = apiResult;
                                apiResult = apiResult2;
                            }
                            return obj;
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                        }
                        return apiResult;
                    }
                    z = realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0;
                    cashSuggestClientService = (CashSuggestClientService) realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1;
                    list = realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0;
                    SafeTrace.throwOnFailure(obj4);
                    AfterpayAppletRequest afterpayAppletRequest2 = new AfterpayAppletRequest(list, Boolean.valueOf(z), CollectionsKt.toList((Iterable) obj4));
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = null;
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1 = null;
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0 = z;
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 4;
                    obj4 = cashSuggestClientService.afterpayAppletHome(afterpayAppletRequest2, realAfterpayAppletRepository$refreshAfterpayApplet$1);
                }
                List list5 = (List) obj4;
                realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = list5;
                realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 2;
                obj2 = this.hasViewedApplet.get(realAfterpayAppletRepository$refreshAfterpayApplet$1);
                if (obj2 != obj) {
                    list = list5;
                    obj4 = obj2;
                    boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = list;
                    CashSuggestClientService cashSuggestClientService22 = this.appService;
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.L$1 = cashSuggestClientService22;
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.Z$0 = booleanValue2;
                    realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 3;
                    obj3 = this.viewedSectionIds.get(realAfterpayAppletRepository$refreshAfterpayApplet$1);
                    if (obj3 != obj) {
                    }
                }
                return obj;
            }
        }
        realAfterpayAppletRepository$refreshAfterpayApplet$1 = new RealAfterpayAppletRepository$refreshAfterpayApplet$1(this, continuationImpl);
        Object obj42 = realAfterpayAppletRepository$refreshAfterpayApplet$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletRepository$refreshAfterpayApplet$1.label;
        if (i != 0) {
        }
        List list52 = (List) obj42;
        realAfterpayAppletRepository$refreshAfterpayApplet$1.L$0 = list52;
        realAfterpayAppletRepository$refreshAfterpayApplet$1.label = 2;
        obj2 = this.hasViewedApplet.get(realAfterpayAppletRepository$refreshAfterpayApplet$1);
        if (obj2 != obj) {
        }
        return obj;
    }
}
