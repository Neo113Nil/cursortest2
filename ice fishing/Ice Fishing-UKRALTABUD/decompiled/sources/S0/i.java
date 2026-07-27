package S0;

import P0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f999b;

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f1000c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f1001d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f1002e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f998a = AbstractC0068a.l("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f1003f = AbstractC0068a.l("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i2 = 11;
        f999b = new A.j(i2, "PERMIT");
        f1000c = new A.j(i2, "TAKEN");
        f1001d = new A.j(i2, "BROKEN");
        f1002e = new A.j(i2, "CANCELLED");
    }
}
