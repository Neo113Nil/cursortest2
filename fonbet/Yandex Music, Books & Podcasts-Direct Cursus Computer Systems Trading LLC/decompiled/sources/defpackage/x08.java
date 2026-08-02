package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class x08 extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x08(sj sjVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.n = sjVar;
        this.l = z;
        this.m = z2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x08((sj) this.n, this.l, this.m, continuation);
            default:
                return new x08(this.l, this.m, (fk0) this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((x08) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r12.f(r3, r11) == r0) goto L10;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                sj sjVar = (sj) this.n;
                jyr jyrVar = (jyr) sjVar.e;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                boolean z = this.m;
                boolean z2 = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    w08 w08Var = (w08) jyrVar.getValue();
                    boolean z3 = (w08Var.a == null || w08Var.b == null) ? false : true;
                    Boolean bool = ((w08) jyrVar.getValue()).a;
                    boolean z4 = z2 != (bool != null ? bool.booleanValue() : false);
                    Boolean bool2 = ((w08) jyrVar.getValue()).b;
                    boolean z5 = z != (bool2 != null ? bool2.booleanValue() : false);
                    if (!z3 || z4 || z5) {
                        long j = (z3 && z4 && !z5) ? 3000L : 0L;
                        this.k = 1;
                        if (y2x.o(j, this) == nm6Var) {
                        }
                    }
                    break;
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                u08 u08Var = (u08) ((jyr) sjVar.f).getValue();
                ynn c = irv.c((Context) u08Var.a.getValue(), 0.0f, 0.0f, 0.0f);
                float f = lg3.g0((Context) u08Var.a.getValue()).density;
                nmb nmbVar = (nmb) u08Var.b.getValue();
                String valueOf = String.valueOf(eeh.b((c.c - c.a) / f));
                String valueOf2 = String.valueOf(eeh.b((c.d - c.b) / f));
                ujb ujbVar = z2 ? ujb.Landscape : ujb.Portrait;
                nmbVar.getClass();
                valueOf.getClass();
                valueOf2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("orientation", ujbVar.a);
                linkedHashMap.put("width_display_in_dp", valueOf);
                eta.u(linkedHashMap, "height_display_in_dp", valueOf2, z, "multi_window");
                linkedHashMap.put("_meta", nmb.u(1));
                nmbVar.C("Application.Device", linkedHashMap);
                ((w08) jyrVar.getValue()).a = Boolean.valueOf(z2);
                ((w08) jyrVar.getValue()).b = Boolean.valueOf(z);
                break;
            default:
                Object obj2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    boolean z6 = this.l;
                    boolean z7 = this.m;
                    if (!z6 && !z7) {
                        fk0 fk0Var = (fk0) this.n;
                        Float f2 = new Float(1.0f);
                        this.k = 1;
                        break;
                    } else {
                        act S = weo.S(800, 0, dcc.a, 2);
                        tm0 tm0Var = S;
                        if (z7) {
                            tm0Var = weo.C(S, jyn.b, 0L, 4);
                        }
                        tm0 tm0Var2 = tm0Var;
                        fk0 fk0Var2 = (fk0) this.n;
                        Float f3 = new Float(z7 ? 0.33f : 1.0f);
                        this.k = 2;
                        if (fk0.c(fk0Var2, f3, tm0Var2, null, this, 12) == obj2) {
                        }
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                    obj2 = Unit.a;
                } else if (i2 == 2) {
                    qgg.h0(obj);
                    break;
                } else {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x08(boolean z, boolean z2, fk0 fk0Var, Continuation continuation) {
        super(2, continuation);
        this.l = z;
        this.m = z2;
        this.n = fk0Var;
    }
}
