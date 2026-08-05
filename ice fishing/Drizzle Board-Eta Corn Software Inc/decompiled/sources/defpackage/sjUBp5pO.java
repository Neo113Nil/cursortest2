package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class sjUBp5pO extends AbstractList implements List, yn {
    public abstract Object NCTxEWno(int i);

    public abstract int qoPGr6Ce();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return NCTxEWno(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return qoPGr6Ce();
    }
}
