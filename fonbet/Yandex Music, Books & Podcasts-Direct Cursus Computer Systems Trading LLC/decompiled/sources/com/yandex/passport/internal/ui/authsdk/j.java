package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.passport.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements g {
    public final /* synthetic */ int a;
    public final Parcelable b;

    public /* synthetic */ j(int i, Parcelable parcelable) {
        this.a = i;
        this.b = parcelable;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.g
    public final void a(o oVar) {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) this.b;
                z zVar = (z) oVar;
                View view = zVar.p;
                if (view == null) {
                    Intrinsics.j("layoutAppIcon");
                    throw null;
                }
                view.setVisibility(8);
                TextView textView = zVar.l;
                if (textView == null) {
                    Intrinsics.j("textScopes");
                    throw null;
                }
                textView.setVisibility(8);
                View view2 = zVar.o;
                if (view2 == null) {
                    Intrinsics.j("layoutButtons");
                    throw null;
                }
                view2.setVisibility(8);
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
                com.yandex.passport.legacy.f.i(textView2, 16);
                ProgressBar progressBar = zVar.m;
                if (progressBar == null) {
                    Intrinsics.j("progressWithAccount");
                    throw null;
                }
                progressBar.setVisibility(0);
                TextView textView3 = zVar.j;
                if (textView3 == null) {
                    Intrinsics.j("textTitle");
                    throw null;
                }
                textView3.setText(R.string.passport_turboapp_progress_message);
                if (lVar != null) {
                    zVar.z(lVar);
                    return;
                }
                View view3 = zVar.q;
                if (view3 != null) {
                    view3.setVisibility(4);
                    return;
                } else {
                    Intrinsics.j("layoutAccount");
                    throw null;
                }
            default:
                m mVar = (m) this.b;
                mVar.getClass();
                q qVar = ((z) oVar).s;
                if (qVar != null) {
                    qVar.l.l(mVar);
                    return;
                } else {
                    Intrinsics.j("commonViewModel");
                    throw null;
                }
        }
    }
}
