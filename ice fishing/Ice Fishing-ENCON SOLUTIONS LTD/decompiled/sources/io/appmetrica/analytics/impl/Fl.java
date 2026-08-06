package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Fl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hl f4397a;

    public Fl(Hl hl) {
        this.f4397a = hl;
    }

    public final void a(String str, Jl jl, C0415fm c0415fm) {
        ArrayList arrayList;
        synchronized (this.f4397a.f4486b) {
            try {
                Collection collection = (Collection) this.f4397a.f4485a.f6733a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ql) it.next()).a(jl, c0415fm);
        }
    }
}
