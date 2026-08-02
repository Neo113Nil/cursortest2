package com.yandex.payment.sdk.ui.bind;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import defpackage.b3i;
import defpackage.btf;
import defpackage.bwf;
import defpackage.cxb;
import defpackage.d3j;
import defpackage.dag;
import defpackage.ddu;
import defpackage.et3;
import defpackage.f0n;
import defpackage.gs4;
import defpackage.gut;
import defpackage.hv3;
import defpackage.jj4;
import defpackage.k5;
import defpackage.kib;
import defpackage.l37;
import defpackage.l83;
import defpackage.lkp;
import defpackage.mhk;
import defpackage.n13;
import defpackage.n7w;
import defpackage.p77;
import defpackage.q6c;
import defpackage.qne;
import defpackage.qpb;
import defpackage.qxp;
import defpackage.rk7;
import defpackage.rsd;
import defpackage.s77;
import defpackage.tdk;
import defpackage.u07;
import defpackage.u8q;
import defpackage.x03;
import defpackage.xq0;
import defpackage.xzi;
import defpackage.yxf;
import defpackage.znk;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public class BindCardActivity extends ddu implements rsd, f0n {
    public static final /* synthetic */ int u = 0;
    public gs4 q;
    public final Object p = btf.a(bwf.c, new k5(12, this));
    public final xzi r = new xzi(this);
    public final znk s = new znk(8, this);
    public final l83 t = new l83(3, this);

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.ddu
    public final u8q C() {
        return (u8q) this.p.getValue();
    }

    @Override // defpackage.ddu
    public final View E() {
        return ((mhk) D()).b;
    }

    @Override // defpackage.ddu
    public final TextView F() {
        return ((mhk) D()).h;
    }

    @Override // defpackage.ddu
    public final ConstraintLayout G() {
        return ((mhk) D()).d;
    }

    @Override // defpackage.ddu
    public final FrameLayout H() {
        return ((mhk) D()).f;
    }

    @Override // defpackage.ddu
    public final ImageView I() {
        return ((mhk) D()).g;
    }

    public final void O() {
        Object obj = kib.a;
        a a = kib.a(l().b());
        if (a != null) {
            a.a(b3i.h);
        }
        ((tdk) l().f()).h.c();
        k();
    }

    public final gs4 P() {
        gs4 gs4Var = this.q;
        if (gs4Var != null) {
            return gs4Var;
        }
        xq0.q("Required value was null.");
        return null;
    }

    @Override // defpackage.rsd
    public final rk7 a() {
        rk7 rk7Var = new rk7();
        rk7Var.a(p77.class, l());
        rk7Var.a(s77.class, (s77) this.b.getValue());
        return rk7Var;
    }

    @Override // defpackage.f0n
    public final hv3 b() {
        return new qxp((Object) this);
    }

    @Override // defpackage.op2
    public final BroadcastReceiver n() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.t
    public final void onAttachFragment(o oVar) {
        oVar.getClass();
        super.onAttachFragment(oVar);
        boolean z = oVar instanceof d3j;
        xzi xziVar = this.r;
        if (z) {
            xziVar.getClass();
            ((d3j) oVar).m = xziVar;
            return;
        }
        if (oVar instanceof qpb) {
            ((qpb) oVar).m(xziVar);
            return;
        }
        if (oVar instanceof u07) {
            xziVar.getClass();
            ((u07) oVar).i = xziVar;
        } else if (oVar instanceof yxf) {
            ((yxf) oVar).n(this.s);
        } else if (oVar instanceof l37) {
            xziVar.getClass();
            ((l37) oVar).g = xziVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arf, java.lang.Object] */
    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        u(gut.r());
        if (getSupportFragmentManager().H() > 1) {
            getSupportFragmentManager().T();
        } else {
            ((u8q) this.p.getValue()).H();
        }
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o d3jVar;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.paymentsdk_activity_bind, (ViewGroup) null, false);
        int i = R.id.bind_button;
        PaymentButtonView paymentButtonView = (PaymentButtonView) dag.v(R.id.bind_button, inflate);
        if (paymentButtonView != null) {
            i = R.id.blur_view;
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
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                        int i2 = R.id.sheet_container;
                                        FrameLayout frameLayout = (FrameLayout) dag.v(R.id.sheet_container, inflate);
                                        if (frameLayout != null) {
                                            i2 = R.id.slide_view;
                                            ImageView imageView = (ImageView) dag.v(R.id.slide_view, inflate);
                                            if (imageView != null) {
                                                i2 = R.id.textViewDebug;
                                                TextView textView = (TextView) dag.v(R.id.textViewDebug, inflate);
                                                if (textView != null) {
                                                    this.i = new mhk(constraintLayout2, paymentButtonView, v, v2, constraintLayout, constraintLayout2, frameLayout, imageView, textView);
                                                    this.q = gs4.j(constraintLayout2);
                                                    setContentView(constraintLayout2);
                                                    K();
                                                    N();
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) P().e;
                                                    constraintLayout3.setOnTouchListener(new x03(this, constraintLayout3.getContext()));
                                                    Object systemService = getApplicationContext().getSystemService("accessibility");
                                                    systemService.getClass();
                                                    AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                                                    getSupportFragmentManager().W(-1, 1);
                                                    b3i b3iVar = new b3i(19);
                                                    if (!n7w.R(q6c.e) || !n7w.R(q6c.l)) {
                                                        b3iVar = null;
                                                    }
                                                    if (b3iVar != null) {
                                                        String stringExtra = getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.VERIFY_CARD_ID");
                                                        boolean z = n7w.R(q6c.t) && !accessibilityManager.isEnabled();
                                                        boolean R = n7w.R(q6c.E);
                                                        d3jVar = new u07();
                                                        d3jVar.setArguments(cxb.K(new Pair("ARG_BIND_TYPE", new n13(stringExtra, z, false, R))));
                                                    } else {
                                                        String stringExtra2 = getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.VERIFY_CARD_ID");
                                                        et3 et3Var = (et3) getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.EXTRA_CAMERA_CARD_SCANNER");
                                                        d3jVar = new d3j();
                                                        d3jVar.setArguments(cxb.K(new Pair("ARG_VERIFY_CARD_ID", stringExtra2), new Pair("CAMERA_CARD_SCANNER_PROVIDER", et3Var)));
                                                    }
                                                    y supportFragmentManager = getSupportFragmentManager();
                                                    supportFragmentManager.getClass();
                                                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                                    aVar.c(null);
                                                    aVar.e(R.id.fragment_container, d3jVar, null);
                                                    aVar.k(true, true);
                                                    return;
                                                }
                                            }
                                        }
                                        i = i2;
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

    @Override // defpackage.op2
    public final void z() {
        qne s;
        lkp lkpVar = lkp.success;
        s = gut.s(lkp.dismissed, null);
        u(s);
        O();
    }
}
