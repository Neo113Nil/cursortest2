package v7;

import java.util.AbstractList;
import java.util.List;

/* renamed from: v7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5114e extends AbstractList implements List, J7.c {
    public abstract int a();

    public abstract Object c(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
