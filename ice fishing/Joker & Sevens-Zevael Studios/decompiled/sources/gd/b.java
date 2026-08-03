package gd;

import ac.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f2570h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.f2569g = i10;
        this.f2570h = dVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f2569g) {
            case 0:
                this.f2570h.d(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2573g;
                d dVar = this.f2570h;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d(null);
                break;
        }
        return o.f277a;
    }
}
