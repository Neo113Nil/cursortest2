package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class rsn extends yde {
    public final /* synthetic */ ssn c;

    public rsn(ssn ssnVar) {
        this.c = ssnVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ssn ssnVar = this.c;
        o2g.N(i, ssnVar.g);
        Object[] objArr = ssnVar.e;
        int i2 = i * 2;
        int i3 = ssnVar.f;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.qde
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.g;
    }

    @Override // defpackage.yde, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
