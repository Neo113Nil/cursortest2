package com.squareup.cash.activity.backend.loader;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivitiesCacheManager$takeForSingle$1 extends FunctionReferenceImpl implements Function0 {
    public static final ActivitiesCacheManager$takeForSingle$1 INSTANCE = new ActivitiesCacheManager$takeForSingle$1(0, SingleActivityCache$InMemory.class, "<init>", "<init>()V", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SingleActivityCache$InMemory();
    }
}
