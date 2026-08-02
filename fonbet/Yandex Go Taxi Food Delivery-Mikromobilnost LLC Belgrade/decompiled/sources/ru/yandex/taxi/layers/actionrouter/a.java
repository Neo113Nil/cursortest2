package ru.yandex.taxi.layers.actionrouter;

import defpackage.ah00;
import defpackage.d2t;
import defpackage.eci0;
import defpackage.g7r;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o9j0;
import defpackage.p820;
import defpackage.sjh;
import defpackage.tit0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsd0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.persuggest.domain.d;
import ru.yandex.taxi.persuggest.domain.g;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes5.dex */
public final class a implements g7r {
    public final ah00 a;
    public final i b;
    public final tit0 c;
    public final AddressResolveRepository d;
    public final tt2 e;

    public a(ah00 ah00Var, i iVar, tit0 tit0Var, AddressResolveRepository addressResolveRepository, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = iVar;
        this.c = tit0Var;
        this.d = addressResolveRepository;
        this.e = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (b(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        FinalizeAddressByGravityRouterImpl$launch$1 finalizeAddressByGravityRouterImpl$launch$1;
        Object obj;
        int i;
        Object k0;
        if (continuation instanceof FinalizeAddressByGravityRouterImpl$launch$1) {
            finalizeAddressByGravityRouterImpl$launch$1 = (FinalizeAddressByGravityRouterImpl$launch$1) continuation;
            int i2 = finalizeAddressByGravityRouterImpl$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                finalizeAddressByGravityRouterImpl$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = finalizeAddressByGravityRouterImpl$launch$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = finalizeAddressByGravityRouterImpl$launch$1.label;
                Object obj3 = zy11.a;
                tit0 tit0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    tit0Var.j = true;
                    finalizeAddressByGravityRouterImpl$launch$1.L$0 = wsd0Var;
                    finalizeAddressByGravityRouterImpl$launch$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        tit0Var.j = false;
                        return obj3;
                    }
                    wsd0Var = (wsd0) finalizeAddressByGravityRouterImpl$launch$1.L$0;
                    kotlin.b.b(obj2);
                }
                zzs position = wsd0Var.getPosition();
                finalizeAddressByGravityRouterImpl$launch$1.L$0 = null;
                finalizeAddressByGravityRouterImpl$launch$1.label = 2;
                this.e.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(o400.a, new FinalizeAddressByGravityRouterImpl$moveToAddress$2(this, position, null), finalizeAddressByGravityRouterImpl$launch$1);
                if (k0 != obj) {
                    k0 = obj3;
                }
            }
        }
        finalizeAddressByGravityRouterImpl$launch$1 = new FinalizeAddressByGravityRouterImpl$launch$1(this, (ContinuationImpl) continuation);
        Object obj22 = finalizeAddressByGravityRouterImpl$launch$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = finalizeAddressByGravityRouterImpl$launch$1.label;
        Object obj32 = zy11.a;
        tit0 tit0Var2 = this.c;
        if (i != 0) {
        }
        zzs position2 = wsd0Var.getPosition();
        finalizeAddressByGravityRouterImpl$launch$1.L$0 = null;
        finalizeAddressByGravityRouterImpl$launch$1.label = 2;
        this.e.getClass();
        sjh sjhVar2 = uyj.a;
        k0 = tje.k0(o400.a, new FinalizeAddressByGravityRouterImpl$moveToAddress$2(this, position2, null), finalizeAddressByGravityRouterImpl$launch$1);
        if (k0 != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wsd0 wsd0Var, ContinuationImpl continuationImpl) {
        FinalizeAddressByGravityRouterImpl$finalizeAddress$1 finalizeAddressByGravityRouterImpl$finalizeAddress$1;
        int i;
        if (continuationImpl instanceof FinalizeAddressByGravityRouterImpl$finalizeAddress$1) {
            finalizeAddressByGravityRouterImpl$finalizeAddress$1 = (FinalizeAddressByGravityRouterImpl$finalizeAddress$1) continuationImpl;
            int i2 = finalizeAddressByGravityRouterImpl$finalizeAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                finalizeAddressByGravityRouterImpl$finalizeAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = finalizeAddressByGravityRouterImpl$finalizeAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = finalizeAddressByGravityRouterImpl$finalizeAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs position = wsd0Var.getPosition();
                    String o = wsd0Var.o();
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    String str = ((s) wsd0Var.getAction()).a;
                    i iVar = this.b;
                    g gVar = iVar.e;
                    String m = iVar.b.m();
                    gVar.f.getClass();
                    d2t d2tVar = new d2t(new o9j0(routePointType, position, null, false, false, str, null, jl40.l(routePointType.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null, null, null, null, 3932), new p820(position, o, m, routePointType, gVar.e.d(), null, null, null, null, false, 4064));
                    eci0 h = g.h(gVar, d2tVar, null, 6);
                    gVar.a(h, d2tVar);
                    tpr s = iVar.s(new d(h));
                    finalizeAddressByGravityRouterImpl$finalizeAddress$1.L$0 = null;
                    finalizeAddressByGravityRouterImpl$finalizeAddress$1.label = 1;
                    if (e.y(s, finalizeAddressByGravityRouterImpl$finalizeAddress$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        finalizeAddressByGravityRouterImpl$finalizeAddress$1 = new FinalizeAddressByGravityRouterImpl$finalizeAddress$1(this, continuationImpl);
        Object obj2 = finalizeAddressByGravityRouterImpl$finalizeAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = finalizeAddressByGravityRouterImpl$finalizeAddress$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
