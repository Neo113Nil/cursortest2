package c6;

import g1.C4523c;
import java.util.List;
import kotlin.jvm.internal.s;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f5608t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i originalAdapter) {
        super(originalAdapter.f5603a, s.a(List.class), originalAdapter.f5605c, C5135p.f41439n, 32);
        kotlin.jvm.internal.h.e(originalAdapter, "originalAdapter");
        this.f5608t = originalAdapter;
    }

    @Override // c6.i
    public final Object b(C0544a c0544a) {
        return d6.c.k(this.f5608t.b(c0544a));
    }

    @Override // c6.i
    public final Object c(C4523c c4523c) {
        return d6.c.k(this.f5608t.c(c4523c));
    }

    @Override // c6.i
    public final void d(F1.a writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // c6.i
    public final void e(F1.a writer, int i, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f5608t.e(writer, i, list.get(i6));
        }
    }

    @Override // c6.i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // c6.i
    public final int g(int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i6 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i6 += this.f5608t.g(i, list.get(i9));
        }
        return i6;
    }
}
