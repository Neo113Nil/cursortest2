package r0;

import java.nio.ByteBuffer;
import java.util.List;
import m0.C0215m;
import m0.C0216n;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241b extends C0216n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2876d;

    @Override // m0.C0216n
    public final Object f(byte b2, ByteBuffer byteBuffer) {
        switch (this.f2876d) {
            case 0:
                E0.i.e(byteBuffer, "buffer");
                if (b2 == -127) {
                    Long l2 = (Long) e(byteBuffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        N.f2866g.getClass();
                        N[] values = N.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            N n2 = values[i2];
                            if (n2.f2871f == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b2 == -126) {
                    Object e2 = e(byteBuffer);
                    List list = e2 instanceof List ? (List) e2 : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        E0.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b2 == -125) {
                    Object e3 = e(byteBuffer);
                    List list2 = e3 instanceof List ? (List) e3 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        E0.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                E0.i.e(byteBuffer, "buffer");
                break;
        }
        return super.f(b2, byteBuffer);
    }

    @Override // m0.C0216n
    public void k(C0215m c0215m, Object obj) {
        switch (this.f2876d) {
            case 0:
                if (!(obj instanceof N)) {
                    if (!(obj instanceof C0249j)) {
                        if (!(obj instanceof P)) {
                            super.k(c0215m, obj);
                            break;
                        } else {
                            c0215m.write(131);
                            P p2 = (P) obj;
                            k(c0215m, u0.e.D(p2.f2872a, p2.f2873b));
                            break;
                        }
                    } else {
                        c0215m.write(130);
                        C0249j c0249j = (C0249j) obj;
                        k(c0215m, u0.e.D(c0249j.f2888a, Boolean.valueOf(c0249j.f2889b)));
                        break;
                    }
                } else {
                    c0215m.write(129);
                    k(c0215m, Long.valueOf(((N) obj).f2871f));
                    break;
                }
            default:
                super.k(c0215m, obj);
                break;
        }
    }
}
