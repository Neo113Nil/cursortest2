package com.squareup.cash.backstack.api;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.appmessages.SheetAppMessage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class BackStack$ScreenEntry implements BackStack$Entry {
    public static final Parcelable.Creator<BackStack$ScreenEntry> CREATOR = new SheetAppMessage.Creator(3);
    public final Screen args;
    public final Overlay overlay;
    public final SavedState presenterState;
    public final String stateKey;

    /* loaded from: classes5.dex */
    public final class Overlay implements Parcelable {
        public static final Parcelable.Creator<Overlay> CREATOR = new SheetAppMessage.Creator(4);
        public final Screen args;
        public final SavedState presenterState;
        public final String stateKey;

        public Overlay(Screen screen, String str, SavedState savedState) {
            screen.getClass();
            str.getClass();
            this.args = screen;
            this.stateKey = str;
            this.presenterState = savedState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overlay)) {
                return false;
            }
            Overlay overlay = (Overlay) obj;
            return Intrinsics.areEqual(this.args, overlay.args) && Intrinsics.areEqual(this.stateKey, overlay.stateKey) && Intrinsics.areEqual(this.presenterState, overlay.presenterState);
        }

        public final Screen getArgs() {
            return this.args;
        }

        public final String getStateKey() {
            return this.stateKey;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.args.hashCode() * 31, 31, this.stateKey);
            SavedState savedState = this.presenterState;
            return m + (savedState == null ? 0 : savedState.value.hashCode());
        }

        public final String toString() {
            return "Overlay(args=" + this.args + ", stateKey=" + this.stateKey + ", presenterState=" + this.presenterState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.args, i);
            parcel.writeString(this.stateKey);
            parcel.writeParcelable(this.presenterState, i);
        }
    }

    public BackStack$ScreenEntry(Screen screen, String str, SavedState savedState, Overlay overlay) {
        screen.getClass();
        this.args = screen;
        this.stateKey = str;
        this.presenterState = savedState;
        this.overlay = overlay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackStack$ScreenEntry)) {
            return false;
        }
        BackStack$ScreenEntry backStack$ScreenEntry = (BackStack$ScreenEntry) obj;
        return Intrinsics.areEqual(this.args, backStack$ScreenEntry.args) && Intrinsics.areEqual(this.stateKey, backStack$ScreenEntry.stateKey) && Intrinsics.areEqual(this.presenterState, backStack$ScreenEntry.presenterState) && Intrinsics.areEqual(this.overlay, backStack$ScreenEntry.overlay);
    }

    public final Screen getArgs() {
        return this.args;
    }

    public final Overlay getOverlay() {
        return this.overlay;
    }

    public final int hashCode() {
        int hashCode = this.args.hashCode() * 31;
        String str = this.stateKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SavedState savedState = this.presenterState;
        int hashCode3 = (hashCode2 + (savedState == null ? 0 : savedState.value.hashCode())) * 31;
        Overlay overlay = this.overlay;
        return hashCode3 + (overlay != null ? overlay.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.args.toString();
        Overlay overlay = this.overlay;
        if (overlay == null) {
            return obj;
        }
        return obj + Marker.ANY_NON_NULL_MARKER + overlay.getArgs();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.args, i);
        parcel.writeString(this.stateKey);
        parcel.writeParcelable(this.presenterState, i);
        Overlay overlay = this.overlay;
        if (overlay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlay.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BackStack$ScreenEntry(Screen screen) {
        this(screen, null, null, null);
    }
}
