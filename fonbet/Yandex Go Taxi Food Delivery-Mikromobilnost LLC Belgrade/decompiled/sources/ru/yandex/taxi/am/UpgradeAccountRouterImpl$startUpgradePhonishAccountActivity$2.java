package ru.yandex.taxi.am;

import android.content.Context;
import android.content.Intent;
import defpackage.a60;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r40;
import defpackage.tse;
import defpackage.wls;
import defpackage.x40;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/api/w;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/api/w;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl$startUpgradePhonishAccountActivity$2", f = "UpgradeAccountRouterImpl.kt", l = {167, MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$startUpgradePhonishAccountActivity$2 extends SuspendLambda implements wls {
    final /* synthetic */ kj $account;
    final /* synthetic */ x40 $contract;
    final /* synthetic */ boolean $isRequiredUpgrade;
    final /* synthetic */ int $requestCode;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$startUpgradePhonishAccountActivity$2(s0 s0Var, x40 x40Var, kj kjVar, boolean z, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s0Var;
        this.$contract = x40Var;
        this.$account = kjVar;
        this.$isRequiredUpgrade = z;
        this.$requestCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeAccountRouterImpl$startUpgradePhonishAccountActivity$2(this.this$0, this.$contract, this.$account, this.$isRequiredUpgrade, this.$requestCode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeAccountRouterImpl$startUpgradePhonishAccountActivity$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(1:(1:(3:5|6|7)(2:9|10))(1:11))(3:20|(1:22)|17)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r10 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y50 y50Var;
        x40 x40Var;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.l.a();
            s0 s0Var = this.this$0;
            y50Var = s0Var.h;
            x40 x40Var2 = this.$contract;
            Context context2 = s0Var.a;
            kj kjVar = this.$account;
            boolean z = this.$isRequiredUpgrade;
            this.L$0 = y50Var;
            this.L$1 = x40Var2;
            this.L$2 = context2;
            this.label = 1;
            obj = s0.c(s0Var, kjVar, z, this);
            if (obj != coroutineSingletons) {
                x40Var = x40Var2;
                context = context2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            r40 r40Var = (r40) obj;
            return this.$contract.c(r40Var.a, r40Var.c);
        }
        context = (Context) this.L$2;
        x40Var = (x40) this.L$1;
        y50Var = (y50) this.L$0;
        kotlin.b.b(obj);
        Intent a = x40Var.a(context, obj);
        int i2 = this.$requestCode;
        a60 a60Var = (a60) y50Var;
        a60Var.getClass();
        a60Var.e(i2, a);
        ru.yandex.taxi.activity.g gVar = this.this$0.j;
        int i3 = this.$requestCode;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = gVar.d(i3, this);
    }
}
