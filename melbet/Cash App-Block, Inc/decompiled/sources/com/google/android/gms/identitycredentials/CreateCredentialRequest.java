package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class CreateCredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCredentialRequest> CREATOR = new zzef(17);
    public final Bundle candidateQueryData;
    public final Bundle credentialData;
    public final String origin;
    public final String requestJson;
    public final ResultReceiver resultReceiver;

    /* renamed from: type, reason: collision with root package name */
    public final String f990type;

    public CreateCredentialRequest(String str, Bundle bundle, Bundle bundle2, String str2, String str3, ResultReceiver resultReceiver) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        this.f990type = str;
        this.credentialData = bundle;
        this.candidateQueryData = bundle2;
        this.origin = str2;
        this.requestJson = str3;
        this.resultReceiver = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.f990type);
        MooncakeHeaderViewKt.writeBundle(parcel, 2, this.credentialData);
        MooncakeHeaderViewKt.writeBundle(parcel, 3, this.candidateQueryData);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.origin);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.requestJson);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.resultReceiver, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
