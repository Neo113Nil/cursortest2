package ru.yandex.taxi.logistics.sdk.mission_details.interactors;

import defpackage.a0t;
import defpackage.bpc;
import defpackage.dpc;
import defpackage.fpc;
import defpackage.g8e;
import defpackage.ij20;
import defpackage.lj20;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.qj20;
import defpackage.uj20;
import defpackage.w511;
import defpackage.zch;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.d;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.logistics.sdk.mission_details.data.a a;
    public final ij20 b;
    public final com.yandex.delivery.utils.dialogmanager.a c;
    public final zch d;
    public final qj20 e;

    public a(ru.yandex.taxi.logistics.sdk.mission_details.data.a aVar, ij20 ij20Var, com.yandex.delivery.utils.dialogmanager.a aVar2, zch zchVar, qj20 qj20Var) {
        this.a = aVar;
        this.b = ij20Var;
        this.c = aVar2;
        this.d = zchVar;
        this.e = qj20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, uj20 uj20Var, ContinuationImpl continuationImpl) {
        FetchMissionDetailsContentInteractor$fetch$1 fetchMissionDetailsContentInteractor$fetch$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        uj20 uj20Var2;
        fpc fpcVar;
        uj20 uj20Var3;
        if (continuationImpl instanceof FetchMissionDetailsContentInteractor$fetch$1) {
            fetchMissionDetailsContentInteractor$fetch$1 = (FetchMissionDetailsContentInteractor$fetch$1) continuationImpl;
            int i2 = fetchMissionDetailsContentInteractor$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchMissionDetailsContentInteractor$fetch$1.label = i2 - Integer.MIN_VALUE;
                obj = fetchMissionDetailsContentInteractor$fetch$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchMissionDetailsContentInteractor$fetch$1.label;
                if (i != 0) {
                    b.b(obj);
                    d dVar = (d) this.d.a;
                    fetchMissionDetailsContentInteractor$fetch$1.L$0 = str;
                    fetchMissionDetailsContentInteractor$fetch$1.L$1 = uj20Var;
                    fetchMissionDetailsContentInteractor$fetch$1.label = 1;
                    obj = e.A(dVar, fetchMissionDetailsContentInteractor$fetch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uj20Var3 = (uj20) fetchMissionDetailsContentInteractor$fetch$1.L$1;
                            b.b(obj);
                            uj20Var3.a.dismiss();
                            return zy11.a;
                        }
                        uj20Var2 = (uj20) fetchMissionDetailsContentInteractor$fetch$1.L$1;
                        str2 = (String) fetchMissionDetailsContentInteractor$fetch$1.L$0;
                        b.b(obj);
                        fpcVar = (fpc) obj;
                        if (!(fpcVar instanceof dpc)) {
                            lj20 lj20Var = (lj20) ((dpc) fpcVar).a;
                            r0 r0Var = this.e.a;
                            r0Var.getClass();
                            r0Var.m(null, lj20Var);
                            this.b.a.a.o("DeliveryMission.Details.Shown", null, g8e.x("mission_id", str2));
                            return zy11.a;
                        }
                        if (!(fpcVar instanceof bpc)) {
                            w511.b();
                            return null;
                        }
                        fetchMissionDetailsContentInteractor$fetch$1.L$0 = null;
                        fetchMissionDetailsContentInteractor$fetch$1.L$1 = uj20Var2;
                        fetchMissionDetailsContentInteractor$fetch$1.L$2 = null;
                        fetchMissionDetailsContentInteractor$fetch$1.L$3 = null;
                        fetchMissionDetailsContentInteractor$fetch$1.label = 3;
                        if (com.yandex.delivery.utils.dialogmanager.a.e(this.c, (bpc) fpcVar, fetchMissionDetailsContentInteractor$fetch$1) != coroutineSingletons) {
                            uj20Var3 = uj20Var2;
                            uj20Var3.a.dismiss();
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                    uj20Var = (uj20) fetchMissionDetailsContentInteractor$fetch$1.L$1;
                    str = (String) fetchMissionDetailsContentInteractor$fetch$1.L$0;
                    b.b(obj);
                }
                oo0 oo0Var = (oo0) obj;
                a0t a0tVar = oo0Var == null ? oo0Var.f : null;
                fetchMissionDetailsContentInteractor$fetch$1.L$0 = str;
                fetchMissionDetailsContentInteractor$fetch$1.L$1 = uj20Var;
                fetchMissionDetailsContentInteractor$fetch$1.L$2 = null;
                fetchMissionDetailsContentInteractor$fetch$1.label = 2;
                obj = this.a.b(str, a0tVar, fetchMissionDetailsContentInteractor$fetch$1);
                if (obj != coroutineSingletons) {
                    uj20 uj20Var4 = uj20Var;
                    str2 = str;
                    uj20Var2 = uj20Var4;
                    fpcVar = (fpc) obj;
                    if (!(fpcVar instanceof dpc)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        fetchMissionDetailsContentInteractor$fetch$1 = new FetchMissionDetailsContentInteractor$fetch$1(this, continuationImpl);
        obj = fetchMissionDetailsContentInteractor$fetch$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchMissionDetailsContentInteractor$fetch$1.label;
        if (i != 0) {
        }
        oo0 oo0Var2 = (oo0) obj;
        if (oo0Var2 == null) {
        }
        fetchMissionDetailsContentInteractor$fetch$1.L$0 = str;
        fetchMissionDetailsContentInteractor$fetch$1.L$1 = uj20Var;
        fetchMissionDetailsContentInteractor$fetch$1.L$2 = null;
        fetchMissionDetailsContentInteractor$fetch$1.label = 2;
        obj = this.a.b(str, a0tVar, fetchMissionDetailsContentInteractor$fetch$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
