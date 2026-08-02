package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class sbp implements xxf, ppb, l07, i37, ydk, vbk {
    public final ddu a;
    public final p77 b;
    public final q77 c;
    public final uif d;
    public final uif e;
    public final ix6 f;
    public final boolean g;
    public kmk h;
    public mgk i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public sbp(ddu dduVar, p77 p77Var, q77 q77Var, Function0 function0, Function0 function02, ix6 ix6Var, boolean z) {
        p77Var.getClass();
        q77Var.getClass();
        this.a = dduVar;
        this.b = p77Var;
        this.c = q77Var;
        this.d = (uif) function0;
        this.e = (uif) function02;
        this.f = ix6Var;
        this.g = z;
        this.h = new kmk(p77Var.e().d, p77Var.e().e, p77Var.e().f, p77Var.e().b);
    }

    public final void A(o oVar, boolean z) {
        int i = z ? R.id.fragment_container : R.id.challenge_fragment;
        ddu dduVar = this.a;
        op2.t(dduVar, oVar, false, i, 2);
        er0 er0Var = (er0) dduVar.getDelegate();
        er0Var.A();
        View findViewById = er0Var.l.findViewById(R.id.challenge_fragment);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        H(false);
        l();
    }

    @Override // defpackage.vbk
    public final void B(bfk bfkVar) {
        bfkVar.getClass();
        Object obj = kib.a;
        a a = kib.a(this.b.b());
        if (a != null) {
            a.a(new qek(bfkVar));
        }
        lum lumVar = new lum(this, (w7o) new s7o(bfkVar), (jg3) null);
        ddu dduVar = this.a;
        dduVar.getClass();
        s7o s7oVar = new s7o(bfkVar);
        cfk cfkVar = cfk.f;
        if (!cfkVar.a.e()) {
            lumVar.Y(null);
        } else {
            dduVar.f = lumVar;
            cfkVar.a(s7oVar);
        }
    }

    @Override // defpackage.a17
    public final sdk C() {
        return this.b.f();
    }

    @Override // defpackage.i37
    public final m37 D() {
        return this.a.c;
    }

    public final void E(boolean z, uds udsVar) {
        l37 l37Var = new l37();
        l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new s9o("loading", false, z, udsVar, null, null, null, null, l9o.a))));
        ddu dduVar = this.a;
        dduVar.s(l37Var, false, R.id.loading_fragment_container);
        er0 er0Var = (er0) dduVar.getDelegate();
        er0Var.A();
        View findViewById = er0Var.l.findViewById(R.id.loading_fragment_container);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // defpackage.l07
    public final void F(fg3 fg3Var) {
        fg3Var.getClass();
    }

    @Override // defpackage.vbk
    public final void G() {
        Object obj = kib.a;
        a a = kib.a(this.b.b());
        if (a != null) {
            a.a(ogp.i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.ydk
    public final void H(boolean z) {
        ((PaymentButtonView) this.e.invoke()).setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.a17
    public final xx3 I() {
        return this.b.a().a;
    }

    public final void J(l37 l37Var) {
        u9o u9oVar;
        u9o u9oVar2;
        u9o u9oVar3;
        ddu dduVar = this.a;
        er0 er0Var = (er0) dduVar.getDelegate();
        er0Var.A();
        View findViewById = er0Var.l.findViewById(R.id.loading_fragment_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        Unit unit = null;
        if (dduVar instanceof PaymentActivity) {
            PaymentActivity paymentActivity = (PaymentActivity) dduVar;
            o C = paymentActivity.getSupportFragmentManager().C(R.id.loading_fragment_container);
            if (C != null && (u9oVar3 = (u9o) l37Var.requireArguments().getParcelable("ARG_RESULT_TYPE")) != null) {
                l37 l37Var2 = C instanceof l37 ? (l37) C : null;
                if (l37Var2 != null) {
                    Function0 function0 = l37Var.m;
                    Function0 function02 = l37Var.n;
                    Function0 function03 = l37Var.o;
                    l37Var2.m = function0;
                    l37Var2.n = function02;
                    l37Var2.o = function03;
                }
                l37 l37Var3 = C instanceof l37 ? (l37) C : null;
                if (l37Var3 != null) {
                    l37Var3.y(u9oVar3);
                    unit = Unit.a;
                }
            }
            if (unit == null) {
                paymentActivity.s(l37Var, false, R.id.loading_fragment_container);
                return;
            }
            return;
        }
        if (dduVar instanceof PreselectActivity) {
            PreselectActivity preselectActivity = (PreselectActivity) dduVar;
            o C2 = preselectActivity.getSupportFragmentManager().C(R.id.loading_fragment_container);
            if (C2 != null && (u9oVar2 = (u9o) l37Var.requireArguments().getParcelable(preselectActivity.J)) != null) {
                l37 l37Var4 = C2 instanceof l37 ? (l37) C2 : null;
                if (l37Var4 != null) {
                    l37Var4.y(u9oVar2);
                    unit = Unit.a;
                }
            }
            if (unit == null) {
                preselectActivity.s(l37Var, false, R.id.loading_fragment_container);
                return;
            }
            return;
        }
        if (dduVar instanceof BindSbpActivity) {
            BindSbpActivity bindSbpActivity = (BindSbpActivity) dduVar;
            o C3 = bindSbpActivity.getSupportFragmentManager().C(R.id.loading_fragment_container);
            if (C3 != null && (u9oVar = (u9o) l37Var.requireArguments().getParcelable("ARG_RESULT_TYPE")) != null) {
                l37 l37Var5 = C3 instanceof l37 ? (l37) C3 : null;
                if (l37Var5 != null) {
                    l37Var5.y(u9oVar);
                    unit = Unit.a;
                }
            }
            if (unit == null) {
                bindSbpActivity.s(l37Var, false, R.id.loading_fragment_container);
            }
        }
    }

    public final boolean K(Intent intent) {
        try {
            this.a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            LinkedHashMap linkedHashMap = sqg.a;
            uwf.l("Couldn't find SPB activity: " + e);
            return false;
        }
    }

    @Override // defpackage.vbk
    public final void L(int i) {
        Object obj = kib.a;
        a a = kib.a(this.b.b());
        if (a != null) {
            a.a(imp.h);
        }
        lum lumVar = new lum(this, (w7o) new u7o(Integer.valueOf(i)), (jg3) null);
        ddu dduVar = this.a;
        dduVar.getClass();
        u7o u7oVar = new u7o(Unit.a);
        cfk cfkVar = cfk.f;
        if (!cfkVar.a.e()) {
            lumVar.Y(null);
        } else {
            dduVar.f = lumVar;
            cfkVar.a(u7oVar);
        }
    }

    @Override // defpackage.a17
    public final boolean M() {
        ddu dduVar = this.a;
        if (dduVar == null) {
            dduVar = null;
        }
        return qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null);
    }

    @Override // defpackage.a17
    public final hek N() {
        return this.b.g();
    }

    public final void O(String str, aro aroVar, boolean z) {
        o t37Var = new t37();
        t37Var.setArguments(cxb.K(new Pair("ARG_EMAIL", str), new Pair("ARG_BIND_SBP_TOKEN", aroVar), new Pair("ARG_CAN_GO_BACK", Boolean.valueOf(z)), new Pair("ARG_SELECTED_BANK_SCHEME", null)));
        if (!n7w.R(q6c.e) || !n7w.R(q6c.q)) {
            t37Var = null;
        }
        if (t37Var == null) {
            t37Var = new sqo();
            t37Var.setArguments(cxb.K(new Pair("ARG_EMAIL", str), new Pair("ARG_BIND_SBP_TOKEN", aroVar), new Pair("ARG_CAN_GO_BACK", Boolean.valueOf(z)), new Pair("ARG_SELECTED_BANK_SCHEME", null)));
            l();
        }
        op2.t(this.a, t37Var, z, 0, 4);
    }

    public final void P(int i, Integer num) {
        ddu dduVar = this.a;
        if (dduVar instanceof PaymentActivity) {
            PaymentActivity paymentActivity = (PaymentActivity) dduVar;
            ((TextView) paymentActivity.R().d).setText(i);
            qdq.g((TextView) paymentActivity.R().c, num);
            ConstraintLayout constraintLayout = ((nhk) paymentActivity.D()).g;
            constraintLayout.getClass();
            ddu.L(paymentActivity, true, constraintLayout);
            return;
        }
        if (dduVar instanceof PreselectActivity) {
            PreselectActivity preselectActivity = (PreselectActivity) dduVar;
            ((TextView) preselectActivity.R().d).setText(i);
            qdq.g((TextView) preselectActivity.R().c, num);
            ConstraintLayout constraintLayout2 = ((ohk) preselectActivity.D()).f;
            constraintLayout2.getClass();
            ddu.L(preselectActivity, true, constraintLayout2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arf, java.lang.Object] */
    @Override // defpackage.xxf
    public final u8q a() {
        ddu dduVar = this.a;
        if (dduVar instanceof PreselectActivity) {
            return ((PreselectActivity) dduVar).C();
        }
        if (dduVar instanceof PaymentActivity) {
            return ((PaymentActivity) dduVar).C();
        }
        if (dduVar instanceof BindSbpActivity) {
            return (u8q) ((BindSbpActivity) dduVar).p.getValue();
        }
        rj7.i(dduVar, " not provide activity view model", "Activity ");
        return null;
    }

    @Override // defpackage.xxf
    public final Object b(o oVar, Class cls) {
        return ((rsd) qld.y(oVar)).a().b(cls);
    }

    @Override // defpackage.a17
    public final boolean c() {
        mgk H;
        if (n7w.R(q6c.w)) {
            rdk rdkVar = avf.t(this.b.f()).g;
            if ((rdkVar == null || (H = rdkVar.H()) == null) ? false : H.f.p) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.xxf
    public final void d() {
        ((PaymentButtonView) this.e.invoke()).setVisibility(8);
    }

    public final void e() {
        Object obj = kib.a;
        p77 p77Var = this.b;
        a a = kib.a(p77Var.b());
        if (a != null) {
            a.a(b3i.h);
        }
        jek a2 = this.c.a();
        if (a2.h) {
            mgk mgkVar = a2.f;
            if (mgkVar == null) {
                Intrinsics.j("payment");
                throw null;
            }
            mgkVar.a.a();
            mgkVar.h.invoke();
        }
        ((tdk) p77Var.f()).h.c();
        this.a.k();
    }

    public final g3j f() {
        ddu dduVar = this.a;
        PreselectActivity preselectActivity = dduVar instanceof PreselectActivity ? (PreselectActivity) dduVar : null;
        sdp sdpVar = preselectActivity != null ? preselectActivity.z : null;
        rdp rdpVar = sdpVar instanceof rdp ? (rdp) sdpVar : null;
        if (rdpVar != null) {
            return rdpVar.b;
        }
        return null;
    }

    @Override // defpackage.i37
    public final void finish() {
        this.a.k();
    }

    @Override // defpackage.l07
    public final void g(bfk bfkVar) {
        bfkVar.getClass();
    }

    @Override // defpackage.x5j
    public final g0c getEventReporter() {
        return this.b.c();
    }

    public final void h() {
        this.a.r(R.id.challenge_fragment);
    }

    @Override // defpackage.ppb
    public final d51 i() {
        return new d51(22);
    }

    @Override // defpackage.a17
    public final e88 j() {
        return new e88(15);
    }

    @Override // defpackage.vbk
    public final void k(String str, List list) {
        str.getClass();
        list.getClass();
        if (n7w.R(q6c.B) && this.j) {
            return;
        }
        hv3 b = ((f0n) this.f.b).b();
        ugk ugkVar = this.b.d().a;
        y7w y7wVar = new y7w();
        y7wVar.l = b;
        y7wVar.setArguments(zwf.y(str, ugkVar, list, true));
        ddu dduVar = this.a;
        op2.t(dduVar, y7wVar, false, R.id.challenge_fragment, 2);
        er0 er0Var = (er0) dduVar.getDelegate();
        er0Var.A();
        View findViewById = er0Var.l.findViewById(R.id.challenge_fragment);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        l();
    }

    public final void l() {
        ddu dduVar = this.a;
        dduVar.r(R.id.loading_fragment_container);
        dduVar.p();
    }

    @Override // defpackage.a17
    public final boolean m() {
        return n7w.R(q6c.x) && n7w.R(q6c.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.xxf
    public final void n(boolean z) {
        TextView textView = (TextView) this.d.invoke();
        CharSequence text = textView.getText();
        text.getClass();
        if (StringsKt.U(text)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // defpackage.a17
    public final int o() {
        ues uesVar = hmd.a;
        Context baseContext = this.a.getBaseContext();
        baseContext.getClass();
        return hmd.a(baseContext);
    }

    public final void p(jg3 jg3Var) {
        jg3Var.getClass();
        Object obj = kib.a;
        a a = kib.a(this.b.b());
        if (a != null) {
            a.a(imp.h);
        }
        lum lumVar = new lum(this, (w7o) new u7o(Integer.valueOf(R.string.paymentsdk_bind_sbp_token)), jg3Var);
        ddu dduVar = this.a;
        dduVar.getClass();
        u7o u7oVar = new u7o(Unit.a);
        cfk cfkVar = cfk.f;
        if (!cfkVar.a.e()) {
            lumVar.Y(null);
        } else {
            dduVar.f = lumVar;
            cfkVar.a(u7oVar);
        }
    }

    @Override // defpackage.a17
    public final void q(wds wdsVar) {
        String string;
        ddu dduVar = this.a;
        if (!(dduVar instanceof PaymentActivity)) {
            if (dduVar instanceof PreselectActivity) {
                ((PreselectActivity) dduVar).T(wdsVar, null);
                return;
            }
            return;
        }
        PaymentActivity paymentActivity = (PaymentActivity) dduVar;
        if (wdsVar instanceof vds) {
            string = ((vds) wdsVar).a;
        } else if (!(wdsVar instanceof uds)) {
            b6e.s();
            return;
        } else {
            string = paymentActivity.getString(((uds) wdsVar).a);
            string.getClass();
        }
        ((TextView) paymentActivity.R().d).setText(string);
        ((ImageView) paymentActivity.R().b).setVisibility(8);
        qdq.g((TextView) paymentActivity.R().c, null);
        ((View) paymentActivity.R().a).announceForAccessibility(string + StringUtil.SPACE + "");
        ConstraintLayout constraintLayout = ((nhk) paymentActivity.D()).g;
        constraintLayout.getClass();
        ddu.L(paymentActivity, true, constraintLayout);
    }

    public final void r(bfk bfkVar) {
        bfkVar.getClass();
        Object obj = kib.a;
        a a = kib.a(this.b.b());
        if (a != null) {
            a.a(new qek(bfkVar));
        }
        lum lumVar = new lum(this, (w7o) new s7o(bfkVar), (jg3) null);
        ddu dduVar = this.a;
        dduVar.getClass();
        s7o s7oVar = new s7o(bfkVar);
        cfk cfkVar = cfk.f;
        if (!cfkVar.a.e()) {
            lumVar.Y(null);
        } else {
            dduVar.f = lumVar;
            cfkVar.a(s7oVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, uif] */
    public final void s(fek fekVar) {
        ((PaymentButtonView) this.e.invoke()).setState(fekVar);
    }

    @Override // defpackage.vbk
    public final void t() {
        this.a.r(R.id.challenge_fragment);
    }

    @Override // defpackage.a17
    public final mgk u() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function0, uif] */
    public final void v(String str, String str2, String str3) {
        str.getClass();
        ((PaymentButtonView) this.e.invoke()).t(str, str2, null);
    }

    @Override // defpackage.a17
    public final void w() {
        ddu dduVar = this.a;
        PaymentActivity paymentActivity = dduVar instanceof PaymentActivity ? (PaymentActivity) dduVar : null;
        if (paymentActivity != null) {
            nhk nhkVar = (nhk) paymentActivity.D();
            nhkVar.f.setVisibility(8);
            nhkVar.c.setVisibility(8);
            nhkVar.i.setVisibility(8);
        }
    }

    @Override // defpackage.vbk
    public final void x(String str) {
        str.getClass();
        k(str, c5b.a);
    }

    @Override // defpackage.xxf
    public final fs7 y() {
        return new fs7(26);
    }

    public final void z(boolean z) {
        o oVar;
        ddu dduVar = this.a;
        if (!z) {
            dduVar.q();
        }
        Object systemService = dduVar.getApplicationContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean R = n7w.R(q6c.e);
        p77 p77Var = this.b;
        if (R && n7w.R(q6c.l)) {
            boolean d = p77Var.e().d();
            boolean z2 = n7w.R(q6c.t) && !accessibilityManager.isEnabled();
            boolean R2 = n7w.R(q6c.E);
            oVar = new u07();
            oVar.setArguments(cxb.K(new Pair("ARG_BIND_TYPE", new m13(z2, true, z, d, R2))));
        } else {
            boolean d2 = p77Var.e().d();
            pmk pmkVar = (pmk) p77Var.s.get();
            mgk mgkVar = this.i;
            mgkVar.getClass();
            wgk f = mgkVar.f();
            boolean z3 = p77Var.a().q;
            pmkVar.getClass();
            c3j c3jVar = new c3j();
            c3jVar.setArguments(cxb.K(new Pair("ARG_IS_BACK_BUTTON_ENABLED", Boolean.valueOf(z)), new Pair("ARG_SHOULD_SHOW_SAVE_CARD", Boolean.valueOf(d2)), new Pair("ARG_PERSONAL_INFO_VISIBILITY", pmkVar), new Pair("ARG_PAYMENT_SETTINGS", f), new Pair("ARG_SHOW_CHARITY_LABEL", Boolean.valueOf(z3))));
            oVar = c3jVar;
        }
        op2.t(dduVar, oVar, true, 0, 4);
        l();
    }
}
