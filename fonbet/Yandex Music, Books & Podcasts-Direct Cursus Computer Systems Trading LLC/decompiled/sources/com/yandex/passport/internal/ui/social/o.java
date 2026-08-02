package com.yandex.passport.internal.ui.social;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.btf;
import defpackage.jyr;
import defpackage.ptd;
import defpackage.qyf;
import defpackage.ssd;
import defpackage.vwb;
import defpackage.wb8;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/social/o;", "Landroidx/fragment/app/o;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class o extends androidx.fragment.app.o {
    public static final String k;
    public a0 g;
    public ProgressBar h;
    public Bundle i;
    public final jyr j = btf.b(new h0(14, this));

    static {
        String canonicalName = o.class.getCanonicalName();
        canonicalName.getClass();
        k = canonicalName;
    }

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        ((com.yandex.passport.internal.ui.social.authenticators.f) this.j.getValue()).a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        this.i = bundle;
        Bundle arguments = getArguments();
        if (arguments == null) {
            xq0.q("Internal error: configuration can't be null");
            return;
        }
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(arguments, a0.class, "social-type") : arguments.getParcelable("social-type");
        if (parcelable == null) {
            wb8.h("can't get required parcelable social-type");
        } else {
            this.g = (a0) parcelable;
            super.onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ssd requireActivity = requireActivity();
        requireActivity.getClass();
        View inflate = layoutInflater.inflate(((DomikActivity) ((com.yandex.passport.internal.ui.domik.k) requireActivity)).j.getDomikDesignProvider().a, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progress);
        findViewById.getClass();
        this.h = (ProgressBar) findViewById;
        Context requireContext = requireContext();
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            com.yandex.passport.legacy.f.a(requireContext, progressBar, R.color.passport_progress_bar);
            return inflate;
        }
        Intrinsics.j("progress");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        ProgressBar progressBar = this.h;
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
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        } else {
            Intrinsics.j("progress");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        ((com.yandex.passport.internal.ui.social.authenticators.f) this.j.getValue()).J(bundle);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qyf F = wyf.F(getLifecycle());
        x97.y(F, null, null, new ptd(F, new i(this, null, 1), (Continuation) null), 3);
    }

    @Override // androidx.fragment.app.o
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        ((com.yandex.passport.internal.ui.social.authenticators.f) this.j.getValue()).H(bundle);
    }

    public final a x() {
        if (l() instanceof a) {
            ssd l = l();
            l.getClass();
            return (a) l;
        }
        throw new RuntimeException(requireActivity() + " must implement SocialAuthListener");
    }
}
