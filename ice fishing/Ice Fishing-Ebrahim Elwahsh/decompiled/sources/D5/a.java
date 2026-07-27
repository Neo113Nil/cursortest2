package D5;

import J6.n;
import J6.r;
import J6.s;
import a6.C0431a;
import a6.C0432b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import m7.C4787a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f700n;

    public /* synthetic */ a(int i) {
        this.f700n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f700n) {
            case 0:
                return new X6.b(32000);
            case 1:
                return Collections.EMPTY_MAP;
            case 2:
                C0432b c0432b = a6.c.f4390c;
                if (c0432b == null) {
                    synchronized (a6.c.f4389b) {
                        try {
                            C0432b c0432b2 = a6.c.f4390c;
                            if (c0432b2 == null) {
                                C0432b a9 = a6.c.a();
                                if (a9 == null) {
                                    C0431a c0431a = C0431a.f4386n;
                                    a6.c.b(c0431a);
                                    c0432b = c0431a;
                                }
                            } else {
                                c0432b = c0432b2;
                            }
                        } finally {
                        }
                    }
                }
                return c0432b.b();
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
                return X6.b.f3838b;
            default:
                return C4787a.f39581a;
        }
    }
}
