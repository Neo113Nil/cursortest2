package com.squareup.cash.investing.backend.real;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.marketdata.MarketDataService;
import com.squareup.protos.cash.marketdata.model.News;
import com.squareup.protos.cash.marketdata.model.OpenUrlAction;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.investing.InvestingService;
import com.squareup.util.coroutines.Signal;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealInvestingSyncer {
    public final AndroidClock clock;
    public final InvestingDiscoveryQueries discoveryQueries;
    public final InvestingService investingService;
    public final CoroutineContext ioDispatcher;
    public final MarketDataService marketDataService;
    public final Map newsCacheExpiryTimes;
    public final GpsConfigQueries newsQueries;
    public final GpsConfigQueries settingsQueries;
    public final Signal signOutSignal;

    public RealInvestingSyncer(MarketDataService marketDataService, InvestingService investingService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, Map map, Signal signal, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.marketDataService = marketDataService;
        this.investingService = investingService;
        this.clock = androidClock;
        this.newsCacheExpiryTimes = map;
        this.signOutSignal = signal;
        this.ioDispatcher = coroutineContext;
        this.discoveryQueries = cashAccountDatabaseImpl.investingDiscoveryQueries;
        this.settingsQueries = cashAccountDatabaseImpl.investingSettingsQueries;
        this.newsQueries = cashAccountDatabaseImpl.investingNewsArticleQueries;
        JobKt.launch$default(coroutineScope, null, null, new RealGcmRegistrar$unregister$2(this, (Continuation) null, 20), 3);
    }

    public static final void access$saveNews(final RealInvestingSyncer realInvestingSyncer, final NewsKind newsKind, final List list, final int i) {
        final long millis = realInvestingSyncer.clock.millis();
        realInvestingSyncer.newsQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.investing.backend.real.RealInvestingSyncer$$ExternalSyntheticLambda0
            /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                final NewsKind newsKind2;
                final String str;
                RealInvestingSyncer$$ExternalSyntheticLambda0 realInvestingSyncer$$ExternalSyntheticLambda0 = this;
                ((TransactionWrapper) obj).getClass();
                final GpsConfigQueries gpsConfigQueries = RealInvestingSyncer.this.newsQueries;
                gpsConfigQueries.getClass();
                SqlDriver sqlDriver = gpsConfigQueries.driver;
                NewsKind newsKind3 = newsKind;
                sqlDriver.execute(2009178176, "DELETE\nFROM investing_news_article\nWHERE kind = ?", new MerchantBlockingViewKt$$ExternalSyntheticLambda15(2, gpsConfigQueries, newsKind3));
                gpsConfigQueries.notifyQueries(2009178176, new InvestmentEntityQueries$$ExternalSyntheticLambda1(17));
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                int i2 = 0;
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    News news = (News) next;
                    final String str2 = news.provider_name;
                    str2.getClass();
                    final Image image = news.avatar;
                    image.getClass();
                    NewsKind newsKind4 = newsKind3;
                    final String str3 = news.title;
                    str3.getClass();
                    final Long l = news.published_at;
                    News.Action action = news.action;
                    if (action != null) {
                        News.Action.OpenUrlAction openUrlAction = action instanceof News.Action.OpenUrlAction ? (News.Action.OpenUrlAction) action : null;
                        OpenUrlAction openUrlAction2 = openUrlAction != null ? openUrlAction.value : null;
                        if (openUrlAction2 != null) {
                            str = openUrlAction2.news_url;
                            newsKind2 = newsKind4;
                            final boolean z = i2 >= i;
                            gpsConfigQueries.getClass();
                            SqlDriver sqlDriver2 = gpsConfigQueries.driver;
                            final long j = millis;
                            QueryResult execute = sqlDriver2.execute(1789839110, "INSERT INTO investing_news_article\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.investing.db.InvestingNewsArticleQueries$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    String str4;
                                    AndroidStatement androidStatement = (AndroidStatement) obj2;
                                    androidStatement.getClass();
                                    GpsConfigQueries gpsConfigQueries2 = GpsConfigQueries.this;
                                    ((Local_tab_content.Adapter) gpsConfigQueries2.gpsConfigAdapter).getClass();
                                    NewsKind newsKind5 = newsKind2;
                                    if (newsKind5 instanceof NewsKind.StocksPortfolio) {
                                        str4 = "StocksPortfolio";
                                    } else if (newsKind5 instanceof NewsKind.BitcoinPortfolio) {
                                        str4 = "BitcoinPortfolio";
                                    } else {
                                        if (!(newsKind5 instanceof NewsKind.Stock)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str4 = ((NewsKind.Stock) newsKind5).token.value;
                                    }
                                    androidStatement.bindString(0, str4);
                                    androidStatement.bindString(1, str2);
                                    androidStatement.bindBytes(2, (byte[]) ((Local_tab_content.Adapter) gpsConfigQueries2.gpsConfigAdapter).responseAdapter.encode(image));
                                    androidStatement.bindString(3, str3);
                                    androidStatement.bindLong(4, l);
                                    androidStatement.bindString(5, str);
                                    androidStatement.bindBoolean(6, Boolean.valueOf(z));
                                    androidStatement.bindLong(7, Long.valueOf(j));
                                    return Unit.INSTANCE;
                                }
                            });
                            gpsConfigQueries.notifyQueries(1789839110, new InvestmentEntityQueries$$ExternalSyntheticLambda1(18));
                            arrayList.add(execute);
                            realInvestingSyncer$$ExternalSyntheticLambda0 = this;
                            newsKind3 = newsKind2;
                            i2 = i3;
                        }
                    }
                    newsKind2 = newsKind4;
                    str = null;
                    if (i2 >= i) {
                    }
                    gpsConfigQueries.getClass();
                    SqlDriver sqlDriver22 = gpsConfigQueries.driver;
                    final long j2 = millis;
                    QueryResult execute2 = sqlDriver22.execute(1789839110, "INSERT INTO investing_news_article\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.investing.db.InvestingNewsArticleQueries$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            String str4;
                            AndroidStatement androidStatement = (AndroidStatement) obj2;
                            androidStatement.getClass();
                            GpsConfigQueries gpsConfigQueries2 = GpsConfigQueries.this;
                            ((Local_tab_content.Adapter) gpsConfigQueries2.gpsConfigAdapter).getClass();
                            NewsKind newsKind5 = newsKind2;
                            if (newsKind5 instanceof NewsKind.StocksPortfolio) {
                                str4 = "StocksPortfolio";
                            } else if (newsKind5 instanceof NewsKind.BitcoinPortfolio) {
                                str4 = "BitcoinPortfolio";
                            } else {
                                if (!(newsKind5 instanceof NewsKind.Stock)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                str4 = ((NewsKind.Stock) newsKind5).token.value;
                            }
                            androidStatement.bindString(0, str4);
                            androidStatement.bindString(1, str2);
                            androidStatement.bindBytes(2, (byte[]) ((Local_tab_content.Adapter) gpsConfigQueries2.gpsConfigAdapter).responseAdapter.encode(image));
                            androidStatement.bindString(3, str3);
                            androidStatement.bindLong(4, l);
                            androidStatement.bindString(5, str);
                            androidStatement.bindBoolean(6, Boolean.valueOf(z));
                            androidStatement.bindLong(7, Long.valueOf(j2));
                            return Unit.INSTANCE;
                        }
                    });
                    gpsConfigQueries.notifyQueries(1789839110, new InvestmentEntityQueries$$ExternalSyntheticLambda1(18));
                    arrayList.add(execute2);
                    realInvestingSyncer$$ExternalSyntheticLambda0 = this;
                    newsKind3 = newsKind2;
                    i2 = i3;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
