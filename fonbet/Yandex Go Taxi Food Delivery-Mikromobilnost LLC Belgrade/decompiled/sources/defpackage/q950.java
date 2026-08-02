package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class q950 implements Iterable, xfx {
    public final ArrayList a = new ArrayList(2);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.a).iterator();
    }
}
