package T0;

import Q0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f1007b;

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f1008c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f1009d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f1010e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f1006a = AbstractC0068a.l("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f1011f = AbstractC0068a.l("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i2 = 11;
        f1007b = new A.j(i2, "PERMIT");
        f1008c = new A.j(i2, "TAKEN");
        f1009d = new A.j(i2, "BROKEN");
        f1010e = new A.j(i2, "CANCELLED");
    }
}
