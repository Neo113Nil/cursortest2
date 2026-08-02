package com.squareup.cash.db2;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class ClientRoutingConfigQueries$selectAll$2 extends FunctionReferenceImpl implements Function2 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ClientRoutingConfigQueries$selectAll$2() {
        super(2, ClientRoutingConfig.class, "<init>", "<init>(Ljava/util/List;Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ClientRoutingConfig((List) obj, (List) obj2);
    }
}
