package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input;

import defpackage.bqy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zhu0;
import defpackage.zpy0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.TextInputStopWordsInteractor$checkStopWords$1", f = "TextInputStopWordsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TextInputStopWordsInteractor$checkStopWords$1 extends SuspendLambda implements wls {
    final /* synthetic */ zpy0 $config;
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputStopWordsInteractor$checkStopWords$1(zpy0 zpy0Var, d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$config = zpy0Var;
        this.this$0 = dVar;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextInputStopWordsInteractor$checkStopWords$1(this.$config, this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextInputStopWordsInteractor$checkStopWords$1 textInputStopWordsInteractor$checkStopWords$1 = (TextInputStopWordsInteractor$checkStopWords$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textInputStopWordsInteractor$checkStopWords$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        bqy0 bqy0Var;
        String str;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Iterator it = this.$config.a.iterator();
        do {
            boolean hasNext = it.hasNext();
            zy11Var = zy11.a;
            if (!hasNext) {
                this.this$0.a.c(null, this.$config.b);
                return zy11Var;
            }
            bqy0Var = (bqy0) it.next();
            zhu0 zhu0Var = this.this$0.b;
            str = this.$text;
            arrayList = bqy0Var.a;
            zhu0Var.getClass();
        } while (!zhu0.a(str, arrayList));
        this.this$0.a.c(bqy0Var.c, this.$config.b);
        return zy11Var;
    }
}
