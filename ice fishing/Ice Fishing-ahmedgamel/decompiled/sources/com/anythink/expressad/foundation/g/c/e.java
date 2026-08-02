package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private a f19967a;

    /* renamed from: b, reason: collision with root package name */
    private String f19968b;

    /* renamed from: c, reason: collision with root package name */
    private e f19969c;

    /* renamed from: d, reason: collision with root package name */
    private List<e> f19970d;

    public final a a() {
        return this.f19967a;
    }

    public final String b() {
        return this.f19968b;
    }

    public final e c() {
        return this.f19969c;
    }

    public final List<e> d() {
        return this.f19970d;
    }

    private void b(e eVar) {
        if (this.f19970d == null) {
            this.f19970d = new ArrayList();
        }
        eVar.f19969c = this;
        this.f19970d.add(eVar);
    }

    public final void a(a aVar) {
        this.f19967a = aVar;
    }

    public final void a(String str) {
        this.f19968b = str;
    }

    private void a(e eVar) {
        this.f19969c = eVar;
    }

    public final void a(a aVar, String str) {
        e eVar = new e();
        eVar.f19967a = aVar;
        eVar.f19968b = str;
        b(eVar);
    }

    public final void a(List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
