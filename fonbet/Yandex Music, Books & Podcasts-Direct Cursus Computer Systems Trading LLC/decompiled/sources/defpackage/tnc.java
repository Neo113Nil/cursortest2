package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tnc implements pjc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public tnc(pjc pjcVar, ueo ueoVar, boolean z, Function1 function1) {
        this.b = pjcVar;
        this.d = ueoVar;
        this.c = z;
        this.e = function1;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new snc(rjcVar, (ueo) this.d, this.c, (Function1) this.e), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new snc(rjcVar, (w5u) this.d, (x1u) this.e, this.c), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public tnc(pjc pjcVar, w5u w5uVar, x1u x1uVar, boolean z) {
        this.b = pjcVar;
        this.d = w5uVar;
        this.e = x1uVar;
        this.c = z;
    }
}
