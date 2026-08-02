package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzac(19);
    public final String zza;

    public MapStyleOptions(String str) {
        zzae.checkNotNull(str, "json must not be null");
        this.zza = str;
    }

    public static MapStyleOptions loadRawResourceStyle(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        Hex.closeQuietly(openRawResource);
                        Hex.closeQuietly(byteArrayOutputStream);
                        return new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    Hex.closeQuietly(openRawResource);
                    Hex.closeQuietly(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + e.toString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
