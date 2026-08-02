package com.yandex.passport.internal;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.SparseArray;
import defpackage.c5b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public final List a;
    public final com.yandex.passport.internal.network.mappers.d b;

    public d(List list, com.yandex.passport.internal.network.mappers.d dVar) {
        list.getClass();
        dVar.getClass();
        this.a = list;
        this.b = dVar;
    }

    public final b a(Account account) {
        account.getClass();
        return m.b(this.a, account, null, null, this.b);
    }

    public final ArrayList b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).d());
        }
        return arrayList;
    }

    public final l c(String str) {
        str.getClass();
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            l b = this.b.b((b) it.next());
            if ((b != null ? b.e.y : null) != null && TextUtils.equals(str, b.e.y)) {
                return b;
            }
        }
    }

    public final l d(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l b = this.b.b((b) it.next());
            if (b != null && b.b.b == j) {
                return b;
            }
        }
        return null;
    }

    public final l e(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        return m.c(this.a, fVar, null, this.b);
    }

    public final l f(String str) {
        str.getClass();
        return m.c(this.a, null, str, this.b);
    }

    public final ArrayList g() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l b = this.b.b((b) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public final List h(l lVar) {
        com.yandex.passport.common.core.g gVar = lVar.e;
        com.yandex.passport.common.core.f fVar = lVar.b;
        int i = gVar.h;
        if (i != 1 && i != 5 && i != 6 && i != 7 && i != 10) {
            return c5b.a;
        }
        SparseArray sparseArray = new SparseArray();
        List list = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l b = this.b.b((b) it.next());
            if (b != null && fVar.a == b.b.a) {
                int i2 = b.e.h;
                if (sparseArray.indexOfKey(i2) >= 0) {
                    ((List) sparseArray.get(i2)).add(b);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b);
                    sparseArray.put(i2, arrayList);
                }
            }
        }
        ArrayList<l> arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        Object obj = sparseArray.get(1, new ArrayList());
        obj.getClass();
        arrayList2.addAll((Collection) obj);
        Object obj2 = sparseArray.get(6, new ArrayList());
        obj2.getClass();
        arrayList2.addAll((Collection) obj2);
        Object obj3 = sparseArray.get(7, new ArrayList());
        obj3.getClass();
        arrayList2.addAll((Collection) obj3);
        Object obj4 = sparseArray.get(5, new ArrayList());
        obj4.getClass();
        arrayList2.addAll((Collection) obj4);
        Object obj5 = sparseArray.get(10, new ArrayList());
        obj5.getClass();
        arrayList3.addAll((Collection) obj5);
        boolean z = i != 10;
        ArrayList arrayList4 = z ? arrayList2 : arrayList3;
        if (z) {
            arrayList2 = arrayList3;
        }
        if (!arrayList4.isEmpty()) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.d(((l) it2.next()).b, fVar)) {
                    ArrayList arrayList5 = new ArrayList();
                    for (l lVar2 : arrayList2) {
                        arrayList5.add(new i(lVar2, z ? lVar : lVar2, z ? lVar2 : lVar));
                    }
                    return arrayList5;
                }
            }
        }
        return c5b.a;
    }
}
