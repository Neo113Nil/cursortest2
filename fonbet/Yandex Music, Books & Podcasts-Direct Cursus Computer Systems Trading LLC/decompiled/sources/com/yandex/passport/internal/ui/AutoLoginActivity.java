package com.yandex.passport.internal.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.app.q;
import com.yandex.passport.R;
import com.yandex.passport.api.x;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.diary.i0;
import com.yandex.passport.internal.report.diary.m0;
import com.yandex.passport.internal.util.p;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.e3o;
import defpackage.tot;
import defpackage.xy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AutoLoginActivity extends com.yandex.passport.internal.ui.base.e {
    public static final /* synthetic */ int m = 0;
    public com.yandex.passport.legacy.lx.j j;
    public com.yandex.passport.internal.properties.g k;
    public o0 l;

    @Override // com.yandex.passport.internal.ui.base.e, android.app.Activity
    public final void finish() {
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.yandex.passport.internal.ui.base.e
    public final y1 m() {
        com.yandex.passport.internal.properties.g gVar = this.k;
        if (gVar != null) {
            return gVar.b;
        }
        Intrinsics.j("properties");
        throw null;
    }

    @Override // com.yandex.passport.internal.ui.base.e, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            Bundle extras = getIntent().getExtras();
            extras.getClass();
            extras.setClassLoader(p.class.getClassLoader());
            com.yandex.passport.internal.properties.g gVar = (com.yandex.passport.internal.properties.g) extras.getParcelable("passport-auto-login-properties");
            if (gVar == null) {
                throw new IllegalStateException("Bundle has no ".concat(com.yandex.passport.internal.properties.g.class.getSimpleName()));
            }
            this.k = gVar;
            super.onCreate(bundle);
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            com.yandex.passport.internal.network.requester.e imageLoadingClient = a.getImageLoadingClient();
            com.yandex.passport.internal.core.accounts.e accountsRetriever = a.getAccountsRetriever();
            m0 diaryRecorder = a.getDiaryRecorder();
            Bundle extras2 = getIntent().getExtras();
            extras2.getClass();
            diaryRecorder.a(i0.a, extras2, null);
            this.l = a.getEventReporter();
            Bundle extras3 = getIntent().getExtras();
            extras3.getClass();
            z1 z1Var = (z1) com.appsflyer.internal.k.h(extras3, p.class, "passport-uid");
            if (z1Var == null) {
                throw new ParcelFormatException("Invalid parcelable " + z1.class.getSimpleName() + " in the bundle");
            }
            if (bundle == null) {
                o0 o0Var = this.l;
                if (o0Var == null) {
                    Intrinsics.j("eventReporter");
                    throw null;
                }
                o0Var.a.b(com.yandex.passport.internal.analytics.d.c, new xy0(0));
            }
            com.yandex.passport.internal.l e = accountsRetriever.a().e(com.yandex.plus.pay.ui.core.b.L(z1Var));
            if (e == null) {
                finish();
                return;
            }
            com.yandex.passport.common.core.g gVar2 = e.e;
            String str = gVar2.r;
            if (TextUtils.isEmpty(str)) {
                str = e.i();
            }
            TextView textView = this.d;
            if (textView == null) {
                Intrinsics.j("textMessage");
                throw null;
            }
            textView.setText(getString(R.string.passport_autologin_text, str));
            TextView textView2 = this.e;
            if (textView2 == null) {
                Intrinsics.j("textEmail");
                throw null;
            }
            textView2.setText(gVar2.i);
            TextView textView3 = this.f;
            if (textView3 == null) {
                Intrinsics.j("textSubMessage");
                throw null;
            }
            com.yandex.passport.internal.properties.g gVar3 = this.k;
            if (gVar3 == null) {
                Intrinsics.j("properties");
                throw null;
            }
            String str2 = gVar3.d;
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (isEmpty) {
                str2 = "";
            }
            textView3.setText(str2);
            textView3.setVisibility(isEmpty ? 8 : 0);
            String g = e.g();
            if (g != null && com.yandex.passport.common.url.b.n(g) && !gVar2.k) {
                String g2 = e.g();
                if (g2 == null) {
                    g2 = null;
                }
                g2.getClass();
                this.j = new com.yandex.passport.legacy.lx.e(imageLoadingClient.a(g2)).h(new tot(14, this), new q(13));
            }
            CircleImageView circleImageView = this.g;
            if (circleImageView == null) {
                Intrinsics.j("imageAvatar");
                throw null;
            }
            Resources resources = getResources();
            int i = R.drawable.passport_ico_user;
            Resources.Theme theme = getTheme();
            ThreadLocal threadLocal = e3o.a;
            circleImageView.setImageDrawable(resources.getDrawable(i, theme));
        } catch (Exception unused) {
            com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
            jVar.N(com.yandex.passport.api.h.c);
            this.k = new com.yandex.passport.internal.properties.g(jVar.l(), y1.d, x.a, null, false, null);
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
        setResult(-1, getIntent());
        finish();
    }
}
