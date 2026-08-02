package com.squareup.cash.money.analytics;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.money.BalanceObfuscationState;
import com.squareup.cash.cdf.money.MoneyBrowseSelectItem;
import com.squareup.cash.cdf.money.MoneyItemId;
import com.squareup.cash.cdf.money.MoneyItemPromotionState;
import com.squareup.cash.cdf.money.MoneySectionId;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.money.MoneyTapElement;
import com.squareup.cash.cdf.money.MoneyViewLoad;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsServiceKt;
import com.squareup.cash.money.core.ids.ElementId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class RealMoneyAnalyticsService implements MoneyAnalyticsService {
    public static final Set EXPECTED_MISSING_DEPOSIT_IDS = ArraysKt___ArraysKt.toSet(new String[]{"GOVERNMENT_ESCHEATMENTS", "INSTANT_PAY"});
    public final Analytics analytics;
    public final RealMoneyAnalyticsContext analyticsContext;
    public final RealBalancePrivacy balancePrivacy;
    public final JsonAdapter sectionJsonAdapter;
    public final LinkedHashSet viewItemsSet = new LinkedHashSet();
    public String flowToken = re$$ExternalSyntheticOutline0.m();
    public final LinkedHashSet viewLoadTokens = new LinkedHashSet();
    public final int version = 5;

    public RealMoneyAnalyticsService(RealMoneyAnalyticsContext realMoneyAnalyticsContext, Analytics analytics, RealUuidGenerator realUuidGenerator, Moshi moshi, RealBalancePrivacy realBalancePrivacy) {
        this.analyticsContext = realMoneyAnalyticsContext;
        this.analytics = analytics;
        this.balancePrivacy = realBalancePrivacy;
        this.sectionJsonAdapter = moshi.adapter(RealMoneyAnalyticsServiceKt.SECTION_JSON_TYPE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c1, code lost:
    
        if (r2.equals("BANK_AND_WIRE_TRANSFER_V2") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ec, code lost:
    
        r2 = com.squareup.cash.cdf.money.MoneyTapElement.BANK_TRANSFERS_ROW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ca, code lost:
    
        if (r2.equals("CHECK_DEPOSIT") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01fa, code lost:
    
        r2 = com.squareup.cash.cdf.money.MoneyTapElement.CHECK_DEPOSITS_ROW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e0, code lost:
    
        if (r2.equals("BANK_AND_WIRE_TRANSFER") != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e9, code lost:
    
        if (r2.equals("BANK_TRANSFERS_NO_WIRES_ACCESS") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f6, code lost:
    
        if (r2.equals("CHECK_DEPOSITS_ROW") == false) goto L83;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void submitSelectItemEvent(ItemId itemId, ElementId elementId, MoneySelectAction moneySelectAction) {
        MoneyAnalyticsContext$Item moneyAnalyticsContext$Item;
        BalanceObfuscationState balanceObfuscationState;
        MoneyTapElement moneyTapElement;
        MoneyTapElement moneyTapElement2;
        itemId.getClass();
        RealMoneyAnalyticsContext realMoneyAnalyticsContext = this.analyticsContext;
        synchronized (realMoneyAnalyticsContext) {
            MoneyAnalyticsItem moneyAnalyticsItem = (MoneyAnalyticsItem) realMoneyAnalyticsContext.itemsByIds.get(itemId);
            if (moneyAnalyticsItem != null) {
                int intValue = ((Number) realMoneyAnalyticsContext.sectionItemOffsets.get(moneyAnalyticsItem.sectionIndex)).intValue();
                int i = moneyAnalyticsItem.index;
                SectionId sectionId = (SectionId) realMoneyAnalyticsContext.sectionIds.get(moneyAnalyticsItem.sectionIndex);
                int i2 = moneyAnalyticsItem.sectionIndex;
                moneyAnalyticsContext$Item = new MoneyAnalyticsContext$Item(itemId, intValue + i, i, sectionId, i2, ((Number) realMoneyAnalyticsContext.sectionTotals.get(i2)).intValue(), moneyAnalyticsItem.isPromoted);
            } else {
                moneyAnalyticsContext$Item = null;
            }
        }
        if (moneyAnalyticsContext$Item != null) {
            Util.ParameterizedTypeImpl parameterizedTypeImpl = RealMoneyAnalyticsServiceKt.SECTION_JSON_TYPE;
            MoneySectionId cDFSectionId = RealMoneyAnalyticsServiceKt.toCDFSectionId(moneyAnalyticsContext$Item.sectionId);
            MoneyItemId cDFItemId = RealMoneyAnalyticsServiceKt.toCDFItemId(moneyAnalyticsContext$Item.id);
            int ordinal = cDFSectionId.ordinal();
            if (ordinal == 2 ? cDFItemId == MoneyItemId.BANKING_BENEFITS_APPLET : ordinal != 4) {
                balanceObfuscationState = null;
            } else {
                balanceObfuscationState = ((Boolean) ((Function0) Countries.observeState(this.balancePrivacy.obfuscationEnabled).getValue).invoke()).booleanValue() ? BalanceObfuscationState.OBFUSCATED : BalanceObfuscationState.VISIBLE;
            }
            Analytics analytics = this.analytics;
            String str = this.flowToken;
            MoneySectionId cDFSectionId2 = RealMoneyAnalyticsServiceKt.toCDFSectionId(moneyAnalyticsContext$Item.sectionId);
            int i3 = moneyAnalyticsContext$Item.sectionIndex;
            int i4 = moneyAnalyticsContext$Item.sectionTotal;
            MoneyItemId cDFItemId2 = RealMoneyAnalyticsServiceKt.toCDFItemId(moneyAnalyticsContext$Item.id);
            int i5 = moneyAnalyticsContext$Item.itemIndex;
            int i6 = moneyAnalyticsContext$Item.absoluteItemIndex;
            int i7 = this.version;
            int i8 = elementId == null ? -1 : RealMoneyAnalyticsServiceKt.WhenMappings.$EnumSwitchMapping$2[elementId.ordinal()];
            if (i8 == -1) {
                moneyTapElement = null;
            } else if (i8 == 1) {
                moneyTapElement = MoneyTapElement.BALANCE_ADD_CASH;
            } else if (i8 == 2) {
                moneyTapElement = MoneyTapElement.BALANCE_CASH_OUT;
            } else {
                if (i8 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                moneyTapElement = MoneyTapElement.BALANCE_OBFUSCATION_BUTTON;
            }
            if (moneyTapElement == null) {
                if (itemId instanceof ItemId.ALLOWANCE) {
                    moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_ALLOWANCE_APPLET;
                } else if (itemId instanceof ItemId.AFTERPAY) {
                    moneyTapElement2 = MoneyTapElement.AFTERPAY_APPLET;
                } else if (itemId instanceof ItemId.APPROVED_CONTACTS) {
                    moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_APPROVED_CONTACTS_APPLET;
                } else if (itemId instanceof ItemId.BALANCE) {
                    moneyTapElement2 = MoneyTapElement.BALANCE_TILE;
                } else if (itemId instanceof ItemId.BANKING_BENEFITS) {
                    moneyTapElement2 = MoneyTapElement.MAIN;
                } else if (itemId instanceof ItemId.BITCOIN) {
                    moneyTapElement2 = MoneyTapElement.BITCOIN_APPLET;
                } else if (itemId instanceof ItemId.BORROW) {
                    moneyTapElement2 = MoneyTapElement.BORROW_APPLET;
                } else if (itemId instanceof ItemId.SCORE) {
                    moneyTapElement2 = MoneyTapElement.SCORE_APPLET;
                } else if (itemId instanceof ItemId.CARD) {
                    moneyTapElement2 = MoneyTapElement.CARD_APPLET;
                } else if (itemId instanceof ItemId.LITE_UNINSTALLED_CARD) {
                    moneyTapElement2 = MoneyTapElement.LITE_UNINSTALLED_CARD_APPLET;
                } else if (itemId instanceof ItemId.DISCLOSURE) {
                    moneyTapElement2 = MoneyTapElement.DISCLOSURES;
                } else if (itemId instanceof ItemId.FAMILY) {
                    moneyTapElement2 = MoneyTapElement.FAMILY_APPLET;
                } else {
                    if (!(itemId instanceof ItemId.AGENTS)) {
                        if (itemId instanceof ItemId.PAYCHECKS) {
                            moneyTapElement2 = MoneyTapElement.PAYCHECKS_APPLET;
                        } else if (itemId instanceof ItemId.SPENDING) {
                            moneyTapElement2 = MoneyTapElement.SPENDING_APPLET;
                        } else if (itemId instanceof ItemId.SAVINGS) {
                            moneyTapElement2 = MoneyTapElement.SAVINGS_APPLET;
                        } else if (itemId instanceof ItemId.STOCKS) {
                            moneyTapElement2 = MoneyTapElement.STOCKS_APPLET;
                        } else if (itemId instanceof ItemId.TAXES) {
                            moneyTapElement2 = MoneyTapElement.TAXES_APPLET;
                        } else if (itemId instanceof ItemId.KYB_BANNER) {
                            moneyTapElement2 = MoneyTapElement.KYB_BANNER_BUTTON;
                        } else if (itemId instanceof ItemId.EARNINGS) {
                            moneyTapElement2 = MoneyTapElement.EARNINGS_TRACKER_APPLET;
                        } else if (itemId instanceof ItemId.POOLS) {
                            moneyTapElement2 = MoneyTapElement.POOLS_APPLET;
                        } else if (itemId instanceof ItemId.PROMOTED_BANKING_BENEFITS) {
                            moneyTapElement2 = MoneyTapElement.MAIN;
                        } else if (itemId instanceof ItemId.PROMOTED_CARD) {
                            moneyTapElement2 = MoneyTapElement.MAIN;
                        } else if (itemId instanceof ItemId.PROMOTED_TAXES) {
                            moneyTapElement2 = MoneyTapElement.MAIN;
                        } else if (itemId instanceof ItemId.PROMOTED_PHONE_PLANS) {
                            moneyTapElement2 = MoneyTapElement.MAIN;
                        } else if (itemId instanceof ItemId.DEPOSIT) {
                            String str2 = ((ItemId.DEPOSIT) itemId).value;
                            switch (str2.hashCode()) {
                                case -1108410873:
                                    break;
                                case -1091836071:
                                    break;
                                case -696890726:
                                    break;
                                case 423508732:
                                    if (str2.equals("RECURRING_DEPOSIT")) {
                                        moneyTapElement2 = MoneyTapElement.RECURRING_DEPOSITS_ROW;
                                        break;
                                    }
                                    break;
                                case 724356647:
                                    break;
                                case 800384609:
                                    break;
                                case 1174869542:
                                    if (str2.equals("PAPER_CASH")) {
                                        moneyTapElement2 = MoneyTapElement.PAPER_MONEY_ROW;
                                        break;
                                    }
                                    break;
                                case 1926687631:
                                    if (str2.equals("PAYROLL_LOGIN")) {
                                        moneyTapElement2 = MoneyTapElement.DIRECT_DEPOSIT_ROW;
                                        break;
                                    }
                                    break;
                            }
                        } else if (itemId instanceof ItemId.MONEYBOT) {
                            moneyTapElement2 = MoneyTapElement.MONEYBOT_APPLET;
                        } else if (!(itemId instanceof ItemId.WORK) && !(itemId instanceof ItemId.KIDS_ACTIVITY)) {
                            if (itemId instanceof ItemId.MANAGED_ACCOUNT_SETTING_ITEM) {
                                String str3 = ((ItemId.MANAGED_ACCOUNT_SETTING_ITEM) itemId).value;
                                switch (str3.hashCode()) {
                                    case -2033086586:
                                        if (str3.equals("MANAGED_ACCOUNT_ALLOWANCE")) {
                                            moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_EXISTINGALLOWANCE_ROW;
                                            break;
                                        }
                                        break;
                                    case -535375145:
                                        if (str3.equals("MANAGED_ACCOUNT_CONTROLS_AND_LIMITS")) {
                                            moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_CONTROLSANDLIMITS_ROW;
                                            break;
                                        }
                                        break;
                                    case 720472215:
                                        if (str3.equals("MANAGED_ACCOUNT_PROFILE")) {
                                            moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_PROFILE_ROW;
                                            break;
                                        }
                                        break;
                                    case 1008735050:
                                        if (str3.equals("MANAGED_ACCOUNT_LIMITS")) {
                                            moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_LIMITS_ROW;
                                            break;
                                        }
                                        break;
                                }
                            } else if (itemId instanceof ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM) {
                                String str4 = ((ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM) itemId).value;
                                int hashCode = str4.hashCode();
                                if (hashCode != -961306271) {
                                    if (hashCode != 125567777) {
                                        if (hashCode == 532122788 && str4.equals("MANAGED_ACCOUNT_SUPPORT_CLOSE_ACCOUNT")) {
                                            moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_SUPPORT_CLOSE_ACCOUNT_ROW;
                                        }
                                    } else if (str4.equals("MANAGED_ACCOUNT_SUPPORT_DISPUTE_TRANSACTION")) {
                                        moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_SUPPORT_DISPUTE_ROW;
                                    }
                                } else if (str4.equals("MANAGED_ACCOUNT_SUPPORT_ISSUE_WITH_CARD")) {
                                    moneyTapElement2 = MoneyTapElement.MANAGEDACCOUNT_SUPPORT_CASH_CARD_ISSUES_ROW;
                                }
                            } else if (!(itemId instanceof ItemId.EARNER)) {
                                if (itemId instanceof ItemId.PHONE_PLANS) {
                                    moneyTapElement2 = MoneyTapElement.PHONE_PLANS_APPLET;
                                } else if (!(itemId instanceof ItemId.KYC) && !(itemId instanceof ItemId.LITE_ACTIVITY)) {
                                    if (itemId instanceof ItemId.FINISH_SETUP) {
                                        moneyTapElement2 = MoneyTapElement.FINISH_SETUP;
                                    } else {
                                        if (!(itemId instanceof ItemId.LITE_UNINSTALLED_BALANCE)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                        moneyTapElement2 = MoneyTapElement.LITE_UNINSTALLED_BALANCE_APPLET;
                                    }
                                }
                            }
                        }
                    }
                    moneyTapElement = null;
                }
                moneyTapElement = moneyTapElement2;
            }
            analytics.track(new MoneyBrowseSelectItem(str, cDFSectionId2, Integer.valueOf(i3), Integer.valueOf(i4), cDFItemId2, Integer.valueOf(i5), Integer.valueOf(i6), moneyTapElement, Integer.valueOf(i7), moneySelectAction, balanceObfuscationState, moneyAnalyticsContext$Item.isPromoted ? MoneyItemPromotionState.PROMOTED : MoneyItemPromotionState.DEFAULT), null);
        }
    }

    public final void submitViewLoadEvent(MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source, long j, Boolean bool) {
        String str = this.flowToken;
        LinkedHashSet linkedHashSet = this.viewLoadTokens;
        if (linkedHashSet.contains(str)) {
            return;
        }
        this.analytics.track(new MoneyViewLoad(this.flowToken, Long.valueOf(j), Integer.valueOf(this.version), bool, moneyAnalyticsService$Companion$Source != null ? RealMoneyAnalyticsServiceKt.access$toCdfSource(moneyAnalyticsService$Companion$Source) : null), null);
        linkedHashSet.add(this.flowToken);
    }
}
