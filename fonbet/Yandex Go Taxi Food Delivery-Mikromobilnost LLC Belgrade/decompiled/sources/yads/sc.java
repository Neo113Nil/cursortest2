package yads;

import defpackage.dj71;
import defpackage.g191;
import defpackage.gi81;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.vc71;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class sc extends SuspendLambda implements wls {
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gi81 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(gi81 gi81Var, Continuation continuation) {
        super(2, continuation);
        this.e = gi81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        sc scVar = new sc(this.e, continuation);
        scVar.d = obj;
        return scVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        sc scVar = new sc(this.e, (Continuation) obj2);
        scVar.d = (tse) obj;
        return scVar.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
    
        if (r3.equals(r10) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        vc71 vc71Var;
        noh nohVar2;
        Object k;
        vc71 vc71Var2;
        g191 g191Var;
        String c;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        boolean z = true;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.d;
            qoh h2 = tje.h(tseVar, null, null, new qc(this.e, null), 3);
            h = tje.h(tseVar, null, null, new rc(this.e, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new pc(this.e, null), 3);
            this.d = h;
            this.b = h3;
            this.c = 1;
            Object s = h2.s(this);
            if (s != coroutineSingletons) {
                nohVar = h3;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                vc71Var = (vc71) this.b;
                nohVar2 = (noh) this.d;
                b.b(obj);
                vc71 vc71Var3 = (vc71) obj;
                this.d = vc71Var;
                this.b = vc71Var3;
                this.c = 3;
                k = nohVar2.k(this);
                if (k != coroutineSingletons) {
                    vc71Var2 = vc71Var3;
                    obj = k;
                    String str2 = (String) obj;
                    g191Var = this.e.d;
                    c = ((pf1) g191Var.a).c("google_advertising_id_key");
                    if (vc71Var != null) {
                    }
                    if (c == null) {
                        ((pf1) g191Var.a).a("google_advertising_id_key", str);
                    }
                    g191 g191Var2 = this.e.d;
                    g191Var2.getClass();
                    boolean z2 = false;
                    if (vc71Var != null) {
                    }
                    return new dj71(vc71Var, vc71Var2, z2, str2);
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vc71Var2 = (vc71) this.b;
            vc71Var = (vc71) this.d;
            b.b(obj);
            String str22 = (String) obj;
            g191Var = this.e.d;
            c = ((pf1) g191Var.a).c("google_advertising_id_key");
            str = vc71Var != null ? vc71Var.a : null;
            if (c == null && str != null) {
                ((pf1) g191Var.a).a("google_advertising_id_key", str);
            }
            g191 g191Var22 = this.e.d;
            g191Var22.getClass();
            boolean z22 = false;
            if (vc71Var != null) {
                String str3 = vc71Var.a;
                synchronized (g191.x) {
                    String c2 = ((pf1) g191Var22.a).c("google_advertising_id_key");
                    if (c2 != null) {
                    }
                    z = false;
                }
                z22 = z;
            }
            return new dj71(vc71Var, vc71Var2, z22, str22);
        }
        nohVar = (noh) this.b;
        h = (noh) this.d;
        b.b(obj);
        vc71 vc71Var4 = (vc71) obj;
        this.d = nohVar;
        this.b = vc71Var4;
        this.c = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            noh nohVar3 = nohVar;
            vc71Var = vc71Var4;
            obj = k2;
            nohVar2 = nohVar3;
            vc71 vc71Var32 = (vc71) obj;
            this.d = vc71Var;
            this.b = vc71Var32;
            this.c = 3;
            k = nohVar2.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
