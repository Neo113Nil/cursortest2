package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;

/* loaded from: classes4.dex */
public final class wjn extends vc5 {
    @Override // defpackage.vc5
    public final tt11 Y() {
        return new vjn();
    }

    @Override // defpackage.vc5
    public final void d0(ys11 ys11Var) {
        if (ys11Var instanceof ujn) {
            Z().emit(new Event.Start(null, 1, null));
        } else {
            super.d0(ys11Var);
        }
    }
}
