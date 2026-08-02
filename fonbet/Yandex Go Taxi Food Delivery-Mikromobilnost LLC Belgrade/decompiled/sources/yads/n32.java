package yads;

import android.content.Context;
import defpackage.au71;
import defpackage.fe81;
import defpackage.fo71;
import defpackage.jx71;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rx71;
import defpackage.so61;
import defpackage.tg81;
import defpackage.tje;
import defpackage.tse;
import defpackage.v881;
import defpackage.w381;
import defpackage.wls;
import defpackage.z081;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class n32 extends SuspendLambda implements wls {
    public noh b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ fo71 f;
    public final /* synthetic */ au71 g;
    public final /* synthetic */ rx71 h;
    public final /* synthetic */ fe81 i;
    public final /* synthetic */ tg81 j;
    public final /* synthetic */ z081 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n32(Context context, fo71 fo71Var, au71 au71Var, rx71 rx71Var, fe81 fe81Var, tg81 tg81Var, z081 z081Var, Continuation continuation) {
        super(2, continuation);
        this.e = context;
        this.f = fo71Var;
        this.g = au71Var;
        this.h = rx71Var;
        this.i = fe81Var;
        this.j = tg81Var;
        this.k = z081Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n32 n32Var = new n32(this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
        n32Var.d = obj;
        return n32Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((n32) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        v881 v881Var;
        v881 v881Var2;
        tg81 tg81Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.d;
            v881 v881Var3 = new v881(this.e);
            h = tje.h(tseVar, null, null, new m32(this.h, this.i, this.e, this.j, v881Var3, this.k, null), 3);
            pzt0 N = tje.N(tseVar, null, null, new l32(this.h, this.j, null), 3);
            this.d = v881Var3;
            this.b = h;
            this.c = 1;
            if (N.u0(this) != coroutineSingletons) {
                v881Var = v881Var3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v881 v881Var4 = (v881) this.d;
            b.b(obj);
            v881Var2 = v881Var4;
            tg81Var = (tg81) obj;
            if (tg81Var != null) {
                this.f.b(so61.u);
            } else {
                au71 au71Var = this.g;
                au71Var.b.a(f5.n);
                jx71 jx71Var = au71Var.c;
                w381 w381Var = jx71Var.y;
                tje.N(w381Var.d, null, null, new ly1(w381Var, tg81Var, v881Var2, jx71Var, au71Var, null), 3);
            }
            return zy11.a;
        }
        h = this.b;
        v881Var = (v881) this.d;
        b.b(obj);
        this.d = v881Var;
        this.b = null;
        this.c = 2;
        obj = h.k(this);
        if (obj != coroutineSingletons) {
            v881Var2 = v881Var;
            tg81Var = (tg81) obj;
            if (tg81Var != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
