package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ale implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public ale(yuv yuvVar, Function1 function1) {
        this.a = 4;
        this.b = function1;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.invoke(new Integer(((Number) obj).intValue()));
                break;
            case 1:
                tre treVar = (tre) obj;
                if (treVar instanceof loa) {
                    this.b.invoke(treVar);
                }
                break;
            case 2:
                tre treVar2 = (tre) obj;
                if (treVar2 instanceof loa) {
                    this.b.invoke(treVar2);
                }
                break;
            case 3:
                tre treVar3 = (tre) obj;
                if (treVar3 instanceof loa) {
                    this.b.invoke(treVar3);
                }
                break;
            default:
                rj6 rj6Var = (rj6) obj;
                rj6Var.getClass();
                this.b.invoke(rj6Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ale(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }
}
