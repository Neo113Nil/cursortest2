package I5;

import S0.l;
import f6.C4522a;

/* loaded from: classes2.dex */
public final class d extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public l f1332n;

    /* renamed from: u, reason: collision with root package name */
    public C4522a f1333u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f1334v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f1335w;

    /* renamed from: x, reason: collision with root package name */
    public int f1336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, B7.c cVar) {
        super(cVar);
        this.f1335w = lVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1334v = obj;
        this.f1336x |= Integer.MIN_VALUE;
        return this.f1335w.H(null, null, this);
    }
}
