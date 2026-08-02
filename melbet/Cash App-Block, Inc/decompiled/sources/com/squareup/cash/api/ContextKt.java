package com.squareup.cash.api;

import androidx.camera.core.ImageCaptureException;
import androidx.compose.ui.unit.Dp;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import evaluation.CommonLogicEvaluator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import type.JsonLogicList;
import utils.AnyUtilsKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes9.dex */
public abstract class ContextKt {
    public static final ResponseContext mergeResponseContexts(SubmitBlockerResponse.AppResponseContext appResponseContext, SubmitBlockerResponse.BlockerResponseContext blockerResponseContext, SubmitBlockerResponse.FlowResponseContext flowResponseContext) {
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog;
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog2;
        String str = null;
        if (appResponseContext == null && blockerResponseContext == null && flowResponseContext == null) {
            return null;
        }
        ScenarioPlan scenarioPlan = flowResponseContext != null ? flowResponseContext.scenario_plan : null;
        StatusResult statusResult = flowResponseContext != null ? flowResponseContext.status_result : null;
        String str2 = (blockerResponseContext == null || (dialog2 = blockerResponseContext.dialog) == null) ? null : dialog2.message;
        SyncEntitiesResponse syncEntitiesResponse = appResponseContext != null ? appResponseContext.sync_entities_data : null;
        Profile profile = appResponseContext != null ? appResponseContext.profile : null;
        if (blockerResponseContext != null && (dialog = blockerResponseContext.dialog) != null) {
            str = dialog.title;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        return new ResponseContext(scenarioPlan, statusResult, emptyList, emptyList, str2, syncEntitiesResponse, profile, str, 3407872);
    }

    public static final Dp resolveDp(ExpressionEvaluator expressionEvaluator, GenieViewState genieViewState, Expression expression) {
        Object failure;
        expressionEvaluator.getClass();
        genieViewState.getClass();
        if (expression == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = Double.valueOf(expressionEvaluator.evaluate(expression, genieViewState).numericValue());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Double d = (Double) failure;
        if (d != null) {
            return new Dp((float) d.doubleValue());
        }
        return null;
    }

    public static final Object resolveProtoEnum(Expression expression, ExpressionEvaluator expressionEvaluator, GenieViewState genieViewState, Function1 function1) {
        Object failure;
        if (expression == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = Integer.valueOf((int) expressionEvaluator.evaluate(expression, genieViewState).numericValue());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        if (num != null) {
            return function1.invoke(num);
        }
        return null;
    }

    public static final SubmitBlockerRequest.AppRequestContext toAppRequestContext(RequestContext requestContext) {
        requestContext.getClass();
        return new SubmitBlockerRequest.AppRequestContext(requestContext.all_known_ranges, ByteString.EMPTY);
    }

    public static final RequestContext toRequestContext(SubmitBlockerRequest.AppRequestContext appRequestContext) {
        appRequestContext.getClass();
        return new RequestContext(null, null, null, null, appRequestContext.all_known_ranges, null, null, null, 7935);
    }

    public static final ResponseContext toResponseContext(SubmitBlockerResponse.AppResponseContext appResponseContext) {
        appResponseContext.getClass();
        return new ResponseContext(null, null, null, null, null, appResponseContext.sync_entities_data, appResponseContext.profile, null, 4173823);
    }

    public static List unwrapDataByEvaluation(JsonLogicList jsonLogicList, Object obj, CommonLogicEvaluator commonLogicEvaluator) {
        Object unwrapOperationData = unwrapOperationData(CollectionsKt.firstOrNull((List) jsonLogicList), obj, commonLogicEvaluator);
        if (unwrapOperationData instanceof List) {
            return (List) unwrapOperationData;
        }
        return null;
    }

    public static Object unwrapOperationData(Object obj, Object obj2, CommonLogicEvaluator commonLogicEvaluator) {
        if (!(obj instanceof List)) {
            if (!AnyUtilsKt.isExpression(obj)) {
                return obj;
            }
            obj.getClass();
            return commonLogicEvaluator.executeExpression((Map) obj, obj2);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(unwrapOperationData(it.next(), obj2, commonLogicEvaluator));
        }
        return arrayList;
    }

    public abstract void onError(ImageCaptureException imageCaptureException);
}
