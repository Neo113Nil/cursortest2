package com.yandex.passport.internal.core.accounts;

import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class m {
    public final com.yandex.passport.internal.database.d a;
    public final com.yandex.passport.internal.network.mappers.d b;

    public m(com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.network.mappers.d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        this.a = dVar;
        this.b = dVar2;
    }

    public final ArrayList a(ArrayList arrayList) {
        com.yandex.passport.internal.database.d dVar = this.a;
        ArrayList g = dVar.g();
        ArrayList arrayList2 = new ArrayList(v75.o(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) it.next();
            fVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a.a);
            sb.append(':');
            sb.append(fVar.b);
            arrayList2.add(sb.toString());
        }
        ArrayList b = dVar.b();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (CollectionsKt.I(arrayList2, ((com.yandex.passport.internal.b) next).c)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            com.yandex.passport.internal.b bVar = (com.yandex.passport.internal.b) next2;
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (Intrinsics.d(bVar.c, ((com.yandex.passport.internal.b) it4.next()).c)) {
                        break;
                    }
                }
            }
            arrayList4.add(next2);
        }
        return arrayList4;
    }

    public final ArrayList b(ArrayList arrayList) {
        com.yandex.passport.common.core.b bVar;
        com.yandex.passport.internal.database.d dVar = this.a;
        ArrayList g = dVar.g();
        ArrayList arrayList2 = new ArrayList(v75.o(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) it.next();
            fVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a.a);
            sb.append(':');
            sb.append(fVar.b);
            arrayList2.add(sb.toString());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str = (String) next;
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.d(str, ((com.yandex.passport.internal.b) it3.next()).c)) {
                        str.getClass();
                        int R = StringsKt.R(str, ':', 0, false);
                        com.yandex.passport.common.core.f fVar2 = null;
                        if (R >= 1 && R != str.length() - 1) {
                            String substring = str.substring(0, R);
                            try {
                                long parseLong = Long.parseLong(str.substring(R + 1));
                                if (parseLong > 0) {
                                    try {
                                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                                        int parseInt = Integer.parseInt(substring);
                                        aVar.getClass();
                                        bVar = com.yandex.passport.common.core.a.b(parseInt);
                                    } catch (Exception unused) {
                                        bVar = com.yandex.passport.common.core.b.c;
                                    }
                                    fVar2 = new com.yandex.passport.common.core.f(bVar, parseLong);
                                }
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (fVar2 != null) {
                            arrayList3.add(fVar2);
                        }
                    }
                }
            }
            arrayList4.add(next);
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            dVar.a((com.yandex.passport.common.core.f) it4.next());
        }
        ArrayList b = dVar.b();
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = b.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (CollectionsKt.I(arrayList4, ((com.yandex.passport.internal.b) next2).c)) {
                arrayList5.add(next2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            com.yandex.passport.internal.l b2 = this.b.b((com.yandex.passport.internal.b) it6.next());
            if (b2 != null) {
                arrayList6.add(b2);
            }
        }
        return arrayList6;
    }
}
