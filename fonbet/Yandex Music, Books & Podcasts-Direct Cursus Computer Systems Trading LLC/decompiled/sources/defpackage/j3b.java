package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j3b extends n3b {
    public ukd c;
    public int d;
    public int e;

    public j3b() {
        super(0, 3);
        this.c = skd.a;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.c3b
    public final void a(ukd ukdVar) {
        this.c = ukdVar;
    }

    @Override // defpackage.c3b
    public final ukd b() {
        return this.c;
    }

    @Override // defpackage.c3b
    public final c3b copy() {
        j3b j3bVar = new j3b();
        j3bVar.c = this.c;
        j3bVar.d = this.d;
        j3bVar.e = this.e;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c3b) it.next()).copy());
        }
        j3bVar.b.addAll(arrayList2);
        return j3bVar;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.c + ", horizontalAlignment=" + ((Object) d40.b(this.d)) + ", verticalAlignment=" + ((Object) e40.b(this.e)) + ", children=[\n" + c() + "\n])";
    }
}
