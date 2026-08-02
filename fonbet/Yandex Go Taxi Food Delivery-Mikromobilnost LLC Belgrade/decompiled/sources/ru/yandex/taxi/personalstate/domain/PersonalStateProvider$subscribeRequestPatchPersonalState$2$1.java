package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.c6b0;
import defpackage.d6b0;
import defpackage.j6b0;
import defpackage.jst;
import defpackage.lq90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6b0;
import defpackage.pex0;
import defpackage.q6b0;
import defpackage.u6b0;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llq90;", "patchPersonalStateModel", "Lzy11;", "<anonymous>", "(Llq90;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$subscribeRequestPatchPersonalState$2$1", f = "PersonalStateProvider.kt", l = {198, 201, 208, 217}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$subscribeRequestPatchPersonalState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Zone $zone;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalStateProvider$subscribeRequestPatchPersonalState$2$1(o oVar, Zone zone, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$zone = zone;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalStateProvider$subscribeRequestPatchPersonalState$2$1 personalStateProvider$subscribeRequestPatchPersonalState$2$1 = new PersonalStateProvider$subscribeRequestPatchPersonalState$2$1(this.this$0, this.$zone, continuation);
        personalStateProvider$subscribeRequestPatchPersonalState$2$1.L$0 = obj;
        return personalStateProvider$subscribeRequestPatchPersonalState$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateProvider$subscribeRequestPatchPersonalState$2$1) create((lq90) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(1:(1:(1:(1:(3:8|9|10)(2:12|13))(7:14|15|16|(1:18)|(1:20)|21|22))(7:24|25|26|27|28|(6:30|16|(0)|(0)|21|22)|31))(3:37|38|39))(4:45|46|(1:48)|31)|40|41|42|(2:44|31)|27|28|(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0107, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r1 = r1.s;
        r2 = new defpackage.o6b0(r10);
        r16.L$0 = null;
        r16.L$1 = r0;
        r16.L$2 = null;
        r16.L$3 = null;
        r16.label = 4;
        r1.emit(r2, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011c, code lost:
    
        if (r12 != r7) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1 A[Catch: all -> 0x0041, CancellationException -> 0x0127, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:16:0x00ca, B:18:0x00f1, B:20:0x00f6, B:21:0x00f9, B:25:0x004d, B:38:0x0061, B:46:0x006e), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6 A[Catch: all -> 0x0041, CancellationException -> 0x0127, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:16:0x00ca, B:18:0x00f1, B:20:0x00f6, B:21:0x00f9, B:25:0x004d, B:38:0x0061, B:46:0x006e), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ru.yandex.taxi.personalstate.domain.o] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Zone zone;
        o oVar;
        o oVar2;
        o oVar3;
        Object d;
        o oVar4;
        j6b0 j6b0Var;
        String f;
        String f2;
        lq90 lq90Var = (lq90) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        u6b0 u6b0Var = u6b0.a;
        zy11 zy11Var = zy11.a;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
            if (r1 == 0) {
                kotlin.b.b(obj);
                o oVar5 = this.this$0;
                zone = this.$zone;
                r0 r0Var = oVar5.s;
                q6b0 q6b0Var = new q6b0(u6b0Var);
                this.L$0 = lq90Var;
                this.L$1 = oVar5;
                this.L$2 = zone;
                this.L$3 = oVar5;
                this.label = 1;
                r0Var.emit(q6b0Var, this);
                if (zy11Var != coroutineSingletons) {
                    oVar = oVar5;
                    oVar2 = oVar;
                }
                return coroutineSingletons;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        if (r1 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.L$1;
                        kotlin.b.b(obj);
                        jst.e.k(th, "PersonalState.Remote.Saving.Failed Error while sending personal state");
                        return zy11Var;
                    }
                    j6b0Var = (j6b0) this.L$3;
                    o oVar6 = (o) this.L$2;
                    oVar4 = (o) this.L$1;
                    kotlin.b.b(obj);
                    r1 = oVar6;
                    ru.yandex.taxi.personalstate.data.remote.a aVar = oVar4.c;
                    aVar.getClass();
                    d6b0 d6b0Var = new d6b0();
                    o.e(oVar4, d6b0Var, j6b0Var);
                    LinkedHashMap linkedHashMap = d6b0Var.a;
                    c6b0 c6b0Var = aVar.b;
                    f = ru.yandex.taxi.personalstate.data.remote.a.f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap);
                    f2 = ru.yandex.taxi.personalstate.data.remote.a.f("vertical", linkedHashMap);
                    c6b0Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (f != null) {
                        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, f);
                    }
                    if (f2 != null) {
                        hashMap.put("vertical", f2);
                    }
                    c6b0Var.a.a("PersonalState.Saved", hashMap, 1, new HashMap());
                    return zy11Var;
                }
                o oVar7 = (o) this.L$2;
                oVar3 = (o) this.L$1;
                kotlin.b.b(obj);
                oVar2 = oVar7;
                d = obj;
                oVar4 = oVar3;
                j6b0Var = (j6b0) d;
                r0 r0Var2 = oVar4.s;
                p6b0 p6b0Var = new p6b0(u6b0Var, j6b0Var);
                this.L$0 = null;
                this.L$1 = oVar4;
                this.L$2 = oVar2;
                this.L$3 = j6b0Var;
                this.label = 3;
                r0Var2.emit(p6b0Var, this);
                if (zy11Var != coroutineSingletons) {
                    r1 = oVar2;
                    ru.yandex.taxi.personalstate.data.remote.a aVar2 = oVar4.c;
                    aVar2.getClass();
                    d6b0 d6b0Var2 = new d6b0();
                    o.e(oVar4, d6b0Var2, j6b0Var);
                    LinkedHashMap linkedHashMap2 = d6b0Var2.a;
                    c6b0 c6b0Var2 = aVar2.b;
                    f = ru.yandex.taxi.personalstate.data.remote.a.f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap2);
                    f2 = ru.yandex.taxi.personalstate.data.remote.a.f("vertical", linkedHashMap2);
                    c6b0Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (f != null) {
                    }
                    if (f2 != null) {
                    }
                    c6b0Var2.a.a("PersonalState.Saved", hashMap2, 1, new HashMap());
                    return zy11Var;
                }
                return coroutineSingletons;
            }
            o oVar8 = (o) this.L$3;
            zone = (Zone) this.L$2;
            oVar = (o) this.L$1;
            kotlin.b.b(obj);
            oVar2 = oVar8;
            Zone zone2 = zone;
            pex0 b = lq90Var.b();
            boolean d2 = lq90Var.d();
            SavePersonalStateNotifier$SavePersonalStateReason a = lq90Var.a();
            SelectionOrigin c = lq90Var.c();
            this.L$0 = null;
            this.L$1 = oVar;
            this.L$2 = oVar2;
            this.L$3 = null;
            this.label = 2;
            oVar3 = oVar;
            d = o.d(oVar3, zone2, b, d2, a, c, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
            oVar4 = oVar3;
            j6b0Var = (j6b0) d;
            r0 r0Var22 = oVar4.s;
            p6b0 p6b0Var2 = new p6b0(u6b0Var, j6b0Var);
            this.L$0 = null;
            this.L$1 = oVar4;
            this.L$2 = oVar2;
            this.L$3 = j6b0Var;
            this.label = 3;
            r0Var22.emit(p6b0Var2, this);
            if (zy11Var != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
