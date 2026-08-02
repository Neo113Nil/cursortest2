package com.squareup.cash.card.onboarding;

import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CardStudioViewModelV2 {

    public interface CustomizationMode {

        public final class DEFAULT implements CustomizationMode {
            public static final DEFAULT INSTANCE = new DEFAULT();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DEFAULT);
            }

            public final int hashCode() {
                return -1041989010;
            }

            public final String toString() {
                return "DEFAULT";
            }
        }

        public final class DRAW implements CustomizationMode {
            public static final DRAW INSTANCE = new DRAW();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DRAW);
            }

            public final int hashCode() {
                return -1669943273;
            }

            public final String toString() {
                return "DRAW";
            }
        }

        public final class STAMP implements CustomizationMode {
            public static final STAMP INSTANCE = new STAMP();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof STAMP);
            }

            public final int hashCode() {
                return -214721744;
            }

            public final String toString() {
                return "STAMP";
            }
        }
    }

    public final class Loading implements CardStudioViewModelV2 {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 761979553;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PatternDensity {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ PatternDensity[] $VALUES;
        public static final PatternDensity MEDIUM;
        public final int cols;
        public final int rows;

        static {
            PatternDensity patternDensity = new PatternDensity("SPARSE", 0, 5, 3);
            PatternDensity patternDensity2 = new PatternDensity("MEDIUM", 1, 7, 4);
            MEDIUM = patternDensity2;
            PatternDensity[] patternDensityArr = {patternDensity, patternDensity2, new PatternDensity("DENSE", 2, 8, 5)};
            $VALUES = patternDensityArr;
            $ENTRIES = new EnumEntriesList(patternDensityArr);
        }

        public PatternDensity(String str, int i, int i2, int i3) {
            this.rows = i2;
            this.cols = i3;
        }

        public static PatternDensity valueOf(String str) {
            return (PatternDensity) Enum.valueOf(PatternDensity.class, str);
        }

        public static PatternDensity[] values() {
            return (PatternDensity[]) $VALUES.clone();
        }
    }

    public final class Content implements CardStudioViewModelV2 {
        public final CardTheme cardTheme;
        public final String cashtag;
        public final CustomizationDetails customizationDetails;
        public final CustomizationMode customizationMode;
        public final boolean isShowingCashtag;
        public final boolean isShowingCashtagToggle;
        public final boolean isShowingCustomization;
        public final Orientation orientation;
        public final PatternDensity patternDensity;
        public final boolean pendingClearAll;
        public final StampResult pendingStampResult;

        public Content(String str, boolean z, boolean z2, boolean z3, CardTheme cardTheme, CustomizationDetails customizationDetails, CustomizationMode customizationMode, Orientation orientation, PatternDensity patternDensity, StampResult stampResult, boolean z4) {
            cardTheme.getClass();
            customizationMode.getClass();
            orientation.getClass();
            this.cashtag = str;
            this.isShowingCashtag = z;
            this.isShowingCashtagToggle = z2;
            this.isShowingCustomization = z3;
            this.cardTheme = cardTheme;
            this.customizationDetails = customizationDetails;
            this.customizationMode = customizationMode;
            this.orientation = orientation;
            this.patternDensity = patternDensity;
            this.pendingStampResult = stampResult;
            this.pendingClearAll = z4;
        }

        public static Content copy$default(Content content, boolean z, CardTheme cardTheme, CustomizationMode customizationMode, Orientation orientation, PatternDensity patternDensity, StampResult stampResult, boolean z2, int i) {
            String str = content.cashtag;
            if ((i & 2) != 0) {
                z = content.isShowingCashtag;
            }
            boolean z3 = z;
            boolean z4 = content.isShowingCashtagToggle;
            boolean z5 = content.isShowingCustomization;
            if ((i & 16) != 0) {
                cardTheme = content.cardTheme;
            }
            CardTheme cardTheme2 = cardTheme;
            CustomizationDetails customizationDetails = content.customizationDetails;
            CustomizationMode customizationMode2 = (i & 64) != 0 ? content.customizationMode : customizationMode;
            Orientation orientation2 = (i & 128) != 0 ? content.orientation : orientation;
            PatternDensity patternDensity2 = (i & 256) != 0 ? content.patternDensity : patternDensity;
            StampResult stampResult2 = (i & 512) != 0 ? content.pendingStampResult : stampResult;
            boolean z6 = (i & 1024) != 0 ? content.pendingClearAll : z2;
            content.getClass();
            str.getClass();
            cardTheme2.getClass();
            customizationMode2.getClass();
            orientation2.getClass();
            patternDensity2.getClass();
            return new Content(str, z3, z4, z5, cardTheme2, customizationDetails, customizationMode2, orientation2, patternDensity2, stampResult2, z6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.cashtag, content.cashtag) && this.isShowingCashtag == content.isShowingCashtag && this.isShowingCashtagToggle == content.isShowingCashtagToggle && this.isShowingCustomization == content.isShowingCustomization && Intrinsics.areEqual(this.cardTheme, content.cardTheme) && Intrinsics.areEqual(this.customizationDetails, content.customizationDetails) && Intrinsics.areEqual(this.customizationMode, content.customizationMode) && this.orientation == content.orientation && this.patternDensity == content.patternDensity && Intrinsics.areEqual(this.pendingStampResult, content.pendingStampResult) && this.pendingClearAll == content.pendingClearAll;
        }

        public final int hashCode() {
            int hashCode = (this.cardTheme.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashtag.hashCode() * 31, 31, this.isShowingCashtag), 31, this.isShowingCashtagToggle), 31, this.isShowingCustomization)) * 31;
            CustomizationDetails customizationDetails = this.customizationDetails;
            int hashCode2 = (this.patternDensity.hashCode() + ((this.orientation.hashCode() + ((this.customizationMode.hashCode() + ((hashCode + (customizationDetails == null ? 0 : customizationDetails.hashCode())) * 31)) * 31)) * 31)) * 31;
            StampResult stampResult = this.pendingStampResult;
            return Boolean.hashCode(this.pendingClearAll) + ((hashCode2 + (stampResult != null ? stampResult.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Content(cashtag=", this.cashtag, ", isShowingCashtag=", ", isShowingCashtagToggle=", this.isShowingCashtag);
            re$$ExternalSyntheticOutline0.m(m1540m, this.isShowingCashtagToggle, ", isShowingCustomization=", this.isShowingCustomization, ", cardTheme=");
            m1540m.append(this.cardTheme);
            m1540m.append(", customizationDetails=");
            m1540m.append(this.customizationDetails);
            m1540m.append(", customizationMode=");
            m1540m.append(this.customizationMode);
            m1540m.append(", orientation=");
            m1540m.append(this.orientation);
            m1540m.append(", patternDensity=");
            m1540m.append(this.patternDensity);
            m1540m.append(", pendingStampResult=");
            m1540m.append(this.pendingStampResult);
            m1540m.append(", pendingClearAll=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.pendingClearAll, ")");
        }

        public /* synthetic */ Content(String str, boolean z, boolean z2, boolean z3, CardTheme cardTheme, CustomizationDetails customizationDetails, Orientation orientation, int i) {
            this(str, z, z2, z3, cardTheme, customizationDetails, CustomizationMode.DEFAULT.INSTANCE, (i & 128) != 0 ? Orientation.PORTRAIT : orientation, PatternDensity.MEDIUM, null, false);
        }
    }
}
