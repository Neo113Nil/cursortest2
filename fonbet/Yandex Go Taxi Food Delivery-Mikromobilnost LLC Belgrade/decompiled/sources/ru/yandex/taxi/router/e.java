package ru.yandex.taxi.router;

import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.d6z;
import defpackage.jzg0;
import defpackage.l4y0;
import defpackage.n4y0;
import defpackage.ny61;
import defpackage.o4y0;
import defpackage.p4y0;
import defpackage.q4y0;
import defpackage.rvy;
import defpackage.scc;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wjm;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ wjm b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable w;
    public final /* synthetic */ Runnable x;
    public final /* synthetic */ Runnable y;

    public e(vpr vprVar, wjm wjmVar, boolean z, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.a = vprVar;
        this.b = wjmVar;
        this.c = z;
        this.w = runnable;
        this.x = runnable2;
        this.y = runnable3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LiveLocationOptionsPopupRouter$show$$inlined$map$1$2$1 liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LiveLocationOptionsPopupRouter$show$$inlined$map$1$2$1) {
            liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1 = (LiveLocationOptionsPopupRouter$show$$inlined$map$1$2$1) continuation;
            int i2 = liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rvy rvyVar = (rvy) obj;
                    boolean z = this.c;
                    String Y = d6z.Y(rvyVar, (z ? rvyVar.d : rvyVar.e).a);
                    rvy.a aVar = rvyVar.e;
                    rvy.a aVar2 = rvyVar.d;
                    String Y2 = d6z.Y(rvyVar, (z ? aVar2 : aVar).b);
                    final wjm wjmVar = this.b;
                    Drawable t = vng.t(jzg0.ic_order_card_live_location_filled, ((avj0) ((zuj0) wjmVar.w)).a);
                    q4y0 q4y0Var = new q4y0(0);
                    String Y3 = d6z.Y(rvyVar, (z ? aVar2 : aVar).c);
                    bdc bdcVar = new bdc(xng0.textMain);
                    final Runnable runnable = this.w;
                    final int i3 = 0;
                    o4y0 o4y0Var = new o4y0(Y3, bdcVar, 0, new n4y0() { // from class: tvy
                        @Override // defpackage.n4y0
                        public final void h() {
                            int i4 = i3;
                            Runnable runnable2 = runnable;
                            wjm wjmVar2 = wjmVar;
                            switch (i4) {
                                case 0:
                                    runnable2.run();
                                    r0 r0Var = (r0) wjmVar2.x;
                                    Boolean bool = Boolean.TRUE;
                                    r0Var.getClass();
                                    r0Var.m(null, bool);
                                    break;
                                case 1:
                                    runnable2.run();
                                    r0 r0Var2 = (r0) wjmVar2.x;
                                    Boolean bool2 = Boolean.TRUE;
                                    r0Var2.getClass();
                                    r0Var2.m(null, bool2);
                                    break;
                                default:
                                    runnable2.run();
                                    r0 r0Var3 = (r0) wjmVar2.x;
                                    Boolean bool3 = Boolean.TRUE;
                                    r0Var3.getClass();
                                    r0Var3.m(null, bool3);
                                    break;
                            }
                        }
                    });
                    String Y4 = d6z.Y(rvyVar, (z ? aVar2 : aVar).d);
                    bdc bdcVar2 = new bdc(xng0.textMain);
                    bdc bdcVar3 = new bdc(xng0.controlMinor);
                    final Runnable runnable2 = this.x;
                    final int i4 = 1;
                    p4y0 p4y0Var = new p4y0(Y4, bdcVar3, bdcVar2, 0, new n4y0() { // from class: tvy
                        @Override // defpackage.n4y0
                        public final void h() {
                            int i42 = i4;
                            Runnable runnable22 = runnable2;
                            wjm wjmVar2 = wjmVar;
                            switch (i42) {
                                case 0:
                                    runnable22.run();
                                    r0 r0Var = (r0) wjmVar2.x;
                                    Boolean bool = Boolean.TRUE;
                                    r0Var.getClass();
                                    r0Var.m(null, bool);
                                    break;
                                case 1:
                                    runnable22.run();
                                    r0 r0Var2 = (r0) wjmVar2.x;
                                    Boolean bool2 = Boolean.TRUE;
                                    r0Var2.getClass();
                                    r0Var2.m(null, bool2);
                                    break;
                                default:
                                    runnable22.run();
                                    r0 r0Var3 = (r0) wjmVar2.x;
                                    Boolean bool3 = Boolean.TRUE;
                                    r0Var3.getClass();
                                    r0Var3.m(null, bool3);
                                    break;
                            }
                        }
                    });
                    if (z) {
                        aVar = aVar2;
                    }
                    String Y5 = d6z.Y(rvyVar, aVar.e);
                    bdc bdcVar4 = new bdc(xng0.textOnControl);
                    bdc bdcVar5 = new bdc(xng0.controlMain);
                    final Runnable runnable3 = this.y;
                    final int i5 = 2;
                    l4y0 l4y0Var = new l4y0((CharSequence) Y, (CharSequence) Y2, t, true, scc.g(q4y0Var, o4y0Var, p4y0Var, new p4y0(Y5, bdcVar5, bdcVar4, new n4y0() { // from class: tvy
                        @Override // defpackage.n4y0
                        public final void h() {
                            int i42 = i5;
                            Runnable runnable22 = runnable3;
                            wjm wjmVar2 = wjmVar;
                            switch (i42) {
                                case 0:
                                    runnable22.run();
                                    r0 r0Var = (r0) wjmVar2.x;
                                    Boolean bool = Boolean.TRUE;
                                    r0Var.getClass();
                                    r0Var.m(null, bool);
                                    break;
                                case 1:
                                    runnable22.run();
                                    r0 r0Var2 = (r0) wjmVar2.x;
                                    Boolean bool2 = Boolean.TRUE;
                                    r0Var2.getClass();
                                    r0Var2.m(null, bool2);
                                    break;
                                default:
                                    runnable22.run();
                                    r0 r0Var3 = (r0) wjmVar2.x;
                                    Boolean bool3 = Boolean.TRUE;
                                    r0Var3.getClass();
                                    r0Var3.m(null, bool3);
                                    break;
                            }
                        }
                    }, 8)));
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.L$0 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.L$1 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.L$2 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.L$3 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l4y0Var, liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1 = new LiveLocationOptionsPopupRouter$show$$inlined$map$1$2$1(this, continuation);
        Object obj22 = liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liveLocationOptionsPopupRouter$show$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
