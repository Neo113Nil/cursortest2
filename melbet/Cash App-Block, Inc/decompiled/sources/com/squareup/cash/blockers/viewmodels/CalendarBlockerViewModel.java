package com.squareup.cash.blockers.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface CalendarBlockerViewModel {

    /* loaded from: classes5.dex */
    public final class Loaded implements CalendarBlockerViewModel {
        public final boolean buttonEnabled;
        public final String buttonText;
        public final boolean calendarEnabled;
        public final LocalDate endDate;
        public final LocalDate selectedDate;
        public final LocalDate startDate;
        public final String title;
        public final LocalDate today;
        public final Toggle toggle;
        public final ToolbarButton toolbarButton;

        public final class Toggle {
            public final String text;
            public final boolean toggledOn;

            public Toggle(String str, boolean z) {
                str.getClass();
                this.text = str;
                this.toggledOn = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Toggle)) {
                    return false;
                }
                Toggle toggle = (Toggle) obj;
                return Intrinsics.areEqual(this.text, toggle.text) && this.toggledOn == toggle.toggledOn;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.toggledOn) + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Toggle(text=", this.text, ", toggledOn=", ")", this.toggledOn);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public final class ToolbarButton {
            public static final /* synthetic */ ToolbarButton[] $VALUES;
            public static final ToolbarButton Back;
            public static final ToolbarButton Close;

            static {
                ToolbarButton toolbarButton = new ToolbarButton(Constants.META_BACK_BUTTON, 0);
                Back = toolbarButton;
                ToolbarButton toolbarButton2 = new ToolbarButton(Constants.META_CLOSE, 1);
                Close = toolbarButton2;
                $VALUES = new ToolbarButton[]{toolbarButton, toolbarButton2};
            }

            public static ToolbarButton valueOf(String str) {
                return (ToolbarButton) Enum.valueOf(ToolbarButton.class, str);
            }

            public static ToolbarButton[] values() {
                return (ToolbarButton[]) $VALUES.clone();
            }
        }

        public Loaded(Toggle toggle, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, String str, String str2, boolean z, ToolbarButton toolbarButton, boolean z2) {
            localDate2.getClass();
            localDate3.getClass();
            localDate4.getClass();
            str.getClass();
            str2.getClass();
            this.toggle = toggle;
            this.selectedDate = localDate;
            this.startDate = localDate2;
            this.endDate = localDate3;
            this.today = localDate4;
            this.title = str;
            this.buttonText = str2;
            this.buttonEnabled = z;
            this.toolbarButton = toolbarButton;
            this.calendarEnabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.toggle, loaded.toggle) && Intrinsics.areEqual(this.selectedDate, loaded.selectedDate) && Intrinsics.areEqual(this.startDate, loaded.startDate) && Intrinsics.areEqual(this.endDate, loaded.endDate) && Intrinsics.areEqual(this.today, loaded.today) && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.buttonText, loaded.buttonText) && this.buttonEnabled == loaded.buttonEnabled && this.toolbarButton == loaded.toolbarButton && this.calendarEnabled == loaded.calendarEnabled;
        }

        public final int hashCode() {
            Toggle toggle = this.toggle;
            int hashCode = (toggle == null ? 0 : toggle.hashCode()) * 31;
            LocalDate localDate = this.selectedDate;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.today.hashCode() + ((this.endDate.hashCode() + ((this.startDate.hashCode() + ((hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.title), 31, this.buttonText), 31, this.buttonEnabled);
            ToolbarButton toolbarButton = this.toolbarButton;
            return Boolean.hashCode(this.calendarEnabled) + ((m + (toolbarButton != null ? toolbarButton.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(toggle=");
            sb.append(this.toggle);
            sb.append(", selectedDate=");
            sb.append(this.selectedDate);
            sb.append(", startDate=");
            sb.append(this.startDate);
            sb.append(", endDate=");
            sb.append(this.endDate);
            sb.append(", today=");
            sb.append(this.today);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", buttonText=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.buttonText, ", buttonEnabled=", this.buttonEnabled, ", toolbarButton=");
            sb.append(this.toolbarButton);
            sb.append(", calendarEnabled=");
            sb.append(this.calendarEnabled);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Loading implements CalendarBlockerViewModel {
        public final AnimationDirection animationDirection;

        public Loading(AnimationDirection animationDirection) {
            this.animationDirection = animationDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.animationDirection == ((Loading) obj).animationDirection;
        }

        public final int hashCode() {
            return this.animationDirection.hashCode();
        }

        public final String toString() {
            return "Loading(animationDirection=" + this.animationDirection + ")";
        }
    }
}
