package com.squareup.cash.db2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class WebLoginConfigQueries$expiresAt$2 extends FunctionReferenceImpl implements Function1 {
    public static final WebLoginConfigQueries$expiresAt$2 INSTANCE = new WebLoginConfigQueries$expiresAt$2(1, ExpiresAt.class, "<init>", "<init>(Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ExpiresAt((Long) obj);
    }
}
