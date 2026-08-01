package e8;

import b8.InterfaceC0529a;
import java.util.Iterator;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4469a implements InterfaceC0529a {
    @Override // b8.InterfaceC0529a
    public Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return h(decoder);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public final Object h(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        Object d2 = d();
        int e9 = e(d2);
        d8.a h9 = decoder.h(c());
        while (true) {
            int c9 = h9.c(c());
            if (c9 == -1) {
                h9.k(c());
                return k(d2);
            }
            i(h9, c9 + e9, d2);
        }
    }

    public abstract void i(d8.a aVar, int i, Object obj);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);
}
