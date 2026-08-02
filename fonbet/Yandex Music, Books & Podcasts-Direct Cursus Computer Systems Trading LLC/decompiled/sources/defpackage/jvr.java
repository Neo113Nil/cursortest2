package defpackage;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jvr extends uif implements pyc {
    public final /* synthetic */ Object r;
    public final /* synthetic */ nvr s;
    public final /* synthetic */ a2o t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(Map map, nvr nvrVar, a2o a2oVar, Function2 function2, float f, boolean z) {
        super(3);
        bxj bxjVar = bxj.a;
        this.r = map;
        this.s = nvrVar;
        this.t = a2oVar;
        this.u = function2;
        this.v = f;
        this.w = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(43594985);
        ?? r5 = this.r;
        if (r5.isEmpty()) {
            xq0.x("You must have at least one anchor.");
            return null;
        }
        if (CollectionsKt.K(r5.values()).size() != r5.size()) {
            xq0.x("You cannot have two anchors mapped to the same state.");
            return null;
        }
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        nvr nvrVar = this.s;
        if (((Map) nvrVar.i.getValue()).isEmpty()) {
            Float v = q7g.v(nvrVar.c.getValue(), r5);
            if (v == null) {
                xq0.x("The initial value must have an associated anchor.");
                return null;
            }
            nvrVar.e.h(v.floatValue());
            nvrVar.g.h(v.floatValue());
        }
        boolean f = oq5Var.f(nvrVar) | oq5Var.h(r5) | oq5Var.f(this.t) | oq5Var.f(this.u) | oq5Var.f(jx7Var) | oq5Var.c(this.v);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (f || K == kjnVar) {
            ivr ivrVar = new ivr(this.s, r5, this.t, jx7Var, this.u, this.v, null);
            oq5Var.k0(ivrVar);
            K = ivrVar;
        }
        gld.y(r5, nvrVar, (Function2) K, oq5Var);
        boolean booleanValue = ((Boolean) nvrVar.d.getValue()).booleanValue();
        nl7 nl7Var = nvrVar.p;
        bxj bxjVar = bxj.b;
        boolean f2 = oq5Var.f(nvrVar);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = new d90(nvrVar, (Continuation) null, 3);
            oq5Var.k0(K2);
        }
        yci a = zoa.a(vci.a, nl7Var, bxjVar, this.w, null, booleanValue, null, (pyc) K2, false, 32);
        oq5Var.p(false);
        return a;
    }
}
