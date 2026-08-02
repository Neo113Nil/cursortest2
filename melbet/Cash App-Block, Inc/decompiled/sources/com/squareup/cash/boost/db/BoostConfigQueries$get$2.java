package com.squareup.cash.boost.db;

import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class BoostConfigQueries$get$2 extends FunctionReferenceImpl implements Function2 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public BoostConfigQueries$get$2() {
        super(2, BoostConfig.class, "<init>", "<init>(Ljava/lang/Long;Lcom/squareup/protos/franklin/app/GetBoostConfigResponse$BtcBoostUpsell;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new BoostConfig((Long) obj, (GetBoostConfigResponse.BtcBoostUpsell) obj2);
    }
}
