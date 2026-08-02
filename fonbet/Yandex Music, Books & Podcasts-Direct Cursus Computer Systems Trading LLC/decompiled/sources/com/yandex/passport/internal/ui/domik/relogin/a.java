package com.yandex.passport.internal.ui.domik.relogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.i0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.legacy.f;
import defpackage.ca8;
import defpackage.cq4;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.ot0;
import defpackage.x97;

/* loaded from: classes4.dex */
public class a extends com.yandex.passport.internal.ui.domik.base.a<d, com.yandex.passport.internal.ui.domik.d> {
    public static final /* synthetic */ int t = 0;

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final m0 F() {
        return m0.RELOGIN;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        return true;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(E().getDomikDesignProvider().a, viewGroup, false);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f.a(requireContext(), (ProgressBar) view.findViewById(R.id.progress), R.color.passport_progress_bar);
        d dVar = (d) this.g;
        com.yandex.passport.internal.ui.domik.d dVar2 = (com.yandex.passport.internal.ui.domik.d) this.o;
        dVar.getClass();
        dVar2.getClass();
        cq4 F = ot0.F(dVar);
        dq7 dq7Var = ca8.a;
        x97.y(F, mn7.d, null, new c(dVar, dVar2, null, 1), 2);
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return E().newReloginViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d
    public final void z(com.yandex.passport.internal.ui.f fVar) {
        d dVar = (d) this.g;
        com.yandex.passport.internal.ui.domik.d dVar2 = (com.yandex.passport.internal.ui.domik.d) this.o;
        dVar.getClass();
        dVar2.getClass();
        fVar.getClass();
        dVar.l.m(Boolean.FALSE);
        dVar.t.e(i0.b);
        dVar.r.c();
    }
}
