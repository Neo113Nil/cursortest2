package com.yandex.payment.sdk.ui.challenger;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import defpackage.b27;
import defpackage.b6e;
import defpackage.bml;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dag;
import defpackage.f96;
import defpackage.g0c;
import defpackage.gb4;
import defpackage.gut;
import defpackage.hb4;
import defpackage.hmd;
import defpackage.hq0;
import defpackage.ib4;
import defpackage.iqo;
import defpackage.jj4;
import defpackage.jqo;
import defpackage.jyr;
import defpackage.kpo;
import defpackage.l8t;
import defpackage.ln;
import defpackage.mfk;
import defpackage.n7w;
import defpackage.opo;
import defpackage.ppo;
import defpackage.q6c;
import defpackage.qdq;
import defpackage.qne;
import defpackage.qpo;
import defpackage.uy6;
import defpackage.voi;
import defpackage.whk;
import defpackage.x60;
import defpackage.xdh;
import defpackage.xpo;
import defpackage.xq0;
import defpackage.zov;
import kotlin.Pair;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class SbpChallengerActivity extends hq0 {
    public static final /* synthetic */ int f = 0;
    public xdh a;
    public ln b;
    public final jyr c = btf.b(new ppo(this, 1));
    public final Object d = btf.a(bwf.c, new ppo(this, 0));
    public CountDownTimer e;

    public static final void j(SbpChallengerActivity sbpChallengerActivity, boolean z) {
        f96 f96Var = new f96();
        f96Var.f((ConstraintLayout) sbpChallengerActivity.l().c);
        if (z) {
            f96Var.t(R.id.blurView, 0);
            f96Var.e(R.id.exitFrame, 3);
            f96Var.g(R.id.exitFrame, 4, 0, 4);
        } else {
            f96Var.t(R.id.blurView, 8);
            f96Var.e(R.id.exitFrame, 4);
            f96Var.g(R.id.exitFrame, 3, 0, 4);
        }
        f96Var.b((ConstraintLayout) sbpChallengerActivity.l().c);
        l8t.a((ConstraintLayout) sbpChallengerActivity.l().c, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final jqo k() {
        return (jqo) this.d.getValue();
    }

    public final xdh l() {
        xdh xdhVar = this.a;
        if (xdhVar != null) {
            return xdhVar;
        }
        xq0.q("Binding is not initialized");
        return null;
    }

    public final void m(boolean z) {
        f96 f96Var = new f96();
        f96Var.f((ConstraintLayout) l().b);
        if (z) {
            f96Var.e(R.id.snackBarLayout, 4);
            f96Var.h(R.id.snackBarLayout, 3, 0, 3, (int) (16 * Resources.getSystem().getDisplayMetrics().density));
            CountDownTimer countDownTimer = this.e;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.e = new b27(this).start();
        } else {
            f96Var.e(R.id.snackBarLayout, 3);
            f96Var.g(R.id.snackBarLayout, 4, 0, 3);
        }
        f96Var.b((ConstraintLayout) l().b);
        l8t.a((ConstraintLayout) l().b, null);
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        k().H();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Pair pair;
        int a = hmd.a(this);
        setTheme(a);
        getApplicationContext().setTheme(a);
        super.onCreate(bundle);
        final int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.paymentsdk_activity_challenger, (ViewGroup) null, false);
        int i2 = R.id.blurView;
        View v = dag.v(R.id.blurView, inflate);
        if (v != null) {
            i2 = R.id.confirmExitContainer;
            View v2 = dag.v(R.id.confirmExitContainer, inflate);
            if (v2 != null) {
                whk a2 = whk.a(v2);
                i2 = R.id.container_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) dag.v(R.id.container_layout, inflate);
                if (constraintLayout != null) {
                    i2 = R.id.exitFrame;
                    if (((FrameLayout) dag.v(R.id.exitFrame, inflate)) != null) {
                        i2 = R.id.fragmentContainer;
                        if (((FrameLayout) dag.v(R.id.fragmentContainer, inflate)) != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                            int i3 = R.id.snackBarLayout;
                            if (((LinearLayout) dag.v(R.id.snackBarLayout, inflate)) != null) {
                                i3 = R.id.snackbarTextView;
                                TextView textView = (TextView) dag.v(R.id.snackbarTextView, inflate);
                                if (textView != null) {
                                    this.a = new xdh(v, a2, constraintLayout, constraintLayout2, textView);
                                    setContentView(constraintLayout2);
                                    final int i4 = 1;
                                    if (getResources().getDisplayMetrics().widthPixels >= getResources().getDimensionPixelSize(R.dimen.paymentsdk_large_screen_width_threshold)) {
                                        ln lnVar = this.b;
                                        zov zovVar = lnVar != null ? lnVar.v : null;
                                        int i5 = -1;
                                        int i6 = zovVar == null ? -1 : opo.a[zovVar.ordinal()];
                                        if (i6 != -1) {
                                            if (i6 == 1) {
                                                Resources resources = getResources();
                                                resources.getClass();
                                                i5 = resources.getDimensionPixelSize(R.dimen.paymentsdk_large_screen_compact_width);
                                            } else if (i6 != 2) {
                                                b6e.s();
                                                return;
                                            }
                                        }
                                        constraintLayout.getLayoutParams().width = i5;
                                    }
                                    TextView textView2 = a2.e;
                                    Intent intent = getIntent();
                                    textView2.setText(qdq.B(intent != null ? Boolean.valueOf(intent.getBooleanExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_CONTEXT", false)) : null) ? R.string.paymentsdk_cancel_payment_title : R.string.paymentsdk_exit_title);
                                    a2.d.setOnClickListener(new View.OnClickListener(this) { // from class: npo
                                        public final /* synthetic */ SbpChallengerActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i7 = i;
                                            SbpChallengerActivity sbpChallengerActivity = this.b;
                                            switch (i7) {
                                                case 0:
                                                    int i8 = SbpChallengerActivity.f;
                                                    sbpChallengerActivity.k().G();
                                                    break;
                                                default:
                                                    int i9 = SbpChallengerActivity.f;
                                                    sbpChallengerActivity.k().J();
                                                    break;
                                            }
                                        }
                                    });
                                    a2.c.setOnClickListener(new View.OnClickListener(this) { // from class: npo
                                        public final /* synthetic */ SbpChallengerActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i7 = i4;
                                            SbpChallengerActivity sbpChallengerActivity = this.b;
                                            switch (i7) {
                                                case 0:
                                                    int i8 = SbpChallengerActivity.f;
                                                    sbpChallengerActivity.k().G();
                                                    break;
                                                default:
                                                    int i9 = SbpChallengerActivity.f;
                                                    sbpChallengerActivity.k().J();
                                                    break;
                                            }
                                        }
                                    });
                                    k().l.f(this, new uy6(7, new qpo(this, i)));
                                    k().o.f(this, new uy6(7, new qpo(this, i4)));
                                    kpo kpoVar = (kpo) getIntent().getParcelableExtra("CHALLENGE_INFO_DATA");
                                    mfk mfkVar = (mfk) getIntent().getParcelableExtra("SBP_TOKEN_DATA");
                                    if (kpoVar == null || mfkVar == null) {
                                        return;
                                    }
                                    jqo k = k();
                                    k.getClass();
                                    g0c g0cVar = k.n;
                                    qne c1 = gut.c1(mfkVar.a, kpoVar.c);
                                    x60 x60Var = (x60) g0cVar;
                                    x60Var.getClass();
                                    x60Var.a(c1);
                                    k.p.m(new Pair(mfkVar, kpoVar));
                                    voi voiVar = k.q;
                                    if (iqo.a[kpoVar.a.ordinal()] == 1) {
                                        k.M(Long.valueOf(kpoVar.d));
                                        pair = new Pair(ib4.c, new bml(1, k, jqo.class, "verifySbpToken", "verifySbpToken(Ljava/lang/String;)V", 0, 19));
                                    } else {
                                        String str = kpoVar.f;
                                        if (str == null) {
                                            str = "";
                                        }
                                        pair = new Pair(StringsKt.T(str, ".", 0, false, 6) == 1 ? hb4.c : gb4.c, new bml(1, k, jqo.class, "formatCode", "formatCode(Ljava/lang/String;)V", 0, 20));
                                    }
                                    voiVar.l(pair);
                                    y supportFragmentManager = getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    a aVar = new a(supportFragmentManager);
                                    aVar.e(R.id.fragmentContainer, new xpo(), null);
                                    aVar.j();
                                    return;
                                }
                            }
                            i2 = i3;
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        getWindow().setFlags(n7w.R(q6c.g) ? 0 : 8192, RemoteCameraConfig.Notification.ID);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
        getWindow().setFlags(0, RemoteCameraConfig.Notification.ID);
    }
}
