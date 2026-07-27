package Y5;

import g1.C4523c;
import java.util.List;
import kotlin.jvm.internal.s;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f4013t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i originalAdapter) {
        super(originalAdapter.f4008a, s.a(List.class), originalAdapter.f4010c, C4985p.f40358n, 32);
        kotlin.jvm.internal.h.e(originalAdapter, "originalAdapter");
        this.f4013t = originalAdapter;
    }

    @Override // Y5.i
    public final Object b(I0.j jVar) {
        return p8.g.k(this.f4013t.b(jVar));
    }

    @Override // Y5.i
    public final Object c(a aVar) {
        return p8.g.k(this.f4013t.c(aVar));
    }

    @Override // Y5.i
    public final void d(C4523c writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // Y5.i
    public final void e(C4523c writer, int i, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4013t.e(writer, i, list.get(i4));
        }
    }

    @Override // Y5.i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // Y5.i
    public final int g(int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i4 += this.f4013t.g(i, list.get(i9));
        }
        return i4;
    }
}
