package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jy0 extends defpackage.BXaznwstz2U0 implements java.util.Set, java.util.Collection, defpackage.nb0 {
    public static final defpackage.jy0 e6mdH7fiFuta;
    public final defpackage.by0 P05cfTpS5W5L;
    public final java.lang.Object QiMR8OkAhezm;
    public final java.lang.Object oh71FJcDz6S2;

    static {
        defpackage.jVUAPb5NnIYW jvuapb5nniyw = defpackage.jVUAPb5NnIYW.BXaznwstz2U0;
        e6mdH7fiFuta = new defpackage.jy0(jvuapb5nniyw, jvuapb5nniyw, defpackage.by0.QiMR8OkAhezm);
    }

    public jy0(java.lang.Object obj, java.lang.Object obj2, defpackage.by0 by0Var) {
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
        this.P05cfTpS5W5L = by0Var;
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        return this.P05cfTpS5W5L.oh71FJcDz6S2;
    }

    @Override // defpackage.lr1, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return this.P05cfTpS5W5L.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.l30(this.oh71FJcDz6S2, this.P05cfTpS5W5L);
    }
}
