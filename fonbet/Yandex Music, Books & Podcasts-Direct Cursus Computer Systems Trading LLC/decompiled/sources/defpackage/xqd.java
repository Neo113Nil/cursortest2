package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class xqd {
    public static final Logger a = Logger.getLogger(xqd.class.getName());
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(rgr.OK, rgr.INVALID_ARGUMENT, rgr.NOT_FOUND, rgr.ALREADY_EXISTS, rgr.FAILED_PRECONDITION, rgr.ABORTED, rgr.OUT_OF_RANGE, rgr.DATA_LOSS));
    public static final Charset c = Charset.forName("US-ASCII");
    public static final l2i d = new l2i("grpc-timeout", new i9w());
    public static final l2i e;
    public static final q2i f;
    public static final l2i g;
    public static final q2i h;
    public static final l2i i;
    public static final l2i j;
    public static final l2i k;
    public static final l2i l;
    public static final rjp m;
    public static final long n;
    public static final xzm o;
    public static final js3 p;
    public static final uqd q;
    public static final e3s r;
    public static final gos s;
    public static final vqd t;

    static {
        rwd rwdVar = s2i.d;
        e = new l2i("grpc-encoding", rwdVar);
        f = wue.a("grpc-accept-encoding", new ehv(24));
        g = new l2i("content-encoding", rwdVar);
        h = wue.a("accept-encoding", new ehv(24));
        i = new l2i("content-length", rwdVar);
        j = new l2i("content-type", rwdVar);
        k = new l2i("te", rwdVar);
        l = new l2i("user-agent", rwdVar);
        rjp e2 = rjp.e(',');
        be4 be4Var = be4.c;
        be4Var.getClass();
        m = new rjp((z6n) e2.b, be4Var, false);
        n = 20000000000L;
        o = new xzm();
        p = new js3("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 0);
        q = new uqd();
        int i2 = 24;
        r = new e3s(i2);
        s = new gos(i2);
        t = new vqd(0);
    }

    public static URI a(String str) {
        String str2;
        o2g.O(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static qo4[] c(ks3 ks3Var, s2i s2iVar, int i2, boolean z) {
        List list = ks3Var.d;
        int size = list.size();
        qo4[] qo4VarArr = new qo4[size + 1];
        ks3 ks3Var2 = ks3.h;
        e0 e0Var = new e0(ks3Var, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            qo4VarArr[i3] = ((po4) list.get(i3)).a(e0Var, s2iVar);
        }
        qo4VarArr[size] = q;
        return qo4VarArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ofs e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new ofs(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ro4 f(xdg xdgVar, boolean z) {
        kwe kweVar;
        zdg zdgVar = xdgVar.a;
        sgr sgrVar = xdgVar.c;
        if (zdgVar != null) {
            owe oweVar = (owe) zdgVar.w();
            kweVar = oweVar.u;
            if (kweVar == null) {
                oweVar.j.execute(new gwe(oweVar, 1));
            }
            if (kweVar == null) {
                po4 po4Var = xdgVar.b;
                return po4Var == null ? kweVar : new s4c(po4Var, kweVar);
            }
            if (!sgrVar.g()) {
                if (xdgVar.d) {
                    return new s4c(h(sgrVar), no4.c);
                }
                if (!z) {
                    return new s4c(h(sgrVar), no4.a);
                }
            }
            return null;
        }
        kweVar = null;
        if (kweVar == null) {
        }
    }

    public static sgr g(int i2) {
        rgr rgrVar;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    rgrVar = rgr.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    rgrVar = rgr.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    rgrVar = rgr.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    rgrVar = rgr.UNAVAILABLE;
                } else {
                    rgrVar = rgr.UNIMPLEMENTED;
                }
            }
            rgrVar = rgr.INTERNAL;
        } else {
            rgrVar = rgr.INTERNAL;
        }
        return rgrVar.a().i("HTTP status code " + i2);
    }

    public static sgr h(sgr sgrVar) {
        o2g.L(sgrVar != null);
        if (!b.contains(sgrVar.a)) {
            return sgrVar;
        }
        return sgr.n.i("Inappropriate status code from control plane: " + sgrVar.a + StringUtil.SPACE + sgrVar.b).h(sgrVar.c);
    }
}
