package defpackage;

import java.util.Iterator;
import kotlin.collections.b;
import kotlin.collections.c;

/* loaded from: classes5.dex */
public final class k7 extends c {
    public final /* synthetic */ b b;

    public k7(b bVar) {
        this.b = bVar;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.w5
    public final int f() {
        return this.b.f();
    }

    @Override // kotlin.collections.c, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new j7(((bmk) this.b.a()).iterator(), 0);
    }
}
