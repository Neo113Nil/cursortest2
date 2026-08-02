package androidx.core.app;

import defpackage.hq0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d1 implements Iterable {
    public final ArrayList a = new ArrayList();
    public final hq0 b;

    public d1(hq0 hq0Var) {
        this.b = hq0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
