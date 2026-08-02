package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class hn3 extends nn3 {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new an3(this);
    }
}
