package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuHours implements Parcelable {
    public static final Parcelable.Creator<MenuHours> CREATOR = new Line.Creator(29);
    public final String hoursFormatted;
    public final String nextAvailableFormatted;
    public final State state;

    public enum State {
        Unspecified("UNSPECIFIED"),
        AlwaysAvailable("ALWAYS_AVAILABLE"),
        AvailableNow("AVAILABLE_NOW"),
        AvailableLater("AVAILABLE_LATER");

        public final String analyticsString;

        State(String str) {
            this.analyticsString = str;
        }
    }

    public MenuHours(State state, String str, String str2) {
        state.getClass();
        this.state = state;
        this.hoursFormatted = str;
        this.nextAvailableFormatted = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuHours)) {
            return false;
        }
        MenuHours menuHours = (MenuHours) obj;
        return this.state == menuHours.state && Intrinsics.areEqual(this.hoursFormatted, menuHours.hoursFormatted) && Intrinsics.areEqual(this.nextAvailableFormatted, menuHours.nextAvailableFormatted);
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        String str = this.hoursFormatted;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextAvailableFormatted;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isAvailableNow() {
        State state = State.AlwaysAvailable;
        State state2 = this.state;
        return state2 == state || state2 == State.AvailableNow;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuHours(state=");
        sb.append(this.state);
        sb.append(", hoursFormatted=");
        sb.append(this.hoursFormatted);
        sb.append(", nextAvailableFormatted=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.nextAvailableFormatted, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.state.name());
        parcel.writeString(this.hoursFormatted);
        parcel.writeString(this.nextAvailableFormatted);
    }
}
