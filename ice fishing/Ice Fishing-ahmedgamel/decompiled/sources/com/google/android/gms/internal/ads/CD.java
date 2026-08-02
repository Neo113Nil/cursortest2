package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class CD extends AbstractC4063vD {

    /* renamed from: I, reason: collision with root package name */
    public List f24826I;

    public CD(RB rb, boolean z6) {
        super(rb, z6, true);
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
        this.f24826I = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4063vD
    public final void s(int i) {
        this.f35439E = null;
        this.f24826I = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4063vD
    public final void x(int i, Object obj) {
        List list = this.f24826I;
        if (list != null) {
            list.set(i, new DD(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4063vD
    public final void y() {
        List<DD> list = this.f24826I;
        if (list != null) {
            int size = list.size();
            MA.q(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (DD dd : list) {
                arrayList.add(dd != null ? dd.f25112a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
