package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class YO extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4287ze f28824a;

    public /* synthetic */ YO(C4287ze c4287ze) {
        Objects.requireNonNull(c4287ze);
        this.f28824a = c4287ze;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f28824a.l();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C4287ze c4287ze;
        String str = AbstractC3548lu.f32613a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            c4287ze = this.f28824a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) c4287ze.f35570C)) {
                c4287ze.f35570C = null;
                break;
            }
            i++;
        }
        c4287ze.l();
    }
}
