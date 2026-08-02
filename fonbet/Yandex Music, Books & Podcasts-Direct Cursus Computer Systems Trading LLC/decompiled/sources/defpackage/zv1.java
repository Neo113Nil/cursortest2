package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class zv1 extends AudioDeviceCallback {
    public final /* synthetic */ bw1 a;

    public zv1(bw1 bw1Var) {
        this.a = bw1Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        bw1 bw1Var = this.a;
        bw1Var.r(yv1.b((Context) bw1Var.c, (dv1) bw1Var.k, (qxp) bw1Var.j));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        bw1 bw1Var = this.a;
        if (dvt.l(audioDeviceInfoArr, (qxp) bw1Var.j)) {
            bw1Var.j = null;
        }
        bw1Var.r(yv1.b((Context) bw1Var.c, (dv1) bw1Var.k, (qxp) bw1Var.j));
    }
}
