package com.gamericefishpro.space.b2;

import android.content.Context;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.d0.l1;
import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.i2.h0;
import com.gamericefishpro.space.i2.i0;
import com.gamericefishpro.space.i2.l0;
import com.gamericefishpro.space.i2.m0;
import com.gamericefishpro.space.i2.n0;
import com.gamericefishpro.space.i2.o2;
import com.gamericefishpro.space.i2.p2;
import com.gamericefishpro.space.l4.o0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, Object obj, Object obj2) {
        super(1);
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Unit unit;
        int i = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                v vVar = (v) this.i;
                if (motionEvent.getActionMasked() == 0) {
                    com.gamericefishpro.space.tb.s sVar = (com.gamericefishpro.space.tb.s) this.e;
                    w wVar = vVar.a;
                    if (wVar == null) {
                        Intrinsics.h("onTouchEvent");
                        throw null;
                    }
                    sVar.e = ((Boolean) wVar.invoke(motionEvent)).booleanValue() ? s.e : s.i;
                } else {
                    w wVar2 = vVar.a;
                    if (wVar2 == null) {
                        Intrinsics.h("onTouchEvent");
                        throw null;
                    }
                    wVar2.invoke(motionEvent);
                }
                return Unit.a;
            case 1:
                ((com.gamericefishpro.space.h2.f0) this.e).d0(((com.gamericefishpro.space.h1.m) obj).c((com.gamericefishpro.space.h1.m) this.i));
                return Unit.a;
            case 2:
                ((t0) obj).h((u0) this.e, 0, 0, ((com.gamericefishpro.space.h1.p) this.i).H);
                return Unit.a;
            case 3:
                Context context = (Context) this.e;
                Context applicationContext = context.getApplicationContext();
                h0 h0Var = (h0) this.i;
                applicationContext.registerComponentCallbacks(h0Var);
                return new l1(6, context, h0Var);
            case 4:
                Context context2 = (Context) this.e;
                Context applicationContext2 = context2.getApplicationContext();
                i0 i0Var = (i0) this.i;
                applicationContext2.registerComponentCallbacks(i0Var);
                return new l1(7, context2, i0Var);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                l0 l0Var = (l0) this.e;
                m0 m0Var = (m0) this.i;
                synchronized (l0Var.w) {
                    l0Var.z.remove(m0Var);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((n0) this.e).d.removeFrameCallback((m0) this.i);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.i2.l lVar = (com.gamericefishpro.space.i2.l) obj;
                Function2 function2 = (Function2) this.i;
                p2 p2Var = (p2) this.e;
                if (!p2Var.i) {
                    com.gamericefishpro.space.z4.w wVarG = lVar.a.g();
                    p2Var.w = function2;
                    if (p2Var.v == null) {
                        p2Var.v = wVarG;
                        wVarG.a(p2Var);
                    } else if (wVarG.c.a(com.gamericefishpro.space.z4.p.i)) {
                        p2Var.e.B(new com.gamericefishpro.space.b1.h(1330788943, new o2(p2Var, function2, i), true));
                    }
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                Throwable th = (Throwable) obj;
                ((d0) this.e).invoke(th);
                com.gamericefishpro.space.ri.e eVar = (com.gamericefishpro.space.ri.e) ((com.gamericefishpro.space.u6.n) this.i).i;
                eVar.j(th, false);
                do {
                    Object objA = com.gamericefishpro.space.ri.l.a(eVar.g());
                    if (objA != null) {
                        o0 msg = (o0) objA;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        msg.b.W(new com.gamericefishpro.space.pi.q(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        Unit unit2 = Unit.a;
                        unit = Unit.a;
                    } else {
                        unit = null;
                    }
                } while (unit != null);
                return Unit.a;
            case 9:
                Throwable th2 = (Throwable) obj;
                com.gamericefishpro.space.h3.i iVar = (com.gamericefishpro.space.h3.i) this.e;
                if (th2 == null) {
                    Object objH = ((com.gamericefishpro.space.pi.e0) this.i).H();
                    iVar.d = true;
                    com.gamericefishpro.space.h3.k kVar = iVar.b;
                    if (kVar != null && kVar.e.j(objH)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    iVar.d = true;
                    com.gamericefishpro.space.h3.k kVar2 = iVar.b;
                    if (kVar2 != null && kVar2.e.cancel(true)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                } else {
                    iVar.d = true;
                    com.gamericefishpro.space.h3.k kVar3 = iVar.b;
                    if (kVar3 != null && kVar3.e.k(th2)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                }
                return Unit.a;
            case 10:
                t0.p((t0) obj, (u0) this.e, ((com.gamericefishpro.space.o1.m) this.i).H);
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                t0.p((t0) obj, (u0) this.e, ((com.gamericefishpro.space.o1.l0) this.i).S);
                return Unit.a;
            default:
                ((t0) obj).h((u0) this.e, 0, 0, ((com.gamericefishpro.space.v.x) this.i).c.g());
                return Unit.a;
        }
    }
}
