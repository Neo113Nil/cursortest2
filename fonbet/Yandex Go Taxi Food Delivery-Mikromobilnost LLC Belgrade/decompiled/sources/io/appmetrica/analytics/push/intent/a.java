package io.appmetrica.analytics.push.intent;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new NotificationActionInfo(parcel, 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NotificationActionInfo[i];
    }
}
