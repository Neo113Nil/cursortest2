package com.squareup.cash.merchant.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.photos.vision.barhopper.zzg;
import com.squareup.cash.arcade.components.cell.RealCellSearchResultAccessoryScope;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.cdf.stock.StockViewViewPortfolio;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.db.categories.CategorySearchQueries$PerformSearchQuery;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$MapForTokenQuery;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MerchantBlockingViewKt$$ExternalSyntheticLambda15 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MerchantBlockingViewKt$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = "BitcoinPortfolio";
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow sectionRow = (MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow) obj2;
                RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope = (RealCellSearchResultAccessoryScope) obj;
                realCellSearchResultAccessoryScope.getClass();
                RealCellSearchResultAccessoryScope.buttonCompact$default(realCellSearchResultAccessoryScope, new MerchantBlockingViewKt$$ExternalSyntheticLambda14((Function1) obj3, sectionRow, 1), false, new ComposableLambdaImpl(new HypeWelcomeUIKt$$ExternalSyntheticLambda5(sectionRow, 11), true, 757131654), 6);
                break;
            case 1:
                ((FormView) obj).getClass();
                ((StocksTransferEtaFullScreenView) obj3).formView.renderViewModel((FormViewModel) obj2);
                break;
            case 2:
                NewsKind newsKind = (NewsKind) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                ((Local_tab_content.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).getClass();
                if (!(newsKind instanceof NewsKind.StocksPortfolio)) {
                    if (!(newsKind instanceof NewsKind.BitcoinPortfolio)) {
                        if (!(newsKind instanceof NewsKind.Stock)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            str = ((NewsKind.Stock) newsKind).token.value;
                        }
                    }
                } else {
                    str = "StocksPortfolio";
                }
                androidStatement.bindString(0, str);
                break;
            case 3:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                ((Local_tab_content.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).getClass();
                NewsKind newsKind2 = (NewsKind) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key;
                newsKind2.getClass();
                if (!(newsKind2 instanceof NewsKind.StocksPortfolio)) {
                    if (!(newsKind2 instanceof NewsKind.BitcoinPortfolio)) {
                        if (!(newsKind2 instanceof NewsKind.Stock)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            str = ((NewsKind.Stock) newsKind2).token.value;
                        }
                    }
                } else {
                    str = "StocksPortfolio";
                }
                androidStatement2.bindString(0, str);
                break;
            case 4:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) obj2;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                Category$Adapter category$Adapter = (Category$Adapter) ((RewardSlotQueries) obj3).rewardAdapter;
                androidStatement3.bindString(0, (String) category$Adapter.prefix_iconAdapter.encode((CurrencyCode) badgeQueries$VersionQuery.external_token));
                androidStatement3.bindString(1, (String) category$Adapter.typeAdapter.encode((HistoricalRange) badgeQueries$VersionQuery.item_type));
                break;
            case 5:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, (String) ((ScenarioPlan.Adapter) ((RewardSlotQueries) obj3).rewardSlotAdapter).client_scenarioAdapter.encode((HistoricalRange) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                break;
            case 6:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery2 = (BadgeQueries$VersionQuery) obj2;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, (String) ((EnumColumnAdapter) ((InvestingDiscoveryQueries) obj3).investment_entityAdapter.zzb).encode((InvestmentEntityStatus) badgeQueries$VersionQuery2.item_type));
                String str2 = (String) badgeQueries$VersionQuery2.external_token;
                androidStatement5.bindString(1, str2);
                androidStatement5.bindString(2, str2);
                androidStatement5.bindString(3, str2);
                androidStatement5.bindString(4, str2);
                break;
            case 7:
                InvestingDiscoveryQueries investingDiscoveryQueries = (InvestingDiscoveryQueries) obj3;
                InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery investingSearchTableQueries$EntityWithUpComingIpoBySearchQuery = (InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery) obj2;
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                EnumColumnAdapter enumColumnAdapter = (EnumColumnAdapter) investingDiscoveryQueries.investment_entityAdapter.zzb;
                InvestmentEntityStatus investmentEntityStatus = investingSearchTableQueries$EntityWithUpComingIpoBySearchQuery.invalid_status;
                String str3 = investingSearchTableQueries$EntityWithUpComingIpoBySearchQuery.search;
                androidStatement6.bindString(0, (String) enumColumnAdapter.encode(investmentEntityStatus));
                SyncInvestmentEntity.ReleaseStage releaseStage = investingSearchTableQueries$EntityWithUpComingIpoBySearchQuery.valid_released_stage;
                androidStatement6.bindString(1, releaseStage != null ? (String) ((EnumColumnAdapter) investingDiscoveryQueries.investment_entityAdapter.zzf).encode(releaseStage) : null);
                androidStatement6.bindString(2, str3);
                androidStatement6.bindString(3, str3);
                androidStatement6.bindString(4, str3);
                androidStatement6.bindString(5, str3);
                break;
            case 8:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery3 = (BadgeQueries$VersionQuery) obj3;
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, (String) badgeQueries$VersionQuery3.external_token);
                androidStatement7.bindString(1, (String) ((EnumColumnAdapter) ((InvestmentEntityQueries) obj2).investment_holdingAdapter.closeBits).encode((SyncInvestmentHolding.InvestmentHoldingState) badgeQueries$VersionQuery3.item_type));
                break;
            case 9:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((EnumColumnAdapter) ((InvestmentEntityQueries) obj3).investment_holdingAdapter.closeBits).encode((SyncInvestmentHolding.InvestmentHoldingState) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                break;
            case 10:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                ((CategoryQueries) obj3).categoryAdapter.getClass();
                androidStatement9.bindString(0, ((CategoryToken) obj2).value);
                break;
            case 11:
                RealCategoryBackend$$ExternalSyntheticLambda1 realCategoryBackend$$ExternalSyntheticLambda1 = (RealCategoryBackend$$ExternalSyntheticLambda1) obj3;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                Category$Adapter category$Adapter2 = ((CategoryQueries) obj2).categoryAdapter;
                category$Adapter2.getClass();
                String string2 = androidCursor.getString(1);
                string2.getClass();
                CategoryToken categoryToken = new CategoryToken(string2);
                String string3 = androidCursor.getString(2);
                string3.getClass();
                String string4 = androidCursor.getString(3);
                ?? bytes = androidCursor.getBytes(4);
                Color color = bytes != 0 ? (Color) category$Adapter2.category_colorAdapter.decode(bytes) : null;
                String string5 = androidCursor.getString(5);
                Color color2 = color;
                String string6 = androidCursor.getString(6);
                String string7 = androidCursor.getString(7);
                break;
            case 12:
                RealCategoryBackend$$ExternalSyntheticLambda1 realCategoryBackend$$ExternalSyntheticLambda12 = (RealCategoryBackend$$ExternalSyntheticLambda1) obj3;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m2 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                Category$Adapter category$Adapter3 = ((CategoryQueries) obj2).categoryAdapter;
                category$Adapter3.getClass();
                String string8 = androidCursor2.getString(1);
                string8.getClass();
                CategoryToken categoryToken2 = new CategoryToken(string8);
                String string9 = androidCursor2.getString(2);
                string9.getClass();
                String string10 = androidCursor2.getString(3);
                ?? bytes2 = androidCursor2.getBytes(4);
                Color color3 = bytes2 != 0 ? (Color) category$Adapter3.category_colorAdapter.decode(bytes2) : null;
                String string11 = androidCursor2.getString(5);
                Color color4 = color3;
                String string12 = androidCursor2.getString(6);
                String string13 = androidCursor2.getString(7);
                break;
            case 13:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                ((CategoryQueries) obj3).categoryAdapter.getClass();
                CategoryToken categoryToken3 = (CategoryToken) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key;
                categoryToken3.getClass();
                androidStatement10.bindString(0, categoryToken3.value);
                break;
            case 14:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, (String) ((CategoryQueries) obj3).categoryAdapter.typeAdapter.encode((SyncInvestmentCategory.CategoryType) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                break;
            case 15:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery4 = (BadgeQueries$VersionQuery) obj3;
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, (String) badgeQueries$VersionQuery4.external_token);
                androidStatement12.bindString(1, (String) ((CategoryQueries) obj2).categoryAdapter.typeAdapter.encode((SyncInvestmentCategory.CategoryType) badgeQueries$VersionQuery4.item_type));
                break;
            case 16:
                CategorySearchQueries$PerformSearchQuery categorySearchQueries$PerformSearchQuery = (CategorySearchQueries$PerformSearchQuery) obj3;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj2;
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                String str4 = categorySearchQueries$PerformSearchQuery.filter_string;
                String str5 = categorySearchQueries$PerformSearchQuery.search;
                androidStatement13.bindString(0, str4);
                SyncInvestmentFilterGroup.JoinType joinType = categorySearchQueries$PerformSearchQuery.intersection_type;
                androidStatement13.bindString(1, joinType != null ? (String) ((ExpressivePaymentsStickerConfig.Adapter) rewardSlotQueries.rewardSlotAdapter).release_stateAdapter.encode(joinType) : null);
                androidStatement13.bindString(2, str5);
                androidStatement13.bindString(3, str5);
                androidStatement13.bindString(4, (String) ((EnumColumnAdapter) ((zzlj) rewardSlotQueries.rewardAdapter).zzb).encode(categorySearchQueries$PerformSearchQuery.invalid_status));
                SyncInvestmentEntity.ReleaseStage releaseStage2 = categorySearchQueries$PerformSearchQuery.valid_released_stage;
                androidStatement13.bindString(5, releaseStage2 != null ? (String) ((EnumColumnAdapter) ((zzlj) rewardSlotQueries.rewardAdapter).zzf).encode(releaseStage2) : null);
                androidStatement13.bindString(6, str5);
                androidStatement13.bindString(7, str5);
                break;
            case 17:
                RealCategoryBackend$$ExternalSyntheticLambda1 realCategoryBackend$$ExternalSyntheticLambda13 = (RealCategoryBackend$$ExternalSyntheticLambda1) obj3;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                Long m3 = re$$ExternalSyntheticOutline0.m(androidCursor3, 0);
                Category$Adapter category$Adapter4 = ((CategoryQueries) obj2).categoryAdapter;
                category$Adapter4.getClass();
                String string14 = androidCursor3.getString(1);
                string14.getClass();
                CategoryToken categoryToken4 = new CategoryToken(string14);
                String string15 = androidCursor3.getString(2);
                string15.getClass();
                String string16 = androidCursor3.getString(3);
                ?? bytes3 = androidCursor3.getBytes(4);
                Color color5 = bytes3 != 0 ? (Color) category$Adapter4.category_colorAdapter.decode(bytes3) : null;
                String string17 = androidCursor3.getString(5);
                Color color6 = color5;
                String string18 = androidCursor3.getString(6);
                String string19 = androidCursor3.getString(7);
                break;
            case 18:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery5 = (BadgeQueries$VersionQuery) obj3;
                AndroidStatement androidStatement14 = (AndroidStatement) obj;
                androidStatement14.getClass();
                androidStatement14.bindString(0, (String) badgeQueries$VersionQuery5.external_token);
                androidStatement14.bindString(1, (String) ((CategoryQueries) obj2).categoryAdapter.typeAdapter.encode((SyncInvestmentCategory.CategoryType) badgeQueries$VersionQuery5.item_type));
                break;
            case 19:
                AndroidStatement androidStatement15 = (AndroidStatement) obj;
                androidStatement15.getClass();
                ((ExpressivePaymentsStickerConfig.Adapter) ((RewardSlotQueries) obj3).rewardAdapter).getClass();
                androidStatement15.bindString(0, ((FilterToken) obj2).value);
                break;
            case 20:
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ((ExpressivePaymentsStickerConfig.Adapter) ((RewardSlotQueries) obj2).rewardAdapter).getClass();
                String string20 = androidCursor4.getString(0);
                string20.getClass();
                FilterToken filterToken = new FilterToken(string20);
                String string21 = androidCursor4.getString(1);
                string21.getClass();
                break;
            case 21:
                AndroidStatement androidStatement16 = (AndroidStatement) obj;
                androidStatement16.getClass();
                ((ExpressivePaymentsStickerConfig.Adapter) ((RewardSlotQueries) obj3).rewardAdapter).getClass();
                FilterToken filterToken2 = ((FilterGroupQueries$MapForTokenQuery) obj2).token;
                filterToken2.getClass();
                androidStatement16.bindString(0, filterToken2.value);
                break;
            case 22:
                AndroidStatement androidStatement17 = (AndroidStatement) obj;
                androidStatement17.getClass();
                ((ExpressivePaymentsStickerConfig.Adapter) ((RewardSlotQueries) obj3).rewardAdapter).getClass();
                FilterToken filterToken3 = ((FilterGroupQueries$MapForTokenQuery) obj2).token;
                filterToken3.getClass();
                androidStatement17.bindString(0, filterToken3.value);
                break;
            case 23:
                AndroidStatement androidStatement18 = (AndroidStatement) obj;
                androidStatement18.getClass();
                androidStatement18.bindString(0, (String) ((Category$Adapter) ((RewardSlotQueries) obj3).rewardSlotAdapter).typeAdapter.encode((SyncInvestmentCategory.CategoryType) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                break;
            case 24:
                InvestingPortfolioPresenter investingPortfolioPresenter = (InvestingPortfolioPresenter) obj3;
                MutableState mutableState = (MutableState) obj2;
                GraphPresenterData graphPresenterData = (GraphPresenterData) obj;
                graphPresenterData.getClass();
                BalanceTick balanceTick = (BalanceTick) zzg.lastOrNull(graphPresenterData.ticks);
                Long l = balanceTick != null ? balanceTick.amount_cents : null;
                if (!((Boolean) mutableState.getValue()).booleanValue() && l != null && l.longValue() > 0) {
                    investingPortfolioPresenter.analytics.track(new StockViewViewPortfolio(), null);
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 25:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                break;
            case 26:
                List list = (List) obj;
                list.getClass();
                break;
            case 27:
                EglCore eglCore = (EglCore) obj2;
                Iterator it = ((List) obj3).iterator();
                while (it.hasNext()) {
                    String str6 = ((Recipient) it.next()).lookupKey;
                    if (str6 != null) {
                        ContactQueries contactQueries = (ContactQueries) eglCore.eglConfig;
                        contactQueries.getClass();
                        contactQueries.driver.execute(-832244645, "UPDATE contact\nSET already_invited = ?\nWHERE lookup_key = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str6, 9));
                        contactQueries.notifyQueries(-832244645, new ContactQueries$$ExternalSyntheticLambda1(1));
                    }
                }
                break;
            case 28:
                LocalizationConfig localizationConfig = (LocalizationConfig) obj3;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidStatement androidStatement19 = (AndroidStatement) obj;
                androidStatement19.getClass();
                androidStatement19.bindBytes(0, localizationConfig != null ? (byte[]) ((BlockersConfig.Adapter) gpsConfigQueries.gpsConfigAdapter).target_balance_amountAdapter.encode(localizationConfig) : null);
                break;
            default:
                AndroidStatement androidStatement20 = (AndroidStatement) obj;
                androidStatement20.getClass();
                androidStatement20.bindBytes(0, (byte[]) ((ReactionConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).extendedReactionsAdapter.encode((List) obj2));
                break;
        }
        return Unit.INSTANCE;
    }
}
