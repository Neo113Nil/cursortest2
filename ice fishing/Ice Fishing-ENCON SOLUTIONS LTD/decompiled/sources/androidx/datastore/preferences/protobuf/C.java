package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class C {
    public static void a(long j2, Object obj) {
        AbstractC0102b abstractC0102b = (AbstractC0102b) ((InterfaceC0123x) j0.f2411b.h(j2, obj));
        if (abstractC0102b.f2371a) {
            abstractC0102b.f2371a = false;
        }
    }

    public static InterfaceC0123x b(long j2, Object obj) {
        InterfaceC0123x interfaceC0123x = (InterfaceC0123x) j0.f2411b.h(j2, obj);
        if (((AbstractC0102b) interfaceC0123x).f2371a) {
            return interfaceC0123x;
        }
        U u2 = (U) interfaceC0123x;
        int i2 = u2.f2350c;
        U c2 = u2.c(i2 == 0 ? 10 : i2 * 2);
        j0.o(obj, j2, c2);
        return c2;
    }
}
