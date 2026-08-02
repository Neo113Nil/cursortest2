package com.squareup.cash.db2;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class ReactionConfigQueries$select$2 extends FunctionReferenceImpl implements Function2 {
    public static final ReactionConfigQueries$select$2 INSTANCE = new ReactionConfigQueries$select$2(2, ReactionConfig.class, "<init>", "<init>(JLjava/util/List;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ReactionConfig(((Number) obj).longValue(), (List) obj2);
    }
}
