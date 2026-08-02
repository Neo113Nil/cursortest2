package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class hk7 implements xj7 {
    public static AudioAttributes b(dv1 dv1Var, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) dv1Var.b().a;
    }

    public final AudioTrack a(z9 z9Var, dv1 dv1Var, int i) {
        boolean z = z9Var.d;
        int i2 = z9Var.a;
        int i3 = z9Var.c;
        int i4 = z9Var.b;
        int i5 = dvt.a;
        if (i5 < 23) {
            return new AudioTrack(b(dv1Var, z), dvt.t(i4, i3, i2), z9Var.f, 1, i);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(dv1Var, z)).setAudioFormat(dvt.t(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(z9Var.f).setSessionId(i);
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(z9Var.e);
        }
        return sessionId.build();
    }
}
