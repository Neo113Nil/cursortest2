package com.squareup.cash.db2.activity;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestmentActivityQueries$entityColorForPayment$2 extends FunctionReferenceImpl implements Function2 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public InvestmentActivityQueries$entityColorForPayment$2() {
        super(2, EntityColorForPayment.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new EntityColorForPayment((Color) obj2, (String) obj);
    }
}
