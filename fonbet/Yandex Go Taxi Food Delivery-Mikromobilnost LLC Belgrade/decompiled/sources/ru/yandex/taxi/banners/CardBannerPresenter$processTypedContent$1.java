package ru.yandex.taxi.banners;

import defpackage.fb8;
import defpackage.iux0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qeb1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.CardBannerPresenter$processTypedContent$1", f = "CardBannerPresenter.kt", l = {370}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CardBannerPresenter$processTypedContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ TypedContentWidget $content;
    final /* synthetic */ FormattedText $formattedText;
    final /* synthetic */ int $viewId;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBannerPresenter$processTypedContent$1(d dVar, FormattedText formattedText, int i, TypedContentWidget typedContentWidget, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$formattedText = formattedText;
        this.$viewId = i;
        this.$content = typedContentWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardBannerPresenter$processTypedContent$1(this.this$0, this.$formattedText, this.$viewId, this.$content, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardBannerPresenter$processTypedContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        int i;
        Throwable th;
        TypedContentWidget typedContentWidget;
        int i2;
        d dVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        try {
            if (i3 == 0) {
                kotlin.b.b(obj);
                dVar = this.this$0;
                FormattedText formattedText = this.$formattedText;
                i = this.$viewId;
                TypedContentWidget typedContentWidget2 = this.$content;
                try {
                    ru.yandex.taxi.widget.c cVar = dVar.o;
                    this.L$0 = dVar;
                    this.L$1 = dVar;
                    this.L$2 = typedContentWidget2;
                    this.I$0 = i;
                    this.I$1 = i;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    typedContentWidget = typedContentWidget2;
                    i2 = i;
                    obj = e;
                    dVar2 = dVar;
                } catch (Throwable th2) {
                    th = th2;
                    typedContentWidget = typedContentWidget2;
                    ((iux0) dVar.q).c("Unable load formatted text for banner", th, "Unable load formatted text for banner", new String[0]);
                    ((fb8) dVar.a).updateText(qeb1.c(typedContentWidget.a), i);
                    return zy11.a;
                }
            } else {
                if (i3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$1;
                i2 = this.I$0;
                typedContentWidget = (TypedContentWidget) this.L$2;
                dVar = (d) this.L$1;
                dVar2 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ((iux0) dVar.q).c("Unable load formatted text for banner", th, "Unable load formatted text for banner", new String[0]);
                    ((fb8) dVar.a).updateText(qeb1.c(typedContentWidget.a), i);
                    return zy11.a;
                }
            }
            ((fb8) dVar2.a).updateText((CharSequence) obj, i2);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
