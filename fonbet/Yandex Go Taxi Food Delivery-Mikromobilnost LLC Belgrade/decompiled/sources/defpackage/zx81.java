package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.internal.service.a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class zx81 implements wst {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ x8u0 b;
    public final /* synthetic */ d c;

    public zx81(d dVar, AtomicReference atomicReference, x8u0 x8u0Var) {
        this.c = dVar;
        this.a = atomicReference;
        this.b = x8u0Var;
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        yst ystVar = (yst) this.a.get();
        cvw.l(ystVar);
        gnc.c.getClass();
        ystVar.e(new a(gnc.b, ystVar)).c(new dy81(this.c, this.b, true, ystVar));
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
    }
}
