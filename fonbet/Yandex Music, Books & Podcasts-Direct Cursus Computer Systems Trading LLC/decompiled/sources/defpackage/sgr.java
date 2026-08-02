package defpackage;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class sgr {
    public static final List d;
    public static final sgr e;
    public static final sgr f;
    public static final sgr g;
    public static final sgr h;
    public static final sgr i;
    public static final sgr j;
    public static final sgr k;
    public static final sgr l;
    public static final sgr m;
    public static final sgr n;
    public static final sgr o;
    public static final q2i p;
    public static final q2i q;
    public final rgr a;
    public final String b;
    public final Throwable c;

    static {
        TreeMap treeMap = new TreeMap();
        for (rgr rgrVar : rgr.values()) {
            sgr sgrVar = (sgr) treeMap.put(Integer.valueOf(rgrVar.a), new sgr(rgrVar, null, null));
            if (sgrVar != null) {
                e7o.l("Code value duplication between ", sgrVar.a.name(), " & ", rgrVar.name());
                return;
            }
        }
        d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        e = rgr.OK.a();
        f = rgr.CANCELLED.a();
        g = rgr.UNKNOWN.a();
        h = rgr.INVALID_ARGUMENT.a();
        i = rgr.DEADLINE_EXCEEDED.a();
        rgr.NOT_FOUND.a();
        rgr.ALREADY_EXISTS.a();
        j = rgr.PERMISSION_DENIED.a();
        k = rgr.UNAUTHENTICATED.a();
        l = rgr.RESOURCE_EXHAUSTED.a();
        rgr.FAILED_PRECONDITION.a();
        rgr.ABORTED.a();
        rgr.OUT_OF_RANGE.a();
        m = rgr.UNIMPLEMENTED.a();
        n = rgr.INTERNAL.a();
        o = rgr.UNAVAILABLE.a();
        rgr.DATA_LOSS.a();
        p = new q2i("grpc-status", false, new ddl());
        q = new q2i("grpc-message", false, new e3s(8));
    }

    public sgr(rgr rgrVar, String str, Throwable th) {
        o2g.O(rgrVar, "code");
        this.a = rgrVar;
        this.b = str;
        this.c = th;
    }

    public static String d(sgr sgrVar) {
        String str = sgrVar.b;
        rgr rgrVar = sgrVar.a;
        if (str == null) {
            return rgrVar.toString();
        }
        return rgrVar + ": " + sgrVar.b;
    }

    public static sgr e(int i2) {
        if (i2 >= 0) {
            List list = d;
            if (i2 < list.size()) {
                return (sgr) list.get(i2);
            }
        }
        return g.i("Unknown code " + i2);
    }

    public static sgr f(Throwable th) {
        o2g.O(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof tgr) {
                return ((tgr) th2).a;
            }
            if (th2 instanceof wgr) {
                return ((wgr) th2).a;
            }
        }
        return g.h(th);
    }

    public final tgr a() {
        return new tgr(this, null);
    }

    public final wgr b() {
        return new wgr(this, true);
    }

    public final sgr c(String str) {
        Throwable th = this.c;
        String str2 = this.b;
        rgr rgrVar = this.a;
        return str2 == null ? new sgr(rgrVar, str, th) : new sgr(rgrVar, ouj.o(str2, StringUtil.LF, str), th);
    }

    public final boolean g() {
        return rgr.OK == this.a;
    }

    public final sgr h(Throwable th) {
        return hdg.S(this.c, th) ? this : new sgr(this.a, this.b, th);
    }

    public final sgr i(String str) {
        return hdg.S(this.b, str) ? this : new sgr(this.a, str, this.c);
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a.name(), "code");
        Y.q(this.b, DeviceService.KEY_DESC);
        Throwable th = this.c;
        Object obj = th;
        if (th != null) {
            Object obj2 = fgs.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        Y.q(obj, "cause");
        return Y.toString();
    }
}
