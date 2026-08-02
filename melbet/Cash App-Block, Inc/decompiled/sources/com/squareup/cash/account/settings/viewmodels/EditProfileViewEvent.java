package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface EditProfileViewEvent {

    public final class AddPhotoClick implements EditProfileViewEvent {
        public static final AddPhotoClick INSTANCE = new AddPhotoClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddPhotoClick);
        }

        public final int hashCode() {
            return 555561414;
        }

        public final String toString() {
            return "AddPhotoClick";
        }
    }

    public final class BackClicked implements EditProfileViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 331453647;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class BioClicked implements EditProfileViewEvent {
        public static final BioClicked INSTANCE = new BioClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BioClicked);
        }

        public final int hashCode() {
            return 1230426256;
        }

        public final String toString() {
            return "BioClicked";
        }
    }

    public final class BusinessProfileClicked implements EditProfileViewEvent {
        public final boolean isBusiness;

        public BusinessProfileClicked(boolean z) {
            this.isBusiness = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BusinessProfileClicked) && this.isBusiness == ((BusinessProfileClicked) obj).isBusiness;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isBusiness);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("BusinessProfileClicked(isBusiness=", ")", this.isBusiness);
        }
    }

    public final class CashtagClicked implements EditProfileViewEvent {
        public static final CashtagClicked INSTANCE = new CashtagClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CashtagClicked);
        }

        public final int hashCode() {
            return -1559196495;
        }

        public final String toString() {
            return "CashtagClicked";
        }
    }

    public final class FullNameClicked implements EditProfileViewEvent {
        public final boolean showBusinessName;

        public FullNameClicked(boolean z) {
            this.showBusinessName = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FullNameClicked) && this.showBusinessName == ((FullNameClicked) obj).showBusinessName;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showBusinessName);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("FullNameClicked(showBusinessName=", ")", this.showBusinessName);
        }
    }

    public final class OnCloseUpdateNameDialog implements EditProfileViewEvent {
        public static final OnCloseUpdateNameDialog INSTANCE = new OnCloseUpdateNameDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseUpdateNameDialog);
        }

        public final int hashCode() {
            return -1559545884;
        }

        public final String toString() {
            return "OnCloseUpdateNameDialog";
        }
    }

    public final class OnDialogResult implements EditProfileViewEvent {
        public final Object result;
        public final Screen screen;

        public OnDialogResult(Screen screen, Object obj) {
            screen.getClass();
            this.screen = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogResult)) {
                return false;
            }
            OnDialogResult onDialogResult = (OnDialogResult) obj;
            return Intrinsics.areEqual(this.screen, onDialogResult.screen) && Intrinsics.areEqual(this.result, onDialogResult.result);
        }

        public final int hashCode() {
            int hashCode = this.screen.hashCode() * 31;
            Object obj = this.result;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "OnDialogResult(screen=" + this.screen + ", result=" + this.result + ")";
        }
    }

    public final class ViewModeToggled implements EditProfileViewEvent {
        public final ViewMode mode;

        public ViewModeToggled(ViewMode viewMode) {
            viewMode.getClass();
            this.mode = viewMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewModeToggled) && this.mode == ((ViewModeToggled) obj).mode;
        }

        public final int hashCode() {
            return this.mode.hashCode();
        }

        public final String toString() {
            return "ViewModeToggled(mode=" + this.mode + ")";
        }
    }
}
