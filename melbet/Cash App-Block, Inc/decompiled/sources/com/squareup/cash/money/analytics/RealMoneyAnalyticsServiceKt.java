package com.squareup.cash.money.analytics;

import com.squareup.cash.cdf.money.MoneyItemId;
import com.squareup.cash.cdf.money.MoneySectionId;
import com.squareup.cash.cdf.money.MoneyViewSource;
import com.squareup.cash.money.core.ids.ElementId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class RealMoneyAnalyticsServiceKt {
    public static final Util.ParameterizedTypeImpl SECTION_JSON_TYPE = Types.newParameterizedType(Map.class, String.class, Types.newParameterizedType(List.class, Types.newParameterizedType(Map.class, String.class, Types.newParameterizedType(List.class, String.class))));

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MoneyAnalyticsService$Companion$Source.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source = MoneyAnalyticsService$Companion$Source.TAB_BAR_BUTTON;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source2 = MoneyAnalyticsService$Companion$Source.TAB_BAR_BUTTON;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source3 = MoneyAnalyticsService$Companion$Source.TAB_BAR_BUTTON;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SectionId.values().length];
            try {
                iArr2[6] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SectionId sectionId = SectionId.BANNERS;
                iArr2[7] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SectionId sectionId2 = SectionId.BANNERS;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                SectionId sectionId3 = SectionId.BANNERS;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                SectionId sectionId4 = SectionId.BANNERS;
                iArr2[1] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                SectionId sectionId5 = SectionId.BANNERS;
                iArr2[2] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                SectionId sectionId6 = SectionId.BANNERS;
                iArr2[5] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                SectionId sectionId7 = SectionId.BANNERS;
                iArr2[9] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                SectionId sectionId8 = SectionId.BANNERS;
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                SectionId sectionId9 = SectionId.BANNERS;
                iArr2[10] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                SectionId sectionId10 = SectionId.BANNERS;
                iArr2[14] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                SectionId sectionId11 = SectionId.BANNERS;
                iArr2[11] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                SectionId sectionId12 = SectionId.BANNERS;
                iArr2[0] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                SectionId sectionId13 = SectionId.BANNERS;
                iArr2[12] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                SectionId sectionId14 = SectionId.BANNERS;
                iArr2[13] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr3 = new int[ElementId.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                ElementId elementId = ElementId.BALANCE_ADD_CASH;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                ElementId elementId2 = ElementId.BALANCE_ADD_CASH;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[MoneySectionId.values().length];
            try {
                iArr4[2] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                MoneySectionId moneySectionId = MoneySectionId.APPLET_BANKING;
                iArr4[4] = 2;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public static final MoneyViewSource access$toCdfSource(MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source) {
        int ordinal = moneyAnalyticsService$Companion$Source.ordinal();
        if (ordinal == 0) {
            return MoneyViewSource.TAB_BAR_BUTTON;
        }
        if (ordinal == 1) {
            return MoneyViewSource.CLIENT_ROUTE;
        }
        if (ordinal == 2) {
            return MoneyViewSource.APP_LAUNCH;
        }
        if (ordinal == 3) {
            return MoneyViewSource.BACK_NAVIGATION;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e2, code lost:
    
        if (r3.equals("BANK_AND_WIRE_TRANSFER_V2") == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0112, code lost:
    
        return com.squareup.cash.cdf.money.MoneyItemId.BANK_TRANSFERS_ROW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00ec, code lost:
    
        if (r3.equals("CHECK_DEPOSIT") == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x011f, code lost:
    
        return com.squareup.cash.cdf.money.MoneyItemId.CHECK_DEPOSITS_ROW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0103, code lost:
    
        if (r3.equals("BANK_AND_WIRE_TRANSFER") != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x010c, code lost:
    
        if (r3.equals("BANK_TRANSFERS_NO_WIRES_ACCESS") == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0119, code lost:
    
        if (r3.equals("CHECK_DEPOSITS_ROW") == false) goto L196;
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
    public static final MoneyItemId toCDFItemId(ItemId itemId) {
        itemId.getClass();
        if (itemId instanceof ItemId.AFTERPAY) {
            return MoneyItemId.AFTERPAY_APPLET;
        }
        if (itemId instanceof ItemId.ALLOWANCE) {
            return MoneyItemId.MANAGEDACCOUNT_ALLOWANCE_APPLET;
        }
        if (itemId instanceof ItemId.APPROVED_CONTACTS) {
            return MoneyItemId.MANAGEDACCOUNT_APPROVED_CONTACTS_APPLET;
        }
        if (itemId instanceof ItemId.BALANCE) {
            return MoneyItemId.BALANCE;
        }
        if (itemId instanceof ItemId.BANKING_BENEFITS) {
            return MoneyItemId.BANKING_BENEFITS_APPLET;
        }
        if (itemId instanceof ItemId.BITCOIN) {
            return MoneyItemId.BITCOIN_APPLET;
        }
        if (itemId instanceof ItemId.BORROW) {
            return MoneyItemId.BORROW_APPLET;
        }
        if (itemId instanceof ItemId.SCORE) {
            return MoneyItemId.SCORE_APPLET;
        }
        if (itemId instanceof ItemId.CARD) {
            return MoneyItemId.CARD_APPLET;
        }
        if (itemId instanceof ItemId.LITE_UNINSTALLED_CARD) {
            return MoneyItemId.LITE_UNINSTALLED_CARD_APPLET;
        }
        if (itemId instanceof ItemId.DISCLOSURE) {
            return MoneyItemId.DISCLOSURES;
        }
        if (itemId instanceof ItemId.FAMILY) {
            return MoneyItemId.FAMILY_APPLET;
        }
        if (itemId instanceof ItemId.AGENTS) {
            return null;
        }
        if (itemId instanceof ItemId.PAYCHECKS) {
            return MoneyItemId.PAYCHECKS_APPLET;
        }
        if (itemId instanceof ItemId.SPENDING) {
            return MoneyItemId.SPENDING_APPLET;
        }
        if (itemId instanceof ItemId.SAVINGS) {
            return MoneyItemId.SAVINGS_APPLET;
        }
        if (itemId instanceof ItemId.STOCKS) {
            return MoneyItemId.STOCKS_APPLET;
        }
        if (itemId instanceof ItemId.TAXES) {
            return MoneyItemId.TAXES_APPLET;
        }
        if (itemId instanceof ItemId.KYB_BANNER) {
            return MoneyItemId.KYB_BANNER;
        }
        if (itemId instanceof ItemId.EARNINGS) {
            return MoneyItemId.EARNINGS_TRACKER_APPLET;
        }
        if (itemId instanceof ItemId.POOLS) {
            return MoneyItemId.POOLS_APPLET;
        }
        if (itemId instanceof ItemId.PROMOTED_BANKING_BENEFITS) {
            return MoneyItemId.BANKING_BENEFITS_APPLET_PROMOTED;
        }
        if (itemId instanceof ItemId.PROMOTED_CARD) {
            return MoneyItemId.CARD_APPLET_PROMOTED;
        }
        if (itemId instanceof ItemId.PROMOTED_TAXES) {
            return MoneyItemId.TAXES_APPLET_PROMOTED;
        }
        if (itemId instanceof ItemId.PROMOTED_PHONE_PLANS) {
            return MoneyItemId.PHONE_PLANS_APPLET_PROMOTED;
        }
        if (itemId instanceof ItemId.DEPOSIT) {
            String str = ((ItemId.DEPOSIT) itemId).value;
            switch (str.hashCode()) {
                case -1108410873:
                    break;
                case -1091836071:
                    break;
                case -696890726:
                    break;
                case 423508732:
                    if (str.equals("RECURRING_DEPOSIT")) {
                        return MoneyItemId.RECURRING_DEPOSITS_ROW;
                    }
                    break;
                case 724356647:
                    break;
                case 800384609:
                    break;
                case 1174869542:
                    if (str.equals("PAPER_CASH")) {
                        return MoneyItemId.PAPER_MONEY_ROW;
                    }
                    break;
                case 1926687631:
                    if (str.equals("PAYROLL_LOGIN")) {
                        return MoneyItemId.DIRECT_DEPOSIT_ROW;
                    }
                    break;
            }
        } else {
            if (itemId instanceof ItemId.MONEYBOT) {
                return MoneyItemId.MONEYBOT_APPLET;
            }
            if ((itemId instanceof ItemId.WORK) || (itemId instanceof ItemId.KIDS_ACTIVITY)) {
                return null;
            }
            if (itemId instanceof ItemId.MANAGED_ACCOUNT_SETTING_ITEM) {
                String str2 = ((ItemId.MANAGED_ACCOUNT_SETTING_ITEM) itemId).value;
                switch (str2.hashCode()) {
                    case -2033086586:
                        if (str2.equals("MANAGED_ACCOUNT_ALLOWANCE")) {
                            return MoneyItemId.MANAGEDACCOUNT_EXISTINGALLOWANCE_ROW;
                        }
                        break;
                    case -535375145:
                        if (str2.equals("MANAGED_ACCOUNT_CONTROLS_AND_LIMITS")) {
                            return MoneyItemId.MANAGEDACCOUNT_CONTROLSANDLIMITS_ROW;
                        }
                        break;
                    case 720472215:
                        if (str2.equals("MANAGED_ACCOUNT_PROFILE")) {
                            return MoneyItemId.MANAGEDACCOUNT_PROFILE_ROW;
                        }
                        break;
                    case 1008735050:
                        if (str2.equals("MANAGED_ACCOUNT_LIMITS")) {
                            return MoneyItemId.MANAGEDACCOUNT_LIMITS_ROW;
                        }
                        break;
                }
            } else {
                if (!(itemId instanceof ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM)) {
                    if (itemId instanceof ItemId.EARNER) {
                        return null;
                    }
                    if (itemId instanceof ItemId.PHONE_PLANS) {
                        return MoneyItemId.PHONE_PLANS_APPLET;
                    }
                    if ((itemId instanceof ItemId.KYC) || (itemId instanceof ItemId.LITE_ACTIVITY)) {
                        return null;
                    }
                    if (itemId instanceof ItemId.FINISH_SETUP) {
                        return MoneyItemId.FINISH_SETUP;
                    }
                    if (itemId instanceof ItemId.LITE_UNINSTALLED_BALANCE) {
                        return MoneyItemId.LITE_UNINSTALLED_BALANCE_APPLET;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str3 = ((ItemId.MANAGED_ACCOUNT_SUPPORT_ITEM) itemId).value;
                int hashCode = str3.hashCode();
                if (hashCode != -961306271) {
                    if (hashCode != 125567777) {
                        if (hashCode == 532122788 && str3.equals("MANAGED_ACCOUNT_SUPPORT_CLOSE_ACCOUNT")) {
                            return MoneyItemId.MANAGEDACCOUNT_SUPPORT_CLOSE_ACCOUNT_ROW;
                        }
                    } else if (str3.equals("MANAGED_ACCOUNT_SUPPORT_DISPUTE_TRANSACTION")) {
                        return MoneyItemId.MANAGEDACCOUNT_SUPPORT_DISPUTE_ROW;
                    }
                } else if (str3.equals("MANAGED_ACCOUNT_SUPPORT_ISSUE_WITH_CARD")) {
                    return MoneyItemId.MANAGEDACCOUNT_SUPPORT_CASH_CARD_ISSUES_ROW;
                }
            }
        }
        return null;
    }

    public static final MoneySectionId toCDFSectionId(SectionId sectionId) {
        switch (sectionId.ordinal()) {
            case 0:
                return MoneySectionId.BANNERS;
            case 1:
            case 3:
            case 4:
                return MoneySectionId.APPLET_BANKING;
            case 2:
            case 5:
                return MoneySectionId.APPLET_BANKING_UNINSTALLED;
            case 6:
                return MoneySectionId.APPLET_BALANCE;
            case 7:
                return MoneySectionId.APPLET_TOOLS;
            case 8:
            case 9:
                return MoneySectionId.APPLET_UNINSTALLED;
            case 10:
                return MoneySectionId.MORE_WAYS_TO_ADD_MONEY;
            case 11:
                return MoneySectionId.AUTO_DEPOSITS;
            case 12:
                return MoneySectionId.MANAGEDACCOUNT_SETTINGS;
            case 13:
                return MoneySectionId.MANAGEDACCOUNT_SUPPORT;
            case 14:
                return MoneySectionId.DISCLOSURES;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
