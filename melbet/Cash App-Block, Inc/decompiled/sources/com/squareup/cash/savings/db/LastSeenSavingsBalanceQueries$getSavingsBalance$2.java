package com.squareup.cash.savings.db;

import com.squareup.protos.common.Money;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class LastSeenSavingsBalanceQueries$getSavingsBalance$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public LastSeenSavingsBalanceQueries$getSavingsBalance$2() {
        super(1, GetSavingsBalance.class, "<init>", "<init>(Lcom/squareup/protos/common/Money;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new GetSavingsBalance((Money) obj);
    }
}
