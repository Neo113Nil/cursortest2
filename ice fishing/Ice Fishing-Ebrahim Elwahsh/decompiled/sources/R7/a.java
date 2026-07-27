package R7;

import S7.q;
import g1.C4523c;
import v7.InterfaceC5133d;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public q f2839n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2840u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4523c f2841v;

    /* renamed from: w, reason: collision with root package name */
    public int f2842w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C4523c c4523c, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f2841v = c4523c;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f2840u = obj;
        this.f2842w |= Integer.MIN_VALUE;
        return this.f2841v.j(null, this);
    }
}
