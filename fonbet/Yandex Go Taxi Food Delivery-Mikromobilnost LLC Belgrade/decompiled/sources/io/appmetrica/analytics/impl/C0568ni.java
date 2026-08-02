package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0568ni implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(ResultReceiverC0904z7.class.getClassLoader());
        return new C0597oi((ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0597oi[i];
    }
}
