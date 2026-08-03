package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w0 implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4796i;

    public /* synthetic */ w0(int i10, Object obj, Object obj2) {
        this.f4794g = i10;
        this.f4795h = obj;
        this.f4796i = obj2;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        long j3;
        switch (this.f4794g) {
            case 0:
                b4.e eVar = (b4.e) this.f4795h;
                Object obj2 = eVar.f961b;
                yc.g gVar = (yc.g) this.f4796i;
                synchronized (obj2) {
                    ((ArrayList) eVar.f962c).remove(gVar);
                }
                return ac.o.f277a;
            default:
                w0.k kVar = (w0.k) obj;
                synchronized (w0.m.f7580c) {
                    j3 = w0.m.f7582e;
                    w0.m.f7582e = 1 + j3;
                }
                return new w0.c(j3, kVar, (oc.c) this.f4795h, (oc.c) this.f4796i);
        }
    }
}
