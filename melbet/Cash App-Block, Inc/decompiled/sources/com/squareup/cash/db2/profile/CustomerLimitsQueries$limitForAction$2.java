package com.squareup.cash.db2.profile;

import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LimitedAction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CustomerLimitsQueries$limitForAction$2 extends FunctionReferenceImpl implements Function3 {
    public static final CustomerLimitsQueries$limitForAction$2 INSTANCE = new CustomerLimitsQueries$limitForAction$2(3, Effective_limits.class, "<init>", "<init>(Lcom/squareup/protos/franklin/common/LimitedAction;Lcom/squareup/protos/common/Money;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LimitedAction limitedAction = (LimitedAction) obj;
        Money money = (Money) obj2;
        limitedAction.getClass();
        money.getClass();
        return new Effective_limits(limitedAction, money, (String) obj3);
    }
}
