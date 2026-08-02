package com.squareup.cash.p2pblocking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectCustomerScreen implements Screen {
    public static final Parcelable.Creator<SelectCustomerScreen> CREATOR = new P2PListScreen.Creator(10);
    public final BlockingContext context;
    public final Screen destinationScreen;
    public final String forCustomerToken;
    public final P2PScreenMode screenMode;

    public SelectCustomerScreen(String str, BlockingContext blockingContext, Screen screen, P2PScreenMode p2PScreenMode) {
        str.getClass();
        p2PScreenMode.getClass();
        this.forCustomerToken = str;
        this.context = blockingContext;
        this.destinationScreen = screen;
        this.screenMode = p2PScreenMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectCustomerScreen)) {
            return false;
        }
        SelectCustomerScreen selectCustomerScreen = (SelectCustomerScreen) obj;
        return Intrinsics.areEqual(this.forCustomerToken, selectCustomerScreen.forCustomerToken) && this.context == selectCustomerScreen.context && Intrinsics.areEqual(this.destinationScreen, selectCustomerScreen.destinationScreen) && Intrinsics.areEqual(this.screenMode, selectCustomerScreen.screenMode);
    }

    public final int hashCode() {
        int hashCode = this.forCustomerToken.hashCode() * 31;
        BlockingContext blockingContext = this.context;
        int hashCode2 = (hashCode + (blockingContext == null ? 0 : blockingContext.hashCode())) * 31;
        Screen screen = this.destinationScreen;
        return this.screenMode.hashCode() + ((hashCode2 + (screen != null ? screen.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SelectCustomerScreen(forCustomerToken=" + this.forCustomerToken + ", context=" + this.context + ", destinationScreen=" + this.destinationScreen + ", screenMode=" + this.screenMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.forCustomerToken);
        BlockingContext blockingContext = this.context;
        if (blockingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(blockingContext.name());
        }
        parcel.writeParcelable(this.destinationScreen, i);
        parcel.writeParcelable(this.screenMode, i);
    }
}
