package com.squareup.cash.agents.applets.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class AgentsHomeScreen implements Screen, SingleInstanceScreen {
    public static final Parcelable.Creator<AgentsHomeScreen> CREATOR = new ActivityScreen.Creator(20);
    public final boolean refreshAgentsOnStart;

    public AgentsHomeScreen(boolean z) {
        this.refreshAgentsOnStart = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgentsHomeScreen) && this.refreshAgentsOnStart == ((AgentsHomeScreen) obj).refreshAgentsOnStart;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.refreshAgentsOnStart);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("AgentsHomeScreen(refreshAgentsOnStart=", ")", this.refreshAgentsOnStart);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.refreshAgentsOnStart ? 1 : 0);
    }
}
