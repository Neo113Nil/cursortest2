package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class N extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.o f401d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f403f;

    /* renamed from: g, reason: collision with root package name */
    public int f404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f403f = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f402e = obj;
        this.f404g |= Integer.MIN_VALUE;
        return this.f403f.i(null, false, this);
    }
}
