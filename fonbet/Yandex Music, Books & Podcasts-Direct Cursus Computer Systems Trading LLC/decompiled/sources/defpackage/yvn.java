package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yvn extends n3b {
    public final int c;
    public ukd d;

    public yvn(int i) {
        super(i, 2);
        this.c = i;
        this.d = skd.a;
    }

    @Override // defpackage.c3b
    public final void a(ukd ukdVar) {
        this.d = ukdVar;
    }

    @Override // defpackage.c3b
    public final ukd b() {
        return this.d;
    }

    @Override // defpackage.c3b
    public final c3b copy() {
        yvn yvnVar = new yvn(this.c);
        yvnVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c3b) it.next()).copy());
        }
        yvnVar.b.addAll(arrayList2);
        return yvnVar;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.d + ", children=[\n" + c() + "\n])";
    }
}
