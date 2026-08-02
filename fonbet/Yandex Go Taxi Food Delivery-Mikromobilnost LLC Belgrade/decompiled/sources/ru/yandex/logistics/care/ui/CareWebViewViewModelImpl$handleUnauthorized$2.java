package ru.yandex.logistics.care.ui;

import android.util.Log;
import defpackage.bt8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xt8;
import defpackage.yt8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$handleUnauthorized$2", f = "CareWebViewViewModel.kt", l = {371, 375, 379}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$handleUnauthorized$2 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$handleUnauthorized$2(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$handleUnauthorized$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$handleUnauthorized$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            ru.yandex.taxi.logistics.care.impl.router.e eVar = lVar.c.c;
            String str = ((bt8) lVar.C.getValue()).a;
            this.label = 1;
            d = eVar.d(str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        l lVar2 = this.this$0;
        Throwable a = Result.a(d);
        if (a == null) {
            int i2 = l.S;
            lVar2.getClass();
            lVar2.D = new xt8(System.currentTimeMillis(), 14);
            n0 n0Var = lVar2.H;
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 2;
            return n0Var.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        lVar2.A.getClass();
        Log.e("Care_SDK", "onUnauthorized failed", a);
        r0 r0Var = lVar2.J;
        this.L$0 = null;
        this.I$0 = 0;
        this.label = 3;
        r0Var.emit(yt8.a, this);
        if (zy11Var == coroutineSingletons) {
        }
    }
}
