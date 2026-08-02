package com.nimbusds.jose.util;

import android.os.Parcel;
import evaluation.CommonLogicEvaluator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import operations.array.ArrayOperation;
import operations.array.ArrayOperationInputData;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public abstract class Base64Codec {
    public static ArrayOperationInputData createOperationInput(ArrayOperation arrayOperation, JsonLogicList jsonLogicList, Object obj, CommonLogicEvaluator commonLogicEvaluator) {
        List unwrapDataByEvaluation = arrayOperation.unwrapDataByEvaluation(jsonLogicList, obj, commonLogicEvaluator);
        Object orNull = CollectionsKt.getOrNull(1, jsonLogicList);
        boolean isExpression = AnyUtilsKt.isExpression(orNull);
        Object obj2 = orNull;
        if (!isExpression) {
            obj2 = null;
        }
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        return new ArrayOperationInputData(unwrapDataByEvaluation, map, arrayOperation.getOperationDefault(map, jsonLogicList));
    }

    public static byte encodeDigitBase64URL(int i) {
        int tpLT = tpLT(i, 26);
        int tpGT = tpGT(i, 25) & tpLT(i, 52);
        return (byte) (tpSelect(tpGT(i, 51) & tpLT(i, 62), i - 4, 0) | tpSelect(tpLT, i + 65, 0) | tpSelect(tpGT, i + 71, 0) | tpSelect(tpEq(i, 62), 45, 0) | tpSelect(tpEq(i, 63), 95, 0));
    }

    public static int tpEq(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    public static int tpGT(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    public static int tpLT(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    public static int tpSelect(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }

    /* renamed from: write-2ep6_7w, reason: not valid java name */
    public static void m2175write2ep6_7w(String str, Parcel parcel) {
        str.getClass();
        parcel.getClass();
        parcel.writeString(str);
    }
}
