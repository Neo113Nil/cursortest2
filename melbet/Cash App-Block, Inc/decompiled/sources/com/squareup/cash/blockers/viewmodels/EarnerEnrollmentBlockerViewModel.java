package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes4.dex */
public interface EarnerEnrollmentBlockerViewModel {

    public final class CategorySelection implements EarnerEnrollmentBlockerViewModel {
        public final ArrayList categories;
        public final String continueButtonText;
        public final EarnerCategory selectedCategory;
        public final String title;

        public final class Category {
            public final String arcadeIconId;
            public final EarnerCategory category;
            public final String displayName;

            public Category(EarnerCategory earnerCategory, String str, String str2) {
                this.category = earnerCategory;
                this.displayName = str;
                this.arcadeIconId = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Category)) {
                    return false;
                }
                Category category = (Category) obj;
                return this.category == category.category && this.displayName.equals(category.displayName) && Intrinsics.areEqual(this.arcadeIconId, category.arcadeIconId);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.category.hashCode() * 31, 31, this.displayName);
                String str = this.arcadeIconId;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Category(category=");
                sb.append(this.category);
                sb.append(", displayName=");
                sb.append(this.displayName);
                sb.append(", arcadeIconId=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.arcadeIconId, ")");
            }
        }

        public CategorySelection(String str, ArrayList arrayList, EarnerCategory earnerCategory, String str2) {
            str2.getClass();
            this.title = str;
            this.categories = arrayList;
            this.selectedCategory = earnerCategory;
            this.continueButtonText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategorySelection)) {
                return false;
            }
            CategorySelection categorySelection = (CategorySelection) obj;
            return this.title.equals(categorySelection.title) && this.categories.equals(categorySelection.categories) && this.selectedCategory == categorySelection.selectedCategory && Intrinsics.areEqual(this.continueButtonText, categorySelection.continueButtonText);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.categories, this.title.hashCode() * 31, 31);
            EarnerCategory earnerCategory = this.selectedCategory;
            return this.continueButtonText.hashCode() + ((m + (earnerCategory == null ? 0 : earnerCategory.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.categories, "CategorySelection(title=", this.title, ", categories=", ", selectedCategory=");
            m.append(this.selectedCategory);
            m.append(", continueButtonText=");
            m.append(this.continueButtonText);
            m.append(")");
            return m.toString();
        }
    }

    public final class Form implements EarnerEnrollmentBlockerViewModel {
        public final String continueButtonText;
        public final boolean individualCertificationChecked;
        public final String individualCertificationText;
        public final boolean legalAgreementChecked;
        public final String legalAgreementText;
        public final EarnerCategory selectedCategory;
        public final String selectedEarnerCategory;
        public final String title;

        public Form(String str, EarnerCategory earnerCategory, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
            str5.getClass();
            this.title = str;
            this.selectedCategory = earnerCategory;
            this.selectedEarnerCategory = str2;
            this.individualCertificationText = str3;
            this.legalAgreementText = str4;
            this.continueButtonText = str5;
            this.individualCertificationChecked = z;
            this.legalAgreementChecked = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Form)) {
                return false;
            }
            Form form = (Form) obj;
            return this.title.equals(form.title) && this.selectedCategory == form.selectedCategory && this.selectedEarnerCategory.equals(form.selectedEarnerCategory) && this.individualCertificationText.equals(form.individualCertificationText) && this.legalAgreementText.equals(form.legalAgreementText) && Intrinsics.areEqual(this.continueButtonText, form.continueButtonText) && this.individualCertificationChecked == form.individualCertificationChecked && this.legalAgreementChecked == form.legalAgreementChecked;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            EarnerCategory earnerCategory = this.selectedCategory;
            return Boolean.hashCode(this.legalAgreementChecked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (earnerCategory == null ? 0 : earnerCategory.hashCode())) * 31, 31, this.selectedEarnerCategory), 31, this.individualCertificationText), 31, this.legalAgreementText), 31, this.continueButtonText), 31, this.individualCertificationChecked);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Form(title=");
            sb.append(this.title);
            sb.append(", selectedCategory=");
            sb.append(this.selectedCategory);
            sb.append(", selectedEarnerCategory=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.selectedEarnerCategory, ", individualCertificationText=", this.individualCertificationText, ", legalAgreementText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.legalAgreementText, ", continueButtonText=", this.continueButtonText, ", individualCertificationChecked=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.individualCertificationChecked, ", legalAgreementChecked=", this.legalAgreementChecked, ")");
        }
    }

    public final class Success implements EarnerEnrollmentBlockerViewModel {
        public final String bannerImageUrl;
        public final String body;
        public final String doneButtonText;
        public final String manageCustomerListButtonText;
        public final String title;

        public Success(String str, String str2, String str3, String str4, String str5) {
            str5.getClass();
            this.bannerImageUrl = str;
            this.title = str2;
            this.body = str3;
            this.manageCustomerListButtonText = str4;
            this.doneButtonText = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.bannerImageUrl.equals(success.bannerImageUrl) && this.title.equals(success.title) && this.body.equals(success.body) && this.manageCustomerListButtonText.equals(success.manageCustomerListButtonText) && Intrinsics.areEqual(this.doneButtonText, success.doneButtonText);
        }

        public final int hashCode() {
            return this.doneButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bannerImageUrl.hashCode() * 31, 31, this.title), 31, this.body), 31, this.manageCustomerListButtonText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(bannerImageUrl=", this.bannerImageUrl, ", title=", this.title, ", body=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.body, ", manageCustomerListButtonText=", this.manageCustomerListButtonText, ", doneButtonText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.doneButtonText, ")");
        }
    }
}
