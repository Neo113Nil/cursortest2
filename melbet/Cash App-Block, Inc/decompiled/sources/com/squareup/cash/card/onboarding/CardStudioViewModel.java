package com.squareup.cash.card.onboarding;

import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CardStudioViewModel {

    public final class Content implements CardStudioViewModel {
        public final CardTheme cardTheme;
        public final String cashtag;
        public final CustomizationDetails customizationDetails;
        public final CustomizationMode customizationMode;
        public final boolean displayScaleBar;
        public final boolean isShowingCashtag;
        public final boolean isShowingCashtagButton;
        public final boolean isShowingCustomization;
        public final boolean shownSquiggleBefore;

        public Content(String str, boolean z, boolean z2, boolean z3, CardTheme cardTheme, CustomizationDetails customizationDetails, CustomizationMode customizationMode, boolean z4, boolean z5) {
            this.cashtag = str;
            this.isShowingCashtag = z;
            this.isShowingCustomization = z2;
            this.isShowingCashtagButton = z3;
            this.cardTheme = cardTheme;
            this.customizationDetails = customizationDetails;
            this.customizationMode = customizationMode;
            this.displayScaleBar = z4;
            this.shownSquiggleBefore = z5;
        }

        public static Content copy$default(Content content, boolean z, CustomizationMode customizationMode, boolean z2, int i) {
            String str = content.cashtag;
            if ((i & 2) != 0) {
                z = content.isShowingCashtag;
            }
            boolean z3 = z;
            boolean z4 = content.isShowingCustomization;
            boolean z5 = content.isShowingCashtagButton;
            CardTheme cardTheme = content.cardTheme;
            CustomizationDetails customizationDetails = content.customizationDetails;
            if ((i & 128) != 0) {
                customizationMode = content.customizationMode;
            }
            CustomizationMode customizationMode2 = customizationMode;
            if ((i & 256) != 0) {
                z2 = content.displayScaleBar;
            }
            boolean z6 = z2;
            boolean z7 = (i & 512) != 0 ? content.shownSquiggleBefore : true;
            str.getClass();
            cardTheme.getClass();
            customizationMode2.getClass();
            return new Content(str, z3, z4, z5, cardTheme, customizationDetails, customizationMode2, z6, z7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.cashtag, content.cashtag) && this.isShowingCashtag == content.isShowingCashtag && this.isShowingCustomization == content.isShowingCustomization && this.isShowingCashtagButton == content.isShowingCashtagButton && Intrinsics.areEqual(this.cardTheme, content.cardTheme) && Intrinsics.areEqual(this.customizationDetails, content.customizationDetails) && Intrinsics.areEqual(this.customizationMode, content.customizationMode) && this.displayScaleBar == content.displayScaleBar && this.shownSquiggleBefore == content.shownSquiggleBefore;
        }

        public final int hashCode() {
            int hashCode = (this.cardTheme.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashtag.hashCode() * 31, 31, this.isShowingCashtag), 31, this.isShowingCustomization), 31, this.isShowingCashtagButton)) * 31;
            CustomizationDetails customizationDetails = this.customizationDetails;
            return Boolean.hashCode(this.shownSquiggleBefore) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.customizationMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (customizationDetails == null ? 0 : customizationDetails.hashCode())) * 31, 31, false)) * 31, 31, this.displayScaleBar);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Content(cashtag=", this.cashtag, ", isShowingCashtag=", ", isShowingCustomization=", this.isShowingCashtag);
            re$$ExternalSyntheticOutline0.m(m1540m, this.isShowingCustomization, ", isShowingCashtagButton=", this.isShowingCashtagButton, ", cardTheme=");
            m1540m.append(this.cardTheme);
            m1540m.append(", customizationDetails=");
            m1540m.append(this.customizationDetails);
            m1540m.append(", isMoodEffectEnabled=false, customizationMode=");
            m1540m.append(this.customizationMode);
            m1540m.append(", displayScaleBar=");
            m1540m.append(this.displayScaleBar);
            m1540m.append(", shownSquiggleBefore=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.shownSquiggleBefore, ")");
        }
    }

    public interface CustomizationMode {

        public final class DRAW implements CustomizationMode {
            public static final DRAW INSTANCE = new DRAW();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DRAW);
            }

            public final int hashCode() {
                return -1442879373;
            }

            public final String toString() {
                return "DRAW";
            }
        }

        public interface Pattern extends CustomizationMode {

            public final class DRAW implements Pattern {
                public static final DRAW INSTANCE = new DRAW();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof DRAW);
                }

                public final int hashCode() {
                    return 2007770417;
                }

                public final String toString() {
                    return "DRAW";
                }
            }

            public final class STAMP implements Pattern {
                public static final STAMP INSTANCE = new STAMP();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof STAMP);
                }

                public final int hashCode() {
                    return 2125252950;
                }

                public final String toString() {
                    return "STAMP";
                }
            }
        }

        public final class STAMP implements CustomizationMode {
            public static final STAMP INSTANCE = new STAMP();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof STAMP);
            }

            public final int hashCode() {
                return -1765675436;
            }

            public final String toString() {
                return "STAMP";
            }
        }
    }

    public final class Loading implements CardStudioViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 816577989;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
