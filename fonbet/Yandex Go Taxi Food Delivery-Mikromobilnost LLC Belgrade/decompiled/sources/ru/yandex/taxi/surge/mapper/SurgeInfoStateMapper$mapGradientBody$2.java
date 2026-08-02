package ru.yandex.taxi.surge.mapper;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xxt;
import defpackage.yxt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.models.dto.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxxt;", "<anonymous>", "(Ltse;)Lxxt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapGradientBody$2", f = "SurgeInfoStateMapper.kt", l = {632, 633}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapGradientBody$2 extends SuspendLambda implements wls {
    final /* synthetic */ i.d $body;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapGradientBody$2(a aVar, i.d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$body = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapGradientBody$2 surgeInfoStateMapper$mapGradientBody$2 = new SurgeInfoStateMapper$mapGradientBody$2(this.this$0, this.$body, continuation);
        surgeInfoStateMapper$mapGradientBody$2.L$0 = obj;
        return surgeInfoStateMapper$mapGradientBody$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapGradientBody$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        yxt yxtVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapGradientBody$2$topLine$1(this.this$0, this.$body, null), 3);
            h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapGradientBody$2$bottomLine$1(this.this$0, this.$body, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yxtVar = (yxt) this.L$3;
                b.b(obj);
                return new xxt(yxtVar, (yxt) obj);
            }
            h = (noh) this.L$2;
            b.b(obj);
        }
        yxt yxtVar2 = (yxt) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = yxtVar2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            yxtVar = yxtVar2;
            obj = k;
            return new xxt(yxtVar, (yxt) obj);
        }
        return coroutineSingletons;
    }
}
