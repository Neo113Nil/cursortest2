package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalMenuPickerScreen implements LocalScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LocalMenuPickerScreen> CREATOR = new LocalLoyaltySheet.Creator(28);
    public final List menus;
    public final AskedQuestion question;

    public LocalMenuPickerScreen(List list, AskedQuestion askedQuestion) {
        list.getClass();
        askedQuestion.getClass();
        this.menus = list;
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMenuPickerScreen)) {
            return false;
        }
        LocalMenuPickerScreen localMenuPickerScreen = (LocalMenuPickerScreen) obj;
        return Intrinsics.areEqual(this.menus, localMenuPickerScreen.menus) && Intrinsics.areEqual(this.question, localMenuPickerScreen.question);
    }

    public final int hashCode() {
        return this.question.hashCode() + (this.menus.hashCode() * 31);
    }

    public final String toString() {
        return "LocalMenuPickerScreen(menus=" + this.menus + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.menus, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.question, i);
    }
}
