package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.FastScroller;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.news.InvestingNewsCarouselView;
import com.squareup.cash.investing.components.news.InvestingNewsCarouselView$ViewFactory$Impl;
import com.squareup.cash.investing.components.news.NewsArticleAdapter;
import com.squareup.cash.investingcrypto.viewmodels.news.Bookmark;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class NewsCarouselAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 eventReceiverProducer;
    public final InvestingNewsCarouselView$ViewFactory$Impl viewFactory;

    public NewsCarouselAdapter(InvestingNewsCarouselView$ViewFactory$Impl investingNewsCarouselView$ViewFactory$Impl, InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(12, false);
        this.viewFactory = investingNewsCarouselView$ViewFactory$Impl;
        this.eventReceiverProducer = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        InvestingNewsCarouselView investingNewsCarouselView = (InvestingNewsCarouselView) view;
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
        investingNewsCarouselView.getClass();
        investingCryptoNewsViewModel.getClass();
        List list = investingCryptoNewsViewModel.articles;
        investingNewsCarouselView.setVisibility(list.isEmpty() ? 8 : 0);
        investingNewsCarouselView.articleAdapter.mDiffer.submitList(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOfNotNull(investingCryptoNewsViewModel.viewAll), (Collection) CollectionsKt.plus((Iterable) list, (Collection) CollectionsKt__CollectionsJVMKt.listOf(Bookmark.INSTANCE))), null);
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        InvestingNewsCarouselView$ViewFactory$Impl investingNewsCarouselView$ViewFactory$Impl = this.viewFactory;
        investingNewsCarouselView$ViewFactory$Impl.getClass();
        RealImageLoader realImageLoader = (RealImageLoader) investingNewsCarouselView$ViewFactory$Impl.delegateFactory.staticImageLoader.invoke();
        realImageLoader.getClass();
        InvestingNewsCarouselView investingNewsCarouselView = new InvestingNewsCarouselView(context, realImageLoader);
        GpsConfigQueries$$ExternalSyntheticLambda2 gpsConfigQueries$$ExternalSyntheticLambda2 = new GpsConfigQueries$$ExternalSyntheticLambda2(this, 26);
        QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda0 = new QrCodeScannerBinding$$ExternalSyntheticLambda0(gpsConfigQueries$$ExternalSyntheticLambda2, 2);
        NewsArticleAdapter newsArticleAdapter = investingNewsCarouselView.articleAdapter;
        newsArticleAdapter.getClass();
        newsArticleAdapter.eventReceiver = qrCodeScannerBinding$$ExternalSyntheticLambda0;
        gpsConfigQueries$$ExternalSyntheticLambda2.invoke(InvestingCryptoNewsViewEvent.ListViewed.INSTANCE);
        investingNewsCarouselView.addOnScrollListener(new FastScroller.AnonymousClass2(gpsConfigQueries$$ExternalSyntheticLambda2, 4));
        return investingNewsCarouselView;
    }
}
