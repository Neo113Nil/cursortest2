package p5;

import bc.m;
import java.util.List;
import m0.z;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f5526h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f5527i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5528g;

    static {
        int i10 = 1;
        f5526h = new c(i10, 0);
        f5527i = new c(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f5528g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f5528g) {
            case 0:
                k5.a aVar = (k5.a) obj;
                j.e(aVar, "it");
                return aVar.getKey();
            default:
                List list = (List) obj;
                j.e(list, "it");
                return z.s(m.i0(list));
        }
    }
}
