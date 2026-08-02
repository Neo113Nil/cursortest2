package defpackage;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class h8 extends AbstractList implements List, l9f {
    public abstract Object a(int i);

    public abstract int f();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return f();
    }
}
