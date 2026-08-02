package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotDividerDto$LineSlot;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Destination;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$DoneFooter;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Generic;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$RoutePoint;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Source;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Status;
import com.yandex.go.taxi.order.models.api.response.a7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes14.dex */
public final class qik0 {
    public final pik0 a;
    public final zfk0 b;
    public final yfk0 c;

    public qik0(pik0 pik0Var, zfk0 zfk0Var, yfk0 yfk0Var) {
        this.a = pik0Var;
        this.b = zfk0Var;
        this.c = yfk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Source, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.builders.ListBuilder] */
    public final RideCardInfoResponse a(TaxiOrder taxiOrder, tfk0 tfk0Var) {
        rik0 rik0Var;
        RideCardInfoResponse.PresentationsDto presentationsDto;
        RideCardInfoResponse.PresentationsDto.Details details;
        RideCardInfoResponse.PresentationsDto presentationsDto2;
        RideCardInfoResponse.PresentationsDto.Compact compact;
        SlotItemDto a;
        Iterator it;
        SlotButtonDto slotButtonDto;
        SlotItemDto a2;
        SlotItemDto a3;
        String obj;
        SlotItemDto a4;
        SlotItemDto a5;
        String obj2;
        SlotItemDto a6;
        SlotItemDto a7;
        qik0 qik0Var = this;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r3 = EmptyList.a;
        ref$ObjectRef.element = r3;
        String str = null;
        if (tfk0Var.equals(sfk0.a)) {
            rik0Var = qik0Var.b;
        } else {
            if (!tfk0Var.equals(rfk0.a)) {
                w511.b();
                return null;
            }
            rik0Var = qik0Var.c;
        }
        ?? a8 = rcc.a();
        i3y i3yVar = rik0Var.d;
        i3y i3yVar2 = rik0Var.d;
        RideCardInfoResponse rideCardInfoResponse = (RideCardInfoResponse) i3yVar.getValue();
        List<a7> list = rideCardInfoResponse != null ? rideCardInfoResponse.a : null;
        if (list == null) {
            list = r3;
        }
        String str2 = null;
        for (a7 a7Var : list) {
            boolean z = a7Var instanceof RideCardItemDto$Status;
            pik0 pik0Var = qik0Var.a;
            if (z) {
                RideCardItemDto$Status rideCardItemDto$Status = (RideCardItemDto$Status) a7Var;
                pik0Var.getClass();
                SlotItemDto slotItemDto = rideCardItemDto$Status.b;
                Object rideCardItemDto$Status2 = (slotItemDto == null || (a7 = pik0Var.a(slotItemDto, str)) == null) ? str : new RideCardItemDto$Status(rideCardItemDto$Status.a, a7, rideCardItemDto$Status.c, rideCardItemDto$Status.d, rideCardItemDto$Status.e);
                if (rideCardItemDto$Status2 != null) {
                    a8.add(rideCardItemDto$Status2);
                }
            } else if (a7Var instanceof RideCardItemDto$Source) {
                Address h = taxiOrder.t().h();
                if (h != null && (obj2 = h.toString()) != null) {
                    RideCardItemDto$Source rideCardItemDto$Source = (RideCardItemDto$Source) a7Var;
                    pik0Var.getClass();
                    SlotItemDto slotItemDto2 = rideCardItemDto$Source.c;
                    ?? rideCardItemDto$Source2 = (slotItemDto2 == null || (a6 = pik0Var.a(slotItemDto2, obj2)) == null) ? str : new RideCardItemDto$Source(rideCardItemDto$Source.a, rideCardItemDto$Source.b, a6, rideCardItemDto$Source.d);
                    if (rideCardItemDto$Source2 != 0) {
                        str2 = rideCardItemDto$Source2.a;
                        a8.add(rideCardItemDto$Source2);
                    }
                }
            } else if (a7Var instanceof RideCardItemDto$RoutePoint) {
                List K = a.K(taxiOrder.t().b);
                ArrayList arrayList = new ArrayList(tcc.n(K, 10));
                Iterator it2 = K.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Address) it2.next()).getAddress().e);
                }
                if (arrayList.isEmpty()) {
                    continue;
                } else {
                    RideCardItemDto$RoutePoint rideCardItemDto$RoutePoint = (RideCardItemDto$RoutePoint) a7Var;
                    pik0Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    int i = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            ?? r16 = str;
                            scc.m();
                            throw r16;
                        }
                        String str3 = (String) next;
                        String str4 = str;
                        SlotItemDto slotItemDto3 = rideCardItemDto$RoutePoint.c;
                        Object rideCardItemDto$RoutePoint2 = (slotItemDto3 == null || (a5 = pik0Var.a(slotItemDto3, str3)) == null) ? str4 : new RideCardItemDto$RoutePoint(qv10.h(i, rideCardItemDto$RoutePoint.a, "_"), rideCardItemDto$RoutePoint.b, a5, rideCardItemDto$RoutePoint.d);
                        if (rideCardItemDto$RoutePoint2 != null) {
                            arrayList2.add(rideCardItemDto$RoutePoint2);
                        }
                        i = i2;
                        str = str4;
                    }
                    ?? arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((a7) it4.next()).getA());
                    }
                    ref$ObjectRef.element = arrayList3;
                    a8.addAll(arrayList2);
                }
            } else {
                String str5 = str;
                if (a7Var instanceof RideCardItemDto$Destination) {
                    Address b = taxiOrder.t().b();
                    if (b != null && (obj = b.toString()) != null) {
                        RideCardItemDto$Destination rideCardItemDto$Destination = (RideCardItemDto$Destination) a7Var;
                        pik0Var.getClass();
                        SlotItemDto slotItemDto4 = rideCardItemDto$Destination.c;
                        Object rideCardItemDto$Destination2 = (slotItemDto4 == null || (a4 = pik0Var.a(slotItemDto4, obj)) == null) ? str5 : new RideCardItemDto$Destination(rideCardItemDto$Destination.a, rideCardItemDto$Destination.b, a4, rideCardItemDto$Destination.d);
                        if (rideCardItemDto$Destination2 != null) {
                            a8.add(rideCardItemDto$Destination2);
                        }
                    }
                } else if (a7Var instanceof RideCardItemDto$Generic) {
                    RideCardItemDto$Generic rideCardItemDto$Generic = (RideCardItemDto$Generic) a7Var;
                    pik0Var.getClass();
                    SlotItemDto slotItemDto5 = rideCardItemDto$Generic.c;
                    RideCardItemDto$Generic rideCardItemDto$Generic2 = (slotItemDto5 == null || (a3 = pik0Var.a(slotItemDto5, str5)) == null) ? null : new RideCardItemDto$Generic(rideCardItemDto$Generic.a, rideCardItemDto$Generic.b, a3, rideCardItemDto$Generic.d);
                    if (rideCardItemDto$Generic2 != null) {
                        a8.add(rideCardItemDto$Generic2);
                    }
                } else if (a7Var instanceof RideCardItemDto$ActionButtons) {
                    RideCardItemDto$ActionButtons rideCardItemDto$ActionButtons = (RideCardItemDto$ActionButtons) a7Var;
                    pik0Var.getClass();
                    List list2 = rideCardItemDto$ActionButtons.c;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        SlotButtonDto slotButtonDto2 = (SlotButtonDto) it5.next();
                        SlotItemDto slotItemDto6 = slotButtonDto2.g;
                        if (slotItemDto6 == null || (a2 = pik0Var.a(slotItemDto6, null)) == null) {
                            it = it5;
                            slotButtonDto = null;
                        } else {
                            it = it5;
                            slotButtonDto = new SlotButtonDto(slotButtonDto2.a, slotButtonDto2.b, slotButtonDto2.c, slotButtonDto2.d, slotButtonDto2.e, slotButtonDto2.f, a2, slotButtonDto2.h);
                        }
                        if (slotButtonDto != null) {
                            arrayList4.add(slotButtonDto);
                        }
                        it5 = it;
                    }
                    a8.add(new RideCardItemDto$ActionButtons(rideCardItemDto$ActionButtons.a, rideCardItemDto$ActionButtons.b, arrayList4));
                } else if (a7Var instanceof RideCardItemDto$DoneFooter) {
                    RideCardItemDto$DoneFooter rideCardItemDto$DoneFooter = (RideCardItemDto$DoneFooter) a7Var;
                    pik0Var.getClass();
                    SlotItemDto slotItemDto7 = rideCardItemDto$DoneFooter.c;
                    RideCardItemDto$DoneFooter rideCardItemDto$DoneFooter2 = (slotItemDto7 == null || (a = pik0Var.a(slotItemDto7, null)) == null) ? null : new RideCardItemDto$DoneFooter(rideCardItemDto$DoneFooter.a, rideCardItemDto$DoneFooter.b, a);
                    if (rideCardItemDto$DoneFooter2 != null) {
                        a8.add(rideCardItemDto$DoneFooter2);
                    }
                } else {
                    a8.add(a7Var);
                }
            }
            qik0Var = this;
            str = null;
        }
        ListBuilder j = a8.j();
        List<String> list3 = (List) ref$ObjectRef.element;
        RideCardInfoResponse rideCardInfoResponse2 = (RideCardInfoResponse) i3yVar2.getValue();
        List list4 = (rideCardInfoResponse2 == null || (presentationsDto2 = rideCardInfoResponse2.c) == null || (compact = presentationsDto2.a) == null) ? null : compact.a;
        if (list4 == null) {
            list4 = r3;
        }
        RideCardInfoResponse.PresentationsDto.Compact compact2 = new RideCardInfoResponse.PresentationsDto.Compact(list4, 6);
        RideCardInfoResponse rideCardInfoResponse3 = (RideCardInfoResponse) i3yVar2.getValue();
        List list5 = (rideCardInfoResponse3 == null || (presentationsDto = rideCardInfoResponse3.c) == null || (details = presentationsDto.b) == null) ? null : details.a;
        if (list5 == null) {
            list5 = r3;
        }
        ArrayList arrayList5 = new ArrayList(list5);
        RideCardInfoResponse rideCardInfoResponse4 = (RideCardInfoResponse) i3yVar2.getValue();
        List list6 = rideCardInfoResponse4 != null ? rideCardInfoResponse4.b : null;
        if (list6 == null) {
            list6 = r3;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : list6) {
            if (obj3 instanceof SlotDividerDto$LineSlot) {
                arrayList6.add(obj3);
            }
        }
        SlotDividerDto$LineSlot slotDividerDto$LineSlot = (SlotDividerDto$LineSlot) a.R(arrayList6);
        String str6 = slotDividerDto$LineSlot != null ? slotDividerDto$LineSlot.a : null;
        if (str6 == null) {
            str6 = "";
        }
        int indexOf = arrayList5.indexOf(str2);
        if (indexOf != -1) {
            for (String str7 : list3) {
                arrayList5.add(indexOf + 1, str6);
                indexOf += 2;
                arrayList5.add(indexOf, str7);
            }
        }
        RideCardInfoResponse.PresentationsDto presentationsDto3 = new RideCardInfoResponse.PresentationsDto(compact2, new RideCardInfoResponse.PresentationsDto.Details(arrayList5, 30), 12);
        RideCardInfoResponse rideCardInfoResponse5 = (RideCardInfoResponse) i3yVar2.getValue();
        List list7 = rideCardInfoResponse5 != null ? rideCardInfoResponse5.b : null;
        if (list7 != null) {
            r3 = list7;
        }
        return new RideCardInfoResponse(j, r3, presentationsDto3);
    }
}
