package app.cash.local.views;

import androidx.core.os.BundleKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.screens.app.LocalAddBrandsScreen;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalBrandProfileSubScreen;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.LocalNeighborhoodsMapScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalPosBrandOnboardingScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.screens.app.LocalScreen;
import app.cash.local.screens.app.LocalTabScreen;
import coil3.size.SizeKt;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.screens.BorrowLandingScreen;
import com.squareup.cash.borrow.screens.BorrowScreen;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatHistoryScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.recurringpayments.screens.SelectCadenceScreen;
import com.squareup.cash.recurringpayments.screens.SelectDayOfCadenceScreen;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.tax.screens.TaxReturnsScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.franklin.api.ClientScenario;

/* loaded from: classes.dex */
public final class LocalTransitionFactory implements TransitionFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LocalTransitionFactory(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x010c, code lost:
    
        if (r19 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0269, code lost:
    
        if ((r18 instanceof com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen) != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0273, code lost:
    
        if ((r18 instanceof com.squareup.cash.paychecks.screens.EditDistributionScreen) != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if (r0 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0628, code lost:
    
        if ((r17 instanceof app.cash.local.screens.app.LocalMenuItemDetailsScreen) != false) goto L671;
     */
    @Override // app.cash.broadway.ui.TransitionFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.$r8$classId;
        TransitionFactory.StandardTransition.FadeOutThenIn fadeOutThenIn = TransitionFactory.StandardTransition.FadeOutThenIn.INSTANCE;
        TransitionFactory.StandardTransition.OutToRight outToRight = TransitionFactory.StandardTransition.OutToRight.INSTANCE;
        TransitionFactory.StandardTransition.InFromRight inFromRight = TransitionFactory.StandardTransition.InFromRight.INSTANCE;
        TransitionFactory.StandardTransition.FadeOut fadeOut = TransitionFactory.StandardTransition.FadeOut.INSTANCE;
        TransitionFactory.StandardTransition.Immediate immediate = TransitionFactory.StandardTransition.Immediate.INSTANCE;
        boolean z6 = false;
        TransitionFactory.StandardTransition.PushLeft pushLeft = TransitionFactory.StandardTransition.PushLeft.INSTANCE;
        TransitionFactory.StandardTransition.PushRight pushRight = TransitionFactory.StandardTransition.PushRight.INSTANCE;
        TransitionFactory.StandardTransition.InFromBottom inFromBottom = TransitionFactory.StandardTransition.InFromBottom.INSTANCE;
        TransitionFactory.StandardTransition.OutToBottom outToBottom = TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
        switch (i) {
            case 0:
                screen2.getClass();
                if (!(screen instanceof LocalNeighborhoodsMapScreen) || !SizeKt.isHomeOrProfile(screen2)) {
                    if ((!SizeKt.isHomeOrProfile(screen) || !(screen2 instanceof LocalNeighborhoodsMapScreen)) && !(screen instanceof LocalFulfillmentPickerScreen) && !(screen instanceof LocalPosBrandOnboardingScreen)) {
                        if (!(screen2 instanceof LocalFulfillmentPickerScreen) && !(screen2 instanceof LocalPosCheckInScreen)) {
                            if (!(screen instanceof LocalPosCheckInScreen)) {
                                if ((!SizeKt.isHomeOrProfile(screen) || !(screen2 instanceof LocalBrandLocationCartScreen)) && (!(screen instanceof LocalTabScreen) || (!(screen2 instanceof LocalBrandProfileScreen) && !(screen2 instanceof LocalCashBalanceScreen)))) {
                                    boolean z7 = screen instanceof LocalBrandProfileScreen;
                                    if ((!z7 && !(screen instanceof LocalCashBalanceScreen)) || !(screen2 instanceof LocalTabScreen)) {
                                        if (!(screen instanceof LocalBrandLocationMenuScreen) || !SizeKt.isHomeOrProfile(screen2)) {
                                            if (!SizeKt.isHomeOrProfile(screen) || !(screen2 instanceof LocalBrandLocationMenuScreen)) {
                                                if (!(screen2 instanceof LocalSchedulingDayTimePickerScreen)) {
                                                    if (!(screen instanceof LocalSchedulingDayTimePickerScreen)) {
                                                        if (!(screen2 instanceof LocalMenuItemDetailsScreen)) {
                                                            if (!(screen instanceof LocalMenuItemDetailsScreen)) {
                                                                if (!(screen2 instanceof LocalMenuComboDetailsScreen)) {
                                                                    if (!(screen instanceof LocalMenuComboDetailsScreen)) {
                                                                        if (!(screen instanceof LocalBrandLocationCartScreen) || !(screen2 instanceof LocalBrandLocationMenuScreen)) {
                                                                            if (!SizeKt.isHomeOrProfile(screen) || !(screen2 instanceof LocalOrderStatusScreen)) {
                                                                                if (!(screen instanceof LocalOrderStatusScreen) || !SizeKt.isHomeOrProfile(screen2)) {
                                                                                    boolean z8 = screen instanceof LocalAddBrandsScreen;
                                                                                    if (!z8 || !SizeKt.isHomeOrProfile(screen2)) {
                                                                                        if (!SizeKt.isHomeOrProfile(screen) || !(screen2 instanceof LocalAddBrandsScreen)) {
                                                                                            if (!(screen2 instanceof LocalAddBrandsScreen)) {
                                                                                                if (!z8 && (!((z2 = screen2 instanceof LocalEditorialScreen)) || !SizeKt.isHomeOrProfile(screen))) {
                                                                                                    boolean z9 = screen instanceof LocalEditorialScreen;
                                                                                                    if ((!z9 || !SizeKt.isHomeOrProfile(screen2)) && ((!z9 || !(screen2 instanceof LocalBrandProfileSubScreen)) && !z2)) {
                                                                                                        if (!z9) {
                                                                                                            if (!SizeKt.isHomeOrProfile(screen) || !(screen2 instanceof LocalMarketingMessageScreen)) {
                                                                                                                if (!SizeKt.isHomeOrProfile(screen2) || !(screen instanceof LocalMarketingMessageScreen)) {
                                                                                                                    if (!(screen instanceof LocalMarketingMessagesScreen) || !(screen2 instanceof LocalMarketingMessageScreen)) {
                                                                                                                        if ((!(screen2 instanceof LocalMarketingMessagesScreen) || !(screen instanceof LocalMarketingMessageScreen)) && (!(screen2 instanceof LocalBrandProfileScreen) || !z7)) {
                                                                                                                            if (!(screen instanceof LocalScreen) || !(screen2 instanceof LocalScreen)) {
                                                                                                                                break;
                                                                                                                            } else {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (screen2 instanceof LocalMenuItemDetailsScreen) {
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                screen2.getClass();
                if (!(screen instanceof BlockersScreens) || !(screen2 instanceof BusinessInfoScreen)) {
                    break;
                }
                break;
            case 2:
                screen2.getClass();
                if (!(screen instanceof HistoryScreens.PaymentReceipt) || !(screen2 instanceof HistoryScreens.PaymentReceipt)) {
                    break;
                } else if (z) {
                    break;
                }
                break;
            case 3:
                screen2.getClass();
                if (!(screen2 instanceof FullscreenAdScreen)) {
                    if (!(screen instanceof FullscreenAdScreen)) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 4:
                screen2.getClass();
                boolean z10 = (screen instanceof Account) && (screen2 instanceof BitcoinDepositsScreen);
                if ((screen instanceof BitcoinDepositsScreen) && (screen2 instanceof Account)) {
                    z6 = true;
                }
                if (!z10 && !z6) {
                    if (!(screen instanceof BitcoinHome) || !(screen2 instanceof BlockersScreens.FormScreen)) {
                        if (!(screen instanceof BlockersScreens.FormScreen) || !(screen2 instanceof BitcoinHome)) {
                            if (!(screen2 instanceof StablecoinOnboardingScreen)) {
                                if (!(screen instanceof StablecoinOnboardingScreen)) {
                                    break;
                                }
                            }
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 5:
                screen2.getClass();
                if ((!BundleKt.isOnboarding(screen) || ((BlockersScreens) screen).getBlockersData().clientScenario != ClientScenario.RETURNING_CUSTOMER_LOGIN) && (!BundleKt.isOnboarding(screen2) || ((BlockersScreens) screen2).getBlockersData().clientScenario != ClientScenario.RETURNING_CUSTOMER_LOGIN)) {
                    if (!BundleKt.isOnboarding(screen) || BundleKt.isOnboarding(screen2)) {
                        if (BundleKt.isOnboarding(screen2) && !BundleKt.isOnboarding(screen)) {
                        }
                    }
                }
                break;
            case 6:
                screen2.getClass();
                if (((!(screen instanceof BorrowScreen) || (screen instanceof BorrowLandingScreen)) && !(screen instanceof BlockersScreens.CreditMultiStepLoadingBlockerScreen) && !(screen instanceof BlockersScreens.FormScreen)) || !(screen2 instanceof BorrowLandingScreen)) {
                    break;
                }
                break;
            case 7:
                screen2.getClass();
                if (!((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen2)).booleanValue() || !((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen)).booleanValue()) {
                    if (!((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen2)).booleanValue()) {
                        if (!((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen)).booleanValue()) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 8:
                screen2.getClass();
                break;
            case 9:
                screen2.getClass();
                if (!(screen2 instanceof DirectDepositEditPaycheckCurrencyAllocationScreen) && !(screen2 instanceof DirectDepositEditPaycheckPercentageScreen)) {
                    if ((screen2 instanceof DirectDepositManualFormDetailsScreen) && (screen instanceof DirectDepositEditCompanyNameScreen) && ((DirectDepositEditCompanyNameScreen) screen).question == null) {
                        break;
                    }
                }
                break;
            case 10:
                screen2.getClass();
                if (!(screen2 instanceof PromotionDetails)) {
                    if (!(screen instanceof PromotionDetails)) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 11:
                screen2.getClass();
                if (!(screen instanceof DependentDetailScreen) || !(screen2 instanceof DependentActivityScreen)) {
                    if (!(screen instanceof DependentActivityScreen) || !(screen2 instanceof DependentDetailScreen)) {
                        if (!(screen instanceof BlockersScreens.StatusResultFullScreen) || !(screen2 instanceof SponsorDetailScreen)) {
                            if (!(screen2 instanceof DependentDetailScreen) || (!(screen instanceof SelectCadenceScreen) && !(screen instanceof SelectDayOfCadenceScreen))) {
                                if (!(screen instanceof FamilyHome) || !(screen2 instanceof SwitchFullAccountLoadingScreen)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 12:
                screen2.getClass();
                boolean z11 = ((screen instanceof MoneyTabScreen) || (screen instanceof ActivityScreen) || (screen instanceof PaymentScreens$HomeScreens$PaymentPad)) && (screen2 instanceof GlobalSearchScreen) && ((GlobalSearchScreen) screen2).searchOrigin != SearchOrigin.DISCOVER_TAB;
                if (((screen2 instanceof MoneyTabScreen) || (screen2 instanceof ActivityScreen) || (screen2 instanceof PaymentScreens$HomeScreens$PaymentPad)) && (screen instanceof GlobalSearchScreen) && ((GlobalSearchScreen) screen).searchOrigin != SearchOrigin.DISCOVER_TAB) {
                    z6 = true;
                }
                if (z11 || z6) {
                    if (!z11) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 13:
                screen2.getClass();
                boolean z12 = screen instanceof GrowToolsManagerScreen;
                if (!z12 || !(screen2 instanceof BlockersScreens.StartFlowEntryPointScreen)) {
                    if (!z12 || !(screen2 instanceof BlockersScreens.FormScreen)) {
                        if (!(screen instanceof BlockersScreens.FormScreen) || !(screen2 instanceof GrowToolsManagerScreen)) {
                            if (!z12 || !(screen2 instanceof HistoryScreens.PaymentReceipt)) {
                                if ((!(screen instanceof HistoryScreens.PaymentReceipt) || !(screen2 instanceof GrowToolsManagerScreen)) && (!(screen instanceof DirectDepositSetupScreen) || !(screen2 instanceof GrowToolsManagerScreen))) {
                                    if (!z12 || z || (screen2 instanceof GrowToolsCompleteActivityScreen) || (screen2 instanceof GrowToolsManagerScreen)) {
                                        if (!(screen2 instanceof GrowToolsManagerScreen) || !z || (screen instanceof GrowToolsCompleteActivityScreen)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 14:
                screen2.getClass();
                if (!(screen2 instanceof PaymentScreens.MainPayment) || !(screen instanceof InvestingScreens.StockDetails) || !(((InvestingScreens.StockDetails) screen).origin instanceof InvestingScreens.StockDetails.Origin.StockSearch)) {
                    if (!(screen2 instanceof InvestingScreens.InvestingCategoryFilterScreen)) {
                        if (!(screen instanceof InvestingScreens.InvestingCategoryFilterScreen)) {
                            if (!(screen instanceof InvestingScreens.CancelRecurringPurchase) || !(screen2 instanceof BlockersScreens)) {
                                if (!(screen instanceof GlobalSearchScreen) || !(screen2 instanceof InvestingScreens.StockDetails)) {
                                    if (!(screen instanceof InvestingScreens.StockDetails) || !(screen2 instanceof GlobalSearchScreen)) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                break;
            case 15:
                screen2.getClass();
                if (!(screen2 instanceof MerchantScreen$MerchantProfileScreen) || !(screen instanceof GlobalSearchScreen)) {
                    if (!(screen2 instanceof GlobalSearchScreen) || !(screen instanceof MerchantScreen$MerchantProfileScreen)) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 16:
                screen2.getClass();
                boolean z13 = screen instanceof MoneyTabScreen;
                if (!z13 || !(screen2 instanceof WalletHomeScreen)) {
                    if (!(screen instanceof WalletHomeScreen) || !(screen2 instanceof MoneyTabScreen)) {
                        if (!z13 || !(screen2 instanceof PoolsListScreen)) {
                            if (!(screen instanceof PoolsListScreen) || !(screen2 instanceof MoneyTabScreen)) {
                                break;
                            } else {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 17:
                screen2.getClass();
                if (!(screen instanceof BlockersScreens) || !(screen2 instanceof MoneybotChatScreen)) {
                    if (!(screen2 instanceof MoneybotAmountInputScreen) && !(screen2 instanceof MoneybotFeedbackScreen) && !(screen2 instanceof MoneybotStaticPickerScreen) && !(screen2 instanceof MoneybotTextInputScreen)) {
                        if (!(screen instanceof MoneybotAmountInputScreen) && !(screen instanceof MoneybotFeedbackScreen) && !(screen instanceof MoneybotStaticPickerScreen) && !(screen instanceof MoneybotTextInputScreen)) {
                            if (!(screen2 instanceof MoneybotChatHistoryScreen)) {
                                if (!(screen instanceof MoneybotChatHistoryScreen)) {
                                    if (!(screen2 instanceof MoneybotOverflowMenuScreen) || z) {
                                        boolean z14 = screen instanceof MoneybotOverflowMenuScreen;
                                        if (!z14 || !z) {
                                            if (!z14 || z) {
                                                if (!(screen instanceof MoneybotHomeScreen) || !(screen2 instanceof MoneybotChatScreen)) {
                                                    if (!(screen instanceof MoneybotChatScreen) || !z) {
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 18:
                screen2.getClass();
                if (!(screen instanceof SetPaycheckMultipleAllocationScreen)) {
                    if (!(screen instanceof EditDistributionScreen)) {
                        if (screen instanceof CustomAllocationScreen) {
                            break;
                        }
                    } else if (!(screen2 instanceof CustomAllocationScreen)) {
                        break;
                    }
                } else {
                    if (!(screen2 instanceof EditDistributionScreen)) {
                        if (screen2 instanceof BlockersScreens.StockSelectionBlockerScreen) {
                        }
                        break;
                    }
                    break;
                }
                break;
            case 19:
                screen2.getClass();
                if (!((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen)).booleanValue() || !(screen2 instanceof LitePaymentPadSheetScreen) || !((LitePaymentPadSheetScreen) screen2).animateEntrance) {
                    if (!(screen instanceof LitePaymentPadSheetScreen) || !((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen2)).booleanValue()) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 20:
                screen2.getClass();
                if (!(screen2 instanceof PdfScreen)) {
                    if (!(screen instanceof PdfScreen)) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 21:
                screen2.getClass();
                if (!(screen2 instanceof InstrumentSelectionScreen)) {
                    boolean z15 = screen2 instanceof PoolMemberListScreen;
                    if (!z15 || !(screen instanceof PoolDetailsScreen)) {
                        boolean z16 = screen2 instanceof PoolInvitePeopleListScreen;
                        if (!z16 || !(screen instanceof PoolMemberListScreen)) {
                            if (!(screen2 instanceof BlockersScreens) || !(screen instanceof PoolDetailsScreen)) {
                                if (!(screen2 instanceof PaymentScreens.PaymentLoading) || !(screen instanceof PoolDetailsScreen)) {
                                    if (!z16 || !(screen instanceof PoolDetailsScreen)) {
                                        if (!(screen instanceof InstrumentSelectionScreen) && ((!(screen instanceof PoolMemberListScreen) || !(screen2 instanceof PoolDetailsScreen)) && ((!((z3 = screen instanceof PoolInvitePeopleListScreen)) || !z15) && ((!(screen instanceof BlockersScreens) || !(screen2 instanceof PoolDetailsScreen)) && ((!(screen instanceof PaymentScreens.PaymentLoading) || !(screen2 instanceof PoolDetailsScreen)) && (!((z4 = screen2 instanceof PoolDetailsScreen)) || !z3)))))) {
                                            if (!z4) {
                                                if (!(screen instanceof PoolDetailsScreen)) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 22:
                screen2.getClass();
                if (!(screen instanceof PromotionsReferralsScreen$PromotionsReferralsHomeScreen) || !(screen2 instanceof BlockersScreens)) {
                    if (!(screen instanceof BlockersScreens) || !(screen2 instanceof PromotionsReferralsScreen$PromotionsReferralsHomeScreen)) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 23:
                screen2.getClass();
                if (!(screen instanceof QrCodeScreen) || !(screen2 instanceof CashQrCodeScanner)) {
                    boolean z17 = screen instanceof CashQrCodeScanner;
                    if (!z17 || !(screen2 instanceof QrCodeScreen)) {
                        if (!(screen instanceof Account) || !(screen2 instanceof CashQrCodeScanner)) {
                            if (!z17 || !(screen2 instanceof Account)) {
                                if (!(screen2 instanceof CashtagQrScanScreen)) {
                                    if (!(screen instanceof CashtagQrScanScreen)) {
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 24:
                screen2.getClass();
                if (screen instanceof BlockersScreens) {
                    if (screen2 instanceof GeneralSavingsScreen) {
                    }
                    break;
                } else if (screen instanceof GeneralSavingsScreen) {
                    if ((screen2 instanceof TransferInScreen.Full) || (screen2 instanceof TransferOutScreen$Full)) {
                    }
                } else if (!(screen instanceof TransferInScreen.Full)) {
                    break;
                }
                break;
            case 25:
                screen2.getClass();
                if (!(screen instanceof SupportChatScreens.FlowScreen.ChatLoading) || !(screen2 instanceof SupportChatScreens.FlowScreen.ChatScreen)) {
                    if (!(screen2 instanceof SupportChatScreens.FlowScreen.ChatScreen) || !(screen instanceof SupportScreens)) {
                        if (!(screen2 instanceof SupportChatScreens.FlowScreen.ChatTransactionPicker)) {
                            if (!(screen instanceof SupportChatScreens.FlowScreen.ChatTransactionPicker)) {
                                if (!(screen2 instanceof SupportChatScreens.FlowScreen.ChatImageDetail)) {
                                    if (!(screen instanceof SupportChatScreens.FlowScreen.ChatImageDetail)) {
                                        if (!(screen2 instanceof SupportChatScreens)) {
                                            if (!(screen instanceof SupportChatScreens)) {
                                                break;
                                            } else if (!(screen2 instanceof BlockersScreens)) {
                                                if ((screen2 instanceof SupportScreens) && !z) {
                                                }
                                            }
                                        } else if (!(screen instanceof BlockersScreens)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 26:
                screen2.getClass();
                boolean z18 = screen instanceof SupportScreens;
                if (!z18 || !(screen2 instanceof SupportScreens)) {
                    if (!z18) {
                        if (!(screen2 instanceof SupportScreens)) {
                            break;
                        } else if (!(screen2 instanceof SupportScreens.FlowScreens.SupportSearchScreen)) {
                            if ((!(screen instanceof BlockersScreens) || !z) && (!((z5 = screen instanceof HistoryScreens.PaymentReceipt)) || ((HistoryScreens.PaymentReceipt) screen).activityItemKey.getActivityScope() != ActivityScope.SUPPORT_TRANSACTION)) {
                                if (z5) {
                                }
                            }
                            break;
                        }
                    } else {
                        if ((!(screen2 instanceof BlockersScreens) || z) && (!((r0 = screen2 instanceof HistoryScreens.PaymentReceipt)) || ((HistoryScreens.PaymentReceipt) screen2).activityItemKey.getActivityScope() != ActivityScope.SUPPORT_TRANSACTION)) {
                        }
                        break;
                    }
                } else if (!(screen2 instanceof SupportScreens.FlowScreens.SupportHomeScreen) && (!(screen2 instanceof SupportScreens.FlowScreens.SupportSearchScreen) || (screen instanceof SupportScreens.FlowScreens.SupportHomeScreen))) {
                    break;
                }
                break;
            case 27:
                screen2.getClass();
                if (!(screen2 instanceof TapToPayScreen.TapToPayInitialScreen)) {
                    if (!(screen instanceof TapToPayScreen.TapToPayInitialScreen)) {
                        if (!(screen instanceof TapToPayPaymentScreen) && !(screen instanceof TapToPayPaymentRequestScreen)) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                screen2.getClass();
                if (!(screen instanceof TaxReturnsScreen) || !z) {
                    if (!(screen instanceof TaxAuthorizationScreen)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return null;
    }
}
