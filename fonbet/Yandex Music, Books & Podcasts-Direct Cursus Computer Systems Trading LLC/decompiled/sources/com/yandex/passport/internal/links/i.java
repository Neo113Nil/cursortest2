package com.yandex.passport.internal.links;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.data.models.k;
import com.yandex.passport.data.models.m;
import com.yandex.passport.internal.report.f6;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.f0;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.s9;
import com.yandex.passport.internal.report.z5;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginActivity;
import com.yandex.passport.internal.ui.util.l;
import defpackage.b6e;
import defpackage.zh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xjj
    public final void onChanged(Object obj) {
        com.yandex.passport.common.core.f fVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LinksHandlingActivity linksHandlingActivity = (LinksHandlingActivity) obj2;
                e eVar = (e) obj;
                int i2 = LinksHandlingActivity.r;
                eVar.getClass();
                linksHandlingActivity.k = eVar.a;
                zh zhVar = linksHandlingActivity.g;
                linksHandlingActivity.m = eVar.c;
                linksHandlingActivity.n = eVar.d;
                com.yandex.passport.internal.l lVar = eVar.b;
                Long l = null;
                linksHandlingActivity.p = lVar != null ? lVar.b : null;
                if (eVar instanceof a) {
                    if (lVar == null) {
                        com.yandex.passport.internal.properties.l lVar2 = linksHandlingActivity.l;
                        if (lVar2 != null) {
                            zhVar.a(lVar2);
                            return;
                        } else {
                            Intrinsics.j("loginProperties");
                            throw null;
                        }
                    }
                    com.yandex.passport.common.core.f fVar2 = lVar.b;
                    linksHandlingActivity.p(fVar2);
                    g0 g0Var = linksHandlingActivity.i;
                    if (g0Var == null) {
                        Intrinsics.j("reporter");
                        throw null;
                    }
                    Uri uri = linksHandlingActivity.k;
                    if (uri == null) {
                        Intrinsics.j("cardUri");
                        throw null;
                    }
                    h hVar = linksHandlingActivity.m;
                    if (hVar != null) {
                        g0Var.u(fVar2, uri, hVar);
                        return;
                    } else {
                        Intrinsics.j("mode");
                        throw null;
                    }
                }
                if (eVar instanceof c) {
                    com.yandex.passport.internal.properties.l lVar3 = linksHandlingActivity.l;
                    if (lVar3 == null) {
                        Intrinsics.j("loginProperties");
                        throw null;
                    }
                    zhVar.a(lVar3);
                    g0 g0Var2 = linksHandlingActivity.i;
                    if (g0Var2 != null) {
                        g0Var2.p(z5.d);
                        return;
                    } else {
                        Intrinsics.j("reporter");
                        throw null;
                    }
                }
                if (eVar instanceof d) {
                    linksHandlingActivity.q = true;
                    d dVar = (d) eVar;
                    com.yandex.passport.internal.l lVar4 = dVar.f;
                    linksHandlingActivity.q(lVar4 != null ? lVar4.b : null);
                    g0 g0Var3 = linksHandlingActivity.i;
                    if (g0Var3 == null) {
                        Intrinsics.j("reporter");
                        throw null;
                    }
                    if (lVar4 != null && (fVar = lVar4.b) != null) {
                        l = Long.valueOf(fVar.b);
                    }
                    f0 f0Var = dVar.h;
                    f0Var.getClass();
                    g0Var3.n(f6.d, new com.yandex.passport.internal.report.c(String.valueOf(l), 3), new com.yandex.passport.internal.report.f(f0Var.a, 11));
                    return;
                }
                if (!(eVar instanceof b)) {
                    b6e.s();
                    return;
                }
                b bVar = (b) eVar;
                linksHandlingActivity.o = bVar.g;
                if (lVar == null) {
                    com.yandex.passport.internal.properties.l lVar5 = linksHandlingActivity.l;
                    if (lVar5 != null) {
                        zhVar.a(lVar5);
                        return;
                    } else {
                        Intrinsics.j("loginProperties");
                        throw null;
                    }
                }
                com.yandex.passport.common.core.f fVar3 = lVar.b;
                g0 g0Var4 = linksHandlingActivity.i;
                if (g0Var4 == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                Uri uri2 = bVar.e;
                fVar3.getClass();
                uri2.getClass();
                g0Var4.n(s9.d, new ff(fVar3), new com.yandex.passport.internal.report.c(uri2));
                linksHandlingActivity.p(fVar3);
                return;
            case 1:
                AutoLoginRetryActivity autoLoginRetryActivity = (AutoLoginRetryActivity) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                autoLoginRetryActivity.f.setVisibility(booleanValue ? 0 : 8);
                autoLoginRetryActivity.e.setVisibility(booleanValue ? 8 : 0);
                return;
            case 2:
                com.yandex.passport.internal.ui.domik.common.e eVar2 = (com.yandex.passport.internal.ui.domik.common.e) obj2;
                m mVar = (m) obj;
                if (mVar instanceof k) {
                    k kVar = (k) mVar;
                    eVar2.requireArguments().putParcelable("phone_confirmation_result", kVar);
                    com.yandex.passport.internal.ui.util.a aVar = eVar2.w;
                    aVar.f = kVar.a;
                    aVar.a();
                    eVar2.t.setCodeLength(kVar.c);
                    return;
                }
                return;
            default:
                com.yandex.passport.internal.ui.social.mail.b bVar2 = (com.yandex.passport.internal.ui.social.mail.b) obj2;
                com.yandex.passport.internal.l lVar6 = (com.yandex.passport.internal.l) obj;
                lVar6.getClass();
                if (!(bVar2.l() instanceof com.yandex.passport.internal.ui.social.mail.a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar2.requireActivity());
                    String simpleName = com.yandex.passport.internal.ui.social.mail.a.class.getSimpleName();
                    sb.append(" must implement ");
                    sb.append(simpleName);
                    throw new IllegalStateException(sb.toString());
                }
                com.yandex.passport.internal.ui.social.mail.a aVar2 = (com.yandex.passport.internal.ui.social.mail.a) bVar2.l();
                aVar2.getClass();
                MailPasswordLoginActivity mailPasswordLoginActivity = (MailPasswordLoginActivity) aVar2;
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("accountType", com.yandex.passport.internal.ui.a.a);
                bundle.putString("authAccount", lVar6.j);
                com.yandex.passport.common.core.f fVar4 = lVar6.b;
                fVar4.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("passport-uid", fVar4);
                intent.putExtras(bundle2);
                intent.putExtras(bundle);
                mailPasswordLoginActivity.setResult(-1, intent);
                mailPasswordLoginActivity.finish();
                return;
        }
    }
}
