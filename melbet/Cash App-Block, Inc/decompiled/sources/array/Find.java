package array;

import com.squareup.cash.api.ContextKt;
import evaluation.CommonLogicEvaluator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import operation.FunctionalLogicOperation;
import type.JsonLogicList;
import unwrap.EvaluatingUnwrapper;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public final class Find implements FunctionalLogicOperation, EvaluatingUnwrapper {
    public static final Find INSTANCE = new Find();

    @Override // operation.FunctionalLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2, CommonLogicEvaluator commonLogicEvaluator) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        List unwrapDataByEvaluation = ContextKt.unwrapDataByEvaluation(asList, obj2, commonLogicEvaluator);
        Object orNull = CollectionsKt.getOrNull(1, asList);
        if (!AnyUtilsKt.isExpression(orNull)) {
            orNull = null;
        }
        Map map = orNull instanceof Map ? (Map) orNull : null;
        if (map != null && unwrapDataByEvaluation != null) {
            for (Object obj3 : unwrapDataByEvaluation) {
                if (Intrinsics.areEqual(commonLogicEvaluator.executeExpression(map, obj3), Boolean.TRUE)) {
                    return obj3;
                }
            }
        }
        return null;
    }

    @Override // unwrap.EvaluatingUnwrapper
    public final List unwrapDataByEvaluation(List list, Object obj, CommonLogicEvaluator commonLogicEvaluator) {
        throw null;
    }
}
