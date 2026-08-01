package H5;

import N6.n;
import N6.r;
import N6.s;
import b7.C0522b;
import e6.C4466a;
import e6.C4467b;
import e6.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import q7.C4932a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1224n;

    public /* synthetic */ a(int i) {
        this.f1224n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f1224n) {
            case 0:
                return new C0522b(32000);
            case 1:
                return Collections.EMPTY_MAP;
            case 2:
                C4467b c4467b = c.f37209c;
                if (c4467b == null) {
                    synchronized (c.f37208b) {
                        try {
                            C4467b c4467b2 = c.f37209c;
                            if (c4467b2 == null) {
                                C4467b a9 = c.a();
                                if (a9 == null) {
                                    C4466a c4466a = C4466a.f37205n;
                                    c.b(c4466a);
                                    c4467b = c4466a;
                                }
                            } else {
                                c4467b = c4467b2;
                            }
                        } finally {
                        }
                    }
                }
                return c4467b.b();
            case 3:
                return new IdentityHashMap();
            case 4:
                return new ArrayList();
            case 5:
                return new n();
            case 6:
                return new n();
            case 7:
                return new s();
            case 8:
                return new s();
            case 9:
                return new r();
            case 10:
                return Double.valueOf(ThreadLocalRandom.current().nextDouble(0.8d, 1.2d));
            case 11:
                return ThreadLocalRandom.current();
            case 12:
                return C0522b.f5423b;
            default:
                return C4932a.f40255a;
        }
    }
}
