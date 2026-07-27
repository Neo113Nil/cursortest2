package com.iab.omid.library.toponad.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f36402c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f36403a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.toponad.adsession.a> f36404b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f36402c;
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f36404b);
    }

    public Collection<com.iab.omid.library.toponad.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f36403a);
    }

    public boolean d() {
        return this.f36404b.size() > 0;
    }

    public void a(com.iab.omid.library.toponad.adsession.a aVar) {
        this.f36403a.add(aVar);
    }

    public void b(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d2 = d();
        this.f36403a.remove(aVar);
        this.f36404b.remove(aVar);
        if (!d2 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.toponad.adsession.a aVar) {
        boolean d2 = d();
        this.f36404b.add(aVar);
        if (d2) {
            return;
        }
        i.c().d();
    }
}
