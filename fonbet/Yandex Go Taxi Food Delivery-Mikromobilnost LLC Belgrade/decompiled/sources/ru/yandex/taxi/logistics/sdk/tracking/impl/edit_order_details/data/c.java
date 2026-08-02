package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data;

import com.yandex.delivery.mapper.model.OrderDetailsFormFieldType;
import defpackage.ace;
import defpackage.bce;
import defpackage.bfe0;
import defpackage.cc7;
import defpackage.cfe0;
import defpackage.efe0;
import defpackage.elb0;
import defpackage.evu0;
import defpackage.f4l0;
import defpackage.gfe0;
import defpackage.gri;
import defpackage.hwy0;
import defpackage.l7x0;
import defpackage.pt0;
import defpackage.pvn;
import defpackage.smn;
import defpackage.t701;
import defpackage.tpr;
import defpackage.xee0;
import defpackage.ybe;
import defpackage.zb80;
import defpackage.zbe;
import defpackage.zee0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class c implements pt0 {
    public final f4l0 a;
    public final e b;
    public final l7x0 c;
    public final ru.yandex.taxi.logistics.sdk.delivery.edit.b d;
    public final elb0 e;
    public final ru.yandex.taxi.logistics.sdk.photocomments.domain.a f;
    public final smn g;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a h;
    public final hwy0 i;

    public c(f4l0 f4l0Var, e eVar, l7x0 l7x0Var, ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar, elb0 elb0Var, ru.yandex.taxi.logistics.sdk.photocomments.domain.a aVar, smn smnVar, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar2, hwy0 hwy0Var) {
        this.a = f4l0Var;
        this.b = eVar;
        this.c = l7x0Var;
        this.d = bVar;
        this.e = elb0Var;
        this.f = aVar;
        this.g = smnVar;
        this.h = aVar2;
        this.i = hwy0Var;
    }

    public static xee0 b(efe0 efe0Var, OrderDetailsFormFieldType orderDetailsFormFieldType, boolean z) {
        cfe0 cfe0Var;
        bfe0 bfe0Var;
        Object obj;
        ArrayList arrayList = (!z ? (cfe0Var = efe0Var.c) != null : (cfe0Var = efe0Var.b) != null) ? null : cfe0Var.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((bfe0) obj).getType() == orderDetailsFormFieldType) {
                    break;
                }
            }
            bfe0Var = (bfe0) obj;
        } else {
            bfe0Var = null;
        }
        if (bfe0Var instanceof xee0) {
            return (xee0) bfe0Var;
        }
        return null;
    }

    public static bce c(zee0 zee0Var, String str) {
        String str2 = zee0Var != null ? zee0Var.g : null;
        return (zee0Var == null || !zee0Var.c) ? (str2 == null || !(str == null || evu0.J(str))) ? ace.a : new ybe(str2) : zbe.a;
    }

    public static String d(xee0 xee0Var, Map map) {
        Object obj = map.get(xee0Var != null ? xee0Var.e : null);
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 != null) {
            return obj2;
        }
        String str = xee0Var != null ? xee0Var.d : null;
        return str == null ? "" : str;
    }

    public static FieldVisibility e(bfe0 bfe0Var) {
        return bfe0Var != null ? FieldVisibility.VISIBLE : FieldVisibility.GONE;
    }

    @Override // defpackage.pt0
    public final tpr a() {
        gri griVar;
        efe0 efe0Var;
        Object value = this.b.e.a.getValue();
        t701 t701Var = value instanceof t701 ? (t701) value : null;
        if (t701Var != null && (griVar = t701Var.a) != null) {
            String str = griVar.a;
            zb80 zb80Var = griVar.v;
            gfe0 gfe0Var = zb80Var != null ? zb80Var.a : null;
            if (gfe0Var != null && (efe0Var = gfe0Var.c) != null) {
                return kotlinx.coroutines.flow.e.l(kotlinx.coroutines.flow.e.t(this.a.d()), kotlinx.coroutines.flow.e.t(new cc7(this.d.c.b, str, 7)), this.e.d(), kotlinx.coroutines.flow.e.d(this.g.a), this.i.b, new EditOrderScreenStateRepositoryImpl$screenStateFlow$2(this, efe0Var, null));
            }
        }
        return pvn.a;
    }
}
