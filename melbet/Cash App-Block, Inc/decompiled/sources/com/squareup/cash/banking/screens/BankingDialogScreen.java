package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BankingDialogScreen implements BankingDialogs {
    public static final Parcelable.Creator<BankingDialogScreen> CREATOR = new SheetAppMessage.Creator(11);
    public final Dialog dialog;
    public final Screen originScreen;

    /* loaded from: classes5.dex */
    public final class Dialog implements Parcelable {
        public static final Parcelable.Creator<Dialog> CREATOR = new SheetAppMessage.Creator(13);
        public final String body;
        public final Button primaryButton;
        public final Button secondaryButton;
        public final String title;

        public final class Button implements Parcelable {
            public static final Parcelable.Creator<Button> CREATOR = new SheetAppMessage.Creator(12);
            public final ClientScenario clientScenario;
            public final String text;

            public Button(ClientScenario clientScenario, String str) {
                str.getClass();
                this.text = str;
                this.clientScenario = clientScenario;
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
                return Intrinsics.areEqual(this.text, button.text) && this.clientScenario == button.clientScenario;
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                ClientScenario clientScenario = this.clientScenario;
                return hashCode + (clientScenario == null ? 0 : clientScenario.hashCode());
            }

            public final String toString() {
                return "Button(text=" + this.text + ", clientScenario=" + this.clientScenario + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.text);
                ClientScenario clientScenario = this.clientScenario;
                if (clientScenario == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(clientScenario.name());
                }
            }
        }

        public Dialog(String str, String str2, Button button, Button button2) {
            str.getClass();
            button.getClass();
            this.title = str;
            this.body = str2;
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
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.body, dialog.body) && Intrinsics.areEqual(this.primaryButton, dialog.primaryButton) && Intrinsics.areEqual(this.secondaryButton, dialog.secondaryButton);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.body;
            int hashCode2 = (this.primaryButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Button button = this.secondaryButton;
            return hashCode2 + (button != null ? button.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Dialog(title=", this.title, ", body=", this.body, ", primaryButton=");
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
            parcel.writeString(this.body);
            this.primaryButton.writeToParcel(parcel, i);
            Button button = this.secondaryButton;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i);
            }
        }
    }

    public BankingDialogScreen(Dialog dialog, Screen screen) {
        dialog.getClass();
        this.dialog = dialog;
        this.originScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankingDialogScreen)) {
            return false;
        }
        BankingDialogScreen bankingDialogScreen = (BankingDialogScreen) obj;
        return Intrinsics.areEqual(this.dialog, bankingDialogScreen.dialog) && Intrinsics.areEqual(this.originScreen, bankingDialogScreen.originScreen);
    }

    public final int hashCode() {
        int hashCode = this.dialog.hashCode() * 31;
        Screen screen = this.originScreen;
        return hashCode + (screen == null ? 0 : screen.hashCode());
    }

    public final String toString() {
        return "BankingDialogScreen(dialog=" + this.dialog + ", originScreen=" + this.originScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.dialog.writeToParcel(parcel, i);
        parcel.writeParcelable(this.originScreen, i);
    }
}
