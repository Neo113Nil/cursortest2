package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ChatSourceContext implements Parcelable {
    public static final Parcelable.Creator<ChatSourceContext> CREATOR = new LimitsScreen.Creator(26);
    public final String loadableSessionId;

    public ChatSourceContext(String str) {
        this.loadableSessionId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatSourceContext) && Intrinsics.areEqual(this.loadableSessionId, ((ChatSourceContext) obj).loadableSessionId);
    }

    public final int hashCode() {
        String str = this.loadableSessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChatSourceContext(loadableSessionId=", this.loadableSessionId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.loadableSessionId);
    }
}
