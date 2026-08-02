package bo.app;

import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PausedCompositionImpl;
import app.cash.broadway.ui.compose.SecureScreenNode;
import com.braze.push.BrazeNotificationUtils;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionItemViewModel;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionViewModel;
import com.squareup.cash.banking.sections.NavigationAction;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.scannerview.ScannerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ b$$ExternalSyntheticLambda0(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fa, code lost:
    
        if (r7 == null) goto L69;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        MutableSharedFlow stylusHandwritingTrigger;
        String routeUserWithNotificationOpenedIntent$lambda$4;
        List<BankingTab.BankingTabSection> list;
        MoreWaysToAddMoneySectionViewModel moreWaysToAddMoneySectionViewModel;
        String str;
        Icons icons;
        String str2;
        NavigationAction showUrl;
        MoreWaysToAddMoneySectionItemViewModel moreWaysToAddMoneySectionItemViewModel;
        int i = this.$r8$classId;
        boolean z = true;
        boolean z2 = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = (AndroidLegacyPlatformTextInputServiceAdapter) obj;
                if (z2 && (stylusHandwritingTrigger = androidLegacyPlatformTextInputServiceAdapter.getStylusHandwritingTrigger()) != null) {
                    ((SharedFlowImpl) stylusHandwritingTrigger).tryEmit(Unit.INSTANCE);
                }
                break;
            case 2:
                PullRefreshState pullRefreshState = (PullRefreshState) obj;
                if (!z2 && pullRefreshState._position$delegate.getFloatValue() <= 0.5f) {
                    z = false;
                }
                break;
            case 3:
                SecureScreenNode secureScreenNode = (SecureScreenNode) obj;
                if (secureScreenNode.isEnabled != z2) {
                    secureScreenNode.isEnabled = z2;
                    Function0 function0 = secureScreenNode.enabledChangedCallback;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                break;
            case 4:
                break;
            case 5:
                routeUserWithNotificationOpenedIntent$lambda$4 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$4((String) obj, z2);
                break;
            case 6:
                BankingTab bankingTab = (BankingTab) ((MutableState) obj).getValue();
                if (bankingTab != null && (list = bankingTab.banking_tab_sections) != null) {
                    for (BankingTab.BankingTabSection bankingTabSection : list) {
                        List<BankingTab.Options> list2 = bankingTabSection.banking_options;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            BankingTab.BankingOption bankingOption = ((BankingTab.Options) it.next()).banking_option;
                            if (bankingOption != null) {
                                arrayList.add(bankingOption);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            moreWaysToAddMoneySectionViewModel = null;
                        } else {
                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                BankingTab.BankingOption bankingOption2 = (BankingTab.BankingOption) it2.next();
                                bankingOption2.getClass();
                                String str3 = bankingOption2.id;
                                if (str3 == null || (str = bankingOption2.main_text) == null) {
                                    moreWaysToAddMoneySectionItemViewModel = null;
                                } else {
                                    switch (str3.hashCode()) {
                                        case -1656235842:
                                            if (str3.equals("DEPOSIT_USDC")) {
                                                Icon icon = bankingOption2.icon;
                                                if (icon != null && (str2 = icon.arcade_id) != null) {
                                                    Icons.Companion.getClass();
                                                    icons = zzd.get(str2);
                                                    break;
                                                }
                                                icons = Icons.Qr24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        case 67456266:
                                            if (str3.equals("INSTANT_PAY")) {
                                                icons = Icons.Instant24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        case 423508732:
                                            if (str3.equals("RECURRING_DEPOSIT")) {
                                                icons = Icons.RecurringAutomatic24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        case 724356647:
                                            if (str3.equals("CHECK_DEPOSIT")) {
                                                icons = Icons.DepositCheck24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        case 800384609:
                                            if (str3.equals("BANK_AND_WIRE_TRANSFER_V2")) {
                                                icons = Icons.TransferWire24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        case 1174869542:
                                            if (str3.equals("PAPER_CASH")) {
                                                icons = Icons.DepositPaper24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        case 1926687631:
                                            if (str3.equals("PAYROLL_LOGIN")) {
                                                icons = Icons.Deposit24;
                                                break;
                                            }
                                            icons = null;
                                            break;
                                        default:
                                            icons = null;
                                            break;
                                    }
                                    BankingTab.BankingOption.NavigationAction_ navigationAction_ = bankingOption2.NavigationAction;
                                    if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientRouteAction) {
                                        showUrl = new NavigationAction.ShowUrl(((BankingTab.BankingOption.NavigationAction_.ClientRouteAction) navigationAction_).getValue().url, str3);
                                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) {
                                        ClientScenario clientScenario = ((BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) navigationAction_).getValue().client_scenario;
                                        showUrl = clientScenario != null ? new NavigationAction.ShowUrl("https://internal.cash.app/dl/scenario/" + clientScenario, str3) : new NavigationAction.ShowUrl(null, str3);
                                    } else if (navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.Dialog) {
                                        showUrl = new NavigationAction.ShowDialog(((BankingTab.BankingOption.NavigationAction_.Dialog) navigationAction_).getValue(), str3);
                                    } else if (navigationAction_ != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        showUrl = new NavigationAction.ShowUrl(null, str3);
                                    }
                                    moreWaysToAddMoneySectionItemViewModel = new MoreWaysToAddMoneySectionItemViewModel(str3, str, icons, showUrl);
                                }
                                if (moreWaysToAddMoneySectionItemViewModel != null) {
                                    arrayList2.add(moreWaysToAddMoneySectionItemViewModel);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                MoreWaysToAddMoneySectionItemViewModel moreWaysToAddMoneySectionItemViewModel2 = (MoreWaysToAddMoneySectionItemViewModel) it3.next();
                                if (z2 || !Intrinsics.areEqual(moreWaysToAddMoneySectionItemViewModel2.id, "DEPOSIT_USDC")) {
                                    createListBuilder.add(moreWaysToAddMoneySectionItemViewModel2);
                                }
                            }
                            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                            BankingTab.BankingTabSection.HeaderBlock headerBlock = bankingTabSection.header_block;
                            moreWaysToAddMoneySectionViewModel = new MoreWaysToAddMoneySectionViewModel(headerBlock != null ? headerBlock.heading : null, build);
                        }
                        if (moreWaysToAddMoneySectionViewModel != null) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 7:
                ((PausedCompositionImpl) obj).animate(z2);
                break;
            default:
                ((ScannerView) obj).textSetter.setText(null, z2, true);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b$$ExternalSyntheticLambda0(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
    }
}
