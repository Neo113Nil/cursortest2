package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LO extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2501Ce f26114a;

    public /* synthetic */ LO(C2501Ce c2501Ce) {
        Objects.requireNonNull(c2501Ce);
        this.f26114a = c2501Ce;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f26114a.l();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C2501Ce c2501Ce;
        String str = AbstractC3159eu.f29993a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            c2501Ce = this.f26114a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) c2501Ce.f24171C)) {
                c2501Ce.f24171C = null;
                break;
            }
            i++;
        }
        c2501Ce.l();
    }
}
