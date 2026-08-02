package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;

/* loaded from: classes4.dex */
public final class x8p extends vc5 {
    @Override // defpackage.vc5
    public final /* bridge */ /* synthetic */ tt11 Y() {
        return w8p.a;
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var instanceof t8p) {
            Z().emit(new Event.Process(null, 1, null));
        } else {
            super.d0(ys11Var);
        }
    }
}
