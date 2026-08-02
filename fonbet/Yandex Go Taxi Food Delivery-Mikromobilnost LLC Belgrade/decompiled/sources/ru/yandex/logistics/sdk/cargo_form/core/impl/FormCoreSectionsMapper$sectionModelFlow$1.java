package ru.yandex.logistics.sdk.cargo_form.core.impl;

import defpackage.g2q0;
import defpackage.g3q0;
import defpackage.g8e;
import defpackage.lqe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rh4;
import defpackage.y3s;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Ln351;", "widgets", "Lg3q0;", "promo", "Lg2q0;", "<anonymous>", "(Lkotlin/Array;Lg3q0;)Lg2q0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$sectionModelFlow$1", f = "FormCoreSectionsMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormCoreSectionsMapper$sectionModelFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ lqe $coreSection;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ y3s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCoreSectionsMapper$sectionModelFlow$1(lqe lqeVar, y3s y3sVar, Continuation continuation) {
        super(3, continuation);
        this.$coreSection = lqeVar;
        this.this$0 = y3sVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FormCoreSectionsMapper$sectionModelFlow$1 formCoreSectionsMapper$sectionModelFlow$1 = new FormCoreSectionsMapper$sectionModelFlow$1(this.$coreSection, this.this$0, (Continuation) obj3);
        formCoreSectionsMapper$sectionModelFlow$1.L$0 = (List[]) obj;
        formCoreSectionsMapper$sectionModelFlow$1.L$1 = (g3q0) obj2;
        return formCoreSectionsMapper$sectionModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List[] listArr = (List[]) this.L$0;
        g3q0 g3q0Var = (g3q0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList t = g8e.t(obj);
        for (List list : listArr) {
            ycc.r(list, t);
        }
        rh4 rh4Var = this.$coreSection.b;
        return new g2q0(t, null, null, null, false, null, null, rh4Var != null ? this.this$0.b.a(rh4Var) : null, g3q0Var, 382);
    }
}
