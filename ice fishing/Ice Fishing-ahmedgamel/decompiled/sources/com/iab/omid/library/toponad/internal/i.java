package com.iab.omid.library.toponad.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.toponad.internal.d;
import com.iab.omid.library.toponad.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class i implements d.a, com.iab.omid.library.toponad.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f37025f;

    /* renamed from: a, reason: collision with root package name */
    private float f37026a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.e f37027b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.b f37028c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.toponad.devicevolume.d f37029d;

    /* renamed from: e, reason: collision with root package name */
    private c f37030e;

    public i(com.iab.omid.library.toponad.devicevolume.e eVar, com.iab.omid.library.toponad.devicevolume.b bVar) {
        this.f37027b = eVar;
        this.f37028c = bVar;
    }

    private c a() {
        if (this.f37030e == null) {
            this.f37030e = c.c();
        }
        return this.f37030e;
    }

    public static i c() {
        if (f37025f == null) {
            f37025f = new i(new com.iab.omid.library.toponad.devicevolume.e(), new com.iab.omid.library.toponad.devicevolume.b());
        }
        return f37025f;
    }

    public float b() {
        return this.f37026a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f37029d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f37029d.d();
    }

    @Override // com.iab.omid.library.toponad.devicevolume.c
    public void a(float f2) {
        this.f37026a = f2;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f37029d = this.f37027b.a(new Handler(), context, this.f37028c.a(), this);
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z6) {
        if (z6) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
