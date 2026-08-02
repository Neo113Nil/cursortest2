package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class w8 extends AbstractSet implements Set, fgx {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
