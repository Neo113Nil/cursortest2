package com.squareup.cash.shopping.db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShopProductsSearchQueries$paginationToken$2 extends FunctionReferenceImpl implements Function1 {
    public static final ShopProductsSearchQueries$paginationToken$2 INSTANCE = new ShopProductsSearchQueries$paginationToken$2(1, ProductsResultsPaginationToken.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ProductsResultsPaginationToken((String) obj);
    }
}
