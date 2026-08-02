package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class j8 extends AbstractSet implements Set, o9f {
    public abstract int f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }
}
