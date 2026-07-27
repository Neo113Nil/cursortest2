package com.iab.omid.library.toponad.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.toponad.internal.d;
import com.iab.omid.library.toponad.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class i implements d.a, com.iab.omid.library.toponad.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f36420f;

    /* renamed from: a, reason: collision with root package name */
    private float f36421a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.e f36422b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.b f36423c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.toponad.devicevolume.d f36424d;

    /* renamed from: e, reason: collision with root package name */
    private c f36425e;

    public i(com.iab.omid.library.toponad.devicevolume.e eVar, com.iab.omid.library.toponad.devicevolume.b bVar) {
        this.f36422b = eVar;
        this.f36423c = bVar;
    }

    private c a() {
        if (this.f36425e == null) {
            this.f36425e = c.c();
        }
        return this.f36425e;
    }

    public static i c() {
        if (f36420f == null) {
            f36420f = new i(new com.iab.omid.library.toponad.devicevolume.e(), new com.iab.omid.library.toponad.devicevolume.b());
        }
        return f36420f;
    }

    public float b() {
        return this.f36421a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f36424d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f36424d.d();
    }

    @Override // com.iab.omid.library.toponad.devicevolume.c
    public void a(float f6) {
        this.f36421a = f6;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f6);
        }
    }

    public void a(Context context) {
        this.f36424d = this.f36422b.a(new Handler(), context, this.f36423c.a(), this);
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z8) {
        if (z8) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
