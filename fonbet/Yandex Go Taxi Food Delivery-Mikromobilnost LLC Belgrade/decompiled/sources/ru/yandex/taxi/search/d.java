package ru.yandex.taxi.search;

import defpackage.ftj0;
import defpackage.gtj0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.y46;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersonalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1 personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1;
        int i;
        Object ftj0Var;
        if (continuation instanceof PersonalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1) {
            personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1 = (PersonalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1) continuation;
            int i2 = personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pv0 pv0Var = (pv0) obj;
                    String str = pv0Var.b.e;
                    f fVar = this.b;
                    if (str == null || !str.equals("intercity_shuttle")) {
                        ftj0Var = fVar.f.a() ? new ftj0(pv0Var) : new gtj0(pv0Var);
                    } else {
                        fVar.e.getClass();
                        ftj0Var = y46.a(pv0Var) ? new ftj0(pv0Var) : new gtj0(pv0Var);
                    }
                    personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.L$0 = null;
                    personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.L$1 = null;
                    personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.L$2 = null;
                    personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.L$3 = null;
                    personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ftj0Var, personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1 = new PersonalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalAddressSearchInteractor$mapAddressInfo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
