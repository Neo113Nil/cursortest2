package defpackage;

/* loaded from: classes.dex */
public final class qu0 extends defpackage.Uv8CGu3G implements java.util.Set, java.util.Collection, defpackage.g90 {
    public static final defpackage.qu0 EXtogiMhuM;
    public final defpackage.hu0 AARZUJiTa;
    public final java.lang.Object adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    static {
        defpackage.n nVar = defpackage.n.yIx6ChFVk;
        EXtogiMhuM = new defpackage.qu0(nVar, nVar, defpackage.hu0.AARZUJiTa);
    }

    public qu0(java.lang.Object obj, java.lang.Object obj2, defpackage.hu0 hu0Var) {
        this.adDC3e2L = obj;
        this.xiZrDbcSW0 = obj2;
        this.AARZUJiTa = hu0Var;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.AARZUJiTa.xiZrDbcSW0;
    }

    @Override // defpackage.SyNS6RMn, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return this.AARZUJiTa.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.f20(this.adDC3e2L, this.AARZUJiTa);
    }
}
