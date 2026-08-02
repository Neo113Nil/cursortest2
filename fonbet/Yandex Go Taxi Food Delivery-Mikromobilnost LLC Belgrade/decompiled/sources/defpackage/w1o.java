package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class w1o implements Iterable {
    public final ArrayList a;

    public w1o(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
