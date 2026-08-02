package ru.yandex.taxi.preorder.summary.selector.verticals.bold;

import android.graphics.drawable.Drawable;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.h86;
import defpackage.hgr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob31;
import defpackage.tse;
import defpackage.wls;
import defpackage.yj31;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.verticals.bold.VerticalViewHolder$loadShadow$1", f = "BoldVerticalsAdapter.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class VerticalViewHolder$loadShadow$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $bgColor;
    final /* synthetic */ int $color;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewHolder$loadShadow$1(a aVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$color = i;
        this.$bgColor = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalViewHolder$loadShadow$1(this.this$0, this.$color, this.$bgColor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalViewHolder$loadShadow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VerticalViewHolder$loadShadow$1 verticalViewHolder$loadShadow$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hgr0 hgr0Var = new hgr0(0.0f, c.j(2, this.this$0.a), c.j(8, this.this$0.a), this.$color);
            a aVar = this.this$0;
            ru.yandex.taxi.design.utils.b bVar = aVar.T;
            int h = c.h(8, aVar.a);
            int i2 = this.$bgColor;
            this.L$0 = null;
            this.label = 1;
            verticalViewHolder$loadShadow$1 = this;
            obj = bVar.d(h, hgr0Var, true, i2, verticalViewHolder$loadShadow$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            verticalViewHolder$loadShadow$1 = this;
        }
        Drawable drawable = (Drawable) obj;
        a aVar2 = verticalViewHolder$loadShadow$1.this$0;
        int i3 = a.Z;
        a.e0(((h86) ((zo31) aVar2.R)).b, drawable);
        a aVar3 = verticalViewHolder$loadShadow$1.this$0;
        aVar3.W = new yj31(drawable, verticalViewHolder$loadShadow$1.$color, verticalViewHolder$loadShadow$1.$bgColor);
        ob31 ob31Var = aVar3.U;
        if ((ob31Var != null ? ob31Var.e : null) != null) {
            ((h86) ((zo31) aVar3.R)).b.setVisibility(0);
        }
        return zy11.a;
    }
}
