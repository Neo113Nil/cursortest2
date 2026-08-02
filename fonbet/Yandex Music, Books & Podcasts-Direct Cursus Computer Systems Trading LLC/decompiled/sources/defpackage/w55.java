package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class w55 implements h6s {
    public final ArrayList a;
    public final int b;

    public w55(Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection);
        this.a = arrayList;
        this.b = arrayList.size();
    }

    @Override // defpackage.h6s
    public final int f() {
        return this.b;
    }

    @Override // defpackage.h6s
    public final Object get(int i) {
        return this.a.get(i);
    }
}
