package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class in3 extends qn3 {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new an3(this);
    }
}
