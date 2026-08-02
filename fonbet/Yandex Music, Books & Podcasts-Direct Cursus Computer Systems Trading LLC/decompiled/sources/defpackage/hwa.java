package defpackage;

import android.app.Activity;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class hwa implements mj5 {
    public final jj5 a;

    public hwa(jj5 jj5Var) {
        this.a = jj5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mj5
    public final void a(xh5 xh5Var, zh5 zh5Var, Activity activity) {
        zva zvaVar;
        String str;
        String str2;
        eva evaVar;
        eva evaVar2;
        ph5 ph5Var = (ph5) xh5Var;
        zh5Var.getClass();
        ph5Var.getClass();
        activity.getClass();
        String str3 = zh5Var.a;
        String str4 = ph5Var.a;
        ssg.a(4, "DynamicOverlaySheetCommunicationTriggerHandler", hrg.r("handle anchorId: ", str3, ", screenId: ", str4), null);
        jj5 jj5Var = this.a;
        jj5Var.a(zh5Var, hj5.b);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((lva) ((byb) qdcVar.C(I)).c(ern.a(lva.class))).h()) {
            ssg.a(5, "CommunicationTriggerExternalActionsImpl", "Dynamic overlay trigger received, but the experiment is currently disabled", null);
            return;
        }
        if (!(activity instanceof t)) {
            dfi.r("The hosting Activity must be a subclass of FragmentActivity for DynamicOverlayManager. Current activity: ".concat(activity.getClass().getName()), "CommunicationTriggerExternalActionsImpl");
            return;
        }
        oh5 oh5Var = ph5Var.d;
        v3w.l("openDynamicOverlay: ", str4, 3, "CommunicationTriggerExternalActionsImpl", null);
        wg5 wg5Var = (wg5) jj5Var.f.getValue();
        wg5Var.getClass();
        nnk nnkVar = new nnk(wg5Var, ph5Var);
        String str5 = ph5Var.b;
        jyr jyrVar = k3j.e;
        if (ixf.x()) {
            zvaVar = new zva(str3, str5, (oi5) jj5Var.d.getValue(), nnkVar, 0);
        } else {
            pi5 pi5Var = (pi5) jj5Var.e.getValue();
            str5.getClass();
            pi5Var.getClass();
            es6 es6Var = new es6();
            es6Var.a = str5;
            es6Var.b = pi5Var;
            es6Var.c = nnkVar;
            zvaVar = es6Var;
        }
        uva uvaVar = (uva) jj5Var.a.getValue();
        t tVar = (t) activity;
        boolean z = oh5Var.a;
        boolean z2 = oh5Var.b;
        String str6 = oh5Var.c;
        String str7 = oh5Var.d;
        boolean z3 = oh5Var.e;
        String str8 = oh5Var.f;
        String str9 = oh5Var.g;
        String str10 = oh5Var.h;
        nh5 nh5Var = oh5Var.i;
        eva evaVar3 = new eva(str10, new dva(nh5Var.a, nh5Var.b), oh5Var.j, oh5Var.k);
        String str11 = oh5Var.l;
        nh5 nh5Var2 = oh5Var.m;
        String str12 = oh5Var.n;
        String str13 = oh5Var.o;
        if (str11 == null || nh5Var2 == null || str12 == null || str13 == null) {
            str = str8;
            str2 = str9;
            evaVar = evaVar3;
            evaVar2 = null;
        } else {
            str = str8;
            str2 = str9;
            evaVar = evaVar3;
            evaVar2 = new eva(str11, new dva(nh5Var2.a, nh5Var2.b), str12, str13);
        }
        fva fvaVar = new fva(z, z2, str6, str7, z3, str, str2, evaVar, evaVar2, oh5Var.p, oh5Var.q, oh5Var.r, oh5Var.s, oh5Var.t, oh5Var.u, oh5Var.v, oh5Var.w);
        uvaVar.getClass();
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        if (supportFragmentManager.D("DynamicOverlayFragment") != null) {
            return;
        }
        ((iva) uvaVar.b.getValue()).getClass();
        if (a28.a(tVar)) {
            return;
        }
        awa awaVar = (awa) uvaVar.a.a.getValue();
        pu0 t = pd.t(new qzm[0]);
        awaVar.getClass();
        tka tkaVar = new tka(6);
        lm4 a = ern.a(fwa.class);
        jfu viewModelStore = tVar.getViewModelStore();
        s40 s40Var = new s40(11, tkaVar);
        gs6 gs6Var = gs6.b;
        viewModelStore.getClass();
        gs6Var.getClass();
        bjt bjtVar = new bjt(viewModelStore, s40Var, gs6Var);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        fwa fwaVar = (fwa) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        fwaVar.S(t);
        fwaVar.P(awaVar);
        fwaVar.R(zvaVar);
        qva qvaVar = new qva();
        qvaVar.setArguments(cxb.K(new Pair("data", fvaVar)));
        qvaVar.show(supportFragmentManager, "DynamicOverlayFragment");
    }
}
