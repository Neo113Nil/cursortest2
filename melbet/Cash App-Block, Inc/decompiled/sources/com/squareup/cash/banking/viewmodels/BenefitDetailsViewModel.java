package com.squareup.cash.banking.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitDetailsViewModel {
    public final UiAvatar avatar;
    public final List contents;
    public final List disclaimers;
    public final String title;

    public BenefitDetailsViewModel(UiAvatar uiAvatar, String str, List list, List list2) {
        uiAvatar.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        this.avatar = uiAvatar;
        this.title = str;
        this.contents = list;
        this.disclaimers = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitDetailsViewModel)) {
            return false;
        }
        BenefitDetailsViewModel benefitDetailsViewModel = (BenefitDetailsViewModel) obj;
        return Intrinsics.areEqual(this.avatar, benefitDetailsViewModel.avatar) && Intrinsics.areEqual(this.title, benefitDetailsViewModel.title) && Intrinsics.areEqual(this.contents, benefitDetailsViewModel.contents) && Intrinsics.areEqual(this.disclaimers, benefitDetailsViewModel.disclaimers);
    }

    public final int hashCode() {
        return this.disclaimers.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.title), 31, this.contents);
    }

    public final String toString() {
        return "BenefitDetailsViewModel(avatar=" + this.avatar + ", title=" + this.title + ", contents=" + this.contents + ", disclaimers=" + this.disclaimers + ")";
    }
}
