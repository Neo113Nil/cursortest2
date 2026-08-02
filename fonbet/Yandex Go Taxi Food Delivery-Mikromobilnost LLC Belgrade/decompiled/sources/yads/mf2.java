package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import defpackage.a271;
import defpackage.ad71;
import defpackage.aja1;
import defpackage.np61;
import defpackage.ny61;
import defpackage.ql81;
import defpackage.qn61;
import defpackage.t881;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class mf2 extends SuspendLambda implements wls {
    public zp1 b;
    public MediatedAdapterPrefetcher c;
    public int d;
    public final /* synthetic */ t881 e;
    public final /* synthetic */ mr1 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ xz h;
    public final /* synthetic */ long i;
    public final /* synthetic */ a271 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf2(t881 t881Var, mr1 mr1Var, Context context, xz xzVar, long j, a271 a271Var, Continuation continuation) {
        super(2, continuation);
        this.e = t881Var;
        this.f = mr1Var;
        this.g = context;
        this.h = xzVar;
        this.i = j;
        this.j = a271Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mf2(this.e, this.f, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((mf2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            b.b(obj);
            ad71 ad71Var = this.e.d;
            mr1 mr1Var = this.f;
            ad71Var.getClass();
            String str = mr1Var.b;
            zp1 zp1Var = new zp1(str, mr1Var.c, null, null, null, null, null, null);
            try {
                t881.b(this.e, zp1Var);
                this.e.c.i(this.g, zp1Var, a.class);
                te2 te2Var = te2.f;
                np61 np61Var = new np61(str, new ql81(yf2.d, te2Var.c, Integer.valueOf(te2Var.b)));
                this.e.a.l(this.g, this.h, np61Var, null);
                return np61Var;
            } catch (IllegalArgumentException e) {
                return aja1.a(e, zp1Var.b);
            }
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zp1 zp1Var2 = this.b;
        try {
            b.b(obj);
            np61 np61Var2 = (np61) obj;
            qn61 qn61Var = this.e.b;
            qn61Var.a.c(qn61Var.c, qn61Var.b, null);
            Long a = this.e.b.a();
            if (np61Var2 == null) {
                throw null;
            }
            t881 t881Var = this.e;
            t881Var.a.l(this.g, this.h, np61Var2, a);
            throw null;
        } catch (Exception e2) {
            qn61 qn61Var2 = this.e.b;
            qn61Var2.a.c(qn61Var2.c, qn61Var2.b, null);
            Long a2 = this.e.b.a();
            this.e.a.l(this.g, this.h, aja1.a(e2, zp1Var2.b), a2);
            throw null;
        }
    }
}
