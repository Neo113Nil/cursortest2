package com.squareup.cash.benefits.views;

import android.view.View;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Installed$Default;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantLinkingStatus;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.VersionedCashGreen;
import squareup.cash.bankingbenefits.ui.VersionedGreenBenefits;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsHubViewKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BenefitsHubViewKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CashGreenV1.Status status;
        int i = this.$r8$classId;
        AppletTileInstallationState.Uninstalled uninstalled = AppletTileInstallationState.Uninstalled.INSTANCE;
        AppletTileInstallationState.Loading loading = AppletTileInstallationState.Loading.INSTANCE;
        AppletTileInstallationState.Installed installed = AppletTileInstallationState.Installed.INSTANCE;
        switch (i) {
            case 0:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                break;
            case 1:
                VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
                versionedCashGreen.getClass();
                break;
            case 2:
                VersionedCashGreen versionedCashGreen2 = (VersionedCashGreen) obj;
                versionedCashGreen2.getClass();
                break;
            case 3:
                CashGreenV1 cashGreenV1 = (CashGreenV1) obj;
                if (cashGreenV1 != null && (status = cashGreenV1.status) != null && status != CashGreenV1.Status.INELIGIBLE) {
                    break;
                } else {
                    break;
                }
            case 4:
                BankingBenefitsAppletTileModel bankingBenefitsAppletTileModel = (BankingBenefitsAppletTileModel) obj;
                bankingBenefitsAppletTileModel.getClass();
                if (!bankingBenefitsAppletTileModel.getShowInBalanceSection()) {
                    break;
                } else {
                    break;
                }
            case 5:
                BankingBenefitsAppletTileModel bankingBenefitsAppletTileModel2 = (BankingBenefitsAppletTileModel) obj;
                bankingBenefitsAppletTileModel2.getClass();
                if (!(bankingBenefitsAppletTileModel2 instanceof BankingBenefitsAppletTileModel$Installed$Default)) {
                    if (!(bankingBenefitsAppletTileModel2 instanceof BankingBenefitsAppletTileModel.Loading)) {
                        if (!(bankingBenefitsAppletTileModel2 instanceof BankingBenefitsAppletTileModel.Failed)) {
                            if (!(bankingBenefitsAppletTileModel2 instanceof BankingBenefitsAppletTileModel.Uninstalled)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
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
            case 6:
                VersionedCashGreen versionedCashGreen3 = (VersionedCashGreen) obj;
                versionedCashGreen3.getClass();
                break;
            case 7:
                VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) obj;
                versionedGreenBenefits.getClass();
                break;
            case 8:
                VersionedCashGreen versionedCashGreen4 = (VersionedCashGreen) obj;
                versionedCashGreen4.getClass();
                break;
            case 9:
                VersionedCashGreen versionedCashGreen5 = (VersionedCashGreen) obj;
                versionedCashGreen5.getClass();
                break;
            case 10:
                VersionedCashGreen versionedCashGreen6 = (VersionedCashGreen) obj;
                versionedCashGreen6.getClass();
                break;
            case 11:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                break;
            case 12:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                break;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver2);
                break;
            case 14:
                Merchant merchant = (Merchant) obj;
                merchant.getClass();
                MerchantLinkingStatus merchantLinkingStatus = MerchantLinkingStatus.NOT_LINKED;
                break;
            case 15:
                Merchant merchant2 = (Merchant) obj;
                merchant2.getClass();
                MerchantLinkingStatus merchantLinkingStatus2 = MerchantLinkingStatus.NOT_LINKED;
                break;
            case 16:
                Merchant merchant3 = (Merchant) obj;
                merchant3.getClass();
                break;
            case 17:
                BitcoinAppletTileModel bitcoinAppletTileModel = (BitcoinAppletTileModel) obj;
                bitcoinAppletTileModel.getClass();
                if (!(bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Installed)) {
                    if (!(bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Loading)) {
                        if (!(bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Uninstalled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
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
            case 18:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                break;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 20:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 21:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 22:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 23:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 24:
                View view = (View) obj;
                view.getClass();
                break;
            case 25:
                View view2 = (View) obj;
                view2.getClass();
                break;
            case 26:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl4.getClass();
                break;
            case 27:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl5.getClass();
                break;
            case 28:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            default:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
