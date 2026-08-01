package com.google.android.datatransport;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterWebsocket implements Parcelable {
    public static final Parcelable.Creator<WinterFlowRouterWebsocket> CREATOR = new WinterFlowStackFramework(3);
    public final int WinterFlowRouterRouter;
    public final Intent WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final IntentSender WinterFlowVariableVersionControl;

    public WinterFlowRouterWebsocket(IntentSender intentSender, Intent intent, int i, int i2) {
        this.WinterFlowVariableVersionControl = intentSender;
        this.WinterFlowTransactionManagerStrategy = intent;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.WinterFlowVariableVersionControl, i);
        parcel.writeParcelable(this.WinterFlowTransactionManagerStrategy, i);
        parcel.writeInt(this.WinterFlowUnitTestResponse);
        parcel.writeInt(this.WinterFlowRouterRouter);
    }
}
