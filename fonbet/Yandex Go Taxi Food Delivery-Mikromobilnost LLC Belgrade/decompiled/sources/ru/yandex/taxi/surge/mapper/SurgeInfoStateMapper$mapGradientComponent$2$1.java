package ru.yandex.taxi.surge.mapper;

import defpackage.bdc;
import defpackage.cyt;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.uxt;
import defpackage.vxt;
import defpackage.wls;
import defpackage.wxt;
import defpackage.xng0;
import defpackage.xxt;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.models.dto.c1;
import ru.yandex.taxi.surge.models.dto.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcyt;", "<anonymous>", "(Ltse;)Lcyt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapGradientComponent$2$1", f = "SurgeInfoStateMapper.kt", l = {579, 580}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapGradientComponent$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasSeparatorAfter;
    final /* synthetic */ c1 $item;
    final /* synthetic */ i $this_with;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapGradientComponent$2$1(a aVar, i iVar, boolean z, c1 c1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$this_with = iVar;
        this.$hasSeparatorAfter = z;
        this.$item = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapGradientComponent$2$1 surgeInfoStateMapper$mapGradientComponent$2$1 = new SurgeInfoStateMapper$mapGradientComponent$2$1(this.this$0, this.$this_with, this.$hasSeparatorAfter, this.$item, continuation);
        surgeInfoStateMapper$mapGradientComponent$2$1.L$0 = obj;
        return surgeInfoStateMapper$mapGradientComponent$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapGradientComponent$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh h;
        wxt wxtVar;
        vxt vxtVar;
        Object s;
        uxt uxtVar;
        vxt vxtVar2;
        Object k;
        vxt vxtVar3;
        xxt xxtVar;
        wxt wxtVar2;
        uxt uxtVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapGradientComponent$2$1$leadBody$1(this.this$0, this.$this_with, null), 3);
            h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapGradientComponent$2$1$trailBody$1(this.this$0, this.$this_with, null), 3);
            a aVar = this.this$0;
            i.c cVar = this.$this_with.c;
            aVar.getClass();
            pdc pdcVar = aVar.c;
            wxtVar = new wxt(((ufu) pdcVar).a(new bdc(xng0.bgMain), cVar.a), ((ufu) pdcVar).a(new bdc(xng0.bgMain), cVar.b), y6i0.c(cVar.c, 0.0f, 1.0f), y6i0.c(cVar.d, 0.0f, 1.0f));
            i iVar = this.$this_with;
            uxt uxtVar3 = new uxt(iVar.d.a);
            i.b bVar = iVar.e;
            if (bVar != null) {
                c1 c1Var = this.$item;
                Integer num = bVar.a;
                Integer num2 = bVar.b;
                Integer num3 = bVar.c;
                i.c cVar2 = c1Var.a.c;
                vxtVar = new vxt(num, num2, num3, cVar2.a, cVar2.b);
            } else {
                vxtVar = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = wxtVar;
            this.L$4 = uxtVar3;
            this.L$5 = vxtVar;
            this.label = 1;
            s = h2.s(this);
            if (s != coroutineSingletons) {
                uxtVar = uxtVar3;
                vxtVar2 = vxtVar;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xxt xxtVar2 = (xxt) this.L$6;
            vxt vxtVar4 = (vxt) this.L$5;
            uxt uxtVar4 = (uxt) this.L$4;
            wxt wxtVar3 = (wxt) this.L$3;
            b.b(obj);
            xxtVar = xxtVar2;
            vxtVar3 = vxtVar4;
            uxtVar2 = uxtVar4;
            wxtVar2 = wxtVar3;
            k = obj;
            return new cyt(xxtVar, (xxt) k, wxtVar2, uxtVar2, this.$this_with.f, vxtVar3, this.$hasSeparatorAfter);
        }
        vxtVar2 = (vxt) this.L$5;
        uxt uxtVar5 = (uxt) this.L$4;
        wxt wxtVar4 = (wxt) this.L$3;
        h = (noh) this.L$2;
        b.b(obj);
        wxtVar = wxtVar4;
        uxtVar = uxtVar5;
        s = obj;
        xxt xxtVar3 = (xxt) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = wxtVar;
        this.L$4 = uxtVar;
        this.L$5 = vxtVar2;
        this.L$6 = xxtVar3;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            vxtVar3 = vxtVar2;
            xxtVar = xxtVar3;
            wxtVar2 = wxtVar;
            uxtVar2 = uxtVar;
            return new cyt(xxtVar, (xxt) k, wxtVar2, uxtVar2, this.$this_with.f, vxtVar3, this.$hasSeparatorAfter);
        }
        return coroutineSingletons;
    }
}
