package com.iab.omid.library.toponad.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f37007c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f37008a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f37009b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f37007c;
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f37009b);
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f37008a);
    }

    public boolean d() {
        return this.f37009b.size() > 0;
    }

    public void a(com.iab.omid.library.toponad.adsession.a aVar) {
        this.f37008a.add(aVar);
    }

    public void b(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d9 = d();
        this.f37008a.remove(aVar);
        this.f37009b.remove(aVar);
        if (!d9 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d9 = d();
        this.f37009b.add(aVar);
        if (d9) {
            return;
        }
        i.c().d();
    }
}
