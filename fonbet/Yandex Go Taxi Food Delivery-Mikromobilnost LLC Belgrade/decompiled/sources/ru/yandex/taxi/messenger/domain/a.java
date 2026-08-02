package ru.yandex.taxi.messenger.domain;

import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.g6u;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final WebMessenger a;
    public final ru.yandex.taxi.am.token.a b;
    public final tt2 c;

    public a(WebMessenger webMessenger, ru.yandex.taxi.am.token.a aVar, tt2 tt2Var) {
        this.a = webMessenger;
        this.b = aVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(1:20))(3:27|28|(2:30|26))|21|(1:23)|24))|37|6|7|(0)(0)|21|(0)|24|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (defpackage.tje.k0(r2, r6, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        defpackage.jst.e.k(r9, "Failed to update web messenger OAuth");
        r3.getClass();
        r9 = defpackage.uyj.a;
        r9 = defpackage.o400.a;
        r2 = new ru.yandex.taxi.messenger.domain.WebMessengerAuthInteractorImpl$applyCurrentToken$3$1(r8, null);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (defpackage.tje.k0(r9, r2, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WebMessengerAuthInteractorImpl$applyCurrentToken$1 webMessengerAuthInteractorImpl$applyCurrentToken$1;
        int i;
        Object d;
        if (continuationImpl instanceof WebMessengerAuthInteractorImpl$applyCurrentToken$1) {
            webMessengerAuthInteractorImpl$applyCurrentToken$1 = (WebMessengerAuthInteractorImpl$applyCurrentToken$1) continuationImpl;
            int i2 = webMessengerAuthInteractorImpl$applyCurrentToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webMessengerAuthInteractorImpl$applyCurrentToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webMessengerAuthInteractorImpl$applyCurrentToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webMessengerAuthInteractorImpl$applyCurrentToken$1.label;
                tt2 tt2Var = this.c;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.am.token.a aVar = this.b;
                    webMessengerAuthInteractorImpl$applyCurrentToken$1.label = 1;
                    d = aVar.d(false, webMessengerAuthInteractorImpl$applyCurrentToken$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                        }
                        return zy11.a;
                    }
                    b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (d instanceof Result.Failure) {
                    d = null;
                }
                tt2Var.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                WebMessengerAuthInteractorImpl$applyCurrentToken$2$1 webMessengerAuthInteractorImpl$applyCurrentToken$2$1 = new WebMessengerAuthInteractorImpl$applyCurrentToken$2$1((String) d, this, null);
                webMessengerAuthInteractorImpl$applyCurrentToken$1.L$0 = null;
                webMessengerAuthInteractorImpl$applyCurrentToken$1.label = 2;
            }
        }
        webMessengerAuthInteractorImpl$applyCurrentToken$1 = new WebMessengerAuthInteractorImpl$applyCurrentToken$1(this, continuationImpl);
        Object obj2 = webMessengerAuthInteractorImpl$applyCurrentToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webMessengerAuthInteractorImpl$applyCurrentToken$1.label;
        tt2 tt2Var2 = this.c;
        if (i != 0) {
        }
        if (d instanceof Result.Failure) {
        }
        tt2Var2.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        WebMessengerAuthInteractorImpl$applyCurrentToken$2$1 webMessengerAuthInteractorImpl$applyCurrentToken$2$12 = new WebMessengerAuthInteractorImpl$applyCurrentToken$2$1((String) d, this, null);
        webMessengerAuthInteractorImpl$applyCurrentToken$1.L$0 = null;
        webMessengerAuthInteractorImpl$applyCurrentToken$1.label = 2;
    }
}
