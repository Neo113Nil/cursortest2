package ru.yandex.taxi.masstransit.experiment;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.hst;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tu30;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final com.yandex.go.zone.interactors.b a;
    public final po21 b;
    public final com.yandex.go.zone.repository.o c;
    public final tu30 d;

    public a(com.yandex.go.zone.interactors.b bVar, po21 po21Var, com.yandex.go.zone.repository.o oVar, tu30 tu30Var) {
        this.a = bVar;
        this.b = po21Var;
        this.c = oVar;
        this.d = tu30Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(3:22|23|24))(6:27|28|29|15|16|17))(7:30|31|(5:33|(2:35|(1:37))|38|(6:40|(1:42)|29|15|16|17)(2:43|(1:45)(2:46|24))|26)|47|38|(0)(0)|26)))|61|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r9 != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        r9 = defpackage.jst.e;
        r0 = r9.b.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r8 = r8.c.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        if (r8 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        r6 = r8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
    
        r0.a(15, "MtUniversalCheckoutExp", r0, defpackage.g8e.o("fetchZoneOrGetCache: failed, fallback zone=", r6), r9.a);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[Catch: Exception -> 0x0033, CancellationException -> 0x00d7, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00d7, Exception -> 0x0033, blocks: (B:13:0x002e, B:14:0x00a6, B:15:0x00a8, B:23:0x0046, B:24:0x0097, B:28:0x004e, B:29:0x0080, B:31:0x0057, B:33:0x0061, B:35:0x0069, B:37:0x006d, B:40:0x0075, B:43:0x0083), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[Catch: Exception -> 0x0033, CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, Exception -> 0x0033, blocks: (B:13:0x002e, B:14:0x00a6, B:15:0x00a8, B:23:0x0046, B:24:0x0097, B:28:0x004e, B:29:0x0080, B:31:0x0057, B:33:0x0061, B:35:0x0069, B:37:0x006d, B:40:0x0075, B:43:0x0083), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MtCheckoutZoneFetcher$fetchZoneOrGetCache$1 mtCheckoutZoneFetcher$fetchZoneOrGetCache$1;
        int i;
        String str;
        com.yandex.go.zone.interactors.b bVar;
        if (continuationImpl instanceof MtCheckoutZoneFetcher$fetchZoneOrGetCache$1) {
            mtCheckoutZoneFetcher$fetchZoneOrGetCache$1 = (MtCheckoutZoneFetcher$fetchZoneOrGetCache$1) continuationImpl;
            int i2 = mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hst hstVar = jst.e;
                    ZoneAddress zoneAddress = this.d.a().a;
                    if (zoneAddress != null) {
                        str = zoneAddress.a.getZoneName();
                        if (str == null) {
                            Zone zone = zoneAddress.b;
                            if (zone != null) {
                                str = zone.a;
                            }
                        }
                        com.yandex.go.zone.interactors.b bVar2 = this.a;
                        if (str == null) {
                            mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                            mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label = 1;
                            obj = bVar2.a(str, mtCheckoutZoneFetcher$fetchZoneOrGetCache$1);
                            if (obj == coroutineSingletons) {
                            }
                            hst hstVar2 = jst.e;
                            return zy11.a;
                        }
                        po21 po21Var = this.b;
                        mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                        mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$1 = bVar2;
                        mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label = 2;
                        Object h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(mtCheckoutZoneFetcher$fetchZoneOrGetCache$1);
                        if (h != coroutineSingletons) {
                            bVar = bVar2;
                            obj = h;
                            mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                            mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$1 = null;
                            mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label = 3;
                            obj = bVar.c((mo21) obj, mtCheckoutZoneFetcher$fetchZoneOrGetCache$1);
                        }
                        return coroutineSingletons;
                    }
                    str = null;
                    com.yandex.go.zone.interactors.b bVar22 = this.a;
                    if (str == null) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    hst hstVar22 = jst.e;
                    return zy11.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    hst hstVar222 = jst.e;
                    return zy11.a;
                }
                bVar = (com.yandex.go.zone.interactors.b) mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$1;
                kotlin.b.b(obj);
                mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.L$1 = null;
                mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label = 3;
                obj = bVar.c((mo21) obj, mtCheckoutZoneFetcher$fetchZoneOrGetCache$1);
            }
        }
        mtCheckoutZoneFetcher$fetchZoneOrGetCache$1 = new MtCheckoutZoneFetcher$fetchZoneOrGetCache$1(this, continuationImpl);
        Object obj2 = mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCheckoutZoneFetcher$fetchZoneOrGetCache$1.label;
        String str22 = null;
        if (i != 0) {
        }
    }
}
