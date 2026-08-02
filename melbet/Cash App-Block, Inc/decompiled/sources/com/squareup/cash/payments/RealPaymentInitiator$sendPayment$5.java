package com.squareup.cash.payments;

import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealPaymentInitiator$sendPayment$5 extends AdaptedFunctionReference implements Function4 {
    public static final RealPaymentInitiator$sendPayment$5 INSTANCE = new RealPaymentInitiator$sendPayment$5(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new Triple((BalanceSnapshot) obj, (List) obj2, (InstrumentLinkingConfig) obj3);
    }
}
