package F;

import java.io.Serializable;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class F extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public Object f368d;

    /* renamed from: e, reason: collision with root package name */
    public Object f369e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f370f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.p f371g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f372h;

    /* renamed from: i, reason: collision with root package name */
    public int f373i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f374j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f375k;

    /* renamed from: l, reason: collision with root package name */
    public int f376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(P p2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f375k = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f374j = obj;
        this.f376l |= Integer.MIN_VALUE;
        return P.e(this.f375k, false, this);
    }
}
