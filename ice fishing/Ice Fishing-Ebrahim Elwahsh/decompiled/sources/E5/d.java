package E5;

import S0.s;
import b6.C0530a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public s f834n;

    /* renamed from: u, reason: collision with root package name */
    public C0530a f835u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f836v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f837w;

    /* renamed from: x, reason: collision with root package name */
    public int f838x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f837w = sVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f836v = obj;
        this.f838x |= Integer.MIN_VALUE;
        return this.f837w.n(null, null, this);
    }
}
