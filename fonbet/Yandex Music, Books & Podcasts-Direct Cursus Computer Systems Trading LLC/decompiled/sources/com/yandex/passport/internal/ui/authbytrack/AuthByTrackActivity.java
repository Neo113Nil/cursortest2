package com.yandex.passport.internal.ui.authbytrack;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import com.appsflyer.internal.k;
import com.yandex.passport.R;
import com.yandex.passport.api.n;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.core.g;
import com.yandex.passport.internal.analytics.h;
import com.yandex.passport.internal.analytics.y;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.entities.t;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.methods.s6;
import com.yandex.passport.internal.properties.f0;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.m0;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.internal.w;
import defpackage.bjt;
import defpackage.ern;
import defpackage.gfu;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.ot0;
import defpackage.x97;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AuthByTrackActivity extends com.yandex.passport.internal.ui.c {
    public static final /* synthetic */ int i = 0;
    public y d;
    public e e;
    public t f;
    public l g;
    public i h;

    public final void m(f fVar) {
        z1 J = com.yandex.plus.pay.ui.core.b.J(fVar);
        w0 w0Var = w0.h;
        e eVar = this.e;
        if (eVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) eVar.r.d();
        if (lVar != null) {
            com.yandex.passport.internal.ui.a.r(this, com.yandex.plus.core.network.api.utils.a.F(new com.yandex.passport.api.t(J, com.yandex.plus.core.locale.b.B(lVar), w0Var, null, null)));
        } else {
            xq0.q("no account data");
        }
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            if (i3 != -1 || intent == null) {
                y yVar = this.d;
                if (yVar == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                t tVar = this.f;
                if (tVar == null) {
                    Intrinsics.j("trackId");
                    throw null;
                }
                h hVar = h.h;
                String b = com.yandex.passport.internal.util.l.b(tVar.a);
                yVar.b(hVar, new Pair("track_id", b != null ? b : "null"));
                finish();
            } else {
                y yVar2 = this.d;
                if (yVar2 == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                t tVar2 = this.f;
                if (tVar2 == null) {
                    Intrinsics.j("trackId");
                    throw null;
                }
                h hVar2 = h.i;
                String b2 = com.yandex.passport.internal.util.l.b(tVar2.a);
                yVar2.b(hVar2, new Pair("track_id", b2 != null ? b2 : "null"));
                m(com.yandex.plus.pay.ui.core.b.L(com.yandex.plus.core.locale.b.j(intent.getExtras()).a));
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.passport_activity_progress);
        com.yandex.passport.legacy.f.a(this, (ProgressBar) findViewById(R.id.progress), R.color.passport_progress_bar);
        this.d = com.yandex.passport.internal.di.a.a().getAuthByTrackReporter();
        this.h = com.yandex.passport.internal.di.a.a().getFlagRepository();
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        this.f = (t) s6.d.e(extras);
        Bundle extras2 = getIntent().getExtras();
        extras2.getClass();
        l lVar = (l) k.h(extras2, p.class, "passport-login-properties");
        if (lVar == null) {
            xq0.q(k.m("Bundle has no ", l.class));
            return;
        }
        this.g = lVar;
        final int i2 = 0;
        e eVar = (e) w.d(this, e.class, new a(i2));
        this.e = eVar;
        eVar.r.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authbytrack.b
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
            @Override // defpackage.xjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(Object obj) {
                boolean z;
                int i3 = i2;
                final int i4 = 0;
                final int i5 = 1;
                final AuthByTrackActivity authByTrackActivity = this.b;
                switch (i3) {
                    case 0:
                        com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) obj;
                        int i6 = AuthByTrackActivity.i;
                        lVar2.getClass();
                        y yVar = authByTrackActivity.d;
                        if (yVar == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar = authByTrackActivity.f;
                        if (tVar == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        h hVar = h.e;
                        String b = com.yandex.passport.internal.util.l.b(tVar.a);
                        if (b == null) {
                            b = "null";
                        }
                        yVar.b(hVar, new Pair("track_id", b));
                        l lVar3 = authByTrackActivity.g;
                        if (lVar3 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        i iVar = authByTrackActivity.h;
                        if (iVar == null) {
                            Intrinsics.j("flagRepository");
                            throw null;
                        }
                        f fVar = lVar2.b;
                        com.yandex.passport.internal.entities.k kVar = lVar3.d;
                        g gVar = lVar2.e;
                        boolean z2 = gVar.h == 6;
                        boolean a = kVar.a(n.SOCIAL);
                        boolean booleanValue = ((Boolean) iVar.b(o.g)).booleanValue();
                        m0 m0Var = lVar3.u;
                        if (!(!(m0Var != null ? m0Var.d : false) && !((Boolean) iVar.b(o.v)).booleanValue() && z2 && (!a || booleanValue))) {
                            if (!((gVar.h == 5) && !kVar.a(n.LITE))) {
                                z = false;
                                if (z) {
                                    authByTrackActivity.m(fVar);
                                    return;
                                }
                                y yVar2 = authByTrackActivity.d;
                                if (yVar2 == null) {
                                    Intrinsics.j("reporter");
                                    throw null;
                                }
                                t tVar2 = authByTrackActivity.f;
                                if (tVar2 == null) {
                                    Intrinsics.j("trackId");
                                    throw null;
                                }
                                h hVar2 = h.g;
                                String b2 = com.yandex.passport.internal.util.l.b(tVar2.a);
                                yVar2.b(hVar2, new Pair("track_id", b2 != null ? b2 : "null"));
                                int i7 = GlobalRouterActivity.i;
                                l lVar4 = authByTrackActivity.g;
                                if (lVar4 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.properties.k kVar2 = new com.yandex.passport.internal.properties.k();
                                kVar2.b(lVar4);
                                l lVar5 = authByTrackActivity.g;
                                if (lVar5 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.entities.k kVar3 = lVar5.d;
                                j jVar = new j();
                                jVar.L(kVar3);
                                jVar.N(com.yandex.plus.core.network.api.utils.a.O(fVar.a));
                                kVar2.b = jVar.l();
                                kVar2.n = new f0(com.yandex.passport.internal.ui.a.D(com.yandex.plus.pay.ui.core.b.J(fVar)), null);
                                authByTrackActivity.startActivityForResult(com.yandex.passport.internal.ui.router.b.b(authByTrackActivity, com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar2)), null, 28), 1);
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        break;
                    case 1:
                        com.yandex.passport.internal.ui.f fVar2 = (com.yandex.passport.internal.ui.f) obj;
                        int i8 = AuthByTrackActivity.i;
                        fVar2.getClass();
                        y yVar3 = authByTrackActivity.d;
                        if (yVar3 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar3 = authByTrackActivity.f;
                        if (tVar3 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        String str = fVar2.a;
                        h hVar3 = h.f;
                        String b3 = com.yandex.passport.internal.util.l.b(tVar3.a);
                        yVar3.b(hVar3, new Pair("track_id", b3 != null ? b3 : "null"), new Pair(Constants.KEY_MESSAGE, str), new Pair("error", Log.getStackTraceString(fVar2.b)));
                        com.yandex.passport.internal.ui.i iVar2 = new com.yandex.passport.internal.ui.i(authByTrackActivity);
                        e eVar2 = authByTrackActivity.e;
                        if (eVar2 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        iVar2.b(eVar2.s.b(str));
                        iVar2.c(R.string.passport_reg_try_again, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                switch (i4) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        });
                        int i9 = R.string.passport_reg_cancel;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i5) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        };
                        iVar2.i = authByTrackActivity.getText(i9);
                        iVar2.j = onClickListener;
                        iVar2.a().setOnCancelListener(new com.yandex.passport.internal.ui.b(1, authByTrackActivity));
                        return;
                    case 2:
                        int i10 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        e eVar3 = authByTrackActivity.e;
                        if (eVar3 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        t tVar4 = authByTrackActivity.f;
                        if (tVar4 != null) {
                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                            return;
                        } else {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                    default:
                        int i11 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        y yVar4 = authByTrackActivity.d;
                        if (yVar4 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar5 = authByTrackActivity.f;
                        if (tVar5 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        yVar4.a(tVar5);
                        authByTrackActivity.finish();
                        return;
                }
            }
        });
        e eVar2 = this.e;
        if (eVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        final int i3 = 1;
        eVar2.k.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authbytrack.b
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
            @Override // defpackage.xjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(Object obj) {
                boolean z;
                int i32 = i3;
                final int i4 = 0;
                final int i5 = 1;
                final AuthByTrackActivity authByTrackActivity = this.b;
                switch (i32) {
                    case 0:
                        com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) obj;
                        int i6 = AuthByTrackActivity.i;
                        lVar2.getClass();
                        y yVar = authByTrackActivity.d;
                        if (yVar == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar = authByTrackActivity.f;
                        if (tVar == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        h hVar = h.e;
                        String b = com.yandex.passport.internal.util.l.b(tVar.a);
                        if (b == null) {
                            b = "null";
                        }
                        yVar.b(hVar, new Pair("track_id", b));
                        l lVar3 = authByTrackActivity.g;
                        if (lVar3 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        i iVar = authByTrackActivity.h;
                        if (iVar == null) {
                            Intrinsics.j("flagRepository");
                            throw null;
                        }
                        f fVar = lVar2.b;
                        com.yandex.passport.internal.entities.k kVar = lVar3.d;
                        g gVar = lVar2.e;
                        boolean z2 = gVar.h == 6;
                        boolean a = kVar.a(n.SOCIAL);
                        boolean booleanValue = ((Boolean) iVar.b(o.g)).booleanValue();
                        m0 m0Var = lVar3.u;
                        if (!(!(m0Var != null ? m0Var.d : false) && !((Boolean) iVar.b(o.v)).booleanValue() && z2 && (!a || booleanValue))) {
                            if (!((gVar.h == 5) && !kVar.a(n.LITE))) {
                                z = false;
                                if (z) {
                                    authByTrackActivity.m(fVar);
                                    return;
                                }
                                y yVar2 = authByTrackActivity.d;
                                if (yVar2 == null) {
                                    Intrinsics.j("reporter");
                                    throw null;
                                }
                                t tVar2 = authByTrackActivity.f;
                                if (tVar2 == null) {
                                    Intrinsics.j("trackId");
                                    throw null;
                                }
                                h hVar2 = h.g;
                                String b2 = com.yandex.passport.internal.util.l.b(tVar2.a);
                                yVar2.b(hVar2, new Pair("track_id", b2 != null ? b2 : "null"));
                                int i7 = GlobalRouterActivity.i;
                                l lVar4 = authByTrackActivity.g;
                                if (lVar4 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.properties.k kVar2 = new com.yandex.passport.internal.properties.k();
                                kVar2.b(lVar4);
                                l lVar5 = authByTrackActivity.g;
                                if (lVar5 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.entities.k kVar3 = lVar5.d;
                                j jVar = new j();
                                jVar.L(kVar3);
                                jVar.N(com.yandex.plus.core.network.api.utils.a.O(fVar.a));
                                kVar2.b = jVar.l();
                                kVar2.n = new f0(com.yandex.passport.internal.ui.a.D(com.yandex.plus.pay.ui.core.b.J(fVar)), null);
                                authByTrackActivity.startActivityForResult(com.yandex.passport.internal.ui.router.b.b(authByTrackActivity, com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar2)), null, 28), 1);
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        break;
                    case 1:
                        com.yandex.passport.internal.ui.f fVar2 = (com.yandex.passport.internal.ui.f) obj;
                        int i8 = AuthByTrackActivity.i;
                        fVar2.getClass();
                        y yVar3 = authByTrackActivity.d;
                        if (yVar3 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar3 = authByTrackActivity.f;
                        if (tVar3 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        String str = fVar2.a;
                        h hVar3 = h.f;
                        String b3 = com.yandex.passport.internal.util.l.b(tVar3.a);
                        yVar3.b(hVar3, new Pair("track_id", b3 != null ? b3 : "null"), new Pair(Constants.KEY_MESSAGE, str), new Pair("error", Log.getStackTraceString(fVar2.b)));
                        com.yandex.passport.internal.ui.i iVar2 = new com.yandex.passport.internal.ui.i(authByTrackActivity);
                        e eVar22 = authByTrackActivity.e;
                        if (eVar22 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        iVar2.b(eVar22.s.b(str));
                        iVar2.c(R.string.passport_reg_try_again, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i4) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        });
                        int i9 = R.string.passport_reg_cancel;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i5) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        };
                        iVar2.i = authByTrackActivity.getText(i9);
                        iVar2.j = onClickListener;
                        iVar2.a().setOnCancelListener(new com.yandex.passport.internal.ui.b(1, authByTrackActivity));
                        return;
                    case 2:
                        int i10 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        e eVar3 = authByTrackActivity.e;
                        if (eVar3 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        t tVar4 = authByTrackActivity.f;
                        if (tVar4 != null) {
                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                            return;
                        } else {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                    default:
                        int i11 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        y yVar4 = authByTrackActivity.d;
                        if (yVar4 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar5 = authByTrackActivity.f;
                        if (tVar5 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        yVar4.a(tVar5);
                        authByTrackActivity.finish();
                        return;
                }
            }
        });
        jfu viewModelStore = getViewModelStore();
        gfu defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        lm4 a = ern.a(com.yandex.passport.internal.ui.authbytrack.acceptdialog.c.class);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        com.yandex.passport.internal.ui.authbytrack.acceptdialog.c cVar = (com.yandex.passport.internal.ui.authbytrack.acceptdialog.c) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        final int i4 = 2;
        cVar.q.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authbytrack.b
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
            @Override // defpackage.xjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(Object obj) {
                boolean z;
                int i32 = i4;
                final int i42 = 0;
                final int i5 = 1;
                final AuthByTrackActivity authByTrackActivity = this.b;
                switch (i32) {
                    case 0:
                        com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) obj;
                        int i6 = AuthByTrackActivity.i;
                        lVar2.getClass();
                        y yVar = authByTrackActivity.d;
                        if (yVar == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar = authByTrackActivity.f;
                        if (tVar == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        h hVar = h.e;
                        String b = com.yandex.passport.internal.util.l.b(tVar.a);
                        if (b == null) {
                            b = "null";
                        }
                        yVar.b(hVar, new Pair("track_id", b));
                        l lVar3 = authByTrackActivity.g;
                        if (lVar3 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        i iVar = authByTrackActivity.h;
                        if (iVar == null) {
                            Intrinsics.j("flagRepository");
                            throw null;
                        }
                        f fVar = lVar2.b;
                        com.yandex.passport.internal.entities.k kVar = lVar3.d;
                        g gVar = lVar2.e;
                        boolean z2 = gVar.h == 6;
                        boolean a2 = kVar.a(n.SOCIAL);
                        boolean booleanValue = ((Boolean) iVar.b(o.g)).booleanValue();
                        m0 m0Var = lVar3.u;
                        if (!(!(m0Var != null ? m0Var.d : false) && !((Boolean) iVar.b(o.v)).booleanValue() && z2 && (!a2 || booleanValue))) {
                            if (!((gVar.h == 5) && !kVar.a(n.LITE))) {
                                z = false;
                                if (z) {
                                    authByTrackActivity.m(fVar);
                                    return;
                                }
                                y yVar2 = authByTrackActivity.d;
                                if (yVar2 == null) {
                                    Intrinsics.j("reporter");
                                    throw null;
                                }
                                t tVar2 = authByTrackActivity.f;
                                if (tVar2 == null) {
                                    Intrinsics.j("trackId");
                                    throw null;
                                }
                                h hVar2 = h.g;
                                String b2 = com.yandex.passport.internal.util.l.b(tVar2.a);
                                yVar2.b(hVar2, new Pair("track_id", b2 != null ? b2 : "null"));
                                int i7 = GlobalRouterActivity.i;
                                l lVar4 = authByTrackActivity.g;
                                if (lVar4 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.properties.k kVar2 = new com.yandex.passport.internal.properties.k();
                                kVar2.b(lVar4);
                                l lVar5 = authByTrackActivity.g;
                                if (lVar5 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.entities.k kVar3 = lVar5.d;
                                j jVar = new j();
                                jVar.L(kVar3);
                                jVar.N(com.yandex.plus.core.network.api.utils.a.O(fVar.a));
                                kVar2.b = jVar.l();
                                kVar2.n = new f0(com.yandex.passport.internal.ui.a.D(com.yandex.plus.pay.ui.core.b.J(fVar)), null);
                                authByTrackActivity.startActivityForResult(com.yandex.passport.internal.ui.router.b.b(authByTrackActivity, com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar2)), null, 28), 1);
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        break;
                    case 1:
                        com.yandex.passport.internal.ui.f fVar2 = (com.yandex.passport.internal.ui.f) obj;
                        int i8 = AuthByTrackActivity.i;
                        fVar2.getClass();
                        y yVar3 = authByTrackActivity.d;
                        if (yVar3 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar3 = authByTrackActivity.f;
                        if (tVar3 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        String str = fVar2.a;
                        h hVar3 = h.f;
                        String b3 = com.yandex.passport.internal.util.l.b(tVar3.a);
                        yVar3.b(hVar3, new Pair("track_id", b3 != null ? b3 : "null"), new Pair(Constants.KEY_MESSAGE, str), new Pair("error", Log.getStackTraceString(fVar2.b)));
                        com.yandex.passport.internal.ui.i iVar2 = new com.yandex.passport.internal.ui.i(authByTrackActivity);
                        e eVar22 = authByTrackActivity.e;
                        if (eVar22 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        iVar2.b(eVar22.s.b(str));
                        iVar2.c(R.string.passport_reg_try_again, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i42) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        });
                        int i9 = R.string.passport_reg_cancel;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i5) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        };
                        iVar2.i = authByTrackActivity.getText(i9);
                        iVar2.j = onClickListener;
                        iVar2.a().setOnCancelListener(new com.yandex.passport.internal.ui.b(1, authByTrackActivity));
                        return;
                    case 2:
                        int i10 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        e eVar3 = authByTrackActivity.e;
                        if (eVar3 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        t tVar4 = authByTrackActivity.f;
                        if (tVar4 != null) {
                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                            return;
                        } else {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                    default:
                        int i11 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        y yVar4 = authByTrackActivity.d;
                        if (yVar4 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar5 = authByTrackActivity.f;
                        if (tVar5 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        yVar4.a(tVar5);
                        authByTrackActivity.finish();
                        return;
                }
            }
        });
        final int i5 = 3;
        cVar.r.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authbytrack.b
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
            @Override // defpackage.xjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(Object obj) {
                boolean z;
                int i32 = i5;
                final int i42 = 0;
                final int i52 = 1;
                final AuthByTrackActivity authByTrackActivity = this.b;
                switch (i32) {
                    case 0:
                        com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) obj;
                        int i6 = AuthByTrackActivity.i;
                        lVar2.getClass();
                        y yVar = authByTrackActivity.d;
                        if (yVar == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar = authByTrackActivity.f;
                        if (tVar == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        h hVar = h.e;
                        String b = com.yandex.passport.internal.util.l.b(tVar.a);
                        if (b == null) {
                            b = "null";
                        }
                        yVar.b(hVar, new Pair("track_id", b));
                        l lVar3 = authByTrackActivity.g;
                        if (lVar3 == null) {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                        i iVar = authByTrackActivity.h;
                        if (iVar == null) {
                            Intrinsics.j("flagRepository");
                            throw null;
                        }
                        f fVar = lVar2.b;
                        com.yandex.passport.internal.entities.k kVar = lVar3.d;
                        g gVar = lVar2.e;
                        boolean z2 = gVar.h == 6;
                        boolean a2 = kVar.a(n.SOCIAL);
                        boolean booleanValue = ((Boolean) iVar.b(o.g)).booleanValue();
                        m0 m0Var = lVar3.u;
                        if (!(!(m0Var != null ? m0Var.d : false) && !((Boolean) iVar.b(o.v)).booleanValue() && z2 && (!a2 || booleanValue))) {
                            if (!((gVar.h == 5) && !kVar.a(n.LITE))) {
                                z = false;
                                if (z) {
                                    authByTrackActivity.m(fVar);
                                    return;
                                }
                                y yVar2 = authByTrackActivity.d;
                                if (yVar2 == null) {
                                    Intrinsics.j("reporter");
                                    throw null;
                                }
                                t tVar2 = authByTrackActivity.f;
                                if (tVar2 == null) {
                                    Intrinsics.j("trackId");
                                    throw null;
                                }
                                h hVar2 = h.g;
                                String b2 = com.yandex.passport.internal.util.l.b(tVar2.a);
                                yVar2.b(hVar2, new Pair("track_id", b2 != null ? b2 : "null"));
                                int i7 = GlobalRouterActivity.i;
                                l lVar4 = authByTrackActivity.g;
                                if (lVar4 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.properties.k kVar2 = new com.yandex.passport.internal.properties.k();
                                kVar2.b(lVar4);
                                l lVar5 = authByTrackActivity.g;
                                if (lVar5 == null) {
                                    Intrinsics.j("loginProperties");
                                    throw null;
                                }
                                com.yandex.passport.internal.entities.k kVar3 = lVar5.d;
                                j jVar = new j();
                                jVar.L(kVar3);
                                jVar.N(com.yandex.plus.core.network.api.utils.a.O(fVar.a));
                                kVar2.b = jVar.l();
                                kVar2.n = new f0(com.yandex.passport.internal.ui.a.D(com.yandex.plus.pay.ui.core.b.J(fVar)), null);
                                authByTrackActivity.startActivityForResult(com.yandex.passport.internal.ui.router.b.b(authByTrackActivity, com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar2)), null, 28), 1);
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        break;
                    case 1:
                        com.yandex.passport.internal.ui.f fVar2 = (com.yandex.passport.internal.ui.f) obj;
                        int i8 = AuthByTrackActivity.i;
                        fVar2.getClass();
                        y yVar3 = authByTrackActivity.d;
                        if (yVar3 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar3 = authByTrackActivity.f;
                        if (tVar3 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        String str = fVar2.a;
                        h hVar3 = h.f;
                        String b3 = com.yandex.passport.internal.util.l.b(tVar3.a);
                        yVar3.b(hVar3, new Pair("track_id", b3 != null ? b3 : "null"), new Pair(Constants.KEY_MESSAGE, str), new Pair("error", Log.getStackTraceString(fVar2.b)));
                        com.yandex.passport.internal.ui.i iVar2 = new com.yandex.passport.internal.ui.i(authByTrackActivity);
                        e eVar22 = authByTrackActivity.e;
                        if (eVar22 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        iVar2.b(eVar22.s.b(str));
                        iVar2.c(R.string.passport_reg_try_again, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i42) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        });
                        int i9 = R.string.passport_reg_cancel;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.authbytrack.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i92) {
                                switch (i52) {
                                    case 0:
                                        AuthByTrackActivity authByTrackActivity2 = authByTrackActivity;
                                        e eVar3 = authByTrackActivity2.e;
                                        if (eVar3 == null) {
                                            Intrinsics.j("viewModel");
                                            throw null;
                                        }
                                        t tVar4 = authByTrackActivity2.f;
                                        if (tVar4 != null) {
                                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                                            return;
                                        } else {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                    default:
                                        AuthByTrackActivity authByTrackActivity3 = authByTrackActivity;
                                        y yVar4 = authByTrackActivity3.d;
                                        if (yVar4 == null) {
                                            Intrinsics.j("reporter");
                                            throw null;
                                        }
                                        t tVar5 = authByTrackActivity3.f;
                                        if (tVar5 == null) {
                                            Intrinsics.j("trackId");
                                            throw null;
                                        }
                                        yVar4.a(tVar5);
                                        authByTrackActivity3.finish();
                                        return;
                                }
                            }
                        };
                        iVar2.i = authByTrackActivity.getText(i9);
                        iVar2.j = onClickListener;
                        iVar2.a().setOnCancelListener(new com.yandex.passport.internal.ui.b(1, authByTrackActivity));
                        return;
                    case 2:
                        int i10 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        e eVar3 = authByTrackActivity.e;
                        if (eVar3 == null) {
                            Intrinsics.j("viewModel");
                            throw null;
                        }
                        t tVar4 = authByTrackActivity.f;
                        if (tVar4 != null) {
                            x97.y(ot0.F(eVar3), null, null, new com.yandex.passport.internal.provider.communication.c(eVar3, tVar4, (Continuation) null, 8), 3);
                            return;
                        } else {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                    default:
                        int i11 = AuthByTrackActivity.i;
                        ((Boolean) obj).getClass();
                        y yVar4 = authByTrackActivity.d;
                        if (yVar4 == null) {
                            Intrinsics.j("reporter");
                            throw null;
                        }
                        t tVar5 = authByTrackActivity.f;
                        if (tVar5 == null) {
                            Intrinsics.j("trackId");
                            throw null;
                        }
                        yVar4.a(tVar5);
                        authByTrackActivity.finish();
                        return;
                }
            }
        });
        if (bundle == null) {
            y yVar = this.d;
            if (yVar == null) {
                Intrinsics.j("reporter");
                throw null;
            }
            t tVar = this.f;
            if (tVar == null) {
                Intrinsics.j("trackId");
                throw null;
            }
            h hVar = h.c;
            String b = com.yandex.passport.internal.util.l.b(tVar.a);
            if (b == null) {
                b = "null";
            }
            yVar.b(hVar, new Pair("track_id", b));
            t tVar2 = this.f;
            if (tVar2 == null) {
                Intrinsics.j("trackId");
                throw null;
            }
            String str = tVar2.c;
            if (str == null) {
                str = "";
            }
            y yVar2 = this.d;
            if (yVar2 == null) {
                Intrinsics.j("reporter");
                throw null;
            }
            h hVar2 = h.d;
            String b2 = com.yandex.passport.internal.util.l.b(tVar2.a);
            yVar2.b(hVar2, new Pair("track_id", b2 != null ? b2 : "null"));
            String str2 = com.yandex.passport.internal.ui.authbytrack.acceptdialog.b.g;
            Bundle bundle2 = new Bundle();
            bundle2.putString("display_name", str);
            com.yandex.passport.internal.ui.authbytrack.acceptdialog.b bVar = new com.yandex.passport.internal.ui.authbytrack.acceptdialog.b();
            bVar.setArguments(bundle2);
            bVar.show(getSupportFragmentManager(), com.yandex.passport.internal.ui.authbytrack.acceptdialog.b.g);
        }
    }
}
