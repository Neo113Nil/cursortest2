package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza(0);
    public final Intent zza;

    public CloudMessage(Intent intent) {
        this.zza = intent;
    }

    public final Intent getIntent() {
        return this.zza;
    }

    public final String getMessageId() {
        Intent intent = this.zza;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final Integer zza() {
        Intent intent = this.zza;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
