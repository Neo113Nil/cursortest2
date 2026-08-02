package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class r2r implements o2r {
    public final /* synthetic */ s2r a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ t2r c;
    public final /* synthetic */ Iterator d;
    public final /* synthetic */ p2r e;

    public r2r(s2r s2rVar, ArrayList arrayList, t2r t2rVar, Iterator it, p2r p2rVar) {
        this.a = s2rVar;
        this.b = arrayList;
        this.c = t2rVar;
        this.d = it;
        this.e = p2rVar;
    }

    @Override // defpackage.o2r
    public final void a(k2r k2rVar) {
        s2r s2rVar = this.a;
        s2rVar.c = null;
        ArrayList arrayList = this.b;
        arrayList.add(k2rVar);
        s2rVar.b = this.c.c(this.d, arrayList, this.e);
    }

    @Override // defpackage.o2r
    public final void b(i2r i2rVar) {
        this.e.b(i2rVar);
    }
}
