package com.squareup.cash.earnings.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import coil3.RealImageLoader;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earnings.screens.PayerTaggingPromptSheet;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.earnings.screens.streamdetail.EarningsStreamDetailScreen;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewModel;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt;
import com.squareup.cash.earningstracker.screens.EarningsTimeframeSelectorSheetScreen;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.earningstracker.screens.NetEarningsInfoSheetScreen;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public final class EarningsUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;

    public /* synthetic */ EarningsUiFactory(RealImageLoader realImageLoader, LocalizedMoneyFormatter.Factory factory, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
        this.moneyFormatterFactory = factory;
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        int i = this.$r8$classId;
        final int i2 = 1;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof EarningsHomeScreen) {
                    final int i3 = 0;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.earnings.views.EarningsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ EarningsUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i4 = i3;
                            EarningsUiFactory earningsUiFactory = this.f$0;
                            switch (i4) {
                                case 0:
                                    EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    earningsHomeViewModel.getClass();
                                    function1.getClass();
                                    EarningsHomeKt.EarningsHome(earningsHomeViewModel, function1, earningsUiFactory.imageLoader, earningsUiFactory.moneyFormatterFactory, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    EarningsActivityListViewModel earningsActivityListViewModel = (EarningsActivityListViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    earningsActivityListViewModel.getClass();
                                    function12.getClass();
                                    EarningsHomeKt.EarningsActivityList(earningsActivityListViewModel, function12, earningsUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    addPayerCustomersViewModel.getClass();
                                    function13.getClass();
                                    AddPayerCustomersViewKt.AddPayerCustomers(addPayerCustomersViewModel, function13, earningsUiFactory.imageLoader, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 3:
                                    PayerTaggingPromptViewModel payerTaggingPromptViewModel = (PayerTaggingPromptViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    payerTaggingPromptViewModel.getClass();
                                    function14.getClass();
                                    AddPayerCustomersViewKt.PayerTaggingPrompt(payerTaggingPromptViewModel, function14, earningsUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    EarningsStreamDetailViewModel earningsStreamDetailViewModel = (EarningsStreamDetailViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    earningsStreamDetailViewModel.getClass();
                                    function15.getClass();
                                    EarningsStreamDetailKt.EarningsStreamDetail(earningsStreamDetailViewModel, function15, earningsUiFactory.imageLoader, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1332208850));
                }
                if (screen instanceof EarningsActivityListScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.earnings.views.EarningsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ EarningsUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i4 = i2;
                            EarningsUiFactory earningsUiFactory = this.f$0;
                            switch (i4) {
                                case 0:
                                    EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    earningsHomeViewModel.getClass();
                                    function1.getClass();
                                    EarningsHomeKt.EarningsHome(earningsHomeViewModel, function1, earningsUiFactory.imageLoader, earningsUiFactory.moneyFormatterFactory, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    EarningsActivityListViewModel earningsActivityListViewModel = (EarningsActivityListViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    earningsActivityListViewModel.getClass();
                                    function12.getClass();
                                    EarningsHomeKt.EarningsActivityList(earningsActivityListViewModel, function12, earningsUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    addPayerCustomersViewModel.getClass();
                                    function13.getClass();
                                    AddPayerCustomersViewKt.AddPayerCustomers(addPayerCustomersViewModel, function13, earningsUiFactory.imageLoader, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 3:
                                    PayerTaggingPromptViewModel payerTaggingPromptViewModel = (PayerTaggingPromptViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    payerTaggingPromptViewModel.getClass();
                                    function14.getClass();
                                    AddPayerCustomersViewKt.PayerTaggingPrompt(payerTaggingPromptViewModel, function14, earningsUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    EarningsStreamDetailViewModel earningsStreamDetailViewModel = (EarningsStreamDetailViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    earningsStreamDetailViewModel.getClass();
                                    function15.getClass();
                                    EarningsStreamDetailKt.EarningsStreamDetail(earningsStreamDetailViewModel, function15, earningsUiFactory.imageLoader, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1168507771));
                }
                if (screen instanceof AddPayerCustomersScreen) {
                    final int i4 = 2;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.earnings.views.EarningsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ EarningsUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i42 = i4;
                            EarningsUiFactory earningsUiFactory = this.f$0;
                            switch (i42) {
                                case 0:
                                    EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    earningsHomeViewModel.getClass();
                                    function1.getClass();
                                    EarningsHomeKt.EarningsHome(earningsHomeViewModel, function1, earningsUiFactory.imageLoader, earningsUiFactory.moneyFormatterFactory, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    EarningsActivityListViewModel earningsActivityListViewModel = (EarningsActivityListViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    earningsActivityListViewModel.getClass();
                                    function12.getClass();
                                    EarningsHomeKt.EarningsActivityList(earningsActivityListViewModel, function12, earningsUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    addPayerCustomersViewModel.getClass();
                                    function13.getClass();
                                    AddPayerCustomersViewKt.AddPayerCustomers(addPayerCustomersViewModel, function13, earningsUiFactory.imageLoader, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 3:
                                    PayerTaggingPromptViewModel payerTaggingPromptViewModel = (PayerTaggingPromptViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    payerTaggingPromptViewModel.getClass();
                                    function14.getClass();
                                    AddPayerCustomersViewKt.PayerTaggingPrompt(payerTaggingPromptViewModel, function14, earningsUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    EarningsStreamDetailViewModel earningsStreamDetailViewModel = (EarningsStreamDetailViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    earningsStreamDetailViewModel.getClass();
                                    function15.getClass();
                                    EarningsStreamDetailKt.EarningsStreamDetail(earningsStreamDetailViewModel, function15, earningsUiFactory.imageLoader, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -647825799));
                }
                if (screen instanceof PayerTaggingPromptSheet) {
                    final int i5 = 3;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.earnings.views.EarningsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ EarningsUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i42 = i5;
                            EarningsUiFactory earningsUiFactory = this.f$0;
                            switch (i42) {
                                case 0:
                                    EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    earningsHomeViewModel.getClass();
                                    function1.getClass();
                                    EarningsHomeKt.EarningsHome(earningsHomeViewModel, function1, earningsUiFactory.imageLoader, earningsUiFactory.moneyFormatterFactory, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    EarningsActivityListViewModel earningsActivityListViewModel = (EarningsActivityListViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    earningsActivityListViewModel.getClass();
                                    function12.getClass();
                                    EarningsHomeKt.EarningsActivityList(earningsActivityListViewModel, function12, earningsUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    addPayerCustomersViewModel.getClass();
                                    function13.getClass();
                                    AddPayerCustomersViewKt.AddPayerCustomers(addPayerCustomersViewModel, function13, earningsUiFactory.imageLoader, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 3:
                                    PayerTaggingPromptViewModel payerTaggingPromptViewModel = (PayerTaggingPromptViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    payerTaggingPromptViewModel.getClass();
                                    function14.getClass();
                                    AddPayerCustomersViewKt.PayerTaggingPrompt(payerTaggingPromptViewModel, function14, earningsUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    EarningsStreamDetailViewModel earningsStreamDetailViewModel = (EarningsStreamDetailViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    earningsStreamDetailViewModel.getClass();
                                    function15.getClass();
                                    EarningsStreamDetailKt.EarningsStreamDetail(earningsStreamDetailViewModel, function15, earningsUiFactory.imageLoader, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 562362129));
                }
                if (!(screen instanceof EarningsStreamDetailScreen)) {
                    return null;
                }
                final int i6 = 4;
                return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.earnings.views.EarningsUiFactory$$ExternalSyntheticLambda0
                    public final /* synthetic */ EarningsUiFactory f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i42 = i6;
                        EarningsUiFactory earningsUiFactory = this.f$0;
                        switch (i42) {
                            case 0:
                                EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj;
                                Function1 function1 = (Function1) obj2;
                                int intValue = ((Integer) obj4).intValue();
                                earningsHomeViewModel.getClass();
                                function1.getClass();
                                EarningsHomeKt.EarningsHome(earningsHomeViewModel, function1, earningsUiFactory.imageLoader, earningsUiFactory.moneyFormatterFactory, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 1:
                                EarningsActivityListViewModel earningsActivityListViewModel = (EarningsActivityListViewModel) obj;
                                Function1 function12 = (Function1) obj2;
                                int intValue2 = ((Integer) obj4).intValue();
                                earningsActivityListViewModel.getClass();
                                function12.getClass();
                                EarningsHomeKt.EarningsActivityList(earningsActivityListViewModel, function12, earningsUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 2:
                                AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) obj;
                                Function1 function13 = (Function1) obj2;
                                int intValue3 = ((Integer) obj4).intValue();
                                addPayerCustomersViewModel.getClass();
                                function13.getClass();
                                AddPayerCustomersViewKt.AddPayerCustomers(addPayerCustomersViewModel, function13, earningsUiFactory.imageLoader, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            case 3:
                                PayerTaggingPromptViewModel payerTaggingPromptViewModel = (PayerTaggingPromptViewModel) obj;
                                Function1 function14 = (Function1) obj2;
                                int intValue4 = ((Integer) obj4).intValue();
                                payerTaggingPromptViewModel.getClass();
                                function14.getClass();
                                AddPayerCustomersViewKt.PayerTaggingPrompt(payerTaggingPromptViewModel, function14, earningsUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                            default:
                                EarningsStreamDetailViewModel earningsStreamDetailViewModel = (EarningsStreamDetailViewModel) obj;
                                Function1 function15 = (Function1) obj2;
                                int intValue5 = ((Integer) obj4).intValue();
                                earningsStreamDetailViewModel.getClass();
                                function15.getClass();
                                EarningsStreamDetailKt.EarningsStreamDetail(earningsStreamDetailViewModel, function15, earningsUiFactory.imageLoader, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1998188218));
            default:
                if (screen instanceof EarningsTrackerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 9), true, -547141785));
                }
                if (screen instanceof NetEarningsInfoSheetScreen) {
                    return new UiFactory.ComposeUi(NetEarningsInfoSheetViewKt.lambda$226314797);
                }
                if (screen instanceof EarningsTimeframeSelectorSheetScreen) {
                    return new UiFactory.ComposeUi(NetEarningsInfoSheetViewKt.lambda$2091573679);
                }
                return null;
        }
    }
}
