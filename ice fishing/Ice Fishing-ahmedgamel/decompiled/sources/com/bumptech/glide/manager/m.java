package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f24247a;

    public m(o oVar) {
        this.f24247a = oVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z6) {
        ArrayList arrayList;
        P1.p.a();
        synchronized (this.f24247a) {
            arrayList = new ArrayList((HashSet) this.f24247a.f24256w);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z6);
        }
    }
}
