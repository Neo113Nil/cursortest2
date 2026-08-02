package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes4.dex */
public interface EarnerEnrollmentBlockerViewEvent {

    public final class Back implements EarnerEnrollmentBlockerViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1335609099;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Continue implements EarnerEnrollmentBlockerViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return 1626515893;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class Done implements EarnerEnrollmentBlockerViewEvent {
        public static final Done INSTANCE = new Done();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Done);
        }

        public final int hashCode() {
            return -1335535728;
        }

        public final String toString() {
            return "Done";
        }
    }

    public final class EarnerCategorySelected implements EarnerEnrollmentBlockerViewEvent {
        public static final EarnerCategorySelected INSTANCE = new EarnerCategorySelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EarnerCategorySelected);
        }

        public final int hashCode() {
            return 1478899436;
        }

        public final String toString() {
            return "EarnerCategorySelected";
        }
    }

    /* loaded from: classes5.dex */
    public final class EarnerCategorySelectionChanged implements EarnerEnrollmentBlockerViewEvent {
        public final EarnerCategory category;

        public EarnerCategorySelectionChanged(EarnerCategory earnerCategory) {
            earnerCategory.getClass();
            this.category = earnerCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EarnerCategorySelectionChanged) && this.category == ((EarnerCategorySelectionChanged) obj).category;
        }

        public final int hashCode() {
            return this.category.hashCode();
        }

        public final String toString() {
            return "EarnerCategorySelectionChanged(category=" + this.category + ")";
        }
    }

    public final class EarnerCategorySelectionContinued implements EarnerEnrollmentBlockerViewEvent {
        public static final EarnerCategorySelectionContinued INSTANCE = new EarnerCategorySelectionContinued();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EarnerCategorySelectionContinued);
        }

        public final int hashCode() {
            return 1019144066;
        }

        public final String toString() {
            return "EarnerCategorySelectionContinued";
        }
    }

    /* loaded from: classes5.dex */
    public final class IndividualCertificationChanged implements EarnerEnrollmentBlockerViewEvent {
        public final boolean checked;

        public IndividualCertificationChanged(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IndividualCertificationChanged) && this.checked == ((IndividualCertificationChanged) obj).checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("IndividualCertificationChanged(checked=", ")", this.checked);
        }
    }

    /* loaded from: classes5.dex */
    public final class LegalAgreementChanged implements EarnerEnrollmentBlockerViewEvent {
        public final boolean checked;

        public LegalAgreementChanged(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LegalAgreementChanged) && this.checked == ((LegalAgreementChanged) obj).checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("LegalAgreementChanged(checked=", ")", this.checked);
        }
    }

    /* loaded from: classes5.dex */
    public final class LegalLinkClicked implements EarnerEnrollmentBlockerViewEvent {
        public final String displayText;
        public final String url;

        public LegalLinkClicked(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.url = str;
            this.displayText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegalLinkClicked)) {
                return false;
            }
            LegalLinkClicked legalLinkClicked = (LegalLinkClicked) obj;
            return Intrinsics.areEqual(this.url, legalLinkClicked.url) && Intrinsics.areEqual(this.displayText, legalLinkClicked.displayText);
        }

        public final int hashCode() {
            return this.displayText.hashCode() + (this.url.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("LegalLinkClicked(url=", this.url, ", displayText=", this.displayText, ")");
        }
    }

    public final class ManageCustomerList implements EarnerEnrollmentBlockerViewEvent {
        public static final ManageCustomerList INSTANCE = new ManageCustomerList();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageCustomerList);
        }

        public final int hashCode() {
            return 167086895;
        }

        public final String toString() {
            return "ManageCustomerList";
        }
    }
}
