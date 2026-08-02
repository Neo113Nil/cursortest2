package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.protos.franklin.cards.TouchData;

/* loaded from: classes6.dex */
public interface CardStudioViewEventV2 {

    public final class ClearPendingClearAll implements CardStudioViewEventV2 {
        public static final ClearPendingClearAll INSTANCE = new ClearPendingClearAll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearPendingClearAll);
        }

        public final int hashCode() {
            return 1886115048;
        }

        public final String toString() {
            return "ClearPendingClearAll";
        }
    }

    public final class ClearPendingStampResult implements CardStudioViewEventV2 {
        public static final ClearPendingStampResult INSTANCE = new ClearPendingStampResult();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearPendingStampResult);
        }

        public final int hashCode() {
            return -983011220;
        }

        public final String toString() {
            return "ClearPendingStampResult";
        }
    }

    public final class DeleteAllCustomization implements CardStudioViewEventV2 {
        public final TouchData touchData;

        public DeleteAllCustomization(TouchData touchData) {
            this.touchData = touchData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteAllCustomization) && this.touchData.equals(((DeleteAllCustomization) obj).touchData);
        }

        public final int hashCode() {
            return this.touchData.hashCode();
        }

        public final String toString() {
            return "DeleteAllCustomization(touchData=" + this.touchData + ")";
        }
    }

    public final class DoneCustomizing implements CardStudioViewEventV2 {
        public final TouchData touchData;

        public DoneCustomizing(TouchData touchData) {
            this.touchData = touchData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoneCustomizing) && this.touchData.equals(((DoneCustomizing) obj).touchData);
        }

        public final int hashCode() {
            return this.touchData.hashCode();
        }

        public final String toString() {
            return "DoneCustomizing(touchData=" + this.touchData + ")";
        }
    }

    public final class Exit implements CardStudioViewEventV2 {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1270427976;
        }

        public final String toString() {
            return "Exit";
        }
    }

    /* loaded from: classes4.dex */
    public final class SetPatternDensity implements CardStudioViewEventV2 {
        public final CardStudioViewModelV2.PatternDensity density;

        public SetPatternDensity(CardStudioViewModelV2.PatternDensity patternDensity) {
            patternDensity.getClass();
            this.density = patternDensity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetPatternDensity) && this.density == ((SetPatternDensity) obj).density;
        }

        public final int hashCode() {
            return this.density.hashCode();
        }

        public final String toString() {
            return "SetPatternDensity(density=" + this.density + ")";
        }
    }

    public final class ShowExitDialog implements CardStudioViewEventV2 {
        public static final ShowExitDialog INSTANCE = new ShowExitDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowExitDialog);
        }

        public final int hashCode() {
            return 592936589;
        }

        public final String toString() {
            return "ShowExitDialog";
        }
    }

    public final class ShowMoreSheet implements CardStudioViewEventV2 {
        public static final ShowMoreSheet INSTANCE = new ShowMoreSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowMoreSheet);
        }

        public final int hashCode() {
            return 1691903907;
        }

        public final String toString() {
            return "ShowMoreSheet";
        }
    }

    public final class ShowStamps implements CardStudioViewEventV2 {
        public final CardStudioViewModelV2.CustomizationMode mode;

        public ShowStamps(CardStudioViewModelV2.CustomizationMode customizationMode) {
            this.mode = customizationMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowStamps) && this.mode.equals(((ShowStamps) obj).mode);
        }

        public final int hashCode() {
            return this.mode.hashCode();
        }

        public final String toString() {
            return "ShowStamps(mode=" + this.mode + ")";
        }
    }

    public final class UpdateTempCustomization implements CardStudioViewEventV2 {
        public final TouchData touchData;

        public UpdateTempCustomization(TouchData touchData) {
            this.touchData = touchData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTempCustomization) && this.touchData.equals(((UpdateTempCustomization) obj).touchData);
        }

        public final int hashCode() {
            return this.touchData.hashCode();
        }

        public final String toString() {
            return "UpdateTempCustomization(touchData=" + this.touchData + ")";
        }
    }
}
