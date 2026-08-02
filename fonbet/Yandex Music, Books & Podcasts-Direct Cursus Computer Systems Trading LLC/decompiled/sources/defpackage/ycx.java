package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ycx extends hcx {
    public final /* synthetic */ adx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycx(adx adxVar) {
        super(1);
        this.e = adxVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        adx adxVar = this.e;
        tyf.P(i, adxVar.h);
        Object[] objArr = adxVar.g;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.h;
    }
}
