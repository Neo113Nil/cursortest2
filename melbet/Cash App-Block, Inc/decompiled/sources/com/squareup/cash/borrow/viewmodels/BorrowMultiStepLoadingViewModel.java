package com.squareup.cash.borrow.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BorrowMultiStepLoadingViewModel {
    public final boolean canUserClose;
    public final int currentStepIndex;
    public final StackedAvatarViewModel stackedAvatar;
    public final List steps;
    public final String subtitle;
    public final String title;

    public BorrowMultiStepLoadingViewModel(StackedAvatarViewModel stackedAvatarViewModel, String str, String str2, List list, int i, boolean z) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.stackedAvatar = stackedAvatarViewModel;
        this.title = str;
        this.subtitle = str2;
        this.steps = list;
        this.currentStepIndex = i;
        this.canUserClose = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowMultiStepLoadingViewModel)) {
            return false;
        }
        BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel = (BorrowMultiStepLoadingViewModel) obj;
        return Intrinsics.areEqual(this.stackedAvatar, borrowMultiStepLoadingViewModel.stackedAvatar) && Intrinsics.areEqual(this.title, borrowMultiStepLoadingViewModel.title) && Intrinsics.areEqual(this.subtitle, borrowMultiStepLoadingViewModel.subtitle) && Intrinsics.areEqual(this.steps, borrowMultiStepLoadingViewModel.steps) && this.currentStepIndex == borrowMultiStepLoadingViewModel.currentStepIndex && this.canUserClose == borrowMultiStepLoadingViewModel.canUserClose;
    }

    public final int hashCode() {
        StackedAvatarViewModel stackedAvatarViewModel = this.stackedAvatar;
        return Boolean.hashCode(this.canUserClose) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentStepIndex, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((stackedAvatarViewModel == null ? 0 : stackedAvatarViewModel.hashCode()) * 31, 31, this.title), 31, this.subtitle), 31, this.steps), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorrowMultiStepLoadingViewModel(stackedAvatar=");
        sb.append(this.stackedAvatar);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        NavAction$$ExternalSyntheticOutline0.m(this.subtitle, ", steps=", ", currentStepIndex=", sb, this.steps);
        sb.append(this.currentStepIndex);
        sb.append(", canUserClose=");
        sb.append(this.canUserClose);
        sb.append(")");
        return sb.toString();
    }
}
