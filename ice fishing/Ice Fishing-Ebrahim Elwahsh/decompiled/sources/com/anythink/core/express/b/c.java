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
    public static double f17694a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final String f17695b = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: c, reason: collision with root package name */
    private static final String f17696c = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* renamed from: d, reason: collision with root package name */
    private Context f17697d;

    /* renamed from: e, reason: collision with root package name */
    private AudioManager f17698e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17699f = false;

    /* renamed from: g, reason: collision with root package name */
    private b f17700g;

    /* renamed from: h, reason: collision with root package name */
    private a f17701h;

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<c> f17702a;

        public a(c cVar) {
            this.f17702a = new WeakReference<>(cVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar;
            b b9;
            if (!c.f17695b.equals(intent.getAction()) || intent.getIntExtra(c.f17696c, -1) != 3 || (cVar = this.f17702a.get()) == null || (b9 = cVar.b()) == null) {
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
        this.f17697d = context;
        this.f17698e = (AudioManager) context.getApplicationContext().getSystemService(o.f8602b);
    }

    public final double a() {
        AudioManager audioManager = this.f17698e;
        double streamVolume = ((this.f17698e != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f17694a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f17700g;
    }

    public final void c() {
        if (this.f17697d != null) {
            this.f17701h = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f17695b);
            this.f17697d.registerReceiver(this.f17701h, intentFilter);
            this.f17699f = true;
        }
    }

    public final void d() {
        Context context;
        if (!this.f17699f || (context = this.f17697d) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f17701h);
            this.f17700g = null;
            this.f17699f = false;
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public final void a(b bVar) {
        this.f17700g = bVar;
    }
}
