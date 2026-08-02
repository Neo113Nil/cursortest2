package com.yandex.passport.internal.ui.bouncer;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import defpackage.szf;
import defpackage.wn5;
import defpackage.x6k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l extends FrameLayout implements m {
    public static final /* synthetic */ int i = 0;
    public final BouncerActivity a;
    public final boolean b;
    public final com.yandex.passport.common.ui.a c;
    public final gf d;
    public final com.yandex.passport.internal.report.reporters.m e;
    public final u f;
    public final x6k g;
    public final l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull t tVar, @NotNull BouncerActivity bouncerActivity, boolean z, @NotNull com.yandex.passport.common.ui.a aVar, @NotNull gf gfVar, @NotNull com.yandex.passport.internal.report.reporters.m mVar) {
        super(bouncerActivity);
        tVar.getClass();
        bouncerActivity.getClass();
        aVar.getClass();
        gfVar.getClass();
        mVar.getClass();
        this.a = bouncerActivity;
        this.b = z;
        this.c = aVar;
        this.d = gfVar;
        this.e = mVar;
        this.f = tVar.build();
        ComposeView composeView = new ComposeView(bouncerActivity, null, 0, 6, null);
        this.g = szf.g0(null);
        this.h = this;
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
        composeView.setContent(new wn5(new k(this, 0), -1460217627, true));
    }

    @Override // com.yandex.passport.common.mvi.f
    public final void a(Object obj) {
        l1 l1Var = (l1) obj;
        l1Var.getClass();
        this.g.setValue(l1Var);
    }

    @Override // com.yandex.passport.internal.ui.bouncer.m
    public final boolean b() {
        return false;
    }

    public final void c(Activity activity, com.yandex.passport.api.v vVar) {
        activity.getClass();
        com.yandex.passport.internal.ui.a.r(activity, com.yandex.plus.core.network.api.utils.a.F(vVar));
        gf gfVar = this.d;
        gfVar.e("native.finish");
        gfVar.c.put(CameraService.RESULT, com.yandex.passport.internal.ui.bouncer.model.b.d(vVar));
    }

    @Override // com.yandex.passport.internal.ui.bouncer.m
    @NotNull
    public View getTheRootView() {
        return this.h;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.m
    public final void onDestroy() {
    }
}
