package ru.yandex.taxi.masstransit.holder;

import defpackage.ax30;
import defpackage.bx30;
import defpackage.c040;
import defpackage.cx30;
import defpackage.nw8;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w3t0;
import defpackage.y3t0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.datasource.routing.f;

/* loaded from: classes6.dex */
public final class c {
    public final f a;
    public final tt2 b;
    public final nw8 c;
    public final zuj0 d;

    public c(f fVar, tt2 tt2Var, nw8 nw8Var, zuj0 zuj0Var) {
        this.a = fVar;
        this.b = tt2Var;
        this.c = nw8Var;
        this.d = zuj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x009d, code lost:
    
        if (kotlin.collections.a.G(r8, r6 != null ? r6.h : null) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cx30 a(ArrayList arrayList, List list, List list2) {
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c040 c040Var = (c040) it.next();
            String str = c040Var.a;
            List list3 = c040Var.b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list3) {
                if (((y3t0) obj).getType() != MtTransportType.UNKNOWN) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                y3t0 y3t0Var = (y3t0) it2.next();
                String str2 = null;
                w3t0 w3t0Var = y3t0Var instanceof w3t0 ? (w3t0) y3t0Var : null;
                MtTransportType type = y3t0Var.getType();
                if (type == MtTransportType.BUS) {
                    if (kotlin.collections.a.G(list, w3t0Var != null ? w3t0Var.j : null)) {
                        type = MtTransportType.AEROEXPRESS_BUS;
                        String mapkitType = type.getMapkitType();
                        if (w3t0Var != null || (r9 = w3t0Var.j) == null || type == MtTransportType.AEROEXPRESS) {
                            String str3 = null;
                        }
                        String str4 = w3t0Var == null ? w3t0Var.h : null;
                        if (w3t0Var == null) {
                            str2 = w3t0Var.i;
                        }
                        arrayList4.add(new bx30(mapkitType, str4, str2, str3));
                    }
                }
                if (type == MtTransportType.SUBURBAN) {
                    List list4 = list2;
                    if (!kotlin.collections.a.G(list4, w3t0Var != null ? w3t0Var.i : null)) {
                    }
                    type = MtTransportType.AEROEXPRESS;
                }
                String mapkitType2 = type.getMapkitType();
                if (w3t0Var != null) {
                }
                String str32 = null;
                if (w3t0Var == null) {
                }
                if (w3t0Var == null) {
                }
                arrayList4.add(new bx30(mapkitType2, str4, str2, str32));
            }
            arrayList2.add(new ax30(str, arrayList4));
        }
        return new cx30(arrayList2);
    }

    public final tpr b() {
        g I = e.I(e.d(this.a.i), new MtSimpleRoutesHolder$stateFlow$1(this, null));
        this.b.getClass();
        return e.F(I, uyj.a);
    }
}
