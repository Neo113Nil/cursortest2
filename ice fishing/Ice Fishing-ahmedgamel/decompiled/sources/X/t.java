package X;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t extends B7.c {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ D f3698A;

    /* renamed from: B, reason: collision with root package name */
    public int f3699B;

    /* renamed from: n, reason: collision with root package name */
    public D f3700n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3701u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f3702v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3703w;

    /* renamed from: x, reason: collision with root package name */
    public v f3704x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f3705y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3706z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(D d9, B7.c cVar) {
        super(cVar);
        this.f3698A = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3706z = obj;
        this.f3699B |= Integer.MIN_VALUE;
        return this.f3698A.c(this);
    }
}
