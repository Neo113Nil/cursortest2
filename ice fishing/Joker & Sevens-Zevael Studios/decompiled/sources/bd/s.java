package bd;

import yc.b1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public t f1139g;

    /* renamed from: h, reason: collision with root package name */
    public f f1140h;

    /* renamed from: i, reason: collision with root package name */
    public v f1141i;

    /* renamed from: j, reason: collision with root package name */
    public b1 f1142j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1143k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f1144l;

    /* renamed from: m, reason: collision with root package name */
    public int f1145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, fc.d dVar) {
        super(dVar);
        this.f1144l = tVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f1143k = obj;
        this.f1145m |= Integer.MIN_VALUE;
        t.j(this.f1144l, null, this);
        return gc.a.f2559g;
    }
}
