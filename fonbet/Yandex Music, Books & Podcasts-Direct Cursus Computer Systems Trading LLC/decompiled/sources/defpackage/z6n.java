package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.DeviceService;
import com.yandex.media.ynison.service.c0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class z6n implements gdu, e1o, x7o, xjn, pur, zpj, a0x {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ z6n(k81 k81Var) {
        this.a = 23;
        c5p c5pVar = new c5p(21, k81Var);
        int i = 13;
        this.b = p0x.a(new q8x(p0x.a(new z6u(i, p0x.a(new nur(14, c5pVar, p0x.a(new q8x(c5pVar, 2)))), p0x.a(new hjp(21, c5pVar)), c5pVar)), 1));
    }

    public void a(String str, String str2) {
        qzc qzcVar = (qzc) this.b;
        String a = sio.a(str.trim());
        String trim = str2.trim();
        qzcVar.getClass();
        hld.v(a, trim);
        xk5 xk5Var = (xk5) qzcVar.b;
        if (xk5Var == null) {
            xk5Var = xk5.a();
            qzcVar.b = xk5Var;
        }
        pde pdeVar = (pde) xk5Var.get(a);
        if (pdeVar == null) {
            ude udeVar = yde.b;
            hld.w(4, "expectedSize");
            pdeVar = new tde(4);
            xk5 xk5Var2 = (xk5) qzcVar.b;
            if (xk5Var2 == null) {
                xk5Var2 = xk5.a();
                qzcVar.b = xk5Var2;
            }
            xk5Var2.put(a, pdeVar);
        }
        pdeVar.b(trim);
    }

    @Override // defpackage.a0x
    public void b(Bitmap bitmap) {
        ((mmx) this.b).b(bitmap, 3);
    }

    public void c(List list) {
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = dvt.a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                a(split[0], split[1]);
            }
        }
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        b4x b4xVar = (b4x) this.b;
        b4xVar.getClass();
        msg msgVar = b4x.i;
        Log.w(msgVar.a, msgVar.d("Fail to store SessionState", new Object[0]), exc);
        b4xVar.b(100);
    }

    @Override // defpackage.gdu
    public int e(View view) {
        return yon.Z(view) - ((ViewGroup.MarginLayoutParams) ((zon) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.gdu
    public int f() {
        return ((yon) this.b).e0();
    }

    public fo7 g() {
        g78 g;
        z0j z0jVar = (z0j) this.b;
        l78 l78Var = (l78) z0jVar.e;
        synchronized (l78Var) {
            z0jVar.F(true);
            g = l78Var.g(((e78) z0jVar.c).a);
        }
        if (g != null) {
            return new fo7(4, g);
        }
        return null;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        return (r2f) ((rhp) this.b).a.get();
    }

    public String h(c0 c0Var, c0 c0Var2) {
        if (!((Boolean) ((dfw) ((hgp) this.b).b).invoke()).booleanValue()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if (c0Var2 == null) {
            arrayList.add("brand-new");
        } else {
            if (Math.abs(c0Var.o() - c0Var2.o()) > 2000) {
                arrayList.add("progress=" + c0Var.o());
            }
            if (c0Var.m() != c0Var2.m()) {
                arrayList.add("paused=" + c0Var.m());
            }
            if (c0Var.n() != c0Var2.n()) {
                arrayList.add("speed=" + c0Var.n());
            }
        }
        return hrg.q("Status(", CollectionsKt.X(arrayList, null, null, null, null, 63), ")");
    }

    public a7q i() {
        Object obj = (s5d) ((cr) ((lum) this.b).a).h;
        obj.getClass();
        if (obj instanceof a7q) {
            return (a7q) obj;
        }
        if (obj instanceof n5q) {
            return ((n5q) obj).a;
        }
        return null;
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        ((knn) this.b).l(zcoVar, f);
    }

    @Override // defpackage.gdu
    public int m() {
        yon yonVar = (yon) this.b;
        return yonVar.o - yonVar.b0();
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        boolean isEmpty = list.isEmpty();
        rro rroVar = (rro) this.b;
        if (isEmpty) {
            rroVar.K(new lro(new bfk(zek.v, afk.d, null, null, "Bank applications not found", null), R.string.paymentsdk_sbp_something_went_wrong, R.string.paymentsdk_sbp_something_went_wrong_description));
            return;
        }
        rroVar.z = hro.c;
        rroVar.v = null;
        rroVar.w = rro.a(rroVar);
        g0c g0cVar = rroVar.q;
        String str = rroVar.p;
        if (str == null) {
            str = rro.a(rroVar);
        }
        String concat = str != null ? "Список всех банков отображен, выбранный банк: ".concat(str) : "Список всех банков отображен";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        if (str != null) {
            linkedHashMap.put("selected_bank", new jkr(str));
        }
        vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "sbp_other_bank_list-shown", "sbp_other_bank_list-shown", k);
        x60 x60Var = (x60) g0cVar;
        x60Var.getClass();
        x60Var.a(j);
        rro.G(rroVar, list, false);
    }

    @Override // defpackage.gdu
    public View q(int i) {
        return ((yon) this.b).P(i);
    }

    @Override // defpackage.gdu
    public int r(View view) {
        return yon.T(view) + ((ViewGroup.MarginLayoutParams) ((zon) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        r2f r2fVar = (r2f) obj2;
        s9fVar.getClass();
        rhp rhpVar = (rhp) this.b;
        if (r2fVar == null) {
            rhpVar.a();
        } else {
            rhpVar.c(r2fVar);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return super.toString() + "{fragment=" + ((c1o) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        ((bfk) obj).getClass();
        ((rro) this.b).K(new lro(new bfk(zek.v, afk.d, null, null, "Bank applications not found", null), R.string.paymentsdk_sbp_something_went_wrong, R.string.paymentsdk_sbp_something_went_wrong_description));
    }

    public /* synthetic */ z6n(awc awcVar) {
        this.a = 0;
        this.b = (i6x) awcVar.a;
    }

    public /* synthetic */ z6n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public z6n(Intent intent, Bundle bundle) {
        dyd a;
        this.a = 14;
        intent.getClass();
        if (bundle == null) {
            a = dyd.a(intent.getExtras());
        } else {
            a = dyd.a(bundle);
        }
        this.b = a;
    }

    public z6n(vdr vdrVar) {
        this.a = 15;
        vdrVar.getClass();
        this.b = vdrVar;
    }

    public z6n(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = new rhp();
                break;
            case 12:
                break;
            case 16:
                this.b = new knn(3, new l3l());
                break;
            default:
                this.b = new qzc(4, (byte) 0);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z6n(String str, String str2, int i) {
        this(4);
        this.a = 4;
        a(HttpMessage.USER_AGENT, str);
        a("CSeq", String.valueOf(i));
        if (str2 != null) {
            a("Session", str2);
        }
    }

    public z6n(h3f h3fVar, pyc pycVar) {
        this.a = 6;
        this.b = h3fVar;
    }
}
