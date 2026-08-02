package defpackage;

import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.jobs.b;
import ru.yandex.taxi.jobs.request.NetworkType;

/* loaded from: classes9.dex */
public final class tci {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tci(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(u8x u8xVar) {
        NetworkType networkType;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) ((h3y) obj).get();
                r8x r8xVar = new r8x();
                for (Map.Entry entry : u8xVar.b().entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        r8xVar.c(str, (Boolean) value);
                    } else if (value instanceof Integer) {
                        r8xVar.b((Integer) value, str);
                    } else if (value instanceof Long) {
                        r8xVar.e(str, (Long) value);
                    } else if (value instanceof Float) {
                        r8xVar.d(str, (Float) value);
                    } else if (value instanceof Double) {
                        r8xVar.a((Double) value, str);
                    } else if (value instanceof String) {
                        r8xVar.f(str, (String) value);
                    } else if (value instanceof boolean[]) {
                        r8xVar.q(str, (boolean[]) value);
                    } else if (value instanceof int[]) {
                        r8xVar.i(str, (int[]) value);
                    } else if (value instanceof long[]) {
                        r8xVar.j(str, (long[]) value);
                    } else if (value instanceof float[]) {
                        r8xVar.h(str, (float[]) value);
                    } else if (value instanceof double[]) {
                        r8xVar.g(str, (double[]) value);
                    } else if (value instanceof Object[]) {
                        Object[] objArr = (Object[]) value;
                        if (objArr instanceof Boolean[]) {
                            r8xVar.k(str, (Boolean[]) objArr);
                        } else if (objArr instanceof Integer[]) {
                            r8xVar.n(str, (Integer[]) objArr);
                        } else if (objArr instanceof Long[]) {
                            r8xVar.o(str, (Long[]) objArr);
                        } else if (objArr instanceof Float[]) {
                            r8xVar.m(str, (Float[]) objArr);
                        } else if (objArr instanceof Double[]) {
                            r8xVar.l(str, (Double[]) objArr);
                        } else if (objArr instanceof String[]) {
                            r8xVar.p(str, (String[]) objArr);
                        } else {
                            jst.e.v("DeliveryJobScheduler", new IllegalArgumentException(g8e.o("Unsupported array type for key=", str)));
                        }
                    } else {
                        jst.e.v("DeliveryJobScheduler", new IllegalArgumentException(g8e.o("Unsupported value type for key=", str)));
                    }
                }
                String e = u8xVar.e();
                int i2 = sci.a[u8xVar.c().ordinal()];
                if (i2 == 1) {
                    networkType = NetworkType.CONNECTED;
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    networkType = NetworkType.ANY;
                }
                bVar.e(new w4j0("delivery_task", 0L, r8xVar, null, networkType, false, false, 0L, e, 872));
                break;
            default:
                ((tci) obj).a(u8x.a(u8xVar, kotlin.collections.b.o(u8xVar.b(), new Pair("job_tag", u8xVar.d()))));
                break;
        }
    }
}
