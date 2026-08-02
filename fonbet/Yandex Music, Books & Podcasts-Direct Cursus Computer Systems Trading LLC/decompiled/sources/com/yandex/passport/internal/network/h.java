package com.yandex.passport.internal.network;

import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.passport.api.b2;
import com.yandex.passport.data.models.s;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.report.reporters.o0;
import defpackage.b6e;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class h implements d {
    public static final com.yandex.passport.data.network.token.i f = new com.yandex.passport.data.network.token.i(15);
    public final y a;
    public final com.yandex.passport.internal.config.g b;
    public final com.yandex.passport.internal.flags.i c;
    public final com.yandex.passport.common.resources.b d;
    public final com.yandex.passport.internal.config.template.g e;

    public h(y yVar, com.yandex.passport.internal.config.g gVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.common.resources.b bVar, com.yandex.passport.internal.config.template.g gVar2) {
        yVar.getClass();
        gVar.getClass();
        iVar.getClass();
        bVar.getClass();
        gVar2.getClass();
        this.a = yVar;
        this.b = gVar;
        this.c = iVar;
        this.d = bVar;
        this.e = gVar2;
    }

    public static void c(Uri.Builder builder, s sVar) {
        Iterator it = sVar.a.iterator();
        while (it.hasNext()) {
            builder.appendPath((String) it.next());
        }
        for (Pair pair : sVar.b) {
            builder.appendQueryParameter((String) pair.a, (String) pair.b);
        }
    }

    public static String e(String str) {
        if (!kotlin.text.c.v(str, "http", false)) {
            str = "https://".concat(str);
        }
        com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str);
        if (!com.yandex.passport.common.url.b.n(str)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    public static String f(com.yandex.passport.common.core.b bVar, Long l) {
        int ordinal;
        int ordinal2 = bVar.ordinal();
        if ((ordinal2 != 0 && ordinal2 != 2 && ordinal2 != 4) || (ordinal = com.yandex.passport.internal.ui.a.G(l).ordinal()) == 0) {
            return "ru";
        }
        if (ordinal == 1) {
            return "fi";
        }
        if (ordinal == 2) {
            return "kz";
        }
        b6e.s();
        return null;
    }

    public static String h(com.yandex.passport.common.core.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return "https://passport.yandex.%s";
        }
        if (ordinal == 1) {
            return "https://passport.yandex-team.ru";
        }
        if (ordinal == 2) {
            return "https://passport-test.yandex.%s";
        }
        if (ordinal == 3) {
            return "https://passport-test.yandex-team.ru";
        }
        if (ordinal == 4) {
            return "https://passport-rc.yandex.%s";
        }
        b6e.l(bVar, "Unknown environment ");
        return null;
    }

    public static String n(com.yandex.passport.common.core.b bVar, Long l, String str) {
        String str2;
        String f2 = f(bVar, l);
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            str2 = "https://passport.yandex.%s";
        } else if (ordinal == 2 || ordinal == 3) {
            str2 = "https://passport-test.yandex.%s";
        } else {
            if (ordinal != 4) {
                b6e.l(f, "Unknown environment ");
                return null;
            }
            str2 = "https://passport-rc.yandex.%s";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{f2}, 1)).concat(str);
    }

    public final String b(com.yandex.passport.common.core.b bVar, String str) {
        String str2;
        bVar.getClass();
        str.getClass();
        String i = i(bVar, b2.e, com.yandex.passport.internal.flags.n.e);
        if (i != null) {
            return i;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            str2 = "";
            if (ordinal != 1) {
                if (ordinal == 2) {
                    str2 = "https://yx%s.oauth-test.yandex.ru";
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        b6e.l(bVar, "Unknown environment ");
                        return null;
                    }
                    str2 = "https://yx%s.oauth-rc.yandex.ru";
                }
            }
        } else {
            str2 = "https://yx%s.oauth.yandex.ru";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
    }

    public final String d(com.yandex.passport.common.core.b bVar, Long l) {
        bVar.getClass();
        return k(bVar, b2.a, l, com.yandex.passport.internal.flags.n.a, new f(this, bVar, l, 0)).a;
    }

    public final String g(com.yandex.passport.common.core.b bVar, Long l, String str) {
        bVar.getClass();
        return k(bVar, b2.b, l, com.yandex.passport.internal.flags.n.c, new g(this, bVar, str, l)).a;
    }

    public final String i(com.yandex.passport.common.core.b bVar, b2 b2Var, com.yandex.passport.internal.flags.k kVar) {
        String a = ((p) this.a.b.a.getValue()).a(new Pair(b2Var, com.yandex.plus.core.network.api.utils.a.P(bVar)));
        if (a != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "urlOverride " + ((Object) com.yandex.passport.common.url.b.m(a)), 8);
            }
            return a;
        }
        Iterator it = ((Iterable) this.c.b(kVar)).iterator();
        while (it.hasNext()) {
            String e = e((String) it.next());
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    public final String j(com.yandex.passport.common.core.b bVar, long j, boolean z) {
        String uri = Uri.parse(g(bVar, Long.valueOf(j), null)).buildUpon().appendPath("profile").appendQueryParameter("status", z ? "ok" : "cancel").build().toString();
        uri.getClass();
        return uri;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:52:0x0097
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.passport.internal.network.e k(com.yandex.passport.common.core.b r9, com.yandex.passport.api.b2 r10, java.lang.Long r11, com.yandex.passport.internal.flags.k r12, kotlin.jvm.functions.Function0 r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.passport.internal.network.h.k(com.yandex.passport.common.core.b, com.yandex.passport.api.b2, java.lang.Long, com.yandex.passport.internal.flags.k, kotlin.jvm.functions.Function0):com.yandex.passport.internal.network.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e l(com.yandex.passport.common.core.b bVar, long j) {
        String str;
        String format;
        int ordinal;
        SharedPreferences a;
        bVar.getClass();
        String str2 = "location_webam_yandex_host_" + j;
        com.yandex.passport.internal.config.g gVar = this.b;
        gVar.getClass();
        com.yandex.passport.internal.config.d dVar = gVar.a;
        String str3 = null;
        try {
            a = dVar.a(bVar);
        } catch (Exception unused) {
        }
        if (a != null) {
            str = a.getString(str2, null);
            if (str != null) {
                String e = e(str.concat("/user-id"));
                com.yandex.passport.common.url.b bVar2 = e != null ? new com.yandex.passport.common.url.b(e) : null;
                if (bVar2 != null) {
                    str3 = bVar2.a;
                }
            }
            format = String.format("https://yandex.%s/user-id", Arrays.copyOf(new Object[]{f(bVar, Long.valueOf(j))}, 1));
            if (str3 != null) {
                format = str3;
            }
            ordinal = bVar.ordinal();
            if (ordinal != 2 || ordinal == 4) {
                format = com.yandex.passport.common.url.b.b(format, new Pair("env", "test"));
            }
            if (str3 != null) {
                return new e(format, o0.DEFAULT_URL);
            }
            SharedPreferences a2 = dVar.a(bVar);
            return new e(format, a2 != null ? a2.getBoolean("is_default_config_used", false) : false ? o0.DEFAULT_CONFIG : o0.CONFIG);
        }
        str = null;
        if (str != null) {
        }
        format = String.format("https://yandex.%s/user-id", Arrays.copyOf(new Object[]{f(bVar, Long.valueOf(j))}, 1));
        if (str3 != null) {
        }
        ordinal = bVar.ordinal();
        if (ordinal != 2) {
        }
        format = com.yandex.passport.common.url.b.b(format, new Pair("env", "test"));
        if (str3 != null) {
        }
    }

    public final String m(com.yandex.passport.common.core.b bVar, Long l) {
        bVar.getClass();
        return k(bVar, b2.c, l, com.yandex.passport.internal.flags.n.b, new f(this, bVar, l, 1)).a;
    }
}
