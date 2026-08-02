package com.squareup.cash.family.familyhub.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DependentControlViewModel {

    public final class ApprovedContacts implements DependentControlViewModel {
        public final P2PControlListViewModel approvedRowViewModel;
        public final P2PControlListViewModel blockedRowViewModel;
        public final P2PControlListViewModel limitViewModel;
        public final DependentControlsToggleViewModel toggleViewModel;
        public final String toolbarTitle;

        public ApprovedContacts(String str, DependentControlsToggleViewModel dependentControlsToggleViewModel, P2PControlListViewModel p2PControlListViewModel, P2PControlListViewModel p2PControlListViewModel2, P2PControlListViewModel p2PControlListViewModel3) {
            str.getClass();
            this.toolbarTitle = str;
            this.toggleViewModel = dependentControlsToggleViewModel;
            this.approvedRowViewModel = p2PControlListViewModel;
            this.blockedRowViewModel = p2PControlListViewModel2;
            this.limitViewModel = p2PControlListViewModel3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApprovedContacts)) {
                return false;
            }
            ApprovedContacts approvedContacts = (ApprovedContacts) obj;
            return Intrinsics.areEqual(this.toolbarTitle, approvedContacts.toolbarTitle) && this.toggleViewModel.equals(approvedContacts.toggleViewModel) && this.approvedRowViewModel.equals(approvedContacts.approvedRowViewModel) && this.blockedRowViewModel.equals(approvedContacts.blockedRowViewModel) && Intrinsics.areEqual(this.limitViewModel, approvedContacts.limitViewModel);
        }

        @Override // com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final int hashCode() {
            int hashCode = (this.blockedRowViewModel.hashCode() + ((this.approvedRowViewModel.hashCode() + ((this.toggleViewModel.hashCode() + (this.toolbarTitle.hashCode() * 31)) * 31)) * 31)) * 31;
            P2PControlListViewModel p2PControlListViewModel = this.limitViewModel;
            return Boolean.hashCode(false) + ((hashCode + (p2PControlListViewModel == null ? 0 : p2PControlListViewModel.hashCode())) * 31);
        }

        public final String toString() {
            return "ApprovedContacts(toolbarTitle=" + this.toolbarTitle + ", toggleViewModel=" + this.toggleViewModel + ", approvedRowViewModel=" + this.approvedRowViewModel + ", blockedRowViewModel=" + this.blockedRowViewModel + ", limitViewModel=" + this.limitViewModel + ", isLoading=false)";
        }
    }

    public final class CashCardWithTags implements DependentControlViewModel {
        public final Toggle card;
        public final boolean isLoading;
        public final ArrayList tags;
        public final String toolbarTitle;

        public CashCardWithTags(String str, boolean z, Toggle toggle, ArrayList arrayList) {
            this.toolbarTitle = str;
            this.isLoading = z;
            this.card = toggle;
            this.tags = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashCardWithTags)) {
                return false;
            }
            CashCardWithTags cashCardWithTags = (CashCardWithTags) obj;
            return this.toolbarTitle.equals(cashCardWithTags.toolbarTitle) && this.isLoading == cashCardWithTags.isLoading && this.card.equals(cashCardWithTags.card) && this.tags.equals(cashCardWithTags.tags);
        }

        @Override // com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final int hashCode() {
            return this.tags.hashCode() + ((this.card.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toolbarTitle.hashCode() * 31, 31, this.isLoading)) * 31);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("CashCardWithTags(toolbarTitle=", this.toolbarTitle, ", isLoading=", ", card=", this.isLoading);
            m1540m.append(this.card);
            m1540m.append(", tags=");
            m1540m.append(this.tags);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public final class ManagedAccount implements DependentControlViewModel {
        public final String approvedContactsBody;
        public final String approvedContactsTitle;
        public final P2PControlListViewModel approvedRowViewModel;
        public final P2PControlListViewModel blockedRowViewModel;
        public final DependentControlsToggleViewModel cashCardToggleViewModel;
        public final P2PControlListViewModel cashSpendLimitViewModel;
        public final String cashTitle;
        public final String footerText;
        public final String toolbarTitle;

        public ManagedAccount(String str, String str2, String str3, P2PControlListViewModel p2PControlListViewModel, P2PControlListViewModel p2PControlListViewModel2, String str4, DependentControlsToggleViewModel dependentControlsToggleViewModel, P2PControlListViewModel p2PControlListViewModel3, String str5) {
            str.getClass();
            str2.getClass();
            this.toolbarTitle = str;
            this.approvedContactsTitle = str2;
            this.approvedContactsBody = str3;
            this.approvedRowViewModel = p2PControlListViewModel;
            this.blockedRowViewModel = p2PControlListViewModel2;
            this.cashTitle = str4;
            this.cashCardToggleViewModel = dependentControlsToggleViewModel;
            this.cashSpendLimitViewModel = p2PControlListViewModel3;
            this.footerText = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccount)) {
                return false;
            }
            ManagedAccount managedAccount = (ManagedAccount) obj;
            return Intrinsics.areEqual(this.toolbarTitle, managedAccount.toolbarTitle) && Intrinsics.areEqual(this.approvedContactsTitle, managedAccount.approvedContactsTitle) && this.approvedContactsBody.equals(managedAccount.approvedContactsBody) && this.approvedRowViewModel.equals(managedAccount.approvedRowViewModel) && this.blockedRowViewModel.equals(managedAccount.blockedRowViewModel) && Intrinsics.areEqual(this.cashTitle, managedAccount.cashTitle) && Intrinsics.areEqual(this.cashCardToggleViewModel, managedAccount.cashCardToggleViewModel) && Intrinsics.areEqual(this.cashSpendLimitViewModel, managedAccount.cashSpendLimitViewModel) && this.footerText.equals(managedAccount.footerText);
        }

        @Override // com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final int hashCode() {
            int hashCode = (this.blockedRowViewModel.hashCode() + ((this.approvedRowViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toolbarTitle.hashCode() * 31, 31, false), 31, this.approvedContactsTitle), 31, this.approvedContactsBody)) * 31)) * 31;
            String str = this.cashTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DependentControlsToggleViewModel dependentControlsToggleViewModel = this.cashCardToggleViewModel;
            int hashCode3 = (hashCode2 + (dependentControlsToggleViewModel == null ? 0 : dependentControlsToggleViewModel.hashCode())) * 31;
            P2PControlListViewModel p2PControlListViewModel = this.cashSpendLimitViewModel;
            return this.footerText.hashCode() + ((hashCode3 + (p2PControlListViewModel != null ? p2PControlListViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ManagedAccount(toolbarTitle=", this.toolbarTitle, ", isLoading=false, approvedContactsTitle=", this.approvedContactsTitle, ", approvedContactsBody=");
            m.append(this.approvedContactsBody);
            m.append(", approvedRowViewModel=");
            m.append(this.approvedRowViewModel);
            m.append(", blockedRowViewModel=");
            m.append(this.blockedRowViewModel);
            m.append(", cashTitle=");
            m.append(this.cashTitle);
            m.append(", cashCardToggleViewModel=");
            m.append(this.cashCardToggleViewModel);
            m.append(", cashSpendLimitViewModel=");
            m.append(this.cashSpendLimitViewModel);
            m.append(", footerText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.footerText, ")");
        }
    }

    public final class Toggle implements DependentControlViewModel {
        public final ControlType controlType;
        public final String footerText;
        public final boolean isLoading;
        public final DependentControlsLimitsViewModel limitsViewModel;
        public final String tagDeviceId;
        public final DependentControlsToggleViewModel toggleViewModel;
        public final String toolbarTitle;

        public Toggle(String str, ControlType controlType, DependentControlsToggleViewModel dependentControlsToggleViewModel, DependentControlsLimitsViewModel dependentControlsLimitsViewModel, boolean z, String str2, String str3) {
            str.getClass();
            this.toolbarTitle = str;
            this.controlType = controlType;
            this.toggleViewModel = dependentControlsToggleViewModel;
            this.limitsViewModel = dependentControlsLimitsViewModel;
            this.isLoading = z;
            this.footerText = str2;
            this.tagDeviceId = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) obj;
            return Intrinsics.areEqual(this.toolbarTitle, toggle.toolbarTitle) && this.controlType == toggle.controlType && Intrinsics.areEqual(this.toggleViewModel, toggle.toggleViewModel) && Intrinsics.areEqual(this.limitsViewModel, toggle.limitsViewModel) && this.isLoading == toggle.isLoading && Intrinsics.areEqual(this.footerText, toggle.footerText) && Intrinsics.areEqual(this.tagDeviceId, toggle.tagDeviceId);
        }

        @Override // com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final int hashCode() {
            int hashCode = (this.toggleViewModel.hashCode() + ((this.controlType.hashCode() + (this.toolbarTitle.hashCode() * 31)) * 31)) * 31;
            DependentControlsLimitsViewModel dependentControlsLimitsViewModel = this.limitsViewModel;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (dependentControlsLimitsViewModel == null ? 0 : dependentControlsLimitsViewModel.hashCode())) * 31, 31, this.isLoading);
            String str = this.footerText;
            int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tagDeviceId;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Toggle(toolbarTitle=");
            sb.append(this.toolbarTitle);
            sb.append(", controlType=");
            sb.append(this.controlType);
            sb.append(", toggleViewModel=");
            sb.append(this.toggleViewModel);
            sb.append(", limitsViewModel=");
            sb.append(this.limitsViewModel);
            sb.append(", isLoading=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.isLoading, ", footerText=", this.footerText, ", tagDeviceId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tagDeviceId, ")");
        }
    }

    String getToolbarTitle();
}
