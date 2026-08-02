package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class SafeParcelReader$ParseException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SafeParcelReader$ParseException(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        Boxes$$ExternalSyntheticOutline1.m(sb, str, " Parcel: pos=", dataPosition, " size=");
        sb.append(dataSize);
    }
}
