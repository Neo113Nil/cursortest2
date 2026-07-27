package B5;

import b6.C0530a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class n extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public String f356n;

    /* renamed from: u, reason: collision with root package name */
    public h6.i f357u;

    /* renamed from: v, reason: collision with root package name */
    public C0530a f358v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f359w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f360x;

    /* renamed from: y, reason: collision with root package name */
    public int f361y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f360x = oVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f359w = obj;
        this.f361y |= Integer.MIN_VALUE;
        return this.f360x.a(null, null, null, null, null, null, this);
    }
}
