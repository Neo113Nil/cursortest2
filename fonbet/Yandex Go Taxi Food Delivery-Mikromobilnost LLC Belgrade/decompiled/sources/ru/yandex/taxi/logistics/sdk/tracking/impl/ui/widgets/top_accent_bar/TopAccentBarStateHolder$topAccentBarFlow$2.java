package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar;

import defpackage.cri;
import defpackage.dqi;
import defpackage.gri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zvz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<unused var>", "Lgri;", ClidProvider.STATE, "Lzvz0;", "<anonymous>", "(ZLgri;)Lzvz0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.TopAccentBarStateHolder$topAccentBarFlow$2", f = "TopAccentBarStateHolder.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TopAccentBarStateHolder$topAccentBarFlow$2 extends SuspendLambda implements zls {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAccentBarStateHolder$topAccentBarFlow$2(Continuation continuation, e eVar) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        TopAccentBarStateHolder$topAccentBarFlow$2 topAccentBarStateHolder$topAccentBarFlow$2 = new TopAccentBarStateHolder$topAccentBarFlow$2((Continuation) obj3, this.this$0);
        topAccentBarStateHolder$topAccentBarFlow$2.L$0 = (gri) obj2;
        return topAccentBarStateHolder$topAccentBarFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gri griVar = (gri) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cri criVar = griVar.x;
            if (criVar == null) {
                return null;
            }
            b bVar = this.this$0.a;
            dqi dqiVar = griVar.b;
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = bVar.a(criVar, dqiVar, this);
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
        return (zvz0) obj;
    }
}
