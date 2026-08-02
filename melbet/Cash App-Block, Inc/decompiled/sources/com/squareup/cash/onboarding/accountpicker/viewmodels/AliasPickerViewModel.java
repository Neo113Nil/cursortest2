package com.squareup.cash.onboarding.accountpicker.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AliasPickerViewModel {
    public final List accountAliases;
    public final String headerText;
    public final boolean isLoading;
    public final String preSelectedAliasId;

    public AliasPickerViewModel(String str, String str2, List list, boolean z) {
        list.getClass();
        str2.getClass();
        this.headerText = str;
        this.accountAliases = list;
        this.preSelectedAliasId = str2;
        this.isLoading = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasPickerViewModel)) {
            return false;
        }
        AliasPickerViewModel aliasPickerViewModel = (AliasPickerViewModel) obj;
        return this.headerText.equals(aliasPickerViewModel.headerText) && Intrinsics.areEqual(this.accountAliases, aliasPickerViewModel.accountAliases) && Intrinsics.areEqual(this.preSelectedAliasId, aliasPickerViewModel.preSelectedAliasId) && this.isLoading == aliasPickerViewModel.isLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoading) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.headerText.hashCode() * 31, 31, this.accountAliases), 31, this.preSelectedAliasId);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("AliasPickerViewModel(headerText=", this.headerText, ", accountAliases=", ", preSelectedAliasId=", this.accountAliases), this.preSelectedAliasId, ", isLoading=", this.isLoading, ")");
    }
}
