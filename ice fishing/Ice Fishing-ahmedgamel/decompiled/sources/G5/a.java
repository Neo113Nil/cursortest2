package G5;

import B7.c;
import I0.j;
import u7.C5081g;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: n, reason: collision with root package name */
    public j f1176n;

    /* renamed from: u, reason: collision with root package name */
    public C5081g[] f1177u;

    /* renamed from: v, reason: collision with root package name */
    public C5081g[] f1178v;

    /* renamed from: w, reason: collision with root package name */
    public String f1179w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1180x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f1181y;

    /* renamed from: z, reason: collision with root package name */
    public int f1182z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, c cVar) {
        super(cVar);
        this.f1181y = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1180x = obj;
        this.f1182z |= Integer.MIN_VALUE;
        return this.f1181y.r(this);
    }
}
