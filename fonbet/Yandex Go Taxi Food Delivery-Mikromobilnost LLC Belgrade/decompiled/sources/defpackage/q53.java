package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q53 extends AbstractSet {
    public final /* synthetic */ w53 a;

    public q53(w53 w53Var) {
        this.a = w53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new t53(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
