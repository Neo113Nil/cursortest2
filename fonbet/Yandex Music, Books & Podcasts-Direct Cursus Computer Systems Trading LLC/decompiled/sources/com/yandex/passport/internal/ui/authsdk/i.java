package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.z75;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements g {
    public final /* synthetic */ int a;
    public final com.yandex.passport.internal.l b;
    public final Parcelable c;

    public /* synthetic */ i(Parcelable parcelable, com.yandex.passport.internal.l lVar, int i) {
        this.a = i;
        this.c = parcelable;
        this.b = lVar;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.g
    public final void a(o oVar) {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.network.response.g gVar = (com.yandex.passport.internal.network.response.g) this.c;
                z zVar = (z) oVar;
                gVar.getClass();
                com.yandex.passport.internal.l lVar = this.b;
                lVar.getClass();
                ArrayList arrayList = gVar.g;
                if (arrayList.isEmpty()) {
                    k kVar = zVar.t;
                    if (kVar != null) {
                        kVar.M();
                        return;
                    } else {
                        Intrinsics.j("viewModel");
                        throw null;
                    }
                }
                ProgressBar progressBar = zVar.m;
                if (progressBar == null) {
                    Intrinsics.j("progressWithAccount");
                    throw null;
                }
                progressBar.setVisibility(8);
                View view = zVar.p;
                if (view == null) {
                    Intrinsics.j("layoutAppIcon");
                    throw null;
                }
                view.setVisibility(0);
                TextView textView = zVar.l;
                if (textView == null) {
                    Intrinsics.j("textScopes");
                    throw null;
                }
                textView.setVisibility(0);
                View view2 = zVar.o;
                if (view2 == null) {
                    Intrinsics.j("layoutButtons");
                    throw null;
                }
                view2.setVisibility(0);
                Button button = zVar.r;
                if (button == null) {
                    Intrinsics.j("buttonRetry");
                    throw null;
                }
                button.setVisibility(8);
                TextView textView2 = zVar.j;
                if (textView2 == null) {
                    Intrinsics.j("textTitle");
                    throw null;
                }
                com.yandex.passport.legacy.f.i(textView2, 24);
                TextView textView3 = zVar.j;
                if (textView3 == null) {
                    Intrinsics.j("textTitle");
                    throw null;
                }
                textView3.setText(zVar.getString(R.string.passport_turboapp_app_title, gVar.b));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z75.t(arrayList2, ((com.yandex.passport.internal.network.response.f) it.next()).b);
                }
                String X = CollectionsKt.X(arrayList2, ", ", null, null, new com.yandex.passport.internal.storage.d(2), 30);
                TextView textView4 = zVar.l;
                if (textView4 == null) {
                    Intrinsics.j("textScopes");
                    throw null;
                }
                textView4.setText(zVar.getString(R.string.passport_turboapp_app_scopes, X));
                String str = gVar.c;
                if (!TextUtils.isEmpty(str)) {
                    ImageView imageView = zVar.h;
                    if (imageView == null) {
                        Intrinsics.j("imageAppIcon");
                        throw null;
                    }
                    imageView.setTag(str);
                    k kVar2 = zVar.t;
                    if (kVar2 == null) {
                        Intrinsics.j("viewModel");
                        throw null;
                    }
                    com.yandex.passport.internal.network.requester.e eVar = zVar.g;
                    if (eVar == null) {
                        Intrinsics.j("imageLoadingClient");
                        throw null;
                    }
                    str.getClass();
                    kVar2.m.a(new com.yandex.passport.legacy.lx.e(eVar.a(str)).h(new com.yandex.passport.internal.ui.l(2, zVar, str), new androidx.core.app.q(15)));
                }
                zVar.z(lVar);
                return;
            default:
                com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) this.c;
                z zVar2 = (z) oVar;
                fVar.getClass();
                String str2 = fVar.a;
                com.yandex.passport.internal.l lVar2 = this.b;
                lVar2.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, str2, 8);
                }
                ProgressBar progressBar2 = zVar2.m;
                if (progressBar2 == null) {
                    Intrinsics.j("progressWithAccount");
                    throw null;
                }
                progressBar2.setVisibility(8);
                View view3 = zVar2.p;
                if (view3 == null) {
                    Intrinsics.j("layoutAppIcon");
                    throw null;
                }
                view3.setVisibility(8);
                TextView textView5 = zVar2.l;
                if (textView5 == null) {
                    Intrinsics.j("textScopes");
                    throw null;
                }
                textView5.setVisibility(8);
                View view4 = zVar2.o;
                if (view4 == null) {
                    Intrinsics.j("layoutButtons");
                    throw null;
                }
                view4.setVisibility(8);
                Button button2 = zVar2.r;
                if (button2 == null) {
                    Intrinsics.j("buttonRetry");
                    throw null;
                }
                button2.setVisibility(0);
                TextView textView6 = zVar2.j;
                if (textView6 == null) {
                    Intrinsics.j("textTitle");
                    throw null;
                }
                com.yandex.passport.legacy.f.i(textView6, 16);
                Throwable th = fVar.b;
                if (th instanceof IOException) {
                    TextView textView7 = zVar2.j;
                    if (textView7 == null) {
                        Intrinsics.j("textTitle");
                        throw null;
                    }
                    textView7.setText(R.string.passport_error_network);
                } else if (!(th instanceof com.yandex.passport.data.exceptions.h)) {
                    TextView textView8 = zVar2.j;
                    if (textView8 == null) {
                        Intrinsics.j("textTitle");
                        throw null;
                    }
                    textView8.setText(R.string.passport_am_error_try_again);
                } else if ("app_id.not_matched".equals(th.getMessage()) || "fingerprint.not_matched".equals(th.getMessage())) {
                    TextView textView9 = zVar2.j;
                    if (textView9 == null) {
                        Intrinsics.j("textTitle");
                        throw null;
                    }
                    textView9.setText(R.string.passport_error_auth_sdk_developer_error);
                } else {
                    TextView textView10 = zVar2.j;
                    if (textView10 == null) {
                        Intrinsics.j("textTitle");
                        throw null;
                    }
                    textView10.setText(zVar2.getString(R.string.passport_am_error_try_again) + "\n(" + str2 + ')');
                }
                zVar2.z(lVar2);
                return;
        }
    }
}
