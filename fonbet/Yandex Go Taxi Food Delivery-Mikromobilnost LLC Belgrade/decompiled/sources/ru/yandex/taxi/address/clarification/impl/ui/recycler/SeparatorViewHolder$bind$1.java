package ru.yandex.taxi.address.clarification.impl.ui.recycler;

import defpackage.jr0;
import defpackage.lrq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.clarification.impl.ui.recycler.SeparatorViewHolder$bind$1", f = "SeparatorViewHolder.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SeparatorViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ lrq0 $data;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorViewHolder$bind$1(b bVar, lrq0 lrq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$data = lrq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SeparatorViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SeparatorViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        lrq0 lrq0Var;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                bVar = this.this$0;
                lrq0 lrq0Var2 = this.$data;
                try {
                    c cVar = bVar.S;
                    FormattedText formattedText = lrq0Var2.a;
                    this.L$0 = bVar;
                    this.L$1 = bVar;
                    this.L$2 = lrq0Var2;
                    this.label = 1;
                    Object e = c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lrq0Var = lrq0Var2;
                    obj = e;
                    bVar2 = bVar;
                } catch (Throwable unused) {
                    lrq0Var = lrq0Var2;
                    ((jr0) ((zo31) bVar.R)).a.setText(c.f(bVar.S, lrq0Var.a, false, null, 14));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lrq0Var = (lrq0) this.L$2;
                bVar = (b) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    ((jr0) ((zo31) bVar.R)).a.setText(c.f(bVar.S, lrq0Var.a, false, null, 14));
                    return zy11.a;
                }
            }
            int i2 = b.T;
            ((jr0) ((zo31) bVar2.R)).a.setText((CharSequence) obj);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
