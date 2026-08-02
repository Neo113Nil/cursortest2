package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class tu2 extends bfu {
    public final g0c k;
    public final voi l;

    public tu2(g0c g0cVar) {
        g0cVar.getClass();
        this.k = g0cVar;
        this.l = new voi(nxi.b);
    }

    public final void G() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Отмена закрытия формы", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "cancelled_exit", "cancelled_exit", k);
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(j);
        this.l.l(nxi.b);
    }

    public final void H() {
        voi voiVar = this.l;
        nxi nxiVar = (nxi) voiVar.d();
        if (qdq.B(nxiVar != null ? Boolean.valueOf(nxiVar.equals(nxi.e)) : null)) {
            voiVar.l(nxi.c);
            return;
        }
        nxi nxiVar2 = (nxi) voiVar.d();
        if (qdq.B(nxiVar2 != null ? Boolean.valueOf(nxiVar2.equals(nxi.d)) : null)) {
            G();
        } else {
            K();
        }
    }

    public final void J() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Подтвержение закрытия формы", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "confirmed_exit", "confirmed_exit", k);
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(j);
        this.l.l(nxi.a);
    }

    public void K() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Открытие экрана подтверждения закрытия формы после нажатия вне ее или на крестик", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "confirm_exit_screen_opened", "confirm_exit_screen_opened", k);
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(j);
        this.l.l(nxi.d);
    }
}
