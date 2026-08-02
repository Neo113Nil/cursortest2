package ru.yandex.taxi.masstransit.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.ah00;
import defpackage.b540;
import defpackage.ck;
import defpackage.cmt;
import defpackage.cx30;
import defpackage.d5v0;
import defpackage.e5v0;
import defpackage.ffx;
import defpackage.gh00;
import defpackage.i3y;
import defpackage.i540;
import defpackage.jst;
import defpackage.ny61;
import defpackage.on2;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tu30;
import defpackage.uu30;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.masstransit.promo.b;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;
import ru.yandex.taxi.masstransit.promo.network.MtSummaryCommunicationsApi;

/* loaded from: classes9.dex */
public final class a implements b540 {
    public final tu30 a;
    public final ah00 b;
    public final b c;
    public final i3y d;
    public final n0 e = ffx.c(0, 1, null, 5);
    public final i540 f = new i540(MtSummaryCommunicationsResponse.b);

    static {
        int i = i540.b;
    }

    public a(on2 on2Var, tu30 tu30Var, ah00 ah00Var, b bVar) {
        this.a = tu30Var;
        this.b = ah00Var;
        this.c = bVar;
        this.d = kotlin.a.a(new ck(on2Var, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        if (r1 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, uu30 uu30Var, cx30 cx30Var, MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType, ContinuationImpl continuationImpl) {
        MtSummaryCommunicationsRepositoryImpl$makeRequest$1 mtSummaryCommunicationsRepositoryImpl$makeRequest$1;
        int i;
        Zone zone;
        aVar.getClass();
        if (continuationImpl instanceof MtSummaryCommunicationsRepositoryImpl$makeRequest$1) {
            mtSummaryCommunicationsRepositoryImpl$makeRequest$1 = (MtSummaryCommunicationsRepositoryImpl$makeRequest$1) continuationImpl;
            int i2 = mtSummaryCommunicationsRepositoryImpl$makeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtSummaryCommunicationsRepositoryImpl$makeRequest$1.label = i2 - Integer.MIN_VALUE;
                MtSummaryCommunicationsRepositoryImpl$makeRequest$1 mtSummaryCommunicationsRepositoryImpl$makeRequest$12 = mtSummaryCommunicationsRepositoryImpl$makeRequest$1;
                Object obj = mtSummaryCommunicationsRepositoryImpl$makeRequest$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtSummaryCommunicationsRepositoryImpl$makeRequest$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List a = uu30Var.a();
                    List list = a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    int i3 = 0;
                    for (Object obj3 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        Address address = (Address) obj3;
                        zzs B = address.B();
                        String uri = address.getUri();
                        if (uri == null) {
                            uri = "";
                        }
                        String c2 = address.c2();
                        d5v0 d5v0Var = e5v0.Companion;
                        int size = a.size();
                        d5v0Var.getClass();
                        arrayList.add(new e5v0(B, uri, c2, d5v0.a(i3, size), address.J1(), address.D1()));
                        i3 = i4;
                    }
                    b bVar = aVar.c;
                    zzs b = ((gh00) aVar.b).e.b();
                    ZoneAddress zoneAddress = uu30Var.a;
                    String str = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
                    mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$0 = null;
                    mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$1 = null;
                    mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$2 = null;
                    mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$3 = null;
                    mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$4 = null;
                    mtSummaryCommunicationsRepositoryImpl$makeRequest$12.label = 1;
                    obj = bVar.a(mtScreenType, cx30Var, b, arrayList, str, mtSummaryCommunicationsRepositoryImpl$makeRequest$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$0 = null;
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$1 = null;
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$2 = null;
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$3 = null;
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$4 = null;
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.L$5 = null;
                mtSummaryCommunicationsRepositoryImpl$makeRequest$12.label = 2;
                Object d = aVar.d((MtSummaryCommunicationsParam) obj, mtSummaryCommunicationsRepositoryImpl$makeRequest$12);
                return d != obj2 ? obj2 : d;
            }
        }
        mtSummaryCommunicationsRepositoryImpl$makeRequest$1 = new MtSummaryCommunicationsRepositoryImpl$makeRequest$1(aVar, continuationImpl);
        MtSummaryCommunicationsRepositoryImpl$makeRequest$1 mtSummaryCommunicationsRepositoryImpl$makeRequest$122 = mtSummaryCommunicationsRepositoryImpl$makeRequest$1;
        Object obj4 = mtSummaryCommunicationsRepositoryImpl$makeRequest$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtSummaryCommunicationsRepositoryImpl$makeRequest$122.label;
        if (i != 0) {
        }
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.L$0 = null;
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.L$1 = null;
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.L$2 = null;
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.L$3 = null;
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.L$4 = null;
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.L$5 = null;
        mtSummaryCommunicationsRepositoryImpl$makeRequest$122.label = 2;
        Object d2 = aVar.d((MtSummaryCommunicationsParam) obj4, mtSummaryCommunicationsRepositoryImpl$makeRequest$122);
        if (d2 != obj22) {
        }
    }

    public final g c(MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType, tpr tprVar, cx30 cx30Var) {
        return e.I(e.K(tprVar, e.I(this.e, new MtSummaryCommunicationsRepositoryImpl$communicationsFlow$1(this, null))), new MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2(this, cx30Var, mtScreenType, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MtSummaryCommunicationsParam mtSummaryCommunicationsParam, ContinuationImpl continuationImpl) {
        MtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1 mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1;
        int i;
        try {
            if (continuationImpl instanceof MtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1) {
                mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1 = (MtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1) continuationImpl;
                int i2 = mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<MtSummaryCommunicationsResponse> a = ((MtSummaryCommunicationsApi) this.d.getValue()).a(mtSummaryCommunicationsParam);
                        mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.L$0 = null;
                        mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return new i540((MtSummaryCommunicationsResponse) obj);
                }
            }
            if (i != 0) {
            }
            return new i540((MtSummaryCommunicationsResponse) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error getting summary promotions");
            return this.f;
        }
        mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1 = new MtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1(this, continuationImpl);
        Object obj2 = mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtSummaryCommunicationsRepositoryImpl$requestPromotionsFromNet$1.label;
    }
}
