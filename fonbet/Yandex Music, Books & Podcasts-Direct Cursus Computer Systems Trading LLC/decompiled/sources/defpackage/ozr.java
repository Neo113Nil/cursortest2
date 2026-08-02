package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class ozr implements mzr {
    public static final Object i = new Object();
    public static final LinkedHashMap j = new LinkedHashMap();
    public final AudioManager a;
    public final Context b;
    public final HandlerThread c;
    public final Integer d;
    public boolean f;
    public final Handler h;
    public volatile float e = 1.0f;
    public final l83 g = new l83(21, this);

    public ozr(AudioManager audioManager, Context context, HandlerThread handlerThread, Integer num) {
        this.a = audioManager;
        this.b = context;
        this.c = handlerThread;
        this.d = num;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.h = handler;
        handler.post(new bhp(10, this));
    }

    @Override // defpackage.mzr
    public final void a() {
        Context context;
        synchronized (i) {
            j.remove(this.d);
            if (this.f && (context = this.b) != null) {
                try {
                    context.unregisterReceiver(this.g);
                    this.f = false;
                } catch (Exception e) {
                    Log.e("MediaVolumeProvider", "VolumeBroadcastReceiver unregister exception happened: " + e.getMessage());
                }
            }
            this.c.quitSafely();
        }
    }

    @Override // defpackage.mzr
    public final float getVolume() {
        return this.e;
    }

    @Override // defpackage.mzr
    public final void start() {
        Context context;
        synchronized (i) {
            if (!this.f && (context = this.b) != null) {
                context.registerReceiver(this.g, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"), null, this.h);
                this.f = true;
            }
        }
    }
}
