package ru.yandex.taxi.delivery.contacts;

import defpackage.e1i;
import defpackage.ide;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.phone_select.ContactSecurityException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.contacts.DeliveryContactsPresenter$onPickFromContact$1", f = "DeliveryContactsPresenter.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryContactsPresenter$onPickFromContact$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryContactsPresenter$onPickFromContact$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryContactsPresenter$onPickFromContact$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryContactsPresenter$onPickFromContact$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar3 = this.this$0;
                try {
                    ru.yandex.taxi.contacts.a aVar4 = aVar3.x;
                    this.L$0 = aVar3;
                    this.L$1 = aVar3;
                    this.label = 1;
                    Object d = aVar4.d(this);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = aVar3;
                    obj = d;
                    aVar2 = aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    if (th instanceof ContactSecurityException) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ContactSecurityException) {
                        jst.e.k(th, "Unexpected exception on requestContact");
                    } else {
                        ((e1i) aVar.Dg()).d0(aVar.B.f);
                    }
                    return zy11.a;
                }
            }
            a.Lg(aVar2, (ide) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
