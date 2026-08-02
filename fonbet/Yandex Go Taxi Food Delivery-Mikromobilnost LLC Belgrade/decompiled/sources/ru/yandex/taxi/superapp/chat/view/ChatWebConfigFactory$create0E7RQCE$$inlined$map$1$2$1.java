package ru.yandex.taxi.superapp.chat.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.superapp.chat.view.ChatWebConfigFactory$create-0E7RQCE$$inlined$map$1$2", f = "ChatWebConfigFactory.kt", l = {HProv.PP_AUTH_INFO, 217}, m = "emit", v = 2)
/* renamed from: ru.yandex.taxi.superapp.chat.view.ChatWebConfigFactory$create-0E7RQCE$$inlined$map$1$2$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$2$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
