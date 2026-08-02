package com.squareup.cash.moneybot.backend.api.model.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WidgetConfig$PromptMessageConfig implements Parcelable {
    public static final Parcelable.Creator<WidgetConfig$PromptMessageConfig> CREATOR = new LimitsScreen.Creator(20);
    public final String prompt;

    public WidgetConfig$PromptMessageConfig(String str) {
        str.getClass();
        this.prompt = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WidgetConfig$PromptMessageConfig) && Intrinsics.areEqual(this.prompt, ((WidgetConfig$PromptMessageConfig) obj).prompt);
    }

    public final int hashCode() {
        return this.prompt.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromptMessageConfig(prompt=", this.prompt, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.prompt);
    }
}
