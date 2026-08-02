package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.models.Address;
import defpackage.gh00;
import defpackage.hi50;
import defpackage.ji50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$attachView$6", f = "NddAddressMapPickerInteractor.kt", l = {200, 201}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$attachView$6 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$attachView$6(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NddAddressMapPickerInteractor$attachView$6(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NddAddressMapPickerInteractor$attachView$6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0028, code lost:
    
        if (r6.a(r5) == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        ji50 ji50Var;
        r0 r0Var;
        Object value;
        Address a;
        Address a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.tariffs.interactor.b bVar = this.this$0.n;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                eVar = this.this$0;
                ji50Var = eVar.a;
                if ((ji50Var instanceof hi50) || ((hi50) ji50Var).e == null) {
                    r0Var = eVar.R;
                    do {
                        value = r0Var.getValue();
                        a = eVar.h.b.a();
                    } while (!r0Var.k(value, a == null ? a.B() : null));
                }
                e eVar2 = this.this$0;
                a2 = eVar2.h.b.a();
                if (a2 != null) {
                    Float f = eVar2.s.b().s;
                    ((gh00) eVar2.B).K(f != null ? f.floatValue() : 10.0f);
                } else {
                    eVar2.i(a2.B(), e.S);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        e eVar3 = this.this$0;
        pzt0 a3 = eVar3.o.a(eVar3.a.c());
        if (a3 != null) {
            this.label = 2;
            obj = a3.u0(this);
        }
        eVar = this.this$0;
        ji50Var = eVar.a;
        if (ji50Var instanceof hi50) {
        }
        r0Var = eVar.R;
        do {
            value = r0Var.getValue();
            a = eVar.h.b.a();
        } while (!r0Var.k(value, a == null ? a.B() : null));
        e eVar22 = this.this$0;
        a2 = eVar22.h.b.a();
        if (a2 != null) {
        }
        return zy11.a;
    }
}
