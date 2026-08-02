package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.kme;
import defpackage.nme;
import defpackage.ny61;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ControlAction;

/* loaded from: classes6.dex */
public final class b {
    public final ScootersControlApi a;
    public final a b;

    public b(ScootersControlApi scootersControlApi, a aVar) {
        this.a = scootersControlApi;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ControlAction controlAction, ContinuationImpl continuationImpl) {
        ScootersControlRepository$control$1 scootersControlRepository$control$1;
        int i;
        Object obj;
        ScootersControlApi scootersControlApi;
        ControlAction controlAction2;
        Boolean bool;
        if (continuationImpl instanceof ScootersControlRepository$control$1) {
            scootersControlRepository$control$1 = (ScootersControlRepository$control$1) continuationImpl;
            int i2 = scootersControlRepository$control$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersControlRepository$control$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersControlRepository$control$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersControlRepository$control$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    scootersControlRepository$control$1.L$0 = str;
                    scootersControlRepository$control$1.L$1 = null;
                    scootersControlRepository$control$1.L$2 = controlAction;
                    ScootersControlApi scootersControlApi2 = this.a;
                    scootersControlRepository$control$1.L$3 = scootersControlApi2;
                    scootersControlRepository$control$1.label = 1;
                    Object a = this.b.a(false, scootersControlRepository$control$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersControlApi = scootersControlApi2;
                        controlAction2 = controlAction;
                        bool = null;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                scootersControlApi = (ScootersControlApi) scootersControlRepository$control$1.L$3;
                ControlAction controlAction3 = (ControlAction) scootersControlRepository$control$1.L$2;
                Boolean bool2 = (Boolean) scootersControlRepository$control$1.L$1;
                String str2 = (String) scootersControlRepository$control$1.L$0;
                kotlin.b.b(obj2);
                bool = bool2;
                str = str2;
                obj = obj2;
                controlAction2 = controlAction3;
                cmt<nme> a2 = scootersControlApi.a((Map) obj, new kme(controlAction2, str, bool));
                scootersControlRepository$control$1.L$0 = null;
                scootersControlRepository$control$1.L$1 = null;
                scootersControlRepository$control$1.L$2 = null;
                scootersControlRepository$control$1.L$3 = null;
                scootersControlRepository$control$1.label = 2;
                Object d = ru.yandex.taxi.network.api.a.d(a2, scootersControlRepository$control$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        scootersControlRepository$control$1 = new ScootersControlRepository$control$1(this, continuationImpl);
        Object obj22 = scootersControlRepository$control$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersControlRepository$control$1.label;
        if (i != 0) {
        }
        cmt<nme> a22 = scootersControlApi.a((Map) obj, new kme(controlAction2, str, bool));
        scootersControlRepository$control$1.L$0 = null;
        scootersControlRepository$control$1.L$1 = null;
        scootersControlRepository$control$1.L$2 = null;
        scootersControlRepository$control$1.L$3 = null;
        scootersControlRepository$control$1.label = 2;
        Object d2 = ru.yandex.taxi.network.api.a.d(a22, scootersControlRepository$control$1);
        if (d2 != coroutineSingletons2) {
        }
    }
}
