package ru.yandex.taxi.shortcuts.interactors;

import defpackage.d2t;
import defpackage.eci0;
import defpackage.i4v0;
import defpackage.jl40;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o820;
import defpackage.o9j0;
import defpackage.p820;
import defpackage.po21;
import defpackage.pv0;
import defpackage.sxg;
import defpackage.tpr;
import defpackage.y46;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.d;
import ru.yandex.taxi.persuggest.domain.g;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes10.dex */
public final class a {
    public final i a;
    public final y46 b;
    public final po21 c;

    public a(i iVar, y46 y46Var, po21 po21Var) {
        this.a = iVar;
        this.b = y46Var;
        this.c = po21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x014a, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, o820 o820Var, boolean z, ContinuationImpl continuationImpl) {
        DecodeAddressInteractorImpl$decodeAddress$1 decodeAddressInteractorImpl$decodeAddress$1;
        int i;
        String str2;
        Object obj;
        o820 o820Var2;
        zzs zzsVar2;
        boolean z2;
        if (continuationImpl instanceof DecodeAddressInteractorImpl$decodeAddress$1) {
            decodeAddressInteractorImpl$decodeAddress$1 = (DecodeAddressInteractorImpl$decodeAddress$1) continuationImpl;
            int i2 = decodeAddressInteractorImpl$decodeAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                decodeAddressInteractorImpl$decodeAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = decodeAddressInteractorImpl$decodeAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = decodeAddressInteractorImpl$decodeAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    decodeAddressInteractorImpl$decodeAddress$1.L$0 = zzsVar;
                    str2 = str;
                    decodeAddressInteractorImpl$decodeAddress$1.L$1 = str2;
                    decodeAddressInteractorImpl$decodeAddress$1.L$2 = o820Var;
                    decodeAddressInteractorImpl$decodeAddress$1.Z$0 = z;
                    decodeAddressInteractorImpl$decodeAddress$1.label = 1;
                    Object h = ((e) this.c).h(decodeAddressInteractorImpl$decodeAddress$1);
                    if (h != coroutineSingletons) {
                        obj = h;
                        o820Var2 = o820Var;
                        zzsVar2 = zzsVar;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    pv0 pv0Var = (pv0) obj2;
                    this.b.getClass();
                    return new sxg(pv0Var, y46.a(pv0Var));
                }
                boolean z3 = decodeAddressInteractorImpl$decodeAddress$1.Z$0;
                o820Var2 = (o820) decodeAddressInteractorImpl$decodeAddress$1.L$2;
                String str3 = (String) decodeAddressInteractorImpl$decodeAddress$1.L$1;
                zzs zzsVar3 = (zzs) decodeAddressInteractorImpl$decodeAddress$1.L$0;
                kotlin.b.b(obj2);
                obj = obj2;
                z2 = z3;
                str2 = str3;
                zzsVar2 = zzsVar3;
                RoutePointType routePointType = RoutePointType.POINT_B;
                i4v0 i4v0Var = i4v0.j;
                zzs a = ((mo21) obj).a();
                if (o820Var2 != null || (r8 = o820Var2.d) == null) {
                    String str4 = "shortcut";
                }
                i4v0 i4v0Var2 = new i4v0(str4, a, null, null, null, null, null, false, false, 508);
                i iVar = this.a;
                g gVar = iVar.e;
                String m = iVar.b.m();
                gVar.f.getClass();
                boolean z4 = z2;
                d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar2, null, false, false, null, null, !jl40.l(routePointType.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null, null, null, null, 3964), new p820(zzsVar2, "shortcut", m, routePointType, gVar.e.d(), null, o820Var2, null, null, z4, 1888));
                gVar.a.a(routePointType.getType(), str2);
                eci0 b = gVar.b(d2tVar, i4v0Var2);
                gVar.a(b, d2tVar);
                tpr s = iVar.s(new d(b));
                decodeAddressInteractorImpl$decodeAddress$1.L$0 = null;
                decodeAddressInteractorImpl$decodeAddress$1.L$1 = null;
                decodeAddressInteractorImpl$decodeAddress$1.L$2 = null;
                decodeAddressInteractorImpl$decodeAddress$1.L$3 = null;
                decodeAddressInteractorImpl$decodeAddress$1.Z$0 = z4;
                decodeAddressInteractorImpl$decodeAddress$1.label = 2;
                obj2 = kotlinx.coroutines.flow.e.y(s, decodeAddressInteractorImpl$decodeAddress$1);
            }
        }
        decodeAddressInteractorImpl$decodeAddress$1 = new DecodeAddressInteractorImpl$decodeAddress$1(this, continuationImpl);
        Object obj22 = decodeAddressInteractorImpl$decodeAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = decodeAddressInteractorImpl$decodeAddress$1.label;
        if (i != 0) {
        }
        RoutePointType routePointType2 = RoutePointType.POINT_B;
        i4v0 i4v0Var3 = i4v0.j;
        zzs a2 = ((mo21) obj).a();
        if (o820Var2 != null) {
        }
        String str42 = "shortcut";
        i4v0 i4v0Var22 = new i4v0(str42, a2, null, null, null, null, null, false, false, 508);
        i iVar2 = this.a;
        g gVar2 = iVar2.e;
        String m2 = iVar2.b.m();
        gVar2.f.getClass();
        boolean z42 = z2;
        d2t d2tVar2 = new d2t(new o9j0(routePointType2, zzsVar2, null, false, false, null, null, !jl40.l(routePointType2.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null, null, null, null, 3964), new p820(zzsVar2, "shortcut", m2, routePointType2, gVar2.e.d(), null, o820Var2, null, null, z42, 1888));
        gVar2.a.a(routePointType2.getType(), str2);
        eci0 b2 = gVar2.b(d2tVar2, i4v0Var22);
        gVar2.a(b2, d2tVar2);
        tpr s2 = iVar2.s(new d(b2));
        decodeAddressInteractorImpl$decodeAddress$1.L$0 = null;
        decodeAddressInteractorImpl$decodeAddress$1.L$1 = null;
        decodeAddressInteractorImpl$decodeAddress$1.L$2 = null;
        decodeAddressInteractorImpl$decodeAddress$1.L$3 = null;
        decodeAddressInteractorImpl$decodeAddress$1.Z$0 = z42;
        decodeAddressInteractorImpl$decodeAddress$1.label = 2;
        obj22 = kotlinx.coroutines.flow.e.y(s2, decodeAddressInteractorImpl$decodeAddress$1);
    }
}
