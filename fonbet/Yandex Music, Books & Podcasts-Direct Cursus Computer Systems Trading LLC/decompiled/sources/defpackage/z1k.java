package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class z1k {
    public final hyd a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public final zi3 g;
    public final zi3 h;
    public final LinkedHashMap i;
    public final ime j;

    public z1k(hyd hydVar) {
        this.a = hydVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.g = men.g(-1, 6, null);
        this.h = men.g(-1, 6, null);
        this.i = new LinkedHashMap();
        ime imeVar = new ime(15);
        imeVar.W(pfg.a, mfg.b);
        this.j = imeVar;
    }

    public final t4k a(fiu fiuVar) {
        Integer num;
        hyd hydVar = this.a;
        int i = hydVar.a;
        ArrayList arrayList = this.c;
        List w0 = CollectionsKt.w0(arrayList);
        if (fiuVar != null) {
            int i2 = fiuVar.e;
            int b = b();
            int i3 = -this.d;
            int size = (arrayList.size() - 1) - this.d;
            int i4 = i3;
            while (i4 < i2) {
                b += i4 > size ? i : ((q4k) arrayList.get(this.d + i4)).a.size();
                i4++;
            }
            int i5 = b + fiuVar.f;
            if (i2 < i3) {
                i5 -= i;
            }
            num = Integer.valueOf(i5);
        } else {
            num = null;
        }
        return new t4k(w0, num, hydVar, b());
    }

    public final int b() {
        if (this.a.c) {
            return this.e;
        }
        return 0;
    }

    public final boolean c(int i, pfg pfgVar, q4k q4kVar) {
        pfgVar.getClass();
        q4kVar.getClass();
        int i2 = q4kVar.d;
        List list = q4kVar.a;
        int i3 = q4kVar.e;
        int ordinal = pfgVar.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (ordinal == 0) {
            if (!arrayList2.isEmpty()) {
                xq0.q("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                xq0.q("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(q4kVar);
            this.d = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this.e = i2;
            return true;
        }
        LinkedHashMap linkedHashMap = this.i;
        if (ordinal != 1) {
            if (ordinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                xq0.q("should've received an init before append");
                return false;
            }
            if (i == 0) {
                arrayList.add(q4kVar);
                if (i3 == Integer.MIN_VALUE) {
                    int size = (this.a.c ? this.f : 0) - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this.f = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap.remove(pfg.c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                xq0.q("should've received an init before prepend");
                return false;
            }
            if (i == 0) {
                arrayList.add(0, q4kVar);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    int b = b() - list.size();
                    i2 = b < 0 ? 0 : b;
                }
                this.e = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap.remove(pfg.b);
                return true;
            }
        }
        return false;
    }

    public final a1k d(q4k q4kVar, pfg pfgVar) {
        int i;
        q4kVar.getClass();
        int ordinal = pfgVar.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal == 1) {
            i = 0 - this.d;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            i = (this.c.size() - this.d) - 1;
        }
        List c = t75.c(new c7t(q4kVar.a, i));
        int ordinal2 = pfgVar.ordinal();
        hyd hydVar = this.a;
        ime imeVar = this.j;
        if (ordinal2 == 0) {
            a1k a1kVar = a1k.g;
            return qgg.k(c, b(), hydVar.c ? this.f : 0, imeVar.Z(), null);
        }
        if (ordinal2 == 1) {
            a1k a1kVar2 = a1k.g;
            int b = b();
            ofg Z = imeVar.Z();
            c.getClass();
            return new a1k(pfg.b, c, b, -1, Z, null);
        }
        if (ordinal2 != 2) {
            b6e.s();
            return null;
        }
        a1k a1kVar3 = a1k.g;
        int i2 = hydVar.c ? this.f : 0;
        ofg Z2 = imeVar.Z();
        c.getClass();
        return new a1k(pfg.c, c, -1, i2, Z2, null);
    }
}
