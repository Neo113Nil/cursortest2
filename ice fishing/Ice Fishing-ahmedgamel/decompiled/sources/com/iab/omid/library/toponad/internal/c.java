package com.iab.omid.library.toponad.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f36240c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f36241a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f36242b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f36240c;
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f36242b);
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f36241a);
    }

    public boolean d() {
        return this.f36242b.size() > 0;
    }

    public void a(com.iab.omid.library.toponad.adsession.a aVar) {
        this.f36241a.add(aVar);
    }

    public void b(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d2 = d();
        this.f36241a.remove(aVar);
        this.f36242b.remove(aVar);
        if (!d2 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d2 = d();
        this.f36242b.add(aVar);
        if (d2) {
            return;
        }
        i.c().d();
    }
}
