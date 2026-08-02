package ru.yandex.taxi.superapp.chat.view;

import defpackage.h1p;
import defpackage.ny61;
import defpackage.szv0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ h1p c;
    public final /* synthetic */ String w;

    public c(vpr vprVar, e eVar, h1p h1pVar, String str) {
        this.a = vprVar;
        this.b = eVar;
        this.c = h1pVar;
        this.w = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1 chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Object failure;
        try {
            if (continuation instanceof ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1) {
                chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1 = (ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1) continuation;
                int i2 = chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        vpr vprVar2 = this.a;
                        szv0 szv0Var = (szv0) obj;
                        try {
                            e eVar = this.b;
                            h1p h1pVar = this.c;
                            String str = this.w;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$0 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$1 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$2 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$3 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$4 = vprVar2;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$5 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$6 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label = 1;
                            Object a = e.a(eVar, h1pVar, str, szv0Var, chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1);
                            if (a != coroutineSingletons) {
                                obj2 = a;
                                vprVar = vprVar2;
                            }
                        } catch (Exception e) {
                            e = e;
                            vprVar = vprVar2;
                            failure = new Result.Failure(e);
                            Result result = new Result(failure);
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$0 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$1 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$2 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$3 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$4 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$5 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$6 = null;
                            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label = 2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$4;
                    try {
                        kotlin.b.b(obj2);
                    } catch (Exception e2) {
                        e = e2;
                        failure = new Result.Failure(e);
                        Result result2 = new Result(failure);
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$0 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$1 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$2 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$3 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$4 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$5 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$6 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label = 2;
                    }
                    failure = (UiWebViewConfig) obj2;
                    Result result22 = new Result(failure);
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$0 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$1 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$2 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$3 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$4 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$5 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$6 = null;
                    chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label = 2;
                }
            }
            if (i != 0) {
            }
            failure = (UiWebViewConfig) obj2;
            Result result222 = new Result(failure);
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$0 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$1 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$2 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$3 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$4 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$5 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.L$6 = null;
            chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label = 2;
        } catch (CancellationException e3) {
            throw e3;
        }
        chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1 = new ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1.label;
    }
}
