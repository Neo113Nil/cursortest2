package com.squareup.cash.globalsearch.views;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class GlobalSearchTransitionFactoryKt$mainTabToGlobalSearch$1 extends FunctionReferenceImpl implements Function1 {
    public static final GlobalSearchTransitionFactoryKt$mainTabToGlobalSearch$1 INSTANCE = new GlobalSearchTransitionFactoryKt$mainTabToGlobalSearch$1(1, QuickAccessBarKt.class, "slideOffset", "slideOffset(I)I", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((Number) obj).intValue() / 10);
    }
}
