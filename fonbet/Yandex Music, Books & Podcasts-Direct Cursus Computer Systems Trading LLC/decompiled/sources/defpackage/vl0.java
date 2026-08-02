package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vl0 extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Object s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(wn5 wn5Var, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.s = wn5Var;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.x = obj4;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                etn.d((d8t) this.u, (Function1) this.v, (e9b) this.w, (vpb) this.x, (wn5) this.s, (hq5) obj, rvf.R(this.t | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                wn5 wn5Var = (wn5) this.s;
                wn5Var.j(this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.t) | 1);
                break;
            default:
                ((Number) obj2).intValue();
                d8t d8tVar = (d8t) this.u;
                z7t z7tVar = (z7t) this.v;
                wdc wdcVar = (wdc) this.s;
                i8t.a(d8tVar, z7tVar, this.w, this.x, wdcVar, (hq5) obj, rvf.R(this.t | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(d8t d8tVar, z7t z7tVar, Object obj, Object obj2, wdc wdcVar, int i) {
        super(2);
        this.u = d8tVar;
        this.v = z7tVar;
        this.w = obj;
        this.x = obj2;
        this.s = wdcVar;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(d8t d8tVar, Function1 function1, e9b e9bVar, vpb vpbVar, wn5 wn5Var, int i) {
        super(2);
        this.u = d8tVar;
        this.v = function1;
        this.w = e9bVar;
        this.x = vpbVar;
        this.s = wn5Var;
        this.t = i;
    }
}
