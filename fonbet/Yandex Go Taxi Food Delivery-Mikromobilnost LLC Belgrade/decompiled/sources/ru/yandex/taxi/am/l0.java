package ru.yandex.taxi.am;

import com.yandex.passport.api.PassportLatLng;
import com.yandex.passport.internal.properties.UpdateableProperties;
import defpackage.hst;
import defpackage.jst;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class l0 implements vpr {
    public final /* synthetic */ m0 a;

    public l0(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Pair pair, Continuation continuation) {
        PassportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1 passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1;
        int i;
        if (continuation instanceof PassportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1) {
            passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1 = (PassportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1) continuation;
            int i2 = passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PassportLatLng passportLatLng = (PassportLatLng) pair.getFirst();
                    Map map = (Map) pair.getSecond();
                    hst hstVar = jst.e;
                    UpdateableProperties.a aVar = new UpdateableProperties.a();
                    aVar.c = scc.h(passportLatLng);
                    aVar.w = map;
                    UpdateableProperties.Companion.getClass();
                    UpdateableProperties a = com.yandex.passport.internal.properties.z.a(aVar);
                    com.yandex.passport.api.b a2 = this.a.e.a();
                    passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.L$0 = null;
                    passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.L$1 = null;
                    passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.L$2 = null;
                    passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.label = 1;
                    if (a2.v(a, passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1 = new PassportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1(this, continuation);
        Object obj2 = passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAnticrisisParamsUpdater$onAppCreated$1$2$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
