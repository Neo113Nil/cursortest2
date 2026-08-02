package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jsf extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ aqi s;
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ List u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jsf(aqi aqiVar, ArrayList arrayList, List list, boolean z, int i) {
        super(1);
        this.r = i;
        this.s = aqiVar;
        this.t = arrayList;
        this.u = list;
        this.v = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jsk jskVar = (jsk) obj;
                isf isfVar = new isf(this.t, this.u, this.v, 0);
                jskVar.a = true;
                isfVar.invoke(jskVar);
                jskVar.a = false;
                this.s.getValue();
                break;
            default:
                jsk jskVar2 = (jsk) obj;
                isf isfVar2 = new isf(this.t, this.u, this.v, 1);
                jskVar2.a = true;
                isfVar2.invoke(jskVar2);
                jskVar2.a = false;
                this.s.getValue();
                break;
        }
        return Unit.a;
    }
}
