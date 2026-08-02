package com.squareup.cash.payments.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class PersonalizePaymentEntrypointButtonViewModel {
    public final boolean animate;
    public final int animation;
    public final boolean enabled;
    public final boolean show;
    public final boolean showTooltip;

    public PersonalizePaymentEntrypointButtonViewModel(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.show = z;
        this.enabled = z2;
        this.showTooltip = z3;
        this.animate = z4;
        this.animation = i;
    }

    public static PersonalizePaymentEntrypointButtonViewModel copy$default(PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = personalizePaymentEntrypointButtonViewModel.show;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = personalizePaymentEntrypointButtonViewModel.enabled;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = personalizePaymentEntrypointButtonViewModel.showTooltip;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = personalizePaymentEntrypointButtonViewModel.animate;
        }
        int i2 = personalizePaymentEntrypointButtonViewModel.animation;
        personalizePaymentEntrypointButtonViewModel.getClass();
        return new PersonalizePaymentEntrypointButtonViewModel(i2, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizePaymentEntrypointButtonViewModel)) {
            return false;
        }
        PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = (PersonalizePaymentEntrypointButtonViewModel) obj;
        return this.show == personalizePaymentEntrypointButtonViewModel.show && this.enabled == personalizePaymentEntrypointButtonViewModel.enabled && this.showTooltip == personalizePaymentEntrypointButtonViewModel.showTooltip && this.animate == personalizePaymentEntrypointButtonViewModel.animate && this.animation == personalizePaymentEntrypointButtonViewModel.animation;
    }

    public final int hashCode() {
        return Integer.hashCode(this.animation) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.show) * 31, 31, this.enabled), 31, this.showTooltip), 31, this.animate);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PersonalizePaymentEntrypointButtonViewModel(show=", ", enabled=", ", showTooltip=", this.show, this.enabled);
        re$$ExternalSyntheticOutline0.m(m, this.showTooltip, ", animate=", this.animate, ", animation=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.animation, ")", m);
    }

    public final PersonalizePaymentEntrypointButtonViewModel updateState(boolean z, boolean z2, boolean z3, boolean z4) {
        return copy$default(this, false, z2, !z && z2 && z3, !z && z2 && z4, 17);
    }

    public /* synthetic */ PersonalizePaymentEntrypointButtonViewModel(boolean z, int i) {
        this(i, z, false, false, false);
    }
}
