package ru.yandex.taxi.multiexit;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.multiexit.MultiexitAreaPickerPresenter$buildTitlesAndShow$2$1", f = "MultiexitAreaPickerPresenter.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MultiexitAreaPickerPresenter$buildTitlesAndShow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $subtitle;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiexitAreaPickerPresenter$buildTitlesAndShow$2$1(a aVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$subtitle = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiexitAreaPickerPresenter$buildTitlesAndShow$2$1(this.this$0, this.$subtitle, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiexitAreaPickerPresenter$buildTitlesAndShow$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        a aVar;
        FormattedText formattedText;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar3 = this.this$0;
                FormattedText formattedText2 = this.$subtitle;
                try {
                    c cVar = aVar3.x;
                    this.L$0 = aVar3;
                    this.L$1 = aVar3;
                    this.L$2 = formattedText2;
                    this.label = 1;
                    Object e = c.e(cVar, formattedText2, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = aVar3;
                    formattedText = formattedText2;
                    obj = e;
                    aVar2 = aVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar3;
                    formattedText = formattedText2;
                    jst.e.k(th, "Error while formatting text in MultiexitAreaPickerPresenter");
                    ((oq40) aVar.Dg()).setTitle(c.f(aVar.x, formattedText, false, null, 14));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                formattedText = (FormattedText) this.L$2;
                aVar = (a) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, "Error while formatting text in MultiexitAreaPickerPresenter");
                    ((oq40) aVar.Dg()).setTitle(c.f(aVar.x, formattedText, false, null, 14));
                    return zy11.a;
                }
            }
            ((oq40) aVar2.Dg()).setTitle((CharSequence) obj);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
