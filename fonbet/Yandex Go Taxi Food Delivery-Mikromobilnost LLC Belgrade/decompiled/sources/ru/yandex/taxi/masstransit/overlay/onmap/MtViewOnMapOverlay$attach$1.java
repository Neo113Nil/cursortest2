package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.bzy0;
import defpackage.ek40;
import defpackage.jl40;
import defpackage.qm30;
import defpackage.rm30;
import defpackage.sk40;
import defpackage.sm30;
import defpackage.tk40;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MtViewOnMapOverlay$attach$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        sm30 sm30Var = (sm30) obj;
        h hVar = (h) this.receiver;
        hVar.getClass();
        if (!jl40.l(sm30Var, qm30.a)) {
            if (!(sm30Var instanceof rm30)) {
                w511.b();
                return null;
            }
            tk40 tk40Var = hVar.y;
            bzy0 bzy0Var = ((rm30) sm30Var).a;
            r0 r0Var = tk40Var.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, sk40.a((sk40) value, new ek40(bzy0Var))));
        }
        return zy11.a;
    }
}
