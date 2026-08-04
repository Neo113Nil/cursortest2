package com.gamericefishpro.space.i2;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ t e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(t tVar, int i) {
        super(1);
        this.d = i;
        this.e = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = ((com.gamericefishpro.space.x1.a) obj).a;
                t tVar = this.e;
                boolean zRequestFocusFromTouch = true;
                if (i == 1) {
                    zRequestFocusFromTouch = tVar.isInTouchMode();
                } else if (i != 2) {
                    zRequestFocusFromTouch = false;
                } else if (tVar.isInTouchMode()) {
                    zRequestFocusFromTouch = tVar.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            case 1:
                int i2 = ((com.gamericefishpro.space.m1.c) obj).a;
                com.gamericefishpro.space.m1.k kVar = (com.gamericefishpro.space.m1.k) this.e.getFocusOwner();
                t tVar2 = kVar.a;
                com.gamericefishpro.space.m1.u uVarF = kVar.f();
                if (uVarF == null || !uVarF.H || !tVar2.w(i2)) {
                    com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
                    a0Var.d = Boolean.FALSE;
                    com.gamericefishpro.space.m1.u uVarF2 = kVar.f();
                    Boolean boolE = kVar.e(i2, tVar2.getEmbeddedViewFocusRect(), new com.gamericefishpro.space.m1.j(a0Var, i2));
                    if ((!Intrinsics.a(boolE, Boolean.TRUE) || uVarF2 == kVar.f()) && boolE != null && a0Var.d != null && boolE.booleanValue()) {
                        ((Boolean) a0Var.d).getClass();
                    }
                }
                return Unit.a;
            default:
                Function0 function0 = (Function0) obj;
                t tVar3 = this.e;
                tVar3.getUncaughtExceptionHandler$ui();
                Handler handler = tVar3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = tVar3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new com.gamericefishpro.space.f3.a(3, function0));
                    }
                }
                return Unit.a;
        }
    }
}
