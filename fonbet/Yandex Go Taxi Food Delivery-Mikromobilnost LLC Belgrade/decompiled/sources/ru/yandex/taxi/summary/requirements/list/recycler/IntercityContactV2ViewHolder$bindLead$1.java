package ru.yandex.taxi.summary.requirements.list.recycler;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0h0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zhj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.recycler.IntercityContactV2ViewHolder$bindLead$1", f = "RequirementsV2ViewHolders.kt", l = {848}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class IntercityContactV2ViewHolder$bindLead$1 extends SuspendLambda implements wls {
    final /* synthetic */ zhj0 $data;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityContactV2ViewHolder$bindLead$1(zhj0 zhj0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$data = zhj0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityContactV2ViewHolder$bindLead$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityContactV2ViewHolder$bindLead$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$data.a.c;
            if (str == null || str.length() == 0) {
                c cVar = this.this$0;
                int i2 = c.Z;
                ((ListItemComponent) ((View) cVar.R)).getLeadImageView().setImageResource(p0h0.ic_baggage_help_outline);
                return zy11.a;
            }
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.U;
            String str2 = this.$data.a.c;
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str2, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar2 = this.this$0;
        int i3 = c.Z;
        ((ListItemComponent) ((View) cVar2.R)).setLeadImage((BitmapDrawable) obj);
        return zy11.a;
    }
}
