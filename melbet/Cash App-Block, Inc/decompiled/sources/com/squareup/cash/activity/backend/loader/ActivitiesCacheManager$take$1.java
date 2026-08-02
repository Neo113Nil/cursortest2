package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivitiesCacheManager$take$1 extends FunctionReferenceImpl implements Function0 {
    public static final ActivitiesCacheManager$take$1 INSTANCE = new ActivitiesCacheManager$take$1(0, ActivitiesCache.InMemory.class, "<init>", "<init>()V", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ActivitiesCache.InMemory();
    }
}
