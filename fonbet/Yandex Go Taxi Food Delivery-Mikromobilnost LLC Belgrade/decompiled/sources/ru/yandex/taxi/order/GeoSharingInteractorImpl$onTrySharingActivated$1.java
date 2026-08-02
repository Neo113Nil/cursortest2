package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.cne0;
import defpackage.hdu;
import defpackage.ih01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.GeoSharingInteractorImpl$onTrySharingActivated$1", f = "GeoSharingInteractor.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GeoSharingInteractorImpl$onTrySharingActivated$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $canForcedSwitch;
    final /* synthetic */ boolean $isActive;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingInteractorImpl$onTrySharingActivated$1(d dVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$isActive = z;
        this.$canForcedSwitch = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoSharingInteractorImpl$onTrySharingActivated$1(this.this$0, this.$isActive, this.$canForcedSwitch, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoSharingInteractorImpl$onTrySharingActivated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p2y0 p2y0Var = this.this$0.e;
            this.label = 1;
            obj = ((e0) p2y0Var).k(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        int size = list.size();
        zy11 zy11Var = zy11.a;
        if (size != 1) {
            return zy11Var;
        }
        d dVar = this.this$0;
        boolean z = this.$isActive;
        o2y0 o2y0Var = (o2y0) kotlin.collections.a.P(list);
        boolean z2 = this.$canForcedSwitch;
        hdu hduVar = dVar.i;
        ru.yandex.taxi.utils.b bVar = dVar.c;
        if (!z) {
            String d = bVar.d();
            String str = bVar.i;
            cne0 cne0Var = bVar.m;
            if (d.equals(o2y0Var.b().a)) {
                if (cne0Var.g(str, true)) {
                    hduVar.p(false);
                }
                cne0Var.u(str, false);
            }
        }
        ih01 ih01Var = (ih01) hduVar.b;
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        ih01Var.a.a("UserLiveLocationOrderActionsEnabled", hashMap, 1, x4e.r(z, hashMap, "sharing_state"));
        if (z2 && z) {
            bVar.m.u(bVar.g, true);
        }
        bVar.m.r(bVar.j, o2y0Var.b().a);
        bVar.m.u(bVar.h, z);
        ((com.yandex.go.geosharing.controller.e) dVar.b).g(z);
        dVar.d();
        return zy11Var;
    }
}
