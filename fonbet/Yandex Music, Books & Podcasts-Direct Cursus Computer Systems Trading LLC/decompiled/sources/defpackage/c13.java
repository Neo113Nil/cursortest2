package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class c13 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pxf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c13(pxf pxfVar, int i) {
        super(1);
        this.r = i;
        this.s = pxfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.b = (qre) obj;
                break;
            default:
                this.s.b = (qre) obj;
                break;
        }
        return Unit.a;
    }
}
