package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p460;
import defpackage.s360;
import defpackage.scc;
import defpackage.t701;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lt701;", Constants.KEY_DATA, "", "", "isLoading", "", "<unused var>", "", "Ln351;", "<anonymous>", "(Lt701;Ljava/util/Set;Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.NeuroPostcardStateHolder$widgetModelFlow$1", f = "NeuroPostcardStateHolder.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NeuroPostcardStateHolder$widgetModelFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuroPostcardStateHolder$widgetModelFlow$1(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        NeuroPostcardStateHolder$widgetModelFlow$1 neuroPostcardStateHolder$widgetModelFlow$1 = new NeuroPostcardStateHolder$widgetModelFlow$1(this.this$0, (Continuation) obj4);
        neuroPostcardStateHolder$widgetModelFlow$1.L$0 = (t701) obj;
        neuroPostcardStateHolder$widgetModelFlow$1.L$1 = (Set) obj2;
        return neuroPostcardStateHolder$widgetModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t701 t701Var = (t701) this.L$0;
        Set set = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p460 p460Var = t701Var.a.w;
            if (p460Var == null) {
                return EmptyList.a;
            }
            d dVar = this.this$0;
            b bVar = dVar.b;
            boolean contains = set.contains(dVar.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = bVar.b(p460Var, contains, this);
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
        return scc.h((s360) obj);
    }
}
