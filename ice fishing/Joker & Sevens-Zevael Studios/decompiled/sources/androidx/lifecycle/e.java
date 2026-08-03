package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f665g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f666h;

    public /* synthetic */ e(int i10, Object obj) {
        this.f665g = i10;
        this.f666h = obj;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f665g) {
            case 0:
                new HashMap();
                j[] jVarArr = (j[]) this.f666h;
                if (jVarArr.length > 0) {
                    j jVar = jVarArr[0];
                    throw null;
                }
                if (jVarArr.length <= 0) {
                    return;
                }
                j jVar2 = jVarArr[0];
                throw null;
            default:
                if (oVar == o.ON_CREATE) {
                    uVar.h().f(this);
                    ((o0) this.f666h).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oVar).toString());
                }
        }
    }
}
