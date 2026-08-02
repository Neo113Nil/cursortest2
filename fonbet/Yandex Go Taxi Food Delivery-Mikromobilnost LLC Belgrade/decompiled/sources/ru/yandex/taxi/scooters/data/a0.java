package ru.yandex.taxi.scooters.data;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.cmt;
import defpackage.eko0;
import defpackage.i4n0;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a0 {
    public final ScootersSlowdownApi a;
    public final a b;

    public a0(ScootersSlowdownApi scootersSlowdownApi, a aVar) {
        this.a = scootersSlowdownApi;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r7, null, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ScootersSlowdown.Reason reason, ContinuationImpl continuationImpl) {
        ScootersSlowdownRequestRepository$cancelSlowdown$1 scootersSlowdownRequestRepository$cancelSlowdown$1;
        int i;
        ScootersSlowdownApi scootersSlowdownApi;
        if (continuationImpl instanceof ScootersSlowdownRequestRepository$cancelSlowdown$1) {
            scootersSlowdownRequestRepository$cancelSlowdown$1 = (ScootersSlowdownRequestRepository$cancelSlowdown$1) continuationImpl;
            int i2 = scootersSlowdownRequestRepository$cancelSlowdown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSlowdownRequestRepository$cancelSlowdown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSlowdownRequestRepository$cancelSlowdown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSlowdownRequestRepository$cancelSlowdown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSlowdownRequestRepository$cancelSlowdown$1.L$0 = str;
                    scootersSlowdownRequestRepository$cancelSlowdown$1.L$1 = reason;
                    ScootersSlowdownApi scootersSlowdownApi2 = this.a;
                    scootersSlowdownRequestRepository$cancelSlowdown$1.L$2 = scootersSlowdownApi2;
                    scootersSlowdownRequestRepository$cancelSlowdown$1.label = 1;
                    Object a = this.b.a(false, scootersSlowdownRequestRepository$cancelSlowdown$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersSlowdownApi = scootersSlowdownApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                scootersSlowdownApi = (ScootersSlowdownApi) scootersSlowdownRequestRepository$cancelSlowdown$1.L$2;
                reason = (ScootersSlowdown.Reason) scootersSlowdownRequestRepository$cancelSlowdown$1.L$1;
                str = (String) scootersSlowdownRequestRepository$cancelSlowdown$1.L$0;
                kotlin.b.b(obj);
                cmt<zy11> a2 = scootersSlowdownApi.a((Map) obj, new i4n0(str, reason.getReasonName()));
                scootersSlowdownRequestRepository$cancelSlowdown$1.L$0 = null;
                scootersSlowdownRequestRepository$cancelSlowdown$1.L$1 = null;
                scootersSlowdownRequestRepository$cancelSlowdown$1.L$2 = null;
                scootersSlowdownRequestRepository$cancelSlowdown$1.label = 2;
            }
        }
        scootersSlowdownRequestRepository$cancelSlowdown$1 = new ScootersSlowdownRequestRepository$cancelSlowdown$1(this, continuationImpl);
        Object obj2 = scootersSlowdownRequestRepository$cancelSlowdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSlowdownRequestRepository$cancelSlowdown$1.label;
        if (i != 0) {
        }
        cmt<zy11> a22 = scootersSlowdownApi.a((Map) obj2, new i4n0(str, reason.getReasonName()));
        scootersSlowdownRequestRepository$cancelSlowdown$1.L$0 = null;
        scootersSlowdownRequestRepository$cancelSlowdown$1.L$1 = null;
        scootersSlowdownRequestRepository$cancelSlowdown$1.L$2 = null;
        scootersSlowdownRequestRepository$cancelSlowdown$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r7, null, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ScootersSlowdown.Reason reason, int i, ContinuationImpl continuationImpl) {
        ScootersSlowdownRequestRepository$planSlowdown$1 scootersSlowdownRequestRepository$planSlowdown$1;
        int i2;
        ScootersSlowdownApi scootersSlowdownApi;
        if (continuationImpl instanceof ScootersSlowdownRequestRepository$planSlowdown$1) {
            scootersSlowdownRequestRepository$planSlowdown$1 = (ScootersSlowdownRequestRepository$planSlowdown$1) continuationImpl;
            int i3 = scootersSlowdownRequestRepository$planSlowdown$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersSlowdownRequestRepository$planSlowdown$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersSlowdownRequestRepository$planSlowdown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersSlowdownRequestRepository$planSlowdown$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    scootersSlowdownRequestRepository$planSlowdown$1.L$0 = str;
                    scootersSlowdownRequestRepository$planSlowdown$1.L$1 = reason;
                    ScootersSlowdownApi scootersSlowdownApi2 = this.a;
                    scootersSlowdownRequestRepository$planSlowdown$1.L$2 = scootersSlowdownApi2;
                    scootersSlowdownRequestRepository$planSlowdown$1.I$0 = i;
                    scootersSlowdownRequestRepository$planSlowdown$1.label = 1;
                    Object a = this.b.a(false, scootersSlowdownRequestRepository$planSlowdown$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersSlowdownApi = scootersSlowdownApi2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                i = scootersSlowdownRequestRepository$planSlowdown$1.I$0;
                scootersSlowdownApi = (ScootersSlowdownApi) scootersSlowdownRequestRepository$planSlowdown$1.L$2;
                reason = (ScootersSlowdown.Reason) scootersSlowdownRequestRepository$planSlowdown$1.L$1;
                str = (String) scootersSlowdownRequestRepository$planSlowdown$1.L$0;
                kotlin.b.b(obj);
                cmt<zy11> b = scootersSlowdownApi.b((Map) obj, new eko0(str, reason.getReasonName(), i));
                scootersSlowdownRequestRepository$planSlowdown$1.L$0 = null;
                scootersSlowdownRequestRepository$planSlowdown$1.L$1 = null;
                scootersSlowdownRequestRepository$planSlowdown$1.L$2 = null;
                scootersSlowdownRequestRepository$planSlowdown$1.I$0 = i;
                scootersSlowdownRequestRepository$planSlowdown$1.label = 2;
            }
        }
        scootersSlowdownRequestRepository$planSlowdown$1 = new ScootersSlowdownRequestRepository$planSlowdown$1(this, continuationImpl);
        Object obj2 = scootersSlowdownRequestRepository$planSlowdown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersSlowdownRequestRepository$planSlowdown$1.label;
        if (i2 != 0) {
        }
        cmt<zy11> b2 = scootersSlowdownApi.b((Map) obj2, new eko0(str, reason.getReasonName(), i));
        scootersSlowdownRequestRepository$planSlowdown$1.L$0 = null;
        scootersSlowdownRequestRepository$planSlowdown$1.L$1 = null;
        scootersSlowdownRequestRepository$planSlowdown$1.L$2 = null;
        scootersSlowdownRequestRepository$planSlowdown$1.I$0 = i;
        scootersSlowdownRequestRepository$planSlowdown$1.label = 2;
    }
}
