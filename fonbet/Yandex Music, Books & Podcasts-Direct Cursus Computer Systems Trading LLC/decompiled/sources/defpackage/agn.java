package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class agn implements yfn {
    public final AtomicReference a = new AtomicReference();

    @Override // defpackage.yfn
    public final void a(tfn tfnVar) {
        rfn rfnVar = (rfn) this.a.get();
        if (rfnVar != null) {
            rfnVar.b.a(tfnVar);
        }
    }
}
