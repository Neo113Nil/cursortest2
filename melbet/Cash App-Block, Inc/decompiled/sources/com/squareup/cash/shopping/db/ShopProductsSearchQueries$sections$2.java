package com.squareup.cash.shopping.db;

import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShopProductsSearchQueries$sections$2 extends FunctionReferenceImpl implements Function7 {
    public static final ShopProductsSearchQueries$sections$2 INSTANCE = new ShopProductsSearchQueries$sections$2(7, ProductsResultsSection.class, "<init>", "<init>(JLjava/lang/String;Lcom/squareup/protos/cash/discover/api/app/v1/model/Text;Lcom/squareup/protos/cash/discover/api/app/v1/model/Text;Lcom/squareup/protos/cash/discover/api/app/v1/model/Section$Layout;Lcom/squareup/protos/cash/customersearch/api/SearchCommonMessageSection;Lcom/squareup/protos/cash/discover/api/app/v1/model/Button;)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj2;
        str.getClass();
        return new ProductsResultsSection(((Number) obj).longValue(), str, (Text) obj3, (Text) obj4, (Section.Layout) obj5, (SearchCommonMessageSection) obj6, (Button) serializable);
    }
}
