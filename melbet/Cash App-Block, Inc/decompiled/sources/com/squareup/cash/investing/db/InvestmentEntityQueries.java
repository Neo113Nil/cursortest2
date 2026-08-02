package com.squareup.cash.investing.db;

import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.internal.DefaultSocket;

/* loaded from: classes.dex */
public final class InvestmentEntityQueries extends TransacterImpl {
    public final zzlj investment_entityAdapter;
    public final DefaultSocket investment_holdingAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityQueries(AndroidSqliteDriver androidSqliteDriver, DefaultSocket defaultSocket, zzlj zzljVar) {
        super(androidSqliteDriver);
        defaultSocket.getClass();
        zzljVar.getClass();
        this.investment_holdingAdapter = defaultSocket;
        this.investment_entityAdapter = zzljVar;
    }

    public Query forToken(String str) {
        str.getClass();
        InvestmentEntityQueries$forToken$2 investmentEntityQueries$forToken$2 = InvestmentEntityQueries$forToken$2.INSTANCE;
        return new ForTokenQuery(this, str, new InvestmentEntityQueries$$ExternalSyntheticLambda7(this, 0));
    }

    public void insert(final String str, final String str2, final long j, final CurrencyCode currencyCode, final SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, final SyncInvestmentHolding.DailyGainParams dailyGainParams, final Money money) {
        str.getClass();
        str2.getClass();
        investmentHoldingState.getClass();
        this.driver.execute(1732704494, "INSERT OR REPLACE INTO investment_holding\nVALUES (?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str, 1, str2);
                androidStatement.bindLong(2, Long.valueOf(j));
                CurrencyCode currencyCode2 = currencyCode;
                InvestmentEntityQueries investmentEntityQueries = this;
                androidStatement.bindString(3, currencyCode2 != null ? (String) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).encode(currencyCode2) : null);
                DefaultSocket defaultSocket = investmentEntityQueries.investment_holdingAdapter;
                androidStatement.bindString(4, (String) ((EnumColumnAdapter) defaultSocket.closeBits).encode(investmentHoldingState));
                SyncInvestmentHolding.DailyGainParams dailyGainParams2 = dailyGainParams;
                androidStatement.bindBytes(5, dailyGainParams2 != null ? (byte[]) ((WireAdapter) defaultSocket.source).encode(dailyGainParams2) : null);
                Money money2 = money;
                androidStatement.bindBytes(6, money2 != null ? (byte[]) ((WireAdapter) defaultSocket.sink).encode(money2) : null);
                return Unit.INSTANCE;
            }
        });
        notifyQueries(1732704494, new InvestmentEntityQueries$$ExternalSyntheticLambda1(29));
    }

    public void resetOrdering() {
        this.driver.execute(1509090006, "UPDATE investment_entity\nSET search_ordering = NULL", null);
        notifyQueries(1509090006, new InvestmentEntityQueries$$ExternalSyntheticLambda1(25));
    }

    public void updateStateForToken(SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, String str) {
        str.getClass();
        this.driver.execute(-515545085, "UPDATE investment_holding\nSET state = ?\nWHERE token = ?", new GpsConfigQueries$$ExternalSyntheticLambda3(26, this, investmentHoldingState, str));
        notifyQueries(-515545085, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(1));
    }

    /* loaded from: classes6.dex */
    public final class ForTokenQuery extends Query {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ InvestmentEntityQueries this$0;
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForTokenQuery(InvestmentEntityQueries investmentEntityQueries, String str, InvestmentEntityQueries$$ExternalSyntheticLambda7 investmentEntityQueries$$ExternalSyntheticLambda7) {
            super(investmentEntityQueries$$ExternalSyntheticLambda7);
            str.getClass();
            this.this$0 = investmentEntityQueries;
            this.token = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            InvestmentEntityQueries investmentEntityQueries = this.this$0;
            switch (i) {
                case 0:
                    investmentEntityQueries.driver.addListener(new String[]{"investment_entity"}, listener);
                    break;
                default:
                    investmentEntityQueries.driver.addListener(new String[]{"investment_holding", "investment_entity"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            InvestmentEntityQueries investmentEntityQueries = this.this$0;
            switch (i) {
                case 0:
                    return investmentEntityQueries.driver.executeQuery(1782925373, "SELECT investment_entity.id, investment_entity.token, investment_entity.symbol, investment_entity.type, investment_entity.display_name, investment_entity.icon_url, investment_entity.outstanding_shares, investment_entity.color, investment_entity.status, investment_entity.about_text, investment_entity.about_detail_rows, investment_entity.search_ordering, investment_entity.delisted, investment_entity.entity_color, investment_entity.icon, investment_entity.release_stage\nFROM investment_entity\nWHERE token = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, 11));
                default:
                    return investmentEntityQueries.driver.executeQuery(1224325123, "SELECT investment_holding.token, investment_holding.units, investment_holding.invested_amount, investment_holding.currency, investment_holding.state, investment_holding.daily_gain_params, investment_holding.average_cost, display_name, symbol, delisted, entity_color\nFROM investment_entity\nLEFT JOIN investment_holding USING (token)\nWHERE investment_entity.token = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, 13));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            InvestmentEntityQueries investmentEntityQueries = this.this$0;
            listener.getClass();
            switch (i) {
                case 0:
                    investmentEntityQueries.driver.removeListener(new String[]{"investment_entity"}, listener);
                    break;
                default:
                    investmentEntityQueries.driver.removeListener(new String[]{"investment_holding", "investment_entity"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "InvestmentEntity.sq:forToken";
                default:
                    return "InvestmentEntity.sq:withHoldings";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForTokenQuery(InvestmentEntityQueries investmentEntityQueries, String str, InvestmentEntityQueries$$ExternalSyntheticLambda7 investmentEntityQueries$$ExternalSyntheticLambda7, byte b) {
            super(investmentEntityQueries$$ExternalSyntheticLambda7);
            str.getClass();
            this.this$0 = investmentEntityQueries;
            this.token = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityQueries(AndroidSqliteDriver androidSqliteDriver, zzlj zzljVar, DefaultSocket defaultSocket) {
        super(androidSqliteDriver);
        zzljVar.getClass();
        defaultSocket.getClass();
        this.investment_entityAdapter = zzljVar;
        this.investment_holdingAdapter = defaultSocket;
    }
}
