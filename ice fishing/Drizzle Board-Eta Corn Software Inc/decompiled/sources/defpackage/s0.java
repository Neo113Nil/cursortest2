package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s0 extends AbstractSet {
    public final /* synthetic */ x0 NCTxEWno;

    public s0(x0 x0Var) {
        this.NCTxEWno = x0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new v0(this.NCTxEWno);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.NCTxEWno.wxUZMvaN;
    }
}
