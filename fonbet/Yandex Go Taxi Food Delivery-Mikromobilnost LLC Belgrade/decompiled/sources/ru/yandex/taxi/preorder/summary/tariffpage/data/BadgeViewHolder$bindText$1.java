package ru.yandex.taxi.preorder.summary.tariffpage.data;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.BadgeViewHolder$bindText$1", f = "BadgeViewHolder.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BadgeViewHolder$bindText$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $setter;
    final /* synthetic */ FormattedText $text;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeViewHolder$bindText$1(tls tlsVar, b bVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.$setter = tlsVar;
        this.this$0 = bVar;
        this.$text = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BadgeViewHolder$bindText$1(this.$setter, this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BadgeViewHolder$bindText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar2 = this.$setter;
                b bVar = this.this$0;
                FormattedText formattedText = this.$text;
                ru.yandex.taxi.widget.c cVar = bVar.b;
                this.L$0 = tlsVar2;
                this.label = 1;
                Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                tlsVar = tlsVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$0;
                kotlin.b.b(obj);
            }
            tlsVar.invoke(obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.k(th, "Text loading error");
        }
        return zy11.a;
    }
}
