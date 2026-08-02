package ru.yandex.taxi.layers.actionrouter;

import defpackage.ah00;
import defpackage.d2t;
import defpackage.eci0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o9j0;
import defpackage.p820;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tit0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.d;
import ru.yandex.taxi.persuggest.domain.g;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes9.dex */
public final class b implements xsd0 {
    public final ah00 a;
    public final i b;
    public final tit0 c;
    public final tt2 d;

    public b(ah00 ah00Var, i iVar, tit0 tit0Var, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = iVar;
        this.c = tit0Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fa, code lost:
    
        if (r0 != r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        PullOutOfZoneRouterImpl$launch$1 pullOutOfZoneRouterImpl$launch$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object k0;
        if (continuation instanceof PullOutOfZoneRouterImpl$launch$1) {
            pullOutOfZoneRouterImpl$launch$1 = (PullOutOfZoneRouterImpl$launch$1) continuation;
            int i2 = pullOutOfZoneRouterImpl$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullOutOfZoneRouterImpl$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pullOutOfZoneRouterImpl$launch$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pullOutOfZoneRouterImpl$launch$1.label;
                zy11 zy11Var = zy11.a;
                tit0 tit0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tit0Var.j = true;
                    zzs position = wsd0Var.getPosition();
                    String o = wsd0Var.o();
                    i iVar = this.b;
                    g gVar = iVar.e;
                    String m = iVar.b.m();
                    gVar.getClass();
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    d2t d2tVar = new d2t(new o9j0(routePointType, position, null, false, false, null, null, "default", null, null, null, 3964), new p820(position, o, m, routePointType, gVar.e.d(), null, null, null, null, false, 4064));
                    eci0 h = g.h(gVar, d2tVar, null, 6);
                    gVar.a(h, d2tVar);
                    tpr s = iVar.s(new d(h));
                    pullOutOfZoneRouterImpl$launch$1.L$0 = null;
                    pullOutOfZoneRouterImpl$launch$1.label = 1;
                    obj = e.y(s, pullOutOfZoneRouterImpl$launch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        tit0Var.j = false;
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                zzs B = ((pv0) obj).a.B();
                pullOutOfZoneRouterImpl$launch$1.L$0 = null;
                pullOutOfZoneRouterImpl$launch$1.L$1 = null;
                pullOutOfZoneRouterImpl$launch$1.L$2 = null;
                pullOutOfZoneRouterImpl$launch$1.label = 2;
                this.d.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(o400.a, new PullOutOfZoneRouterImpl$moveToAddress$2(this, B, null), pullOutOfZoneRouterImpl$launch$1);
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
            }
        }
        pullOutOfZoneRouterImpl$launch$1 = new PullOutOfZoneRouterImpl$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = pullOutOfZoneRouterImpl$launch$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pullOutOfZoneRouterImpl$launch$1.label;
        zy11 zy11Var2 = zy11.a;
        tit0 tit0Var2 = this.c;
        if (i != 0) {
        }
        zzs B2 = ((pv0) obj2).a.B();
        pullOutOfZoneRouterImpl$launch$1.L$0 = null;
        pullOutOfZoneRouterImpl$launch$1.L$1 = null;
        pullOutOfZoneRouterImpl$launch$1.L$2 = null;
        pullOutOfZoneRouterImpl$launch$1.label = 2;
        this.d.getClass();
        sjh sjhVar2 = uyj.a;
        k0 = tje.k0(o400.a, new PullOutOfZoneRouterImpl$moveToAddress$2(this, B2, null), pullOutOfZoneRouterImpl$launch$1);
        if (k0 != coroutineSingletons) {
        }
    }
}
