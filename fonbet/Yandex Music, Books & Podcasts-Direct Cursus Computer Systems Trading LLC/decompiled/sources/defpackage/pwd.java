package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class pwd extends zsc {
    public final zdg b;
    public final beg c;

    public pwd(zdg zdgVar, beg begVar) {
        super(0);
        o2g.O(zdgVar, "delegate");
        this.b = zdgVar;
        o2g.O(begVar, "healthListener");
        this.c = begVar;
    }

    @Override // defpackage.zdg
    public final void H(beg begVar) {
        this.b.H(new owd(0, this, begVar));
    }

    @Override // defpackage.zsc
    public final zdg S() {
        return this.b;
    }

    @Override // defpackage.zdg
    public final xu1 u() {
        xu1 u = this.b.u();
        u.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(ceg.e, bool);
        for (Map.Entry entry : u.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((wu1) entry.getKey(), entry.getValue());
            }
        }
        return new xu1(identityHashMap);
    }
}
