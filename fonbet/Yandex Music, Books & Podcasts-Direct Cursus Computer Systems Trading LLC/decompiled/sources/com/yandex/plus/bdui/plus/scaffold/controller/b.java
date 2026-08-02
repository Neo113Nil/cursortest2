package com.yandex.plus.bdui.plus.scaffold.controller;

import android.widget.FrameLayout;
import defpackage.c5b;
import defpackage.eta;
import defpackage.k5r;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class b {
    public final a a;
    public final FrameLayout b;
    public List c;
    public List d;

    public b(a aVar, FrameLayout frameLayout) {
        c5b c5bVar = c5b.a;
        c5bVar.getClass();
        c5bVar.getClass();
        this.a = aVar;
        this.b = frameLayout;
        this.c = c5bVar;
        this.d = c5bVar;
    }

    public static ArrayList a(ArrayList arrayList, a aVar) {
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.yandex.plus.bdui.ui.a aVar2 = (com.yandex.plus.bdui.ui.a) ((Pair) it.next()).b;
            arrayList2.add(new Pair(aVar2, aVar2.b(aVar)));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder(root=");
        sb.append(this.a);
        sb.append(", contentContainer=");
        sb.append(this.b);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", footers=");
        return eta.h(sb, this.d, ')');
    }
}
