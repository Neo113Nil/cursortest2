package ru.yandex.taxi.superapp;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.ck7;
import defpackage.ckr0;
import defpackage.gcn;
import defpackage.h2p;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zjr0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppShareDelegate$shareImageList$1", f = "SuperAppShareDelegate.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppShareDelegate$shareImageList$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ zjr0 $params;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppShareDelegate$shareImageList$1(m mVar, zjr0 zjr0Var, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$params = zjr0Var;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppShareDelegate$shareImageList$1(this.this$0, this.$params, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppShareDelegate$shareImageList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gcn, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zjr0 zjr0Var;
        m mVar;
        gcn gcnVar;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                m mVar2 = this.this$0;
                zjr0Var = this.$params;
                gcn gcnVar2 = this.$callback;
                List list2 = zjr0Var.a;
                this.L$0 = mVar2;
                this.L$1 = zjr0Var;
                this.L$2 = gcnVar2;
                this.L$3 = gcnVar2;
                this.label = 1;
                mVar2.f.getClass();
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(mdh.b, new SuperAppShareDelegate$processImageUrls$2(list2, mVar2, null), this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mVar = mVar2;
                gcnVar = gcnVar2;
                obj = k0;
            } else {
                if (r1 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gcnVar = (gcn) this.L$2;
                zjr0Var = (zjr0) this.L$1;
                m mVar3 = (m) this.L$0;
                kotlin.b.b(obj);
                mVar = mVar3;
            }
            list = (List) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to share image");
            ckr0.Companion.getClass();
            r1.a(new ck7(new ckr0(false), null));
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String str = zjr0Var.b;
        if (str == null) {
            str = "";
        }
        q5z.Z(str, list, zjr0Var.c, mVar.a);
        h2p h2pVar = new h2p(gcnVar, 3);
        h2p h2pVar2 = new h2p(gcnVar, 4);
        tje.N(mVar.g, null, null, new SuperAppShareDelegate$handleActivityResult$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.T(mVar.e.a(122), 1), null, h2pVar, h2pVar2, mVar, h2pVar2), 3);
        return zy11.a;
    }
}
