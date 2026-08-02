package ru.yandex.taxi.masstransit.repository;

import defpackage.bms;
import defpackage.fc30;
import defpackage.mct0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.y91;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmct0;", "model", "Lfc30;", "icons", "", "syncAddressesInProgress", "Ly91;", "<anonymous>", "(Lmct0;Lfc30;Z)Ly91;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.repository.MtAddressRepository$stateFlow$1$1", f = "MtAddressRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtAddressRepository$stateFlow$1$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        MtAddressRepository$stateFlow$1$1 mtAddressRepository$stateFlow$1$1 = new MtAddressRepository$stateFlow$1$1(4, (Continuation) obj4);
        mtAddressRepository$stateFlow$1$1.L$0 = (mct0) obj;
        mtAddressRepository$stateFlow$1$1.L$1 = (fc30) obj2;
        mtAddressRepository$stateFlow$1$1.Z$0 = booleanValue;
        return mtAddressRepository$stateFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mct0 mct0Var = (mct0) this.L$0;
        fc30 fc30Var = (fc30) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new y91(mct0Var, fc30Var, z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
