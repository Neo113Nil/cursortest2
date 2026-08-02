package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new zzb(16);
    public final Bundle bundle;
    public ArrayMap data;

    public RemoteMessage(Bundle bundle) {
        this.bundle = bundle;
    }

    public final HashMap getData() {
        if (this.data == null) {
            ArrayMap arrayMap = new ArrayMap(0);
            Bundle bundle = this.bundle;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.data = arrayMap;
        }
        return new HashMap(this.data);
    }

    public final String getTo() {
        return this.bundle.getString("google.to");
    }

    public final void populateSendMessageIntent(Intent intent) {
        intent.putExtras(this.bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeBundle(parcel, 2, this.bundle);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
