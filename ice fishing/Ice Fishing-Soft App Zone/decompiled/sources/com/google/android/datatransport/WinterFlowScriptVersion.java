package com.google.android.datatransport;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptVersion implements Parcelable {
    public static final Parcelable.Creator<WinterFlowScriptVersion> CREATOR = new WinterFlowStackFramework(1);
    public final Intent WinterFlowTransactionManagerStrategy;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowScriptVersion(Intent intent, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.WinterFlowVariableVersionControl;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        Intent intent = this.WinterFlowTransactionManagerStrategy;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
