package com.squareup.cash.account.presenters.documents;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeRowViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ MoleculePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1 accountDocumentsPresenter$bitcoinTaxFormsViewModel$1 = new AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1((AccountDocumentsPresenter) moleculePresenter, (Continuation) obj3, 0);
                accountDocumentsPresenter$bitcoinTaxFormsViewModel$1.L$0 = (AccountDocumentsViewModel) obj;
                accountDocumentsPresenter$bitcoinTaxFormsViewModel$1.Z$0 = booleanValue;
                return accountDocumentsPresenter$bitcoinTaxFormsViewModel$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1 accountDocumentsPresenter$bitcoinTaxFormsViewModel$12 = new AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1((InvestingOrderTypeSelectionPresenter) moleculePresenter, (Continuation) obj3, 1);
                accountDocumentsPresenter$bitcoinTaxFormsViewModel$12.L$0 = (String) obj;
                accountDocumentsPresenter$bitcoinTaxFormsViewModel$12.Z$0 = booleanValue2;
                return accountDocumentsPresenter$bitcoinTaxFormsViewModel$12.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1 accountDocumentsPresenter$bitcoinTaxFormsViewModel$13 = new AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1((CardLockPresenter) moleculePresenter, (Continuation) obj3, 2);
                accountDocumentsPresenter$bitcoinTaxFormsViewModel$13.L$0 = (InvitationConfig) obj;
                accountDocumentsPresenter$bitcoinTaxFormsViewModel$13.Z$0 = booleanValue3;
                return accountDocumentsPresenter$bitcoinTaxFormsViewModel$13.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        InvestingOrderTypeRowViewModel investingOrderTypeRowViewModel;
        String str2;
        String str3;
        int i = this.$r8$classId;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                AndroidStringManager androidStringManager = ((AccountDocumentsPresenter) moleculePresenter).stringManager;
                AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) this.L$0;
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z) {
                    return accountDocumentsViewModel;
                }
                String str4 = androidStringManager.get(R.string.bitcoin_taxes_tof_title);
                String str5 = androidStringManager.get(R.string.bitcoin_taxes_tof_body);
                String str6 = androidStringManager.get(R.string.bitcoin_taxes_tof_button);
                AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle bannerStyle = AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle.BITCOIN_TAXES;
                zzd zzdVar = Icons.Companion;
                ArrayList plus = CollectionsKt.plus((Iterable) accountDocumentsViewModel.documents, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new AccountDocumentsViewModel.DocumentModel.BannerModel(str4, str5, str6)));
                String str7 = accountDocumentsViewModel.title;
                boolean z2 = accountDocumentsViewModel.isLoading;
                StatementType statementType = accountDocumentsViewModel.statementType;
                String str8 = accountDocumentsViewModel.emptyStateDescription;
                str7.getClass();
                return new AccountDocumentsViewModel(str7, plus, z2, statementType, str8);
            case 1:
                String str9 = (String) this.L$0;
                boolean z3 = this.Z$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingOrderTypeSelectionPresenter investingOrderTypeSelectionPresenter = (InvestingOrderTypeSelectionPresenter) moleculePresenter;
                AndroidStringManager androidStringManager2 = investingOrderTypeSelectionPresenter.stringManager;
                InvestingScreens.OrderTypeSelectionScreen orderTypeSelectionScreen = investingOrderTypeSelectionPresenter.args;
                if (orderTypeSelectionScreen.orderSide != OrderSide.BUY) {
                    InvestingOrderTypeRowViewModel.Icon icon = InvestingOrderTypeRowViewModel.Icon.CUSTOM_ORDER_SELL;
                    String str10 = androidStringManager2.get(R.string.order_type_custom_order_title_sell);
                    if (orderTypeSelectionScreen.f1159type instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                        str9.getClass();
                        Resources resources = androidStringManager2.resources;
                        resources.getClass();
                        str = new MessageFormat(resources.getString(R.string.order_type_custom_order_description_equity_sell)).format(new Object[]{str9});
                        str.getClass();
                    } else {
                        str = androidStringManager2.get(R.string.order_type_custom_order_description_bitcoin_sell);
                    }
                    return CollectionsKt__CollectionsJVMKt.listOf(new InvestingOrderTypeRowViewModel(icon, str10, str, orderTypeSelectionScreen.accentColor));
                }
                if (z3) {
                    InvestingOrderTypeRowViewModel.Icon icon2 = InvestingOrderTypeRowViewModel.Icon.AUTO_INVEST;
                    String str11 = androidStringManager2.get(R.string.order_type_auto_invest_title);
                    if (orderTypeSelectionScreen.f1159type instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                        str9.getClass();
                        Resources resources2 = androidStringManager2.resources;
                        resources2.getClass();
                        str3 = new MessageFormat(resources2.getString(R.string.order_type_auto_invest_description_equity_purchase)).format(new Object[]{str9});
                        str3.getClass();
                    } else {
                        str3 = androidStringManager2.get(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) investingOrderTypeSelectionPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest.INSTANCE)).enabled() ? R.string.order_type_auto_invest_description_bitcoin_purchase_with_monthly : R.string.order_type_auto_invest_description_bitcoin_purchase);
                    }
                    investingOrderTypeRowViewModel = new InvestingOrderTypeRowViewModel(icon2, str11, str3, orderTypeSelectionScreen.accentColor);
                } else {
                    investingOrderTypeRowViewModel = null;
                }
                InvestingOrderTypeRowViewModel.Icon icon3 = InvestingOrderTypeRowViewModel.Icon.CUSTOM_ORDER_BUY;
                String str12 = androidStringManager2.get(R.string.order_type_custom_order_title_purchase);
                if (orderTypeSelectionScreen.f1159type instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                    str9.getClass();
                    Resources resources3 = androidStringManager2.resources;
                    resources3.getClass();
                    str2 = new MessageFormat(resources3.getString(R.string.order_type_custom_order_description_equity_purchase)).format(new Object[]{str9});
                    str2.getClass();
                } else {
                    str2 = androidStringManager2.get(R.string.order_type_custom_order_description_bitcoin_purchase);
                }
                return ArraysKt___ArraysKt.filterNotNull(new InvestingOrderTypeRowViewModel[]{investingOrderTypeRowViewModel, new InvestingOrderTypeRowViewModel(icon3, str12, str2, orderTypeSelectionScreen.accentColor)});
            default:
                InvitationConfig invitationConfig = (InvitationConfig) this.L$0;
                boolean z4 = this.Z$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardLockPresenter cardLockPresenter = (CardLockPresenter) moleculePresenter;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) cardLockPresenter.stringManager;
                String str13 = invitationConfig.profile_row_title;
                if (str13 == null) {
                    str13 = z4 ? androidStringManager3.get(R.string.invite_customers_title) : androidStringManager3.get(R.string.invite_friends_title);
                }
                String str14 = invitationConfig.profile_row_subtitle;
                if (str14 == null) {
                    String format2 = ((MoneyFormatter) cardLockPresenter.flowNavigationHelper).format(invitationConfig.bounty_amount);
                    format2.getClass();
                    Resources resources4 = androidStringManager3.resources;
                    resources4.getClass();
                    str14 = new MessageFormat(resources4.getString(R.string.invite_subtitle)).format(new Object[]{format2});
                    str14.getClass();
                }
                return new PromotionsReferralsHomeViewModel.Loaded.InvitePromotion(str13, str14, invitationConfig.enabled);
        }
    }
}
