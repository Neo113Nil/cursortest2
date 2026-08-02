package com.squareup.cash.observability.types;

import com.knotapi.knot.utilities.BreadcrumbHelper;

/* loaded from: classes6.dex */
public interface ErrorFeature {

    public final class Activity implements ErrorFeature {
        public static final Activity INSTANCE = new Activity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Activity);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "activity";
        }

        public final int hashCode() {
            return 1496007547;
        }

        public final String toString() {
            return "Activity";
        }
    }

    /* loaded from: classes5.dex */
    public final class AfterpayApplet implements ErrorFeature {
        public static final AfterpayApplet INSTANCE = new AfterpayApplet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AfterpayApplet);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "afterpay-applet";
        }

        public final int hashCode() {
            return -1387362254;
        }

        public final String toString() {
            return "AfterpayApplet";
        }
    }

    /* loaded from: classes7.dex */
    public final class AppSignatureVerification implements ErrorFeature {
        public static final AppSignatureVerification INSTANCE = new AppSignatureVerification();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppSignatureVerification);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "app-signature-verification";
        }

        public final int hashCode() {
            return -1938977858;
        }

        public final String toString() {
            return "AppSignatureVerification";
        }
    }

    public final class AttestedKey implements ErrorFeature {
        public static final AttestedKey INSTANCE = new AttestedKey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AttestedKey);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "attested-key";
        }

        public final int hashCode() {
            return -1103860433;
        }

        public final String toString() {
            return "AttestedKey";
        }
    }

    public final class Badging implements ErrorFeature {
        public static final Badging INSTANCE = new Badging();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Badging);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "badging";
        }

        public final int hashCode() {
            return -1353101900;
        }

        public final String toString() {
            return "Badging";
        }
    }

    /* loaded from: classes5.dex */
    public final class BankingBenefits implements ErrorFeature {
        public static final BankingBenefits INSTANCE = new BankingBenefits();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankingBenefits);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "banking-benefits";
        }

        public final int hashCode() {
            return -199855338;
        }

        public final String toString() {
            return "BankingBenefits";
        }
    }

    /* loaded from: classes5.dex */
    public final class BankingDisclosures implements ErrorFeature {
        public static final BankingDisclosures INSTANCE = new BankingDisclosures();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankingDisclosures);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "banking-disclosures";
        }

        public final int hashCode() {
            return 412395916;
        }

        public final String toString() {
            return "BankingDisclosures";
        }
    }

    public final class Bitcoin implements ErrorFeature {
        public static final Bitcoin INSTANCE = new Bitcoin();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Bitcoin);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "bitcoin";
        }

        public final int hashCode() {
            return -1109405902;
        }

        public final String toString() {
            return "Bitcoin";
        }
    }

    /* loaded from: classes5.dex */
    public final class Borrow implements ErrorFeature {
        public static final Borrow INSTANCE = new Borrow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Borrow);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "borrow";
        }

        public final int hashCode() {
            return -1415764639;
        }

        public final String toString() {
            return "Borrow";
        }
    }

    /* loaded from: classes7.dex */
    public final class CardManager implements ErrorFeature {
        public static final CardManager INSTANCE = new CardManager();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardManager);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "card-manager";
        }

        public final int hashCode() {
            return 1006985873;
        }

        public final String toString() {
            return "CardManager";
        }
    }

    public final class CardOnboarding implements ErrorFeature {
        public static final CardOnboarding INSTANCE = new CardOnboarding();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardOnboarding);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "card-onboarding";
        }

        public final int hashCode() {
            return 590629047;
        }

        public final String toString() {
            return "CardOnboarding";
        }
    }

    /* loaded from: classes7.dex */
    public final class CardTab implements ErrorFeature {
        public static final CardTab INSTANCE = new CardTab();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardTab);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "card-tab";
        }

        public final int hashCode() {
            return -452778887;
        }

        public final String toString() {
            return "CardTab";
        }
    }

    public final class CashCreditScore implements ErrorFeature {
        public static final CashCreditScore INSTANCE = new CashCreditScore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CashCreditScore);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "cash-credit-score";
        }

        public final int hashCode() {
            return 383087610;
        }

        public final String toString() {
            return "CashCreditScore";
        }
    }

    public final class CheckDeposit implements ErrorFeature {
        public static final CheckDeposit INSTANCE = new CheckDeposit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckDeposit);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "check-deposit";
        }

        public final int hashCode() {
            return 2058537698;
        }

        public final String toString() {
            return "CheckDeposit";
        }
    }

    public final class ClientRouting implements ErrorFeature {
        public static final ClientRouting INSTANCE = new ClientRouting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientRouting);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "client-routing";
        }

        public final int hashCode() {
            return 2132954511;
        }

        public final String toString() {
            return "ClientRouting";
        }
    }

    public final class ClientSync implements ErrorFeature {
        public static final ClientSync INSTANCE = new ClientSync();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientSync);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "client-sync";
        }

        public final int hashCode() {
            return -2096985486;
        }

        public final String toString() {
            return "ClientSync";
        }
    }

    public final class DeepLinking implements ErrorFeature {
        public static final DeepLinking INSTANCE = new DeepLinking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeepLinking);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "deep-link";
        }

        public final int hashCode() {
            return -773230800;
        }

        public final String toString() {
            return "DeepLinking";
        }
    }

    public final class DesignSystems implements ErrorFeature {
        public static final DesignSystems INSTANCE = new DesignSystems();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DesignSystems);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "design-systems";
        }

        public final int hashCode() {
            return -1567429734;
        }

        public final String toString() {
            return "DesignSystems";
        }
    }

    public final class DigitalSigning implements ErrorFeature {
        public static final DigitalSigning INSTANCE = new DigitalSigning();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DigitalSigning);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "digital-signing";
        }

        public final int hashCode() {
            return 651227961;
        }

        public final String toString() {
            return "DigitalSigning";
        }
    }

    public final class Earnings implements ErrorFeature {
        public static final Earnings INSTANCE = new Earnings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Earnings);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "earnings";
        }

        public final int hashCode() {
            return -1950716651;
        }

        public final String toString() {
            return "Earnings";
        }
    }

    public final class EducationStory implements ErrorFeature {
        public static final EducationStory INSTANCE = new EducationStory();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EducationStory);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "educational-story";
        }

        public final int hashCode() {
            return -954762855;
        }

        public final String toString() {
            return "EducationStory";
        }
    }

    public final class Eligibility implements ErrorFeature {
        public static final Eligibility INSTANCE = new Eligibility();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Eligibility);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "eligibility";
        }

        public final int hashCode() {
            return -1328272479;
        }

        public final String toString() {
            return "Eligibility";
        }
    }

    public final class Encryption implements ErrorFeature {
        public static final Encryption INSTANCE = new Encryption();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Encryption);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "encryption";
        }

        public final int hashCode() {
            return -417073937;
        }

        public final String toString() {
            return "Encryption";
        }
    }

    public final class Family implements ErrorFeature {
        public static final Family INSTANCE = new Family();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Family);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "family";
        }

        public final int hashCode() {
            return -1314335024;
        }

        public final String toString() {
            return "Family";
        }
    }

    public final class Flows implements ErrorFeature {
        public static final Flows INSTANCE = new Flows();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Flows);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "flows";
        }

        public final int hashCode() {
            return 927763481;
        }

        public final String toString() {
            return "Flows";
        }
    }

    public final class GlobalSearch implements ErrorFeature {
        public static final GlobalSearch INSTANCE = new GlobalSearch();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GlobalSearch);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "global-search";
        }

        public final int hashCode() {
            return -109377129;
        }

        public final String toString() {
            return "GlobalSearch";
        }
    }

    public final class Gps implements ErrorFeature {
        public static final Gps INSTANCE = new Gps();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Gps);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "gps";
        }

        public final int hashCode() {
            return 1507110078;
        }

        public final String toString() {
            return "Gps";
        }
    }

    public final class Graphics implements ErrorFeature {
        public static final Graphics INSTANCE = new Graphics();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Graphics);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "graphics";
        }

        public final int hashCode() {
            return -1042285833;
        }

        public final String toString() {
            return "Graphics";
        }
    }

    public final class InstrumentLinkingOptions implements ErrorFeature {
        public static final InstrumentLinkingOptions INSTANCE = new InstrumentLinkingOptions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstrumentLinkingOptions);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "instrument-linking-options";
        }

        public final int hashCode() {
            return 566922249;
        }

        public final String toString() {
            return "InstrumentLinkingOptions";
        }
    }

    public final class Instruments implements ErrorFeature {
        public static final Instruments INSTANCE = new Instruments();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Instruments);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "instruments";
        }

        public final int hashCode() {
            return -87105152;
        }

        public final String toString() {
            return "Instruments";
        }
    }

    public final class Investing implements ErrorFeature {
        public static final Investing INSTANCE = new Investing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Investing);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "investing";
        }

        public final int hashCode() {
            return 1205941473;
        }

        public final String toString() {
            return "Investing";
        }
    }

    public final class LnMcfMigration implements ErrorFeature {
        public static final LnMcfMigration INSTANCE = new LnMcfMigration();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LnMcfMigration);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "lightning-mcf-migration";
        }

        public final int hashCode() {
            return -1595052500;
        }

        public final String toString() {
            return "LnMcfMigration";
        }
    }

    public final class Loyalty implements ErrorFeature {
        public static final Loyalty INSTANCE = new Loyalty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loyalty);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "loyalty";
        }

        public final int hashCode() {
            return -647973286;
        }

        public final String toString() {
            return "Loyalty";
        }
    }

    public final class Merchant implements ErrorFeature {
        public static final Merchant INSTANCE = new Merchant();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Merchant);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "merchant";
        }

        public final int hashCode() {
            return -1648289228;
        }

        public final String toString() {
            return "Merchant";
        }
    }

    public final class Money implements ErrorFeature {
        public static final Money INSTANCE = new Money();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Money);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "money";
        }

        public final int hashCode() {
            return 934315988;
        }

        public final String toString() {
            return "Money";
        }
    }

    public final class Moneybot implements ErrorFeature {
        public static final Moneybot INSTANCE = new Moneybot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Moneybot);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "moneybot";
        }

        public final int hashCode() {
            return -1475349133;
        }

        public final String toString() {
            return "Moneybot";
        }
    }

    public final class Navigation implements ErrorFeature {
        public static final Navigation INSTANCE = new Navigation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Navigation);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return BreadcrumbHelper.Category.NAVIGATION;
        }

        public final int hashCode() {
            return -1336742016;
        }

        public final String toString() {
            return "Navigation";
        }
    }

    /* loaded from: classes7.dex */
    public final class NotificationsSettings implements ErrorFeature {
        public static final NotificationsSettings INSTANCE = new NotificationsSettings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationsSettings);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "notifications-Settings";
        }

        public final int hashCode() {
            return -1132983233;
        }

        public final String toString() {
            return "NotificationsSettings";
        }
    }

    public final class Passkeys implements ErrorFeature {
        public static final Passkeys INSTANCE = new Passkeys();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Passkeys);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "passkeys";
        }

        public final int hashCode() {
            return 73626097;
        }

        public final String toString() {
            return "Passkeys";
        }
    }

    public final class Paychecks implements ErrorFeature {
        public static final Paychecks INSTANCE = new Paychecks();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Paychecks);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "paychecks";
        }

        public final int hashCode() {
            return -1443361753;
        }

        public final String toString() {
            return "Paychecks";
        }
    }

    public final class Persistence implements ErrorFeature {
        public static final Persistence INSTANCE = new Persistence();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Persistence);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "persistence";
        }

        public final int hashCode() {
            return -1690957133;
        }

        public final String toString() {
            return "Persistence";
        }
    }

    public final class PrepurchaseCashCard implements ErrorFeature {
        public static final PrepurchaseCashCard INSTANCE = new PrepurchaseCashCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepurchaseCashCard);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "prepurchase-cash-card";
        }

        public final int hashCode() {
            return -360648261;
        }

        public final String toString() {
            return "PrepurchaseCashCard";
        }
    }

    public final class ProfileSync implements ErrorFeature {
        public static final ProfileSync INSTANCE = new ProfileSync();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileSync);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "profile-sync";
        }

        public final int hashCode() {
            return -219749384;
        }

        public final String toString() {
            return "ProfileSync";
        }
    }

    public final class Sandbox implements ErrorFeature {
        public static final Sandbox INSTANCE = new Sandbox();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Sandbox);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "sandbox";
        }

        public final int hashCode() {
            return 858697947;
        }

        public final String toString() {
            return "Sandbox";
        }
    }

    /* loaded from: classes7.dex */
    public final class Savings implements ErrorFeature {
        public static final Savings INSTANCE = new Savings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Savings);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "savings";
        }

        public final int hashCode() {
            return 866246349;
        }

        public final String toString() {
            return "Savings";
        }
    }

    public final class Security implements ErrorFeature {
        public static final Security INSTANCE = new Security();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Security);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "security";
        }

        public final int hashCode() {
            return -193869908;
        }

        public final String toString() {
            return "Security";
        }
    }

    /* loaded from: classes7.dex */
    public final class Sessions implements ErrorFeature {
        public static final Sessions INSTANCE = new Sessions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Sessions);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "sessions";
        }

        public final int hashCode() {
            return 262086921;
        }

        public final String toString() {
            return "Sessions";
        }
    }

    public final class SpendingInsights implements ErrorFeature {
        public static final SpendingInsights INSTANCE = new SpendingInsights();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SpendingInsights);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "card-spending-insights";
        }

        public final int hashCode() {
            return 1885498923;
        }

        public final String toString() {
            return "SpendingInsights";
        }
    }

    public final class Support implements ErrorFeature {
        public static final Support INSTANCE = new Support();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Support);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "support";
        }

        public final int hashCode() {
            return 1433498083;
        }

        public final String toString() {
            return "Support";
        }
    }

    /* loaded from: classes7.dex */
    public final class TapToPay implements ErrorFeature {
        public static final TapToPay INSTANCE = new TapToPay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapToPay);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "tap-to-pay";
        }

        public final int hashCode() {
            return -1659485514;
        }

        public final String toString() {
            return "TapToPay";
        }
    }

    public final class TestFeature implements ErrorFeature {
        public static final TestFeature INSTANCE = new TestFeature();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TestFeature);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "test-feature";
        }

        public final int hashCode() {
            return -1769230824;
        }

        public final String toString() {
            return "TestFeature";
        }
    }

    /* loaded from: classes7.dex */
    public final class Transfers implements ErrorFeature {
        public static final Transfers INSTANCE = new Transfers();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Transfers);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "transfers";
        }

        public final int hashCode() {
            return -20380932;
        }

        public final String toString() {
            return "Transfers";
        }
    }

    /* loaded from: classes5.dex */
    public final class Treehouse implements ErrorFeature {
        public static final Treehouse INSTANCE = new Treehouse();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Treehouse);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "treehouse";
        }

        public final int hashCode() {
            return -1032871082;
        }

        public final String toString() {
            return "Treehouse";
        }
    }

    /* loaded from: classes7.dex */
    public final class UserJourneys implements ErrorFeature {
        public static final UserJourneys INSTANCE = new UserJourneys();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserJourneys);
        }

        @Override // com.squareup.cash.observability.types.ErrorFeature
        public final String getName() {
            return "user-journeys";
        }

        public final int hashCode() {
            return -1256925174;
        }

        public final String toString() {
            return "UserJourneys";
        }
    }

    String getName();
}
