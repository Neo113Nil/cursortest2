package com.squareup.cash.card.onboarding;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CardPreviewViewModel {

    public final class Loading implements CardPreviewViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1750767265;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Preview implements CardPreviewViewModel {
        public final ColorModel accentColor;
        public final String appThemeInfo;
        public final Color appThemeInfoColorOverride;
        public final boolean available;
        public final StyledCardViewModel cardViewModel;
        public final String description;
        public final boolean disableFilament;
        public final boolean isPersonalizable;
        public final String order;
        public final String personalize;
        public final CardPresentationStyle presentationStyle;
        public final CardPreviewSheet sheet;
        public final String title;

        public Preview(String str, String str2, Color color, String str3, String str4, boolean z, String str5, StyledCardViewModel styledCardViewModel, boolean z2, ColorModel colorModel, CardPresentationStyle cardPresentationStyle, boolean z3, CardPreviewSheet cardPreviewSheet) {
            str.getClass();
            str3.getClass();
            str5.getClass();
            cardPresentationStyle.getClass();
            this.title = str;
            this.appThemeInfo = str2;
            this.appThemeInfoColorOverride = color;
            this.description = str3;
            this.personalize = str4;
            this.isPersonalizable = z;
            this.order = str5;
            this.cardViewModel = styledCardViewModel;
            this.available = z2;
            this.accentColor = colorModel;
            this.presentationStyle = cardPresentationStyle;
            this.disableFilament = z3;
            this.sheet = cardPreviewSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Preview)) {
                return false;
            }
            Preview preview = (Preview) obj;
            return Intrinsics.areEqual(this.title, preview.title) && Intrinsics.areEqual(this.appThemeInfo, preview.appThemeInfo) && Intrinsics.areEqual(this.appThemeInfoColorOverride, preview.appThemeInfoColorOverride) && Intrinsics.areEqual(this.description, preview.description) && Intrinsics.areEqual(this.personalize, preview.personalize) && this.isPersonalizable == preview.isPersonalizable && Intrinsics.areEqual(this.order, preview.order) && this.cardViewModel.equals(preview.cardViewModel) && this.available == preview.available && this.accentColor.equals(preview.accentColor) && this.presentationStyle == preview.presentationStyle && this.disableFilament == preview.disableFilament && Intrinsics.areEqual(this.sheet, preview.sheet);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.appThemeInfo;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Color color = this.appThemeInfoColorOverride;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (color == null ? 0 : color.hashCode())) * 31, 31, this.description);
            String str2 = this.personalize;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.presentationStyle.hashCode() + ((this.accentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.cardViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isPersonalizable), 31, this.order)) * 31, 31, this.available)) * 31)) * 31, 31, this.disableFilament);
            CardPreviewSheet cardPreviewSheet = this.sheet;
            return m2 + (cardPreviewSheet != null ? cardPreviewSheet.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Preview(title=", this.title, ", appThemeInfo=", this.appThemeInfo, ", appThemeInfoColorOverride=");
            m.append(this.appThemeInfoColorOverride);
            m.append(", description=");
            m.append(this.description);
            m.append(", personalize=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.personalize, ", isPersonalizable=", this.isPersonalizable, ", order=");
            m.append(this.order);
            m.append(", cardViewModel=");
            m.append(this.cardViewModel);
            m.append(", available=");
            m.append(this.available);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(", presentationStyle=");
            m.append(this.presentationStyle);
            m.append(", disableFilament=");
            m.append(this.disableFilament);
            m.append(", sheet=");
            m.append(this.sheet);
            m.append(")");
            return m.toString();
        }
    }

    public final class SubmittingDesign implements CardPreviewViewModel {
        public static final SubmittingDesign INSTANCE = new SubmittingDesign();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmittingDesign);
        }

        public final int hashCode() {
            return -1403837281;
        }

        public final String toString() {
            return "SubmittingDesign";
        }
    }
}
