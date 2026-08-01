package G5;

import B7.c;
import g1.C4522b;
import u7.C5089g;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: n, reason: collision with root package name */
    public C4522b f1073n;

    /* renamed from: u, reason: collision with root package name */
    public C5089g[] f1074u;

    /* renamed from: v, reason: collision with root package name */
    public C5089g[] f1075v;

    /* renamed from: w, reason: collision with root package name */
    public String f1076w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1077x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C4522b f1078y;

    /* renamed from: z, reason: collision with root package name */
    public int f1079z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C4522b c4522b, c cVar) {
        super(cVar);
        this.f1078y = c4522b;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1077x = obj;
        this.f1079z |= Integer.MIN_VALUE;
        return this.f1078y.D(this);
    }
}
