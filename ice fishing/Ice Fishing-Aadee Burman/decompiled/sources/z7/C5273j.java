package z7;

import I7.p;
import java.io.Serializable;

/* renamed from: z7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5273j implements InterfaceC5272i, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final C5273j f42269n = new C5273j();

    public final int hashCode() {
        return 0;
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i i(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return this;
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5270g m(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return null;
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i n(InterfaceC5272i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // z7.InterfaceC5272i
    public final Object l(Object obj, p pVar) {
        return obj;
    }
}
