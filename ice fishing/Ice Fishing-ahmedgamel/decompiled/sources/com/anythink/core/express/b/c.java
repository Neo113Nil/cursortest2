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
    public static double f18323a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final String f18324b = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: c, reason: collision with root package name */
    private static final String f18325c = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* renamed from: d, reason: collision with root package name */
    private Context f18326d;

    /* renamed from: e, reason: collision with root package name */
    private AudioManager f18327e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18328f = false;

    /* renamed from: g, reason: collision with root package name */
    private b f18329g;

    /* renamed from: h, reason: collision with root package name */
    private a f18330h;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<c> f18331a;

        public a(c cVar) {
            this.f18331a = new WeakReference<>(cVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar;
            b b9;
            if (!c.f18324b.equals(intent.getAction()) || intent.getIntExtra(c.f18325c, -1) != 3 || (cVar = this.f18331a.get()) == null || (b9 = cVar.b()) == null) {
                return;
            }
            double a9 = cVar.a();
            if (a9 >= 0.0d) {
                b9.a(a9);
            }
        }
    }

    public interface b {
        void a(double d9);
    }

    public c(Context context) {
        this.f18326d = context;
        this.f18327e = (AudioManager) context.getApplicationContext().getSystemService(o.f9231b);
    }

    public final double a() {
        AudioManager audioManager = this.f18327e;
        double streamVolume = ((this.f18327e != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f18323a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f18329g;
    }

    public final void c() {
        if (this.f18326d != null) {
            this.f18330h = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f18324b);
            this.f18326d.registerReceiver(this.f18330h, intentFilter);
            this.f18328f = true;
        }
    }

    public final void d() {
        Context context;
        if (!this.f18328f || (context = this.f18326d) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f18330h);
            this.f18329g = null;
            this.f18328f = false;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(b bVar) {
        this.f18329g = bVar;
    }
}
