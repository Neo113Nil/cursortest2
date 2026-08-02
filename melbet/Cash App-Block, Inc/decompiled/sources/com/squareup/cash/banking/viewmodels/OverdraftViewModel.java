package com.squareup.cash.banking.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.resourceindex.ColorCodesKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface OverdraftViewModel {

    public interface Loaded extends OverdraftViewModel {

        public final class ActivatedViewModel implements Loaded {
            public final String footerButtonText;
            public final String headerText;
            public final OverdraftUsageViewModel overdraftUsageViewModel;
            public final RepaymentSectionViewModel repaymentSection;
            public final ToggleViewModel toggleViewModel;

            public ActivatedViewModel(OverdraftUsageViewModel overdraftUsageViewModel, String str, String str2, ToggleViewModel toggleViewModel, RepaymentSectionViewModel repaymentSectionViewModel) {
                this.overdraftUsageViewModel = overdraftUsageViewModel;
                this.headerText = str;
                this.footerButtonText = str2;
                this.toggleViewModel = toggleViewModel;
                this.repaymentSection = repaymentSectionViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivatedViewModel)) {
                    return false;
                }
                ActivatedViewModel activatedViewModel = (ActivatedViewModel) obj;
                return this.overdraftUsageViewModel.equals(activatedViewModel.overdraftUsageViewModel) && this.headerText.equals(activatedViewModel.headerText) && Intrinsics.areEqual(this.footerButtonText, activatedViewModel.footerButtonText) && this.toggleViewModel.equals(activatedViewModel.toggleViewModel) && this.repaymentSection.equals(activatedViewModel.repaymentSection);
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final String getFooterButtonText() {
                return this.footerButtonText;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final RepaymentSectionViewModel getRepaymentSection() {
                return this.repaymentSection;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final ToggleViewModel getToggleViewModel() {
                return this.toggleViewModel;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overdraftUsageViewModel.hashCode() * 31, 31, this.headerText);
                String str = this.footerButtonText;
                return this.repaymentSection.hashCode() + ((this.toggleViewModel.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "ActivatedViewModel(overdraftUsageViewModel=" + this.overdraftUsageViewModel + ", headerText=" + this.headerText + ", footerButtonText=" + this.footerButtonText + ", toggleViewModel=" + this.toggleViewModel + ", repaymentSection=" + this.repaymentSection + ")";
            }
        }

        public final class DisabledViewModel implements Loaded {
            public final String bodyText;
            public final String footerButtonText;
            public final String headerText;
            public final RepaymentSectionViewModel repaymentSection;
            public final ToggleViewModel toggleViewModel;

            public DisabledViewModel(String str, String str2, String str3, ToggleViewModel toggleViewModel, RepaymentSectionViewModel repaymentSectionViewModel) {
                this.bodyText = str;
                this.headerText = str2;
                this.footerButtonText = str3;
                this.toggleViewModel = toggleViewModel;
                this.repaymentSection = repaymentSectionViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisabledViewModel)) {
                    return false;
                }
                DisabledViewModel disabledViewModel = (DisabledViewModel) obj;
                return Intrinsics.areEqual(this.bodyText, disabledViewModel.bodyText) && this.headerText.equals(disabledViewModel.headerText) && Intrinsics.areEqual(this.footerButtonText, disabledViewModel.footerButtonText) && this.toggleViewModel.equals(disabledViewModel.toggleViewModel) && this.repaymentSection.equals(disabledViewModel.repaymentSection);
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final String getFooterButtonText() {
                return this.footerButtonText;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final RepaymentSectionViewModel getRepaymentSection() {
                return this.repaymentSection;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final ToggleViewModel getToggleViewModel() {
                return this.toggleViewModel;
            }

            public final int hashCode() {
                String str = this.bodyText;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.headerText);
                String str2 = this.footerButtonText;
                return this.repaymentSection.hashCode() + ((this.toggleViewModel.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisabledViewModel(bodyText=", this.bodyText, ", headerText=", this.headerText, ", footerButtonText=");
                m.append(this.footerButtonText);
                m.append(", toggleViewModel=");
                m.append(this.toggleViewModel);
                m.append(", repaymentSection=");
                m.append(this.repaymentSection);
                m.append(")");
                return m.toString();
            }
        }

        public final class EligibleViewModel implements Loaded {
            public final String bodyText;
            public final String footerButtonText;
            public final String headerText;
            public final ToggleViewModel toggleViewModel;

            public EligibleViewModel(String str, String str2, String str3, ToggleViewModel toggleViewModel, int i) {
                toggleViewModel = (i & 8) != 0 ? null : toggleViewModel;
                str.getClass();
                this.bodyText = str;
                this.headerText = str2;
                this.footerButtonText = str3;
                this.toggleViewModel = toggleViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EligibleViewModel)) {
                    return false;
                }
                EligibleViewModel eligibleViewModel = (EligibleViewModel) obj;
                return Intrinsics.areEqual(this.bodyText, eligibleViewModel.bodyText) && this.headerText.equals(eligibleViewModel.headerText) && Intrinsics.areEqual(this.footerButtonText, eligibleViewModel.footerButtonText) && Intrinsics.areEqual(this.toggleViewModel, eligibleViewModel.toggleViewModel);
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final String getFooterButtonText() {
                return this.footerButtonText;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final RepaymentSectionViewModel getRepaymentSection() {
                return null;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final ToggleViewModel getToggleViewModel() {
                return this.toggleViewModel;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bodyText.hashCode() * 31, 31, this.headerText);
                String str = this.footerButtonText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                ToggleViewModel toggleViewModel = this.toggleViewModel;
                return (hashCode + (toggleViewModel != null ? toggleViewModel.hashCode() : 0)) * 31;
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EligibleViewModel(bodyText=", this.bodyText, ", headerText=", this.headerText, ", footerButtonText=");
                m.append(this.footerButtonText);
                m.append(", toggleViewModel=");
                m.append(this.toggleViewModel);
                m.append(", repaymentSection=null)");
                return m.toString();
            }
        }

        public final class OverdraftUsageViewModel {
            public final String amountUsed;
            public final String limit;
            public final float percentageUsed;

            public OverdraftUsageViewModel(float f, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.amountUsed = str;
                this.limit = str2;
                this.percentageUsed = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverdraftUsageViewModel)) {
                    return false;
                }
                OverdraftUsageViewModel overdraftUsageViewModel = (OverdraftUsageViewModel) obj;
                return Intrinsics.areEqual(this.amountUsed, overdraftUsageViewModel.amountUsed) && Intrinsics.areEqual(this.limit, overdraftUsageViewModel.limit) && Float.compare(this.percentageUsed, overdraftUsageViewModel.percentageUsed) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.percentageUsed) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amountUsed.hashCode() * 31, 31, this.limit);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(this.percentageUsed, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OverdraftUsageViewModel(amountUsed=", this.amountUsed, ", limit=", this.limit, ", percentageUsed="));
            }
        }

        public final class PermanentlyDisabledViewModel implements Loaded {
            public final String bodyText;
            public final String headerText;
            public final RepaymentSectionViewModel repaymentSection;

            public PermanentlyDisabledViewModel(String str, String str2, RepaymentSectionViewModel repaymentSectionViewModel) {
                this.bodyText = str;
                this.headerText = str2;
                this.repaymentSection = repaymentSectionViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PermanentlyDisabledViewModel)) {
                    return false;
                }
                PermanentlyDisabledViewModel permanentlyDisabledViewModel = (PermanentlyDisabledViewModel) obj;
                return Intrinsics.areEqual(this.bodyText, permanentlyDisabledViewModel.bodyText) && this.headerText.equals(permanentlyDisabledViewModel.headerText) && this.repaymentSection.equals(permanentlyDisabledViewModel.repaymentSection);
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final String getFooterButtonText() {
                return null;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final RepaymentSectionViewModel getRepaymentSection() {
                return this.repaymentSection;
            }

            @Override // com.squareup.cash.banking.viewmodels.OverdraftViewModel.Loaded
            public final ToggleViewModel getToggleViewModel() {
                return null;
            }

            public final int hashCode() {
                String str = this.bodyText;
                return this.repaymentSection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 29791, this.headerText);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PermanentlyDisabledViewModel(bodyText=", this.bodyText, ", headerText=", this.headerText, ", footerButtonText=null, toggleViewModel=null, repaymentSection=");
                m.append(this.repaymentSection);
                m.append(")");
                return m.toString();
            }
        }

        public final class RepaymentSectionViewModel {
            public final String amountUsed;
            public final ColorCodesKt buttonStyle;
            public final String buttonText;
            public final String label;

            public RepaymentSectionViewModel(String str, ColorCodesKt colorCodesKt, String str2, String str3) {
                str3.getClass();
                this.buttonText = str;
                this.buttonStyle = colorCodesKt;
                this.label = str2;
                this.amountUsed = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RepaymentSectionViewModel)) {
                    return false;
                }
                RepaymentSectionViewModel repaymentSectionViewModel = (RepaymentSectionViewModel) obj;
                return Intrinsics.areEqual(this.buttonText, repaymentSectionViewModel.buttonText) && this.buttonStyle.equals(repaymentSectionViewModel.buttonStyle) && this.label.equals(repaymentSectionViewModel.label) && Intrinsics.areEqual(this.amountUsed, repaymentSectionViewModel.amountUsed);
            }

            public final int hashCode() {
                String str = this.buttonText;
                return this.amountUsed.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.buttonStyle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.label);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RepaymentSectionViewModel(buttonText=");
                sb.append(this.buttonText);
                sb.append(", buttonStyle=");
                sb.append(this.buttonStyle);
                sb.append(", label=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.label, ", amountUsed=", this.amountUsed, ")");
            }
        }

        public final class ToggleViewModel {
            public final String body;
            public final boolean checked;
            public final boolean enabled;
            public final String label;

            public ToggleViewModel(String str, String str2, boolean z, boolean z2) {
                str.getClass();
                this.label = str;
                this.body = str2;
                this.checked = z;
                this.enabled = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ToggleViewModel)) {
                    return false;
                }
                ToggleViewModel toggleViewModel = (ToggleViewModel) obj;
                return Intrinsics.areEqual(this.label, toggleViewModel.label) && Intrinsics.areEqual(this.body, toggleViewModel.body) && this.checked == toggleViewModel.checked && this.enabled == toggleViewModel.enabled;
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                String str = this.body;
                return Boolean.hashCode(this.enabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.checked);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToggleViewModel(label=", this.label, ", body=", this.body, ", checked="), this.checked, ", enabled=", this.enabled, ")");
            }
        }

        String getFooterButtonText();

        RepaymentSectionViewModel getRepaymentSection();

        ToggleViewModel getToggleViewModel();
    }

    public final class Loading implements OverdraftViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 474378762;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
