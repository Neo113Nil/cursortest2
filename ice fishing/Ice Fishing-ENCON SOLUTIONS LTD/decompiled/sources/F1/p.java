package F1;

import A1.AbstractC0022x;
import A1.C0015p;
import h1.C0239i;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.l f625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1.i f627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t1.l lVar, Object obj, l1.i iVar) {
        super(1);
        this.f625e = lVar;
        this.f626f = obj;
        this.f627g = iVar;
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        C0015p a2 = a.a(this.f625e, this.f626f, null);
        if (a2 != null) {
            AbstractC0022x.d(a2, this.f627g);
        }
        return C0239i.f3393a;
    }
}
