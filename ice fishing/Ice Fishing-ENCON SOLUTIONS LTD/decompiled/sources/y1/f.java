package y1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.c f8607a;

    public f(z1.c cVar) {
        this.f8607a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z1.b(this.f8607a);
    }
}
