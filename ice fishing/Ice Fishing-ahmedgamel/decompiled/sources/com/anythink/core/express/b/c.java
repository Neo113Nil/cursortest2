package com.anythink.core.express.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.anythink.basead.exoplayer.k.o;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static double f17536a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final String f17537b = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: c, reason: collision with root package name */
    private static final String f17538c = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* renamed from: d, reason: collision with root package name */
    private Context f17539d;

    /* renamed from: e, reason: collision with root package name */
    private AudioManager f17540e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17541f = false;

    /* renamed from: g, reason: collision with root package name */
    private b f17542g;

    /* renamed from: h, reason: collision with root package name */
    private a f17543h;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<c> f17544a;

        public a(c cVar) {
            this.f17544a = new WeakReference<>(cVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar;
            b b9;
            if (!c.f17537b.equals(intent.getAction()) || intent.getIntExtra(c.f17538c, -1) != 3 || (cVar = this.f17544a.get()) == null || (b9 = cVar.b()) == null) {
                return;
            }
            double a9 = cVar.a();
            if (a9 >= 0.0d) {
                b9.a(a9);
            }
        }
    }

    public interface b {
        void a(double d2);
    }

    public c(Context context) {
        this.f17539d = context;
        this.f17540e = (AudioManager) context.getApplicationContext().getSystemService(o.f8445b);
    }

    public final double a() {
        AudioManager audioManager = this.f17540e;
        double streamVolume = ((this.f17540e != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f17536a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f17542g;
    }

    public final void c() {
        if (this.f17539d != null) {
            this.f17543h = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f17537b);
            this.f17539d.registerReceiver(this.f17543h, intentFilter);
            this.f17541f = true;
        }
    }

    public final void d() {
        Context context;
        if (!this.f17541f || (context = this.f17539d) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f17543h);
            this.f17542g = null;
            this.f17541f = false;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(b bVar) {
        this.f17542g = bVar;
    }
}
