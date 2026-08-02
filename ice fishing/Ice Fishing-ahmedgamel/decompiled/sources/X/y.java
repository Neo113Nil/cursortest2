package X;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class y extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3727n;

    /* renamed from: u, reason: collision with root package name */
    public FileInputStream f3728u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3729v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D f3730w;

    /* renamed from: x, reason: collision with root package name */
    public int f3731x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(D d9, B7.c cVar) {
        super(cVar);
        this.f3730w = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3729v = obj;
        this.f3731x |= Integer.MIN_VALUE;
        return this.f3730w.f(this);
    }
}
