package O1;

import Q1.u;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final u f866a = new u("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final u f867b = new u("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f868c = new u("PENDING", 0);

    public static final void a(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
