package com.squareup.cash.investing.db.categories;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class FilterGroupQueries$mapForToken$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public FilterGroupQueries$mapForToken$2() {
        super(1, MapForToken.class, "<init>", "<init>(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new MapForToken((List) obj);
    }
}
