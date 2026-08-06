package f1;

import n1.AbstractC0991b;

/* renamed from: f1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185s extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2963d;

    /* renamed from: e, reason: collision with root package name */
    public int f2964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D1.l f2965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185s(D1.l lVar, l1.d dVar) {
        super(dVar);
        this.f2965f = lVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f2963d = obj;
        this.f2964e |= Integer.MIN_VALUE;
        return this.f2965f.a(null, this);
    }
}
