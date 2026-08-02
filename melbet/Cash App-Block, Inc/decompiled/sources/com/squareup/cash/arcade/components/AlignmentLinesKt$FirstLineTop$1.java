package com.squareup.cash.arcade.components;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class AlignmentLinesKt$FirstLineTop$1 extends FunctionReferenceImpl implements Function2 {
    public static final AlignmentLinesKt$FirstLineTop$1 INSTANCE = new AlignmentLinesKt$FirstLineTop$1(2, Integer.class, "min", "min(II)I", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Integer.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
