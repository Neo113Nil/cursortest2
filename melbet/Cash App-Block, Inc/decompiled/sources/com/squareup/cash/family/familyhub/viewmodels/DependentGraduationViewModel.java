package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentGraduationViewModel {
    public final String buttonText;
    public final Image image;
    public final String subtitle;
    public final String title;

    public DependentGraduationViewModel(Image image, String str, String str2, String str3) {
        this.image = image;
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentGraduationViewModel)) {
            return false;
        }
        DependentGraduationViewModel dependentGraduationViewModel = (DependentGraduationViewModel) obj;
        return Intrinsics.areEqual(this.image, dependentGraduationViewModel.image) && this.title.equals(dependentGraduationViewModel.title) && this.subtitle.equals(dependentGraduationViewModel.subtitle) && this.buttonText.equals(dependentGraduationViewModel.buttonText);
    }

    public final int hashCode() {
        Image image = this.image;
        return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title), 31, this.subtitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "DependentGraduationViewModel(image=", ", title=", this.title, ", subtitle="), this.subtitle, ", buttonText=", this.buttonText, ")");
    }
}
