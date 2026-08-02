package com.squareup.cash.money.core.ids;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ItemId {

    /* loaded from: classes5.dex */
    public final class AFTERPAY implements ItemId {
        public static final AFTERPAY INSTANCE = new AFTERPAY();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AFTERPAY);
        }

        public final int hashCode() {
            return 1299226599;
        }

        public final String toString() {
            return "AFTERPAY";
        }
    }

    public final class AGENTS implements ItemId {
        public static final AGENTS INSTANCE = new AGENTS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AGENTS);
        }

        public final int hashCode() {
            return -87548055;
        }

        public final String toString() {
            return "AGENTS";
        }
    }

    public final class ALLOWANCE implements ItemId {
        public static final ALLOWANCE INSTANCE = new ALLOWANCE();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ALLOWANCE);
        }

        public final int hashCode() {
            return 973658301;
        }

        public final String toString() {
            return "ALLOWANCE";
        }
    }

    public final class APPROVED_CONTACTS implements ItemId {
        public static final APPROVED_CONTACTS INSTANCE = new APPROVED_CONTACTS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof APPROVED_CONTACTS);
        }

        public final int hashCode() {
            return 2063951008;
        }

        public final String toString() {
            return "APPROVED_CONTACTS";
        }
    }

    public final class BALANCE implements ItemId {
        public static final BALANCE INSTANCE = new BALANCE();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BALANCE);
        }

        public final int hashCode() {
            return -1992189759;
        }

        public final String toString() {
            return "BALANCE";
        }
    }

    public final class BANKING_BENEFITS implements ItemId {
        public static final BANKING_BENEFITS INSTANCE = new BANKING_BENEFITS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BANKING_BENEFITS);
        }

        public final int hashCode() {
            return -340272528;
        }

        public final String toString() {
            return "BANKING_BENEFITS";
        }
    }

    public final class BITCOIN implements ItemId {
        public static final BITCOIN INSTANCE = new BITCOIN();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BITCOIN);
        }

        public final int hashCode() {
            return -1755707645;
        }

        public final String toString() {
            return "BITCOIN";
        }
    }

    public final class BORROW implements ItemId {
        public static final BORROW INSTANCE = new BORROW();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BORROW);
        }

        public final int hashCode() {
            return -51139760;
        }

        public final String toString() {
            return "BORROW";
        }
    }

    public final class CARD implements ItemId {
        public static final CARD INSTANCE = new CARD();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CARD);
        }

        public final int hashCode() {
            return 951917355;
        }

        public final String toString() {
            return "CARD";
        }
    }

    public final class DEPOSIT implements ItemId {
        public final String value;

        public DEPOSIT(String str) {
            str.getClass();
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DEPOSIT) && Intrinsics.areEqual(this.value, ((DEPOSIT) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DEPOSIT(value=", this.value, ")");
        }
    }

    public final class DISCLOSURE implements ItemId {
        public static final DISCLOSURE INSTANCE = new DISCLOSURE();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DISCLOSURE);
        }

        public final int hashCode() {
            return 1904295368;
        }

        public final String toString() {
            return "DISCLOSURE";
        }
    }

    public final class EARNER implements ItemId {
        public static final EARNER INSTANCE = new EARNER();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EARNER);
        }

        public final int hashCode() {
            return 21814240;
        }

        public final String toString() {
            return "EARNER";
        }
    }

    public final class EARNINGS implements ItemId {
        public static final EARNINGS INSTANCE = new EARNINGS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EARNINGS);
        }

        public final int hashCode() {
            return -511234236;
        }

        public final String toString() {
            return "EARNINGS";
        }
    }

    public final class FAMILY implements ItemId {
        public static final FAMILY INSTANCE = new FAMILY();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FAMILY);
        }

        public final int hashCode() {
            return 50289855;
        }

        public final String toString() {
            return "FAMILY";
        }
    }

    public final class FINISH_SETUP implements ItemId {
        public static final FINISH_SETUP INSTANCE = new FINISH_SETUP();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FINISH_SETUP);
        }

        public final int hashCode() {
            return 1391233228;
        }

        public final String toString() {
            return "FINISH_SETUP";
        }
    }

    public final class KIDS_ACTIVITY implements ItemId {
        public static final KIDS_ACTIVITY INSTANCE = new KIDS_ACTIVITY();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KIDS_ACTIVITY);
        }

        public final int hashCode() {
            return -1041263898;
        }

        public final String toString() {
            return "KIDS_ACTIVITY";
        }
    }

    public final class KYB_BANNER implements ItemId {
        public static final KYB_BANNER INSTANCE = new KYB_BANNER();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KYB_BANNER);
        }

        public final int hashCode() {
            return 892118290;
        }

        public final String toString() {
            return "KYB_BANNER";
        }
    }

    public final class KYC implements ItemId {
        public static final KYC INSTANCE = new KYC();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KYC);
        }

        public final int hashCode() {
            return -246379238;
        }

        public final String toString() {
            return "KYC";
        }
    }

    public final class LITE_ACTIVITY implements ItemId {
        public static final LITE_ACTIVITY INSTANCE = new LITE_ACTIVITY();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LITE_ACTIVITY);
        }

        public final int hashCode() {
            return -1564895803;
        }

        public final String toString() {
            return "LITE_ACTIVITY";
        }
    }

    public final class LITE_UNINSTALLED_BALANCE implements ItemId {
        public static final LITE_UNINSTALLED_BALANCE INSTANCE = new LITE_UNINSTALLED_BALANCE();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LITE_UNINSTALLED_BALANCE);
        }

        public final int hashCode() {
            return 83159272;
        }

        public final String toString() {
            return "LITE_UNINSTALLED_BALANCE";
        }
    }

    public final class LITE_UNINSTALLED_CARD implements ItemId {
        public static final LITE_UNINSTALLED_CARD INSTANCE = new LITE_UNINSTALLED_CARD();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LITE_UNINSTALLED_CARD);
        }

        public final int hashCode() {
            return 1861555300;
        }

        public final String toString() {
            return "LITE_UNINSTALLED_CARD";
        }
    }

    public final class MANAGED_ACCOUNT_SETTING_ITEM implements ItemId {
        public final String value;

        public MANAGED_ACCOUNT_SETTING_ITEM(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MANAGED_ACCOUNT_SETTING_ITEM) && this.value.equals(((MANAGED_ACCOUNT_SETTING_ITEM) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MANAGED_ACCOUNT_SETTING_ITEM(value=", this.value, ")");
        }
    }

    public final class MANAGED_ACCOUNT_SUPPORT_ITEM implements ItemId {
        public final String value;

        public MANAGED_ACCOUNT_SUPPORT_ITEM(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MANAGED_ACCOUNT_SUPPORT_ITEM) && this.value.equals(((MANAGED_ACCOUNT_SUPPORT_ITEM) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MANAGED_ACCOUNT_SUPPORT_ITEM(value=", this.value, ")");
        }
    }

    public final class MONEYBOT implements ItemId {
        public static final MONEYBOT INSTANCE = new MONEYBOT();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MONEYBOT);
        }

        public final int hashCode() {
            return -35866718;
        }

        public final String toString() {
            return "MONEYBOT";
        }
    }

    public final class PAYCHECKS implements ItemId {
        public static final PAYCHECKS INSTANCE = new PAYCHECKS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PAYCHECKS);
        }

        public final int hashCode() {
            return 230920120;
        }

        public final String toString() {
            return "PAYCHECKS";
        }
    }

    public final class PHONE_PLANS implements ItemId {
        public static final PHONE_PLANS INSTANCE = new PHONE_PLANS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PHONE_PLANS);
        }

        public final int hashCode() {
            return -1820071010;
        }

        public final String toString() {
            return "PHONE_PLANS";
        }
    }

    public final class POOLS implements ItemId {
        public static final POOLS INSTANCE = new POOLS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof POOLS);
        }

        public final int hashCode() {
            return -542912772;
        }

        public final String toString() {
            return "POOLS";
        }
    }

    public final class PROMOTED_BANKING_BENEFITS implements ItemId {
        public static final PROMOTED_BANKING_BENEFITS INSTANCE = new PROMOTED_BANKING_BENEFITS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PROMOTED_BANKING_BENEFITS);
        }

        public final int hashCode() {
            return -1665290283;
        }

        public final String toString() {
            return "PROMOTED_BANKING_BENEFITS";
        }
    }

    public final class PROMOTED_CARD implements ItemId {
        public static final PROMOTED_CARD INSTANCE = new PROMOTED_CARD();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PROMOTED_CARD);
        }

        public final int hashCode() {
            return 485761040;
        }

        public final String toString() {
            return "PROMOTED_CARD";
        }
    }

    public final class PROMOTED_PHONE_PLANS implements ItemId {
        public static final PROMOTED_PHONE_PLANS INSTANCE = new PROMOTED_PHONE_PLANS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PROMOTED_PHONE_PLANS);
        }

        public final int hashCode() {
            return 1150126873;
        }

        public final String toString() {
            return "PROMOTED_PHONE_PLANS";
        }
    }

    public final class PROMOTED_TAXES implements ItemId {
        public static final PROMOTED_TAXES INSTANCE = new PROMOTED_TAXES();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PROMOTED_TAXES);
        }

        public final int hashCode() {
            return -2105571207;
        }

        public final String toString() {
            return "PROMOTED_TAXES";
        }
    }

    public final class SAVINGS implements ItemId {
        public static final SAVINGS INSTANCE = new SAVINGS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SAVINGS);
        }

        public final int hashCode() {
            return 219944606;
        }

        public final String toString() {
            return "SAVINGS";
        }
    }

    public final class SCORE implements ItemId {
        public static final SCORE INSTANCE = new SCORE();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SCORE);
        }

        public final int hashCode() {
            return -540499529;
        }

        public final String toString() {
            return "SCORE";
        }
    }

    public final class SPENDING implements ItemId {
        public static final SPENDING INSTANCE = new SPENDING();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SPENDING);
        }

        public final int hashCode() {
            return -1826372513;
        }

        public final String toString() {
            return "SPENDING";
        }
    }

    public final class STOCKS implements ItemId {
        public static final STOCKS INSTANCE = new STOCKS();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof STOCKS);
        }

        public final int hashCode() {
            return 440069496;
        }

        public final String toString() {
            return "STOCKS";
        }
    }

    public final class TAXES implements ItemId {
        public static final TAXES INSTANCE = new TAXES();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TAXES);
        }

        public final int hashCode() {
            return -539627330;
        }

        public final String toString() {
            return "TAXES";
        }
    }

    public final class WORK implements ItemId {
        public static final WORK INSTANCE = new WORK();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WORK);
        }

        public final int hashCode() {
            return 952526636;
        }

        public final String toString() {
            return "WORK";
        }
    }
}
