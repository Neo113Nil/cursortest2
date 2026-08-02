package yads;

import android.content.Context;
import defpackage.ei71;
import defpackage.fe81;
import defpackage.l8x;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qoh;
import defpackage.tg81;
import defpackage.tje;
import defpackage.tk81;
import defpackage.tse;
import defpackage.v881;
import defpackage.wls;
import defpackage.z081;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class i32 extends SuspendLambda implements wls {
    public noh b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fe81 e;
    public final /* synthetic */ ei71 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ tg81 h;
    public final /* synthetic */ z081 i;
    public final /* synthetic */ v881 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(fe81 fe81Var, ei71 ei71Var, Context context, tg81 tg81Var, z081 z081Var, v881 v881Var, Continuation continuation) {
        super(2, continuation);
        this.e = fe81Var;
        this.f = ei71Var;
        this.g = context;
        this.h = tg81Var;
        this.i = z081Var;
        this.j = v881Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i32 i32Var = new i32(this.e, this.f, this.g, this.h, this.i, this.j, continuation);
        i32Var.d = obj;
        return i32Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((i32) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r2.u0(r13) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l8x N;
        noh nohVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.d;
            boolean z = this.e.m;
            ei71 ei71Var = this.f;
            if (z) {
                pzt0 N2 = tje.N(tseVar, null, null, new f32(ei71Var, this.h, this.j, null), 3);
                N = tje.N(tseVar, null, null, new h32(this.f, this.g, this.h, null), 3);
                qoh h = tje.h(tseVar, null, null, new g32(this.f, this.g, this.h, this.i, null), 3);
                this.d = N;
                this.b = h;
                this.c = 1;
                if (N2.u0(this) != coroutineSingletons) {
                    nohVar = h;
                }
            } else {
                tk81 tk81Var = ei71Var.c;
                Context context = this.g;
                tg81 tg81Var = this.h;
                z081 z081Var = this.i;
                this.c = 4;
                Object b = tk81Var.b(false, context, tg81Var, z081Var, this);
                if (b != coroutineSingletons) {
                    return b;
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                nohVar = (noh) this.d;
                b.b(obj);
                this.d = null;
                this.c = 3;
                Object k = nohVar.k(this);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
            if (i == 3) {
                b.b(obj);
                return obj;
            }
            if (i == 4) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        nohVar = this.b;
        N = (l8x) this.d;
        b.b(obj);
        this.d = nohVar;
        this.b = null;
        this.c = 2;
    }
}
