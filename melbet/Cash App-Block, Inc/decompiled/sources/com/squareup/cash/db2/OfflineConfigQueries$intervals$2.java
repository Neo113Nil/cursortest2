package com.squareup.cash.db2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class OfflineConfigQueries$intervals$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public OfflineConfigQueries$intervals$2() {
        super(1, Intervals.class, "<init>", "<init>(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Intervals((List) obj);
    }
}
