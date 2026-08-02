package ru.yandex.taxi.address.clarification.impl.ui.recycler;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.clarification.impl.ui.recycler.SelectableOptionViewHolder$bind$1$2$1", f = "SelectableOptionViewHolder.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SelectableOptionViewHolder$bind$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $it;
    final /* synthetic */ ListItemComponent $this_with;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableOptionViewHolder$bind$1$2$1(a aVar, String str, ListItemComponent listItemComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = str;
        this.$this_with = listItemComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectableOptionViewHolder$bind$1$2$1(this.this$0, this.$it, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectableOptionViewHolder$bind$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 b = this.this$0.S.b().b(((m7x0) this.this$0.T).a(this.$it));
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.$this_with.setLeadImage(bitmap);
        }
        return zy11.a;
    }
}
