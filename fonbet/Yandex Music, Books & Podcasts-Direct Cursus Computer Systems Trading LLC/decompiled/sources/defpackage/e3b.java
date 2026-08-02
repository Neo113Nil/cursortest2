package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e3b extends n3b {
    public ukd c;
    public f40 d;

    public e3b() {
        super(0, 3);
        this.c = skd.a;
        this.d = f40.c;
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
        e3b e3bVar = new e3b();
        e3bVar.c = this.c;
        e3bVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c3b) it.next()).copy());
        }
        e3bVar.b.addAll(arrayList2);
        return e3bVar;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.c + ", contentAlignment=" + this.d + "children=[\n" + c() + "\n])";
    }
}
