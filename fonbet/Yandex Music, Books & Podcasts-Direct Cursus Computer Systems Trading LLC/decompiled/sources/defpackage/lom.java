package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.o;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.util.List;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class lom implements i37, ydk, a17 {
    public final /* synthetic */ PreselectActivity a;

    public lom(PreselectActivity preselectActivity) {
        this.a = preselectActivity;
    }

    @Override // defpackage.a17
    public final sdk C() {
        return this.a.l().f();
    }

    @Override // defpackage.i37
    public final m37 D() {
        return this.a.c;
    }

    @Override // defpackage.ydk
    public final void H(boolean z) {
        ((ohk) this.a.D()).e.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.a17
    public final xx3 I() {
        return this.a.l().a().a;
    }

    @Override // defpackage.a17
    public final boolean M() {
        return this.a.m();
    }

    @Override // defpackage.a17
    public final hek N() {
        return this.a.l().g();
    }

    @Override // defpackage.i37, defpackage.a17
    public final u8q a() {
        return this.a.C();
    }

    @Override // defpackage.i37, defpackage.a17
    public final Object b(o oVar, Class cls) {
        int i = PreselectActivity.L;
        return ((rk7) this.a.I.getValue()).b(s79.class);
    }

    @Override // defpackage.a17
    public final boolean c() {
        mgk H;
        if (n7w.R(q6c.w)) {
            rdk rdkVar = avf.t(this.a.l().f()).g;
            if ((rdkVar == null || (H = rdkVar.H()) == null) ? false : H.f.p) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.a.r(R.id.challenge_fragment);
    }

    public final void e(bfk bfkVar, int i) {
        o oVar;
        bfkVar.getClass();
        Object obj = kib.a;
        PreselectActivity preselectActivity = this.a;
        a a = kib.a(preselectActivity.l().b());
        if (a != null) {
            a.a(new qek(bfkVar));
        }
        preselectActivity.w(bfkVar);
        j8o j8oVar = preselectActivity.l().a().e;
        if (j8oVar.d()) {
            preselectActivity.k();
            return;
        }
        preselectActivity.q();
        if (n7w.R(q6c.e) && n7w.R(q6c.m)) {
            uds udsVar = new uds(qgg.Y(bfkVar, i));
            uds udsVar2 = j8oVar.a ? new uds(R.string.paymentsdk_login_done) : null;
            Integer S = qgg.S(bfkVar);
            uds udsVar3 = S != null ? new uds(S.intValue()) : null;
            long j = j8oVar.b;
            x8o x8oVar = new x8o(bfkVar);
            oVar = new l37();
            oVar.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, udsVar, udsVar3, udsVar2, null, null, j, null, x8oVar))));
        } else {
            int Y = qgg.Y(bfkVar, i);
            Integer S2 = qgg.S(bfkVar);
            g8o g8oVar = new g8o();
            g8oVar.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.b), new Pair("ARG_TEXT", Integer.valueOf(Y)), new Pair("ARG_SUBTITLE", S2), new Pair("ARG_CLOSING", j8oVar)));
            oVar = g8oVar;
        }
        op2.t(preselectActivity, oVar, false, 0, 6);
    }

    public final void f(sdp sdpVar) {
        sdpVar.getClass();
        Object obj = kib.a;
        PreselectActivity preselectActivity = this.a;
        a a = kib.a(preselectActivity.l().b());
        if (a != null) {
            a.a(ovn.g);
        }
        if (!preselectActivity.s) {
            preselectActivity.x(sdpVar.getMethod());
            preselectActivity.k();
        } else {
            mom[] momVarArr = mom.a;
            preselectActivity.z = sdpVar;
            cfk.b.a(sdpVar.getMethod());
        }
    }

    @Override // defpackage.i37
    public final void finish() {
        this.a.k();
    }

    public final void h(fek fekVar) {
        ((ohk) this.a.D()).e.setState(fekVar);
    }

    public final void i(String str, String str2, String str3) {
        str.getClass();
        ((ohk) this.a.D()).e.t(str, str2, str3);
    }

    @Override // defpackage.a17
    public final e88 j() {
        return new e88(15);
    }

    public final void k(boolean z) {
        o womVar;
        PreselectActivity preselectActivity = this.a;
        if (!z) {
            preselectActivity.q();
        }
        Object systemService = preselectActivity.getApplicationContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (n7w.R(q6c.e) && n7w.R(q6c.l)) {
            boolean z2 = preselectActivity.s && !preselectActivity.t;
            boolean z3 = n7w.R(q6c.t) && !accessibilityManager.isEnabled();
            boolean R = n7w.R(q6c.E);
            womVar = new u07();
            womVar.setArguments(cxb.K(new Pair("ARG_BIND_TYPE", new o13(z3, z2, z, z2, R))));
        } else {
            boolean z4 = preselectActivity.s && !preselectActivity.t;
            womVar = new wom();
            womVar.setArguments(cxb.K(new Pair("ARG_IS_BACK_BUTTON_ENABLED", Boolean.valueOf(z)), new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z4))));
        }
        op2.t(preselectActivity, womVar, true, 0, 4);
        preselectActivity.p();
        preselectActivity.r(R.id.loading_fragment_container);
    }

    public final void l(boolean z, uds udsVar) {
        l37 l37Var = new l37();
        l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new s9o("loading", false, z, udsVar, null, null, null, null, y8o.a))));
        PreselectActivity preselectActivity = this.a;
        preselectActivity.s(l37Var, false, R.id.loading_fragment_container);
        er0 er0Var = (er0) preselectActivity.getDelegate();
        er0Var.A();
        View findViewById = er0Var.l.findViewById(R.id.loading_fragment_container);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // defpackage.a17
    public final boolean m() {
        return n7w.R(q6c.x) && n7w.R(q6c.f);
    }

    public final void n() {
        PreselectActivity preselectActivity = this.a;
        preselectActivity.q();
        boolean z = preselectActivity.s;
        String str = preselectActivity.u;
        oom oomVar = preselectActivity.A;
        o oVar = null;
        Double valueOf = oomVar != null ? Double.valueOf(oomVar.b) : null;
        String d = valueOf != null ? valueOf.toString() : null;
        v27 v27Var = new v27();
        v27Var.setArguments(cxb.K(new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z)), new Pair("DEFAULT_PAYMENT_METHOD_ID", str), new Pair("ORDER_AMOUNT", d)));
        if (n7w.R(q6c.e) && n7w.R(q6c.p)) {
            oVar = v27Var;
        }
        if (oVar == null) {
            boolean z2 = preselectActivity.s;
            String str2 = preselectActivity.u;
            oVar = new som();
            oVar.setArguments(cxb.K(new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z2)), new Pair("DEFAULT_PAYMENT_METHOD_ID", str2)));
        }
        op2.t(preselectActivity, oVar, true, 0, 4);
    }

    @Override // defpackage.a17
    public final int o() {
        ues uesVar = hmd.a;
        Context baseContext = this.a.getBaseContext();
        baseContext.getClass();
        return hmd.a(baseContext);
    }

    public final void p(String str, List list) {
        str.getClass();
        list.getClass();
        PreselectActivity preselectActivity = this.a;
        qzc qzcVar = new qzc(24, preselectActivity);
        ugk ugkVar = ((pxf) preselectActivity.g.getValue()).a;
        zdv zdvVar = new zdv();
        zdvVar.l = qzcVar;
        zdvVar.setArguments(zwf.y(str, ugkVar, list, true));
        op2.t(preselectActivity, zdvVar, false, R.id.challenge_fragment, 2);
    }

    @Override // defpackage.a17
    public final void q(wds wdsVar) {
        this.a.T(wdsVar, null);
    }

    @Override // defpackage.a17
    public final mgk u() {
        sbp sbpVar = this.a.C;
        if (sbpVar != null) {
            return sbpVar.i;
        }
        return null;
    }

    @Override // defpackage.a17
    public final void w() {
        ohk ohkVar = (ohk) this.a.D();
        ohkVar.e.setVisibility(8);
        ohkVar.b.setVisibility(8);
        ohkVar.g.setVisibility(8);
    }
}
