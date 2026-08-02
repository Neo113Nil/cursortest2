package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.entities.exceptions.InstructionHandlerException;

/* loaded from: classes4.dex */
public final /* synthetic */ class wn31 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn31 b;

    public /* synthetic */ wn31(yn31 yn31Var, int i) {
        this.a = i;
        this.b = yn31Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yn31 yn31Var = this.b;
        switch (i) {
            case 0:
                vn31 a = vn31.a((vn31) yn31Var.a0(), null, null, null, false, false, false, 0, true, 255);
                r0 r0Var = (r0) yn31Var.c0();
                r0Var.getClass();
                r0Var.m(null, a);
                break;
            case 1:
                yn31Var.f0(new hao(new InstructionHandlerException(null, 1, null)));
                break;
            default:
                yn31Var.Z().emit(new Event.Process(null, 1, null));
                break;
        }
        return zy11Var;
    }
}
