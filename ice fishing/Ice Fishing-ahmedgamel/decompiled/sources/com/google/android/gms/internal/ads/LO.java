package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LO extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2521Ce f26914a;

    public /* synthetic */ LO(C2521Ce c2521Ce) {
        Objects.requireNonNull(c2521Ce);
        this.f26914a = c2521Ce;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f26914a.l();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C2521Ce c2521Ce;
        String str = AbstractC3182eu.f30782a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            c2521Ce = this.f26914a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) c2521Ce.f24906C)) {
                c2521Ce.f24906C = null;
                break;
            }
            i++;
        }
        c2521Ce.l();
    }
}
