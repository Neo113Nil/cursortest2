package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2724Pg implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f26840n = new ArrayList();

    public final boolean a(InterfaceC4061vh interfaceC4061vh) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26840n.iterator();
        while (it.hasNext()) {
            C2707Og c2707Og = (C2707Og) it.next();
            if (c2707Og.f26628v == interfaceC4061vh) {
                arrayList.add(c2707Og);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2707Og) it2.next()).f26629w.k();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f26840n.iterator();
    }
}
