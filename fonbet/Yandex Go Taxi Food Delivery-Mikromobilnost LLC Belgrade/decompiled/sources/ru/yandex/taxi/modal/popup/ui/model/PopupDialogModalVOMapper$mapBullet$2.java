package ru.yandex.taxi.modal.popup.ui.model;

import defpackage.f8e0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.t7e0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt7e0;", "<anonymous>", "(Ltse;)Lt7e0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalVOMapper$mapBullet$2", f = "PopupDialogModalVOMapper.kt", l = {HProv.PP_ENUM_LOG, HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PopupDialogModalVOMapper$mapBullet$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasDivider;
    final /* synthetic */ f8e0 $model;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupDialogModalVOMapper$mapBullet$2(f8e0 f8e0Var, a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$model = f8e0Var;
        this.this$0 = aVar;
        this.$hasDivider = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PopupDialogModalVOMapper$mapBullet$2 popupDialogModalVOMapper$mapBullet$2 = new PopupDialogModalVOMapper$mapBullet$2(this.$model, this.this$0, this.$hasDivider, continuation);
        popupDialogModalVOMapper$mapBullet$2.L$0 = obj;
        return popupDialogModalVOMapper$mapBullet$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PopupDialogModalVOMapper$mapBullet$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        noh nohVar;
        String str2;
        CharSequence charSequence;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            f8e0 f8e0Var = this.$model;
            boolean z = this.$hasDivider;
            String str4 = f8e0Var.a + f8e0Var.b + f8e0Var.c + z;
            String a = ((m7x0) this.this$0.c).a(this.$model.a);
            qoh h = tje.h(tseVar, null, null, new PopupDialogModalVOMapper$mapBullet$2$title$1(this.this$0, this.$model, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new PopupDialogModalVOMapper$mapBullet$2$subtitle$1(this.this$0, this.$model, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = h2;
            this.L$5 = str4;
            this.L$6 = a;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                str = str4;
                obj = s;
                nohVar = h2;
                str2 = a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$7;
            String str5 = (String) this.L$6;
            str = (String) this.L$5;
            b.b(obj);
            str3 = str5;
            charSequence = charSequence2;
            return new t7e0(charSequence, (CharSequence) obj, str, str3, this.$hasDivider);
        }
        str2 = (String) this.L$6;
        str = (String) this.L$5;
        nohVar = (noh) this.L$4;
        b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = str;
        this.L$6 = str2;
        this.L$7 = charSequence3;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence3;
            str3 = str2;
            obj = k;
            return new t7e0(charSequence, (CharSequence) obj, str, str3, this.$hasDivider);
        }
        return coroutineSingletons;
    }
}
