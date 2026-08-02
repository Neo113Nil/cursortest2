package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class moa implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ moa(ArrayList arrayList, aqi aqiVar, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = aqiVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                tre treVar = (tre) obj;
                boolean z = treVar instanceof joa;
                ArrayList arrayList = this.b;
                if (z) {
                    arrayList.add(treVar);
                } else if (treVar instanceof koa) {
                    arrayList.remove(((koa) treVar).a);
                } else if (treVar instanceof ioa) {
                    arrayList.remove(((ioa) treVar).a);
                }
                this.c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                tre treVar2 = (tre) obj;
                boolean z2 = treVar2 instanceof poc;
                ArrayList arrayList2 = this.b;
                if (z2) {
                    arrayList2.add(treVar2);
                } else if (treVar2 instanceof qoc) {
                    arrayList2.remove(((qoc) treVar2).a);
                }
                this.c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                tre treVar3 = (tre) obj;
                boolean z3 = treVar3 instanceof rqm;
                ArrayList arrayList3 = this.b;
                if (z3) {
                    arrayList3.add(treVar3);
                } else if (treVar3 instanceof sqm) {
                    arrayList3.remove(((sqm) treVar3).a);
                } else if (treVar3 instanceof qqm) {
                    arrayList3.remove(((qqm) treVar3).a);
                }
                this.c.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return Unit.a;
    }
}
