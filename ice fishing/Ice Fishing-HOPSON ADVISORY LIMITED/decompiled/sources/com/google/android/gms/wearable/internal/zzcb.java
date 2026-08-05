package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzcb extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzcc();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzcb(String str, String str2, String str3) {
        str.getClass();
        this.zza = str;
        str2.getClass();
        this.zzb = str2;
        str3.getClass();
        this.zzc = str3;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        return zze.zza(googleApiClient, new zzby(this.zza, new IntentFilter[]{zzjd.zza("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> close(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbs(this, googleApiClient));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return false;
        }
        zzcb zzcbVar = (zzcb) obj;
        return this.zza.equals(zzcbVar.zza) && Objects.equal(zzcbVar.zzb, this.zzb) && Objects.equal(zzcbVar.zzc, this.zzc);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Channel.GetInputStreamResult> getInputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbu(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel
    public final String getNodeId() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Channel.GetOutputStreamResult> getOutputStream(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbv(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel
    public final String getPath() {
        return this.zzc;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> receiveFile(GoogleApiClient googleApiClient, Uri uri, boolean z) {
        com.google.android.gms.internal.wearable.zzai.zzd(googleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(uri, "uri is null");
        return googleApiClient.enqueue(new zzbw(this, googleApiClient, uri, z));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        com.google.android.gms.internal.wearable.zzai.zzd(googleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(channelListener, "listener is null");
        return googleApiClient.enqueue(new zzat(googleApiClient, channelListener, this.zza));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri) {
        return sendFile(googleApiClient, uri, 0L, -1L);
    }

    public final String toString() {
        String str = this.zza;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 3 + String.valueOf(substring2).length() + 2 + String.valueOf(i).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str2 = this.zzb;
        String str3 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 23 + String.valueOf(str2).length() + 7 + String.valueOf(str3).length() + 1);
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str2);
        sb2.append(", path=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> close(GoogleApiClient googleApiClient, int i) {
        return googleApiClient.enqueue(new zzbt(this, googleApiClient, i));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri, long j, long j2) {
        com.google.android.gms.internal.wearable.zzai.zzd(googleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(this.zza, "token is null");
        com.google.android.gms.internal.wearable.zzai.zzd(uri, "uri is null");
        com.google.android.gms.internal.wearable.zzai.zzc(j >= 0, "startOffset is negative: %s", j);
        com.google.android.gms.internal.wearable.zzai.zzc(j2 >= 0 || j2 == -1, "invalid length: %s", j2);
        return googleApiClient.enqueue(new zzbx(this, googleApiClient, uri, j, j2));
    }
}
