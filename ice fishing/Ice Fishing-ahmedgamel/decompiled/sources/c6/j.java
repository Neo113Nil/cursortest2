package c6;

import i1.C4586c;
import java.util.List;
import kotlin.jvm.internal.s;
import v7.C5125p;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f5784t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i originalAdapter) {
        super(originalAdapter.f5779a, s.a(List.class), originalAdapter.f5781c, C5125p.f41221n, 32);
        kotlin.jvm.internal.h.e(originalAdapter, "originalAdapter");
        this.f5784t = originalAdapter;
    }

    @Override // c6.i
    public final Object b(C0555a c0555a) {
        return Z2.d.n(this.f5784t.b(c0555a));
    }

    @Override // c6.i
    public final Object c(C4586c c4586c) {
        return Z2.d.n(this.f5784t.c(c4586c));
    }

    @Override // c6.i
    public final void d(n4.c writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // c6.i
    public final void e(n4.c writer, int i, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f5784t.e(writer, i, list.get(i4));
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
        int i4 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i4 += this.f5784t.g(i, list.get(i6));
        }
        return i4;
    }
}
