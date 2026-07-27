package X;

import java.io.Serializable;
import java.util.Iterator;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class t extends AbstractC5219c {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ D f3592A;

    /* renamed from: B, reason: collision with root package name */
    public int f3593B;

    /* renamed from: n, reason: collision with root package name */
    public D f3594n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3595u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f3596v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3597w;

    /* renamed from: x, reason: collision with root package name */
    public v f3598x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f3599y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3600z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3592A = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3600z = obj;
        this.f3593B |= Integer.MIN_VALUE;
        return this.f3592A.c(this);
    }
}
