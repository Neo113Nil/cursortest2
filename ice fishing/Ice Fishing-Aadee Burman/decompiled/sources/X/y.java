package X;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class y extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3565n;

    /* renamed from: u, reason: collision with root package name */
    public FileInputStream f3566u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3567v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D f3568w;

    /* renamed from: x, reason: collision with root package name */
    public int f3569x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(D d2, B7.c cVar) {
        super(cVar);
        this.f3568w = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3567v = obj;
        this.f3569x |= Integer.MIN_VALUE;
        return this.f3568w.f(this);
    }
}
