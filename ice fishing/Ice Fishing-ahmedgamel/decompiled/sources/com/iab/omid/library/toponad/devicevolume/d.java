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
    private final Context f36995a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f36996b;

    /* renamed from: c, reason: collision with root package name */
    private final a f36997c;

    /* renamed from: d, reason: collision with root package name */
    private final c f36998d;

    /* renamed from: e, reason: collision with root package name */
    private float f36999e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f36995a = context;
        this.f36996b = (AudioManager) context.getSystemService(o.f9231b);
        this.f36997c = aVar;
        this.f36998d = cVar;
    }

    private float a() {
        return this.f36997c.a(this.f36996b.getStreamVolume(3), this.f36996b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f36998d.a(this.f36999e);
    }

    public void c() {
        this.f36999e = a();
        b();
        this.f36995a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f36995a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z6) {
        super.onChange(z6);
        float a9 = a();
        if (a(a9)) {
            this.f36999e = a9;
            b();
        }
    }

    private boolean a(float f2) {
        return f2 != this.f36999e;
    }
}
