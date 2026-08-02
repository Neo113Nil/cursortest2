package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class CredentialOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialOption> CREATOR = new zzef(19);
    public final Bundle candidateQueryData;
    public final Bundle credentialRetrievalData;
    public final String protocolType;
    public final String requestMatcher;
    public final String requestType;

    /* renamed from: type, reason: collision with root package name */
    public final String f992type;

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f992type = str;
        this.credentialRetrievalData = bundle;
        this.candidateQueryData = bundle2;
        this.requestMatcher = str2;
        this.requestType = str3;
        this.protocolType = str4;
        boolean z = (StringsKt.isBlank(str3) || StringsKt.isBlank(str4)) ? false : true;
        boolean z2 = !StringsKt.isBlank(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Either type: ", str, ", or requestType: ", str3);
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(sb, " and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.f992type);
        MooncakeHeaderViewKt.writeBundle(parcel, 2, this.credentialRetrievalData);
        MooncakeHeaderViewKt.writeBundle(parcel, 3, this.candidateQueryData);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.requestMatcher);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.requestType);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.protocolType);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
