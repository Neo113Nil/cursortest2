package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private a f19180a;

    /* renamed from: b, reason: collision with root package name */
    private String f19181b;

    /* renamed from: c, reason: collision with root package name */
    private e f19182c;

    /* renamed from: d, reason: collision with root package name */
    private List<e> f19183d;

    public final a a() {
        return this.f19180a;
    }

    public final String b() {
        return this.f19181b;
    }

    public final e c() {
        return this.f19182c;
    }

    public final List<e> d() {
        return this.f19183d;
    }

    private void b(e eVar) {
        if (this.f19183d == null) {
            this.f19183d = new ArrayList();
        }
        eVar.f19182c = this;
        this.f19183d.add(eVar);
    }

    public final void a(a aVar) {
        this.f19180a = aVar;
    }

    public final void a(String str) {
        this.f19181b = str;
    }

    private void a(e eVar) {
        this.f19182c = eVar;
    }

    public final void a(a aVar, String str) {
        e eVar = new e();
        eVar.f19180a = aVar;
        eVar.f19181b = str;
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
