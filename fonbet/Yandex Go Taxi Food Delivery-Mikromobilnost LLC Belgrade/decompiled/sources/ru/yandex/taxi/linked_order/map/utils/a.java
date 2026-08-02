package ru.yandex.taxi.linked_order.map.utils;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.ah00;
import defpackage.b01;
import defpackage.gh00;
import defpackage.ik91;
import defpackage.qh2;
import defpackage.tls;
import defpackage.ymy;
import java.util.List;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes5.dex */
public final class a {
    public final ah00 a;
    public ymy b;
    public tls c = ik91.a;
    public final b01 d = new b01(9, this);

    public a(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final void a(List list) {
        ymy ymyVar = this.b;
        if (ymyVar != null) {
            ymyVar.a = ik91.a;
        }
        LinkedOrderFocusHolder$focus$1 linkedOrderFocusHolder$focus$1 = new LinkedOrderFocusHolder$focus$1(1, this, a.class, "cameraFocusFinished", "cameraFocusFinished(Z)V", 0);
        ymy ymyVar2 = new ymy();
        ymyVar2.a = linkedOrderFocusHolder$focus$1;
        this.b = ymyVar2;
        if (list.isEmpty()) {
            ymy ymyVar3 = this.b;
            if (ymyVar3 != null) {
                ymyVar3.onMoveFinished(true);
                return;
            }
            return;
        }
        this.c.invoke(Boolean.TRUE);
        BoundingBox a = k.a(new qh2(list, 6));
        if (a != null) {
            ((gh00) this.a).A(a, this.b);
        }
    }

    public final void b() {
        ((gh00) this.a).u(this.d);
        this.c.invoke(Boolean.FALSE);
    }
}
