package defpackage;

import android.content.Intent;

/* loaded from: classes4.dex */
public final class r6q implements d80 {
    public final /* synthetic */ iy1 a;
    public final /* synthetic */ kv6 b;

    public r6q(iy1 iy1Var, kv6 kv6Var) {
        this.a = iy1Var;
        this.b = kv6Var;
    }

    @Override // defpackage.d80
    public final void R(c80 c80Var, ig7 ig7Var) {
        ig7Var.getClass();
        mal.a();
        iy1 iy1Var = this.a;
        int g1 = this.b.g1();
        hy1 hy1Var = (hy1) iy1Var;
        hy1Var.getClass();
        ssg.a(3, "AudioSessionBroadcaster", "onAudioSessionEnabled " + g1, null);
        hy1Var.b = g1;
        Intent putExtra = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION").putExtra("android.media.extra.AUDIO_SESSION", hy1Var.b).putExtra("android.media.extra.PACKAGE_NAME", hy1Var.a.getPackageName());
        putExtra.getClass();
        yd5.J(hy1Var.a, putExtra);
    }
}
