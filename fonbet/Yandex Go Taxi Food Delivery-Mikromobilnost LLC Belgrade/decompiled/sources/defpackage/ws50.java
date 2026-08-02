package defpackage;

import android.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.random.Random;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes12.dex */
public final class ws50 implements p8w {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ws50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String b(String str) {
        try {
            return new String(Base64.decode(str, 0), uza.a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(us50 us50Var) {
        Iterator it = ((Set) this.b).iterator();
        while (it.hasNext()) {
            ((vs50) it.next()).a(us50Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0108 A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:16:0x00e0, B:18:0x00ec, B:20:0x00fa, B:22:0x00fe, B:27:0x0108, B:29:0x0110), top: B:15:0x00e0 }] */
    @Override // defpackage.p8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kvj0 intercept(m8w m8wVar) {
        int i;
        String a;
        String b;
        String a2;
        boolean z;
        String str;
        Integer l;
        switch (this.a) {
            case 0:
                zci0 zci0Var = (zci0) m8wVar;
                d5j0 d5j0Var = zci0Var.e;
                String b2 = d5j0Var.a.b();
                if (!evu0.J(b2)) {
                    String Q = evu0.Q("/", evu0.k0(evu0.k0(b2).toString()).toString());
                    b2 = evu0.d0(Q, "/", Q);
                }
                String str2 = b2;
                String a3 = d5j0Var.c.a("X-YaTaxi-Retry-Number");
                int intValue = (a3 == null || (l = bvu0.l(10, a3)) == null) ? 0 : l.intValue();
                try {
                    kvj0 b3 = ((zci0) m8wVar).b(d5j0Var);
                    if (b3.J) {
                        a(new ts50(str2, intValue));
                    } else {
                        int i2 = b3.w;
                        if (i2 != 429 && i2 / 100 != 5) {
                            z = false;
                            if (z) {
                                bxw bxwVar = (bxw) d5j0Var.c(bxw.class);
                                n851 n851Var = bxwVar != null ? (n851) bxwVar.c.getAnnotation(n851.class) : null;
                                if (n851Var != null) {
                                    try {
                                        String a4 = b3.y.a("X-YaTaxi-Error-Header");
                                        if (a4 == null) {
                                            a4 = null;
                                        }
                                        String b4 = a4 != null ? b(a4) : null;
                                        try {
                                            String a5 = b3.y.a("X-YaTaxi-Error-Description");
                                            if (a5 == null) {
                                                a5 = null;
                                            }
                                            try {
                                                if (a5 != null) {
                                                    str = b(a5);
                                                    if (str == null) {
                                                    }
                                                    ObserveStrategy strategy = n851Var.strategy();
                                                    String str3 = b4;
                                                    i = NetworkRequestException.TOO_MANY_REQUESTS;
                                                    a(new ss50(intValue, str2, str3, str, strategy));
                                                }
                                                a(new ss50(intValue, str2, str3, str, strategy));
                                            } catch (Exception e) {
                                                e = e;
                                                bxw bxwVar2 = (bxw) d5j0Var.c(bxw.class);
                                                n851 n851Var2 = bxwVar2 != null ? (n851) bxwVar2.c.getAnnotation(n851.class) : null;
                                                boolean y = s8o.y(e);
                                                if (n851Var2 != null && !zci0Var.a.K && !y) {
                                                    if (s8o.A(e)) {
                                                        a(new rs50(str2, intValue, n851Var2.strategy()));
                                                    }
                                                    Integer M = s8o.M(e);
                                                    int intValue2 = M != null ? M.intValue() : 0;
                                                    if (intValue2 == i || intValue2 / 100 == 5) {
                                                        oeu O = s8o.O(e);
                                                        String b5 = (O == null || (a2 = O.a("X-YaTaxi-Error-Header")) == null) ? null : b(a2);
                                                        oeu O2 = s8o.O(e);
                                                        a(new ss50(intValue, str2, b5, (O2 == null || (a = O2.a("X-YaTaxi-Error-Description")) == null || (b = b(a)) == null) ? null : b, n851Var2.strategy()));
                                                    }
                                                }
                                                throw e;
                                            }
                                            str = null;
                                            ObserveStrategy strategy2 = n851Var.strategy();
                                            String str32 = b4;
                                            i = NetworkRequestException.TOO_MANY_REQUESTS;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = NetworkRequestException.TOO_MANY_REQUESTS;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i = 429;
                                    }
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    return b3;
                } catch (Exception e4) {
                    e = e4;
                    i = 429;
                }
                break;
            default:
                zci0 zci0Var2 = (zci0) m8wVar;
                d5j0 d5j0Var2 = zci0Var2.e;
                t4j0 b6 = d5j0Var2.b();
                glt0 c = ((w870) this.b).c("make_request");
                c.e = bgu.e(Random.a.j(8));
                c.a = System.currentTimeMillis() * 1000000;
                b6.d("traceparent", unr0.p("00-", (String) c.c, "-", (String) c.e, "-01"));
                kvj0 b7 = zci0Var2.b(new d5j0(b6));
                ((LinkedHashMap) c.i).putAll(b.i(new Pair("url", d5j0Var2.a.i), new Pair("isSuccessful", String.valueOf(b7.J)), new Pair("response_code", String.valueOf(b7.w))));
                c.a();
                return b7;
        }
    }
}
