package com.yandex.passport.data.network;

import android.content.res.Resources;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.internal.report.ff;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import defpackage.a4g;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.f8g;
import defpackage.fb9;
import defpackage.i5f;
import defpackage.j9m;
import defpackage.jdo;
import defpackage.jyr;
import defpackage.kdk;
import defpackage.kqv;
import defpackage.l2b;
import defpackage.l3o;
import defpackage.my1;
import defpackage.nm6;
import defpackage.p7m;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.r7o;
import defpackage.ra6;
import defpackage.rzm;
import defpackage.saf;
import defpackage.t75;
import defpackage.t7o;
import defpackage.t8a;
import defpackage.v75;
import defpackage.w2f;
import defpackage.wdu;
import defpackage.weg;
import defpackage.x7j;
import defpackage.xhu;
import defpackage.xq0;
import defpackage.z75;
import defpackage.z7o;
import defpackage.zne;
import defpackage.zp5;
import defpackage.zzq;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class l implements com.yandex.passport.data.network.core.f, com.yandex.passport.data.network.core.e, com.yandex.passport.common.logger.d, com.yandex.passport.sloth.command.r, xhu, com.yandex.plus.home.feature.webviews.internal.webview.h {
    public Object a;

    public l(int i) {
        switch (i) {
            case 18:
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar = com.yandex.plus.home.feature.webviews.internal.uri.i.a;
                this.a = new LinkedList();
                break;
            default:
                this.a = new WeakHashMap();
                break;
        }
    }

    public static Object B(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u3 u3Var) {
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar;
        com.yandex.plus.home.feature.webviews.internal.uri.d dVar;
        Boolean bool;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p pVar;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar2;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p pVar2;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar3;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar4;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.l lVar;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.l lVar2;
        u3Var.getClass();
        try {
            r7o r7oVar = z7o.b;
            String str = u3Var.b;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar = u3Var.d;
            Uri parse = Uri.parse(str);
            v(parse);
            String str2 = u3Var.c;
            Boolean bool2 = null;
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.n nVar = qVar != null ? qVar.a : null;
            int i = nVar == null ? -1 : com.yandex.plus.home.feature.webviews.internal.webview.i.a[nVar.ordinal()];
            boolean z = true;
            if (i == -1) {
                iVar = null;
            } else if (i == 1) {
                iVar = com.yandex.plus.home.feature.webviews.internal.uri.i.a;
            } else {
                if (i != 2) {
                    throw new x7j();
                }
                iVar = com.yandex.plus.home.feature.webviews.internal.uri.i.b;
            }
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k kVar = (qVar == null || (lVar2 = qVar.c) == null) ? null : lVar2.a;
            int i2 = kVar == null ? -1 : com.yandex.plus.home.feature.webviews.internal.webview.i.b[kVar.ordinal()];
            if (i2 == -1) {
                dVar = null;
            } else if (i2 == 1) {
                dVar = com.yandex.plus.home.feature.webviews.internal.uri.d.a;
            } else {
                if (i2 != 2) {
                    throw new x7j();
                }
                dVar = com.yandex.plus.home.feature.webviews.internal.uri.d.b;
            }
            Integer valueOf = (qVar == null || (lVar = qVar.c) == null) ? null : Integer.valueOf(lVar.b);
            Integer num = qVar != null ? qVar.d : null;
            Boolean bool3 = qVar != null ? qVar.e : null;
            Boolean bool4 = (qVar == null || (gVar4 = qVar.b) == null) ? null : gVar4.a;
            Boolean bool5 = (qVar == null || (gVar3 = qVar.b) == null) ? null : gVar3.b;
            if (qVar == null || (gVar2 = qVar.b) == null || (pVar2 = gVar2.c) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(pVar2 == com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p.b);
            }
            if (qVar != null && (gVar = qVar.b) != null && (pVar = gVar.c) != null) {
                if (pVar != com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p.b && pVar != com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p.c) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new com.yandex.plus.home.feature.webviews.internal.uri.f(parse, iVar, dVar, valueOf, str2, num, bool3, bool4, bool5, bool, bool2, null);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    public static Object C(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3 x3Var) {
        x3Var.getClass();
        try {
            r7o r7oVar = z7o.b;
            Uri parse = Uri.parse(x3Var.b);
            v(parse);
            return new com.yandex.plus.home.feature.webviews.internal.uri.g(parse, x3Var.c, null);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    public static Object D(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c4 c4Var) {
        c4Var.getClass();
        try {
            r7o r7oVar = z7o.b;
            Uri parse = Uri.parse(c4Var.a);
            v(parse);
            return new com.yandex.plus.home.feature.webviews.internal.uri.g(parse, c4Var.d, null);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    public static void I(String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        List split$default;
        List split$default2;
        int i = 0;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"am_version"}, false, 0, 6, null);
        int i2 = 1;
        String str2 = (String) split$default.get(1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char charAt = str2.charAt(i3);
            if (charAt != '!') {
                switch (charAt) {
                    case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    case '=':
                    case '>':
                        break;
                    default:
                        sb2.append(charAt);
                        break;
                }
            }
            sb.append(charAt);
        }
        String sb3 = sb.toString();
        String sb4 = sb2.toString();
        com.yandex.passport.internal.flags.experiments.j.a.getClass();
        com.yandex.passport.internal.flags.experiments.j f = com.yandex.passport.data.network.token.i.f(sb3);
        split$default2 = StringsKt__StringsKt.split$default(sb4, new String[]{"."}, false, 0, 6, null);
        split$default2.getClass();
        Iterator it = new fb9(2, split$default2).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((jdo) it).b;
            if (!listIterator.hasPrevious()) {
                com.yandex.passport.internal.flags.experiments.m mVar = new com.yandex.passport.internal.flags.experiments.m(f, i);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    List list = (List) linkedHashMap.get(str3);
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : new ArrayList();
                    arrayList2.add(mVar);
                    linkedHashMap.put(str3, arrayList2);
                }
                return;
            }
            i += Integer.parseInt((String) listIterator.previous()) * i2;
            i2 *= 100;
        }
    }

    public static void J(String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        List split$default;
        List split$default2;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"appID"}, false, 0, 6, null);
        List g = new Regex("((?<==))").g(2, (CharSequence) split$default.get(1));
        com.yandex.passport.data.network.token.i iVar = com.yandex.passport.internal.flags.experiments.j.a;
        String str2 = (String) g.get(0);
        iVar.getClass();
        com.yandex.passport.internal.flags.experiments.j f = com.yandex.passport.data.network.token.i.f(str2);
        split$default2 = StringsKt__StringsKt.split$default((CharSequence) g.get(1), new String[]{"[", StringUtils.COMMA, StringUtil.SPACE, "]"}, false, 0, 6, null);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : split$default2) {
            if (!StringsKt.U((String) obj)) {
                arrayList2.add(obj);
            }
        }
        com.yandex.passport.internal.flags.experiments.l lVar = new com.yandex.passport.internal.flags.experiments.l(f, arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            List list = (List) linkedHashMap.get(str3);
            ArrayList arrayList3 = list != null ? new ArrayList(list) : new ArrayList();
            arrayList3.add(lVar);
            linkedHashMap.put(str3, arrayList3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object M(l lVar, Uri uri, cg6 cg6Var) {
        com.yandex.plus.core.network.uri.c cVar;
        int i;
        Uri.Builder builder;
        if (cg6Var instanceof com.yandex.plus.core.network.uri.c) {
            cVar = (com.yandex.plus.core.network.uri.c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                Object obj2 = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Uri.Builder buildUpon = uri.buildUpon();
                    buildUpon.getClass();
                    cVar.j = buildUpon;
                    cVar.m = 1;
                    if (lVar.L(buildUpon, cVar) == obj2) {
                        return obj2;
                    }
                    builder = buildUpon;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder = cVar.j;
                    qgg.h0(obj);
                }
                builder.getClass();
                return builder;
            }
        }
        cVar = new com.yandex.plus.core.network.uri.c(lVar, cg6Var);
        Object obj3 = cVar.k;
        Object obj22 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        builder.getClass();
        return builder;
    }

    public static com.yandex.passport.api.v0 O(com.yandex.passport.common.logger.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.passport.api.v0.VERBOSE;
        }
        if (ordinal == 1) {
            return com.yandex.passport.api.v0.DEBUG;
        }
        if (ordinal == 2) {
            return com.yandex.passport.api.v0.INFO;
        }
        if (ordinal == 3) {
            return com.yandex.passport.api.v0.WARN;
        }
        if (ordinal == 4) {
            return com.yandex.passport.api.v0.ERROR;
        }
        if (ordinal == 5) {
            return com.yandex.passport.api.v0.ASSERT;
        }
        b6e.s();
        return null;
    }

    public static ArrayList Q(List list) {
        List<com.yandex.plus.home.repository.api.model.panel.f0> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (com.yandex.plus.home.repository.api.model.panel.f0 f0Var : list2) {
            arrayList.add(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.e(f0Var.a, f0Var.b, f0Var.c));
        }
        return arrayList;
    }

    public static boolean t(String str, String str2) {
        if (str.length() >= str2.length()) {
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void v(Uri uri) {
        if (kotlin.text.c.o(uri.getScheme(), "http", true) || kotlin.text.c.o(uri.getScheme(), "https", true)) {
            return;
        }
        throw new IllegalStateException((uri + " is not weblink!").toString());
    }

    public static String w(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, -1);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(time);
        return new Regex("expires=[^;]*").replace(str, "expires=" + format);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable A(com.yandex.plus.home.repository.api.model.webconfig.x xVar, List list, String str, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.n nVar;
        int i;
        com.yandex.plus.pay.adapter.api.i iVar;
        jyr jyrVar;
        String id;
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.n) {
            nVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.n) cg6Var;
            int i2 = nVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nVar.k;
                nm6 nm6Var = nm6.a;
                i = nVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = xVar.ordinal();
                    if (ordinal == 0) {
                        iVar = com.yandex.plus.pay.adapter.api.i.b;
                    } else {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                throw new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.a(xVar);
                            }
                            b6e.s();
                            return null;
                        }
                        iVar = com.yandex.plus.pay.adapter.api.i.a;
                    }
                    com.yandex.plus.pay.adapter.api.g0 g0Var = (com.yandex.plus.pay.adapter.api.g0) this.a;
                    com.yandex.passport.internal.ui.bouncer.roundabout.k kVar = new com.yandex.passport.internal.ui.bouncer.roundabout.k(this, iVar);
                    nVar.j = iVar;
                    nVar.m = 1;
                    obj = ((com.yandex.plus.pay.adapter.internal.c1) g0Var).c(str, list, kVar, nVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iVar = nVar.j;
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.adapter.internal.o oVar = (com.yandex.plus.pay.adapter.internal.o) ((com.yandex.plus.pay.adapter.api.k) obj);
                jyrVar = oVar.b;
                jyr jyrVar2 = oVar.b;
                if (((List) jyrVar.getValue()).isEmpty()) {
                    List list2 = (List) jyrVar2.getValue();
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.m((com.yandex.plus.pay.adapter.api.j) it.next()));
                    }
                    return arrayList;
                }
                String name = iVar.name();
                List list3 = (List) jyrVar2.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    com.yandex.plus.pay.adapter.internal.i iVar2 = (com.yandex.plus.pay.adapter.internal.i) ((com.yandex.plus.pay.adapter.api.j) it2.next());
                    List d = iVar2.d();
                    ArrayList arrayList3 = new ArrayList(v75.o(d, 10));
                    Iterator it3 = d.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((com.yandex.plus.pay.adapter.internal.y0) ((com.yandex.plus.pay.adapter.api.e) it3.next())).a.getId());
                    }
                    com.yandex.plus.pay.adapter.api.h e = iVar2.e();
                    List c = (e == null || (id = ((com.yandex.plus.pay.adapter.internal.h1) e).a.getId()) == null) ? null : t75.c(id);
                    if (c == null) {
                        c = c5b.a;
                    }
                    z75.t(arrayList2, CollectionsKt.g0(arrayList3, c));
                }
                throw new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.b(name, arrayList2);
            }
        }
        nVar = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.n(this, cg6Var);
        Object obj2 = nVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nVar.m;
        if (i != 0) {
        }
        com.yandex.plus.pay.adapter.internal.o oVar2 = (com.yandex.plus.pay.adapter.internal.o) ((com.yandex.plus.pay.adapter.api.k) obj2);
        jyrVar = oVar2.b;
        jyr jyrVar22 = oVar2.b;
        if (((List) jyrVar.getValue()).isEmpty()) {
        }
    }

    public Object E(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4 l4Var) {
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p pVar;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar2;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p pVar2;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar3;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g gVar4;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.n nVar;
        l4Var.getClass();
        com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.a;
        Uri uri = l4Var.b;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar = l4Var.f;
        Object r = sVar.r(uri);
        if (r instanceof t7o) {
            return r;
        }
        r7o r7oVar = z7o.b;
        com.yandex.plus.home.feature.webviews.internal.uri.j jVar = (com.yandex.plus.home.feature.webviews.internal.uri.j) r;
        if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.e) {
            Uri uri2 = l4Var.b;
            boolean z = l4Var.d == com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i4.b;
            if (qVar == null || (nVar = qVar.a) == null) {
                iVar = ((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar).c;
            } else {
                int ordinal = nVar.ordinal();
                if (ordinal == 0) {
                    iVar = com.yandex.plus.home.feature.webviews.internal.uri.i.a;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    iVar = com.yandex.plus.home.feature.webviews.internal.uri.i.b;
                }
            }
            if (qVar == null || (gVar4 = qVar.b) == null || (bool = gVar4.a) == null) {
                bool = ((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar).d;
            }
            if (qVar == null || (gVar3 = qVar.b) == null || (bool2 = gVar3.b) == null) {
                bool2 = ((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar).e;
            }
            if (qVar == null || (gVar2 = qVar.b) == null || (pVar2 = gVar2.c) == null) {
                bool3 = ((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar).f;
            } else {
                bool3 = Boolean.valueOf(pVar2 == com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p.b);
            }
            if (qVar == null || (gVar = qVar.b) == null || (pVar = gVar.c) == null) {
                bool4 = ((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar).g;
            } else {
                bool4 = Boolean.valueOf(pVar == com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p.b || pVar == com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.p.c);
            }
            jVar = new com.yandex.plus.home.feature.webviews.internal.uri.e(uri2, z, iVar, bool, bool2, bool3, bool4, l4Var.e);
        }
        int ordinal2 = l4Var.c.ordinal();
        if (ordinal2 == 0) {
            return new com.yandex.plus.home.feature.webviews.internal.uri.h(sVar.A(jVar));
        }
        if (ordinal2 == 1) {
            return jVar;
        }
        b6e.s();
        return null;
    }

    public com.yandex.plus.core.data.common.v F(com.yandex.plus.core.graphql.fragment.hb hbVar, com.yandex.plus.core.graphql.fragment.b6 b6Var) {
        com.yandex.plus.core.graphql.fragment.a6 a6Var;
        com.yandex.plus.core.graphql.fragment.gb gbVar;
        return ((com.yandex.plus.core.graphql.utils.b) this.a).b((hbVar == null || (gbVar = hbVar.c) == null) ? null : gbVar.b, hbVar != null ? hbVar.b : null, (b6Var == null || (a6Var = b6Var.c) == null) ? null : a6Var.b, b6Var != null ? b6Var.b : null);
    }

    public void G(boolean z) {
        ((com.yandex.passport.internal.ui.domik.phone_number.b) this.a).G(z);
    }

    public void H(String str, String str2) {
        com.yandex.plus.home.feature.webviews.internal.simple.j jVar = ((com.yandex.plus.home.feature.webviews.internal.simple.e) this.a).a;
        jVar.getClass();
        jVar.k0(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.r
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(com.yandex.passport.sloth.command.data.c cVar, cg6 cg6Var) {
        com.yandex.passport.sloth.command.performers.e eVar;
        int i;
        if (cg6Var instanceof com.yandex.passport.sloth.command.performers.e) {
            eVar = (com.yandex.passport.sloth.command.performers.e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eVar.j;
                nm6 nm6Var = nm6.a;
                i = eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.v vVar = (com.yandex.passport.sloth.v) this.a;
                    com.yandex.passport.sloth.y yVar = new com.yandex.passport.sloth.y(cVar.a);
                    eVar.l = 1;
                    if (vVar.c(yVar, eVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(com.yandex.passport.sloth.command.v.c);
            }
        }
        eVar = new com.yandex.passport.sloth.command.performers.e(this, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(Uri.Builder builder, cg6 cg6Var) {
        com.yandex.plus.core.network.uri.a aVar;
        int i;
        com.yandex.plus.core.network.endpoint.a aVar2;
        if (cg6Var instanceof com.yandex.plus.core.network.uri.a) {
            aVar = (com.yandex.plus.core.network.uri.a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                nm6 nm6Var = nm6.a;
                i = aVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.network.utils.a aVar3 = (com.yandex.plus.core.network.utils.a) this.a;
                    aVar.j = builder;
                    aVar.m = 1;
                    Uri url = aVar3.a.getUrl();
                    url.getClass();
                    String scheme = url.getScheme();
                    String host = url.getHost();
                    obj = (scheme == null || host == null) ? null : new com.yandex.plus.core.network.endpoint.a(scheme, host);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder = aVar.j;
                    qgg.h0(obj);
                }
                aVar2 = (com.yandex.plus.core.network.endpoint.a) obj;
                if (aVar2 != null) {
                    throw new my1();
                }
                builder.scheme(aVar2.a).authority(aVar2.b);
                return Unit.a;
            }
        }
        aVar = new com.yandex.plus.core.network.uri.a(this, cg6Var);
        Object obj2 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        if (i != 0) {
        }
        aVar2 = (com.yandex.plus.core.network.endpoint.a) obj2;
        if (aVar2 != null) {
        }
    }

    public com.yandex.plus.home.feature.webviews.internalapi.insets.a N(zne zneVar, com.yandex.plus.home.feature.webviews.internal.uri.i iVar, boolean z) {
        float f;
        zneVar.getClass();
        androidx.fragment.app.t tVar = (androidx.fragment.app.t) this.a;
        int i = zneVar.a;
        Resources resources = tVar.getResources();
        resources.getClass();
        int k = com.yandex.plus.home.common.utils.a.k(resources, i);
        int ordinal = iVar.ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            if (!z) {
                Integer valueOf = Integer.valueOf(zneVar.b);
                Resources resources2 = tVar.getResources();
                resources2.getClass();
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                displayMetrics.getClass();
                float floatValue = valueOf.floatValue();
                if (Build.VERSION.SDK_INT >= 34) {
                    f = defpackage.sb.c(1, floatValue, displayMetrics);
                } else {
                    float f2 = displayMetrics.density;
                    f = f2 == 0.0f ? 0.0f : floatValue / f2;
                }
                i2 = Float.valueOf(f).intValue();
            }
        }
        int i3 = zneVar.c;
        Resources resources3 = tVar.getResources();
        resources3.getClass();
        int k2 = com.yandex.plus.home.common.utils.a.k(resources3, i3);
        int i4 = zneVar.d;
        Resources resources4 = tVar.getResources();
        resources4.getClass();
        return new com.yandex.plus.home.feature.webviews.internalapi.insets.a(k, i2, k2, com.yandex.plus.home.common.utils.a.k(resources4, i4));
    }

    public ArrayList P(List list) {
        List<com.yandex.plus.home.repository.api.model.panel.e0> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (com.yandex.plus.home.repository.api.model.panel.e0 e0Var : list2) {
            com.yandex.plus.core.data.common.v vVar = e0Var.c;
            Integer num = null;
            com.yandex.plus.core.theme.c e = vVar != null ? ((com.yandex.plus.home.feature.panel.internal.a) this.a).e(vVar) : null;
            com.yandex.plus.core.theme.a aVar = e instanceof com.yandex.plus.core.theme.a ? (com.yandex.plus.core.theme.a) e : null;
            String str = e0Var.a;
            String str2 = e0Var.b;
            if (aVar != null) {
                num = Integer.valueOf(aVar.a);
            }
            arrayList.add(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.f(str, str2, num, e0Var.d, e0Var.e));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.j0(r1) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (defpackage.x97.V(r10, r0, r1) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object R(View view, float f, cg6 cg6Var) {
        com.yandex.plus.home.dailyquests.feature.internal.utils.c cVar;
        int i;
        WeakHashMap weakHashMap = (WeakHashMap) this.a;
        if (cg6Var instanceof com.yandex.plus.home.dailyquests.feature.internal.utils.c) {
            cVar = (com.yandex.plus.home.dailyquests.feature.internal.utils.c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    WeakHashMap weakHashMap2 = wdu.a;
                    if (view.isAttachedToWindow() && com.yandex.plus.bdui.flex.ui.a.q(view) >= f) {
                        return Unit.a;
                    }
                    r2f r2fVar = (r2f) weakHashMap.get(view);
                    if (r2fVar != null) {
                        cVar.j = view;
                        cVar.m = 1;
                    } else {
                        w2f p = saf.p();
                        weakHashMap.put(view, p);
                        p.R(new com.yandex.plus.bdui.templating.render.a(5, this, view));
                        zp5 zp5Var = new zp5(this, view, f, null);
                        cVar.j = null;
                        cVar.m = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        cVar = new com.yandex.plus.home.dailyquests.feature.internal.utils.c(this, cg6Var);
        Object obj2 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        return Unit.a;
    }

    @Override // com.yandex.passport.data.network.core.f
    public Object a(Object obj, com.yandex.passport.common.network.i iVar) {
        Throwable lVar;
        e eVar = (e) obj;
        com.yandex.passport.internal.report.reporters.h hVar = (com.yandex.passport.internal.report.reporters.h) this.a;
        eVar.getClass();
        String str = eVar.b;
        iVar.getClass();
        if (iVar instanceof com.yandex.passport.common.network.h) {
            j jVar = (j) ((com.yandex.passport.common.network.h) iVar).a;
            String str2 = jVar.b;
            if (str2 == null || str2.length() <= 0 || str2.equals("-")) {
                str2 = null;
            }
            com.yandex.passport.common.account.a aVar = new com.yandex.passport.common.account.a(str2);
            String str3 = jVar.c;
            com.yandex.passport.data.models.c cVar = new com.yandex.passport.data.models.c(aVar, jVar.d, str3 != null ? new com.yandex.passport.data.models.e(str3, eVar.e) : null);
            hVar.getClass();
            str.getClass();
            hVar.n(com.yandex.passport.internal.report.i1.d, new ff(str, 14));
            return cVar;
        }
        if (!(iVar instanceof com.yandex.passport.common.network.f)) {
            b6e.s();
            return null;
        }
        d dVar = (d) ((com.yandex.passport.common.network.f) iVar).a;
        List list = dVar.a;
        String str4 = dVar.c;
        if (list.contains(BackendError.CAPTCHA_REQUIRED) && str4 != null) {
            lVar = new com.yandex.passport.data.exceptions.b(str4, str);
        } else {
            if (!Intrinsics.d(dVar.b, "rfc_totp")) {
                if (list.contains(BackendError.RFC_OTD_INVALID) || list.contains(BackendError.OTD_EMPTY)) {
                    throw new com.yandex.passport.data.exceptions.i(((BackendError) CollectionsKt.Q(list)).name(), str);
                }
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    com.yandex.plus.core.locale.b.v((BackendError) it.next());
                    throw null;
                }
                b6e.l(list, "Internal error: Can't throw exception for error list ");
                return null;
            }
            lVar = new com.yandex.passport.data.exceptions.l(((BackendError) CollectionsKt.Q(list)).name(), str);
        }
        String valueOf = String.valueOf(lVar.getMessage());
        hVar.getClass();
        str.getClass();
        hVar.n(com.yandex.passport.internal.report.g1.d, new com.yandex.passport.internal.report.a(valueOf, 28), new ff(str, 14));
        throw lVar;
    }

    @Override // com.yandex.passport.common.logger.d
    public void b(com.yandex.passport.common.logger.b bVar, String str, String str2, Throwable th) {
        str2.getClass();
        th.getClass();
        ((com.yandex.passport.api.q) this.a).g(O(bVar), str, str2, th);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void c() {
        ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a.i0();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void d(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3 o3Var) {
        o3Var.getClass();
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a;
        eVar.getClass();
        eVar.K.d(o3Var, new com.yandex.plus.home.datasource.openapi.models.u6(15), new com.yandex.plus.bdui.plus.webview.navigation.a(26));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void e(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2 x2Var) {
        com.yandex.plus.home.feature.webviews.internal.smart.contract.c webViewController;
        x2Var.getClass();
        com.yandex.plus.home.feature.webviews.internal.smart.i iVar = (com.yandex.plus.home.feature.webviews.internal.smart.i) this.a;
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = iVar.a;
        webViewController = iVar.getWebViewController();
        com.yandex.plus.home.feature.webviews.internal.simple.d dVar = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, webViewController, com.yandex.plus.home.feature.webviews.internal.smart.contract.c.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 5);
        eVar.getClass();
        eVar.K.f(x2Var, dVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void f(String str) {
        str.getClass();
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a;
        eVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.container.d dVar = eVar.o;
        dVar.getClass();
        dVar.a.a(new com.yandex.plus.home.api.state.b(str));
    }

    @Override // com.yandex.passport.data.network.core.e
    public com.yandex.passport.common.network.i g(l3o l3oVar) {
        l3oVar.getClass();
        String q = com.yandex.plus.pay.ui.core.b.q(l3oVar);
        i5f i5fVar = com.yandex.passport.data.network.core.q.a;
        i5fVar.getClass();
        return com.yandex.plus.core.network.api.utils.a.x((com.yandex.passport.common.network.i) i5fVar.b(com.yandex.passport.common.network.i.Companion.serializer(da.Companion.serializer(), com.yandex.passport.common.network.u.Companion.serializer()), q), new zzq(25, q, l3oVar, this));
    }

    @Override // defpackage.xhu
    public kqv h(View view, kqv kqvVar, weg wegVar) {
        ModalViewBehavior modalViewBehavior = (ModalViewBehavior) this.a;
        modalViewBehavior.gestureInsetBottom = kqvVar.a.i().d;
        modalViewBehavior.updatePeekHeight(false);
        return kqvVar;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void i(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a;
        eVar.z.b(eVar.A, bVar);
    }

    @Override // com.yandex.passport.common.logger.d
    public boolean isEnabled() {
        return true;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void j(String str, String str2, boolean z) {
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a;
        eVar.getClass();
        eVar.h0(str, str2);
    }

    @Override // com.yandex.passport.common.logger.d
    public void k(com.yandex.passport.common.logger.b bVar, String str, String str2) {
        str2.getClass();
        ((com.yandex.passport.api.q) this.a).f(O(bVar), str, str2);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void l(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a;
        eVar.z.c(eVar.A, bVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void m() {
        com.yandex.plus.home.feature.webviews.internal.smart.e eVar = ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).a;
        eVar.h.q(eVar.K.g);
        ((com.yandex.plus.home.feature.webviews.internal.smart.j) eVar.e).q();
        eVar.z.a(eVar.A);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void o() {
        ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void p(String str) {
        ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).h(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void q(int i) {
        ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).f(i);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void r(String str) {
        ((com.yandex.plus.home.feature.webviews.internal.smart.i) this.a).c(str);
    }

    public com.yandex.plus.home.plaque.feature.internal.presentation.b s() {
        a4g.q(com.yandex.passport.sloth.ui.dependencies.m.class, (com.yandex.passport.sloth.ui.dependencies.m) this.a);
        com.yandex.passport.sloth.ui.dependencies.m mVar = (com.yandex.passport.sloth.ui.dependencies.m) this.a;
        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
        com.yandex.passport.sloth.ui.dependencies.n nVar = new com.yandex.passport.sloth.ui.dependencies.n(mVar, 0);
        bVar.a = nVar;
        com.yandex.passport.sloth.ui.dependencies.n nVar2 = new com.yandex.passport.sloth.ui.dependencies.n(mVar, 7);
        bVar.b = nVar2;
        bVar.c = t8a.b(new com.yandex.passport.internal.badges.f((rzm) nVar, (rzm) nVar2, (rzm) new com.yandex.passport.sloth.ui.dependencies.n(mVar, 4), 11));
        rzm b = t8a.b(com.yandex.passport.sloth.ui.c1.a);
        bVar.d = b;
        bVar.e = t8a.b(new com.yandex.passport.internal.ui.common.c((rzm) bVar.c, (com.yandex.passport.sloth.ui.dependencies.n) bVar.b, b, 21));
        rzm b2 = t8a.b(new com.yandex.passport.internal.di.module.k(new com.yandex.passport.sloth.ui.dependencies.n(mVar, 9), (rzm) bVar.d, 22));
        com.yandex.passport.sloth.ui.dependencies.n nVar3 = new com.yandex.passport.sloth.ui.dependencies.n(mVar, 2);
        rzm rzmVar = (rzm) bVar.e;
        rzm rzmVar2 = (rzm) bVar.d;
        bVar.f = t8a.b(new kdk((com.yandex.passport.sloth.ui.dependencies.n) bVar.a, rzmVar, (com.yandex.passport.sloth.ui.dependencies.n) bVar.b, b2, nVar3, new com.yandex.passport.internal.ui.common.c(rzmVar, b2, rzmVar2, 22), rzmVar2, new com.yandex.passport.sloth.ui.dependencies.n(mVar, 3), new com.yandex.passport.sloth.ui.dependencies.n(mVar, 1), new com.yandex.passport.sloth.ui.dependencies.n(mVar, 6), new com.yandex.passport.sloth.ui.dependencies.n(mVar, 8), new com.yandex.passport.sloth.ui.dependencies.n(mVar, 5), 2));
        return bVar;
    }

    public String u(String str) {
        return ((com.yandex.plus.home.internal.di.k) this.a).a.c() + str + "/islands-150";
    }

    public Serializable x(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u uVar) {
        j9m j9mVar = (j9m) this.a;
        try {
            r7o r7oVar = z7o.b;
            String str = null;
            if (uVar.equals(com.yandex.plus.home.api.network.b.a)) {
                j9mVar.getClass();
                jyr jyrVar = p7m.e;
                String f = f8g.E().a().f("graphql_host");
                ra6 ra6Var = f != null ? new ra6(f, 4) : null;
                if (ra6Var != null) {
                    str = ra6Var.b;
                }
            } else if (uVar.equals(com.yandex.plus.home.api.network.d.a)) {
                jyr jyrVar2 = p7m.e;
                String f2 = f8g.E().a().f("home_rest_gw_host");
                ra6 ra6Var2 = f2 != null ? new ra6(f2, 4) : null;
                if (ra6Var2 != null) {
                    str = ra6Var2.b;
                }
            } else if (uVar.equals(com.yandex.plus.home.api.network.a.a)) {
                j9mVar.getClass();
                jyr jyrVar3 = p7m.e;
                String f3 = f8g.E().a().f("avatar_host");
                ra6 ra6Var3 = f3 != null ? new ra6(f3, 4) : null;
                if (ra6Var3 != null) {
                    str = ra6Var3.b;
                }
            } else if (uVar.equals(com.yandex.plus.home.api.network.c.a)) {
                jyr jyrVar4 = p7m.e;
                String f4 = f8g.E().a().f("web_host");
                ra6 ra6Var4 = f4 != null ? new ra6(f4, 4) : null;
                if (ra6Var4 != null) {
                    str = ra6Var4.b;
                }
            } else {
                if (!uVar.equals(com.yandex.plus.home.api.network.e.a)) {
                    throw new x7j();
                }
                jyr jyrVar5 = p7m.e;
                String f5 = f8g.E().a().f("web_host");
                ra6 ra6Var5 = f5 != null ? new ra6(f5, 4) : null;
                if (ra6Var5 != null) {
                    str = ra6Var5.b;
                }
            }
            if (str != null) {
                return str;
            }
            throw new IllegalArgumentException(("Host by key=" + uVar + " is absent!").toString());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    public com.yandex.plus.home.feature.webviews.internal.uri.i y(com.yandex.plus.home.feature.webviews.internal.uri.i iVar) {
        LinkedList linkedList = (LinkedList) this.a;
        if (iVar == null && (iVar = (com.yandex.plus.home.feature.webviews.internal.uri.i) CollectionsKt.Z(linkedList)) == null) {
            iVar = com.yandex.plus.home.feature.webviews.internal.uri.i.a;
        }
        linkedList.add(iVar);
        return iVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(1:21)(2:18|19)))|36|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0032, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(String str, String str2, String str3, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internal.purchase.subscription.c cVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internal.purchase.subscription.c) {
            cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.c) cg6Var;
            int i2 = cVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.o = i2 - Integer.MIN_VALUE;
                obj = cVar.m;
                nm6 nm6Var = nm6.a;
                i = cVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.home.graphql.subscription.d dVar = (com.yandex.plus.home.graphql.subscription.d) this.a;
                    cVar.j = str;
                    cVar.k = str2;
                    cVar.l = str3;
                    cVar.o = 1;
                    obj = dVar.b(str, str2, str3, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = cVar.l;
                    str2 = cVar.k;
                    str = cVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.e;
                    String i3 = dfi.i(f1d.m("getStoriesConfig(", str, ", ", str2, ", "), str3, ')');
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, i3, a);
                }
                if (obj instanceof t7o) {
                    return obj;
                }
                return null;
            }
        }
        cVar = new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.c(this, cg6Var);
        obj = cVar.m;
        nm6 nm6Var2 = nm6.a;
        i = cVar.o;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (obj instanceof t7o) {
        }
    }

    public l(com.yandex.plus.bdui.flex.ui.s sVar) {
        sVar.getClass();
        this.a = sVar;
    }

    public /* synthetic */ l(Object obj) {
        this.a = obj;
    }
}
