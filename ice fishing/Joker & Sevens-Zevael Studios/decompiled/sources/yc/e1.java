package yc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class e1 extends k1 implements n {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8843i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(b1 b1Var) {
        super(true);
        boolean z10 = true;
        P(b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f8873h;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        k kVar = jVar instanceof k ? (k) jVar : null;
        if (kVar != null) {
            k1 k3 = kVar.k();
            while (!k3.J()) {
                j jVar2 = (j) atomicReferenceFieldUpdater.get(k3);
                k kVar2 = jVar2 instanceof k ? (k) jVar2 : null;
                if (kVar2 != null) {
                    k3 = kVar2.k();
                }
            }
            this.f8843i = z10;
        }
        z10 = false;
        this.f8843i = z10;
    }

    @Override // yc.k1
    public final boolean J() {
        return this.f8843i;
    }

    @Override // yc.k1
    public final boolean K() {
        return true;
    }
}
