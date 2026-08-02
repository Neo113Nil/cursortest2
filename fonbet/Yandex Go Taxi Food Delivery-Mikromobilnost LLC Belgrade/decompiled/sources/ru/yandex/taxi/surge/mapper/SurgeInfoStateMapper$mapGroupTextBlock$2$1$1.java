package ru.yandex.taxi.surge.mapper;

import defpackage.bvf0;
import defpackage.kdc;
import defpackage.lky0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.models.dto.h1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llky0;", "<anonymous>", "(Ltse;)Llky0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapGroupTextBlock$2$1$1", f = "SurgeInfoStateMapper.kt", l = {605}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapGroupTextBlock$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ kdc $backgroundColor;
    final /* synthetic */ boolean $hasGradientBefore;
    final /* synthetic */ boolean $hasSeparatorAfter;
    final /* synthetic */ int $index;
    final /* synthetic */ int $itemsCount;
    final /* synthetic */ boolean $lastSectionItem;
    final /* synthetic */ h1 $textBlockItem;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapGroupTextBlock$2$1$1(a aVar, h1 h1Var, boolean z, int i, int i2, boolean z2, boolean z3, kdc kdcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$textBlockItem = h1Var;
        this.$lastSectionItem = z;
        this.$index = i;
        this.$itemsCount = i2;
        this.$hasGradientBefore = z2;
        this.$hasSeparatorAfter = z3;
        this.$backgroundColor = kdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoStateMapper$mapGroupTextBlock$2$1$1(this.this$0, this.$textBlockItem, this.$lastSectionItem, this.$index, this.$itemsCount, this.$hasGradientBefore, this.$hasSeparatorAfter, this.$backgroundColor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapGroupTextBlock$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            h1 h1Var = this.$textBlockItem;
            boolean z = this.$lastSectionItem && this.$index == this.$itemsCount - 1;
            this.label = 1;
            aVar.getClass();
            n = bvf0.n(new SurgeInfoStateMapper$mapTextBlockItem$2(h1Var, z, aVar, null), this);
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            n = obj;
        }
        lky0 lky0Var = (lky0) n;
        int i2 = this.$index;
        boolean z2 = i2 == 0;
        boolean z3 = i2 == this.$itemsCount - 1;
        return new lky0(lky0Var.a, lky0Var.b, lky0Var.c, lky0Var.d, (z3 || this.$textBlockItem.a.f) ? false : true, lky0Var.f, lky0Var.g, lky0Var.h, lky0Var.i, lky0Var.j, this.$backgroundColor, z2, z3, z2 && !this.$hasGradientBefore, z3 && this.$hasSeparatorAfter, lky0Var.p);
    }
}
