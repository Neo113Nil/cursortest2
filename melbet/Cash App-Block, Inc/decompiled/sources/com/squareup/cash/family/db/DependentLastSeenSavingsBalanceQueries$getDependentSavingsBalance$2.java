package com.squareup.cash.family.db;

import com.squareup.protos.common.Money;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2 extends FunctionReferenceImpl implements Function2 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2() {
        super(2, GetDependentSavingsBalance.class, "<init>", "<init>(Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new GetDependentSavingsBalance((Money) obj, (Money) obj2);
    }
}
