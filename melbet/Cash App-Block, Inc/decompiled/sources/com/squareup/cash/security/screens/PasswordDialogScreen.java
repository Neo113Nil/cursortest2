package com.squareup.cash.security.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.screens.BoostDetailsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PasswordDialogScreen implements Screen, DialogScreen {
    public static final Parcelable.Creator<PasswordDialogScreen> CREATOR = new BoostDetailsScreen.Creator(13);
    public final PasswordDialog dialog;

    /* loaded from: classes7.dex */
    public final class PasswordDialog implements Parcelable {
        public static final Parcelable.Creator<PasswordDialog> CREATOR = new BoostDetailsScreen.Creator(16);
        public final String message;
        public final Button primaryButton;
        public final Button secondaryButton;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Action implements Parcelable {
            public static final /* synthetic */ Action[] $VALUES;
            public static final Parcelable.Creator<Action> CREATOR;
            public static final Action Close;
            public static final Action OpenBiometricEnrollment;

            static {
                Action action = new Action("OpenBiometricEnrollment", 0);
                OpenBiometricEnrollment = action;
                Action action2 = new Action(Constants.META_CLOSE, 1);
                Close = action2;
                $VALUES = new Action[]{action, action2};
                CREATOR = new BoostDetailsScreen.Creator(14);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(name());
            }
        }

        public final class Button implements Parcelable {
            public static final Parcelable.Creator<Button> CREATOR = new BoostDetailsScreen.Creator(15);
            public final Action action;
            public final String id;
            public final Style style;
            public final String title;

            public Button(String str, String str2, Style style, Action action) {
                str.getClass();
                str2.getClass();
                style.getClass();
                action.getClass();
                this.id = str;
                this.title = str2;
                this.style = style;
                this.action = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(this.id, button.id) && Intrinsics.areEqual(this.title, button.title) && this.style == button.style && this.action == button.action;
            }

            public final int hashCode() {
                return this.action.hashCode() + ((this.style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Button(id=", this.id, ", title=", this.title, ", style=");
                m.append(this.style);
                m.append(", action=");
                m.append(this.action);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.style.name());
                this.action.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Style {
            public static final /* synthetic */ Style[] $VALUES;
            public static final Style Default;

            static {
                Style style = new Style("Default", 0);
                Default = style;
                $VALUES = new Style[]{style, new Style("Destructive", 1)};
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public PasswordDialog(String str, String str2, Button button, Button button2) {
            this.title = str;
            this.message = str2;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasswordDialog)) {
                return false;
            }
            PasswordDialog passwordDialog = (PasswordDialog) obj;
            return Intrinsics.areEqual(this.title, passwordDialog.title) && Intrinsics.areEqual(this.message, passwordDialog.message) && Intrinsics.areEqual(this.primaryButton, passwordDialog.primaryButton) && Intrinsics.areEqual(this.secondaryButton, passwordDialog.secondaryButton);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button button = this.primaryButton;
            int hashCode3 = (hashCode2 + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            return hashCode3 + (button2 != null ? button2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PasswordDialog(title=", this.title, ", message=", this.message, ", primaryButton=");
            m.append(this.primaryButton);
            m.append(", secondaryButton=");
            m.append(this.secondaryButton);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            Button button = this.primaryButton;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i);
            }
            Button button2 = this.secondaryButton;
            if (button2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button2.writeToParcel(parcel, i);
            }
        }
    }

    public PasswordDialogScreen(PasswordDialog passwordDialog) {
        passwordDialog.getClass();
        this.dialog = passwordDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordDialogScreen) && Intrinsics.areEqual(this.dialog, ((PasswordDialogScreen) obj).dialog);
    }

    public final int hashCode() {
        return this.dialog.hashCode();
    }

    public final String toString() {
        return "PasswordDialogScreen(dialog=" + this.dialog + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.dialog.writeToParcel(parcel, i);
    }
}
