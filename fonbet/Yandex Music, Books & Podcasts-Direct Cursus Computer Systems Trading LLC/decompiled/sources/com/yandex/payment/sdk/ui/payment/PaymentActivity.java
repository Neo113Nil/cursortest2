package com.yandex.payment.sdk.ui.payment;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.yandex.plus.core.locale.b;
import defpackage.b3i;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c3j;
import defpackage.cxb;
import defpackage.ddu;
import defpackage.eg6;
import defpackage.ehk;
import defpackage.ei6;
import defpackage.f0n;
import defpackage.gs4;
import defpackage.gut;
import defpackage.hfk;
import defpackage.hv3;
import defpackage.ix6;
import defpackage.jek;
import defpackage.jyr;
import defpackage.l37;
import defpackage.l83;
import defpackage.lkp;
import defpackage.lqo;
import defpackage.mgk;
import defpackage.n7w;
import defpackage.nbp;
import defpackage.nfk;
import defpackage.nhk;
import defpackage.nxi;
import defpackage.o17;
import defpackage.ocg;
import defpackage.odk;
import defpackage.op2;
import defpackage.p77;
import defpackage.pmk;
import defpackage.q6c;
import defpackage.q77;
import defpackage.qdq;
import defpackage.qee;
import defpackage.qne;
import defpackage.qpb;
import defpackage.qzc;
import defpackage.rbp;
import defpackage.rfk;
import defpackage.rk7;
import defpackage.rsd;
import defpackage.s77;
import defpackage.s9k;
import defpackage.sbp;
import defpackage.t37;
import defpackage.u07;
import defpackage.u7g;
import defpackage.u8q;
import defpackage.x03;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y7w;
import defpackage.yxf;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public class PaymentActivity extends ddu implements rsd, f0n {
    public static final /* synthetic */ int x = 0;
    public gs4 p;
    public rfk s;
    public sbp t;
    public eg6 u;
    public Pair v;
    public final Object q = btf.a(bwf.c, new odk(this, 0));
    public final jyr r = btf.b(new odk(this, 3));
    public final l83 w = new l83(16, this);

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

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.ddu
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final u8q C() {
        return (u8q) this.q.getValue();
    }

    public final sbp P() {
        sbp sbpVar = this.t;
        if (sbpVar != null) {
            return sbpVar;
        }
        sbp sbpVar2 = new sbp(this, l(), (q77) this.r.getValue(), new odk(this, 1), new odk(this, 2), new ix6(2, this), getIntent().getBooleanExtra("EXTRA_IS_TRANSPORT_CARDS_FLOW", false));
        this.t = sbpVar2;
        return sbpVar2;
    }

    public final o Q(String str) {
        b3i b3iVar = new b3i(19);
        if ((!n7w.R(q6c.e) || !n7w.R(q6c.o)) && !CollectionsKt.I(xz0.Y(new rfk[]{nfk.a, hfk.a}), this.s)) {
            b3iVar = null;
        }
        rfk rfkVar = this.s;
        if (b3iVar != null) {
            return b3i.U(rfkVar, str, n7w.R(q6c.z));
        }
        pmk pmkVar = (pmk) l().s.get();
        pmkVar.getClass();
        rbp rbpVar = new rbp();
        rbpVar.setArguments(cxb.K(new Pair("ARG_PREFERRED_METHOD", rfkVar), new Pair("ARG_PERSONAL_INFO_STATE", pmkVar)));
        return rbpVar;
    }

    public final gs4 R() {
        gs4 gs4Var = this.p;
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
        rk7Var.a(q77.class, (q77) this.r.getValue());
        return rk7Var;
    }

    @Override // defpackage.f0n
    public final hv3 b() {
        return new qzc(19, this);
    }

    @Override // defpackage.op2
    public final BroadcastReceiver n() {
        return this.w;
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 38215 || s9k.b() == null) {
            return;
        }
        Long valueOf = (i == 38215 && i2 == -1 && intent != null) ? Long.valueOf(b.j(intent.getExtras()).a.b) : null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            Intent intent2 = this.e;
            if (intent2 != null) {
                intent2.putExtra("PASSPORT_UID", longValue);
            }
            k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.t
    public final void onAttachFragment(o oVar) {
        oVar.getClass();
        super.onAttachFragment(oVar);
        sbp P = P();
        if (oVar instanceof rbp) {
            ((rbp) oVar).p = P;
            return;
        }
        if (oVar instanceof c3j) {
            ((c3j) oVar).r = P;
            return;
        }
        if (oVar instanceof ei6) {
            ((ei6) oVar).i = this.u;
            return;
        }
        if (oVar instanceof nbp) {
            ((nbp) oVar).i(P);
            return;
        }
        if (oVar instanceof lqo) {
            ((lqo) oVar).k(P);
            return;
        }
        if (oVar instanceof y7w) {
            ((y7w) oVar).o = P;
            return;
        }
        if (oVar instanceof qpb) {
            ((qpb) oVar).m(P);
            return;
        }
        if (oVar instanceof u07) {
            ((u07) oVar).i = P;
            return;
        }
        if (oVar instanceof yxf) {
            ((yxf) oVar).n(P);
        } else if (oVar instanceof l37) {
            ((l37) oVar).g = P;
        } else if (oVar instanceof o17) {
            ((o17) oVar).g = P;
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        u(gut.r());
        nxi nxiVar = (nxi) C().l.d();
        if (!qdq.B(nxiVar != null ? Boolean.valueOf(nxiVar.equals(nxi.d)) : null)) {
            nxi nxiVar2 = (nxi) C().l.d();
            if (!qdq.B(nxiVar2 != null ? Boolean.valueOf(nxiVar2.equals(nxi.e)) : null)) {
                if (getSupportFragmentManager().H() <= 1) {
                    C().H();
                    return;
                }
                o C = getSupportFragmentManager().C(R.id.fragment_container);
                t37 t37Var = C instanceof t37 ? (t37) C : null;
                Boolean valueOf = t37Var != null ? Boolean.valueOf(t37Var.x().w) : null;
                if (valueOf == null || valueOf.booleanValue()) {
                    getSupportFragmentManager().T();
                    return;
                } else {
                    C().H();
                    return;
                }
            }
        }
        C().H();
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        sbp P = P();
        if (y(bundle)) {
            P.j = true;
            qee.i = true;
        }
        this.i = nhk.a(getLayoutInflater());
        super.onCreate(bundle);
        nhk nhkVar = (nhk) this.i;
        if (nhkVar != null) {
            this.p = gs4.j(nhkVar.g);
            setContentView(nhkVar.a);
            K();
        }
        N();
        N();
        TextView textView = ((nhk) D()).e;
        Resources.Theme theme = getTheme();
        theme.getClass();
        textView.setGravity(ocg.A(theme, R.attr.paymentsdk_bindCenterFooterText, false) ? 1 : 8388611);
        this.s = (rfk) getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.SELECTED_METHOD");
        ConstraintLayout constraintLayout = (ConstraintLayout) R().e;
        constraintLayout.setOnTouchListener(new x03(this, constraintLayout.getContext()));
        j();
        Pair pair = this.v;
        if (pair != null) {
            this.u = new eg6(P(), pair);
            op2.t(this, new ei6(), true, 0, 4);
        } else {
            u7g.a = null;
            u7g.b = null;
            op2.t(this, Q(null), true, 0, 4);
        }
    }

    @Override // defpackage.op2, defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.yandex.payment.sdk.ui.network.extra.EXTRA_UPDATE_PAY_BUTTON_TEXT", false)) {
            P();
        }
    }

    @Override // defpackage.op2
    public final boolean y(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN");
        parcelableExtra.getClass();
        String str = ((ehk) parcelableExtra).a;
        str.getClass();
        Pair pair = !str.equals(u7g.a) ? null : u7g.b;
        this.v = pair;
        return pair != null;
    }

    @Override // defpackage.op2
    public final void z() {
        qne s;
        lkp lkpVar = lkp.success;
        s = gut.s(lkp.dismissed, null);
        u(s);
        jek a = ((q77) this.r.getValue()).a();
        if (a.h) {
            mgk mgkVar = a.f;
            if (mgkVar == null) {
                Intrinsics.j("payment");
                throw null;
            }
            mgkVar.a.a();
            mgkVar.h.invoke();
        }
        k();
    }
}
