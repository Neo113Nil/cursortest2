package ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo;

import defpackage.h3q0;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<unused var>", "Lj6s;", ClidProvider.STATE, "Lg3q0;", "<anonymous>", "(ZLj6s;)Lg3q0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.SectionPromoStateHolder$getSectionPromo$1", f = "SectionPromoStateHolder.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SectionPromoStateHolder$getSectionPromo$1 extends SuspendLambda implements zls {
    final /* synthetic */ h3q0 $model;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionPromoStateHolder$getSectionPromo$1(b bVar, h3q0 h3q0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$model = h3q0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        SectionPromoStateHolder$getSectionPromo$1 sectionPromoStateHolder$getSectionPromo$1 = new SectionPromoStateHolder$getSectionPromo$1(this.this$0, this.$model, (Continuation) obj3);
        sectionPromoStateHolder$getSectionPromo$1.L$0 = (j6s) obj2;
        return sectionPromoStateHolder$getSectionPromo$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j6s j6sVar = (j6s) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0.c;
        h3q0 h3q0Var = this.$model;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(h3q0Var, j6sVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
