package ru.yandex.taxi.surge.mapper;

import defpackage.bdc;
import defpackage.evw0;
import defpackage.ivw0;
import defpackage.jl40;
import defpackage.jvw0;
import defpackage.ktw0;
import defpackage.kvw0;
import defpackage.l07;
import defpackage.mvg;
import defpackage.mvw0;
import defpackage.my6;
import defpackage.nvw0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import defpackage.zy6;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.surge.models.dto.ButtonStyle;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lmy6;", "Lovw0;", "<anonymous>", "(Ltse;)Lmy6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapButtons$2$items$1$1", f = "SurgeInfoStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapButtons$2$items$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ l07 $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapButtons$2$items$1$1(a aVar, l07 l07Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = l07Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoStateMapper$mapButtons$2$items$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapButtons$2$items$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        TextStyle textStyle;
        zy6 zy6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        l07 l07Var = this.$it;
        aVar.getClass();
        ButtonStyle buttonStyle = l07Var.b;
        kvw0 kvw0Var = l07Var.c;
        int[] iArr = ktw0.c;
        int i = iArr[buttonStyle.ordinal()];
        if (i == 1) {
            pair = new Pair(new bdc(xng0.textOnControl), new bdc(xng0.controlMain));
        } else {
            if (i != 2 && i != 3) {
                w511.b();
                return null;
            }
            pair = new Pair(new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor));
        }
        bdc bdcVar = (bdc) pair.getFirst();
        bdc bdcVar2 = (bdc) pair.getSecond();
        int i2 = iArr[l07Var.b.ordinal()];
        if (i2 == 1) {
            textStyle = TextStyle.ACCENT;
        } else {
            if (i2 != 2 && i2 != 3) {
                w511.b();
                return null;
            }
            textStyle = TextStyle.DEFAULT;
        }
        TextStyle textStyle2 = textStyle;
        if (jl40.l(kvw0Var, evw0.INSTANCE)) {
            zy6Var = mvw0.a;
        } else if (kvw0Var instanceof ivw0) {
            zy6Var = new nvw0(((ivw0) kvw0Var).a);
        } else {
            if (!jl40.l(kvw0Var, jvw0.INSTANCE)) {
                w511.b();
                return null;
            }
            zy6Var = mvw0.b;
        }
        return new my6(l07Var.a, bdcVar, bdcVar2, textStyle2, zy6Var, null, null, false, false, 16292);
    }
}
