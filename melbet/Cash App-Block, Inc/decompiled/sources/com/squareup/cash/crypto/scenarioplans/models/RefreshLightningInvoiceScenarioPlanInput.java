package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.db.contacts.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RefreshLightningInvoiceScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<RefreshLightningInvoiceScenarioPlanInput> CREATOR = new Recipient.Creator(6);
    public final String invoiceId;

    public RefreshLightningInvoiceScenarioPlanInput(String str) {
        str.getClass();
        this.invoiceId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshLightningInvoiceScenarioPlanInput) && Intrinsics.areEqual(this.invoiceId, ((RefreshLightningInvoiceScenarioPlanInput) obj).invoiceId);
    }

    public final int hashCode() {
        return this.invoiceId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RefreshLightningInvoiceScenarioPlanInput(invoiceId=", this.invoiceId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.invoiceId);
    }
}
