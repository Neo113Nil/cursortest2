package com.squareup.cash.db2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashLiteConfigQueries$select$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public CashLiteConfigQueries$select$2() {
        super(1, CashLiteConfig.class, "<init>", "<init>(Lcom/squareup/protos/franklin/app/CashLiteConfig;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new CashLiteConfig((com.squareup.protos.franklin.app.CashLiteConfig) obj);
    }
}
