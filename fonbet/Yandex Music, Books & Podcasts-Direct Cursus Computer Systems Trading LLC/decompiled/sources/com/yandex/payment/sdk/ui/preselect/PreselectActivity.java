package com.yandex.payment.sdk.ui.preselect;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import defpackage.afk;
import defpackage.awc;
import defpackage.b3i;
import defpackage.b6e;
import defpackage.bfk;
import defpackage.btf;
import defpackage.bwf;
import defpackage.cek;
import defpackage.cfk;
import defpackage.cxb;
import defpackage.dag;
import defpackage.ddu;
import defpackage.dek;
import defpackage.e8o;
import defpackage.eg6;
import defpackage.ehk;
import defpackage.ei6;
import defpackage.eyf;
import defpackage.f0n;
import defpackage.f4m;
import defpackage.fek;
import defpackage.fhk;
import defpackage.g8o;
import defpackage.gc8;
import defpackage.gs4;
import defpackage.gut;
import defpackage.hv3;
import defpackage.ik0;
import defpackage.irf;
import defpackage.ix6;
import defpackage.j6e;
import defpackage.j8o;
import defpackage.jj4;
import defpackage.jw3;
import defpackage.jyr;
import defpackage.l37;
import defpackage.l83;
import defpackage.lkp;
import defpackage.lom;
import defpackage.lpm;
import defpackage.lqo;
import defpackage.mom;
import defpackage.n7w;
import defpackage.nbp;
import defpackage.nom;
import defpackage.o8g;
import defpackage.ohk;
import defpackage.oom;
import defpackage.op2;
import defpackage.oxa;
import defpackage.p77;
import defpackage.pmk;
import defpackage.q6c;
import defpackage.q77;
import defpackage.qdq;
import defpackage.qee;
import defpackage.qgg;
import defpackage.qne;
import defpackage.qpb;
import defpackage.qzc;
import defpackage.r9o;
import defpackage.rbp;
import defpackage.rdp;
import defpackage.rfk;
import defpackage.rk7;
import defpackage.rp7;
import defpackage.rsd;
import defpackage.sbp;
import defpackage.sdp;
import defpackage.som;
import defpackage.sqg;
import defpackage.tdk;
import defpackage.u07;
import defpackage.u7g;
import defpackage.u8q;
import defpackage.uds;
import defpackage.uwf;
import defpackage.v27;
import defpackage.vds;
import defpackage.wds;
import defpackage.wom;
import defpackage.x03;
import defpackage.x60;
import defpackage.x8o;
import defpackage.xq0;
import defpackage.xwj;
import defpackage.yxf;
import defpackage.z07;
import defpackage.zek;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public class PreselectActivity extends ddu implements rsd, f0n {
    public static final /* synthetic */ int L = 0;
    public oom A;
    public final lom B;
    public sbp C;
    public oxa D;
    public awc E;
    public eg6 F;
    public Pair G;
    public final l83 H;
    public final jyr I;
    public final String J;
    public q77 K;
    public gs4 p;
    public final Object q = btf.a(bwf.c, new nom(this, 0));
    public List r;
    public boolean s;
    public boolean t;
    public String u;
    public final ik0 v;
    public boolean w;
    public ehk x;
    public xwj y;
    public sdp z;

    public PreselectActivity() {
        mom[] momVarArr = mom.a;
        ik0 ik0Var = new ik0();
        ik0Var.a = new ArrayList();
        this.v = ik0Var;
        this.B = new lom(this);
        this.H = new l83(17, this);
        this.I = btf.b(new nom(this, 1));
        this.J = "ARG_RESULT_TYPE";
    }

    @Override // defpackage.ddu
    public final View E() {
        return ((ohk) D()).a;
    }

    @Override // defpackage.ddu
    public final TextView F() {
        return ((ohk) D()).h;
    }

    @Override // defpackage.ddu
    public final ConstraintLayout G() {
        return ((ohk) D()).c;
    }

    @Override // defpackage.ddu
    public final ImageView I() {
        return ((ohk) D()).g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.ddu
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final u8q C() {
        return (u8q) this.q.getValue();
    }

    public final sbp P() {
        sbp sbpVar = this.C;
        if (sbpVar != null) {
            return sbpVar;
        }
        ehk ehkVar = this.x;
        if (ehkVar == null) {
            LinkedHashMap linkedHashMap = sqg.a;
            uwf.l("Preselect and pay failed on payment restore");
            xq0.q("No token for payment restore");
            return null;
        }
        p77 l = l();
        sbp sbpVar2 = new sbp(this, l(), new q77(l.a, new j6e(ehkVar, this.y)), new nom(this, 2), new nom(this, 3), new ix6(2, this), false);
        this.C = sbpVar2;
        return sbpVar2;
    }

    public final q77 Q(Intent intent) {
        q77 q77Var;
        q77 q77Var2 = this.K;
        if (q77Var2 != null) {
            return q77Var2;
        }
        ehk ehkVar = (ehk) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN");
        if (ehkVar != null) {
            p77 l = l();
            q77Var = new q77(l.a, new j6e(ehkVar, (xwj) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.ORDER_INFO")));
        } else {
            q77Var = null;
        }
        this.K = q77Var;
        return q77Var;
    }

    public final gs4 R() {
        gs4 gs4Var = this.p;
        if (gs4Var != null) {
            return gs4Var;
        }
        xq0.q("Required value was null.");
        return null;
    }

    public final void S(String str) {
        ((TextView) R().d).setText(str);
        ((TextView) R().c).setVisibility(8);
        ConstraintLayout constraintLayout = ((ohk) D()).f;
        constraintLayout.getClass();
        ddu.L(this, true, constraintLayout);
    }

    public final void T(wds wdsVar, Integer num) {
        String string;
        if (wdsVar instanceof vds) {
            string = ((vds) wdsVar).a;
        } else if (!(wdsVar instanceof uds)) {
            b6e.s();
            return;
        } else {
            string = getString(((uds) wdsVar).a);
            string.getClass();
        }
        ((TextView) R().d).setText(string);
        ((ImageView) R().b).setVisibility(8);
        qdq.g((TextView) R().c, num);
        View view = (View) R().a;
        String string2 = num != null ? getString(num.intValue()) : null;
        if (string2 == null) {
            string2 = "";
        }
        view.announceForAccessibility(string + StringUtil.SPACE + string2);
        ConstraintLayout constraintLayout = ((ohk) D()).f;
        constraintLayout.getClass();
        ddu.L(this, true, constraintLayout);
    }

    @Override // defpackage.rsd
    public final rk7 a() {
        return (rk7) this.I.getValue();
    }

    @Override // defpackage.f0n
    public final hv3 b() {
        return new qzc(24, this);
    }

    @Override // defpackage.op2
    public final BroadcastReceiver n() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.t
    public final void onAttachFragment(o oVar) {
        oVar.getClass();
        super.onAttachFragment(oVar);
        boolean z = oVar instanceof som;
        lom lomVar = this.B;
        if (z) {
            lomVar.getClass();
            ((som) oVar).n = lomVar;
            return;
        }
        if (oVar instanceof wom) {
            lomVar.getClass();
            ((wom) oVar).n = lomVar;
            return;
        }
        if (oVar instanceof rbp) {
            ((rbp) oVar).p = P();
            return;
        }
        if (oVar instanceof eyf) {
            ((eyf) oVar).h = P();
            return;
        }
        if (oVar instanceof nbp) {
            ((nbp) oVar).i(P());
            return;
        }
        if (oVar instanceof lqo) {
            ((lqo) oVar).k(P());
            return;
        }
        if (oVar instanceof ei6) {
            ((ei6) oVar).i = this.F;
            return;
        }
        if (oVar instanceof qpb) {
            qpb qpbVar = (qpb) oVar;
            oxa oxaVar = this.D;
            if (oxaVar == null) {
                oxaVar = new oxa(29, this);
                this.D = oxaVar;
            }
            qpbVar.m(oxaVar);
            return;
        }
        if (oVar instanceof yxf) {
            yxf yxfVar = (yxf) oVar;
            awc awcVar = this.E;
            if (awcVar == null) {
                awcVar = new awc(this);
                this.E = awcVar;
            }
            yxfVar.n(awcVar);
            return;
        }
        if (oVar instanceof u07) {
            lomVar.getClass();
            ((u07) oVar).j = lomVar;
        } else if (oVar instanceof v27) {
            lomVar.getClass();
            ((v27) oVar).g = lomVar;
        } else if (oVar instanceof l37) {
            lomVar.getClass();
            ((l37) oVar).g = lomVar;
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        u(gut.r());
        if (getSupportFragmentManager().H() > 1) {
            getSupportFragmentManager().T();
        } else {
            C().H();
        }
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o oVar = null;
        this.x = bundle != null ? (ehk) bundle.getParcelable("PAYMENT_TOKEN_KEY") : null;
        this.y = bundle != null ? (xwj) bundle.getParcelable("ORDER_INFO_KEY") : null;
        if (y(bundle)) {
            P().j = true;
            qee.i = true;
        }
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.paymentsdk_activity_preselect, (ViewGroup) null, false);
        int i = R.id.blur_view;
        View v = dag.v(R.id.blur_view, inflate);
        if (v != null) {
            i = R.id.challenge_fragment;
            if (((FrameLayout) dag.v(R.id.challenge_fragment, inflate)) != null) {
                i = R.id.close_area;
                View v2 = dag.v(R.id.close_area, inflate);
                if (v2 != null) {
                    i = R.id.container_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) dag.v(R.id.container_layout, inflate);
                    if (constraintLayout != null) {
                        i = R.id.content_layout;
                        if (((LinearLayout) dag.v(R.id.content_layout, inflate)) != null) {
                            i = R.id.exit_fragment_container;
                            if (((FrameLayout) dag.v(R.id.exit_fragment_container, inflate)) != null) {
                                i = R.id.fragment_container;
                                if (((FrameLayout) dag.v(R.id.fragment_container, inflate)) != null) {
                                    i = R.id.license_agreement;
                                    TextView textView = (TextView) dag.v(R.id.license_agreement, inflate);
                                    if (textView != null) {
                                        i = R.id.loading_fragment_container;
                                        if (((FrameLayout) dag.v(R.id.loading_fragment_container, inflate)) != null) {
                                            i = R.id.preselect_button;
                                            PaymentButtonView paymentButtonView = (PaymentButtonView) dag.v(R.id.preselect_button, inflate);
                                            if (paymentButtonView != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                i = R.id.slide_view;
                                                ImageView imageView = (ImageView) dag.v(R.id.slide_view, inflate);
                                                if (imageView != null) {
                                                    i = R.id.textViewDebug;
                                                    TextView textView2 = (TextView) dag.v(R.id.textViewDebug, inflate);
                                                    if (textView2 != null) {
                                                        this.i = new ohk(constraintLayout2, v, v2, constraintLayout, textView, paymentButtonView, constraintLayout2, imageView, textView2);
                                                        this.p = gs4.j(constraintLayout2);
                                                        setContentView(constraintLayout2);
                                                        K();
                                                        N();
                                                        this.s = getIntent().getBooleanExtra("com.yandex.payment.sdk.ui.extra.START_PAYMENT_AFTER_SELECT", false);
                                                        this.t = getIntent().getBooleanExtra("com.yandex.payment.sdk.ui.extra.BIND_NEW_CARD_BEFORE_PAYMENT", false);
                                                        this.u = getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.DEFAULT_PAYMENT_METHOD_ID");
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) R().e;
                                                        constraintLayout3.setOnTouchListener(new x03(this, constraintLayout3.getContext()));
                                                        ArrayList N = o8g.N(getIntent().getParcelableArrayExtra("com.yandex.payment.sdk.ui.extra.PRESELECT_PROVIDED_PAYMENT_METHODS"));
                                                        this.r = N;
                                                        if (N != null && cfk.c.a.e()) {
                                                            this.w = true;
                                                        }
                                                        Intent intent = getIntent();
                                                        this.A = intent != null ? (oom) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PRESELECT_BUTTON_STATE") : null;
                                                        j();
                                                        Pair pair = this.G;
                                                        if (pair != null) {
                                                            this.F = new eg6(P(), pair);
                                                            op2.t(this, new ei6(), true, 0, 4);
                                                            return;
                                                        }
                                                        u7g.a = null;
                                                        u7g.b = null;
                                                        boolean z = this.s;
                                                        String str = this.u;
                                                        oom oomVar = this.A;
                                                        Double valueOf = oomVar != null ? Double.valueOf(oomVar.b) : null;
                                                        String d = valueOf != null ? valueOf.toString() : null;
                                                        o v27Var = new v27();
                                                        v27Var.setArguments(cxb.K(new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z)), new Pair("DEFAULT_PAYMENT_METHOD_ID", str), new Pair("ORDER_AMOUNT", d)));
                                                        if (n7w.R(q6c.e) && n7w.R(q6c.p)) {
                                                            oVar = v27Var;
                                                        }
                                                        if (oVar == null) {
                                                            boolean z2 = this.s;
                                                            String str2 = this.u;
                                                            o somVar = new som();
                                                            somVar.setArguments(cxb.K(new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z2)), new Pair("DEFAULT_PAYMENT_METHOD_ID", str2)));
                                                            oVar = somVar;
                                                        }
                                                        op2.t(this, oVar, true, 0, 4);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.op2, defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Unit unit;
        gc8 gc8Var;
        o g8oVar;
        o oVar;
        intent.getClass();
        q77 Q = Q(intent);
        if (Q != null) {
            ((rk7) this.I.getValue()).a(q77.class, Q);
        }
        super.onNewIntent(intent);
        ehk ehkVar = (ehk) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN");
        if (ehkVar != null) {
            x60 x60Var = (x60) l().w.get();
            String str = ehkVar.a;
            x60Var.getClass();
            str.getClass();
            x60Var.b.a.put("payment_token", str);
        } else {
            ehkVar = null;
        }
        xwj xwjVar = (xwj) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.ORDER_INFO");
        fhk fhkVar = (fhk) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN_ERROR");
        sdp sdpVar = this.z;
        ArrayList N = o8g.N(intent.getParcelableArrayExtra("com.yandex.payment.sdk.ui.extra.PRESELECT_PROVIDED_PAYMENT_METHODS"));
        if (sdpVar == null) {
            if (this.w && N != null) {
                ik0 ik0Var = this.v;
                ik0Var.getClass();
                ArrayList arrayList = ik0Var.a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(N);
                }
                arrayList.clear();
                return;
            }
            oom oomVar = (oom) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PRESELECT_BUTTON_STATE");
            if (oomVar != null) {
                double d = oomVar.b;
                if (n7w.R(q6c.e) && n7w.R(q6c.l)) {
                    o C = getSupportFragmentManager().C(R.id.fragment_container);
                    u07 u07Var = C instanceof u07 ? (u07) C : null;
                    if (u07Var != null) {
                        String string = u07Var.requireContext().getString(qdq.D(u07Var.j != null ? Integer.valueOf(R.string.paymentsdk_pay_button_title_fomatted) : null), irf.K("RUB", u07Var.z()), irf.H(d));
                        string.getClass();
                        gc8 gc8Var2 = u07Var.l;
                        if (gc8Var2 != null) {
                            gc8Var2.N("card_input_screen_pay_button_text", string);
                        }
                    }
                    o C2 = getSupportFragmentManager().C(R.id.fragment_container);
                    v27 v27Var = C2 instanceof v27 ? (v27) C2 : null;
                    if (v27Var == null || (gc8Var = v27Var.j) == null) {
                        return;
                    }
                    String format = NumberFormat.getNumberInstance().format(new BigDecimal(String.valueOf(d)));
                    format.getClass();
                    gc8Var.N("select_method_screen_order_amount", format);
                    return;
                }
                o C3 = getSupportFragmentManager().C(R.id.fragment_container);
                wom womVar = C3 instanceof wom ? (wom) C3 : null;
                if (womVar != null) {
                    lpm lpmVar = womVar.i;
                    if (lpmVar == null) {
                        Intrinsics.j("viewModel");
                        throw null;
                    }
                    lpmVar.y = oomVar;
                    lpmVar.G();
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    fek dekVar = oomVar.a ? new dek() : cek.a;
                    lom lomVar = this.B;
                    lomVar.h(dekVar);
                    Double d2 = oomVar.c;
                    String I = d2 != null ? irf.I(this, d2.doubleValue(), "RUB", l().c()) : null;
                    String string2 = getString(R.string.paymentsdk_pay_title);
                    string2.getClass();
                    lomVar.i(string2, irf.I(this, d, "RUB", l().c()), I);
                    return;
                }
                return;
            }
            return;
        }
        if (ehkVar != null) {
            this.x = ehkVar;
            this.y = xwjVar;
            sbp P = P();
            boolean z = sdpVar instanceof rdp;
            if (z && n7w.R(q6c.e) && n7w.R(q6c.l)) {
                o C4 = getSupportFragmentManager().C(R.id.fragment_container);
                u07 u07Var2 = C4 instanceof u07 ? (u07) C4 : null;
                if (u07Var2 != null) {
                    P.G();
                    z07 A = u07Var2.A();
                    if (A.G && A.w == jw3.d) {
                        ((tdk) P.b.f()).g(ehkVar, null, new rp7(P));
                    }
                }
            } else if (z) {
                o C5 = getSupportFragmentManager().C(R.id.fragment_container);
                wom womVar2 = C5 instanceof wom ? (wom) C5 : null;
                if (womVar2 != null) {
                    womVar2.o = P;
                    P.G();
                    lpm lpmVar2 = womVar2.i;
                    if (lpmVar2 == null) {
                        Intrinsics.j("viewModel");
                        throw null;
                    }
                    if (lpmVar2.n && lpmVar2.x == jw3.d) {
                        ((tdk) lpmVar2.k).g(ehkVar, null, new f4m(1, lpmVar2));
                    }
                }
            } else {
                b3i b3iVar = new b3i(19);
                if (!n7w.R(q6c.e) || !n7w.R(q6c.o)) {
                    b3iVar = null;
                }
                if (b3iVar != null) {
                    oVar = b3i.U(sdpVar.getMethod(), null, false);
                } else {
                    rfk method = sdpVar.getMethod();
                    pmk pmkVar = (pmk) l().s.get();
                    pmkVar.getClass();
                    rbp rbpVar = new rbp();
                    rbpVar.setArguments(cxb.K(new Pair("ARG_PREFERRED_METHOD", method), new Pair("ARG_PERSONAL_INFO_STATE", pmkVar)));
                    oVar = rbpVar;
                }
                op2.t(this, oVar, false, 0, 6);
            }
        } else if (fhkVar != null) {
            zek zekVar = zek.a;
            afk afkVar = afk.a;
            String localizedMessage = fhkVar.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Unable to obtain purchase token";
            }
            bfk bfkVar = new bfk(zekVar, afkVar, null, null, localizedMessage, null);
            w(bfkVar);
            j8o j8oVar = l().a().e;
            if (n7w.R(q6c.e) && n7w.R(q6c.m)) {
                uds udsVar = new uds(qgg.Y(bfkVar, R.string.paymentsdk_error_title));
                uds udsVar2 = j8oVar.a ? new uds(R.string.paymentsdk_login_done) : null;
                Integer S = qgg.S(bfkVar);
                uds udsVar3 = S != null ? new uds(S.intValue()) : null;
                long j = j8oVar.b;
                x8o x8oVar = new x8o(bfkVar);
                g8oVar = new l37();
                g8oVar.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, udsVar, udsVar3, udsVar2, null, null, j, null, x8oVar))));
            } else {
                int Y = qgg.Y(bfkVar, R.string.paymentsdk_error_title);
                Integer S2 = qgg.S(bfkVar);
                j8oVar.getClass();
                g8oVar = new g8o();
                g8oVar.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.b), new Pair("ARG_TEXT", Integer.valueOf(Y)), new Pair("ARG_SUBTITLE", S2), new Pair("ARG_CLOSING", j8oVar)));
            }
            p();
            op2.t(this, g8oVar, false, 0, 6);
        }
        mom[] momVarArr = mom.a;
    }

    @Override // defpackage.op2, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("PAYMENT_TOKEN_KEY", this.x);
        bundle.putParcelable("ORDER_INFO_KEY", this.y);
    }

    @Override // defpackage.op2
    public final boolean y(Bundle bundle) {
        ehk ehkVar;
        if (bundle == null || (ehkVar = (ehk) bundle.getParcelable("PAYMENT_TOKEN_KEY")) == null) {
            return false;
        }
        String str = ehkVar.a;
        str.getClass();
        Pair pair = !str.equals(u7g.a) ? null : u7g.b;
        this.G = pair;
        return pair != null;
    }

    @Override // defpackage.op2
    public final void z() {
        qne s;
        lkp lkpVar = lkp.success;
        s = gut.s(lkp.dismissed, null);
        u(s);
        k();
    }
}
