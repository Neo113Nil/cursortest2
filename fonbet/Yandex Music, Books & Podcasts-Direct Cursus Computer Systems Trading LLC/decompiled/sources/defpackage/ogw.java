package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ogw {
    public static final String b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final l2i f;
    public static final l2i g;
    public static final l2i h;
    public static final Set i;
    public final hgp a;

    static {
        String str = xhw.w;
        b = "YnisonCore:".concat("ErrorHandler");
        c = u75.h(0L, 100L, 250L, 500L, 1000L, 2500L, 5000L);
        d = u75.h(0L, 1000L, 5000L, 30000L);
        e = u75.h(1000L, 5000L, 30000L);
        rwd rwdVar = s2i.d;
        f = new l2i("Ynison-Backoff-Millis", rwdVar);
        g = new l2i("Ynison-Go-Away-For-Seconds", rwdVar);
        h = new l2i("Ynison-Error-Code", rwdVar);
        i = xz0.Y(new rgr[]{rgr.UNAVAILABLE, rgr.ABORTED, rgr.RESOURCE_EXHAUSTED});
    }

    public ogw(hgp hgpVar) {
        this.a = hgpVar;
    }

    public static List a(tgr tgrVar, boolean z) {
        String str;
        List e0;
        s2i s2iVar = tgrVar.b;
        if (s2iVar != null && (str = (String) s2iVar.c(f)) != null && (e0 = StringsKt.e0(str, new char[]{':'}, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = e0.iterator();
            while (it.hasNext()) {
                Long s0 = StringsKt.s0((String) it.next());
                if (s0 != null) {
                    arrayList.add(s0);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                if (z) {
                    arrayList = CollectionsKt.g0(t75.c(0L), arrayList);
                }
                return CollectionsKt.w0(CollectionsKt.z0(arrayList));
            }
        }
        return null;
    }

    public final o5g b(Throwable th) {
        o5g igwVar;
        o5g o5gVar;
        String str;
        String str2;
        Long r0;
        String e2;
        mgw mgwVar;
        String str3;
        String str4;
        Long r02;
        th.getClass();
        boolean booleanValue = ((Boolean) ((dfw) this.a.h).invoke()).booleanValue();
        l2i l2iVar = g;
        l2i l2iVar2 = h;
        long j = 0;
        if (booleanValue) {
            boolean z = th instanceof tgr;
            List list = e;
            if (z) {
                tgr tgrVar = (tgr) th;
                s2i s2iVar = tgrVar.b;
                if (s2iVar != null && (str4 = (String) s2iVar.c(l2iVar2)) != null && (r02 = StringsKt.r0(10, str4)) != null) {
                    j = r02.longValue();
                }
                long j2 = j;
                List a = a(tgrVar, false);
                Long r03 = (s2iVar == null || (str3 = (String) s2iVar.c(l2iVar)) == null) ? null : StringsKt.r0(10, str3);
                if (r03 != null) {
                    mgwVar = new kgw(j2, r03.longValue(), a == null ? list : a);
                } else {
                    int ordinal = ((300 > j2 || j2 >= 400) ? (400 > j2 || j2 >= 500) ? (500 > j2 || j2 >= 600) ? ngw.c : ngw.a : ngw.b : ngw.a).ordinal();
                    if (ordinal == 0) {
                        mgwVar = a != null ? new jgw(a, j2) : new lgw(j2);
                    } else if (ordinal == 1) {
                        mgwVar = new lgw(j2);
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        if (i.contains(tgrVar.a.a)) {
                            if (a != null) {
                                list = a;
                            }
                            mgwVar = new jgw(list, j2);
                        } else {
                            mgwVar = new lgw(j2);
                        }
                    }
                }
                g(tgrVar, mgwVar.T());
                o5gVar = mgwVar;
            } else if (th instanceof IOException) {
                e(th);
                o5gVar = new jgw(list, 0L);
            } else if (th instanceof bqn) {
                d((bqn) th);
                o5gVar = new jgw(list, 0L);
            } else {
                f(th);
                o5gVar = new lgw(0L);
            }
        } else if (th instanceof tgr) {
            tgr tgrVar2 = (tgr) th;
            s2i s2iVar2 = tgrVar2.b;
            if (s2iVar2 != null && (str2 = (String) s2iVar2.c(l2iVar2)) != null && (r0 = StringsKt.r0(10, str2)) != null) {
                j = r0.longValue();
            }
            long j3 = j;
            List a2 = a(tgrVar2, true);
            Long r04 = (s2iVar2 == null || (str = (String) s2iVar2.c(l2iVar)) == null) ? null : StringsKt.r0(10, str);
            mgw jgwVar = r04 == null ? new jgw(a2, j3) : new kgw(j3, r04.longValue(), a2);
            g(tgrVar2, jgwVar.T());
            o5gVar = jgwVar;
        } else {
            boolean z2 = th instanceof IOException;
            List list2 = c;
            if (z2) {
                e(th);
                igwVar = new igw(list2);
            } else if (th instanceof bqn) {
                d((bqn) th);
                igwVar = new igw(list2);
            } else {
                f(th);
                igwVar = new igw(d);
            }
            o5gVar = igwVar;
        }
        String simpleName = th.getClass().getSimpleName();
        String str5 = booleanValue ? "V2" : "legacy";
        if (o5gVar instanceof igw) {
            e2 = v3w.f("Default(backoffs=", ")", ((igw) o5gVar).c);
        } else if (o5gVar instanceof jgw) {
            jgw jgwVar2 = (jgw) o5gVar;
            e2 = "Basic(code=" + jgwVar2.c + ", backoffs=" + jgwVar2.d + ")";
        } else if (o5gVar instanceof kgw) {
            kgw kgwVar = (kgw) o5gVar;
            e2 = "GoAway(code=" + kgwVar.c + ", backoffs=" + kgwVar.d + ", timeout=" + kgwVar.e + "s)";
        } else {
            if (!(o5gVar instanceof lgw)) {
                b6e.s();
                return null;
            }
            e2 = dfi.e(((lgw) o5gVar).c, "NoRetry(code=", ")");
        }
        v3w.m(f1d.m("processChannelError(", simpleName, ") policy=", str5, " -> "), e2, 4, b, null);
        return o5gVar;
    }

    public final void c(pgw pgwVar, Map map) {
        map.getClass();
        efw efwVar = (efw) this.a.f;
        String str = pgwVar.a;
        osw oswVar = ((ndw) efwVar.b.q.getValue()).a;
        oswVar.getClass();
        oswVar.a("YNISON_ANDROID_MUSIC_" + str, map);
    }

    public final void d(bqn bqnVar) {
        String str;
        pgw pgwVar = pgw.REDIRECTOR_GRPC_CHANNEL_ERROR;
        int ordinal = bqnVar.a.ordinal();
        if (ordinal == 0) {
            str = "CONNECTING";
        } else if (ordinal == 1) {
            str = "READY";
        } else if (ordinal == 2) {
            str = "TRANSIENT";
        } else if (ordinal == 3) {
            str = "IDLE";
        } else {
            if (ordinal != 4) {
                b6e.s();
                return;
            }
            str = "SHUTDOWN";
        }
        Pair pair = new Pair("connectivity", str);
        String message = bqnVar.getMessage();
        if (message == null) {
            message = "";
        }
        c(pgwVar, uah.e(pair, new Pair(Constants.KEY_MESSAGE, message), new Pair(Constants.KEY_EXCEPTION, "GrpcChannelNotReadyException")));
    }

    public final void e(Throwable th) {
        pgw pgwVar = pgw.YNISON_GRPC_CHANNEL_IO_ERROR;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c(pgwVar, uah.e(new Pair(Constants.KEY_MESSAGE, message), new Pair(Constants.KEY_EXCEPTION, "IOException")));
    }

    public final void f(Throwable th) {
        pgw pgwVar = pgw.YNISON_GRPC_CHANNEL_OTHER_ERROR;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c(pgwVar, uah.e(new Pair(Constants.KEY_MESSAGE, message), new Pair(Constants.KEY_EXCEPTION, th.getClass().getSimpleName())));
    }

    public final void g(tgr tgrVar, long j) {
        pgw pgwVar = pgw.YNISON_GRPC_CHANNEL_YNISON_ERROR;
        Pair pair = new Pair("code", String.valueOf(tgrVar.a.a.a));
        String message = tgrVar.getMessage();
        if (message == null) {
            message = "";
        }
        LinkedHashMap g2 = uah.g(pair, new Pair(Constants.KEY_MESSAGE, message), new Pair(Constants.KEY_EXCEPTION, "StatusException"));
        if (j > 0) {
            g2.put("ynison_error_code", String.valueOf(j));
        }
        c(pgwVar, g2);
    }
}
