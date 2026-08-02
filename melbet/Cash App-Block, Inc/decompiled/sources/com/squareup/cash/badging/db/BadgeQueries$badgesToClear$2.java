package com.squareup.cash.badging.db;

import com.squareup.protos.cash.badging.api.ItemType;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeQueries$badgesToClear$2 extends FunctionReferenceImpl implements Function3 {
    public static final BadgeQueries$badgesToClear$2 INSTANCE = new BadgeQueries$badgesToClear$2(3, BadgesToClear.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/cash/badging/api/ItemType;J)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        ItemType itemType = (ItemType) obj2;
        long longValue = ((Number) obj3).longValue();
        str.getClass();
        itemType.getClass();
        return new BadgesToClear(str, itemType, longValue);
    }
}
