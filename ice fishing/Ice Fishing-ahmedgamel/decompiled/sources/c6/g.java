package c6;

import i1.C4586c;
import java.util.List;
import kotlin.jvm.internal.s;
import v7.C5125p;

/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f5764t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i originalAdapter) {
        super(d.f5756w, s.a(List.class), originalAdapter.f5781c, C5125p.f41221n, 32);
        kotlin.jvm.internal.h.e(originalAdapter, "originalAdapter");
        this.f5764t = originalAdapter;
    }

    @Override // c6.i
    public final Object b(C0555a c0555a) {
        return Z2.d.n(this.f5764t.b(c0555a));
    }

    @Override // c6.i
    public final Object c(C4586c c4586c) {
        return Z2.d.n(this.f5764t.c(c4586c));
    }

    @Override // c6.i
    public final void d(n4.c writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        int size = value.size();
        for (int i = 0; i < size; i++) {
            this.f5764t.d(writer, value.get(i));
        }
    }

    @Override // c6.i
    public final void e(n4.c writer, int i, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.e(writer, i, list);
    }

    @Override // c6.i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(value, "value");
        int size = value.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += this.f5764t.f(value.get(i4));
        }
        return i;
    }

    @Override // c6.i
    public final int g(int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.g(i, list);
    }
}
