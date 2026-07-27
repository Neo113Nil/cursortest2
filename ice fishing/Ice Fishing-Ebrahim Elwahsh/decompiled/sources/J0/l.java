package J0;

import X.D;
import a8.C0454v;
import a8.C0455w;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.i implements E7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1323n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1324u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj) {
        super(1);
        this.f1323n = i;
        this.f1324u = obj;
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        switch (this.f1323n) {
            case 0:
                Throwable th = (Throwable) obj;
                m mVar = (m) this.f1324u;
                if (th == null) {
                    if (!mVar.f1325n.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    mVar.f1325n.cancel(true);
                } else {
                    U0.k kVar = mVar.f1325n;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    kVar.k(th);
                }
                return q7.v.f40183a;
            case 1:
                ((J3.a) this.f1324u).cancel(false);
                return q7.v.f40183a;
            case 2:
                ((W7.h) this.f1324u).b();
                return q7.v.f40183a;
            case 3:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((D) this.f1324u).f3541e.F(new X.g(th2));
                }
                Object obj2 = D.i;
                D d2 = (D) this.f1324u;
                synchronized (obj2) {
                    D.f3536h.remove(d2.b().getAbsolutePath());
                }
                return q7.v.f40183a;
            case 4:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                Y7.f fVar = (Y7.f) this.f1324u;
                sb.append(fVar.f4045d[intValue]);
                sb.append(": ");
                sb.append(fVar.f4046e[intValue].a());
                return sb.toString();
            case 5:
                Y7.a buildSerialDescriptor = (Y7.a) obj;
                kotlin.jvm.internal.h.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((C0455w) this.f1324u).getClass();
                return q7.v.f40183a;
            default:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C0454v c0454v = (C0454v) this.f1324u;
                sb2.append(c0454v.f4511c[intValue2]);
                sb2.append(": ");
                sb2.append(c0454v.i(intValue2).a());
                return sb2.toString();
        }
    }
}
