package com.squareup.cash.db2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class WebLoginConfigQueries$select$2 extends FunctionReferenceImpl implements Function2 {
    public static final WebLoginConfigQueries$select$2 INSTANCE = new WebLoginConfigQueries$select$2(2, WebLoginConfig.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new WebLoginConfig((String) obj, (Long) obj2);
    }
}
