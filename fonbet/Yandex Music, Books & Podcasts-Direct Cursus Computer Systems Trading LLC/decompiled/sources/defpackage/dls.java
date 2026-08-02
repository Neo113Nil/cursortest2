package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class dls implements mj5 {
    public final jj5 a;

    public dls(jj5 jj5Var) {
        this.a = jj5Var;
    }

    @Override // defpackage.mj5
    public final void a(xh5 xh5Var, zh5 zh5Var, Activity activity) {
        Long l;
        Long l2;
        vh5 vh5Var = (vh5) xh5Var;
        zh5Var.getClass();
        vh5Var.getClass();
        activity.getClass();
        String str = zh5Var.a;
        ssg.a(4, "ToastCommunicationTriggerHandler", hrg.r("handle anchorId: ", str, ", screenId: ", vh5Var.a), null);
        if (!(activity instanceof t)) {
            dfi.r("The hosting Activity must be a subclass of FragmentActivity for DynamicToastManager. Current activity: ".concat(activity.getClass().getName()), "CommunicationTriggerExternalActionsImpl");
            return;
        }
        jj5 jj5Var = this.a;
        wg5 wg5Var = (wg5) jj5Var.f.getValue();
        wg5Var.getClass();
        nnk nnkVar = new nnk(wg5Var, vh5Var);
        String str2 = vh5Var.b;
        uh5 uh5Var = vh5Var.d;
        jyr jyrVar = k3j.e;
        final txa vx6Var = !ixf.x() ? new vx6(str2, (pi5) jj5Var.e.getValue(), nnkVar) : new zva(str, str2, (oi5) jj5Var.d.getValue(), nnkVar, 1);
        final rxa rxaVar = (rxa) jj5Var.b.getValue();
        final t tVar = (t) activity;
        th5 th5Var = uh5Var.a;
        sh5 sh5Var = uh5Var.f;
        if (ij5.a[th5Var.ordinal()] != 1) {
            b6e.s();
            return;
        }
        kxa kxaVar = kxa.a;
        String str3 = uh5Var.b;
        String str4 = uh5Var.c;
        String str5 = uh5Var.d;
        rh5 rh5Var = uh5Var.e;
        final lxa lxaVar = new lxa(str3, str4, str5, rh5Var != null ? new jxa(rh5Var.b, rh5Var.a) : null);
        long longValue = (sh5Var == null || (l2 = sh5Var.a) == null) ? 500L : l2.longValue();
        final long longValue2 = (sh5Var == null || (l = sh5Var.b) == null) ? 5000L : l.longValue();
        rxaVar.getClass();
        final boolean z = longValue > 0;
        if (z) {
            vx6Var.k();
        }
        qld.I(longValue, new Function0(z, vx6Var, rxaVar, lxaVar, longValue2) { // from class: pxa
            public final /* synthetic */ boolean b;
            public final /* synthetic */ txa c;
            public final /* synthetic */ lxa d;
            public final /* synthetic */ long e;

            {
                this.d = lxaVar;
                this.e = longValue2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                t tVar2 = t.this;
                boolean isDestroyed = tVar2.isDestroyed();
                boolean z2 = this.b;
                txa txaVar = this.c;
                if (isDestroyed || tVar2.isFinishing()) {
                    if (z2) {
                        txaVar.e();
                    }
                    return Unit.a;
                }
                oxa oxaVar = new oxa(tVar2);
                pu0 t = pd.t(new qzm[0]);
                AccessibilityManager a = l1b.a(tVar2);
                long j = (a.isEnabled() && a.isTouchExplorationEnabled()) ? 20000L : this.e;
                qxa qxaVar = new qxa(txaVar, 0);
                qxa qxaVar2 = new qxa(txaVar, 1);
                wn5 wn5Var = new wn5(new xk(28, this.d, oxaVar, txaVar), 1004614109, true);
                int s = qdq.s(tVar2);
                y supportFragmentManager = tVar2.getSupportFragmentManager();
                supportFragmentManager.getClass();
                mls mlsVar = mls.a;
                int i = s + 10;
                wn5 wn5Var2 = new wn5(new f6p(11, t, wn5Var), 1431477956, true);
                if (supportFragmentManager.D("TOAST_DIALOG_TAG") == null) {
                    lls llsVar = new lls();
                    llsVar.setArguments(cxb.K(new Pair("GRAVITY", mlsVar), new Pair("Y_MARGIN_DP", Integer.valueOf(i)), new Pair("DURATION_MILLIS", Long.valueOf(j))));
                    llsVar.h = qxaVar;
                    llsVar.i = qxaVar2;
                    llsVar.g = wn5Var2;
                    llsVar.show(supportFragmentManager, "TOAST_DIALOG_TAG");
                } else if (z2) {
                    txaVar.e();
                }
                return Unit.a;
            }
        });
    }
}
