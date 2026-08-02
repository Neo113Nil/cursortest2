package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class utn extends fpn {
    public final ttn d;
    public final LinkedHashSet e = new LinkedHashSet();

    public utn(ttn ttnVar) {
        this.d = ttnVar;
    }

    @Override // defpackage.fpn
    public final void a() {
        super.a();
        LinkedHashSet linkedHashSet = this.e;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            yd5.R(this.d, ((opn) it.next()).a);
        }
        linkedHashSet.clear();
    }

    @Override // defpackage.fpn
    public final opn b(int i) {
        opn b = super.b(i);
        if (b == null) {
            return null;
        }
        this.e.remove(b);
        return b;
    }

    @Override // defpackage.fpn
    public final void d(opn opnVar) {
        super.d(opnVar);
        this.e.add(opnVar);
    }
}
