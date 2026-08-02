package com.squareup.cash.family.familyhub.views;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentDetailToolbarModel {
    public final StackedAvatarViewModel avatarModel;
    public final String dependentName;
    public final boolean showQrCodeButton;

    public DependentDetailToolbarModel(String str, StackedAvatarViewModel.Single single, boolean z) {
        this.dependentName = str;
        this.avatarModel = single;
        this.showQrCodeButton = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentDetailToolbarModel)) {
            return false;
        }
        DependentDetailToolbarModel dependentDetailToolbarModel = (DependentDetailToolbarModel) obj;
        return this.dependentName.equals(dependentDetailToolbarModel.dependentName) && Intrinsics.areEqual(this.avatarModel, dependentDetailToolbarModel.avatarModel) && this.showQrCodeButton == dependentDetailToolbarModel.showQrCodeButton;
    }

    public final int hashCode() {
        int hashCode = this.dependentName.hashCode() * 31;
        StackedAvatarViewModel stackedAvatarViewModel = this.avatarModel;
        return Boolean.hashCode(this.showQrCodeButton) + ((hashCode + (stackedAvatarViewModel == null ? 0 : stackedAvatarViewModel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DependentDetailToolbarModel(dependentName=");
        sb.append(this.dependentName);
        sb.append(", avatarModel=");
        sb.append(this.avatarModel);
        sb.append(", showQrCodeButton=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showQrCodeButton, ")");
    }
}
