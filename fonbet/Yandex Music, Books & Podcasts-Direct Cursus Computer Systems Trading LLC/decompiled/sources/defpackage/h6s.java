package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public interface h6s extends Iterable, j9f {
    int f();

    Object get(int i);

    @Override // java.lang.Iterable
    default Iterator iterator() {
        return new j1f(f(), this);
    }
}
