package androidx.compose.ui.node;

import androidx.core.os.BundleKt;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter$models$handleSubmitAction$result$2;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractSubmitBlocker;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractViewBlockerResponse;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.checkers.RealIntegrityCheckFactory;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class PointerInputModifierNodeKt {
    public static final ListBuilder createAll(RealIntegrityCheckFactory realIntegrityCheckFactory, IntegrityCheckFactory$Type... integrityCheckFactory$TypeArr) {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        for (IntegrityCheckFactory$Type integrityCheckFactory$Type : integrityCheckFactory$TypeArr) {
            createListBuilder.add(realIntegrityCheckFactory.create(integrityCheckFactory$Type));
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public static final Pair defaultErrorProvider(ApiResult apiResult, AndroidStringManager androidStringManager, int i) {
        ApiResult.Failure failure = apiResult instanceof ApiResult.Failure ? (ApiResult.Failure) apiResult : null;
        return new Pair(null, (failure == null || androidStringManager == null) ? null : TextUtilsCompat.errorMessaging(androidStringManager, failure, Integer.valueOf(i)).message);
    }

    public static final NodeCoordinator getLayoutCoordinates(PointerInputModifierNode pointerInputModifierNode) {
        return DepthSortedSetKt.m864requireCoordinator64DMado(pointerInputModifierNode, 16);
    }

    public static final BlockerResponse.Error toBlockerResponse(ApiResult.Failure failure, AndroidStringManager androidStringManager, int i) {
        failure.getClass();
        return new BlockerResponse.Error((String) null, (String) defaultErrorProvider(failure, androidStringManager, i).second, ((failure instanceof ApiResult.Failure.NetworkFailure) || ((failure instanceof ApiResult.Failure.HttpFailure) && !BundleKt.isRetryable(failure))) ? BlockerFlowInteractViewBlockerResponse.Status.NETWORK_ERROR : BlockerFlowInteractViewBlockerResponse.Status.LOGICAL_ERROR);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object trackBlockerPotentialSubmissionAnalytics(Analytics analytics, BlockersData blockersData, AndroidStringManager androidStringManager, MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3, int i, FormBlockerPresenter$models$handleSubmitAction$result$2 formBlockerPresenter$models$handleSubmitAction$result$2, ContinuationImpl continuationImpl) {
        BlockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1 blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1;
        int i2;
        Result trackBlockerSubmissionAnalyticsActions;
        ApiResult apiResult;
        if (continuationImpl instanceof BlockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1) {
            blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1 = (BlockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1) continuationImpl;
            int i3 = blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalyticsActions = trackBlockerSubmissionAnalyticsActions(analytics, androidStringManager, blockersData, i, new PoolGoalMetKt$$ExternalSyntheticLambda6(moveBitcoinViewKt$$ExternalSyntheticLambda3, androidStringManager, i, 8));
                    ((HeroCardViewKt$$ExternalSyntheticLambda4) trackBlockerSubmissionAnalyticsActions.text).invoke();
                    blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.L$5 = trackBlockerSubmissionAnalyticsActions;
                    blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.label = 1;
                    obj = formBlockerPresenter$models$handleSubmitAction$result$2.invoke(blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    trackBlockerSubmissionAnalyticsActions = blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.L$5;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    return null;
                }
                ((BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3) trackBlockerSubmissionAnalyticsActions.resultMetadata).invoke(apiResult);
                return apiResult;
            }
        }
        blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1 = new BlockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1(continuationImpl);
        Object obj3 = blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = blockerSubmissionAnalyticsKt$trackBlockerPotentialSubmissionAnalytics$1.label;
        if (i2 != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult != null) {
        }
    }

    public static final void trackBlockerSubmission(Analytics analytics, BlockersData blockersData, String str, String str2, String str3, BlockerFlowReferrerType blockerFlowReferrerType) {
        analytics.getClass();
        blockersData.getClass();
        str.getClass();
        ClientScenario clientScenario = blockersData.clientScenario;
        Flow$Type flow$Type = blockersData.flowType;
        String nextBlockerId = blockersData.getNextBlockerId();
        Long l = blockersData.blockerStartTime;
        analytics.track(new BlockerFlowInteractSubmitBlocker(nextBlockerId, str2, clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, str, l != null ? Integer.valueOf((int) (System.currentTimeMillis() - l.longValue())) : null, str3, blockerFlowReferrerType), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object trackBlockerSubmissionAnalytics(int i, BlockersData blockersData, Analytics analytics, AndroidStringManager androidStringManager, Continuation continuation, Function1 function1, Function1 function12) {
        BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7 blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7;
        int i2;
        Result trackBlockerSubmissionAnalyticsActions;
        if (continuation instanceof BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7) {
            blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7 = (BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7) continuation;
            int i3 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalyticsActions = trackBlockerSubmissionAnalyticsActions(analytics, androidStringManager, blockersData, i, new PoolGoalMetKt$$ExternalSyntheticLambda6(function1, androidStringManager, i, 8));
                    ((HeroCardViewKt$$ExternalSyntheticLambda4) trackBlockerSubmissionAnalyticsActions.text).invoke();
                    blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.L$5 = trackBlockerSubmissionAnalyticsActions;
                    blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.label = 1;
                    obj = function12.invoke(blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    trackBlockerSubmissionAnalyticsActions = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.L$5;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                ((BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3) trackBlockerSubmissionAnalyticsActions.resultMetadata).invoke(apiResult);
                return apiResult;
            }
        }
        blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7 = new BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7(continuation);
        Object obj3 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalytics$7.label;
        if (i2 != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj3;
        ((BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3) trackBlockerSubmissionAnalyticsActions.resultMetadata).invoke(apiResult2);
        return apiResult2;
    }

    public static /* synthetic */ Object trackBlockerSubmissionAnalytics$default(int i, BlockersData blockersData, Analytics analytics, AndroidStringManager androidStringManager, Continuation continuation, Function1 function1, Function1 function12) {
        if ((i & 8) != 0) {
            function1 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(7);
        }
        return trackBlockerSubmissionAnalytics((i & 16) != 0 ? R.string.blockers_retrofit_error_message : R.string.generic_network_error, blockersData, analytics, androidStringManager, continuation, function1, function12);
    }

    public static final Result trackBlockerSubmissionAnalyticsActions(Analytics analytics, AndroidStringManager androidStringManager, BlockersData blockersData, int i, Function1 function1) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String nextBlockerType = blockersData.getNextBlockerType();
        String str = blockersData.flowToken;
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        String str2 = analyticsData != null ? analyticsData.referrerFlowToken : null;
        BlockerFlowReferrerType blockerFlowReferrerType = analyticsData != null ? analyticsData.referrerFlowType : null;
        return new Result(22, new HeroCardViewKt$$ExternalSyntheticLambda4(ref$ObjectRef, analytics, blockersData, str, nextBlockerType, str2, blockerFlowReferrerType, 3), new BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3(function1, androidStringManager, i, blockersData, ref$ObjectRef, analytics, str, nextBlockerType, str2, blockerFlowReferrerType));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object trackBlockerSubmissionAnalyticsInternal2(Analytics analytics, AndroidStringManager androidStringManager, BlockersData blockersData, int i, Function1 function1, Function1 function12, ContinuationImpl continuationImpl) {
        BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1 blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1;
        int i2;
        Result trackBlockerSubmissionAnalyticsActions;
        if (continuationImpl instanceof BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1) {
            blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1 = (BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1) continuationImpl;
            int i3 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalyticsActions = trackBlockerSubmissionAnalyticsActions(analytics, androidStringManager, blockersData, i, function1);
                    ((HeroCardViewKt$$ExternalSyntheticLambda4) trackBlockerSubmissionAnalyticsActions.text).invoke();
                    blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.L$5 = trackBlockerSubmissionAnalyticsActions;
                    blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.label = 1;
                    obj = function12.invoke(blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    trackBlockerSubmissionAnalyticsActions = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.L$5;
                    SafeTrace.throwOnFailure(obj);
                }
                ((BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3) trackBlockerSubmissionAnalyticsActions.resultMetadata).invoke(obj);
                return obj;
            }
        }
        blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1 = new BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1(continuationImpl);
        Object obj3 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsInternal2$1.label;
        if (i2 != 0) {
        }
        ((BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3) trackBlockerSubmissionAnalyticsActions.resultMetadata).invoke(obj3);
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object trackBlockerSubmissionAnalyticsWithNullableResult(Analytics analytics, BlockersData blockersData, AndroidStringManager androidStringManager, MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3, int i, Function1 function1, ContinuationImpl continuationImpl) {
        BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1 blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1;
        int i2;
        Result trackBlockerSubmissionAnalyticsActions;
        ApiResult apiResult;
        if (continuationImpl instanceof BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1) {
            blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1 = (BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1) continuationImpl;
            int i3 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalyticsActions = trackBlockerSubmissionAnalyticsActions(analytics, androidStringManager, blockersData, i, new PoolGoalMetKt$$ExternalSyntheticLambda6(moveBitcoinViewKt$$ExternalSyntheticLambda3, androidStringManager, i, 8));
                    ((HeroCardViewKt$$ExternalSyntheticLambda4) trackBlockerSubmissionAnalyticsActions.text).invoke();
                    blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.L$5 = trackBlockerSubmissionAnalyticsActions;
                    blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.label = 1;
                    obj = function1.invoke(blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    trackBlockerSubmissionAnalyticsActions = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.L$5;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    return null;
                }
                ((BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3) trackBlockerSubmissionAnalyticsActions.resultMetadata).invoke(apiResult);
                return apiResult;
            }
        }
        blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1 = new BlockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1(continuationImpl);
        Object obj3 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = blockerSubmissionAnalyticsKt$trackBlockerSubmissionAnalyticsWithNullableResult$1.label;
        if (i2 != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult != null) {
        }
    }
}
