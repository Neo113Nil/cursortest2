package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class g03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ r9i s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g03(r9i r9iVar, int i) {
        super(1);
        this.r = i;
        this.s = r9iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                t9i t9iVar = (t9i) obj;
                t9iVar.getClass();
                this.s.p(t9iVar);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                this.s.l(str);
                break;
        }
        return Unit.a;
    }
}
