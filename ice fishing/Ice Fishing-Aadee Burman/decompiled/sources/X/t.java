package X;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t extends B7.c {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ D f3536A;

    /* renamed from: B, reason: collision with root package name */
    public int f3537B;

    /* renamed from: n, reason: collision with root package name */
    public D f3538n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3539u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f3540v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3541w;

    /* renamed from: x, reason: collision with root package name */
    public v f3542x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f3543y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3544z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(D d2, B7.c cVar) {
        super(cVar);
        this.f3536A = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3544z = obj;
        this.f3537B |= Integer.MIN_VALUE;
        return this.f3536A.c(this);
    }
}
