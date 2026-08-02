package defpackage;

import android.net.Uri;
import com.yandex.plus.log.api.LogPriority;
import java.net.URI;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class v6f0 implements vpu {
    public static final Uri d = Uri.parse("https://egw.home-gateway.plus.yandex.net");
    public static final Uri e = Uri.parse("https://egw.pull-formats.plet.yandex.net");
    public static final Uri f = Uri.parse("https://api.plus.yandex.net/graphql");
    public static final Uri g = Uri.parse("https://avatars.mds.yandex.net");
    public static final Uri h = Uri.parse("https://plus.yandex.ru/home");
    public static final Uri i = Uri.parse("https://plus.yandex.ru/story");
    public final hzk a;
    public final t9a0 b;
    public final rkd0 c;

    public v6f0(hzk hzkVar, t9a0 t9a0Var, rkd0 rkd0Var) {
        this.a = hzkVar;
        this.b = t9a0Var;
        this.c = rkd0Var;
    }

    public static String h(String str) {
        URI uri = new URI(null, str, null, null);
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() != 0) {
            h490.c(unr0.x("Host '", str, "' contains scheme '"), uri.getScheme());
            return null;
        }
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            h490.c(unr0.x("Host '", str, "' contains path '"), uri.getPath());
            return null;
        }
        String fragment = uri.getFragment();
        if (fragment == null || fragment.length() == 0) {
            return uri.getHost();
        }
        h490.c(unr0.x("Host '", str, "' contains fragment '"), uri.getFragment());
        return null;
    }

    @Override // defpackage.vpu
    public final Uri a() {
        rkd0 rkd0Var = this.c;
        Uri uri = e;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(m3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getPullFormatsGatewayWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getPullFormatsGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // defpackage.vpu
    public final Uri b() {
        Uri uri = ((Boolean) this.b.invoke()).booleanValue() ? e : d;
        rkd0 rkd0Var = this.c;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(m3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getRestGatewayWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getRestGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // defpackage.vpu
    public final Uri c() {
        rkd0 rkd0Var = this.c;
        Uri uri = d;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(m3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getHomeGatewayWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getHomeGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // defpackage.vpu
    public final Uri d() {
        rkd0 rkd0Var = this.c;
        Uri uri = g;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(j3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getHomeAvatarsGatewayWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getHomeAvatarsGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // defpackage.vpu
    public final Uri e() {
        rkd0 rkd0Var = this.c;
        Uri uri = f;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(k3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getGraphqlGatewayWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getGraphqlGatewayWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // defpackage.vpu
    public final Uri f() {
        rkd0 rkd0Var = this.c;
        Uri uri = h;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(l3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getHomeWebViewWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getHomeWebViewWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }

    @Override // defpackage.vpu
    public final Uri g() {
        rkd0 rkd0Var = this.c;
        Uri uri = i;
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Object f2 = hzkVar.f(n3d0.a);
            if (!(f2 instanceof Result.Failure)) {
                try {
                    f2 = uri.buildUpon().authority(h((String) f2)).build();
                } catch (Throwable th) {
                    f2 = new Result.Failure(th);
                }
            }
            Throwable a = Result.a(f2);
            if (a != null) {
                LogPriority logPriority = LogPriority.ERROR;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "ProdHomeWeblinksProvider", "getStoryWebViewWeblink()", a);
                }
            }
            if (f2 instanceof Result.Failure) {
                f2 = null;
            }
            Uri uri2 = (Uri) f2;
            if (uri2 != null) {
                uri = uri2;
            }
        }
        LogPriority logPriority2 = LogPriority.INFO;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "ProdHomeWeblinksProvider", "getStoryWebViewWeblink() returns '" + uri + '\'', null);
        }
        return uri;
    }
}
