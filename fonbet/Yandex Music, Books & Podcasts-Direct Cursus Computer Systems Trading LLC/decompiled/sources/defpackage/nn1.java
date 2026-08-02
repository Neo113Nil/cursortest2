package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class nn1 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ nn1(aqi aqiVar, aqi aqiVar2, int i) {
        this.a = i;
        this.b = aqiVar;
        this.c = aqiVar2;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        List list;
        switch (this.a) {
            case 0:
                sn1 sn1Var = (sn1) obj;
                rn1 rn1Var = sn1Var instanceof rn1 ? (rn1) sn1Var : null;
                aqi aqiVar = this.b;
                aqi aqiVar2 = this.c;
                aqiVar.setValue(aqiVar2.getValue());
                aqiVar2.setValue("{artists: " + ((rn1Var == null || (list = rn1Var.a) == null) ? null : CollectionsKt.X(list, null, null, null, new ci1(22), 31)) + ", key: " + (rn1Var != null ? new Integer(System.identityHashCode(rn1Var)) : null) + "}");
                break;
            default:
                this.b.setValue(Integer.valueOf(((Number) obj).intValue()));
                this.c.setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
