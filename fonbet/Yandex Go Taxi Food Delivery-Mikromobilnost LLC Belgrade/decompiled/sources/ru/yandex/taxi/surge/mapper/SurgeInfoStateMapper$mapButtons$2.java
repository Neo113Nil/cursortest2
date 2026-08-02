package ru.yandex.taxi.surge.mapper;

import defpackage.l07;
import defpackage.ltw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q47;
import defpackage.r47;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lq47;", "Lovw0;", "<anonymous>", "(Ltse;)Lq47;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapButtons$2", f = "SurgeInfoStateMapper.kt", l = {529}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapButtons$2 extends SuspendLambda implements wls {
    final /* synthetic */ r47 $buttons;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapButtons$2(r47 r47Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$buttons = r47Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapButtons$2 surgeInfoStateMapper$mapButtons$2 = new SurgeInfoStateMapper$mapButtons$2(this.$buttons, this.this$0, continuation);
        surgeInfoStateMapper$mapButtons$2.L$0 = obj;
        return surgeInfoStateMapper$mapButtons$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapButtons$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ButtonOrientation buttonOrientation;
        ButtonOrientation buttonOrientation2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List list = this.$buttons.b;
            a aVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapButtons$2$items$1$1(aVar, (l07) it.next(), null), 3));
            }
            int i2 = ltw0.a[this.$buttons.a.ordinal()];
            if (i2 == 1) {
                buttonOrientation = ButtonOrientation.HORIZONTAL;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                buttonOrientation = ButtonOrientation.VERTICAL;
            }
            buttonOrientation2 = buttonOrientation;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = buttonOrientation2;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buttonOrientation2 = (ButtonOrientation) this.L$2;
            b.b(obj);
        }
        return new q47(buttonOrientation2, (List) obj);
    }
}
