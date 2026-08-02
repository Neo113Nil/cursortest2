package ru.yandex.taxi.masstransit.main.ui.modal;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.mapkit.geometry.Point;
import defpackage.atd0;
import defpackage.dz00;
import defpackage.ej1;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k110;
import defpackage.lo30;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.nc60;
import defpackage.ny61;
import defpackage.oc60;
import defpackage.pc60;
import defpackage.po21;
import defpackage.sy60;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.userposition.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexPresenter$onGeoTap$1", f = "MtMainFlexPresenter.kt", l = {HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_SECURITY_LEVEL, HProv.PP_FAST_CODE, HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtMainFlexPresenter$onGeoTap$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ lo30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainFlexPresenter$onGeoTap$1(lo30 lo30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lo30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMainFlexPresenter$onGeoTap$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainFlexPresenter$onGeoTap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (kotlinx.coroutines.flow.e.A(r15, r14) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r15 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0052, code lost:
    
        if (r15 == r0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ej1 b;
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        mo21 mo21Var = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "TransportAddress", null, th, "Error when try to finalize user location", 2);
        }
        if (mo21Var == 0) {
            kotlin.b.b(obj);
            po21 po21Var = this.this$0.A;
            this.label = 1;
            obj = Boolean.valueOf(((e) po21Var).f.b());
        } else {
            if (mo21Var != 1) {
                if (mo21Var == 2) {
                    kotlin.b.b(obj);
                    mo21 mo21Var2 = (mo21) obj;
                    dz00 dz00Var = this.this$0.E;
                    this.L$0 = mo21Var2;
                    this.label = 3;
                    Object b2 = dz00Var.a.b(this);
                    if (b2 != coroutineSingletons) {
                        mo21Var = mo21Var2;
                        obj = b2;
                        if (((k110) obj).m.a) {
                        }
                        ((gh00) this.this$0.z).D(new Point(mo21Var.a, mo21Var.b), 17.0f, 300.0f, null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                if (mo21Var != 3) {
                    if (mo21Var != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mo21 mo21Var3 = (mo21) this.L$0;
                    kotlin.b.b(obj);
                    mo21Var = mo21Var3;
                    ((gh00) this.this$0.z).D(new Point(mo21Var.a, mo21Var.b), 17.0f, 300.0f, null);
                    return zy11.a;
                }
                mo21 mo21Var4 = (mo21) this.L$0;
                kotlin.b.b(obj);
                mo21Var = mo21Var4;
                if (((k110) obj).m.a) {
                    zzs a = mo21Var.a();
                    ZoneAddress zoneAddress = this.this$0.F.a().a;
                    if (!jl40.l((zoneAddress == null || (address = zoneAddress.a) == null) ? null : address.B(), a)) {
                        tpr a2 = atd0.a(this.this$0.D, a, RoutePointType.TRANSPORT_A);
                        this.L$0 = mo21Var;
                        this.L$1 = null;
                        this.label = 4;
                        mo21Var = mo21Var;
                    }
                }
                ((gh00) this.this$0.z).D(new Point(mo21Var.a, mo21Var.b), 17.0f, 300.0f, null);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        lo30 lo30Var = this.this$0;
        if (booleanValue) {
            ru.yandex.taxi.masstransit.main.router.b bVar = lo30Var.x.a;
            b = ((pc60) ((oc60) bVar.J.get())).b(false);
            bVar.A(b, new nc60((String) null), sy60.Q2);
            return zy11.a;
        }
        po21 po21Var2 = lo30Var.A;
        this.label = 2;
        obj = ((e) po21Var2).g(this);
    }
}
