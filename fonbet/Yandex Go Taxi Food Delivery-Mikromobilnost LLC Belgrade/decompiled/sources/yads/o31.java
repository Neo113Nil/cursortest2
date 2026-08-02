package yads;

import defpackage.sw81;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public final class o31 extends sw81 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object b;
    public final Object c;

    public o31(Object obj, List list) {
        this.b = obj;
        this.c = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
