package com.squareup.cash.passkeys.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PasskeyUpsellViewModel {
    public final String detailText;
    public final String headerText;
    public final Icon icon;
    public final boolean isRegistering;
    public final boolean skippable;

    public PasskeyUpsellViewModel(String str, String str2, boolean z, boolean z2, Icon icon) {
        this.headerText = str;
        this.detailText = str2;
        this.isRegistering = z;
        this.skippable = z2;
        this.icon = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyUpsellViewModel)) {
            return false;
        }
        PasskeyUpsellViewModel passkeyUpsellViewModel = (PasskeyUpsellViewModel) obj;
        return this.headerText.equals(passkeyUpsellViewModel.headerText) && this.detailText.equals(passkeyUpsellViewModel.detailText) && this.isRegistering == passkeyUpsellViewModel.isRegistering && this.skippable == passkeyUpsellViewModel.skippable && Intrinsics.areEqual(this.icon, passkeyUpsellViewModel.icon);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerText.hashCode() * 31, 31, this.detailText), 31, this.isRegistering), 31, this.skippable);
        Icon icon = this.icon;
        return m + (icon == null ? 0 : icon.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PasskeyUpsellViewModel(headerText=", this.headerText, ", detailText=", this.detailText, ", isRegistering=");
        re$$ExternalSyntheticOutline0.m(m, this.isRegistering, ", skippable=", this.skippable, ", icon=");
        m.append(this.icon);
        m.append(")");
        return m.toString();
    }
}
