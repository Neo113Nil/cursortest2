package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import defpackage.xeo;
import defpackage.yeo;
import defpackage.zeo;
import java.util.Map;
import kotlin.Pair;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public final class c implements zeo {
    public final Context a;
    public VolumeValueUpdatesStreamHandler$VolumeBroadcastReceiver b;
    public AudioManager c;
    public yeo w;

    public c(Context context) {
        this.a = context;
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        VolumeValueUpdatesStreamHandler$VolumeBroadcastReceiver volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver = this.b;
        if (volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver == null) {
            volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver = null;
        }
        this.a.unregisterReceiver(volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver);
        this.w = null;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [ru.yandex.yx_platform_api.VolumeValueUpdatesStreamHandler$VolumeBroadcastReceiver] */
    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        this.w = (yeo) xeoVar;
        Context context = this.a;
        this.c = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        final yeo yeoVar = this.w;
        final AudioManager audioManager = this.c;
        if (audioManager == null) {
            audioManager = null;
        }
        this.b = new BroadcastReceiver(yeoVar, audioManager) { // from class: ru.yandex.yx_platform_api.VolumeValueUpdatesStreamHandler$VolumeBroadcastReceiver
            private final AudioManager audioManager;
            private final xeo events;

            {
                this.events = yeoVar;
                this.audioManager = audioManager;
            }

            public final double getVolumePercentageByStreamType(int streamType) {
                int streamMinVolume = this.audioManager.getStreamMinVolume(streamType);
                return Math.rint(((this.audioManager.getStreamVolume(streamType) - streamMinVolume) / (this.audioManager.getStreamMaxVolume(streamType) - streamMinVolume)) * 10000.0d) / 10000.0d;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                xeo xeoVar2 = this.events;
                if (xeoVar2 != null) {
                    xeoVar2.success(volumeValuesMap());
                }
            }

            public final Map<Integer, Double> volumeValuesMap() {
                return kotlin.collections.b.i(new Pair(3, Double.valueOf(getVolumePercentageByStreamType(3))), new Pair(2, Double.valueOf(getVolumePercentageByStreamType(2))), new Pair(5, Double.valueOf(getVolumePercentageByStreamType(5))));
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        int i = Build.VERSION.SDK_INT;
        VolumeValueUpdatesStreamHandler$VolumeBroadcastReceiver volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver = this.b;
        if (i >= 33) {
            if (volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver == null) {
                volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver = null;
            }
            context.registerReceiver(volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver, intentFilter, 4);
        } else {
            if (volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver == null) {
                volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver = null;
            }
            context.registerReceiver(volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver, intentFilter);
        }
        yeo yeoVar2 = this.w;
        if (yeoVar2 != null) {
            VolumeValueUpdatesStreamHandler$VolumeBroadcastReceiver volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver2 = this.b;
            yeoVar2.success((volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver2 != null ? volumeValueUpdatesStreamHandler$VolumeBroadcastReceiver2 : null).volumeValuesMap());
        }
    }
}
