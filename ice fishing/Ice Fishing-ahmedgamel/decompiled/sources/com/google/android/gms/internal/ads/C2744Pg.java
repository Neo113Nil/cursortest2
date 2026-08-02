package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2744Pg implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f27628n = new ArrayList();

    public final boolean a(InterfaceC4084vh interfaceC4084vh) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f27628n.iterator();
        while (it.hasNext()) {
            C2727Og c2727Og = (C2727Og) it.next();
            if (c2727Og.f27404v == interfaceC4084vh) {
                arrayList.add(c2727Og);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2727Og) it2.next()).f27405w.k();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f27628n.iterator();
    }
}
