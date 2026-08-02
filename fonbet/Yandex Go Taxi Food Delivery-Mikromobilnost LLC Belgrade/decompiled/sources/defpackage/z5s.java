package defpackage;

import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.PointType;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

/* loaded from: classes5.dex */
public final class z5s {
    public final f4l0 a;
    public final zqb0 b;
    public final u1n c;
    public final p6s d;
    public final xe00 e;

    public z5s(f4l0 f4l0Var, zqb0 zqb0Var, u1n u1nVar, p6s p6sVar, xe00 xe00Var) {
        this.a = f4l0Var;
        this.b = zqb0Var;
        this.c = u1nVar;
        this.d = p6sVar;
        this.e = xe00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c0k0 c0k0Var, a51 a51Var) {
        FormStateRoutePointDto formStateRoutePointDto;
        FormStateRoutePointDto formStateRoutePointDto2;
        RoutePointContactDto routePointContactDto;
        Map map;
        Object value;
        ArrayList arrayList;
        Object value2;
        if (c0k0Var instanceof yzj0) {
            yzj0 yzj0Var = (yzj0) c0k0Var;
            int i = yzj0Var.a;
            d51 d51Var = yzj0Var.b;
            if (a51Var instanceof w41) {
                return;
            }
            boolean z = a51Var instanceof x41;
            f4l0 f4l0Var = this.a;
            zqb0 zqb0Var = this.b;
            if (z) {
                s9e s9eVar = ((x41) a51Var).a;
                if (s9eVar != null) {
                    if (d51Var instanceof b51) {
                        zqb0Var.c(i, s9eVar);
                        return;
                    } else if (!(d51Var instanceof c51)) {
                        w511.b();
                        return;
                    } else {
                        this.e.a.put(Integer.valueOf(i), s9eVar);
                        f4l0Var.e(i, s9eVar);
                        return;
                    }
                }
                return;
            }
            if (a51Var instanceof y41) {
                if (d51Var instanceof b51) {
                    return;
                }
                if (!(d51Var instanceof c51)) {
                    w511.b();
                    return;
                } else {
                    y41 y41Var = (y41) a51Var;
                    f4l0Var.c(y41Var.a, y41Var.b, i);
                    return;
                }
            }
            if (!(a51Var instanceof z41)) {
                w511.b();
                return;
            }
            if (!(d51Var instanceof b51)) {
                if (!(d51Var instanceof c51)) {
                    w511.b();
                    return;
                }
                ArrayList<lkb0> arrayList2 = ((z41) a51Var).a;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                for (lkb0 lkb0Var : arrayList2) {
                    arrayList3.add(new nkb0(lkb0Var.a(), lkb0Var.b()));
                }
                f4l0Var.f(i, null, null, null, null, null, null, arrayList3);
                return;
            }
            ArrayList<lkb0> arrayList4 = ((z41) a51Var).a;
            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
            for (lkb0 lkb0Var2 : arrayList4) {
                arrayList5.add(new nkb0(lkb0Var2.a(), lkb0Var2.b()));
            }
            zqb0Var.getClass();
            ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                nkb0 nkb0Var = (nkb0) it.next();
                arrayList6.add(new kkb0(nkb0Var.a, nkb0Var.b));
            }
            lei leiVar = zqb0Var.a;
            if (i == 0) {
                r0 r0Var = leiVar.a;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, kei.a((kei) value2, null, null, arrayList6, 7)));
                return;
            }
            int i2 = i - 1;
            r0 r0Var2 = leiVar.b;
            do {
                value = r0Var2.getValue();
                List list = (List) value;
                if (y6i0.d(i2, 0, list.size()) == list.size()) {
                    arrayList = new ArrayList(list);
                    arrayList.add(kei.a(kei.f, null, null, arrayList6, 7));
                } else {
                    arrayList = new ArrayList(list);
                    arrayList.set(i2, kei.a((kei) arrayList.get(i2), null, null, arrayList6, 7));
                }
            } while (!r0Var2.k(value, arrayList));
            return;
        }
        boolean z2 = c0k0Var instanceof zzj0;
        p6s p6sVar = this.d;
        u1n u1nVar = this.c;
        if (z2) {
            zzj0 zzj0Var = (zzj0) c0k0Var;
            if (a51Var instanceof w41) {
                qv0 qv0Var = ((w41) a51Var).a;
                l6s l6sVar = (l6s) u1nVar.c;
                PointType pointType = PointType.SOURCE;
                l6sVar.getClass();
                r6 = l6s.b(qv0Var, true);
            } else if (a51Var instanceof y41) {
                r6 = ((y41) a51Var).b;
            } else if (a51Var instanceof x41) {
                s9e s9eVar2 = ((x41) a51Var).a;
                if (s9eVar2 != null) {
                    ((l6s) u1nVar.c).getClass();
                    r6 = l6s.c(s9eVar2);
                }
            } else {
                if (!(a51Var instanceof z41)) {
                    w511.b();
                    return;
                }
                ArrayList arrayList7 = ((z41) a51Var).a;
                if (arrayList7.isEmpty()) {
                    arrayList7 = null;
                }
                if (arrayList7 != null) {
                    r6 = u1nVar.g(arrayList7);
                }
            }
            p6sVar.c(r6, zzj0Var.a);
            return;
        }
        if (!(c0k0Var instanceof a0k0)) {
            w511.b();
            return;
        }
        a0k0 a0k0Var = (a0k0) c0k0Var;
        String str = a0k0Var.a;
        j6s b = p6sVar.b();
        Object obj = (b == null || (map = b.a) == null) ? null : map.get(str);
        if (obj instanceof FormStateRoutePointDto) {
            formStateRoutePointDto2 = (FormStateRoutePointDto) obj;
        } else {
            if (!(obj instanceof Map)) {
                formStateRoutePointDto = null;
                if (!(a51Var instanceof w41)) {
                    qv0 qv0Var2 = ((w41) a51Var).a;
                    PointType pointType2 = a0k0Var.b;
                    l6s l6sVar2 = (l6s) u1nVar.c;
                    boolean z3 = pointType2 == PointType.SOURCE || pointType2 == null;
                    l6sVar2.getClass();
                    p6sVar.c(l6s.b(qv0Var2, z3), str);
                    return;
                }
                if (!(a51Var instanceof y41)) {
                    if (!(a51Var instanceof x41)) {
                        if (a51Var instanceof z41) {
                            p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, null, null, null, null, null, null, null, null, u1nVar.g(((z41) a51Var).a), 4095, null) : null, str);
                            return;
                        } else {
                            w511.b();
                            return;
                        }
                    }
                    s9e s9eVar3 = ((x41) a51Var).a;
                    if (s9eVar3 != null) {
                        ((l6s) u1nVar.c).getClass();
                        routePointContactDto = l6s.c(s9eVar3);
                    } else {
                        routePointContactDto = null;
                    }
                    p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, null, null, null, routePointContactDto, null, null, null, null, null, 8063, null) : null, str);
                    return;
                }
                y41 y41Var2 = (y41) a51Var;
                hyq hyqVar = y41Var2.a;
                if (hyqVar instanceof gyq) {
                    p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, y41Var2.b, null, null, null, null, null, null, null, null, null, 8183, null) : null, str);
                    return;
                }
                if (hyqVar instanceof fyq) {
                    p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, null, y41Var2.b, null, null, null, null, null, null, null, 8159, null) : null, str);
                    return;
                }
                if (hyqVar instanceof dyq) {
                    p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, null, null, null, null, y41Var2.b, null, null, null, null, 7935, null) : null, str);
                    return;
                }
                if (hyqVar instanceof cyq) {
                    p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, null, null, y41Var2.b, null, null, null, null, null, null, 8127, null) : null, str);
                    return;
                } else if (hyqVar instanceof eyq) {
                    p6sVar.c(formStateRoutePointDto != null ? FormStateRoutePointDto.copy$default(formStateRoutePointDto, null, null, null, null, y41Var2.b, null, null, null, null, null, null, null, null, 8175, null) : null, str);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            formStateRoutePointDto2 = (FormStateRoutePointDto) ((Moshi) u1nVar.b).adapter(FormStateRoutePointDto.class).fromJsonValue((Map) obj);
        }
        formStateRoutePointDto = formStateRoutePointDto2;
        if (!(a51Var instanceof w41)) {
        }
    }
}
