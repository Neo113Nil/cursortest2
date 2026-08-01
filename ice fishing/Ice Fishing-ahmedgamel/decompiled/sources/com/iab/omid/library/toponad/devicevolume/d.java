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
    private final Context f36228a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f36229b;

    /* renamed from: c, reason: collision with root package name */
    private final a f36230c;

    /* renamed from: d, reason: collision with root package name */
    private final c f36231d;

    /* renamed from: e, reason: collision with root package name */
    private float f36232e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f36228a = context;
        this.f36229b = (AudioManager) context.getSystemService(o.f8445b);
        this.f36230c = aVar;
        this.f36231d = cVar;
    }

    private float a() {
        return this.f36230c.a(this.f36229b.getStreamVolume(3), this.f36229b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f36231d.a(this.f36232e);
    }

    public void c() {
        this.f36232e = a();
        b();
        this.f36228a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f36228a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        super.onChange(z3);
        float a9 = a();
        if (a(a9)) {
            this.f36232e = a9;
            b();
        }
    }

    private boolean a(float f3) {
        return f3 != this.f36232e;
    }
}
