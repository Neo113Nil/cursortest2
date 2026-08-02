package e8;

import b8.InterfaceC0537a;
import java.util.Iterator;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4486a implements InterfaceC0537a {
    @Override // b8.InterfaceC0537a
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
        Object d9 = d();
        int e9 = e(d9);
        d8.a h3 = decoder.h(c());
        while (true) {
            int c9 = h3.c(c());
            if (c9 == -1) {
                h3.k(c());
                return k(d9);
            }
            i(h3, c9 + e9, d9);
        }
    }

    public abstract void i(d8.a aVar, int i, Object obj);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);
}
