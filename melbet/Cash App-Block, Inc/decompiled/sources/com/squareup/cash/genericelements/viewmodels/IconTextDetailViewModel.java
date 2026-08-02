package com.squareup.cash.genericelements.viewmodels;

import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class IconTextDetailViewModel extends GenericBaseViewModel {
    public final Alignment alignment;
    public final IconViewModel.ImageViewModel icon;
    public final GenericBaseViewModel.TextViewModel text;

    public IconTextDetailViewModel(IconViewModel.ImageViewModel imageViewModel, GenericBaseViewModel.TextViewModel textViewModel) {
        Alignment alignment = Alignment.LEFT;
        this.icon = imageViewModel;
        this.text = textViewModel;
        this.alignment = alignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconTextDetailViewModel)) {
            return false;
        }
        IconTextDetailViewModel iconTextDetailViewModel = (IconTextDetailViewModel) obj;
        return Intrinsics.areEqual(this.icon, iconTextDetailViewModel.icon) && Intrinsics.areEqual(this.text, iconTextDetailViewModel.text) && this.alignment == iconTextDetailViewModel.alignment;
    }

    @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final int hashCode() {
        return this.alignment.hashCode() + ((this.text.hashCode() + (this.icon.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IconTextDetailViewModel(icon=" + this.icon + ", text=" + this.text + ", alignment=" + this.alignment + ")";
    }
}
