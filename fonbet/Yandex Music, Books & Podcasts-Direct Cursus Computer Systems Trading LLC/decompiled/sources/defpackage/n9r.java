package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n9r implements icc {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final l9r e;
    public final m9r[] f;
    public final long g;
    public final long h;

    public n9r(int i, int i2, long j, long j2, int i3, boolean z, l9r l9rVar, m9r[] m9rVarArr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = l9rVar;
        this.f = m9rVarArr;
    }

    @Override // defpackage.icc
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m9r m9rVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            kjr kjrVar = (kjr) arrayList.get(i);
            m9r m9rVar2 = this.f[kjrVar.b];
            if (m9rVar2 != m9rVar && m9rVar != null) {
                arrayList2.add(m9rVar.b((dsc[]) arrayList3.toArray(new dsc[0])));
                arrayList3.clear();
            }
            arrayList3.add(m9rVar2.j[kjrVar.c]);
            i++;
            m9rVar = m9rVar2;
        }
        if (m9rVar != null) {
            arrayList2.add(m9rVar.b((dsc[]) arrayList3.toArray(new dsc[0])));
        }
        return new n9r(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (m9r[]) arrayList2.toArray(new m9r[0]));
    }
}
