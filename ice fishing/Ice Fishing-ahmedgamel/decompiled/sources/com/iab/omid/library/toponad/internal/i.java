package com.iab.omid.library.toponad.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.toponad.internal.d;
import com.iab.omid.library.toponad.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class i implements d.a, com.iab.omid.library.toponad.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f36258f;

    /* renamed from: a, reason: collision with root package name */
    private float f36259a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.e f36260b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.b f36261c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.toponad.devicevolume.d f36262d;

    /* renamed from: e, reason: collision with root package name */
    private c f36263e;

    public i(com.iab.omid.library.toponad.devicevolume.e eVar, com.iab.omid.library.toponad.devicevolume.b bVar) {
        this.f36260b = eVar;
        this.f36261c = bVar;
    }

    private c a() {
        if (this.f36263e == null) {
            this.f36263e = c.c();
        }
        return this.f36263e;
    }

    public static i c() {
        if (f36258f == null) {
            f36258f = new i(new com.iab.omid.library.toponad.devicevolume.e(), new com.iab.omid.library.toponad.devicevolume.b());
        }
        return f36258f;
    }

    public float b() {
        return this.f36259a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f36262d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f36262d.d();
    }

    @Override // com.iab.omid.library.toponad.devicevolume.c
    public void a(float f3) {
        this.f36259a = f3;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f3);
        }
    }

    public void a(Context context) {
        this.f36262d = this.f36260b.a(new Handler(), context, this.f36261c.a(), this);
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z3) {
        if (z3) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
