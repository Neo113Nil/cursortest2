package com.yandex.plus.core.insets;

import defpackage.qq6;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class a {
    public boolean a;
    public LinkedHashSet b;

    public final int a() {
        LinkedHashSet linkedHashSet = this.b;
        if (linkedHashSet.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashSet.iterator();
        if (!it.hasNext()) {
            qq6.d("Empty collection can't be reduced.");
            return 0;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public final void b() {
        this.b.add(8);
        this.a = true;
    }

    public final void c() {
        this.b.add(2);
    }

    public final void d() {
        this.b.add(1);
    }
}
