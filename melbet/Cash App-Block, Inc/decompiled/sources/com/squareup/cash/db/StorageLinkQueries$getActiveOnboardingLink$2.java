package com.squareup.cash.db;

import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class StorageLinkQueries$getActiveOnboardingLink$2 extends FunctionReferenceImpl implements Function4 {
    public static final StorageLinkQueries$getActiveOnboardingLink$2 INSTANCE = new StorageLinkQueries$getActiveOnboardingLink$2(4, Storage_link.class, "<init>", "<init>(Ljava/lang/String;JJJ)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new Storage_link(((Number) obj2).longValue(), (String) obj, ((Number) obj3).longValue(), ((Number) obj4).longValue());
    }
}
