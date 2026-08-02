package com.squareup.cash.db2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampsConfigQueries$select$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public StampsConfigQueries$select$2() {
        super(1, StampsConfig.class, "<init>", "<init>(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new StampsConfig((List) obj);
    }
}
