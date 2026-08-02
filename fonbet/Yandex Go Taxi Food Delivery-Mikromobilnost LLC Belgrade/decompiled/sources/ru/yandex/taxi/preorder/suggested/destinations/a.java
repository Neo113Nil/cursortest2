package ru.yandex.taxi.preorder.suggested.destinations;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.analytics.ListBasedOrderAddressAnalyticsData;
import com.yandex.go.suggest.DestinationSuggest;
import defpackage.eqe;
import defpackage.evu0;
import defpackage.fc00;
import defpackage.ny61;
import defpackage.uzs;
import defpackage.vpr;
import defpackage.xpo;
import defpackage.zpo;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1 expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1;
        int i;
        c cVar;
        zpo zpoVar;
        int i2;
        zzs zzsVar;
        if (continuation instanceof ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1) {
            expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1 = (ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1) continuation;
            int i3 = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xpo xpoVar = (xpo) obj;
                    ArrayList arrayList = new ArrayList();
                    List list = xpoVar.a.a;
                    int size = list.size();
                    int i4 = 0;
                    while (true) {
                        cVar = this.b;
                        if (i4 >= size) {
                            break;
                        }
                        DestinationSuggest destinationSuggest = (DestinationSuggest) list.get(i4);
                        if (destinationSuggest instanceof Address) {
                            eqe eqeVar = cVar.d;
                            Address address = (Address) destinationSuggest;
                            eqeVar.getClass();
                            zzs B = address.B();
                            Location i5 = eqeVar.b.i();
                            String m = eqeVar.a.m();
                            String G = eqeVar.c.G(m);
                            i2 = i4;
                            if (i5 != null) {
                                zzs.Companion.getClass();
                                zzsVar = uzs.b(i5);
                            } else {
                                zzsVar = null;
                            }
                            address.O1(new ListBasedOrderAddressAnalyticsData("expecteddestinations", B, zzsVar, address.q2(), m, G, B, i2, false, null));
                            arrayList.add(destinationSuggest);
                        } else {
                            i2 = i4;
                        }
                        i4 = i2 + 1;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Address address2 = (Address) it.next();
                        String pickMethod = address2.getPickMethod();
                        if (pickMethod == null || evu0.J(pickMethod)) {
                            address2.P("expecteddestinations");
                        }
                    }
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((Address) arrayList.get(i6)).U(i6);
                    }
                    List list2 = xpoVar.a.a;
                    if (!cVar.b.g()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (((DestinationSuggest) obj3) instanceof PlainAddress) {
                                arrayList2.add(obj3);
                            }
                        }
                        list2 = arrayList2;
                    }
                    xpo.a aVar = xpoVar.b;
                    if (list2.isEmpty()) {
                        zpoVar = zpo.c;
                    } else {
                        int i7 = aVar != null ? aVar.a : 0;
                        int i8 = aVar != null ? aVar.b : 0;
                        ArrayList c = c.c(i7, list2);
                        ArrayList c2 = c.c(i8, list2);
                        ArrayList arrayList3 = new ArrayList();
                        if (!c2.isEmpty()) {
                            Iterator it2 = c2.iterator();
                            while (it2.hasNext()) {
                                DestinationSuggest destinationSuggest2 = (DestinationSuggest) it2.next();
                                if (destinationSuggest2 instanceof PlainAddress) {
                                    arrayList3.add((Address) destinationSuggest2);
                                }
                            }
                        }
                        zpoVar = new zpo(new fc00(c), arrayList3);
                    }
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.L$0 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.L$1 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.L$2 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.L$3 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zpoVar, expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1) == coroutineSingletons) {
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
        expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1 = new ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1(this, continuation);
        Object obj22 = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
