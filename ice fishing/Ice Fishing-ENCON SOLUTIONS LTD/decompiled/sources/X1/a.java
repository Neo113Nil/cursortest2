package X1;

import W1.g;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1918a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(z1.a.f8620a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        f1918a = bytes;
    }

    public static final String a(g gVar, long j2) {
        i.e(gVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (gVar.b(j3) == 13) {
                String n2 = gVar.n(j3, z1.a.f8620a);
                gVar.o(2L);
                return n2;
            }
        }
        String n3 = gVar.n(j2, z1.a.f8620a);
        gVar.o(1L);
        return n3;
    }
}
