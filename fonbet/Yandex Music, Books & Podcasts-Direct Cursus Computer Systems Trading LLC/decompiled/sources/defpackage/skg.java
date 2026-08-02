package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class skg extends oyc {
    public final String a;
    public final ArrayList b;
    public final mhb c;
    public final ArrayList d;
    public final bhb e;

    public skg(String str, ArrayList arrayList, mhb mhbVar, ArrayList arrayList2, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = mhbVar;
        this.d = arrayList2;
        Set set = jhb.c;
        str2.getClass();
        this.e = new bhb(str2);
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : this.d) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            linkedHashMap.put((String) obj, list.get(i));
            i = i2;
        }
        return new h4b(new g06(new atn(14, linkedHashMap, (xxt) g06Var.a), (es6) g06Var.b, (cib) g06Var.c, (pv9) g06Var.d)).h(this.e);
    }

    @Override // defpackage.oyc
    public final List b() {
        return this.b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return this.a;
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return this.c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return false;
    }
}
