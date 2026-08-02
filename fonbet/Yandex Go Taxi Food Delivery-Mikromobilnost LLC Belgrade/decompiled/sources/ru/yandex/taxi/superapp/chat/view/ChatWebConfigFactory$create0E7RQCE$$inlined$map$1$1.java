package ru.yandex.taxi.superapp.chat.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.superapp.chat.view.ChatWebConfigFactory$create-0E7RQCE$$inlined$map$1", f = "ChatWebConfigFactory.kt", l = {112}, m = "collect", v = 2)
/* renamed from: ru.yandex.taxi.superapp.chat.view.ChatWebConfigFactory$create-0E7RQCE$$inlined$map$1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatWebConfigFactory$create0E7RQCE$$inlined$map$1$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
