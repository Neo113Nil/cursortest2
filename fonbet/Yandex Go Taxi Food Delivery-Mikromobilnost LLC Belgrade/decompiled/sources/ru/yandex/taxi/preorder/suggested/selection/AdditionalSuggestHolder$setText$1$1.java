package ru.yandex.taxi.preorder.suggested.selection;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.suggested.selection.AdditionalSuggestHolder$setText$1$1", f = "AdditionalSuggestHolder.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AdditionalSuggestHolder$setText$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $setCallback;
    final /* synthetic */ FormattedText $text;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalSuggestHolder$setText$1$1(a aVar, FormattedText formattedText, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$text = formattedText;
        this.$setCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdditionalSuggestHolder$setText$1$1(this.this$0, this.$text, this.$setCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdditionalSuggestHolder$setText$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdditionalSuggestHolder$setText$1$1 additionalSuggestHolder$setText$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.e0;
            FormattedText formattedText = this.$text;
            this.label = 1;
            additionalSuggestHolder$setText$1$1 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, additionalSuggestHolder$setText$1$1, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            additionalSuggestHolder$setText$1$1 = this;
        }
        additionalSuggestHolder$setText$1$1.$setCallback.invoke((CharSequence) obj);
        return zy11.a;
    }
}
