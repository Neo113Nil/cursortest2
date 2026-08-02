package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q7x extends i6x {
    public final /* synthetic */ r7x c;

    public q7x(r7x r7xVar) {
        this.c = r7xVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        r7x r7xVar = this.c;
        hag.L(i, r7xVar.e);
        Object[] objArr = r7xVar.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.a6x
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
