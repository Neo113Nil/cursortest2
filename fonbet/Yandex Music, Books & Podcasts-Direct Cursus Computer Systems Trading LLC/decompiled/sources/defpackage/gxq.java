package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gxq implements Iterable, j9f {
    public final fxq a;
    public final int b;
    public final int c;

    public gxq(fxq fxqVar, int i, int i2) {
        this.a = fxqVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        ArrayList arrayList;
        int d;
        fxq fxqVar = this.a;
        if (fxqVar.h != this.c) {
            hxq.e();
        }
        HashMap hashMap = fxqVar.j;
        w80 w80Var = null;
        int i2 = this.b;
        if (hashMap != null) {
            if (fxqVar.g) {
                pq5.c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i2 >= 0 && i2 < (i = fxqVar.b) && (d = hxq.d((arrayList = fxqVar.i), i2, i)) >= 0) {
                w80Var = (w80) arrayList.get(d);
            }
            if (w80Var != null) {
            }
        }
        return new pqd(fxqVar, i2 + 1, fxqVar.a[(i2 * 5) + 3] + i2);
    }
}
