package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.di.d;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.metrica.utils.x;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.e;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.g;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.i;
import defpackage.b1b;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cdk;
import defpackage.dfu;
import defpackage.ern;
import defpackage.gdk;
import defpackage.jyr;
import defpackage.nme;
import defpackage.qpj;
import defpackage.r7o;
import defpackage.rb;
import defpackage.rb5;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.vq1;
import defpackage.vwb;
import defpackage.wxf;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.yxm;
import defpackage.z7o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class TarifficatorScenarioActivity extends com.yandex.plus.pay.ui.common.api.b implements d {
    public static final /* synthetic */ s9f[] g;
    public boolean b;
    public final jyr c;
    public final f d;
    public final jyr e;
    public final ybf f;

    static {
        yxm yxmVar = new yxm(TarifficatorScenarioActivity.class, "component", "getComponent()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/common/di/ScenarioComponent;", 0);
        ern.a.getClass();
        g = new s9f[]{yxmVar};
    }

    public TarifficatorScenarioActivity() {
        super(R.layout.pay_sdk_activity_tarifficator);
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.a
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar;
                int i2 = i;
                final int i3 = 1;
                final int i4 = 0;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorScenarioActivity.g;
                        Intent intent = tarifficatorScenarioActivity.getIntent();
                        if (intent != null && (dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) ((Parcelable) vq1.W(intent, "args", com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d.class))) != null) {
                            return dVar;
                        }
                        xq0.q("TarifficatorScenarioActivity must be created with contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorScenarioActivity.g;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) tarifficatorScenarioActivity.c.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c cVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c) e.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorScenarioActivity));
                        dVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b bVar = cVar.a;
                        cdk cdkVar = bVar.y;
                        gdk gdkVar = bVar.z;
                        com.yandex.plus.pay.reporter.api.f fVar = bVar.m;
                        cdkVar.getClass();
                        gdkVar.getClass();
                        fVar.getClass();
                        final j jVar = new j();
                        jVar.a = cdkVar;
                        jVar.b = gdkVar;
                        jVar.c = fVar;
                        jVar.d = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        jVar.e = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        i iVar = new i(jVar, dVar2, bVar.a, bVar.c, bVar.d, bVar.e, bVar.f, bVar.l, bVar.m, bVar.q, bVar.r, bVar.g, bVar.i, bVar.j, bVar.k, bVar.s, bVar.t, bVar.h, bVar.u, bVar.v, bVar.w, bVar.x, bVar.A, bVar.B, bVar.o, bVar.n);
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d(iVar, new p(iVar, jVar, dVar2));
                    case 2:
                        s9f[] s9fVarArr3 = TarifficatorScenarioActivity.g;
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.d(tarifficatorScenarioActivity);
                    default:
                        s9f[] s9fVarArr4 = TarifficatorScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(c.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(tarifficatorScenarioActivity.k().b, i4))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        this.d = new f(this, new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.a
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar;
                int i22 = i2;
                final int i3 = 1;
                final int i4 = 0;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorScenarioActivity.g;
                        Intent intent = tarifficatorScenarioActivity.getIntent();
                        if (intent != null && (dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) ((Parcelable) vq1.W(intent, "args", com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d.class))) != null) {
                            return dVar;
                        }
                        xq0.q("TarifficatorScenarioActivity must be created with contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorScenarioActivity.g;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) tarifficatorScenarioActivity.c.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c cVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c) e.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorScenarioActivity));
                        dVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b bVar = cVar.a;
                        cdk cdkVar = bVar.y;
                        gdk gdkVar = bVar.z;
                        com.yandex.plus.pay.reporter.api.f fVar = bVar.m;
                        cdkVar.getClass();
                        gdkVar.getClass();
                        fVar.getClass();
                        final j jVar = new j();
                        jVar.a = cdkVar;
                        jVar.b = gdkVar;
                        jVar.c = fVar;
                        jVar.d = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        jVar.e = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        i iVar = new i(jVar, dVar2, bVar.a, bVar.c, bVar.d, bVar.e, bVar.f, bVar.l, bVar.m, bVar.q, bVar.r, bVar.g, bVar.i, bVar.j, bVar.k, bVar.s, bVar.t, bVar.h, bVar.u, bVar.v, bVar.w, bVar.x, bVar.A, bVar.B, bVar.o, bVar.n);
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d(iVar, new p(iVar, jVar, dVar2));
                    case 2:
                        s9f[] s9fVarArr3 = TarifficatorScenarioActivity.g;
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.d(tarifficatorScenarioActivity);
                    default:
                        s9f[] s9fVarArr4 = TarifficatorScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(c.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(tarifficatorScenarioActivity.k().b, i4))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i3 = 2;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.a
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar;
                int i22 = i3;
                final int i32 = 1;
                final int i4 = 0;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorScenarioActivity.g;
                        Intent intent = tarifficatorScenarioActivity.getIntent();
                        if (intent != null && (dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) ((Parcelable) vq1.W(intent, "args", com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d.class))) != null) {
                            return dVar;
                        }
                        xq0.q("TarifficatorScenarioActivity must be created with contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorScenarioActivity.g;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) tarifficatorScenarioActivity.c.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c cVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c) e.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorScenarioActivity));
                        dVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b bVar = cVar.a;
                        cdk cdkVar = bVar.y;
                        gdk gdkVar = bVar.z;
                        com.yandex.plus.pay.reporter.api.f fVar = bVar.m;
                        cdkVar.getClass();
                        gdkVar.getClass();
                        fVar.getClass();
                        final j jVar = new j();
                        jVar.a = cdkVar;
                        jVar.b = gdkVar;
                        jVar.c = fVar;
                        jVar.d = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        jVar.e = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i32) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        i iVar = new i(jVar, dVar2, bVar.a, bVar.c, bVar.d, bVar.e, bVar.f, bVar.l, bVar.m, bVar.q, bVar.r, bVar.g, bVar.i, bVar.j, bVar.k, bVar.s, bVar.t, bVar.h, bVar.u, bVar.v, bVar.w, bVar.x, bVar.A, bVar.B, bVar.o, bVar.n);
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d(iVar, new p(iVar, jVar, dVar2));
                    case 2:
                        s9f[] s9fVarArr3 = TarifficatorScenarioActivity.g;
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.d(tarifficatorScenarioActivity);
                    default:
                        s9f[] s9fVarArr4 = TarifficatorScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(c.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(tarifficatorScenarioActivity.k().b, i4))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i4 = 3;
        this.f = new ybf(ern.a(c.class), new b(this, 0), new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.a
            public final /* synthetic */ TarifficatorScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar;
                int i22 = i4;
                final int i32 = 1;
                final int i42 = 0;
                TarifficatorScenarioActivity tarifficatorScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorScenarioActivity.g;
                        Intent intent = tarifficatorScenarioActivity.getIntent();
                        if (intent != null && (dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) ((Parcelable) vq1.W(intent, "args", com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d.class))) != null) {
                            return dVar;
                        }
                        xq0.q("TarifficatorScenarioActivity must be created with contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorScenarioActivity.g;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d) tarifficatorScenarioActivity.c.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c cVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c) e.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorScenarioActivity));
                        dVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b bVar = cVar.a;
                        cdk cdkVar = bVar.y;
                        gdk gdkVar = bVar.z;
                        com.yandex.plus.pay.reporter.api.f fVar = bVar.m;
                        cdkVar.getClass();
                        gdkVar.getClass();
                        fVar.getClass();
                        final j jVar = new j();
                        jVar.a = cdkVar;
                        jVar.b = gdkVar;
                        jVar.c = fVar;
                        jVar.d = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i42) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        jVar.e = btf.b(new Function0() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i32) {
                                    case 0:
                                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b(1, jVar);
                                    default:
                                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) jVar.b);
                                }
                            }
                        });
                        i iVar = new i(jVar, dVar2, bVar.a, bVar.c, bVar.d, bVar.e, bVar.f, bVar.l, bVar.m, bVar.q, bVar.r, bVar.g, bVar.i, bVar.j, bVar.k, bVar.s, bVar.t, bVar.h, bVar.u, bVar.v, bVar.w, bVar.x, bVar.A, bVar.B, bVar.o, bVar.n);
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d(iVar, new p(iVar, jVar, dVar2));
                    case 2:
                        s9f[] s9fVarArr3 = TarifficatorScenarioActivity.g;
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.d(tarifficatorScenarioActivity);
                    default:
                        s9f[] s9fVarArr4 = TarifficatorScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(c.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(tarifficatorScenarioActivity.k().b, i42))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        }, new b(this, 1));
    }

    @Override // android.app.Activity
    public final void finish() {
        Parcelable jVar;
        if (this.b) {
            super.finish();
            return;
        }
        c cVar = (c) this.f.getValue();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.e eVar = cVar.l;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = cVar.k.a.a();
        Set set = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f) eVar).a.e;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a.c();
        h hVar = c.d;
        if (hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f) {
            jVar = g.a;
        } else if (hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e) {
            jVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h(((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e) hVar).a, set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.f));
        } else {
            if (!(hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g)) {
                b6e.s();
                return;
            }
            jVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.j(c.a, set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.e));
        }
        Intent putExtra = new Intent().putExtra(CameraService.RESULT, jVar);
        putExtra.getClass();
        setResult(-1, putExtra);
        super.finish();
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d k() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.d.getValue(this, g[0]);
    }

    @Override // com.yandex.plus.di.d
    public final com.yandex.plus.di.c o() {
        return k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if ((r0 != null ? r0.c : false) != false) goto L31;
     */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c) e.d.q(com.yandex.plus.bdui.plus.analytics.b.u(this));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.f;
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "PlusTarifficatorMobileComponent is not found!", a);
        }
        ArrayList arrayList = null;
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c cVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.c) t7oVar;
        if (cVar == null) {
            com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.f;
            jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar2, "TarifficatorScenarioActivity is recreated after application death", null);
            this.b = true;
            super.onCreate(bundle);
            setResult(0);
            finish();
            return;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b bVar3 = cVar.a;
        com.yandex.plus.core.analytics.metrica.f j = ((x) bVar3.p).j();
        if (j != null) {
            getLifecycle().a(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.g(1, j));
        }
        com.yandex.plus.pay.ui.design.api.api.a aVar = bVar3.h;
        Locale a2 = bVar3.i.a();
        com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a.a.getValue();
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.pay_sdk_mobile_content_scale_factor, typedValue, true);
        j(a2, aVar2, typedValue.getFloat());
        b1b.b(this);
        com.yandex.plus.pay.log.impl.b bVar4 = bVar3.l;
        r1.r(bVar4, this, "Tarifficator");
        getLifecycle().a(new com.yandex.plus.pay.ui.common.api.log.g(new j(bVar4, this, "Tarifficator")));
        getLayoutInflater().setFactory2(new com.yandex.plus.pay.ui.common.api.log.b("Tarifficator", bVar4, new com.yandex.plus.pay.ui.core.mobile.ui.kit.b(aVar)));
        super.onCreate(bundle);
        if (this.b) {
            return;
        }
        i iVar = k().a;
        com.yandex.plus.domain.auth.impl.i iVar2 = iVar.k;
        com.yandex.plus.core.config.a aVar3 = iVar.f;
        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar = iVar.x;
        if (aVar3 != com.yandex.plus.core.config.a.a) {
            Object value = iVar2.h.getValue();
            com.yandex.plus.domain.auth.api.b bVar5 = value instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) value : null;
        }
        if (r1.l(((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) fVar.a.a())).u)) {
            com.yandex.plus.bdui.plus.analytics.b.p(this);
        }
        com.yandex.plus.pay.ui.common.api.a a3 = k().a.a();
        a3.getClass();
        a3.b = new WeakReference(this);
        qpj onBackPressedDispatcher = getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, this, new m(10, this));
        c cVar2 = (c) this.f.getValue();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar4 = cVar2.k;
        if (cVar2.r) {
            return;
        }
        cVar2.r = true;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e) cVar2.q;
        com.yandex.plus.log.api.b bVar6 = eVar.e;
        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
        if (bVar6.b(aVar5)) {
            bVar6.c(aVar5, "PerformanceSessionImpl", "onStartFlow()");
        }
        ((l) eVar.i.getValue()).c();
        ((l) eVar.f.getValue()).c();
        Bundle bundle2 = (Bundle) cVar2.p.a("SAVED_BUNDLE");
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = bundle2 != null ? (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j) ((Parcelable) vwb.O(bundle2, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j.class, "CURRENT_PURCHASE")) : null;
        if (bundle2 != null) {
            arrayList = Build.VERSION.SDK_INT >= 34 ? rb.w(bundle2) : bundle2.getParcelableArrayList("PURCHASES_HISTORY");
        }
        if (jVar != null && arrayList != null) {
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(aVar4.a.a(), jVar, arrayList, 25);
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar7 = aVar4.a;
            bVar7.getClass();
            bVar7.a = a4;
            return;
        }
        if (!((Boolean) cVar2.o.invoke()).booleanValue()) {
            cVar2.m.a(aVar4.a.a().b);
            return;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar6 = cVar2.n;
        aVar6.getClass();
        aVar6.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c(), "Presale");
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        ((rb5) k().a.B.getValue()).a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.t
    public final void onResumeFragments() {
        super.onResumeFragments();
        ((rb5) k().a.B.getValue()).a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.d) this.e.getValue());
    }
}
