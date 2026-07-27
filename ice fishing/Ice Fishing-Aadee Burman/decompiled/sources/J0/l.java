package J0;

import X.D;
import e8.C4489v;
import e8.C4490w;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.i implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1398n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1399u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj) {
        super(1);
        this.f1398n = i;
        this.f1399u = obj;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        switch (this.f1398n) {
            case 0:
                Throwable th = (Throwable) obj;
                m mVar = (m) this.f1399u;
                if (th == null) {
                    if (!mVar.f1400n.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    mVar.f1400n.cancel(true);
                } else {
                    U0.k kVar = mVar.f1400n;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    kVar.k(th);
                }
                return u7.v.f41350a;
            case 1:
                ((N3.a) this.f1399u).cancel(false);
                return u7.v.f41350a;
            case 2:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((D) this.f1399u).f3485e.F(new X.g(th2));
                }
                Object obj2 = D.i;
                D d2 = (D) this.f1399u;
                synchronized (obj2) {
                    D.f3480h.remove(d2.b().getAbsolutePath());
                }
                return u7.v.f41350a;
            case 3:
                ((a8.h) this.f1399u).b();
                return u7.v.f41350a;
            case 4:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                c8.f fVar = (c8.f) this.f1399u;
                sb.append(fVar.f5640d[intValue]);
                sb.append(": ");
                sb.append(fVar.f5641e[intValue].a());
                return sb.toString();
            case 5:
                c8.a buildSerialDescriptor = (c8.a) obj;
                kotlin.jvm.internal.h.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((C4490w) this.f1399u).getClass();
                return u7.v.f41350a;
            default:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C4489v c4489v = (C4489v) this.f1399u;
                sb2.append(c4489v.f37326c[intValue2]);
                sb2.append(": ");
                sb2.append(c4489v.i(intValue2).a());
                return sb2.toString();
        }
    }
}
