package com.yandex.plus.home.network.hosts;

import android.net.Uri;
import androidx.core.app.q;
import com.yandex.passport.data.network.l;
import com.yandex.plus.bdui.plus.checkout.h;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.home.api.network.e;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.net.URI;

/* loaded from: classes5.dex */
public final class b implements a {
    public static final Uri d = Uri.parse("https://egw.home-gateway.plus.yandex.net");
    public static final Uri e = Uri.parse("https://egw.pull-formats.plet.yandex.net");
    public static final Uri f = Uri.parse("https://api.plus.yandex.net/graphql");
    public static final Uri g = Uri.parse("https://avatars.mds.yandex.net");
    public static final Uri h = Uri.parse("https://plus.yandex.ru/home");
    public static final Uri i = Uri.parse("https://plus.yandex.ru/story");
    public final l a;
    public final h b;
    public final d c;

    public b(l lVar, h hVar, d dVar) {
        this.a = lVar;
        this.b = hVar;
        this.c = dVar;
    }

    public static String h(String str) {
        URI uri = new URI(null, str, null, null);
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() != 0) {
            q.k(ouj.u("Host '", str, "' contains scheme '"), uri.getScheme());
            return null;
        }
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            q.k(ouj.u("Host '", str, "' contains path '"), uri.getPath());
            return null;
        }
        String fragment = uri.getFragment();
        if (fragment != null && fragment.length() != 0) {
            q.k(ouj.u("Host '", str, "' contains fragment '"), uri.getFragment());
            return null;
        }
        String host = uri.getHost();
        host.getClass();
        return host;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri a() {
        d dVar = this.c;
        Uri uri = e;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(com.yandex.plus.home.api.network.d.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getPullFormatsGatewayWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getPullFormatsGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri b() {
        d dVar = this.c;
        Uri uri = d;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(com.yandex.plus.home.api.network.d.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getHomeGatewayWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getHomeGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri c() {
        d dVar = this.c;
        Uri uri = g;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(com.yandex.plus.home.api.network.a.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getHomeAvatarsGatewayWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getHomeAvatarsGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri d() {
        d dVar = this.c;
        Uri uri = f;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(com.yandex.plus.home.api.network.b.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getGraphqlGatewayWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getGraphqlGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri e() {
        d dVar = this.c;
        Uri uri = h;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(com.yandex.plus.home.api.network.c.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getHomeWebViewWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getHomeWebViewWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri f() {
        d dVar = this.c;
        Uri uri = i;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(e.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getStoryWebViewWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getStoryWebViewWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // com.yandex.plus.home.network.hosts.a
    public final Uri g() {
        Uri uri = ((Boolean) this.b.invoke()).booleanValue() ? e : d;
        d dVar = this.c;
        l lVar = this.a;
        if (lVar != null) {
            Object x = lVar.x(com.yandex.plus.home.api.network.d.a);
            r7o r7oVar = z7o.b;
            if (!(x instanceof t7o)) {
                try {
                    x = uri.buildUpon().authority(h((String) x)).build();
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    x = new t7o(th);
                }
            }
            Throwable a = z7o.a(x);
            if (a != null) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "ProdHomeWeblinksProvider", "getRestGatewayWeblink()", a);
                }
            }
            if (x instanceof t7o) {
                x = null;
            }
            Uri uri2 = (Uri) x;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "ProdHomeWeblinksProvider", "getRestGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }
}
