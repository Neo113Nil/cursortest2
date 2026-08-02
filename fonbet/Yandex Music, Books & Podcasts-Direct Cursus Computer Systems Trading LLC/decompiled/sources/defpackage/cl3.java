package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cl3 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2r b;

    public /* synthetic */ cl3(s2r s2rVar, int i) {
        this.a = i;
        this.b = s2rVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                tre treVar = (tre) obj;
                boolean z = treVar instanceof k4e;
                s2r s2rVar = this.b;
                if (z) {
                    s2rVar.add(treVar);
                } else if (treVar instanceof l4e) {
                    s2rVar.remove(((l4e) treVar).a);
                } else if (treVar instanceof poc) {
                    s2rVar.add(treVar);
                } else if (treVar instanceof qoc) {
                    s2rVar.remove(((qoc) treVar).a);
                } else if (treVar instanceof rqm) {
                    s2rVar.add(treVar);
                } else if (treVar instanceof sqm) {
                    s2rVar.remove(((sqm) treVar).a);
                } else if (treVar instanceof qqm) {
                    s2rVar.remove(((qqm) treVar).a);
                }
                break;
            case 1:
                tre treVar2 = (tre) obj;
                boolean z2 = treVar2 instanceof k4e;
                s2r s2rVar2 = this.b;
                if (z2) {
                    s2rVar2.add(treVar2);
                } else if (treVar2 instanceof l4e) {
                    s2rVar2.remove(((l4e) treVar2).a);
                } else if (treVar2 instanceof poc) {
                    s2rVar2.add(treVar2);
                } else if (treVar2 instanceof qoc) {
                    s2rVar2.remove(((qoc) treVar2).a);
                } else if (treVar2 instanceof rqm) {
                    s2rVar2.add(treVar2);
                } else if (treVar2 instanceof sqm) {
                    s2rVar2.remove(((sqm) treVar2).a);
                } else if (treVar2 instanceof qqm) {
                    s2rVar2.remove(((qqm) treVar2).a);
                }
                break;
            case 2:
                tre treVar3 = (tre) obj;
                boolean z3 = treVar3 instanceof rqm;
                s2r s2rVar3 = this.b;
                if (z3) {
                    s2rVar3.add(treVar3);
                } else if (treVar3 instanceof sqm) {
                    s2rVar3.remove(((sqm) treVar3).a);
                } else if (treVar3 instanceof qqm) {
                    s2rVar3.remove(((qqm) treVar3).a);
                } else if (treVar3 instanceof joa) {
                    s2rVar3.add(treVar3);
                } else if (treVar3 instanceof koa) {
                    s2rVar3.remove(((koa) treVar3).a);
                } else if (treVar3 instanceof ioa) {
                    s2rVar3.remove(((ioa) treVar3).a);
                }
                break;
            case 3:
                tre treVar4 = (tre) obj;
                boolean z4 = treVar4 instanceof rqm;
                s2r s2rVar4 = this.b;
                if (z4) {
                    s2rVar4.add(treVar4);
                } else if (treVar4 instanceof sqm) {
                    s2rVar4.remove(((sqm) treVar4).a);
                } else if (treVar4 instanceof qqm) {
                    s2rVar4.remove(((qqm) treVar4).a);
                } else if (treVar4 instanceof joa) {
                    s2rVar4.add(treVar4);
                } else if (treVar4 instanceof koa) {
                    s2rVar4.remove(((koa) treVar4).a);
                } else if (treVar4 instanceof ioa) {
                    s2rVar4.remove(((ioa) treVar4).a);
                }
                break;
            default:
                tre treVar5 = (tre) obj;
                boolean z5 = treVar5 instanceof rqm;
                s2r s2rVar5 = this.b;
                if (z5) {
                    s2rVar5.add(treVar5);
                } else if (treVar5 instanceof sqm) {
                    s2rVar5.remove(((sqm) treVar5).a);
                } else if (treVar5 instanceof qqm) {
                    s2rVar5.remove(((qqm) treVar5).a);
                } else if (treVar5 instanceof joa) {
                    s2rVar5.add(treVar5);
                } else if (treVar5 instanceof koa) {
                    s2rVar5.remove(((koa) treVar5).a);
                } else if (treVar5 instanceof ioa) {
                    s2rVar5.remove(((ioa) treVar5).a);
                }
                break;
        }
        return Unit.a;
    }
}
