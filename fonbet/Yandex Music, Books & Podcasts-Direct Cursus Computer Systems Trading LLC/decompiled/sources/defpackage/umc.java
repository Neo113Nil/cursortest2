package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class umc extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ymc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ umc(ymc ymcVar, gnc gncVar, int i) {
        super(1);
        this.r = i;
        this.s = ymcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.r) {
            case 0:
                ksk kskVar = (ksk) obj;
                if (kskVar != null) {
                    i = kskVar.a0();
                    i2 = kskVar.Z();
                } else {
                    i = 0;
                    i2 = 0;
                }
                new qpe(qpe.a(i, i2));
                this.s.getClass();
                break;
            default:
                ksk kskVar2 = (ksk) obj;
                if (kskVar2 != null) {
                    i3 = kskVar2.a0();
                    i4 = kskVar2.Z();
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                new qpe(qpe.a(i3, i4));
                this.s.getClass();
                break;
        }
        return Unit.a;
    }
}
