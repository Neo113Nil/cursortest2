package com.squareup.cash.db2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2 extends FunctionReferenceImpl implements Function2 {
    public static final ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2 INSTANCE = new ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2(2, LoadCacheableBackgrounds.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new LoadCacheableBackgrounds((String) obj, (String) obj2);
    }
}
