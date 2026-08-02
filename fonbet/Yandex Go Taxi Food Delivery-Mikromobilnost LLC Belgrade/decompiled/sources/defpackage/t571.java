package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import org.webrtc.MediaStreamTrack;
import yads.e23;
import yads.gn0;

/* loaded from: classes7.dex */
public final class t571 {
    public final Context a;
    public final Handler b;
    public final gn0 c;
    public final AudioManager d;
    public e23 e;
    public HandlerThread f;
    public int g;
    public int h;
    public boolean i;

    public t571(Context context, Handler handler, gn0 gn0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = gn0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            ny61.k();
            throw null;
        }
        this.d = audioManager;
        this.g = 3;
        this.h = a(audioManager, 3);
        int i = this.g;
        this.i = rf71.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        e23 e23Var = new e23(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(e23Var, intentFilter, null, new Handler(this.f.getLooper()));
            this.e = e23Var;
        } catch (RuntimeException e) {
            nba1.b("Error registering stream volume receiver", e);
            nba1.e();
            HandlerThread handlerThread2 = this.f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f = null;
            }
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            nba1.b("Could not retrieve stream volume for stream type " + i, e);
            nba1.e();
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b() {
        int i = this.g;
        AudioManager audioManager = this.d;
        int a = a(audioManager, i);
        int i2 = this.g;
        boolean isStreamMute = rf71.a >= 23 ? audioManager.isStreamMute(i2) : a(audioManager, i2) == 0;
        if (this.h == a && this.i == isStreamMute) {
            return;
        }
        this.h = a;
        this.i = isStreamMute;
        this.c.a(isStreamMute, a);
    }
}
