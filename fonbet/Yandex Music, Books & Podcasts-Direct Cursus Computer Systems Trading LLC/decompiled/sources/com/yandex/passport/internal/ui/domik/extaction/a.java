package com.yandex.passport.internal.ui.domik.extaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.data.network.token.i;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.internal.ui.domik.d;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.a0;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.legacy.f;
import defpackage.gi;
import defpackage.vh;
import defpackage.zh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/extaction/a;", "Lcom/yandex/passport/internal/ui/domik/base/a;", "Lcom/yandex/passport/internal/ui/domik/extaction/b;", "Lcom/yandex/passport/internal/ui/domik/d;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class a extends com.yandex.passport.internal.ui.domik.base.a<b, d> {
    public ProgressBar t;
    public final zh u;

    public a() {
        zh registerForActivityResult = registerForActivityResult(new vh(4), new gi(17, this));
        registerForActivityResult.getClass();
        this.u = registerForActivityResult;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final m0 F() {
        return m0.EXTERNAL_ACTION;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        str.getClass();
        return false;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        requireArguments.setClassLoader(p.class.getClassLoader());
        this.q = com.yandex.passport.internal.di.a.a().getStatefulReporter();
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            String str = ((d) this.o).b;
            if (str != null) {
                bundle2.putString("key-track-id", StringsKt.t0(str).toString());
            }
            int i = WebViewActivity.h;
            com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(((d) this.o).f());
            Context requireContext = requireContext();
            requireContext.getClass();
            Intent e = i.e(P, requireContext, ((d) this.o).a.e, a0.WEB_EXTERNAL_ACTION, bundle2);
            e.putExtras(bundle2);
            this.u.a(e);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(E().getDomikDesignProvider().a, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progress);
        findViewById.getClass();
        this.t = (ProgressBar) findViewById;
        Context requireContext = requireContext();
        ProgressBar progressBar = this.t;
        if (progressBar != null) {
            f.a(requireContext, progressBar, R.color.passport_progress_bar);
            return inflate;
        }
        Intrinsics.j("progress");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        ProgressBar progressBar = this.t;
        if (progressBar == null) {
            Intrinsics.j("progress");
            throw null;
        }
        progressBar.setVisibility(8);
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        ProgressBar progressBar = this.t;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        } else {
            Intrinsics.j("progress");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        passportProcessGlobalComponent.getClass();
        return E().newExternalActionViewModel();
    }
}
