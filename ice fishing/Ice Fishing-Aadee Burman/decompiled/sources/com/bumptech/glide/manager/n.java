package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f23462a;

    public n(p pVar) {
        this.f23462a = pVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z3) {
        ArrayList arrayList;
        N1.p.a();
        synchronized (this.f23462a) {
            arrayList = new ArrayList((HashSet) this.f23462a.f23471w);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z3);
        }
    }
}
