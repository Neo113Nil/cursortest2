package com.squareup.cash.paychecks.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaychecksHomeViewEvent {

    public final class AlreadySetUpDirectDepositClick implements PaychecksHomeViewEvent {
        public static final AlreadySetUpDirectDepositClick INSTANCE = new AlreadySetUpDirectDepositClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AlreadySetUpDirectDepositClick);
        }

        public final int hashCode() {
            return 1475676401;
        }

        public final String toString() {
            return "AlreadySetUpDirectDepositClick";
        }
    }

    public final class CallToAction implements PaychecksHomeViewEvent {
        public final String clientRoute;

        public CallToAction(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallToAction) && Intrinsics.areEqual(this.clientRoute, ((CallToAction) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CallToAction(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class DisclosureUrlClicked implements PaychecksHomeViewEvent {
        public final String url;

        public DisclosureUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClicked) && Intrinsics.areEqual(this.url, ((DisclosureUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClicked(url=", this.url, ")");
        }
    }

    public final class EditDistribution implements PaychecksHomeViewEvent {
        public final String clientRoute;

        public EditDistribution(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditDistribution) && Intrinsics.areEqual(this.clientRoute, ((EditDistribution) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EditDistribution(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class Exit implements PaychecksHomeViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1770711351;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class SeeAllBenefits implements PaychecksHomeViewEvent {
        public final String clientRoute;

        public SeeAllBenefits(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeAllBenefits) && Intrinsics.areEqual(this.clientRoute, ((SeeAllBenefits) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SeeAllBenefits(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class SetUpDirectDeposit implements PaychecksHomeViewEvent {
        public final String clientRoute;
        public final boolean hasDistribution;
        public final SetupDirectDepositOrigin origin;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SetupDirectDepositOrigin {
            public static final /* synthetic */ SetupDirectDepositOrigin[] $VALUES;
            public static final SetupDirectDepositOrigin FOOTER;
            public static final SetupDirectDepositOrigin TIMELINE;

            static {
                SetupDirectDepositOrigin setupDirectDepositOrigin = new SetupDirectDepositOrigin("TIMELINE", 0);
                TIMELINE = setupDirectDepositOrigin;
                SetupDirectDepositOrigin setupDirectDepositOrigin2 = new SetupDirectDepositOrigin("FOOTER", 1);
                FOOTER = setupDirectDepositOrigin2;
                $VALUES = new SetupDirectDepositOrigin[]{setupDirectDepositOrigin, setupDirectDepositOrigin2};
            }

            public static SetupDirectDepositOrigin valueOf(String str) {
                return (SetupDirectDepositOrigin) Enum.valueOf(SetupDirectDepositOrigin.class, str);
            }

            public static SetupDirectDepositOrigin[] values() {
                return (SetupDirectDepositOrigin[]) $VALUES.clone();
            }
        }

        public SetUpDirectDeposit(SetupDirectDepositOrigin setupDirectDepositOrigin, String str, boolean z) {
            str.getClass();
            this.origin = setupDirectDepositOrigin;
            this.clientRoute = str;
            this.hasDistribution = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetUpDirectDeposit)) {
                return false;
            }
            SetUpDirectDeposit setUpDirectDeposit = (SetUpDirectDeposit) obj;
            return this.origin == setUpDirectDeposit.origin && Intrinsics.areEqual(this.clientRoute, setUpDirectDeposit.clientRoute) && this.hasDistribution == setUpDirectDeposit.hasDistribution;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasDistribution) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.origin.hashCode() * 31, 31, this.clientRoute);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetUpDirectDeposit(origin=");
            sb.append(this.origin);
            sb.append(", clientRoute=");
            sb.append(this.clientRoute);
            sb.append(", hasDistribution=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasDistribution, ")");
        }
    }

    public final class ViewPaycheckBenefits implements PaychecksHomeViewEvent {
        public final String clientRoute;

        public ViewPaycheckBenefits(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewPaycheckBenefits) && Intrinsics.areEqual(this.clientRoute, ((ViewPaycheckBenefits) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewPaycheckBenefits(clientRoute=", this.clientRoute, ")");
        }
    }
}
