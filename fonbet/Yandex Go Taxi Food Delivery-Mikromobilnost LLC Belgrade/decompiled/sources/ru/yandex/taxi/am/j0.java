package ru.yandex.taxi.am;

import defpackage.gw00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class j0 implements vpr {
    public final /* synthetic */ vpr a;

    public j0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PassportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1 passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PassportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1) {
            passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1 = (PassportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1) continuation;
            int i2 = passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    Map e = list != null ? gw00.e(new Pair("product_country_iso", list.toArray(new String[0]))) : kotlin.collections.b.f();
                    passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.L$0 = null;
                    passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.L$1 = null;
                    passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.L$2 = null;
                    passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.L$3 = null;
                    passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(e, passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1 = new PassportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAnticrisisParamsUpdater$createVpnBlockerAdditionalParamsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
