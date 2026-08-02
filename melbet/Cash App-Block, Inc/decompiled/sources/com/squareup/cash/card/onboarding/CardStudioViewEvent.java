package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.cdf.Event;
import com.squareup.protos.franklin.cards.TouchData;

/* loaded from: classes6.dex */
public interface CardStudioViewEvent {

    public final class DoneCustomizing implements CardStudioViewEvent {
        public final TouchData touchData;

        public DoneCustomizing(TouchData touchData) {
            this.touchData = touchData;
        }
    }

    public final class EnterPatternCustomizationMode implements CardStudioViewEvent {
        public static final EnterPatternCustomizationMode INSTANCE = new EnterPatternCustomizationMode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterPatternCustomizationMode);
        }

        public final int hashCode() {
            return -2014512936;
        }

        public final String toString() {
            return "EnterPatternCustomizationMode";
        }
    }

    public final class Exit implements CardStudioViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1831626652;
        }

        public final String toString() {
            return "Exit";
        }
    }

    /* loaded from: classes4.dex */
    public final class ExitPatternCustomizationMode implements CardStudioViewEvent {
        public final float patternDensity;
        public final int uniqueStamps;
        public final int uniqueStrokes;

        public ExitPatternCustomizationMode(float f, int i, int i2) {
            this.patternDensity = f;
            this.uniqueStrokes = i;
            this.uniqueStamps = i2;
        }
    }

    /* loaded from: classes4.dex */
    public final class LogViewOnlyEvent implements CardStudioViewEvent {
        public final Event event;

        public LogViewOnlyEvent(Event event) {
            this.event = event;
        }
    }

    public final class SetCustomizationMode implements CardStudioViewEvent {
        public final CardStudioViewModel.CustomizationMode mode;

        public SetCustomizationMode(CardStudioViewModel.CustomizationMode customizationMode) {
            this.mode = customizationMode;
        }
    }

    /* loaded from: classes4.dex */
    public final class ShowExitDialog implements CardStudioViewEvent {
        public static final ShowExitDialog INSTANCE = new ShowExitDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowExitDialog);
        }

        public final int hashCode() {
            return 518042281;
        }

        public final String toString() {
            return "ShowExitDialog";
        }
    }

    public final class ShowStamps implements CardStudioViewEvent {
        public final CardStudioViewModel.CustomizationMode mode;

        public ShowStamps(CardStudioViewModel.CustomizationMode customizationMode) {
            customizationMode.getClass();
            this.mode = customizationMode;
        }
    }

    public final class ShowUndoDialog implements CardStudioViewEvent {
        public static final ShowUndoDialog INSTANCE = new ShowUndoDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowUndoDialog);
        }

        public final int hashCode() {
            return -1998166545;
        }

        public final String toString() {
            return "ShowUndoDialog";
        }
    }

    public final class ToggleCashtagVisibility implements CardStudioViewEvent {
        public static final ToggleCashtagVisibility INSTANCE = new ToggleCashtagVisibility();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleCashtagVisibility);
        }

        public final int hashCode() {
            return 145148927;
        }

        public final String toString() {
            return "ToggleCashtagVisibility";
        }
    }

    /* loaded from: classes4.dex */
    public final class ToggleScaleBar implements CardStudioViewEvent {
        public final boolean forceHidden;

        public ToggleScaleBar(boolean z) {
            this.forceHidden = z;
        }
    }

    public final class UpdateTempCustomization implements CardStudioViewEvent {
        public final TouchData touchData;

        public UpdateTempCustomization(TouchData touchData) {
            this.touchData = touchData;
        }
    }
}
