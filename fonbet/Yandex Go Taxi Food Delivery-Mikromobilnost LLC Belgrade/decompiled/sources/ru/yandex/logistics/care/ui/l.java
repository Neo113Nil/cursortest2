package ru.yandex.logistics.care.ui;

import defpackage.at8;
import defpackage.bg1;
import defpackage.bvf0;
import defpackage.cd0;
import defpackage.ct8;
import defpackage.cu8;
import defpackage.ds31;
import defpackage.dt8;
import defpackage.ffx;
import defpackage.fr8;
import defpackage.ft8;
import defpackage.gci0;
import defpackage.geh;
import defpackage.gly0;
import defpackage.gt8;
import defpackage.h2t;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.jr8;
import defpackage.k5c;
import defpackage.kt8;
import defpackage.me0;
import defpackage.nr8;
import defpackage.or8;
import defpackage.ot8;
import defpackage.pzt0;
import defpackage.q2u0;
import defpackage.q4c;
import defpackage.rt8;
import defpackage.s421;
import defpackage.sl41;
import defpackage.sls;
import defpackage.sr4;
import defpackage.tje;
import defpackage.tm41;
import defpackage.vt8;
import defpackage.wsr0;
import defpackage.x9o;
import defpackage.xsr0;
import defpackage.xt8;
import defpackage.ytx0;
import defpackage.yxg0;
import defpackage.zax;
import defpackage.zt8;
import java.net.URI;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.care.ui.b;
import ru.yandex.logistics.care.ui.l;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes4.dex */
public final class l extends vt8 {
    public static final int S = yxg0.ic_progress;
    public final geh A;
    public final or8 B;
    public final i3y C;
    public xt8 D;
    public c E;
    public pzt0 F;
    public pzt0 G;
    public final n0 H;
    public int I;
    public final r0 J;
    public final cu8 K;
    public final r0 L;
    public final gci0 M;
    public final gci0 N;
    public final n0 O;
    public final n0 P;
    public final r0 Q;
    public final tm41 R;
    public final b b;
    public final gt8 c;
    public final a w;
    public final me0 x;
    public final ru.yandex.logistics.care.domain.a y;
    public final h2t z;

    /* JADX WARN: Type inference failed for: r8v13, types: [wt8] */
    public l(b bVar, gt8 gt8Var, a aVar, me0 me0Var, ru.yandex.logistics.care.domain.a aVar2, h2t h2tVar) {
        at8 at8Var = gt8Var.a;
        ru.yandex.taxi.logistics.care.impl.router.e eVar = gt8Var.c;
        this.b = bVar;
        this.c = gt8Var;
        this.w = aVar;
        this.x = me0Var;
        this.y = aVar2;
        this.z = h2tVar;
        dt8 dt8Var = gt8Var.b;
        this.A = dt8Var.b;
        or8 or8Var = dt8Var.f;
        or8Var = or8Var == nr8.a ? null : or8Var;
        or8Var = or8Var == null ? new gly0(eVar) : or8Var;
        this.B = or8Var;
        final int i = 1;
        this.C = kotlin.a.a(new sls(this) { // from class: wt8
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Object failure;
                String str;
                URI uri;
                String scheme;
                String n0;
                String str2;
                int i2 = i;
                l lVar = this.b;
                switch (i2) {
                    case 0:
                        lVar.c.c.a();
                        return zy11.a;
                    default:
                        b bVar2 = lVar.b;
                        gt8 gt8Var2 = lVar.c;
                        bVar2.getClass();
                        et8 et8Var = gt8Var2.a.a;
                        if (et8Var == null) {
                            w511.b();
                            return null;
                        }
                        String str3 = et8Var.a;
                        if (cvu0.x(str3, "file://", false)) {
                            return new bt8(str3, "*");
                        }
                        xt2 xt2Var = gt8Var2.b.c;
                        if (!cvu0.x(str3, "https://", false)) {
                            if (xt2Var instanceof vt2) {
                                str2 = "https://care.yandex.ru/";
                            } else if (xt2Var instanceof wt2) {
                                str2 = "https://insurance.delivery.tst.yandex.ru/";
                            } else {
                                if (!(xt2Var instanceof ut2)) {
                                    w511.b();
                                    return null;
                                }
                                str2 = ((ut2) xt2Var).a;
                            }
                            str3 = g8e.p(evu0.n0(str2, '/'), "/", evu0.p0(str3, '/'));
                        }
                        if (et8Var == null) {
                            w511.b();
                            return null;
                        }
                        Map map = et8Var.b;
                        if (!map.isEmpty()) {
                            str3 = g8e.p(str3, evu0.y(str3, "?", false) ? "&" : "?", a.X(map.entrySet(), "&", null, null, new sd8(28), 30));
                        }
                        if (xt2Var.equals(vt2.a)) {
                            n0 = evu0.n0("care.yandex.ru/", '/');
                        } else {
                            if (!xt2Var.equals(wt2.a)) {
                                if (!(xt2Var instanceof ut2)) {
                                    w511.b();
                                    return null;
                                }
                                try {
                                    uri = new URI(((ut2) xt2Var).a);
                                    scheme = uri.getScheme();
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                if (scheme == null) {
                                    throw new IllegalStateException("no scheme");
                                }
                                String host = uri.getHost();
                                if (host == null) {
                                    throw new IllegalStateException("no host");
                                }
                                failure = scheme + "://" + host;
                                str = (String) (failure instanceof Result.Failure ? "*" : failure);
                                return new bt8(str3, str);
                            }
                            n0 = evu0.n0("insurance.delivery.tst.yandex.ru/", '/');
                        }
                        str = g8e.o("https://", n0);
                        return new bt8(str3, str);
                }
            }
        });
        this.D = new xt8(0L, 15);
        this.E = new c(3);
        final int i2 = 0;
        n0 c = ffx.c(0, 0, null, 7);
        this.H = c;
        this.J = bvf0.c(new zt8(WebViewState.LOADING));
        cu8 cu8Var = new cu8(this);
        this.K = cu8Var;
        r0 c2 = bvf0.c(ot8.a);
        this.L = c2;
        gci0 d = kotlinx.coroutines.flow.e.d(c2);
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(d, new CareWebViewViewModelImpl$special$$inlined$flatMapLatest$1(3, null));
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        this.M = kotlinx.coroutines.flow.e.R(X, a, q2u0Var, kt8.a);
        this.N = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.X(d, new CareWebViewViewModelImpl$special$$inlined$flatMapLatest$2(null, this)), ds31.a(this), q2u0Var, rt8.a);
        n0 c3 = ffx.c(0, 0, null, 7);
        this.O = c3;
        this.P = c3;
        this.Q = bvf0.c(Boolean.FALSE);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(at8Var.c);
        if (at8Var.e != null) {
            mapBuilder.put("X-Mobile-App-Name", "go");
        }
        cd0 cd0Var = new cd0(17, new jqr(kotlinx.coroutines.flow.e.I(new kotlinx.coroutines.flow.n(c, new CareWebViewViewModelImpl$createConfig$urlWithHeaders$1(null, this)), new CareWebViewViewModelImpl$createConfig$urlWithHeaders$2(null, this)), new CareWebViewViewModelImpl$createConfig$urlWithHeaders$3(null, this), 3), mapBuilder.j());
        ct8 ct8Var = new ct8(gt8Var);
        j jVar = new j(this, new sls(this) { // from class: wt8
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Object failure;
                String str;
                URI uri;
                String scheme;
                String n0;
                String str2;
                int i22 = i2;
                l lVar = this.b;
                switch (i22) {
                    case 0:
                        lVar.c.c.a();
                        return zy11.a;
                    default:
                        b bVar2 = lVar.b;
                        gt8 gt8Var2 = lVar.c;
                        bVar2.getClass();
                        et8 et8Var = gt8Var2.a.a;
                        if (et8Var == null) {
                            w511.b();
                            return null;
                        }
                        String str3 = et8Var.a;
                        if (cvu0.x(str3, "file://", false)) {
                            return new bt8(str3, "*");
                        }
                        xt2 xt2Var = gt8Var2.b.c;
                        if (!cvu0.x(str3, "https://", false)) {
                            if (xt2Var instanceof vt2) {
                                str2 = "https://care.yandex.ru/";
                            } else if (xt2Var instanceof wt2) {
                                str2 = "https://insurance.delivery.tst.yandex.ru/";
                            } else {
                                if (!(xt2Var instanceof ut2)) {
                                    w511.b();
                                    return null;
                                }
                                str2 = ((ut2) xt2Var).a;
                            }
                            str3 = g8e.p(evu0.n0(str2, '/'), "/", evu0.p0(str3, '/'));
                        }
                        if (et8Var == null) {
                            w511.b();
                            return null;
                        }
                        Map map = et8Var.b;
                        if (!map.isEmpty()) {
                            str3 = g8e.p(str3, evu0.y(str3, "?", false) ? "&" : "?", a.X(map.entrySet(), "&", null, null, new sd8(28), 30));
                        }
                        if (xt2Var.equals(vt2.a)) {
                            n0 = evu0.n0("care.yandex.ru/", '/');
                        } else {
                            if (!xt2Var.equals(wt2.a)) {
                                if (!(xt2Var instanceof ut2)) {
                                    w511.b();
                                    return null;
                                }
                                try {
                                    uri = new URI(((ut2) xt2Var).a);
                                    scheme = uri.getScheme();
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                if (scheme == null) {
                                    throw new IllegalStateException("no scheme");
                                }
                                String host = uri.getHost();
                                if (host == null) {
                                    throw new IllegalStateException("no host");
                                }
                                failure = scheme + "://" + host;
                                str = (String) (failure instanceof Result.Failure ? "*" : failure);
                                return new bt8(str3, str);
                            }
                            n0 = evu0.n0("insurance.delivery.tst.yandex.ru/", '/');
                        }
                        str = g8e.o("https://", n0);
                        return new bt8(str3, str);
                }
            }
        });
        ft8 ft8Var = at8Var.d;
        this.R = new tm41(new sl41(cd0Var, new x9o(ft8Var.a, ft8Var.b, ft8Var.c, ft8Var.d), jVar, new zax(new ytx0(new h(or8Var, this, eVar), ct8Var, bVar.a)), Integer.valueOf(S), 96), new s421(new sr4(gt8Var), cu8Var, ct8Var, new bg1(this), 10), new i(or8Var, this, eVar));
    }

    public static final void c0(l lVar) {
        lVar.B.k(jr8.b);
        int i = lVar.I;
        if (i >= 2) {
            tje.N(ds31.a(lVar), null, null, new CareWebViewViewModelImpl$handleUnauthorized$1(null, lVar), 3);
        } else {
            lVar.I = i + 1;
            tje.N(ds31.a(lVar), null, null, new CareWebViewViewModelImpl$handleUnauthorized$2(null, lVar), 3);
        }
    }

    @Override // defpackage.vt8
    public final gci0 W() {
        return this.M;
    }

    @Override // defpackage.vt8
    public final gci0 X() {
        return this.N;
    }

    @Override // defpackage.vt8
    public final tm41 Y() {
        return this.R;
    }

    @Override // defpackage.vt8
    public final n0 Z() {
        return this.P;
    }

    @Override // defpackage.vt8
    public final void a0(q4c q4cVar) {
        d0(q4cVar);
        r0 r0Var = this.L;
        r0Var.getClass();
        r0Var.m(null, ot8.a);
    }

    @Override // defpackage.vt8
    public final void b0() {
        String str;
        c cVar = this.E;
        if (cVar.b) {
            return;
        }
        CareWebViewViewModelImpl$SdkCloseType careWebViewViewModelImpl$SdkCloseType = cVar.a;
        this.E = new c(1);
        if (careWebViewViewModelImpl$SdkCloseType == null || (str = careWebViewViewModelImpl$SdkCloseType.getValue()) == null) {
            str = "external";
        }
        this.B.k(new fr8(str));
    }

    public final void d0(q4c q4cVar) {
        tje.N(ds31.a(this), null, null, new CareWebViewViewModelImpl$sendPhotoVerificationResult$1(this, q4cVar, null), 3);
    }
}
