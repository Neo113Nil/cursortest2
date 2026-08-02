package app.cash.local.presenters.brand.profile;

import app.cash.local.viewmodels.LocalBottomModalViewModel;

/* loaded from: classes3.dex */
public final class ProfileBottomModal {
    public final ProfileBottomModalAction action;
    public final LocalBottomModalViewModel model;

    public ProfileBottomModal(LocalBottomModalViewModel localBottomModalViewModel, ProfileBottomModalAction profileBottomModalAction) {
        this.model = localBottomModalViewModel;
        this.action = profileBottomModalAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBottomModal)) {
            return false;
        }
        ProfileBottomModal profileBottomModal = (ProfileBottomModal) obj;
        return this.model.equals(profileBottomModal.model) && this.action.equals(profileBottomModal.action);
    }

    public final ProfileBottomModalAction getAction() {
        return this.action;
    }

    public final LocalBottomModalViewModel getModel() {
        return this.model;
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.model.hashCode() * 31);
    }

    public final String toString() {
        return "ProfileBottomModal(model=" + this.model + ", action=" + this.action + ")";
    }
}
