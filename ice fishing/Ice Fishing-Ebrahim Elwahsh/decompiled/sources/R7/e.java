package R7;

import v7.InterfaceC5133d;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class e extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public f f2849n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2850u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2851v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f2852w;

    /* renamed from: x, reason: collision with root package name */
    public int f2853x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f2852w = fVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f2851v = obj;
        this.f2853x |= Integer.MIN_VALUE;
        return this.f2852w.a(null, this);
    }
}
