package ru.yandex.logistics.care.ui;

import defpackage.cq8;
import defpackage.dq8;
import defpackage.ds31;
import defpackage.fc41;
import defpackage.jl40;
import defpackage.mq8;
import defpackage.mvg;
import defpackage.n4c;
import defpackage.nt8;
import defpackage.ny61;
import defpackage.or8;
import defpackage.tse;
import defpackage.vr7;
import defpackage.w511;
import defpackage.wls;
import defpackage.wr7;
import defpackage.xr7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$createJsCallback$1$onShowCamera$1", f = "CareWebViewViewModel.kt", l = {510, 513, 523}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$createJsCallback$1$onShowCamera$1 extends SuspendLambda implements wls {
    final /* synthetic */ or8 $analyticsTracker;
    final /* synthetic */ fc41 $config;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$createJsCallback$1$onShowCamera$1(l lVar, fc41 fc41Var, or8 or8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$config = fc41Var;
        this.$analyticsTracker = or8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$createJsCallback$1$onShowCamera$1(this.this$0, this.$config, this.$analyticsTracker, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$createJsCallback$1$onShowCamera$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r14 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.w.a.b(Permission.CAMERA)) {
                l lVar = this.this$0;
                r0 r0Var = lVar.L;
                nt8 nt8Var = new nt8(new n(this.$config, lVar.A, lVar.y, ds31.a(lVar), lVar.B));
                this.label = 1;
                r0Var.emit(nt8Var, this);
                if (zy11Var != coroutineSingletons) {
                    return zy11Var;
                }
            } else {
                this.$analyticsTracker.k(mq8.b);
                a aVar = this.this$0.w;
                this.label = 2;
                obj = aVar.a(this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i != 2) {
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xr7 xr7Var = (xr7) obj;
        if (jl40.l(xr7Var, vr7.a)) {
            this.$analyticsTracker.k(cq8.b);
            l lVar2 = this.this$0;
            n4c n4cVar = new n4c(this.$config.a, true);
            int i2 = l.S;
            lVar2.d0(n4cVar);
            return zy11Var;
        }
        if (!jl40.l(xr7Var, wr7.a)) {
            w511.b();
            return null;
        }
        this.$analyticsTracker.k(dq8.b);
        l lVar3 = this.this$0;
        r0 r0Var2 = lVar3.L;
        nt8 nt8Var2 = new nt8(new n(this.$config, lVar3.A, lVar3.y, ds31.a(lVar3), lVar3.B));
        this.label = 3;
        r0Var2.emit(nt8Var2, this);
        if (zy11Var == coroutineSingletons) {
            return coroutineSingletons;
        }
    }
}
