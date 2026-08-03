package x1;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 implements v1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f8117c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc.c f8118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc.c f8119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f8120f;

    public n0(int i10, int i11, Map map, oc.c cVar, oc.c cVar2, o0 o0Var) {
        this.f8115a = i10;
        this.f8116b = i11;
        this.f8117c = map;
        this.f8118d = cVar;
        this.f8119e = cVar2;
        this.f8120f = o0Var;
    }

    @Override // v1.f0
    public final Map a() {
        return this.f8117c;
    }

    @Override // v1.f0
    public final void b() {
        this.f8119e.invoke(this.f8120f.f8127r);
    }

    @Override // v1.f0
    public final int c() {
        return this.f8116b;
    }

    @Override // v1.f0
    public final oc.c d() {
        return this.f8118d;
    }

    @Override // v1.f0
    public final int e() {
        return this.f8115a;
    }
}
