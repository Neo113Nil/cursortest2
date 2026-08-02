package com.squareup.cash.db2.payment;

import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import java.io.Serializable;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfflineQueries$pending$2 extends FunctionReferenceImpl implements Function8 {
    public static final OfflineQueries$pending$2 INSTANCE = new OfflineQueries$pending$2(8, Pending.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;Lcom/squareup/protos/franklin/common/TransferFundsRequest;JLjava/lang/Long;JLjava/lang/String;J)V", 0);

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        String str = (String) obj;
        long longValue = ((Number) serializable).longValue();
        str.getClass();
        return new Pending(str, (InitiatePaymentRequest) obj2, (TransferFundsRequest) obj3, ((Number) obj4).longValue(), (Long) obj5, ((Number) obj6).longValue(), (String) obj7, longValue);
    }
}
