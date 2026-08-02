package com.squareup.cash.db2.entities;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class EntityRangesQueries$selectAll$2 extends FunctionReferenceImpl implements Function2 {
    public static final EntityRangesQueries$selectAll$2 INSTANCE = new EntityRangesQueries$selectAll$2(2, Entity_range.class, "<init>", "<init>([BI)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Entity_range((byte[]) obj, ((Number) obj2).intValue());
    }
}
