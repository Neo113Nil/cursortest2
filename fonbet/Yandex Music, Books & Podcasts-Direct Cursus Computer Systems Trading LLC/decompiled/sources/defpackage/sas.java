package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sas extends uif implements Function2 {
    public final /* synthetic */ uas r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ uoi t;
    public final /* synthetic */ hs7 u;
    public final /* synthetic */ dup v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sas(uas uasVar, boolean z, uoi uoiVar, hs7 hs7Var, dup dupVar, float f, float f2, int i) {
        super(2);
        this.r = uasVar;
        this.s = z;
        this.t = uoiVar;
        this.u = hs7Var;
        this.v = dupVar;
        this.w = f;
        this.x = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(12582913);
        this.r.a(this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, R);
        return Unit.a;
    }
}
