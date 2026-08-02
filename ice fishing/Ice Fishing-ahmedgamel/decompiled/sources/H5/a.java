package H5;

import N6.n;
import N6.r;
import N6.s;
import b7.C0530b;
import e6.C4483a;
import e6.C4484b;
import e6.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import q7.C4881a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1249n;

    public /* synthetic */ a(int i) {
        this.f1249n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f1249n) {
            case 0:
                return new C0530b(32000);
            case 1:
                return Collections.EMPTY_MAP;
            case 2:
                C4484b c4484b = c.f37285c;
                if (c4484b == null) {
                    synchronized (c.f37284b) {
                        try {
                            C4484b c4484b2 = c.f37285c;
                            if (c4484b2 == null) {
                                C4484b a9 = c.a();
                                if (a9 == null) {
                                    C4483a c4483a = C4483a.f37281n;
                                    c.b(c4483a);
                                    c4484b = c4483a;
                                }
                            } else {
                                c4484b = c4484b2;
                            }
                        } finally {
                        }
                    }
                }
                return c4484b.b();
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
                return C0530b.f5573b;
            default:
                return C4881a.f40066a;
        }
    }
}
