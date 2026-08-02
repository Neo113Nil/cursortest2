package ru.yandex.taxi.surge.mapper;

import defpackage.bdc;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.models.dto.d1;
import ru.yandex.taxi.surge.models.dto.h1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Llky0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapGroupTextBlock$2", f = "SurgeInfoStateMapper.kt", l = {622}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapGroupTextBlock$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasGradientBefore;
    final /* synthetic */ boolean $hasSeparatorAfter;
    final /* synthetic */ d1 $item;
    final /* synthetic */ boolean $lastSectionItem;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapGroupTextBlock$2(a aVar, d1 d1Var, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = d1Var;
        this.$lastSectionItem = z;
        this.$hasGradientBefore = z2;
        this.$hasSeparatorAfter = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapGroupTextBlock$2 surgeInfoStateMapper$mapGroupTextBlock$2 = new SurgeInfoStateMapper$mapGroupTextBlock$2(this.this$0, this.$item, this.$lastSectionItem, this.$hasGradientBefore, this.$hasSeparatorAfter, continuation);
        surgeInfoStateMapper$mapGroupTextBlock$2.L$0 = obj;
        return surgeInfoStateMapper$mapGroupTextBlock$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapGroupTextBlock$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        kdc a = ((ufu) this.this$0.c).a(new bdc(xng0.bgMinor), this.$item.a.b);
        int size = this.$item.a.a.size();
        List list = this.$item.a.a;
        a aVar = this.this$0;
        boolean z = this.$lastSectionItem;
        boolean z2 = this.$hasGradientBefore;
        boolean z3 = this.$hasSeparatorAfter;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapGroupTextBlock$2$1$1(aVar, (h1) obj2, z, i2, size, z2, z3, a, null), 3));
            i2 = i3;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = size;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
