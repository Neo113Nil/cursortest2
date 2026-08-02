package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import com.yandex.delivery.mapper.model.PointType;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.an2;
import defpackage.b2a0;
import defpackage.csb1;
import defpackage.d1j;
import defpackage.e1j;
import defpackage.f6i;
import defpackage.g6i;
import defpackage.go2;
import defpackage.h3y;
import defpackage.h6i;
import defpackage.ho2;
import defpackage.i6i;
import defpackage.io2;
import defpackage.j6i;
import defpackage.k1a0;
import defpackage.k6i;
import defpackage.kme0;
import defpackage.lb7;
import defpackage.m6i;
import defpackage.n6i;
import defpackage.nvd0;
import defpackage.ny61;
import defpackage.o6i;
import defpackage.ovd0;
import defpackage.p1a0;
import defpackage.ps50;
import defpackage.qt70;
import defpackage.qu70;
import defpackage.rzh;
import defpackage.s9e;
import defpackage.scc;
import defpackage.szh;
import defpackage.tcc;
import defpackage.tzh;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.delivery.create.OrderDraftApi;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2DraftRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2DraftResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CostCenterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PaymentInfoComplementDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PaymentInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest.AdditionalDeliveryDescriptionForCreationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest.DraftPointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft.DeliveryDraftRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft.Responses$DeliveryDraftResponseDto;
import ru.yandex.taxi.logistics.sdk.management.k;

/* loaded from: classes9.dex */
public final class e {
    public final lb7 a;
    public final k b;
    public final ru.yandex.taxi.logistics.sdk.management.storage.e c;
    public final qu70 d;

    public e(lb7 lb7Var, k kVar, ru.yandex.taxi.logistics.sdk.management.storage.e eVar, qu70 qu70Var) {
        this.a = lb7Var;
        this.b = kVar;
        this.c = eVar;
        this.d = qu70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0454, code lost:
    
        if (b(r1, r2) == r3) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0427 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0454 -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0421 -> B:73:0x0392). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f6i f6iVar, String str, ContinuationImpl continuationImpl) {
        DraftTask$execute$1 draftTask$execute$1;
        int i;
        f6i f6iVar2;
        String str2;
        tzh tzhVar;
        Object obj;
        String str3;
        Iterator it;
        int i2;
        int i3;
        Iterator it2;
        int i4;
        tzh tzhVar2;
        f6i f6iVar3;
        int i5;
        String str4;
        io2 io2Var;
        String str5;
        an2 b;
        Object c;
        ArrayList arrayList;
        PointTypeDto pointTypeDto;
        if (continuationImpl instanceof DraftTask$execute$1) {
            draftTask$execute$1 = (DraftTask$execute$1) continuationImpl;
            int i6 = draftTask$execute$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                draftTask$execute$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = draftTask$execute$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = draftTask$execute$1.label;
                ru.yandex.taxi.logistics.sdk.management.storage.e eVar = this.c;
                int i7 = 3;
                int i8 = 2;
                int i9 = 1;
                String str6 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6iVar2 = f6iVar;
                    str2 = str;
                    lb7 lb7Var = this.a;
                    qt70 qt70Var = (qt70) lb7Var.c;
                    h3y h3yVar = (h3y) lb7Var.b;
                    if (f6iVar2 instanceof n6i) {
                    }
                    draftTask$execute$1.L$0 = f6iVar2;
                    draftTask$execute$1.L$1 = str5;
                    draftTask$execute$1.L$2 = null;
                    draftTask$execute$1.L$3 = null;
                    i5 = 1;
                    draftTask$execute$1.label = 1;
                    c = ((ru.yandex.taxi.logistics.sdk.network.b) b).c((r9 & 1) != 0 ? Integer.MAX_VALUE : 3, 10000L, MapiClientImpl.RETRIES_TIME_MILLIS, draftTask$execute$1);
                    if (c != obj3) {
                    }
                    return obj3;
                }
                if (i == 1) {
                    str4 = (String) draftTask$execute$1.L$1;
                    f6iVar3 = (f6i) draftTask$execute$1.L$0;
                    kotlin.b.b(obj2);
                    i5 = 1;
                    io2Var = (io2) obj2;
                    if (io2Var instanceof ho2) {
                    }
                } else if (i == 2) {
                    int i10 = draftTask$execute$1.I$1;
                    int i11 = draftTask$execute$1.I$0;
                    str3 = (String) draftTask$execute$1.L$10;
                    Iterator it3 = (Iterator) draftTask$execute$1.L$7;
                    tzhVar = (tzh) draftTask$execute$1.L$4;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    i2 = i10;
                    i3 = i11;
                    it = it3;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    if (!it2.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = (String) draftTask$execute$1.L$1;
                        f6iVar3 = (f6i) draftTask$execute$1.L$0;
                        kotlin.b.b(obj2);
                        char c2 = 4;
                        String str7 = null;
                        int i12 = 3;
                        i5 = 1;
                        int i13 = 2;
                        str2 = str4;
                        f6iVar2 = f6iVar3;
                        str6 = str7;
                        i8 = i13;
                        i9 = i5;
                        i7 = i12;
                        lb7 lb7Var2 = this.a;
                        qt70 qt70Var2 = (qt70) lb7Var2.c;
                        h3y h3yVar2 = (h3y) lb7Var2.b;
                        if (f6iVar2 instanceof n6i) {
                            OrderDraftApi orderDraftApi = (OrderDraftApi) h3yVar2.get();
                            n6i n6iVar = (n6i) f6iVar2;
                            qt70Var2.getClass();
                            String d = n6iVar.d();
                            List<k6i> f = n6iVar.f();
                            String str8 = str6;
                            ArrayList arrayList2 = new ArrayList(tcc.n(f, 10));
                            for (k6i k6iVar : f) {
                                ovd0 ovd0Var = qt70Var2.a;
                                PointType l = k6iVar.l();
                                ovd0Var.getClass();
                                int i14 = nvd0.b[l.ordinal()];
                                if (i14 == i9) {
                                    pointTypeDto = PointTypeDto.DESTINATION;
                                } else if (i14 == i8) {
                                    pointTypeDto = PointTypeDto.RETURN;
                                } else if (i14 == i7) {
                                    pointTypeDto = PointTypeDto.SOURCE;
                                } else {
                                    if (i14 != 4) {
                                        w511.b();
                                        return str8;
                                    }
                                    pointTypeDto = PointTypeDto.SOURCE;
                                }
                                PointTypeDto pointTypeDto2 = pointTypeDto;
                                String m = k6iVar.m();
                                List g = scc.g(Double.valueOf(k6iVar.e().b()), Double.valueOf(k6iVar.e().a()));
                                String h = k6iVar.h();
                                String k = k6iVar.k();
                                String a = k6iVar.a();
                                String f2 = k6iVar.f();
                                String g2 = k6iVar.g();
                                String j = k6iVar.j();
                                String b2 = k6iVar.b();
                                s9e d2 = k6iVar.d();
                                ContactDto contactDto = d2 != null ? new ContactDto(d2.a(), d2.b()) : str8;
                                String c3 = k6iVar.c();
                                List<m6i> i15 = k6iVar.i();
                                ArrayList arrayList3 = new ArrayList(tcc.n(i15, 10));
                                for (m6i m6iVar : i15) {
                                    arrayList3.add(new PhotoInfoDto(m6iVar.b(), m6iVar.a()));
                                }
                                arrayList2.add(new DraftPointDto(pointTypeDto2, m, g, h, k, a, f2, g2, j, b2, contactDto, c3, arrayList3));
                                i7 = 3;
                                i8 = 2;
                                i9 = 1;
                            }
                            String b3 = n6iVar.b();
                            b2a0 b2a0Var = qt70Var2.b;
                            p1a0 e = n6iVar.e();
                            b2a0Var.getClass();
                            String b4 = e.b();
                            String c4 = e.c();
                            List<k1a0> a2 = e.a();
                            ArrayList arrayList4 = new ArrayList(tcc.n(a2, 10));
                            for (k1a0 k1a0Var : a2) {
                                arrayList4.add(new PaymentInfoComplementDto(k1a0Var.b(), k1a0Var.a()));
                            }
                            PaymentInfoDto paymentInfoDto = new PaymentInfoDto(c4, b4, str8, arrayList4);
                            List c5 = n6iVar.c();
                            if (c5 != null) {
                                List<j6i> list = c5;
                                ArrayList arrayList5 = new ArrayList(tcc.n(list, 10));
                                for (j6i j6iVar : list) {
                                    arrayList5.add(new CostCenterDto(j6iVar.b(), j6iVar.a(), j6iVar.c()));
                                }
                                arrayList = arrayList5;
                            } else {
                                arrayList = null;
                            }
                            b = orderDraftApi.a(new DeliveryDraftRequestDto(d, new AdditionalDeliveryDescriptionForCreationDto(paymentInfoDto, arrayList, arrayList2, b3, null, null, null, null, null, null, null, null, n6iVar.g().c())));
                            str5 = str2;
                        } else {
                            if (!(f6iVar2 instanceof o6i)) {
                                w511.b();
                                return null;
                            }
                            OrderDraftApi orderDraftApi2 = (OrderDraftApi) h3yVar2.get();
                            o6i o6iVar = (o6i) f6iVar2;
                            qt70Var2.getClass();
                            List a3 = o6iVar.a();
                            ArrayList arrayList6 = new ArrayList(tcc.n(a3, 10));
                            Iterator it4 = a3.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new V2DraftRequestDto.OffersDto((String) it4.next()));
                            }
                            V2DraftRequestDto v2DraftRequestDto = new V2DraftRequestDto(arrayList6, o6iVar.d(), o6iVar.b(), o6iVar.c(), o6iVar.e().c(), str2);
                            str5 = str2;
                            b = orderDraftApi2.b(v2DraftRequestDto);
                        }
                        draftTask$execute$1.L$0 = f6iVar2;
                        draftTask$execute$1.L$1 = str5;
                        draftTask$execute$1.L$2 = null;
                        draftTask$execute$1.L$3 = null;
                        i5 = 1;
                        draftTask$execute$1.label = 1;
                        c = ((ru.yandex.taxi.logistics.sdk.network.b) b).c((r9 & 1) != 0 ? Integer.MAX_VALUE : 3, 10000L, MapiClientImpl.RETRIES_TIME_MILLIS, draftTask$execute$1);
                        if (c != obj3) {
                            f6iVar3 = f6iVar2;
                            obj2 = c;
                            str4 = str5;
                            io2Var = (io2) obj2;
                            if (io2Var instanceof ho2) {
                                str7 = null;
                                i13 = 2;
                                i12 = 3;
                                if (!(io2Var instanceof go2)) {
                                    w511.b();
                                    return null;
                                }
                                ps50 ps50Var = ((go2) io2Var).a;
                                draftTask$execute$1.L$0 = f6iVar3;
                                draftTask$execute$1.L$1 = str4;
                                draftTask$execute$1.L$2 = null;
                                draftTask$execute$1.L$3 = null;
                                c2 = 4;
                                draftTask$execute$1.label = 4;
                            } else {
                                Object obj4 = ((ho2) io2Var).a;
                                this.d.getClass();
                                Object h6iVar = obj4 instanceof Responses$DeliveryDraftResponseDto ? new h6i(((Responses$DeliveryDraftResponseDto) obj4).getDeliveryId()) : obj4 instanceof V2DraftResponseDto ? new i6i(((V2DraftResponseDto) obj4).getDeliveryIds()) : g6i.a;
                                if (h6iVar instanceof g6i) {
                                    throw new UnknownResponseException(obj4);
                                }
                                if (h6iVar instanceof h6i) {
                                    tzhVar2 = new rzh(Collections.singletonList(((h6i) h6iVar).a()), 0);
                                } else {
                                    if (!(h6iVar instanceof i6i)) {
                                        w511.b();
                                        return null;
                                    }
                                    tzhVar2 = new szh(((i6i) h6iVar).a());
                                }
                                List a4 = tzhVar2.a();
                                if (f6iVar3.a().size() != a4.size() || a4.isEmpty()) {
                                    throw new DraftInconsistentResponseException();
                                }
                                it2 = kotlin.collections.a.P0(f6iVar3.a(), a4).iterator();
                                i4 = 0;
                                if (!it2.hasNext()) {
                                    Pair pair = (Pair) it2.next();
                                    String str9 = (String) pair.getFirst();
                                    str3 = (String) pair.getSecond();
                                    draftTask$execute$1.L$0 = null;
                                    draftTask$execute$1.L$1 = null;
                                    draftTask$execute$1.L$2 = null;
                                    draftTask$execute$1.L$3 = null;
                                    draftTask$execute$1.L$4 = tzhVar2;
                                    draftTask$execute$1.L$5 = null;
                                    draftTask$execute$1.L$6 = null;
                                    draftTask$execute$1.L$7 = it2;
                                    draftTask$execute$1.L$8 = null;
                                    draftTask$execute$1.L$9 = null;
                                    draftTask$execute$1.L$10 = str3;
                                    draftTask$execute$1.I$0 = i4;
                                    draftTask$execute$1.I$1 = 0;
                                    draftTask$execute$1.label = 2;
                                    eVar.getClass();
                                    obj = kotlinx.coroutines.flow.e.y(new e1j(d1j.a(ru.yandex.taxi.logistics.sdk.management.storage.e.b, eVar.a).getData(), new kme0(str9), 0), draftTask$execute$1);
                                    if (obj != obj3) {
                                        tzhVar = tzhVar2;
                                        i3 = i4;
                                        it = it2;
                                        i2 = 0;
                                        if (((Boolean) obj).booleanValue()) {
                                            it2 = it;
                                            i4 = i3;
                                            tzhVar2 = tzhVar;
                                        } else {
                                            draftTask$execute$1.L$0 = null;
                                            draftTask$execute$1.L$1 = null;
                                            draftTask$execute$1.L$2 = null;
                                            draftTask$execute$1.L$3 = null;
                                            draftTask$execute$1.L$4 = tzhVar;
                                            draftTask$execute$1.L$5 = null;
                                            draftTask$execute$1.L$6 = null;
                                            draftTask$execute$1.L$7 = it;
                                            draftTask$execute$1.L$8 = null;
                                            draftTask$execute$1.L$9 = null;
                                            draftTask$execute$1.L$10 = null;
                                            draftTask$execute$1.I$0 = i3;
                                            draftTask$execute$1.I$1 = i2;
                                            draftTask$execute$1.label = 3;
                                            if (eVar.b(str3, draftTask$execute$1) != obj3) {
                                                it2 = it;
                                                i4 = i3;
                                                tzhVar2 = tzhVar;
                                            }
                                        }
                                        if (!it2.hasNext()) {
                                            return tzhVar2;
                                        }
                                    }
                                }
                            }
                        }
                        return obj3;
                    }
                    int i16 = draftTask$execute$1.I$0;
                    Iterator it5 = (Iterator) draftTask$execute$1.L$7;
                    tzh tzhVar3 = (tzh) draftTask$execute$1.L$4;
                    kotlin.b.b(obj2);
                    it2 = it5;
                    i4 = i16;
                    tzhVar2 = tzhVar3;
                    if (!it2.hasNext()) {
                    }
                }
            }
        }
        draftTask$execute$1 = new DraftTask$execute$1(this, continuationImpl);
        Object obj22 = draftTask$execute$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = draftTask$execute$1.label;
        ru.yandex.taxi.logistics.sdk.management.storage.e eVar2 = this.c;
        int i72 = 3;
        int i82 = 2;
        int i92 = 1;
        String str62 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ps50 ps50Var, ContinuationImpl continuationImpl) {
        DraftTask$throwIfRetryNoNeed$1 draftTask$throwIfRetryNoNeed$1;
        Object obj;
        int i;
        if (continuationImpl instanceof DraftTask$throwIfRetryNoNeed$1) {
            draftTask$throwIfRetryNoNeed$1 = (DraftTask$throwIfRetryNoNeed$1) continuationImpl;
            int i2 = draftTask$throwIfRetryNoNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                draftTask$throwIfRetryNoNeed$1.label = i2 - Integer.MIN_VALUE;
                obj = draftTask$throwIfRetryNoNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = draftTask$throwIfRetryNoNeed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (csb1.f(ps50Var)) {
                        throw new ServerRejectDraftException(ps50Var);
                    }
                    draftTask$throwIfRetryNoNeed$1.L$0 = null;
                    draftTask$throwIfRetryNoNeed$1.label = 1;
                    obj = this.b.a(draftTask$throwIfRetryNoNeed$1);
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
                if (((Boolean) obj).booleanValue()) {
                    throw new UserCanceledRetryOfDraft();
                }
                return zy11.a;
            }
        }
        draftTask$throwIfRetryNoNeed$1 = new DraftTask$throwIfRetryNoNeed$1(this, continuationImpl);
        obj = draftTask$throwIfRetryNoNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = draftTask$throwIfRetryNoNeed$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
