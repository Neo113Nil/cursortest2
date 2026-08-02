package com.squareup.cash.p2pblocking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PAllowlistScreen implements Screen {
    public static final Parcelable.Creator<P2PAllowlistScreen> CREATOR = new P2PListScreen.Creator(3);
    public final Screen destinationScreen;
    public final String firstName;
    public final String forCustomerToken;
    public final Set initialAllowlistTokens;
    public final Integer limit;

    public P2PAllowlistScreen(String str, String str2, Integer num, Set set, Screen screen) {
        str.getClass();
        set.getClass();
        this.forCustomerToken = str;
        this.firstName = str2;
        this.limit = num;
        this.initialAllowlistTokens = set;
        this.destinationScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PAllowlistScreen)) {
            return false;
        }
        P2PAllowlistScreen p2PAllowlistScreen = (P2PAllowlistScreen) obj;
        return Intrinsics.areEqual(this.forCustomerToken, p2PAllowlistScreen.forCustomerToken) && Intrinsics.areEqual(this.firstName, p2PAllowlistScreen.firstName) && Intrinsics.areEqual(this.limit, p2PAllowlistScreen.limit) && Intrinsics.areEqual(this.initialAllowlistTokens, p2PAllowlistScreen.initialAllowlistTokens) && Intrinsics.areEqual(this.destinationScreen, p2PAllowlistScreen.destinationScreen);
    }

    public final int hashCode() {
        int hashCode = this.forCustomerToken.hashCode() * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.limit;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.initialAllowlistTokens);
        Screen screen = this.destinationScreen;
        return m + (screen != null ? screen.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("P2PAllowlistScreen(forCustomerToken=", this.forCustomerToken, ", firstName=", this.firstName, ", limit=");
        m.append(this.limit);
        m.append(", initialAllowlistTokens=");
        m.append(this.initialAllowlistTokens);
        m.append(", destinationScreen=");
        m.append(this.destinationScreen);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.forCustomerToken);
        parcel.writeString(this.firstName);
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        Set set = this.initialAllowlistTokens;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        parcel.writeParcelable(this.destinationScreen, i);
    }
}
