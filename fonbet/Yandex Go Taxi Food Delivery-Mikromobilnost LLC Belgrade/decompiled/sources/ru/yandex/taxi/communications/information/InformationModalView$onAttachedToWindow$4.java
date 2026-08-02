package ru.yandex.taxi.communications.information;

import defpackage.huv;
import defpackage.juv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.information.InformationModalView$onAttachedToWindow$4", f = "InformationModalView.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class InformationModalView$onAttachedToWindow$4 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ InformationModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationModalView$onAttachedToWindow$4(InformationModalView informationModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = informationModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InformationModalView$onAttachedToWindow$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InformationModalView$onAttachedToWindow$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        huv binding;
        c cVar;
        juv juvVar;
        ListTextComponent listTextComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            binding = this.this$0.getBinding();
            ListTextComponent listTextComponent2 = binding.c;
            cVar = this.this$0.formattedTextConverter;
            juvVar = this.this$0.model;
            FormattedText formattedText = juvVar.b;
            this.L$0 = listTextComponent2;
            this.label = 1;
            Object e = c.e(cVar, formattedText, null, false, this, 30);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = e;
            listTextComponent = listTextComponent2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listTextComponent = (ListTextComponent) this.L$0;
            b.b(obj);
        }
        listTextComponent.setText((CharSequence) obj);
        return zy11.a;
    }
}
