package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Mg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2672Mg implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f26358n = new ArrayList();

    public final boolean a(InterfaceC3858rh interfaceC3858rh) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26358n.iterator();
        while (it.hasNext()) {
            C2638Kg c2638Kg = (C2638Kg) it.next();
            if (c2638Kg.f25997v == interfaceC3858rh) {
                arrayList.add(c2638Kg);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2638Kg) it2.next()).f25998w.l();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f26358n.iterator();
    }
}
