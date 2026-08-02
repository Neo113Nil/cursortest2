package ru.yandex.taxi.preorder.suggested.selection;

import android.widget.LinearLayout;
import defpackage.hl0;
import defpackage.l9;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.suggested.selection.AdditionalSuggestHolder$setTrailButton$1$1", f = "AdditionalSuggestHolder.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AdditionalSuggestHolder$setTrailButton$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $additionalId;
    final /* synthetic */ String $additionalTypeId;
    final /* synthetic */ hl0 $model;
    final /* synthetic */ FormattedText $title;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalSuggestHolder$setTrailButton$1$1(a aVar, FormattedText formattedText, hl0 hl0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$title = formattedText;
        this.$model = hl0Var;
        this.$additionalId = str;
        this.$additionalTypeId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdditionalSuggestHolder$setTrailButton$1$1(this.this$0, this.$title, this.$model, this.$additionalId, this.$additionalTypeId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdditionalSuggestHolder$setTrailButton$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdditionalSuggestHolder$setTrailButton$1$1 additionalSuggestHolder$setTrailButton$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.e0;
            FormattedText formattedText = this.$title;
            this.label = 1;
            additionalSuggestHolder$setTrailButton$1$1 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, additionalSuggestHolder$setTrailButton$1$1, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            additionalSuggestHolder$setTrailButton$1$1 = this;
        }
        ListItemComponent listItemComponent = additionalSuggestHolder$setTrailButton$1$1.this$0.O;
        ButtonComponent buttonComponent = new ButtonComponent(additionalSuggestHolder$setTrailButton$1$1.this$0.a.getContext(), null, 0, 6, null);
        hl0 hl0Var = additionalSuggestHolder$setTrailButton$1$1.$model;
        a aVar = additionalSuggestHolder$setTrailButton$1$1.this$0;
        String str = additionalSuggestHolder$setTrailButton$1$1.$additionalId;
        String str2 = additionalSuggestHolder$setTrailButton$1$1.$additionalTypeId;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(tje.r(mrg0.go_design_s_space, buttonComponent.getContext()));
        layoutParams.setMarginEnd(tje.r(mrg0.go_design_m_space, buttonComponent.getContext()));
        buttonComponent.setLayoutParams(layoutParams);
        buttonComponent.setText((CharSequence) obj);
        Integer num = hl0Var.c;
        buttonComponent.setButtonSize(num != null ? num.intValue() : 0);
        Integer num2 = hl0Var.b;
        if (num2 != null) {
            buttonComponent.setButtonBackground(qje.t(num2.intValue(), buttonComponent.getContext()));
        }
        yn0 yn0Var = hl0Var.d;
        if (yn0Var != null) {
            buttonComponent.setDebounceClickListener(new l9(aVar, yn0Var, str, str2, 3));
        }
        listItemComponent.setTrailView(buttonComponent);
        return zy11.a;
    }
}
