package com.yandex.payment.sdk.ui.payment.sbp;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import defpackage.btf;
import defpackage.bwf;
import defpackage.cxb;
import defpackage.ddu;
import defpackage.gut;
import defpackage.i13;
import defpackage.ix6;
import defpackage.jyr;
import defpackage.l37;
import defpackage.l83;
import defpackage.lqo;
import defpackage.n7w;
import defpackage.nhk;
import defpackage.op2;
import defpackage.p77;
import defpackage.q6c;
import defpackage.q77;
import defpackage.qpb;
import defpackage.rk7;
import defpackage.rsd;
import defpackage.rwd;
import defpackage.s77;
import defpackage.sbp;
import defpackage.sqo;
import defpackage.t37;
import defpackage.tdk;
import defpackage.u8q;
import defpackage.xqo;
import defpackage.yxf;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class BindSbpActivity extends ddu implements rsd {
    public static final /* synthetic */ int s = 0;
    public final Object p = btf.a(bwf.c, new i13(this, 0));
    public final jyr q = btf.b(new i13(this, 3));
    public final l83 r = new l83(5, this);

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.ddu
    public final u8q C() {
        return (u8q) this.p.getValue();
    }

    @Override // defpackage.ddu
    public final View E() {
        return ((nhk) D()).b;
    }

    @Override // defpackage.ddu
    public final TextView F() {
        return ((nhk) D()).j;
    }

    @Override // defpackage.ddu
    public final ConstraintLayout G() {
        return ((nhk) D()).d;
    }

    @Override // defpackage.ddu
    public final FrameLayout H() {
        return ((nhk) D()).h;
    }

    @Override // defpackage.ddu
    public final ImageView I() {
        return ((nhk) D()).i;
    }

    @Override // defpackage.rsd
    public final rk7 a() {
        rk7 rk7Var = new rk7();
        rk7Var.a(p77.class, l());
        rk7Var.a(s77.class, (s77) this.b.getValue());
        return rk7Var;
    }

    @Override // defpackage.op2
    public final BroadcastReceiver n() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.t
    public final void onAttachFragment(o oVar) {
        oVar.getClass();
        super.onAttachFragment(oVar);
        sbp sbpVar = new sbp(this, l(), (q77) this.q.getValue(), new i13(this, 1), new i13(this, 2), new ix6(2, new rwd(15)), false);
        if (oVar instanceof lqo) {
            ((lqo) oVar).k(sbpVar);
            return;
        }
        if (oVar instanceof yxf) {
            ((yxf) oVar).n(sbpVar);
        } else if (oVar instanceof qpb) {
            ((qpb) oVar).m(sbpVar);
        } else if (oVar instanceof l37) {
            ((l37) oVar).g = sbpVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arf, java.lang.Object] */
    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().H() > 1) {
            getSupportFragmentManager().T();
        } else {
            u(gut.r());
            ((u8q) this.p.getValue()).H();
        }
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nhk a = nhk.a(getLayoutInflater());
        this.i = a;
        setContentView(a.a);
        K();
        N();
        String stringExtra = getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.EMAIL");
        String stringExtra2 = getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.REDIRECT_URL");
        xqo xqoVar = new xqo(stringExtra2);
        o t37Var = new t37();
        Pair pair = new Pair("ARG_EMAIL", stringExtra);
        Pair pair2 = new Pair("ARG_BIND_SBP_TOKEN", xqoVar);
        Boolean bool = Boolean.FALSE;
        t37Var.setArguments(cxb.K(pair, pair2, new Pair("ARG_CAN_GO_BACK", bool), new Pair("ARG_SELECTED_BANK_SCHEME", null)));
        if (!n7w.R(q6c.e) || !n7w.R(q6c.q)) {
            t37Var = null;
        }
        if (t37Var == null) {
            xqo xqoVar2 = new xqo(stringExtra2);
            o sqoVar = new sqo();
            sqoVar.setArguments(cxb.K(new Pair("ARG_EMAIL", stringExtra), new Pair("ARG_BIND_SBP_TOKEN", xqoVar2), new Pair("ARG_CAN_GO_BACK", bool), new Pair("ARG_SELECTED_BANK_SCHEME", null)));
            p();
            t37Var = sqoVar;
        }
        op2.t(this, t37Var, true, 0, 4);
    }

    @Override // defpackage.op2
    public final void z() {
        ((tdk) l().f()).h.c();
        k();
    }
}
