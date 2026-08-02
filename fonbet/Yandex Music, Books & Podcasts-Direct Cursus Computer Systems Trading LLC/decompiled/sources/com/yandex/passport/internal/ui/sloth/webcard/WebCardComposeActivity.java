package com.yandex.passport.internal.ui.sloth.webcard;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.vwb;
import defpackage.wn5;
import defpackage.z7o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class WebCardComposeActivity extends hn5 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object t7oVar;
        Bundle extras;
        super.onCreate(bundle);
        try {
            r7o r7oVar = z7o.b;
            extras = getIntent().getExtras();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (extras == null) {
            throw new IllegalStateException("no extras data");
        }
        if (Intrinsics.d(getIntent().getAction(), "com.yandex.passport.action.DISPLAY_CODE")) {
            t7oVar = new j0(extras);
        } else {
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(extras, com.yandex.passport.sloth.data.m.class, "SlothParams") : extras.getParcelable("SlothParams");
            if (parcelable == null) {
                throw new IllegalStateException("can't get required parcelable SlothParams");
            }
            t7oVar = new k0((com.yandex.passport.sloth.data.m) parcelable);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            com.yandex.passport.internal.ui.a.r(this, com.yandex.plus.core.locale.b.w(new p0(a2)));
            return;
        }
        com.yandex.passport.common.ui.a aVar = com.yandex.passport.common.ui.a.c;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        in5.a(this, new wn5(new c(com.yandex.passport.internal.di.a.a().createWebCardComposeComponentBuilder().setInputParams((l0) t7oVar).setActivity(this).build(), this, 0), -80602397, true));
    }
}
