package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalExplanatoryDialog implements LocalScreen, DialogScreen {
    public static final Parcelable.Creator<LocalExplanatoryDialog> CREATOR = new LocalLoyaltySheet.Creator(14);
    public final List messages;
    public final PositiveAction positiveAction;

    public abstract class PositiveAction implements Parcelable {

        public final class Ok extends PositiveAction {
            public static final Ok INSTANCE = new Ok();
            public static final Parcelable.Creator<Ok> CREATOR = new LocalLoyaltySheet.Creator(15);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Ok);
            }

            public final int hashCode() {
                return -1855461130;
            }

            public final String toString() {
                return "Ok";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class OpenSettings extends PositiveAction {
            public static final OpenSettings INSTANCE = new OpenSettings();
            public static final Parcelable.Creator<OpenSettings> CREATOR = new LocalLoyaltySheet.Creator(16);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenSettings);
            }

            public final int hashCode() {
                return -358637785;
            }

            public final String toString() {
                return "OpenSettings";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public LocalExplanatoryDialog(List list, PositiveAction positiveAction) {
        list.getClass();
        positiveAction.getClass();
        this.messages = list;
        this.positiveAction = positiveAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalExplanatoryDialog)) {
            return false;
        }
        LocalExplanatoryDialog localExplanatoryDialog = (LocalExplanatoryDialog) obj;
        return Intrinsics.areEqual(this.messages, localExplanatoryDialog.messages) && Intrinsics.areEqual(this.positiveAction, localExplanatoryDialog.positiveAction);
    }

    public final int hashCode() {
        return this.positiveAction.hashCode() + (this.messages.hashCode() * 31);
    }

    public final String toString() {
        return "LocalExplanatoryDialog(messages=" + this.messages + ", positiveAction=" + this.positiveAction + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.messages);
        parcel.writeParcelable(this.positiveAction, i);
    }

    public /* synthetic */ LocalExplanatoryDialog(List list) {
        this(list, PositiveAction.Ok.INSTANCE);
    }
}
