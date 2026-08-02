package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ln4 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ tqn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln4(tqn tqnVar, int i) {
        super(1);
        this.r = i;
        this.s = tqnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.r) {
            case 0:
                w9t w9tVar = (w9t) obj;
                tqn tqnVar = this.s;
                if (!tqnVar.a) {
                    w9tVar.getClass();
                    if (!((bxo) w9tVar).o) {
                        z = false;
                        tqnVar.a = z;
                        return Boolean.valueOf(!z);
                    }
                }
                z = true;
                tqnVar.a = z;
                return Boolean.valueOf(!z);
            case 1:
                mma mmaVar = (mma) obj;
                if (!mmaVar.n) {
                    return v9t.b;
                }
                if (mmaVar.p != null) {
                    sme.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                mmaVar.p = null;
                tqn tqnVar2 = this.s;
                tqnVar2.a = tqnVar2.a;
                return v9t.a;
            case 2:
                if (!((j4e) obj).q) {
                    return v9t.a;
                }
                this.s.a = false;
                return v9t.c;
            default:
                if (((idp) obj).f.a.a.b.length() > 0) {
                    this.s.a = false;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln4(efo efoVar, mma mmaVar, tqn tqnVar) {
        super(1);
        this.r = 1;
        this.s = tqnVar;
    }
}
