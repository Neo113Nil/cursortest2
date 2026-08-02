package com.yandex.passport.internal.links;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.api.k0;
import com.yandex.passport.api.n;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.properties.k;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.m0;
import com.yandex.passport.internal.report.a6;
import com.yandex.passport.internal.report.b6;
import com.yandex.passport.internal.report.c6;
import com.yandex.passport.internal.report.d6;
import com.yandex.passport.internal.report.e6;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.p9;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.y5;
import com.yandex.passport.internal.report.ze;
import com.yandex.passport.internal.ui.sloth.ebs.n1;
import com.yandex.passport.internal.ui.sloth.webcard.n0;
import com.yandex.passport.internal.ui.sloth.webcard.o0;
import com.yandex.passport.internal.ui.sloth.webcard.r0;
import com.yandex.passport.internal.ui.sloth.webcard.s0;
import com.yandex.passport.internal.ui.util.q;
import com.yandex.passport.internal.util.m;
import com.yandex.passport.internal.w;
import com.yandex.passport.sloth.data.d0;
import com.yandex.passport.sloth.data.v;
import com.yandex.passport.sloth.data.x;
import defpackage.b6e;
import defpackage.btf;
import defpackage.gi;
import defpackage.j9w;
import defpackage.jw7;
import defpackage.jyr;
import defpackage.ot0;
import defpackage.qh;
import defpackage.u75;
import defpackage.vh;
import defpackage.x97;
import defpackage.xz0;
import defpackage.zh;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LinksHandlingActivity extends com.yandex.passport.internal.ui.c {
    public static final /* synthetic */ int r = 0;
    public g h;
    public g0 i;
    public com.yandex.passport.internal.flags.i j;
    public Uri k;
    public l l;
    public h m;
    public String n;
    public com.yandex.passport.common.core.f p;
    public boolean q;
    public final zh d = registerForActivityResult(new n1(7), new j(this, 1));
    public final zh e = registerForActivityResult(new n1(6), new j(this, 0));
    public final jyr f = btf.b(new com.yandex.passport.internal.common.e(6, this));
    public final zh g = registerForActivityResult(new vh(16), new gi(12, this));
    public String o = "";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(LinksHandlingActivity linksHandlingActivity, s0 s0Var) {
        com.yandex.passport.common.browser.b bVar;
        e eVar;
        boolean z;
        Uri uri;
        zh zhVar = linksHandlingActivity.g;
        if (Intrinsics.d(s0Var, n0.a)) {
            l lVar = linksHandlingActivity.l;
            if (lVar == null) {
                Intrinsics.j("loginProperties");
                throw null;
            }
            zhVar.a(lVar);
        } else if (s0Var instanceof r0) {
            l lVar2 = linksHandlingActivity.l;
            if (lVar2 == null) {
                Intrinsics.j("loginProperties");
                throw null;
            }
            zhVar.a(l.a(lVar2, com.yandex.plus.pay.ui.core.b.J(((r0) s0Var).a), null, null, 1073741759));
        } else if (s0Var instanceof o0) {
            h hVar = linksHandlingActivity.m;
            if (hVar == null) {
                Intrinsics.j("mode");
                throw null;
            }
            if (hVar == h.d) {
                g0 g0Var = linksHandlingActivity.i;
                if (g0Var == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                g0Var.n(p9.d, new com.yandex.passport.internal.report.c(Uri.parse(((o0) s0Var).a)));
            }
            linksHandlingActivity.finishAndRemoveTask();
            g gVar = linksHandlingActivity.h;
            if (gVar == null) {
                Intrinsics.j("viewModel");
                throw null;
            }
            String str = ((o0) s0Var).a;
            q qVar = gVar.z;
            e eVar2 = (e) qVar.d();
            String str2 = eVar2 != null ? eVar2.d : null;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -644447785:
                        if (str2.equals("YandexBrowser")) {
                            bVar = com.yandex.passport.common.browser.b.b;
                            break;
                        }
                        break;
                    case -182261529:
                        if (str2.equals("Samsung Internet")) {
                            bVar = com.yandex.passport.common.browser.b.i;
                            break;
                        }
                        break;
                    case -26738761:
                        if (str2.equals("MobileFirefox")) {
                            bVar = com.yandex.passport.common.browser.b.e;
                            break;
                        }
                        break;
                    case 69017:
                        if (str2.equals("EUI")) {
                            bVar = com.yandex.passport.common.browser.b.f;
                            break;
                        }
                        break;
                    case 2366768:
                        if (str2.equals("MIUI")) {
                            bVar = com.yandex.passport.common.browser.b.g;
                            break;
                        }
                        break;
                    case 686186037:
                        if (str2.equals("OperaMobile")) {
                            bVar = com.yandex.passport.common.browser.b.h;
                            break;
                        }
                        break;
                    case 908877788:
                        if (str2.equals("ChromeMobile")) {
                            bVar = com.yandex.passport.common.browser.b.d;
                            break;
                        }
                        break;
                    case 1423310105:
                        if (str2.equals("YandexSearch")) {
                            bVar = com.yandex.passport.common.browser.b.c;
                            break;
                        }
                        break;
                }
                eVar = (e) qVar.d();
                if (eVar != null || (uri = eVar.a) == null || (r5 = uri.toString()) == null) {
                    String str3 = "";
                }
                Uri uri2 = com.yandex.passport.common.browser.c.a;
                if (bVar != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    linksHandlingActivity.startActivity(intent);
                } else {
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent2.setPackage(bVar.a);
                        intent2.addFlags(268435456);
                        linksHandlingActivity.startActivity(intent2);
                    } catch (ActivityNotFoundException unused) {
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent3.addFlags(268435456);
                        linksHandlingActivity.startActivity(intent3);
                        z = false;
                    }
                }
                z = true;
                g0 g0Var2 = gVar.s;
                if (!z) {
                    bVar = null;
                }
                g0Var2.getClass();
                com.yandex.passport.internal.ui.a.y(g0Var2.b, b6.d, xz0.w(new ze[]{new com.yandex.passport.internal.report.c(Uri.parse(str3)), bVar == null ? new com.yandex.passport.internal.report.a(bVar) : null}));
            }
            bVar = null;
            eVar = (e) qVar.d();
            if (eVar != null) {
            }
            String str32 = "";
            Uri uri22 = com.yandex.passport.common.browser.c.a;
            if (bVar != null) {
            }
            z = true;
            g0 g0Var22 = gVar.s;
            if (!z) {
            }
            g0Var22.getClass();
            com.yandex.passport.internal.ui.a.y(g0Var22.b, b6.d, xz0.w(new ze[]{new com.yandex.passport.internal.report.c(Uri.parse(str32)), bVar == null ? new com.yandex.passport.internal.report.a(bVar) : null}));
        } else if (Intrinsics.d(s0Var, n0.c)) {
            com.yandex.passport.common.core.f fVar = linksHandlingActivity.p;
            if (fVar != null) {
                g0 g0Var3 = linksHandlingActivity.i;
                if (g0Var3 == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                g0Var3.n(e6.d, new com.yandex.passport.internal.report.c(String.valueOf(fVar.b), 3));
                linksHandlingActivity.p(fVar);
            } else {
                l lVar3 = linksHandlingActivity.l;
                if (lVar3 == null) {
                    Intrinsics.j("loginProperties");
                    throw null;
                }
                zhVar.a(lVar3);
            }
        } else {
            g0 g0Var4 = linksHandlingActivity.i;
            if (g0Var4 == null) {
                Intrinsics.j("reporter");
                throw null;
            }
            g0Var4.p(a6.d);
            qh w = com.yandex.plus.core.locale.b.w(s0Var);
            linksHandlingActivity.setResult(w.a, w.b);
            linksHandlingActivity.finish();
        }
        g0 g0Var5 = linksHandlingActivity.i;
        if (g0Var5 == null) {
            Intrinsics.j("reporter");
            throw null;
        }
        boolean isFinishing = linksHandlingActivity.isFinishing();
        s0Var.getClass();
        g0Var5.n(d6.d, new ff(s0Var), new com.yandex.passport.internal.report.f(17, isFinishing));
    }

    public final void n() {
        finish();
        g0 g0Var = this.i;
        if (g0Var == null) {
            Intrinsics.j("reporter");
            throw null;
        }
        h hVar = this.m;
        if (hVar != null) {
            g0Var.n(y5.d, new com.yandex.passport.internal.report.f(hVar));
        } else {
            Intrinsics.j("mode");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        k0 k0Var;
        super.onCreate(bundle);
        if (Intrinsics.d(getIntent().getAction(), "com.yandex.passport.action.YA_PAY")) {
            finish();
            return;
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.i = a.getLinkHandlingReporter();
        this.j = a.getFlagRepository();
        Uri data = getIntent().getData();
        g0 g0Var = this.i;
        if (g0Var == null) {
            Intrinsics.j("reporter");
            throw null;
        }
        com.yandex.passport.internal.ui.a.y(g0Var.b, c6.d, u75.i(data != null ? new com.yandex.passport.internal.report.c(data) : null));
        if (data == null) {
            finish();
            return;
        }
        getIntent().setData(null);
        k kVar = new k();
        com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
        Object obj = m.a;
        String queryParameter = data.getQueryParameter("pay_url");
        String host = queryParameter != null ? Uri.parse(queryParameter).getHost() : data.getHost();
        if (host != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "host ".concat(host), 8);
            }
            for (Pattern pattern : ((Map) m.b.getValue()).keySet()) {
                if (pattern.matcher(host).matches()) {
                    k0Var = (k0) ((Map) m.b.getValue()).get(pattern);
                    break;
                }
            }
        }
        k0Var = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "determineEnvironment: " + data + " result: " + k0Var, 8);
        }
        if (k0Var == null) {
            k0Var = com.yandex.passport.api.impl.b.c;
        }
        jVar.O(k0Var);
        jVar.y(n.CHILDISH);
        kVar.b = com.yandex.passport.internal.ui.a.s(jVar.l());
        this.l = kVar.a();
        setContentView(R.layout.passport_activity_link_handling);
        g gVar = (g) w.d(this, g.class, new jw7(2, a, this, data));
        this.h = gVar;
        gVar.z.n(this, new i(0, this));
        g gVar2 = this.h;
        if (gVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        l lVar = this.l;
        if (lVar == null) {
            Intrinsics.j("loginProperties");
            throw null;
        }
        x97.y(ot0.F(gVar2), null, null, new j9w(gVar2, lVar, null, 15), 3);
    }

    public final void p(com.yandex.passport.common.core.f fVar) {
        com.yandex.passport.sloth.data.o0 vVar;
        zh zhVar = (zh) this.f.getValue();
        h hVar = this.m;
        if (hVar == null) {
            Intrinsics.j("mode");
            throw null;
        }
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri uri = this.k;
        if (uri == null) {
            Intrinsics.j("cardUri");
            throw null;
        }
        aVar.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            l lVar = this.l;
            if (lVar == null) {
                Intrinsics.j("loginProperties");
                throw null;
            }
            vVar = new v(fVar, com.yandex.plus.core.network.api.utils.a.S(lVar.e), uri2);
        } else if (ordinal == 1) {
            vVar = new com.yandex.passport.sloth.data.w(fVar, uri2);
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            vVar = new d0(uri2, fVar, this.o);
        }
        l lVar2 = this.l;
        if (lVar2 == null) {
            Intrinsics.j("loginProperties");
            throw null;
        }
        com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a);
        l lVar3 = this.l;
        if (lVar3 == null) {
            Intrinsics.j("loginProperties");
            throw null;
        }
        m0 m0Var = lVar3.u;
        com.yandex.passport.internal.flags.i iVar = this.j;
        if (iVar != null) {
            zhVar.a(new com.yandex.passport.sloth.data.m(vVar, L, com.yandex.plus.core.network.api.utils.a.J(m0Var, ((Boolean) iVar.b(o.y)).booleanValue()), 4));
        } else {
            Intrinsics.j("flagsRepository");
            throw null;
        }
    }

    public final void q(com.yandex.passport.common.core.f fVar) {
        com.yandex.passport.common.properties.a aVar;
        boolean z = fVar == null;
        String str = this.n;
        if (str == null) {
            str = "null";
        }
        l lVar = this.l;
        if (lVar == null) {
            Intrinsics.j("loginProperties");
            throw null;
        }
        m0 m0Var = lVar.u;
        if (m0Var != null) {
            boolean z2 = m0Var.d;
            String str2 = m0Var.e;
            com.yandex.passport.internal.flags.i iVar = this.j;
            if (iVar == null) {
                Intrinsics.j("flagsRepository");
                throw null;
            }
            aVar = new com.yandex.passport.common.properties.a(str2, z2, z, ((Boolean) iVar.b(o.y)).booleanValue());
        } else {
            com.yandex.passport.internal.flags.i iVar2 = this.j;
            if (iVar2 == null) {
                Intrinsics.j("flagsRepository");
                throw null;
            }
            aVar = new com.yandex.passport.common.properties.a(3, z, ((Boolean) iVar2.b(o.y)).booleanValue());
        }
        zh zhVar = (zh) this.f.getValue();
        x xVar = new x(fVar, str);
        l lVar2 = this.l;
        if (lVar2 != null) {
            zhVar.a(new com.yandex.passport.sloth.data.m(xVar, com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a), aVar, 4));
        } else {
            Intrinsics.j("loginProperties");
            throw null;
        }
    }
}
