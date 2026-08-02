package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.c6b0;
import defpackage.d6b0;
import defpackage.gwq;
import defpackage.j6b0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6b0;
import defpackage.p6b0;
import defpackage.q6b0;
import defpackage.t6b0;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgwq;", "fetchPersonalState", "Lzy11;", "<anonymous>", "(Lgwq;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$subscribeRequestFetchPersonalState$2", f = "PersonalStateProvider.kt", l = {120, HProv.PP_SAME_MEDIA, HProv.PP_SECURITY_LEVEL, HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$subscribeRequestFetchPersonalState$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalStateProvider$subscribeRequestFetchPersonalState$2(Continuation continuation, o oVar) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalStateProvider$subscribeRequestFetchPersonalState$2 personalStateProvider$subscribeRequestFetchPersonalState$2 = new PersonalStateProvider$subscribeRequestFetchPersonalState$2(continuation, this.this$0);
        personalStateProvider$subscribeRequestFetchPersonalState$2.L$0 = obj;
        return personalStateProvider$subscribeRequestFetchPersonalState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateProvider$subscribeRequestFetchPersonalState$2) create((gwq) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[Catch: all -> 0x0043, CancellationException -> 0x0120, TryCatch #2 {CancellationException -> 0x0120, all -> 0x0043, blocks: (B:15:0x003e, B:16:0x00c2, B:18:0x00e9, B:20:0x00ee, B:21:0x00f1, B:25:0x0053, B:26:0x00a5, B:32:0x005f, B:33:0x0082, B:41:0x006b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee A[Catch: all -> 0x0043, CancellationException -> 0x0120, TryCatch #2 {CancellationException -> 0x0120, all -> 0x0043, blocks: (B:15:0x003e, B:16:0x00c2, B:18:0x00e9, B:20:0x00ee, B:21:0x00f1, B:25:0x0053, B:26:0x00a5, B:32:0x005f, B:33:0x0082, B:41:0x006b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        j6b0 j6b0Var;
        String f;
        String f2;
        t6b0 t6b0Var = t6b0.a;
        zy11 zy11Var = zy11.a;
        gwq gwqVar = (gwq) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        o oVar6 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            r0 r0Var = oVar6.s;
            o6b0 o6b0Var = new o6b0(t6b0Var);
            this.L$0 = null;
            this.L$1 = th2;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
            r0Var.emit(o6b0Var, this);
            if (zy11Var != coroutineSingletons) {
                th = th2;
            }
        }
        if (oVar6 == 0) {
            kotlin.b.b(obj);
            if (gwqVar == null) {
                return zy11Var;
            }
            o oVar7 = this.this$0;
            r0 r0Var2 = oVar7.s;
            q6b0 q6b0Var = new q6b0(t6b0Var);
            this.L$0 = gwqVar;
            this.L$1 = oVar7;
            this.L$2 = oVar7;
            this.label = 1;
            r0Var2.emit(q6b0Var, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            oVar = oVar7;
            oVar2 = oVar7;
        } else {
            if (oVar6 != 1) {
                if (oVar6 != 2) {
                    if (oVar6 != 3) {
                        if (oVar6 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.L$1;
                        kotlin.b.b(obj);
                        jst.e.k(th, "Error updating personal state");
                        return zy11Var;
                    }
                    j6b0Var = (j6b0) this.L$4;
                    o oVar8 = (o) this.L$2;
                    oVar5 = (o) this.L$1;
                    kotlin.b.b(obj);
                    oVar6 = oVar8;
                    ru.yandex.taxi.personalstate.data.remote.a aVar = oVar5.c;
                    aVar.getClass();
                    d6b0 d6b0Var = new d6b0();
                    o.e(oVar5, d6b0Var, j6b0Var);
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
                    c6b0Var.a.a("PersonalState.Loaded", hashMap, 1, new HashMap());
                    return zy11Var;
                }
                o oVar9 = (o) this.L$2;
                oVar3 = (o) this.L$1;
                kotlin.b.b(obj);
                oVar4 = oVar9;
                j6b0 j6b0Var2 = (j6b0) obj;
                r0 r0Var3 = oVar3.s;
                p6b0 p6b0Var = new p6b0(t6b0Var, j6b0Var2);
                this.L$0 = null;
                this.L$1 = oVar3;
                this.L$2 = oVar4;
                this.L$3 = null;
                this.L$4 = j6b0Var2;
                this.label = 3;
                r0Var3.emit(p6b0Var, this);
                if (zy11Var != coroutineSingletons) {
                    return coroutineSingletons;
                }
                oVar5 = oVar3;
                j6b0Var = j6b0Var2;
                oVar6 = oVar4;
                ru.yandex.taxi.personalstate.data.remote.a aVar2 = oVar5.c;
                aVar2.getClass();
                d6b0 d6b0Var2 = new d6b0();
                o.e(oVar5, d6b0Var2, j6b0Var);
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
                c6b0Var2.a.a("PersonalState.Loaded", hashMap2, 1, new HashMap());
                return zy11Var;
            }
            o oVar10 = (o) this.L$2;
            oVar = (o) this.L$1;
            kotlin.b.b(obj);
            oVar2 = oVar10;
        }
        List a = oVar.j.a(oVar.b.a.G);
        ru.yandex.taxi.personalstate.domain.interactor.i iVar = oVar.a;
        Zone zone = gwqVar.a;
        this.L$0 = null;
        this.L$1 = oVar;
        this.L$2 = oVar2;
        this.L$3 = null;
        this.label = 2;
        obj = iVar.a(a, zone, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        oVar3 = oVar;
        oVar4 = oVar2;
        j6b0 j6b0Var22 = (j6b0) obj;
        r0 r0Var32 = oVar3.s;
        p6b0 p6b0Var2 = new p6b0(t6b0Var, j6b0Var22);
        this.L$0 = null;
        this.L$1 = oVar3;
        this.L$2 = oVar4;
        this.L$3 = null;
        this.L$4 = j6b0Var22;
        this.label = 3;
        r0Var32.emit(p6b0Var2, this);
        if (zy11Var != coroutineSingletons) {
        }
    }
}
