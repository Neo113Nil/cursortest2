package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzix implements ChannelApi.ChannelListener {
    private final String zza;
    private final ChannelApi.ChannelListener zzb;

    zzix(String str, ChannelApi.ChannelListener channelListener) {
        this.zza = str;
        channelListener.getClass();
        this.zzb = channelListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzix)) {
            return false;
        }
        zzix zzixVar = (zzix) obj;
        return this.zzb.equals(zzixVar.zzb) && this.zza.equals(zzixVar.zza);
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelClosed(Channel channel, int i, int i2) {
        this.zzb.onChannelClosed(channel, i, i2);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelOpened(Channel channel) {
        this.zzb.onChannelOpened(channel);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onInputClosed(Channel channel, int i, int i2) {
        this.zzb.onInputClosed(channel, i, i2);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onOutputClosed(Channel channel, int i, int i2) {
        this.zzb.onOutputClosed(channel, i, i2);
    }
}
