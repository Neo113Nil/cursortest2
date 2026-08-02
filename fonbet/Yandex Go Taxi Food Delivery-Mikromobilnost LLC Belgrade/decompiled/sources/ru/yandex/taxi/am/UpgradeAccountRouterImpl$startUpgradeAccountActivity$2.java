package ru.yandex.taxi.am;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.yandex.passport.api.o3;
import defpackage.a60;
import defpackage.gtq0;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x40;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Ltpr;", "Lkotlin/Result;", "Lcom/yandex/passport/api/w;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl$startUpgradeAccountActivity$2", f = "UpgradeAccountRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$startUpgradeAccountActivity$2 extends SuspendLambda implements wls {
    final /* synthetic */ kj $account;
    final /* synthetic */ x40 $contract;
    final /* synthetic */ int $requestCode;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$startUpgradeAccountActivity$2(s0 s0Var, int i, x40 x40Var, kj kjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s0Var;
        this.$requestCode = i;
        this.$contract = x40Var;
        this.$account = kjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeAccountRouterImpl$startUpgradeAccountActivity$2(this.this$0, this.$requestCode, this.$contract, this.$account, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeAccountRouterImpl$startUpgradeAccountActivity$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = new r0(this.this$0.j.a(this.$requestCode), this.$contract);
        this.this$0.l.a();
        s0 s0Var = this.this$0;
        y50 y50Var = s0Var.h;
        Intent a = this.$contract.a(s0Var.a, new o3(s0Var.d.a(), gtq0.h(s0Var.b, this.$account.a)));
        int i = this.$requestCode;
        a60 a60Var = (a60) y50Var;
        a60Var.getClass();
        try {
            a60Var.e(i, a);
        } catch (ActivityNotFoundException unused) {
        }
        return r0Var;
    }
}
