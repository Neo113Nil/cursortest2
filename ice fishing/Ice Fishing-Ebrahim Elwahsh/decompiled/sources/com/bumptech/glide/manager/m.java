package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f23616a;

    public m(o oVar) {
        this.f23616a = oVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z8) {
        ArrayList arrayList;
        N1.p.a();
        synchronized (this.f23616a) {
            arrayList = new ArrayList((HashSet) this.f23616a.f23625w);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z8);
        }
    }
}
