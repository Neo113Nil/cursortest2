package com.squareup.cash.cashapppay.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmRemoveLinkedBusinessDialogScreen implements DialogScreen {
    public static final Parcelable.Creator<ConfirmRemoveLinkedBusinessDialogScreen> CREATOR = new CheckCaptureQuestion.Creator(19);
    public final SyncBusinessGrant.ActionType actionType;
    public final String businessGrantId;
    public final String name;

    public ConfirmRemoveLinkedBusinessDialogScreen(String str, String str2, SyncBusinessGrant.ActionType actionType) {
        str.getClass();
        str2.getClass();
        actionType.getClass();
        this.businessGrantId = str;
        this.name = str2;
        this.actionType = actionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmRemoveLinkedBusinessDialogScreen)) {
            return false;
        }
        ConfirmRemoveLinkedBusinessDialogScreen confirmRemoveLinkedBusinessDialogScreen = (ConfirmRemoveLinkedBusinessDialogScreen) obj;
        return Intrinsics.areEqual(this.businessGrantId, confirmRemoveLinkedBusinessDialogScreen.businessGrantId) && Intrinsics.areEqual(this.name, confirmRemoveLinkedBusinessDialogScreen.name) && this.actionType == confirmRemoveLinkedBusinessDialogScreen.actionType;
    }

    public final int hashCode() {
        return this.actionType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.businessGrantId.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmRemoveLinkedBusinessDialogScreen(businessGrantId=", this.businessGrantId, ", name=", this.name, ", actionType=");
        m.append(this.actionType);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.businessGrantId);
        parcel.writeString(this.name);
        parcel.writeString(this.actionType.name());
    }
}
