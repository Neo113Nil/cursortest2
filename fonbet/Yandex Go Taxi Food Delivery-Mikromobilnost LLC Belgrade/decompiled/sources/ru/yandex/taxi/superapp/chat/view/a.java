package ru.yandex.taxi.superapp.chat.view;

import defpackage.ny61;
import defpackage.szv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1 chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ChatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1) {
            chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1 = (ChatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1) continuation;
            int i2 = chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((szv0) obj) != szv0.m) {
                        chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.L$0 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.L$1 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.L$2 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.L$3 = null;
                        chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1 = new ChatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatWebConfigFactory$create0E7RQCE$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
