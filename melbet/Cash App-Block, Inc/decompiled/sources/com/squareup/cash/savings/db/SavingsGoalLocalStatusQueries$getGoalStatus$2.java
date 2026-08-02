package com.squareup.cash.savings.db;

import com.squareup.protos.common.Money;
import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class SavingsGoalLocalStatusQueries$getGoalStatus$2 extends FunctionReferenceImpl implements Function7 {
    public static final SavingsGoalLocalStatusQueries$getGoalStatus$2 INSTANCE = new SavingsGoalLocalStatusQueries$getGoalStatus$2(7, SavingsGoalLocalStatus.class, "<init>", "<init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj;
        str.getClass();
        return new SavingsGoalLocalStatus(str, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (String) obj4, (Money) obj5, (Money) obj6, (Long) serializable);
    }
}
