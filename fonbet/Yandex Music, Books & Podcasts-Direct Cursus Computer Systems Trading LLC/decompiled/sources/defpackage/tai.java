package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tai extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uai s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tai(uai uaiVar, int i) {
        super(1);
        this.r = i;
        this.s = uaiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                uai uaiVar = this.s;
                if (uaiVar.e.b) {
                    uaiVar.d.invoke();
                }
                return Unit.a;
            default:
                uai uaiVar2 = this.s;
                uaiVar2.show();
                return new hi(12, uaiVar2);
        }
    }
}
