package ru.yandex.taxi.banners;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.iux0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qeb1;
import defpackage.tse;
import defpackage.wg60;
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
@mvg(c = "ru.yandex.taxi.banners.NotificationBannerPresenter$processTypedContent$1", f = "NotificationBannerPresenter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NotificationBannerPresenter$processTypedContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ TypedContentWidget $content;
    final /* synthetic */ FormattedText $formattedText;
    final /* synthetic */ boolean $title;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationBannerPresenter$processTypedContent$1(e eVar, FormattedText formattedText, boolean z, TypedContentWidget typedContentWidget, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$formattedText = formattedText;
        this.$title = z;
        this.$content = typedContentWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationBannerPresenter$processTypedContent$1(this.this$0, this.$formattedText, this.$title, this.$content, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationBannerPresenter$processTypedContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        boolean z;
        Throwable th;
        TypedContentWidget typedContentWidget;
        boolean z2;
        e eVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                eVar = this.this$0;
                FormattedText formattedText = this.$formattedText;
                z = this.$title;
                TypedContentWidget typedContentWidget2 = this.$content;
                try {
                    ru.yandex.taxi.widget.c cVar = eVar.n;
                    this.L$0 = eVar;
                    this.L$1 = eVar;
                    this.L$2 = typedContentWidget2;
                    this.Z$0 = z;
                    this.Z$1 = z;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    typedContentWidget = typedContentWidget2;
                    z2 = z;
                    obj = e;
                    eVar2 = eVar;
                } catch (Throwable th2) {
                    th = th2;
                    typedContentWidget = typedContentWidget2;
                    ((iux0) eVar.o).c("Unable load formatted text for banner", th, "Unable load formatted text for banner", new String[0]);
                    ((wg60) eVar.a).updateText(qeb1.c(typedContentWidget.a), z);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$1;
                z2 = this.Z$0;
                typedContentWidget = (TypedContentWidget) this.L$2;
                eVar = (e) this.L$1;
                eVar2 = (e) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ((iux0) eVar.o).c("Unable load formatted text for banner", th, "Unable load formatted text for banner", new String[0]);
                    ((wg60) eVar.a).updateText(qeb1.c(typedContentWidget.a), z);
                    return zy11.a;
                }
            }
            ((wg60) eVar2.a).updateText((CharSequence) obj, z2);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
