package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes10.dex */
public class q6h implements c6h {
    public static AudioAttributes b(ue3 ue3Var, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ue3Var.a().a;
    }

    public final AudioTrack a(ah3 ah3Var, ue3 ue3Var, int i) {
        boolean z = ah3Var.d;
        int i2 = ah3Var.a;
        int i3 = ah3Var.c;
        int i4 = ah3Var.b;
        int i5 = tw21.a;
        if (i5 < 23) {
            return new AudioTrack(b(ue3Var, z), tw21.r(i4, i3, i2), ah3Var.f, 1, i);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(ue3Var, z)).setAudioFormat(tw21.r(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(ah3Var.f).setSessionId(i);
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(ah3Var.e);
        }
        return sessionId.build();
    }
}
