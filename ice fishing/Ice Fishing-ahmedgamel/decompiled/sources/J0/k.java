package J0;

import X.D;
import e8.C4506v;
import e8.C4507w;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.i implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1426n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1427u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj) {
        super(1);
        this.f1426n = i;
        this.f1427u = obj;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        switch (this.f1426n) {
            case 0:
                Throwable th = (Throwable) obj;
                l lVar = (l) this.f1427u;
                if (th == null) {
                    if (!lVar.f1428n.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    lVar.f1428n.cancel(true);
                } else {
                    U0.k kVar = lVar.f1428n;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    kVar.k(th);
                }
                return u7.v.f41073a;
            case 1:
                ((P3.a) this.f1427u).cancel(false);
                return u7.v.f41073a;
            case 2:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((D) this.f1427u).f3647e.F(new X.g(th2));
                }
                Object obj2 = D.i;
                D d9 = (D) this.f1427u;
                synchronized (obj2) {
                    D.f3642h.remove(d9.b().getAbsolutePath());
                }
                return u7.v.f41073a;
            case 3:
                ((a8.h) this.f1427u).b();
                return u7.v.f41073a;
            case 4:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                c8.f fVar = (c8.f) this.f1427u;
                sb.append(fVar.f5816d[intValue]);
                sb.append(": ");
                sb.append(fVar.f5817e[intValue].a());
                return sb.toString();
            case 5:
                c8.a buildSerialDescriptor = (c8.a) obj;
                kotlin.jvm.internal.h.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((C4507w) this.f1427u).getClass();
                return u7.v.f41073a;
            default:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C4506v c4506v = (C4506v) this.f1427u;
                sb2.append(c4506v.f37402c[intValue2]);
                sb2.append(": ");
                sb2.append(c4506v.i(intValue2).a());
                return sb2.toString();
        }
    }
}
