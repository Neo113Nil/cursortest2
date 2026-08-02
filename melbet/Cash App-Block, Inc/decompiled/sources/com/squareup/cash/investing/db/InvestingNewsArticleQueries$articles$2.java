package com.squareup.cash.investing.db;

import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.protos.cash.ui.Image;
import java.io.Serializable;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingNewsArticleQueries$articles$2 extends FunctionReferenceImpl implements Function8 {
    public static final InvestingNewsArticleQueries$articles$2 INSTANCE = new InvestingNewsArticleQueries$articles$2(8, Investing_news_article.class, "<init>", "<init>(Lcom/squareup/cash/investing/primitives/NewsKind;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZJ)V", 0);

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        NewsKind newsKind = (NewsKind) obj;
        String str = (String) obj2;
        Image image = (Image) obj3;
        String str2 = (String) obj4;
        boolean booleanValue = ((Boolean) obj7).booleanValue();
        long longValue = ((Number) serializable).longValue();
        newsKind.getClass();
        str.getClass();
        image.getClass();
        str2.getClass();
        return new Investing_news_article(newsKind, str, image, str2, (Long) obj5, (String) obj6, booleanValue, longValue);
    }
}
