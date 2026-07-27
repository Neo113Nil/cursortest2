package com.iab.omid.library.toponad.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.anythink.basead.exoplayer.k.o;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36390a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f36391b;

    /* renamed from: c, reason: collision with root package name */
    private final a f36392c;

    /* renamed from: d, reason: collision with root package name */
    private final c f36393d;

    /* renamed from: e, reason: collision with root package name */
    private float f36394e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f36390a = context;
        this.f36391b = (AudioManager) context.getSystemService(o.f8602b);
        this.f36392c = aVar;
        this.f36393d = cVar;
    }

    private float a() {
        return this.f36392c.a(this.f36391b.getStreamVolume(3), this.f36391b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f36393d.a(this.f36394e);
    }

    public void c() {
        this.f36394e = a();
        b();
        this.f36390a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f36390a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z8) {
        super.onChange(z8);
        float a9 = a();
        if (a(a9)) {
            this.f36394e = a9;
            b();
        }
    }

    private boolean a(float f6) {
        return f6 != this.f36394e;
    }
}
