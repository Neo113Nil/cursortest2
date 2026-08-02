package com.squareup.cash.db2.profile;

import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class CustomerProfileQueries$localContactProfile$2 extends FunctionReferenceImpl implements Function4 {
    public static final CustomerProfileQueries$localContactProfile$2 INSTANCE = new CustomerProfileQueries$localContactProfile$2(4, LocalContactProfile.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new LocalContactProfile((String) obj, (String) obj2, (String) obj3, (String) obj4);
    }
}
