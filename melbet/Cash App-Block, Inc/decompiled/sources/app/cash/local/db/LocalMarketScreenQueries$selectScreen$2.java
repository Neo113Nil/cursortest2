package app.cash.local.db;

import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMarketScreenQueries$selectScreen$2 extends FunctionReferenceImpl implements Function2 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public LocalMarketScreenQueries$selectScreen$2() {
        super(2, Local_market_screen.class, "<init>", "<init>(Lcom/squareup/protos/cash/local/client/app/v1/MarketTilesScreen;Ljava/lang/Long;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Local_market_screen((MarketTilesScreen) obj, (Long) obj2);
    }
}
