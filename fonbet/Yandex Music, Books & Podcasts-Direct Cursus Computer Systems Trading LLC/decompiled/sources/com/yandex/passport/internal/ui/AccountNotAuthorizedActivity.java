package com.yandex.passport.internal.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.q;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.diary.h0;
import com.yandex.passport.internal.report.diary.m0;
import com.yandex.passport.internal.util.p;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.e3o;
import defpackage.fq2;
import defpackage.tot;
import defpackage.xq0;
import defpackage.xy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AccountNotAuthorizedActivity extends com.yandex.passport.internal.ui.base.e {
    public static final /* synthetic */ int m = 0;
    public com.yandex.passport.legacy.lx.j j;
    public com.yandex.passport.internal.properties.b k;
    public o0 l;

    @Override // com.yandex.passport.internal.ui.base.e
    public final y1 m() {
        com.yandex.passport.internal.properties.b bVar = this.k;
        if (bVar != null) {
            return bVar.b;
        }
        Intrinsics.j("properties");
        throw null;
    }

    @Override // com.yandex.passport.internal.ui.base.e
    public final void n(String str) {
        o0 o0Var = this.l;
        if (o0Var == null) {
            Intrinsics.j("eventReporter");
            throw null;
        }
        o0Var.a.b(com.yandex.passport.internal.analytics.b.e, new xy0(0));
        l().setVisibility(8);
        com.yandex.passport.internal.properties.b bVar = this.k;
        if (bVar == null) {
            Intrinsics.j("properties");
            throw null;
        }
        com.yandex.passport.internal.properties.l lVar = bVar.d;
        z1 z1Var = bVar.a;
        if (str == null) {
            str = lVar.k;
        }
        startActivityForResult(com.yandex.passport.internal.ui.router.b.b(this, com.yandex.passport.internal.properties.l.a(lVar, z1Var, str, null, 1073740735), null, 28), 1);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        overridePendingTransition(0, 0);
        setResult(i2, intent);
        k();
    }

    @Override // com.yandex.passport.internal.ui.base.e, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            Bundle extras = getIntent().getExtras();
            extras.getClass();
            extras.setClassLoader(p.class.getClassLoader());
            com.yandex.passport.internal.properties.b bVar = (com.yandex.passport.internal.properties.b) extras.getParcelable("account-not-authorized-properties");
            if (bVar == null) {
                throw new IllegalStateException("no account-not-authorized-properties key in bundle");
            }
            this.k = bVar;
            super.onCreate(bundle);
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            com.yandex.passport.internal.network.requester.e imageLoadingClient = a.getImageLoadingClient();
            com.yandex.passport.internal.core.accounts.e accountsRetriever = a.getAccountsRetriever();
            this.l = a.getEventReporter();
            m0 diaryRecorder = a.getDiaryRecorder();
            Bundle extras2 = getIntent().getExtras();
            extras2.getClass();
            diaryRecorder.a(h0.a, extras2, null);
            if (bundle == null) {
                o0 o0Var = this.l;
                if (o0Var == null) {
                    Intrinsics.j("eventReporter");
                    throw null;
                }
                o0Var.a.b(com.yandex.passport.internal.analytics.b.c, new xy0(0));
            }
            com.yandex.passport.internal.d a2 = accountsRetriever.a();
            com.yandex.passport.internal.properties.b bVar2 = this.k;
            if (bVar2 == null) {
                Intrinsics.j("properties");
                throw null;
            }
            com.yandex.passport.internal.l e = a2.e(com.yandex.plus.pay.ui.core.b.L(bVar2.a));
            if (e == null) {
                finish();
                return;
            }
            com.yandex.passport.common.core.g gVar = e.e;
            String str = gVar.r;
            if (TextUtils.isEmpty(str)) {
                str = e.i();
            }
            TextView textView = this.d;
            if (textView == null) {
                Intrinsics.j("textMessage");
                throw null;
            }
            textView.setText(getString(R.string.passport_account_not_authorized_title, str));
            TextView textView2 = this.e;
            if (textView2 == null) {
                Intrinsics.j("textEmail");
                throw null;
            }
            textView2.setText(gVar.i);
            TextView textView3 = this.f;
            if (textView3 == null) {
                Intrinsics.j("textSubMessage");
                throw null;
            }
            com.yandex.passport.internal.properties.b bVar3 = this.k;
            if (bVar3 == null) {
                Intrinsics.j("properties");
                throw null;
            }
            String str2 = bVar3.c;
            int i = R.string.passport_account_not_authorized_default_message;
            if (TextUtils.isEmpty(str2)) {
                textView3.setText(i);
            } else {
                textView3.setText(str2);
            }
            Button button = this.h;
            if (button == null) {
                Intrinsics.j("buttonAction");
                throw null;
            }
            button.setText(R.string.passport_account_not_authorized_action);
            String g = e.g();
            int i2 = 12;
            if (g != null && com.yandex.passport.common.url.b.n(g) && !gVar.k) {
                String g2 = e.g();
                if (g2 == null) {
                    xq0.x(null);
                    return;
                }
                this.j = new com.yandex.passport.legacy.lx.e(imageLoadingClient.a(g2)).h(new tot(13, this), new q(12));
            }
            CircleImageView circleImageView = this.g;
            if (circleImageView == null) {
                Intrinsics.j("imageAvatar");
                throw null;
            }
            Resources resources = getResources();
            int i3 = R.drawable.passport_ico_user;
            Resources.Theme theme = getTheme();
            ThreadLocal threadLocal = e3o.a;
            circleImageView.setImageDrawable(resources.getDrawable(i3, theme));
            Button button2 = this.h;
            if (button2 == null) {
                Intrinsics.j("buttonAction");
                throw null;
            }
            button2.setVisibility(0);
            Button button3 = this.h;
            if (button3 != null) {
                button3.setOnClickListener(new fq2(i2, this, e));
            } else {
                Intrinsics.j("buttonAction");
                throw null;
            }
        } catch (Exception unused) {
            z1 z1Var = new z1(com.yandex.passport.api.impl.b.c, 1L);
            y1 y1Var = y1.c;
            com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
            kVar.b(null);
            com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
            jVar.N(com.yandex.passport.api.h.c);
            kVar.b = jVar.l();
            this.k = new com.yandex.passport.internal.properties.b(z1Var, y1Var, null, com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar)));
            super.onCreate(bundle);
            finish();
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        com.yandex.passport.legacy.lx.j jVar = this.j;
        if (jVar != null) {
            jVar.getClass();
            jVar.a();
        }
        super.onDestroy();
    }

    @Override // com.yandex.passport.internal.ui.base.e
    public final void p() {
        o0 o0Var = this.l;
        if (o0Var == null) {
            Intrinsics.j("eventReporter");
            throw null;
        }
        o0Var.a.b(com.yandex.passport.internal.analytics.b.d, new xy0(0));
        setResult(0);
        finish();
    }
}
