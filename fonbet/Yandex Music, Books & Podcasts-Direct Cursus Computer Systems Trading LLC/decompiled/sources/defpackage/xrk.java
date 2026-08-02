package defpackage;

import io.grpc.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class xrk extends aeg {
    public final /* synthetic */ int a = 1;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Object c;
    public final /* synthetic */ ceg d;

    public xrk(bsk bskVar, zdg zdgVar) {
        this.d = bskVar;
        o2g.O(zdgVar, "subchannel");
        this.c = zdgVar;
    }

    @Override // defpackage.aeg
    public final xdg a(dsk dskVar) {
        switch (this.a) {
            case 0:
                if (this.b.compareAndSet(false, true)) {
                    ((a) this.d).g.R().execute(new dsd(20, this));
                }
                break;
            default:
                if (this.b.compareAndSet(false, true)) {
                    ((bsk) this.d).g.R().execute(new dsd(21, this));
                }
                break;
        }
        return xdg.e;
    }

    public xrk(a aVar, a aVar2) {
        this.d = aVar;
        this.c = aVar2;
    }
}
