package com.squareup.cash.afterpayapplet.db;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletQueries$forKey$2 extends FunctionReferenceImpl implements Function3 {
    public static final AfterpayAppletQueries$forKey$2 INSTANCE = new AfterpayAppletQueries$forKey$2(3, AfterpayApplet.class, "<init>", "<init>(JLjava/lang/Long;Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletResponse;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) obj3;
        afterpayAppletResponse.getClass();
        return new AfterpayApplet(((Number) obj).longValue(), (Long) obj2, afterpayAppletResponse);
    }
}
