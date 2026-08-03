package wd;

import ac.o;
import fc.d;
import hc.j;
import m0.d1;
import oc.e;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends j implements e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f7734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f7735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1 f7736i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f7737j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d1 d1Var, d1 d1Var2, d1 d1Var3, d1 d1Var4, d dVar) {
        super(2, dVar);
        this.f7734g = d1Var;
        this.f7735h = d1Var2;
        this.f7736i = d1Var3;
        this.f7737j = d1Var4;
    }

    @Override // hc.a
    public final d create(Object obj, d dVar) {
        return new b(this.f7734g, this.f7735h, this.f7736i, this.f7737j, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) create((y) obj, (d) obj2);
        o oVar = o.f277a;
        bVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        if (((Boolean) this.f7734g.getValue()).booleanValue() && ((String) this.f7735h.getValue()) != null) {
            d1 d1Var = this.f7736i;
            if (!((Boolean) d1Var.getValue()).booleanValue()) {
                Boolean bool = Boolean.TRUE;
                d1Var.setValue(bool);
                this.f7737j.setValue(bool);
            }
        }
        return o.f277a;
    }
}
