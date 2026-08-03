package b0;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f840g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v0.e f841h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(v0.e eVar, int i10) {
        super(1);
        this.f840g = i10;
        this.f841h = eVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f840g) {
            case 0:
                v0.e eVar = this.f841h;
                return Boolean.valueOf(eVar != null ? eVar.c(obj) : true);
            default:
                return new n0(this.f841h, (Map) obj);
        }
    }
}
