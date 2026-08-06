package F;

import java.io.FileInputStream;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class Q extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public Object f424d;

    /* renamed from: e, reason: collision with root package name */
    public FileInputStream f425e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S f427g;

    /* renamed from: h, reason: collision with root package name */
    public int f428h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f427g = s2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f426f = obj;
        this.f428h |= Integer.MIN_VALUE;
        return S.a(this.f427g, this);
    }
}
