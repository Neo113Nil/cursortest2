package com.squareup.cash.growtools.viewmodels.manager;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface GrowToolsManagerViewEvent {

    public final class ActivityShowMoreTapped implements GrowToolsManagerViewEvent {
        public static final ActivityShowMoreTapped INSTANCE = new ActivityShowMoreTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivityShowMoreTapped);
        }

        public final int hashCode() {
            return -1503520781;
        }

        public final String toString() {
            return "ActivityShowMoreTapped";
        }
    }

    public final class Back implements GrowToolsManagerViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1530336333;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class ChangeButtonTapped implements GrowToolsManagerViewEvent {
        public static final ChangeButtonTapped INSTANCE = new ChangeButtonTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeButtonTapped);
        }

        public final int hashCode() {
            return -1696295660;
        }

        public final String toString() {
            return "ChangeButtonTapped";
        }
    }

    public final class DetailRowTapped implements GrowToolsManagerViewEvent {
        public final int index;

        public DetailRowTapped(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DetailRowTapped) && this.index == ((DetailRowTapped) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "DetailRowTapped(index=", ")");
        }
    }

    public final class DialogConfirmTapped implements GrowToolsManagerViewEvent {
        public static final DialogConfirmTapped INSTANCE = new DialogConfirmTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogConfirmTapped);
        }

        public final int hashCode() {
            return 1136258270;
        }

        public final String toString() {
            return "DialogConfirmTapped";
        }
    }

    public final class DialogDismissTapped implements GrowToolsManagerViewEvent {
        public final boolean isError;

        public DialogDismissTapped(boolean z) {
            this.isError = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DialogDismissTapped) && this.isError == ((DialogDismissTapped) obj).isError;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isError);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("DialogDismissTapped(isError=", ")", this.isError);
        }
    }

    public final class TargetAvatarTapped implements GrowToolsManagerViewEvent {
        public static final TargetAvatarTapped INSTANCE = new TargetAvatarTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TargetAvatarTapped);
        }

        public final int hashCode() {
            return -1063695780;
        }

        public final String toString() {
            return "TargetAvatarTapped";
        }
    }

    public final class ToggleTapped implements GrowToolsManagerViewEvent {
        public final boolean isChecked;

        public ToggleTapped(boolean z) {
            this.isChecked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleTapped) && this.isChecked == ((ToggleTapped) obj).isChecked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleTapped(isChecked=", ")", this.isChecked);
        }
    }
}
