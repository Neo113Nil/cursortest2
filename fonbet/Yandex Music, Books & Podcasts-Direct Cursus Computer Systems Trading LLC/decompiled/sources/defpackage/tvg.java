package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltvg;", "Ljnb;", "", "<init>", "()V", "longtap-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class tvg extends jnb {
    public final jyr j = l18.b.b(hag.I(rvg.class), true);
    public final cvo k;
    public final jyr l;
    public final jyr m;
    public final ybf n;
    public final jyr o;

    public tvg() {
        cvo cvoVar = cvo.i;
        this.k = o6m.b(wjb.BottomsheetScreen, null, 6);
        this.l = btf.b(new svg(this, 0));
        this.m = btf.b(new svg(this, 1));
        int i = 2;
        int i2 = 3;
        this.n = new ybf(ern.a(fwg.class), new skf(i, this), new skf(i2, new svg(this, i)));
        this.o = btf.b(new svg(this, i2));
    }

    public final void A() {
        g06 g06Var = ((fwg) this.n.getValue()).k;
        nmb A = g06Var.A();
        String G = ((fnb) g06Var.b).G();
        if (G == null) {
            G = "";
        }
        gs4 gs4Var = (gs4) g06Var.c;
        ckb ckbVar = (ckb) gs4Var.d;
        String str = (String) gs4Var.a;
        String str2 = (String) gs4Var.b;
        dkb dkbVar = (dkb) g06Var.d;
        A.getClass();
        ckbVar.getClass();
        str.getClass();
        dkbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "other");
        linkedHashMap.put("page_id", "main");
        linkedHashMap.put("hash", G);
        linkedHashMap.put("object_type", ckbVar.a);
        linkedHashMap.put("object_id", str);
        linkedHashMap.put("object_name", str2);
        dfi.p(1, "opening_method", dkbVar.a, "_meta", linkedHashMap);
        A.C("BottomSheet.Closed", linkedHashMap);
        y parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        a aVar = new a(parentFragmentManager);
        aVar.m(this);
        aVar.k(true, true);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            A();
            return null;
        }
        g06 g06Var = ((fwg) this.n.getValue()).k;
        nmb A = g06Var.A();
        String G = ((fnb) g06Var.b).G();
        if (G == null) {
            G = "";
        }
        String str = G;
        gs4 gs4Var = (gs4) g06Var.c;
        A.b("main", str, (ckb) gs4Var.d, (String) gs4Var.a, (String) gs4Var.b, (dkb) g06Var.d);
        cwg cwgVar = (cwg) this.o.getValue();
        jp0 jp0Var = new jp0(new pef(0, this, tvg.class, "close", "close()V", 0, 24));
        cwgVar.getClass();
        nt0.N(this, jp0Var, new wn5(new m2g(3, cwgVar, jp0Var), -1839122156, true));
        return null;
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getJ() {
        return this.k;
    }
}
