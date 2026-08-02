package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentDetailIntroductionViewModel {
    public final String closeButtonText;
    public final Image image;
    public final String message;
    public final String title;

    public DependentDetailIntroductionViewModel(Image image, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        image.getClass();
        this.title = str;
        this.message = str2;
        this.closeButtonText = str3;
        this.image = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentDetailIntroductionViewModel)) {
            return false;
        }
        DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel = (DependentDetailIntroductionViewModel) obj;
        return Intrinsics.areEqual(this.title, dependentDetailIntroductionViewModel.title) && Intrinsics.areEqual(this.message, dependentDetailIntroductionViewModel.message) && Intrinsics.areEqual(this.closeButtonText, dependentDetailIntroductionViewModel.closeButtonText) && Intrinsics.areEqual(this.image, dependentDetailIntroductionViewModel.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.closeButtonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentDetailIntroductionViewModel(title=", this.title, ", message=", this.message, ", closeButtonText=");
        m.append(this.closeButtonText);
        m.append(", image=");
        m.append(this.image);
        m.append(")");
        return m.toString();
    }
}
