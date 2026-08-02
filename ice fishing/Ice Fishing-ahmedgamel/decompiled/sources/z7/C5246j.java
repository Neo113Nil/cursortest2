package z7;

import I7.p;
import java.io.Serializable;

/* renamed from: z7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5246j implements InterfaceC5245i, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final C5246j f42241n = new C5246j();

    public final int hashCode() {
        return 0;
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i i(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return this;
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5243g m(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return null;
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i n(InterfaceC5245i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // z7.InterfaceC5245i
    public final Object l(Object obj, p pVar) {
        return obj;
    }
}
