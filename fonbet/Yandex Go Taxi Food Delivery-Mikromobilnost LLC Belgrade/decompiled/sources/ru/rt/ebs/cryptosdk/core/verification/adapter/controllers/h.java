package ru.rt.ebs.cryptosdk.core.verification.adapter.controllers;

import defpackage.evu0;
import defpackage.hbo;
import defpackage.jl40;
import defpackage.k70;
import defpackage.ny61;
import defpackage.wls;
import defpackage.z70;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.exceptions.AuthSetCookieIncorrectValueAdapterVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.exceptions.AuthSetCookieNotFoundAdapterVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;

/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements wls {
    public Object a;
    public int b;
    public final /* synthetic */ k70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k70 k70Var, Continuation continuation) {
        super(2, continuation);
        this.c = k70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0041, code lost:
    
        if (r15 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Token sid;
        hbo hboVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        Pair pair = null;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            sid = this.c.b.getVerificationRequestScheme().getSid();
            z70 z70Var = this.c.a;
            this.a = sid;
            this.b = 1;
            obj = z70Var.e(sid, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hboVar = (hbo) this.a;
                kotlin.b.b(obj);
                this.c.a.b.putString("adapter.esia_authentication_cookie", kotlin.collections.a.X(hboVar.b, ";", null, null, null, 62)).save();
                return zy11Var;
            }
            sid = (Token) this.a;
            kotlin.b.b(obj);
        }
        hbo hboVar2 = (hbo) obj;
        k70 k70Var = this.c;
        List list = hboVar2.b;
        k70Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = evu0.Y(evu0.k0((String) it.next()).toString(), new char[]{';'}, 0, 6).iterator();
            while (it2.hasNext()) {
                List Y = evu0.Y(evu0.k0((String) it2.next()).toString(), new char[]{'='}, 0, 6);
                String str = !Y.isEmpty() ? (String) Y.get(0) : "";
                if (jl40.l(str, "adapter")) {
                    pair = new Pair(str, Y.size() > 1 ? (String) Y.get(1) : "");
                }
            }
        }
        if (pair == null) {
            throw new AuthSetCookieNotFoundAdapterVerificationEbsException();
        }
        if (evu0.J((CharSequence) pair.f())) {
            throw new AuthSetCookieIncorrectValueAdapterVerificationEbsException();
        }
        if (jl40.l(pair.f(), sid.getValue())) {
            throw new AuthSetCookieIncorrectValueAdapterVerificationEbsException();
        }
        z70 z70Var2 = this.c.a;
        EsiaAuthenticationUrl esiaAuthenticationUrl = hboVar2.a;
        this.a = hboVar2;
        this.b = 2;
        z70Var2.b.putString("adapter.esia_authentication_url_esia_url", esiaAuthenticationUrl.getEsiaUrl()).putString("adapter.esia_authentication_url_reirect_url", esiaAuthenticationUrl.getRedirectUrl()).save();
        if (zy11Var != coroutineSingletons) {
            hboVar = hboVar2;
            this.c.a.b.putString("adapter.esia_authentication_cookie", kotlin.collections.a.X(hboVar.b, ";", null, null, null, 62)).save();
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
