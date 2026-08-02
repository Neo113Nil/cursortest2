package ru.yandex.taxi.preorder.summary.solid;

import defpackage.c4r0;
import defpackage.f580;
import defpackage.m6t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.upj0;
import defpackage.wls;
import defpackage.yfx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$followTariffRedirect$1", f = "SolidSummaryPresenter.kt", l = {696}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$followTariffRedirect$1 extends SuspendLambda implements wls {
    final /* synthetic */ upj0 $redirect;
    final /* synthetic */ boolean $withAnimation;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$followTariffRedirect$1(l lVar, upj0 upj0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$redirect = upj0Var;
        this.$withAnimation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryPresenter$followTariffRedirect$1(this.this$0, this.$redirect, this.$withAnimation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryPresenter$followTariffRedirect$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        pex0 m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.x).m();
            f580 f580Var = this.this$0.J;
            if (m2 == null || (str = m2.b) == null) {
                str = "";
            }
            f580Var.d(str, this.$redirect.a);
            l lVar = this.this$0;
            String str3 = this.$redirect.a;
            pex0 m3 = ((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.x).m();
            if (m3 != null && (str2 = m3.b) != null) {
                lVar.p1.b(str2, str3);
            }
            pzt0 e = c4r0.e(this.this$0.D, SelectionOrigin.REDIRECT, this.$redirect.a, null, 12);
            if (e != null) {
                this.L$0 = null;
                this.label = 1;
                obj = e.u0(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.x).m();
            if (m != null) {
                this.this$0.K.getClass();
                if (!yfx0.a(m).isEmpty()) {
                    ((m6t0) this.this$0.Dg()).Nc(this.$redirect, this.$withAnimation);
                    return zy11.a;
                }
            }
            ((m6t0) this.this$0.Dg()).g5(this.$redirect.b, this.$withAnimation);
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.x).m();
        if (m != null) {
        }
        ((m6t0) this.this$0.Dg()).g5(this.$redirect.b, this.$withAnimation);
        return zy11.a;
    }
}
