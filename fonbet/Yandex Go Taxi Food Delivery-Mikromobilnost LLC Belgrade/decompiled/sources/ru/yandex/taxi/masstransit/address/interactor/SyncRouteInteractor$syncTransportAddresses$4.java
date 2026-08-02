package ru.yandex.taxi.masstransit.address.interactor;

import defpackage.bvf0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needSyncAddresses", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$syncTransportAddresses$4", f = "SyncRouteInteractor.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$syncTransportAddresses$4 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$syncTransportAddresses$4(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SyncRouteInteractor$syncTransportAddresses$4 syncRouteInteractor$syncTransportAddresses$4 = new SyncRouteInteractor$syncTransportAddresses$4(this.this$0, continuation);
        syncRouteInteractor$syncTransportAddresses$4.Z$0 = ((Boolean) obj).booleanValue();
        return syncRouteInteractor$syncTransportAddresses$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((SyncRouteInteractor$syncTransportAddresses$4) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [b0x0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    i iVar = this.this$0;
                    if (!z) {
                        iVar.e.a(false);
                        xby.l(jst.e, "Transport.AddressSyncError", null, null, "Cancel sync due to taxi route is changed", 6);
                        return zy11Var;
                    }
                    iVar.e.a(true);
                    i iVar2 = this.this$0;
                    this.Z$0 = z;
                    this.label = 1;
                    iVar2.getClass();
                    Object n = bvf0.n(new SyncRouteInteractor$syncTransportAddressesInternal$2(iVar2, null), this);
                    if (n != coroutineSingletons) {
                        n = zy11Var;
                    }
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this = this.this$0.e;
                this.a(false);
                return zy11Var;
            } catch (CancellationException e) {
                xby.l(jst.e, "Transport.AddressSyncError", null, null, "Cancel sync job", 6);
                throw e;
            }
        } catch (Throwable th) {
            this.this$0.e.a(false);
            throw th;
        }
    }
}
