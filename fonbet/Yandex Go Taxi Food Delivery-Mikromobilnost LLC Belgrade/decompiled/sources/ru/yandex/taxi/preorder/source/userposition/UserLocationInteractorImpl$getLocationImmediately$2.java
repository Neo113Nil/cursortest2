package ru.yandex.taxi.preorder.source.userposition;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.source.userposition.repository.LocationRepository$LocationUnknownException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmo21;", "<anonymous>", "(Ltse;)Lmo21;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.UserLocationInteractorImpl$getLocationImmediately$2", f = "UserLocationInteractorImpl.kt", l = {67, 71, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class UserLocationInteractorImpl$getLocationImmediately$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocationInteractorImpl$getLocationImmediately$2(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserLocationInteractorImpl$getLocationImmediately$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserLocationInteractorImpl$getLocationImmediately$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r8 != r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mo21 mo21Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (LocationRepository$LocationUnknownException unused) {
            e eVar = this.this$0;
            this.L$0 = null;
            this.label = 4;
            obj = e.a(eVar, this);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            boolean b = this.this$0.f.b();
            e eVar2 = this.this$0;
            if (b) {
                this.label = 1;
                obj = e.b(eVar2, this);
            } else {
                boolean c = eVar2.f.c();
                e eVar3 = this.this$0;
                if (!c) {
                    this.label = 3;
                    obj = eVar3.j(this);
                    if (obj == coroutineSingletons) {
                    }
                    mo21Var = (mo21) obj;
                    this.this$0.a.b(mo21Var);
                    return mo21Var;
                }
                this.label = 2;
                obj = e.a(eVar3, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            mo21Var = (mo21) obj;
            this.this$0.a.b(mo21Var);
            return mo21Var;
        }
        if (i == 2) {
            kotlin.b.b(obj);
            mo21Var = (mo21) obj;
            this.this$0.a.b(mo21Var);
            return mo21Var;
        }
        if (i == 3) {
            kotlin.b.b(obj);
            mo21Var = (mo21) obj;
            this.this$0.a.b(mo21Var);
            return mo21Var;
        }
        if (i != 4) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mo21Var = (mo21) obj;
        this.this$0.a.b(mo21Var);
        return mo21Var;
    }
}
