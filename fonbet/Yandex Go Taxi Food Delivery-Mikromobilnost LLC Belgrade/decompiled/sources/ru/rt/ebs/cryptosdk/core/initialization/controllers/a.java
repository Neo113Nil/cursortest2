package ru.rt.ebs.cryptosdk.core.initialization.controllers;

import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uwv;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ uwv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uwv uwvVar, Continuation continuation) {
        super(2, continuation);
        this.b = uwvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7.verify(r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (kotlinx.coroutines.a.i(600000, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                uwv uwvVar = this.b;
                tje.N((tse) uwvVar.h.getValue(), null, null, new a(uwvVar, null), 3);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ISecurityController iSecurityController = this.b.c;
        this.a = 2;
    }
}
