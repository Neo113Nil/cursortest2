package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class k3b extends n3b {
    public long c;
    public ymq d;

    public k3b() {
        super(0, 3);
        this.c = 9205357640488583168L;
        this.d = xmq.a;
    }

    @Override // defpackage.c3b
    public final void a(ukd ukdVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // defpackage.c3b
    public final ukd b() {
        ukd b;
        c3b c3bVar = (c3b) CollectionsKt.l0(this.b);
        return (c3bVar == null || (b = c3bVar.b()) == null) ? o5g.z(skd.a) : b;
    }

    @Override // defpackage.c3b
    public final c3b copy() {
        k3b k3bVar = new k3b();
        k3bVar.c = this.c;
        k3bVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c3b) it.next()).copy());
        }
        k3bVar.b.addAll(arrayList2);
        return k3bVar;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) fma.d(this.c)) + ", sizeMode=" + this.d + ", children=[\n" + c() + "\n])";
    }
}
