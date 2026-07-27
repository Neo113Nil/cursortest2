package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class CD extends AbstractC4040vD {

    /* renamed from: I, reason: collision with root package name */
    public List f24063I;

    public CD(RB rb, boolean z3) {
        super(rb, z3, true);
        List arrayList;
        if (rb.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = rb.size();
            MA.q(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < rb.size(); i++) {
            arrayList.add(null);
        }
        this.f24063I = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4040vD
    public final void s(int i) {
        this.f34676E = null;
        this.f24063I = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4040vD
    public final void x(int i, Object obj) {
        List list = this.f24063I;
        if (list != null) {
            list.set(i, new DD(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4040vD
    public final void y() {
        List<DD> list = this.f24063I;
        if (list != null) {
            int size = list.size();
            MA.q(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (DD dd : list) {
                arrayList.add(dd != null ? dd.f24367a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
