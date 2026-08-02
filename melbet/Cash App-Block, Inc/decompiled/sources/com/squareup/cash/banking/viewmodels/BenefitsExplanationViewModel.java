package com.squareup.cash.banking.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BenefitsExplanationViewModel {
    public final ArrayList contents;
    public final List footers;
    public final String title;

    public final class BenefitsExplanationContent {
        public final List listItems;
        public final String text;

        public BenefitsExplanationContent(String str, List list) {
            str.getClass();
            list.getClass();
            this.text = str;
            this.listItems = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BenefitsExplanationContent)) {
                return false;
            }
            BenefitsExplanationContent benefitsExplanationContent = (BenefitsExplanationContent) obj;
            return Intrinsics.areEqual(this.text, benefitsExplanationContent.text) && Intrinsics.areEqual(this.listItems, benefitsExplanationContent.listItems);
        }

        public final int hashCode() {
            return this.listItems.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("BenefitsExplanationContent(text=", this.text, ", listItems=", ")", this.listItems);
        }
    }

    public BenefitsExplanationViewModel(String str, ArrayList arrayList, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.contents = arrayList;
        this.footers = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsExplanationViewModel)) {
            return false;
        }
        BenefitsExplanationViewModel benefitsExplanationViewModel = (BenefitsExplanationViewModel) obj;
        return Intrinsics.areEqual(this.title, benefitsExplanationViewModel.title) && this.contents.equals(benefitsExplanationViewModel.contents) && Intrinsics.areEqual(this.footers, benefitsExplanationViewModel.footers);
    }

    public final int hashCode() {
        return this.footers.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.contents, this.title.hashCode() * 31, 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.contents, "BenefitsExplanationViewModel(title=", this.title, ", contents=", ", footers="), this.footers, ")");
    }
}
