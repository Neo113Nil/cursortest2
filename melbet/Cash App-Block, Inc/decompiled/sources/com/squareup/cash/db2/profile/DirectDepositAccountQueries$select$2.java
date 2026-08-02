package com.squareup.cash.db2.profile;

import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class DirectDepositAccountQueries$select$2 extends FunctionReferenceImpl implements Function6 {
    public static final DirectDepositAccountQueries$select$2 INSTANCE = new DirectDepositAccountQueries$select$2(6, DirectDepositAccount.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        return new DirectDepositAccount(str, str2, ((Boolean) obj3).booleanValue(), (String) obj4, (Boolean) obj5, (String) obj6);
    }
}
