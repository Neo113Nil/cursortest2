package com.squareup.cash.card.onboarding;

import com.squareup.cash.wallet.data.TagFormFactor;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TagOrderConfirmationViewModel {
    public final String buttonTitle;
    public final Style style;
    public final String subtitle;
    public final TagFormFactor tagFormFactor;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style FAILURE;
        public static final Style SUCCESS;

        static {
            Style style = new Style("SUCCESS", 0);
            SUCCESS = style;
            Style style2 = new Style("FAILURE", 1);
            FAILURE = style2;
            $VALUES = new Style[]{style, style2};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public TagOrderConfirmationViewModel(String str, String str2, String str3, Style style, TagFormFactor tagFormFactor) {
        str3.getClass();
        this.title = str;
        this.subtitle = str2;
        this.buttonTitle = str3;
        this.style = style;
        this.tagFormFactor = tagFormFactor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagOrderConfirmationViewModel)) {
            return false;
        }
        TagOrderConfirmationViewModel tagOrderConfirmationViewModel = (TagOrderConfirmationViewModel) obj;
        return this.title.equals(tagOrderConfirmationViewModel.title) && this.subtitle.equals(tagOrderConfirmationViewModel.subtitle) && Intrinsics.areEqual(this.buttonTitle, tagOrderConfirmationViewModel.buttonTitle) && this.style == tagOrderConfirmationViewModel.style && this.tagFormFactor == tagOrderConfirmationViewModel.tagFormFactor;
    }

    public final int hashCode() {
        int hashCode = (this.style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.buttonTitle)) * 31;
        TagFormFactor tagFormFactor = this.tagFormFactor;
        return hashCode + (tagFormFactor == null ? 0 : tagFormFactor.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TagOrderConfirmationViewModel(title=", this.title, ", subtitle=", this.subtitle, ", buttonTitle=");
        m.append(this.buttonTitle);
        m.append(", style=");
        m.append(this.style);
        m.append(", tagFormFactor=");
        m.append(this.tagFormFactor);
        m.append(")");
        return m.toString();
    }
}
