package ru.yandex.taxi.surge.mapper;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zqu;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.surge.models.dto.e1;
import ru.yandex.taxi.surge.models.dto.u;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzqu;", "<anonymous>", "(Ltse;)Lzqu;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapHorizontalShortcuts$2$header$1", f = "SurgeInfoStateMapper.kt", l = {467}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapHorizontalShortcuts$2$header$1 extends SuspendLambda implements wls {
    final /* synthetic */ e1 $item;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapHorizontalShortcuts$2$header$1(Continuation continuation, a aVar, e1 e1Var) {
        super(2, continuation);
        this.$item = e1Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoStateMapper$mapHorizontalShortcuts$2$header$1(continuation, this.this$0, this.$item);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapHorizontalShortcuts$2$header$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            u.a aVar = this.$item.a.a;
            if (aVar != null) {
                if (jl40.l(aVar.a, FormattedText.c)) {
                    aVar = null;
                }
                if (aVar != null) {
                    e eVar = this.this$0.b;
                    FormattedText formattedText = aVar.a;
                    this.L$0 = null;
                    this.label = 1;
                    obj = eVar.t(formattedText, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return new zqu((CharSequence) obj);
    }
}
