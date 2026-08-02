package yads;

import android.content.Context;
import android.view.View;
import defpackage.a081;
import defpackage.b181;
import defpackage.b391;
import defpackage.cl81;
import defpackage.d391;
import defpackage.d881;
import defpackage.fe81;
import defpackage.fj71;
import defpackage.gg81;
import defpackage.gr81;
import defpackage.hlx0;
import defpackage.jh81;
import defpackage.lm71;
import defpackage.mj31;
import defpackage.mk81;
import defpackage.n871;
import defpackage.na81;
import defpackage.ny61;
import defpackage.o081;
import defpackage.uio0;
import defpackage.uy71;
import defpackage.v981;
import defpackage.vmn0;
import defpackage.vw81;
import defpackage.wls;
import defpackage.z4m0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class vy1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ wy1 c;
    public final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy1(wy1 wy1Var, View view, Continuation continuation) {
        super(2, continuation);
        this.c = wy1Var;
        this.d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vy1(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new vy1(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        a081 a081Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            wy1 wy1Var = this.c;
            b181 b181Var = wy1Var.b;
            View view = this.d;
            uy71 uy71Var = wy1Var.a;
            fj71 fj71Var = wy1Var.e;
            o081 o081Var = wy1Var.c;
            this.b = 1;
            z4m0 z4m0Var = b181Var.d.b;
            hlx0 hlx0Var = new hlx0((Context) z4m0Var.y, (fe81) z4m0Var.b, (v981) z4m0Var.c, (d881) z4m0Var.w, (d391) z4m0Var.x, fj71Var.b);
            z4m0Var.z = hlx0Var;
            uio0 uio0Var = (uio0) z4m0Var.A;
            if (uio0Var != null) {
                z4m0Var.A = uio0Var;
                ((n871) hlx0Var.c).k = uio0Var;
            }
            Context context = view.getContext();
            cl81 cl81Var = b181Var.i.a;
            hlx0 hlx0Var2 = b181Var.g;
            int i2 = 16;
            vmn0 vmn0Var = new vmn0((Context) hlx0Var2.x, (d881) hlx0Var2.w, (fe81) hlx0Var2.b, (v981) hlx0Var2.c, new mj31(i2, uy71Var.a, (uio0) hlx0Var2.y, o081Var.b));
            jh81 jh81Var = b181Var.e;
            v981 v981Var = b181Var.a;
            fe81 fe81Var = b181Var.c;
            d881 d881Var = b181Var.b;
            jh81Var.getClass();
            a081 a081Var2 = a081.g;
            if (a081Var2 == null) {
                synchronized (a081.f) {
                    a081Var = a081.g;
                    if (a081Var == null) {
                        a081Var = new a081();
                        a081.g = a081Var;
                    }
                }
                a081Var2 = a081Var;
            }
            gg81 a2 = a081Var2.a(context);
            if (a2 != null) {
                boolean z = a2.f;
            }
            vmn0 vmn0Var2 = new vmn0(context, v981Var, fe81Var, d881Var, cl81Var);
            lm71 lm71Var = new lm71(14, vmn0Var2);
            vw81 vw81Var = new vw81(new gr81(vmn0Var2), b181Var.h);
            a = b181Var.a(view, fj71Var, new na81(b181Var.c, b181Var.a, b181Var.b, vmn0Var, lm71Var, b181Var.d, b181Var.h, vw81Var), vw81Var, new mk81(vmn0Var), this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = obj;
        }
        if (((b391) a).a) {
            this.c.f.a();
        }
        return zy11.a;
    }
}
