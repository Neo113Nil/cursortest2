package defpackage;

import android.media.AudioAttributes;

/* loaded from: classes10.dex */
public final class se3 {
    public final AudioAttributes a;

    public se3(ws71 ws71Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(ws71Var.a).setFlags(ws71Var.b).setUsage(ws71Var.c);
        int i = rf71.a;
        if (i >= 29) {
            tj71.a(usage, ws71Var.w);
        }
        if (i >= 32) {
            bn71.a(usage, ws71Var.x);
        }
        this.a = usage.build();
    }

    public se3(ue3 ue3Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(ue3Var.a).setFlags(0).setUsage(1);
        int i = tw21.a;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.a = usage.build();
    }
}
