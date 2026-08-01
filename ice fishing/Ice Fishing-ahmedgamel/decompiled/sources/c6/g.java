package c6;

import g1.C4523c;
import java.util.List;
import kotlin.jvm.internal.s;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f5588t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i originalAdapter) {
        super(d.f5580w, s.a(List.class), originalAdapter.f5605c, C5135p.f41442n, 32);
        kotlin.jvm.internal.h.e(originalAdapter, "originalAdapter");
        this.f5588t = originalAdapter;
    }

    @Override // c6.i
    public final Object b(C0544a c0544a) {
        return d6.c.k(this.f5588t.b(c0544a));
    }

    @Override // c6.i
    public final Object c(C4523c c4523c) {
        return d6.c.k(this.f5588t.c(c4523c));
    }

    @Override // c6.i
    public final void d(F1.a writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        int size = value.size();
        for (int i = 0; i < size; i++) {
            this.f5588t.d(writer, value.get(i));
        }
    }

    @Override // c6.i
    public final void e(F1.a writer, int i, Object obj) {
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
        for (int i6 = 0; i6 < size; i6++) {
            i += this.f5588t.f(value.get(i6));
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
