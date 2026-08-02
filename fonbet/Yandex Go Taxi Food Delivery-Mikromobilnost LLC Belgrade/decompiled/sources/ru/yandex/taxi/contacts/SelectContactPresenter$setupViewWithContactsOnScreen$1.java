package ru.yandex.taxi.contacts;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.phone_select.ContactSecurityException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.contacts.SelectContactPresenter$setupViewWithContactsOnScreen$1", f = "SelectContactPresenter.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SelectContactPresenter$setupViewWithContactsOnScreen$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectContactPresenter$setupViewWithContactsOnScreen$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectContactPresenter$setupViewWithContactsOnScreen$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectContactPresenter$setupViewWithContactsOnScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar3 = this.this$0;
                try {
                    a aVar = dVar3.x;
                    this.L$0 = dVar3;
                    this.L$1 = dVar3;
                    this.label = 1;
                    Object c = aVar.c(this);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dVar = dVar3;
                    obj = c;
                    dVar2 = dVar;
                } catch (Throwable th) {
                    th = th;
                    dVar = dVar3;
                    if (th instanceof ContactSecurityException) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$1;
                dVar2 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ContactSecurityException) {
                        jst.e.r("Unexpected exception on requestContact", th);
                    } else {
                        dVar.F = true;
                        ((SelectContactMvpView) dVar.Dg()).J(dVar.y.g);
                        dVar.Sg((SelectContactMvpView) dVar.Dg());
                    }
                    return zy11.a;
                }
            }
            d.Kg(dVar2, (List) obj);
            dVar2.Lg();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
