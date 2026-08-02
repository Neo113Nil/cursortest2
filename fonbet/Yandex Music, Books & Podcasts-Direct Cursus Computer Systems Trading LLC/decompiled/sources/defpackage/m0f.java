package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class m0f extends a {
    public final int b;
    public final int c;
    public final ArrayList d;

    public m0f(ArrayList arrayList, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = arrayList;
    }

    @Override // defpackage.w5
    public final int f() {
        return this.d.size() + this.b + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        if (i >= 0 && i < i2) {
            return null;
        }
        ArrayList arrayList = this.d;
        if (i < arrayList.size() + i2 && i2 <= i) {
            return arrayList.get(i - i2);
        }
        int size = arrayList.size() + i2;
        if (i < f() && size <= i) {
            return null;
        }
        l1j.k(f(), k5r.q(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
        return null;
    }
}
