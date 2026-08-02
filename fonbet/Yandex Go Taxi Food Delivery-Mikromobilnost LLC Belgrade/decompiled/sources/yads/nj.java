package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import defpackage.bz71;
import defpackage.q281;

/* loaded from: classes7.dex */
public final class nj extends BroadcastReceiver implements Runnable {
    public final bz71 b;
    public final Handler c;
    public final /* synthetic */ q281 d;

    public nj(q281 q281Var, Handler handler, bz71 bz71Var) {
        this.d = q281Var;
        this.c = handler;
        this.b = bz71Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getClass();
    }
}
