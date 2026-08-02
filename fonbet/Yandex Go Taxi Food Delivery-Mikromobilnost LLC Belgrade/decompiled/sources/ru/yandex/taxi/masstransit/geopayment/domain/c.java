package ru.yandex.taxi.masstransit.geopayment.domain;

import com.yandex.go.masstransit.sdk.ble.api.model.BleTransportType;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.fd30;
import defpackage.gvu0;
import defpackage.i0z;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.pa11;
import defpackage.qcx;
import defpackage.s8o;
import defpackage.sbx;
import defpackage.sl30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.u26;
import defpackage.w511;
import defpackage.xby;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.geopayment.ble.MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;
import ru.yandex.taxi.masstransit.geopayment.repository.d;

/* loaded from: classes6.dex */
public final class c {
    public final d a;
    public final ru.yandex.taxi.widget.c b;

    public c(d dVar, ru.yandex.taxi.widget.c cVar) {
        this.a = dVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0178 -> B:11:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, MtVehiclesResponse mtVehiclesResponse, ContinuationImpl continuationImpl) {
        MtVehiclesInteractor$mapToBLEState$1 mtVehiclesInteractor$mapToBLEState$1;
        int i;
        Map map;
        Collection arrayList;
        Iterator it;
        MtVehiclesResponse.BLEItem bLEItem;
        ru.yandex.taxi.masstransit.geopayment.network.d dVar;
        Map map2;
        String str;
        Iterator it2;
        Collection collection;
        CharSequence charSequence;
        BleTransportType bleTransportType;
        cVar.getClass();
        ru.yandex.taxi.widget.c cVar2 = cVar.b;
        if (continuationImpl instanceof MtVehiclesInteractor$mapToBLEState$1) {
            mtVehiclesInteractor$mapToBLEState$1 = (MtVehiclesInteractor$mapToBLEState$1) continuationImpl;
            int i2 = mtVehiclesInteractor$mapToBLEState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtVehiclesInteractor$mapToBLEState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtVehiclesInteractor$mapToBLEState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtVehiclesInteractor$mapToBLEState$1.label;
                int i3 = 6;
                if (i != 0) {
                    map = null;
                    kotlin.b.b(obj);
                    List list = mtVehiclesResponse.a;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        arrayList = (Collection) mtVehiclesInteractor$mapToBLEState$1.L$11;
                        String str2 = (String) mtVehiclesInteractor$mapToBLEState$1.L$10;
                        ru.yandex.taxi.masstransit.geopayment.network.d dVar2 = (ru.yandex.taxi.masstransit.geopayment.network.d) mtVehiclesInteractor$mapToBLEState$1.L$7;
                        MtVehiclesResponse.BLEItem bLEItem2 = (MtVehiclesResponse.BLEItem) mtVehiclesInteractor$mapToBLEState$1.L$6;
                        Iterator it3 = (Iterator) mtVehiclesInteractor$mapToBLEState$1.L$4;
                        Collection collection2 = (Collection) mtVehiclesInteractor$mapToBLEState$1.L$3;
                        kotlin.b.b(obj);
                        dVar = dVar2;
                        bLEItem = bLEItem2;
                        it2 = it3;
                        str = str2;
                        collection = collection2;
                        map2 = null;
                        charSequence = (CharSequence) obj;
                        FormattedText formattedText = dVar.b;
                        mtVehiclesInteractor$mapToBLEState$1.L$0 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$1 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$2 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$3 = collection;
                        mtVehiclesInteractor$mapToBLEState$1.L$4 = it2;
                        mtVehiclesInteractor$mapToBLEState$1.L$5 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$6 = bLEItem;
                        mtVehiclesInteractor$mapToBLEState$1.L$7 = dVar;
                        mtVehiclesInteractor$mapToBLEState$1.L$8 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$9 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$10 = str;
                        mtVehiclesInteractor$mapToBLEState$1.L$11 = charSequence;
                        mtVehiclesInteractor$mapToBLEState$1.L$12 = arrayList;
                        mtVehiclesInteractor$mapToBLEState$1.label = 2;
                        obj = ru.yandex.taxi.widget.c.i(cVar2, formattedText, map2, mtVehiclesInteractor$mapToBLEState$1, 30);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (Collection) mtVehiclesInteractor$mapToBLEState$1.L$12;
                    charSequence = (CharSequence) mtVehiclesInteractor$mapToBLEState$1.L$11;
                    String str3 = (String) mtVehiclesInteractor$mapToBLEState$1.L$10;
                    dVar = (ru.yandex.taxi.masstransit.geopayment.network.d) mtVehiclesInteractor$mapToBLEState$1.L$7;
                    bLEItem = (MtVehiclesResponse.BLEItem) mtVehiclesInteractor$mapToBLEState$1.L$6;
                    it2 = (Iterator) mtVehiclesInteractor$mapToBLEState$1.L$4;
                    collection = (Collection) mtVehiclesInteractor$mapToBLEState$1.L$3;
                    kotlin.b.b(obj);
                    String str4 = str3;
                    CharSequence charSequence2 = charSequence;
                    CharSequence charSequence3 = (CharSequence) obj;
                    String str5 = bLEItem.a;
                    int i4 = pa11.a[bLEItem.c.ordinal()];
                    if (i4 == 1) {
                        bleTransportType = BleTransportType.Bus;
                    } else if (i4 == 2) {
                        bleTransportType = BleTransportType.Trolley;
                    } else if (i4 == 3) {
                        bleTransportType = BleTransportType.Tram;
                    } else if (i4 == 4) {
                        bleTransportType = BleTransportType.Water;
                    } else {
                        if (i4 != 5) {
                            w511.b();
                            return null;
                        }
                        bleTransportType = BleTransportType.Electrobus;
                    }
                    BleTransportType bleTransportType2 = bleTransportType;
                    String str6 = dVar.c.b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    arrayList.add(new fd30(str4, charSequence2, charSequence3, str5, bleTransportType2, mja1.a(str6, null, 6), bLEItem.f));
                    arrayList = collection;
                    it = it2;
                    i3 = 6;
                    map = null;
                    if (it.hasNext()) {
                        MtVehiclesResponse.BLEItem bLEItem3 = (MtVehiclesResponse.BLEItem) it.next();
                        ru.yandex.taxi.masstransit.geopayment.network.d dVar3 = bLEItem3.b;
                        String str7 = dVar3.c.a;
                        str = str7.length() >= i3 ? gvu0.A0(i3, str7) : "";
                        if (new Regex("\\w\\d{3}\\w{2}", RegexOption.IGNORE_CASE).h(str)) {
                            str = gvu0.u0(str) + " " + str.substring(1, 4) + " " + str.substring(4);
                        }
                        FormattedText formattedText2 = dVar3.a;
                        map2 = map;
                        mtVehiclesInteractor$mapToBLEState$1.L$0 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$1 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$2 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$3 = arrayList;
                        mtVehiclesInteractor$mapToBLEState$1.L$4 = it;
                        mtVehiclesInteractor$mapToBLEState$1.L$5 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$6 = bLEItem3;
                        mtVehiclesInteractor$mapToBLEState$1.L$7 = dVar3;
                        mtVehiclesInteractor$mapToBLEState$1.L$8 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$9 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.L$10 = str;
                        mtVehiclesInteractor$mapToBLEState$1.L$11 = arrayList;
                        mtVehiclesInteractor$mapToBLEState$1.L$12 = map2;
                        mtVehiclesInteractor$mapToBLEState$1.label = 1;
                        Object i5 = ru.yandex.taxi.widget.c.i(cVar2, formattedText2, map2, mtVehiclesInteractor$mapToBLEState$1, 30);
                        if (i5 != coroutineSingletons) {
                            bLEItem = bLEItem3;
                            dVar = dVar3;
                            it2 = it;
                            collection = arrayList;
                            obj = i5;
                            charSequence = (CharSequence) obj;
                            FormattedText formattedText3 = dVar.b;
                            mtVehiclesInteractor$mapToBLEState$1.L$0 = map2;
                            mtVehiclesInteractor$mapToBLEState$1.L$1 = map2;
                            mtVehiclesInteractor$mapToBLEState$1.L$2 = map2;
                            mtVehiclesInteractor$mapToBLEState$1.L$3 = collection;
                            mtVehiclesInteractor$mapToBLEState$1.L$4 = it2;
                            mtVehiclesInteractor$mapToBLEState$1.L$5 = map2;
                            mtVehiclesInteractor$mapToBLEState$1.L$6 = bLEItem;
                            mtVehiclesInteractor$mapToBLEState$1.L$7 = dVar;
                            mtVehiclesInteractor$mapToBLEState$1.L$8 = map2;
                            mtVehiclesInteractor$mapToBLEState$1.L$9 = map2;
                            mtVehiclesInteractor$mapToBLEState$1.L$10 = str;
                            mtVehiclesInteractor$mapToBLEState$1.L$11 = charSequence;
                            mtVehiclesInteractor$mapToBLEState$1.L$12 = arrayList;
                            mtVehiclesInteractor$mapToBLEState$1.label = 2;
                            obj = ru.yandex.taxi.widget.c.i(cVar2, formattedText3, map2, mtVehiclesInteractor$mapToBLEState$1, 30);
                            if (obj != coroutineSingletons) {
                                str4 = str;
                                CharSequence charSequence22 = charSequence;
                                CharSequence charSequence32 = (CharSequence) obj;
                                String str52 = bLEItem.a;
                                int i42 = pa11.a[bLEItem.c.ordinal()];
                                if (i42 == 1) {
                                }
                                BleTransportType bleTransportType22 = bleTransportType;
                                String str62 = dVar.c.b;
                                if (str62 == null) {
                                }
                                arrayList.add(new fd30(str4, charSequence22, charSequence32, str52, bleTransportType22, mja1.a(str62, null, 6), bLEItem.f));
                                arrayList = collection;
                                it = it2;
                                i3 = 6;
                                map = null;
                                if (it.hasNext()) {
                                    return (List) arrayList;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        mtVehiclesInteractor$mapToBLEState$1 = new MtVehiclesInteractor$mapToBLEState$1(cVar, continuationImpl);
        Object obj2 = mtVehiclesInteractor$mapToBLEState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtVehiclesInteractor$mapToBLEState$1.label;
        int i32 = 6;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sl30 b(c cVar, Throwable th) {
        BufferedInputStream N;
        String str;
        String str2;
        Map map;
        String L;
        cVar.getClass();
        String str3 = "";
        Integer M = s8o.M(th);
        if (M == null || M.intValue() != 403 || (N = s8o.N(th)) == null) {
            return sl30.d;
        }
        try {
            L = s8o.L(N);
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        if (L == null) {
            str2 = "";
            MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.Companion.getClass();
            map = MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.map;
            return new sl30((MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode) map.get(str3), str2, false);
        }
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) sbx.d.b(kotlinx.serialization.json.c.Companion.serializer(), L);
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar2.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (bVar != null) {
            str = qcx.g(qcx.n(bVar));
        }
        str = "";
        try {
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar2.get(Constants.KEY_MESSAGE);
            if (bVar2 != null) {
                String g = qcx.g(qcx.n(bVar2));
                if (g != null) {
                    str3 = g;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            xby.d.j(th);
            str2 = str3;
            str3 = str;
            MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.Companion.getClass();
            map = MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.map;
            return new sl30((MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode) map.get(str3), str2, false);
        }
        str2 = str3;
        str3 = str;
        MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.Companion.getClass();
        map = MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.map;
        return new sl30((MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode) map.get(str3), str2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(u26 u26Var, ContinuationImpl continuationImpl) {
        MtVehiclesInteractor$geoVehiclesFlow$1 mtVehiclesInteractor$geoVehiclesFlow$1;
        int i;
        if (continuationImpl instanceof MtVehiclesInteractor$geoVehiclesFlow$1) {
            mtVehiclesInteractor$geoVehiclesFlow$1 = (MtVehiclesInteractor$geoVehiclesFlow$1) continuationImpl;
            int i2 = mtVehiclesInteractor$geoVehiclesFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtVehiclesInteractor$geoVehiclesFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtVehiclesInteractor$geoVehiclesFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtVehiclesInteractor$geoVehiclesFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = this.a;
                    if (u26Var != null && u26Var.a) {
                        return new m0(e.d(dVar.p), e.d(dVar.n), new MtVehiclesInteractor$vehiclesFlowV2$1(this, null));
                    }
                    mtVehiclesInteractor$geoVehiclesFlow$1.L$0 = null;
                    mtVehiclesInteractor$geoVehiclesFlow$1.L$1 = this;
                    mtVehiclesInteractor$geoVehiclesFlow$1.label = 1;
                    obj = e.F(new ru.yandex.taxi.masstransit.geopayment.repository.c(e.s(dVar.b.f, new i0z(22)), dVar), dVar.d);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) mtVehiclesInteractor$geoVehiclesFlow$1.L$1;
                    kotlin.b.b(obj);
                }
                this.getClass();
                return new b((tpr) obj, this);
            }
        }
        mtVehiclesInteractor$geoVehiclesFlow$1 = new MtVehiclesInteractor$geoVehiclesFlow$1(this, continuationImpl);
        Object obj3 = mtVehiclesInteractor$geoVehiclesFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtVehiclesInteractor$geoVehiclesFlow$1.label;
        if (i != 0) {
        }
        this.getClass();
        return new b((tpr) obj3, this);
    }
}
