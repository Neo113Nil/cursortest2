package a0;

import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class j extends pc.n implements vc.c, oc.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f56n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i10, cls, obj, str, str2);
        this.f56n = i11;
    }

    @Override // pc.c
    public final vc.a a() {
        pc.t.f5684a.getClass();
        return this;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f56n) {
            case 0:
                return ((w2) this.f5665h).getValue();
            default:
                return this.f5665h.getClass().getSimpleName();
        }
    }
}
