package com.yandex.passport.internal.core.accounts;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.c2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.fragment.ap;
import com.yandex.plus.core.graphql.fragment.b6;
import com.yandex.plus.core.graphql.fragment.eb;
import com.yandex.plus.core.graphql.fragment.eo;
import com.yandex.plus.core.graphql.fragment.fo;
import com.yandex.plus.core.graphql.fragment.hb;
import com.yandex.plus.core.graphql.fragment.y5;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.datasource.openapi.models.a0;
import com.yandex.plus.home.datasource.openapi.models.a2;
import com.yandex.plus.home.datasource.openapi.models.c4;
import com.yandex.plus.home.datasource.openapi.models.c5;
import com.yandex.plus.home.datasource.openapi.models.c8;
import com.yandex.plus.home.datasource.openapi.models.d0;
import com.yandex.plus.home.datasource.openapi.models.d1;
import com.yandex.plus.home.datasource.openapi.models.d2;
import com.yandex.plus.home.datasource.openapi.models.d6;
import com.yandex.plus.home.datasource.openapi.models.d7;
import com.yandex.plus.home.datasource.openapi.models.e3;
import com.yandex.plus.home.datasource.openapi.models.e8;
import com.yandex.plus.home.datasource.openapi.models.g1;
import com.yandex.plus.home.datasource.openapi.models.g4;
import com.yandex.plus.home.datasource.openapi.models.g7;
import com.yandex.plus.home.datasource.openapi.models.h3;
import com.yandex.plus.home.datasource.openapi.models.h6;
import com.yandex.plus.home.datasource.openapi.models.h8;
import com.yandex.plus.home.datasource.openapi.models.i1;
import com.yandex.plus.home.datasource.openapi.models.j4;
import com.yandex.plus.home.datasource.openapi.models.j6;
import com.yandex.plus.home.datasource.openapi.models.j7;
import com.yandex.plus.home.datasource.openapi.models.k3;
import com.yandex.plus.home.datasource.openapi.models.m1;
import com.yandex.plus.home.datasource.openapi.models.m7;
import com.yandex.plus.home.datasource.openapi.models.n3;
import com.yandex.plus.home.datasource.openapi.models.o0;
import com.yandex.plus.home.datasource.openapi.models.p1;
import com.yandex.plus.home.datasource.openapi.models.q3;
import com.yandex.plus.home.datasource.openapi.models.q6;
import com.yandex.plus.home.datasource.openapi.models.q7;
import com.yandex.plus.home.datasource.openapi.models.r0;
import com.yandex.plus.home.datasource.openapi.models.s1;
import com.yandex.plus.home.datasource.openapi.models.s2;
import com.yandex.plus.home.datasource.openapi.models.t3;
import com.yandex.plus.home.datasource.openapi.models.t7;
import com.yandex.plus.home.datasource.openapi.models.u0;
import com.yandex.plus.home.datasource.openapi.models.v1;
import com.yandex.plus.home.datasource.openapi.models.v2;
import com.yandex.plus.home.datasource.openapi.models.v7;
import com.yandex.plus.home.datasource.openapi.models.w0;
import com.yandex.plus.home.datasource.openapi.models.w1;
import com.yandex.plus.home.datasource.openapi.models.w3;
import com.yandex.plus.home.datasource.openapi.models.x1;
import com.yandex.plus.home.datasource.openapi.models.y2;
import com.yandex.plus.home.datasource.openapi.models.z3;
import com.yandex.plus.home.datasource.openapi.models.z4;
import com.yandex.plus.home.datasource.openapi.models.z7;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r6;
import com.yandex.plus.home.repository.api.model.panel.e0;
import com.yandex.plus.home.repository.api.model.panel.f0;
import com.yandex.plus.plaquesdk.plaque.api.models.b0;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.h0;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import com.yandex.plus.plaquesdk.plaque.api.models.z;
import defpackage.an5;
import defpackage.aur;
import defpackage.b0o;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c5b;
import defpackage.c7;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.d0o;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.ern;
import defpackage.gdk;
import defpackage.hrg;
import defpackage.i6s;
import defpackage.irn;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.kah;
import defpackage.l1j;
import defpackage.l3o;
import defpackage.lah;
import defpackage.mkn;
import defpackage.mm6;
import defpackage.msa;
import defpackage.mu7;
import defpackage.n20;
import defpackage.nah;
import defpackage.nm6;
import defpackage.nrn;
import defpackage.nsa;
import defpackage.nyf;
import defpackage.o3o;
import defpackage.oah;
import defpackage.ouj;
import defpackage.q5b;
import defpackage.q5g;
import defpackage.qgg;
import defpackage.quj;
import defpackage.qwp;
import defpackage.r7o;
import defpackage.s7e;
import defpackage.s9f;
import defpackage.sjn;
import defpackage.ssa;
import defpackage.su4;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tf6;
import defpackage.twh;
import defpackage.u75;
import defpackage.u7e;
import defpackage.uah;
import defpackage.v75;
import defpackage.wb8;
import defpackage.wis;
import defpackage.wop;
import defpackage.x3f;
import defpackage.x7j;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xye;
import defpackage.ybl;
import defpackage.yd5;
import defpackage.z7o;
import defpackage.zfv;
import defpackage.zvd;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class h implements g, sjn, zfv, i6s, com.yandex.plus.core.debug.panel.api.a, com.yandex.plus.webview.api.javascript.b {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public h(com.yandex.plus.home.internal.di.u uVar) {
        this.a = 17;
        this.b = uVar;
        int i = 23;
        btf.b(new com.yandex.plus.bdui.content.b(i, this, "sdk-config.rest"));
        this.c = btf.b(new com.yandex.plus.bdui.content.b(i, this, "sdk-config.graphql"));
        btf.b(new com.yandex.plus.bdui.content.b(i, this, "experiments.rest"));
        this.d = btf.b(new com.yandex.plus.bdui.content.b(i, this, "experiments.graphql"));
        this.e = quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(4));
    }

    public static List E(hb hbVar) {
        eb ebVar;
        ArrayList arrayList = null;
        if (hbVar != null && (ebVar = hbVar.g) != null) {
            ArrayList arrayList2 = ebVar.b.a;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ap apVar = ((com.yandex.plus.core.graphql.fragment.m) it.next()).c.b;
                f0 f0Var = apVar != null ? new f0(apVar.a, apVar.b, apVar.c) : null;
                if (f0Var != null) {
                    arrayList3.add(f0Var);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? c5b.a : arrayList;
    }

    public static String G(h hVar, String str, Map map) {
        Set keySet = map.keySet();
        irn irnVar = Regex.b;
        String X = CollectionsKt.X(keySet, "|", null, null, new com.yandex.plus.home.feature.webviews.internal.webview.a(1, irnVar, irn.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 24), 30);
        q5b q5bVar = q5b.a;
        q5bVar.getClass();
        Iterator<E> it = q5bVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((nrn) it.next()).a;
        }
        irnVar.getClass();
        if ((i & 2) != 0) {
            i |= 64;
        }
        Pattern compile = Pattern.compile(X, i);
        compile.getClass();
        return new Regex(compile).f(str, new com.yandex.plus.bdui.templating.render.b(2, map));
    }

    public static String H(com.yandex.plus.home.plaque.repository.rest.a aVar) {
        return aVar.a + '|' + aVar.b + '|' + aVar.c;
    }

    public static com.yandex.plus.plaquesdk.plaque.api.models.display.g I(com.yandex.plus.home.datasource.openapi.models.p pVar) {
        if (pVar instanceof j4) {
            j4 j4Var = (j4) pVar;
            List<e3> list = j4Var.b;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            for (e3 e3Var : list) {
                Integer y = r1.y(e3Var.a);
                double d = e3Var.b;
                arrayList.add(y != null ? new com.yandex.plus.plaquesdk.plaque.api.models.display.n(y.intValue(), (float) d) : new com.yandex.plus.plaquesdk.plaque.api.models.display.n(0, (float) d));
            }
            h3 h3Var = j4Var.c;
            PointF pointF = new PointF((float) h3Var.a, (float) h3Var.b);
            h3 h3Var2 = j4Var.d;
            return new com.yandex.plus.plaquesdk.plaque.api.models.display.e(arrayList, pointF, new PointF((float) h3Var2.a, (float) h3Var2.b));
        }
        if (!(pVar instanceof q6)) {
            if (pVar instanceof c8) {
                return com.yandex.plus.plaquesdk.plaque.api.models.display.i.a;
            }
            b6e.s();
            return null;
        }
        q6 q6Var = (q6) pVar;
        List<e3> list2 = q6Var.b;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        for (e3 e3Var2 : list2) {
            Integer y2 = r1.y(e3Var2.a);
            double d2 = e3Var2.b;
            arrayList2.add(y2 != null ? new com.yandex.plus.plaquesdk.plaque.api.models.display.n(y2.intValue(), (float) d2) : new com.yandex.plus.plaquesdk.plaque.api.models.display.n(0, (float) d2));
        }
        h3 h3Var3 = q6Var.c;
        return new com.yandex.plus.plaquesdk.plaque.api.models.display.f(arrayList2, new PointF((float) h3Var3.a, (float) h3Var3.b));
    }

    public static com.yandex.plus.home.plaque.repository.api.model.r J(j6 j6Var) {
        if (j6Var instanceof w3) {
            return new com.yandex.plus.home.plaque.repository.api.model.o(Long.valueOf(((w3) j6Var).b));
        }
        if (j6Var instanceof a2) {
            return new com.yandex.plus.home.plaque.repository.api.model.o(Double.valueOf(((a2) j6Var).b));
        }
        if (j6Var instanceof m7) {
            return new com.yandex.plus.home.plaque.repository.api.model.p(((m7) j6Var).b);
        }
        if (j6Var instanceof a0) {
            return new com.yandex.plus.home.plaque.repository.api.model.n(((a0) j6Var).b);
        }
        b6e.s();
        return null;
    }

    public static c0 L(com.yandex.plus.home.datasource.openapi.models.g gVar) {
        if (gVar instanceof p1) {
            p1 p1Var = (p1) gVar;
            return new com.yandex.plus.plaquesdk.plaque.api.models.y(p1Var.a, p1Var.c);
        }
        if (gVar instanceof c4) {
            return new z(((c4) gVar).a);
        }
        if (!(gVar instanceof d7)) {
            b6e.s();
            return null;
        }
        d7 d7Var = (d7) gVar;
        String str = d7Var.a;
        String str2 = d7Var.b;
        Map map = d7Var.d;
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        return new com.yandex.plus.plaquesdk.plaque.api.models.a0(str, str2, map);
    }

    public static com.yandex.plus.plaquesdk.plaque.api.models.display.m M(i1 i1Var) {
        if (i1Var instanceof d1) {
            return new com.yandex.plus.plaquesdk.plaque.api.models.display.k(new com.yandex.plus.core.android.extensions.e(Integer.valueOf(((d1) i1Var).b)));
        }
        if (i1Var instanceof g1) {
            return com.yandex.plus.plaquesdk.plaque.api.models.display.l.a;
        }
        b6e.s();
        return null;
    }

    public static com.yandex.plus.plaquesdk.plaque.api.models.display.x N(x1 x1Var, boolean z) {
        int i;
        int i2;
        com.yandex.plus.plaquesdk.plaque.api.models.display.j jVar;
        com.yandex.plus.plaquesdk.plaque.api.models.display.w vVar;
        v1 v1Var = x1Var.f;
        com.yandex.plus.home.datasource.openapi.models.t tVar = x1Var.c;
        t3 t3Var = x1Var.e;
        int i3 = v1Var == null ? -1 : com.yandex.plus.home.plaque.repository.rest.b.a[v1Var.ordinal()];
        if (i3 == -1) {
            i = 0;
        } else if (i3 == 1) {
            i = 3;
        } else if (i3 == 2) {
            i = 1;
        } else {
            if (i3 != 3) {
                b6e.s();
                return null;
            }
            i = 5;
        }
        w1 w1Var = x1Var.g;
        int i4 = w1Var == null ? -1 : com.yandex.plus.home.plaque.repository.rest.b.b[w1Var.ordinal()];
        if (i4 == -1) {
            i2 = 0;
        } else if (i4 == 1) {
            i2 = 48;
        } else if (i4 == 2) {
            i2 = 16;
        } else {
            if (i4 != 3) {
                b6e.s();
                return null;
            }
            i2 = 80;
        }
        com.yandex.plus.plaquesdk.plaque.api.models.display.a aVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.a(new com.yandex.plus.core.android.extensions.e(t3Var != null ? Integer.valueOf(t3Var.a) : 0), new com.yandex.plus.core.android.extensions.e(t3Var != null ? Integer.valueOf(t3Var.b) : 0), new com.yandex.plus.core.android.extensions.e(t3Var != null ? Integer.valueOf(t3Var.c) : 0), new com.yandex.plus.core.android.extensions.e(t3Var != null ? Integer.valueOf(t3Var.d) : 0));
        List list = x1Var.b;
        int size = list.size();
        if (size == 0) {
            jVar = com.yandex.plus.plaquesdk.plaque.api.models.display.i.a;
        } else if (size != 1) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(I((com.yandex.plus.home.datasource.openapi.models.p) it.next()));
            }
            jVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.c(arrayList);
        } else {
            jVar = I((com.yandex.plus.home.datasource.openapi.models.p) list.get(0));
        }
        com.yandex.plus.plaquesdk.plaque.api.models.display.b bVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.b(aVar, new com.yandex.plus.plaquesdk.plaque.api.models.display.p(jVar, new com.yandex.plus.plaquesdk.plaque.api.models.display.o(M(tVar.a), M(tVar.b), M(tVar.d), M(tVar.c)), z));
        h8 h8Var = x1Var.a;
        if (h8Var instanceof s2) {
            vVar = com.yandex.plus.plaquesdk.plaque.api.models.display.t.a;
        } else if (h8Var instanceof v2) {
            vVar = com.yandex.plus.plaquesdk.plaque.api.models.display.u.a;
        } else {
            if (!(h8Var instanceof y2)) {
                b6e.s();
                return null;
            }
            vVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.v(new com.yandex.plus.core.android.extensions.e(Integer.valueOf(((y2) h8Var).b)));
        }
        return new com.yandex.plus.plaquesdk.plaque.api.models.display.x(bVar, vVar, i | i2);
    }

    public static final Object b(h hVar, com.yandex.plus.core.data.common.y yVar, aur aurVar) {
        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) hVar.e)).getClass();
        return x97.V(com.yandex.plus.core.dispatcher.a.e, new com.yandex.plus.home.api.prefetch.j(hVar, yVar, (Continuation) null, 5), aurVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(1:15)|16|(1:18)|19))|34|6|7|(0)(0)|12|13|(0)|16|(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(h hVar, Object obj, cg6 cg6Var) {
        com.yandex.plus.webview.api.contract.message.a aVar;
        Object obj2;
        int i;
        String str;
        if (cg6Var instanceof com.yandex.plus.webview.api.contract.message.a) {
            aVar = (com.yandex.plus.webview.api.contract.message.a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                obj2 = aVar.k;
                nm6 nm6Var = nm6.a;
                i = aVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    kotlinx.coroutines.a aVar2 = (kotlinx.coroutines.a) hVar.c;
                    com.yandex.passport.sloth.ui.q qVar = new com.yandex.passport.sloth.ui.q(hVar, obj, continuation, 17);
                    aVar.j = obj;
                    aVar.m = 1;
                    obj2 = x97.V(aVar2, qVar, aVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = aVar.j;
                    qgg.h0(obj2);
                }
                r7o r7oVar2 = z7o.b;
                if (obj2 instanceof t7o) {
                    obj2 = null;
                }
                str = (String) obj2;
                if (str == null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
                    String n = hrg.n(obj, "Message to json serialization error, message=");
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, n, null);
                }
                return str;
            }
        }
        aVar = new com.yandex.plus.webview.api.contract.message.a(hVar, cg6Var);
        obj2 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (obj2 instanceof t7o) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        return str;
    }

    public static com.yandex.plus.home.plaque.repository.api.model.s g(d6 d6Var, int i, LinkedHashMap linkedHashMap, Set set) {
        com.yandex.plus.home.plaque.repository.api.model.h hVar;
        if (set.contains(Integer.valueOf(i))) {
            wb8.h(k5r.i(i, "Cyclic predicates tree for index="));
            return null;
        }
        if (d6Var instanceof com.yandex.plus.home.datasource.openapi.models.k) {
            List list = ((com.yandex.plus.home.datasource.openapi.models.k) d6Var).b;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Object obj = linkedHashMap.get(Integer.valueOf(intValue));
                if (obj == null) {
                    wb8.h(dfi.c(intValue, "Predicate with index=", " not found"));
                    return null;
                }
                arrayList.add(g((d6) obj, intValue, linkedHashMap, wop.j(set, Integer.valueOf(i))));
            }
            return new com.yandex.plus.home.plaque.repository.api.model.e(arrayList);
        }
        if (d6Var instanceof com.yandex.plus.home.datasource.openapi.models.n) {
            List list2 = ((com.yandex.plus.home.datasource.openapi.models.n) d6Var).b;
            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Number) it2.next()).intValue();
                Object obj2 = linkedHashMap.get(Integer.valueOf(intValue2));
                if (obj2 == null) {
                    wb8.h(dfi.c(intValue2, "Predicate with index=", " not found"));
                    return null;
                }
                arrayList2.add(g((d6) obj2, intValue2, linkedHashMap, wop.j(set, Integer.valueOf(i))));
            }
            return new com.yandex.plus.home.plaque.repository.api.model.f(arrayList2);
        }
        if (d6Var instanceof z4) {
            int i2 = ((z4) d6Var).b;
            Object obj3 = linkedHashMap.get(Integer.valueOf(i2));
            if (obj3 != null) {
                return new com.yandex.plus.home.plaque.repository.api.model.m(g((d6) obj3, i2, linkedHashMap, wop.j(set, Integer.valueOf(i))));
            }
            wb8.h(dfi.c(i2, "Predicate with index=", " not found"));
            return null;
        }
        if (d6Var instanceof d0) {
            return new com.yandex.plus.home.plaque.repository.api.model.g(((d0) d6Var).b);
        }
        if (d6Var instanceof o0) {
            o0 o0Var = (o0) d6Var;
            String str = o0Var.b;
            int ordinal = o0Var.d.ordinal();
            if (ordinal == 0) {
                hVar = com.yandex.plus.home.plaque.repository.api.model.h.a;
            } else if (ordinal == 1) {
                hVar = com.yandex.plus.home.plaque.repository.api.model.h.b;
            } else if (ordinal == 2) {
                hVar = com.yandex.plus.home.plaque.repository.api.model.h.c;
            } else if (ordinal == 3) {
                hVar = com.yandex.plus.home.plaque.repository.api.model.h.d;
            } else {
                if (ordinal != 4) {
                    b6e.s();
                    return null;
                }
                hVar = com.yandex.plus.home.plaque.repository.api.model.h.e;
            }
            return new com.yandex.plus.home.plaque.repository.api.model.i(str, hVar, J(o0Var.c));
        }
        if (d6Var instanceof u0) {
            u0 u0Var = (u0) d6Var;
            return new com.yandex.plus.home.plaque.repository.api.model.j(u0Var.b, J(u0Var.c));
        }
        if (!(d6Var instanceof q3)) {
            if (d6Var instanceof z3) {
                return new com.yandex.plus.home.plaque.repository.api.model.l(((z3) d6Var).b);
            }
            b6e.s();
            return null;
        }
        q3 q3Var = (q3) d6Var;
        List list3 = q3Var.c;
        String str2 = q3Var.b;
        HashSet hashSet = new HashSet(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            hashSet.add(J((j6) it3.next()));
        }
        return new com.yandex.plus.home.plaque.repository.api.model.k(str2, hashSet);
    }

    public static com.yandex.plus.home.plaque.repository.api.model.s i(List list, int i) {
        Object S = CollectionsKt.S(list, i);
        if (S == null) {
            throw new IllegalStateException(("Can't find root predicate with id=" + i + ", predicates=" + list).toString());
        }
        d6 d6Var = (d6) S;
        List list2 = list;
        int a = tah.a(v75.o(list2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        int i2 = 0;
        for (Object obj : list2) {
            linkedHashMap.put(Integer.valueOf(i2), obj);
            i2++;
        }
        return g(d6Var, 0, linkedHashMap, q5b.a);
    }

    public static zvd r(Map map, lah lahVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : lahVar.b.entrySet()) {
            linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
        }
        String[] strArr = new String[linkedHashMap.size() * 2];
        int i = 0;
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str = (String) entry3.getKey();
            String str2 = (String) entry3.getValue();
            String obj = StringsKt.t0(str).toString();
            String obj2 = StringsKt.t0(str2).toString();
            qwp.D(obj);
            qwp.G(obj2, obj);
            strArr[i] = obj;
            strArr[i + 1] = obj2;
            i += 2;
        }
        return new zvd(strArr);
    }

    public static u7e s(String str, lah lahVar) {
        str.getClass();
        s7e s7eVar = new s7e();
        s7eVar.h(null, str);
        s7e f = s7eVar.e().f();
        String str2 = lahVar.a;
        str2.getClass();
        f.c(str2, false);
        for (Map.Entry entry : lahVar.c.entrySet()) {
            String str3 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                f.d(str3, (String) it.next());
            }
        }
        return f.e();
    }

    public static String t(com.yandex.passport.sloth.ui.dependencies.m mVar) {
        return su4.o(new StringBuilder("MapiRequest(urlPath=\""), ((lah) mVar.b).a, "\")");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f A[Catch: all -> 0x003e, CancellationException -> 0x0041, wis -> 0x0044, TryCatch #2 {wis -> 0x0044, CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:14:0x00f3, B:16:0x00ff, B:18:0x010f, B:19:0x0114, B:21:0x0119, B:22:0x011e, B:28:0x0057, B:30:0x00c0, B:32:0x00d5, B:38:0x0062, B:41:0x0076, B:42:0x0080, B:44:0x0086, B:46:0x0095, B:48:0x009f, B:52:0x013c, B:53:0x0152, B:55:0x0158, B:57:0x0169, B:59:0x0171, B:62:0x0177, B:63:0x018e, B:65:0x0194, B:67:0x01b4, B:68:0x01c4), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119 A[Catch: all -> 0x003e, CancellationException -> 0x0041, wis -> 0x0044, TryCatch #2 {wis -> 0x0044, CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:14:0x00f3, B:16:0x00ff, B:18:0x010f, B:19:0x0114, B:21:0x0119, B:22:0x011e, B:28:0x0057, B:30:0x00c0, B:32:0x00d5, B:38:0x0062, B:41:0x0076, B:42:0x0080, B:44:0x0086, B:46:0x0095, B:48:0x009f, B:52:0x013c, B:53:0x0152, B:55:0x0158, B:57:0x0169, B:59:0x0171, B:62:0x0177, B:63:0x018e, B:65:0x0194, B:67:0x01b4, B:68:0x01c4), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[Catch: all -> 0x003e, CancellationException -> 0x0041, wis -> 0x0044, TryCatch #2 {wis -> 0x0044, CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:14:0x00f3, B:16:0x00ff, B:18:0x010f, B:19:0x0114, B:21:0x0119, B:22:0x011e, B:28:0x0057, B:30:0x00c0, B:32:0x00d5, B:38:0x0062, B:41:0x0076, B:42:0x0080, B:44:0x0086, B:46:0x0095, B:48:0x009f, B:52:0x013c, B:53:0x0152, B:55:0x0158, B:57:0x0169, B:59:0x0171, B:62:0x0177, B:63:0x018e, B:65:0x0194, B:67:0x01b4, B:68:0x01c4), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(r0 r0Var, List list, Map map, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.rest.e eVar;
        int i;
        LinkedHashMap o;
        int i2;
        h hVar;
        int i3;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar;
        c5 c5Var;
        com.yandex.plus.home.plaque.repository.api.model.s sVar;
        String str;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar2;
        com.yandex.plus.home.plaque.repository.api.model.s sVar2;
        r0 r0Var2;
        String str2;
        Map map2;
        Map map3;
        r0 r0Var3 = r0Var;
        try {
            if (cg6Var instanceof com.yandex.plus.home.plaque.repository.rest.e) {
                eVar = (com.yandex.plus.home.plaque.repository.rest.e) cg6Var;
                int i4 = eVar.t;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    eVar.t = i4 - Integer.MIN_VALUE;
                    com.yandex.plus.home.plaque.repository.rest.e eVar2 = eVar;
                    Object obj = eVar2.r;
                    nm6 nm6Var = nm6.a;
                    i = eVar2.t;
                    g0 g0Var = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        List list2 = list;
                        int a = tah.a(v75.o(list2, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                        for (Object obj2 : list2) {
                            linkedHashMap.put(((e8) obj2).getId(), obj2);
                        }
                        if (list.size() != linkedHashMap.size()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("There are widgets with equal keys: ");
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj3 : list) {
                                String id = ((e8) obj3).getId();
                                Object obj4 = linkedHashMap2.get(id);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap2.put(id, obj4);
                                }
                                ((List) obj4).add(obj3);
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
                            for (Object obj5 : linkedHashMap2.entrySet()) {
                                linkedHashMap3.put(((Map.Entry) obj5).getKey(), new Integer(((List) ((Map.Entry) obj5).getValue()).size()));
                            }
                            sb.append(linkedHashMap3);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        o = o(r0Var3.h, list);
                        String str3 = r0Var3.c;
                        eVar2.j = r0Var3;
                        eVar2.k = this;
                        eVar2.l = o;
                        i2 = 0;
                        eVar2.p = 0;
                        eVar2.q = 0;
                        eVar2.t = 1;
                        obj = k(str3, linkedHashMap, o, map, eVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        hVar = this;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = eVar2.o;
                            xVar2 = eVar2.n;
                            sVar2 = eVar2.m;
                            r0Var2 = eVar2.j;
                            qgg.h0(obj);
                            g0Var = (g0) obj;
                            xVar = xVar2;
                            sVar = sVar2;
                            str = str2;
                            r0Var3 = r0Var2;
                            j0 j0Var = new j0(str, xVar, g0Var, i0.b, h0.a, false);
                            String str4 = r0Var3.b;
                            map2 = r0Var3.j;
                            if (map2 == null) {
                                map2 = e5b.a;
                                map2.getClass();
                            }
                            Map map4 = map2;
                            map3 = r0Var3.i;
                            if (map3 == null) {
                                map3 = e5b.a;
                                map3.getClass();
                            }
                            Map map5 = map3;
                            String str5 = r0Var3.k;
                            int i5 = r0Var3.e;
                            msa msaVar = nsa.b;
                            long j = r0Var3.f;
                            ssa ssaVar = ssa.MILLISECONDS;
                            com.yandex.plus.home.plaque.repository.api.model.a aVar = new com.yandex.plus.home.plaque.repository.api.model.a(j0Var, str4, map4, map5, i5, sVar, str5, yd5.N(j, ssaVar), yd5.N(r0Var3.g, ssaVar));
                            r7o r7oVar2 = z7o.b;
                            return aVar;
                        }
                        int i6 = eVar2.q;
                        i3 = eVar2.p;
                        o = eVar2.l;
                        h hVar2 = eVar2.k;
                        r0 r0Var4 = eVar2.j;
                        qgg.h0(obj);
                        i2 = i6;
                        r0Var3 = r0Var4;
                        hVar = hVar2;
                    }
                    xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
                    h6 h6Var = r0Var3.d;
                    int i7 = h6Var.a;
                    List list3 = h6Var.b;
                    hVar.getClass();
                    com.yandex.plus.home.plaque.repository.api.model.s i8 = i(list3, i7);
                    String str6 = r0Var3.a;
                    c5Var = r0Var3.h;
                    if (c5Var != null) {
                        sVar = i8;
                        str = str6;
                        j0 j0Var2 = new j0(str, xVar, g0Var, i0.b, h0.a, false);
                        String str42 = r0Var3.b;
                        map2 = r0Var3.j;
                        if (map2 == null) {
                        }
                        Map map42 = map2;
                        map3 = r0Var3.i;
                        if (map3 == null) {
                        }
                        Map map52 = map3;
                        String str52 = r0Var3.k;
                        int i52 = r0Var3.e;
                        msa msaVar2 = nsa.b;
                        long j2 = r0Var3.f;
                        ssa ssaVar2 = ssa.MILLISECONDS;
                        com.yandex.plus.home.plaque.repository.api.model.a aVar2 = new com.yandex.plus.home.plaque.repository.api.model.a(j0Var2, str42, map42, map52, i52, sVar, str52, yd5.N(j2, ssaVar2), yd5.N(r0Var3.g, ssaVar2));
                        r7o r7oVar22 = z7o.b;
                        return aVar2;
                    }
                    eVar2.j = r0Var3;
                    eVar2.k = null;
                    eVar2.l = null;
                    eVar2.m = i8;
                    eVar2.n = xVar;
                    eVar2.o = str6;
                    eVar2.p = i3;
                    eVar2.q = i2;
                    eVar2.t = 2;
                    Object P = hVar.P(c5Var, o, eVar2);
                    if (P != nm6Var) {
                        xVar2 = xVar;
                        sVar2 = i8;
                        r0Var2 = r0Var3;
                        obj = P;
                        str2 = str6;
                        g0Var = (g0) obj;
                        xVar = xVar2;
                        sVar = sVar2;
                        str = str2;
                        r0Var3 = r0Var2;
                        j0 j0Var22 = new j0(str, xVar, g0Var, i0.b, h0.a, false);
                        String str422 = r0Var3.b;
                        map2 = r0Var3.j;
                        if (map2 == null) {
                        }
                        Map map422 = map2;
                        map3 = r0Var3.i;
                        if (map3 == null) {
                        }
                        Map map522 = map3;
                        String str522 = r0Var3.k;
                        int i522 = r0Var3.e;
                        msa msaVar22 = nsa.b;
                        long j22 = r0Var3.f;
                        ssa ssaVar22 = ssa.MILLISECONDS;
                        com.yandex.plus.home.plaque.repository.api.model.a aVar22 = new com.yandex.plus.home.plaque.repository.api.model.a(j0Var22, str422, map422, map522, i522, sVar, str522, yd5.N(j22, ssaVar22), yd5.N(r0Var3.g, ssaVar22));
                        r7o r7oVar222 = z7o.b;
                        return aVar22;
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
            h6 h6Var2 = r0Var3.d;
            int i72 = h6Var2.a;
            List list32 = h6Var2.b;
            hVar.getClass();
            com.yandex.plus.home.plaque.repository.api.model.s i82 = i(list32, i72);
            String str62 = r0Var3.a;
            c5Var = r0Var3.h;
            if (c5Var != null) {
            }
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        eVar = new com.yandex.plus.home.plaque.repository.rest.e(this, cg6Var);
        com.yandex.plus.home.plaque.repository.rest.e eVar22 = eVar;
        Object obj6 = eVar22.r;
        nm6 nm6Var2 = nm6.a;
        i = eVar22.t;
        g0 g0Var2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106 A[Catch: all -> 0x003e, CancellationException -> 0x0041, wis -> 0x0044, TryCatch #2 {wis -> 0x0044, CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:14:0x00eb, B:16:0x00f7, B:18:0x0106, B:19:0x010b, B:21:0x0110, B:22:0x0115, B:28:0x0059, B:30:0x00c5, B:32:0x00cd, B:38:0x0061, B:41:0x0075, B:42:0x007f, B:44:0x0085, B:46:0x0094, B:48:0x009e, B:52:0x012a, B:53:0x0140, B:55:0x0146, B:57:0x0157, B:59:0x015f, B:62:0x0165, B:63:0x017c, B:65:0x0182, B:67:0x01a2, B:68:0x01b2), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0110 A[Catch: all -> 0x003e, CancellationException -> 0x0041, wis -> 0x0044, TryCatch #2 {wis -> 0x0044, CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:14:0x00eb, B:16:0x00f7, B:18:0x0106, B:19:0x010b, B:21:0x0110, B:22:0x0115, B:28:0x0059, B:30:0x00c5, B:32:0x00cd, B:38:0x0061, B:41:0x0075, B:42:0x007f, B:44:0x0085, B:46:0x0094, B:48:0x009e, B:52:0x012a, B:53:0x0140, B:55:0x0146, B:57:0x0157, B:59:0x015f, B:62:0x0165, B:63:0x017c, B:65:0x0182, B:67:0x01a2, B:68:0x01b2), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: all -> 0x003e, CancellationException -> 0x0041, wis -> 0x0044, TryCatch #2 {wis -> 0x0044, CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:14:0x00eb, B:16:0x00f7, B:18:0x0106, B:19:0x010b, B:21:0x0110, B:22:0x0115, B:28:0x0059, B:30:0x00c5, B:32:0x00cd, B:38:0x0061, B:41:0x0075, B:42:0x007f, B:44:0x0085, B:46:0x0094, B:48:0x009e, B:52:0x012a, B:53:0x0140, B:55:0x0146, B:57:0x0157, B:59:0x015f, B:62:0x0165, B:63:0x017c, B:65:0x0182, B:67:0x01a2, B:68:0x01b2), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(g7 g7Var, List list, Map map, i0 i0Var, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.rest.d dVar;
        int i;
        LinkedHashMap o;
        i0 i0Var2;
        h hVar;
        int i2;
        g7 g7Var2;
        int i3;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar;
        c5 c5Var;
        String str;
        i0 i0Var3;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar2;
        i0 i0Var4;
        String str2;
        g7 g7Var3;
        Map map2;
        Map map3;
        try {
            if (cg6Var instanceof com.yandex.plus.home.plaque.repository.rest.d) {
                dVar = (com.yandex.plus.home.plaque.repository.rest.d) cg6Var;
                int i4 = dVar.t;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    dVar.t = i4 - Integer.MIN_VALUE;
                    com.yandex.plus.home.plaque.repository.rest.d dVar2 = dVar;
                    Object obj = dVar2.r;
                    nm6 nm6Var = nm6.a;
                    i = dVar2.t;
                    g0 g0Var = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        List list2 = list;
                        int a = tah.a(v75.o(list2, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                        for (Object obj2 : list2) {
                            linkedHashMap.put(((e8) obj2).getId(), obj2);
                        }
                        if (list.size() != linkedHashMap.size()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("There are widgets with equal keys: ");
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj3 : list) {
                                String id = ((e8) obj3).getId();
                                Object obj4 = linkedHashMap2.get(id);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap2.put(id, obj4);
                                }
                                ((List) obj4).add(obj3);
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
                            for (Object obj5 : linkedHashMap2.entrySet()) {
                                linkedHashMap3.put(((Map.Entry) obj5).getKey(), new Integer(((List) ((Map.Entry) obj5).getValue()).size()));
                            }
                            sb.append(linkedHashMap3);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        o = o(g7Var.d, list);
                        String str3 = g7Var.c;
                        dVar2.j = g7Var;
                        i0Var2 = i0Var;
                        dVar2.k = i0Var2;
                        dVar2.l = this;
                        dVar2.m = o;
                        dVar2.p = 0;
                        dVar2.q = 0;
                        dVar2.t = 1;
                        obj = k(str3, linkedHashMap, o, map, dVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        hVar = this;
                        i2 = 0;
                        g7Var2 = g7Var;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = dVar2.o;
                            xVar2 = dVar2.n;
                            i0Var4 = dVar2.k;
                            g7Var3 = dVar2.j;
                            qgg.h0(obj);
                            g0Var = (g0) obj;
                            xVar = xVar2;
                            g7Var2 = g7Var3;
                            str = str2;
                            i0Var3 = i0Var4;
                            j0 j0Var = new j0(str, xVar, g0Var, i0Var3, h0.a, false);
                            String str4 = g7Var2.b;
                            map2 = g7Var2.f;
                            if (map2 == null) {
                                map2 = e5b.a;
                                map2.getClass();
                            }
                            Map map4 = map2;
                            map3 = g7Var2.e;
                            if (map3 == null) {
                                map3 = e5b.a;
                                map3.getClass();
                            }
                            com.yandex.plus.home.plaque.repository.api.model.b bVar = new com.yandex.plus.home.plaque.repository.api.model.b(j0Var, str4, map4, map3, 0, new com.yandex.plus.home.plaque.repository.api.model.e(c5b.a));
                            r7o r7oVar2 = z7o.b;
                            return bVar;
                        }
                        i3 = dVar2.q;
                        i2 = dVar2.p;
                        o = dVar2.m;
                        h hVar2 = dVar2.l;
                        i0Var2 = dVar2.k;
                        g7Var2 = dVar2.j;
                        qgg.h0(obj);
                        hVar = hVar2;
                    }
                    xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
                    String str5 = g7Var2.a;
                    c5Var = g7Var2.d;
                    if (c5Var != null) {
                        str = str5;
                        i0Var3 = i0Var2;
                        j0 j0Var2 = new j0(str, xVar, g0Var, i0Var3, h0.a, false);
                        String str42 = g7Var2.b;
                        map2 = g7Var2.f;
                        if (map2 == null) {
                        }
                        Map map42 = map2;
                        map3 = g7Var2.e;
                        if (map3 == null) {
                        }
                        com.yandex.plus.home.plaque.repository.api.model.b bVar2 = new com.yandex.plus.home.plaque.repository.api.model.b(j0Var2, str42, map42, map3, 0, new com.yandex.plus.home.plaque.repository.api.model.e(c5b.a));
                        r7o r7oVar22 = z7o.b;
                        return bVar2;
                    }
                    dVar2.j = g7Var2;
                    dVar2.k = i0Var2;
                    dVar2.l = null;
                    dVar2.m = null;
                    dVar2.n = xVar;
                    dVar2.o = str5;
                    dVar2.p = i2;
                    dVar2.q = i3;
                    dVar2.t = 2;
                    Object P = hVar.P(c5Var, o, dVar2);
                    if (P != nm6Var) {
                        xVar2 = xVar;
                        i0Var4 = i0Var2;
                        obj = P;
                        str2 = str5;
                        g7Var3 = g7Var2;
                        g0Var = (g0) obj;
                        xVar = xVar2;
                        g7Var2 = g7Var3;
                        str = str2;
                        i0Var3 = i0Var4;
                        j0 j0Var22 = new j0(str, xVar, g0Var, i0Var3, h0.a, false);
                        String str422 = g7Var2.b;
                        map2 = g7Var2.f;
                        if (map2 == null) {
                        }
                        Map map422 = map2;
                        map3 = g7Var2.e;
                        if (map3 == null) {
                        }
                        com.yandex.plus.home.plaque.repository.api.model.b bVar22 = new com.yandex.plus.home.plaque.repository.api.model.b(j0Var22, str422, map422, map3, 0, new com.yandex.plus.home.plaque.repository.api.model.e(c5b.a));
                        r7o r7oVar222 = z7o.b;
                        return bVar22;
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
            String str52 = g7Var2.a;
            c5Var = g7Var2.d;
            if (c5Var != null) {
            }
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        dVar = new com.yandex.plus.home.plaque.repository.rest.d(this, cg6Var);
        com.yandex.plus.home.plaque.repository.rest.d dVar22 = dVar;
        Object obj6 = dVar22.r;
        nm6 nm6Var2 = nm6.a;
        i = dVar22.t;
        g0 g0Var2 = null;
    }

    public List C(hb hbVar, b6 b6Var) {
        eb ebVar;
        e0 e0Var;
        fo foVar;
        y5 y5Var;
        com.yandex.plus.core.graphql.fragment.m mVar;
        ArrayList arrayList = null;
        if (hbVar != null && (ebVar = hbVar.g) != null) {
            ArrayList arrayList2 = ebVar.b.a;
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                eo eoVar = ((com.yandex.plus.core.graphql.fragment.m) obj).d.b;
                if (eoVar != null) {
                    eo eoVar2 = (b6Var == null || (y5Var = b6Var.g) == null || (mVar = (com.yandex.plus.core.graphql.fragment.m) CollectionsKt.S(y5Var.b.a, i)) == null) ? null : mVar.d.b;
                    String str = eoVar.a;
                    String str2 = eoVar.b;
                    com.yandex.passport.data.network.l lVar = (com.yandex.passport.data.network.l) this.b;
                    fo foVar2 = eoVar.c;
                    com.yandex.plus.core.graphql.fragment.i1 i1Var = foVar2 != null ? foVar2.b : null;
                    com.yandex.plus.core.graphql.fragment.i1 i1Var2 = (eoVar2 == null || (foVar = eoVar2.c) == null) ? null : foVar.b;
                    ((com.yandex.plus.core.graphql.utils.b) lVar.a).getClass();
                    e0Var = new e0(str, str2, new com.yandex.plus.core.data.common.v(i1Var != null ? com.yandex.plus.core.graphql.utils.b.a(i1Var) : null, i1Var2 != null ? com.yandex.plus.core.graphql.utils.b.a(i1Var2) : null), eoVar.d, eoVar.e);
                } else {
                    e0Var = null;
                }
                if (e0Var != null) {
                    arrayList3.add(e0Var);
                }
                i = i2;
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? c5b.a : arrayList;
    }

    public com.yandex.plus.home.graphql.panel.mappers.shortcut.c D(Map map, Map map2, com.yandex.plus.home.graphql.panel.mappers.shortcut.a aVar) {
        String str;
        List list = (List) map.get("dailySubtitle");
        hb hbVar = list != null ? (hb) CollectionsKt.firstOrNull(list) : null;
        List list2 = (List) map2.get("dailySubtitle");
        b6 b6Var = list2 != null ? (b6) CollectionsKt.firstOrNull(list2) : null;
        if (hbVar == null || (str = hbVar.a) == null) {
            str = aVar.d;
            if (StringsKt.U(str)) {
                str = null;
            }
        }
        if (str != null) {
            return new com.yandex.plus.home.graphql.panel.mappers.shortcut.c(str, hbVar != null ? ((com.yandex.passport.data.network.l) this.b).F(hbVar, b6Var) : aVar.f, E(hbVar), C(hbVar, b6Var));
        }
        return null;
    }

    public com.yandex.plus.core.data.common.y F(String str, hb hbVar, b6 b6Var) {
        Map map;
        String str2;
        String str3;
        Map j = hbVar != null ? a1.j(hbVar) : null;
        if (b6Var != null) {
            y5 y5Var = b6Var.g;
            if (y5Var != null) {
                ArrayList arrayList = y5Var.b.a;
                int a = tah.a(v75.o(arrayList, 10));
                if (a < 16) {
                    a = 16;
                }
                map = new LinkedHashMap(a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.yandex.plus.core.graphql.fragment.q qVar = ((com.yandex.plus.core.graphql.fragment.m) it.next()).b.b;
                    map.put(qVar != null ? qVar.a : null, qVar != null ? qVar.b : null);
                }
            } else {
                map = e5b.a;
                map.getClass();
            }
        } else {
            map = null;
        }
        if (j == null || (str2 = (String) j.get(str)) == null) {
            return null;
        }
        if (map == null || (str3 = (String) map.get(str)) == null) {
            str3 = str2;
        }
        return new com.yandex.plus.core.data.common.y(str2, str3);
    }

    public com.yandex.plus.plaquesdk.plaque.api.models.a K(w0 w0Var, Map map) {
        if (w0Var instanceof d2) {
            d2 d2Var = (d2) w0Var;
            return new com.yandex.plus.plaquesdk.plaque.api.models.a(1, G(this, d2Var.b, map), d2Var.c);
        }
        if (w0Var instanceof s1) {
            return new com.yandex.plus.plaquesdk.plaque.api.models.a(2, null, null);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(cg6 cg6Var, List list, List list2, Map map) {
        com.yandex.plus.home.plaque.repository.rest.g gVar;
        int i;
        com.yandex.plus.plaquesdk.plaque.api.models.l lVar;
        com.yandex.plus.plaquesdk.plaque.api.models.c cVar;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.rest.g) {
            gVar = (com.yandex.plus.home.plaque.repository.rest.g) cg6Var;
            int i2 = gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gVar.k;
                nm6 nm6Var = nm6.a;
                i = gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList = null;
                    Set A0 = list2 != null ? CollectionsKt.A0(list2) : null;
                    if (A0 != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : A0) {
                            if (map.get((String) obj2) == null) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        l1j.m(arrayList, "Templates keys are absent: ");
                        return null;
                    }
                    List<v7> list3 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                    for (v7 v7Var : list3) {
                        if (!(v7Var instanceof q7)) {
                            b6e.s();
                            return null;
                        }
                        q7 q7Var = (q7) v7Var;
                        String G = G(this, q7Var.b, map);
                        int ordinal = q7Var.e.ordinal();
                        if (ordinal == 0) {
                            cVar = com.yandex.plus.plaquesdk.plaque.api.models.c.a;
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            cVar = com.yandex.plus.plaquesdk.plaque.api.models.c.b;
                        }
                        com.yandex.plus.plaquesdk.plaque.api.models.c cVar2 = cVar;
                        int i3 = q7Var.d;
                        com.yandex.plus.plaquesdk.plaque.api.models.d dVar = (i3 < 0 || i3 >= 201) ? (201 > i3 || i3 >= 301) ? (301 > i3 || i3 >= 401) ? (401 > i3 || i3 >= 501) ? (501 > i3 || i3 >= 601) ? (601 > i3 || i3 >= 701) ? (701 > i3 || i3 >= 801) ? (801 > i3 || i3 >= 901) ? (901 > i3 || i3 >= 1001) ? com.yandex.plus.plaquesdk.plaque.api.models.d.d : com.yandex.plus.plaquesdk.plaque.api.models.d.i : com.yandex.plus.plaquesdk.plaque.api.models.d.h : com.yandex.plus.plaquesdk.plaque.api.models.d.g : com.yandex.plus.plaquesdk.plaque.api.models.d.f : com.yandex.plus.plaquesdk.plaque.api.models.d.e : com.yandex.plus.plaquesdk.plaque.api.models.d.d : com.yandex.plus.plaquesdk.plaque.api.models.d.c : com.yandex.plus.plaquesdk.plaque.api.models.d.b : com.yandex.plus.plaquesdk.plaque.api.models.d.a;
                        Integer num = new Integer(q7Var.c);
                        c5b c5bVar = c5b.a;
                        arrayList2.add(new com.yandex.plus.plaquesdk.plaque.api.models.i(G, cVar2, dVar, num, c5bVar, c5bVar, q7Var.f, null));
                    }
                    lVar = new com.yandex.plus.plaquesdk.plaque.api.models.l(arrayList2);
                    com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.b;
                    gVar.j = lVar;
                    gVar.m = 1;
                    obj = sVar.k(lVar, gVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = gVar.j;
                    qgg.h0(obj);
                }
                return new com.yandex.plus.plaquesdk.plaque.api.models.w((CharSequence) obj, lVar);
            }
        }
        gVar = new com.yandex.plus.home.plaque.repository.rest.g(this, cg6Var);
        Object obj3 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        if (i != 0) {
        }
        return new com.yandex.plus.plaquesdk.plaque.api.models.w((CharSequence) obj3, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(c5 c5Var, Map map, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.rest.f fVar;
        int i;
        com.yandex.plus.plaquesdk.plaque.api.models.f0 f0Var;
        String uri;
        com.yandex.plus.plaquesdk.plaque.api.models.f0 f0Var2;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.rest.f) {
            fVar = (com.yandex.plus.home.plaque.repository.rest.f) cg6Var;
            int i2 = fVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.n = i2 - Integer.MIN_VALUE;
                Object obj = fVar.l;
                nm6 nm6Var = nm6.a;
                i = fVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = c5Var.getPosition().ordinal();
                    if (ordinal == 0) {
                        f0Var = com.yandex.plus.plaquesdk.plaque.api.models.f0.a;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        f0Var = com.yandex.plus.plaquesdk.plaque.api.models.f0.b;
                    }
                    if (c5Var instanceof m1) {
                        return new com.yandex.plus.plaquesdk.plaque.api.models.d0(((m1) c5Var).c, f0Var);
                    }
                    if (!(c5Var instanceof k3)) {
                        b6e.s();
                        return null;
                    }
                    uri = ((k3) c5Var).c.toString();
                    uri.getClass();
                    Object obj2 = map.get(uri);
                    if (obj2 == null) {
                        xq0.o(uri.concat(" is absent"));
                        return null;
                    }
                    fVar.j = f0Var;
                    fVar.k = uri;
                    fVar.n = 1;
                    Object H = ((mu7) obj2).H(fVar);
                    if (H == nm6Var) {
                        return nm6Var;
                    }
                    com.yandex.plus.plaquesdk.plaque.api.models.f0 f0Var3 = f0Var;
                    obj = H;
                    f0Var2 = f0Var3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = fVar.k;
                    f0Var2 = fVar.j;
                    qgg.h0(obj);
                }
                Object obj3 = ((z7o) obj).a;
                qgg.h0(obj3);
                return new com.yandex.plus.plaquesdk.plaque.api.models.e0(new com.yandex.plus.plaquesdk.plaque.api.models.q((Drawable) obj3, uri), f0Var2);
            }
        }
        fVar = new com.yandex.plus.home.plaque.repository.rest.f(this, cg6Var);
        Object obj4 = fVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fVar.n;
        if (i != 0) {
        }
        Object obj32 = ((z7o) obj4).a;
        qgg.h0(obj32);
        return new com.yandex.plus.plaquesdk.plaque.api.models.e0(new com.yandex.plus.plaquesdk.plaque.api.models.q((Drawable) obj32, uri), f0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Q(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1 v1Var, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internalapi.bridge.b bVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internalapi.bridge.b) {
            bVar = (com.yandex.plus.home.feature.webviews.internalapi.bridge.b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kotlinx.coroutines.a aVar = (kotlinx.coroutines.a) this.b;
                    com.yandex.plus.experiments.impl.cache.b bVar2 = new com.yandex.plus.experiments.impl.cache.b(this, v1Var, null, 7);
                    bVar.l = 1;
                    obj = x97.V(aVar, bVar2, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        bVar = new com.yandex.plus.home.feature.webviews.internalapi.bridge.b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    @Override // com.yandex.passport.internal.core.accounts.g
    public void d(Exception exc) {
        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) this.c;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "removeAndRecreateAccount: remove uid=" + fVar + ": exception", exc);
        }
        ((i) this.d).c.a(fVar.b, exc);
        ((AtomicReference) this.e).set(exc);
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.zfv
    public void e() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                ((SslErrorHandler) obj2).cancel();
                String url = ((WebView) obj).getUrl();
                SslError sslError = (SslError) this.d;
                boolean d = Intrinsics.d(url, sslError.getUrl());
                c2 c2Var = (c2) this.e;
                if (!d) {
                    com.yandex.passport.sloth.ui.g gVar = c2Var.b;
                    com.yandex.passport.sloth.r0 r0Var = com.yandex.passport.sloth.r0.SSL_ERROR;
                    com.yandex.passport.sloth.w0.d.getClass();
                    Map M = defpackage.b6.M(sslError);
                    com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                    oVar.getClass();
                    if (oVar.a()) {
                        oVar.a.a("sloth.reportWebAmEvent.".concat(r0Var.a), M);
                        break;
                    }
                } else {
                    c2Var.m.invoke(new com.yandex.passport.sloth.ui.webview.e(sslError));
                    break;
                }
                break;
            case 5:
                ((SslErrorHandler) obj2).cancel();
                String url2 = ((WebView) obj).getUrl();
                SslError sslError2 = (SslError) this.d;
                boolean d2 = Intrinsics.d(url2, sslError2.getUrl());
                com.yandex.passport.sloth.ui.webview.i iVar = (com.yandex.passport.sloth.ui.webview.i) this.e;
                if (!d2) {
                    b1 b1Var = iVar.c;
                    sslError2.getClass();
                    com.yandex.passport.sloth.r0 r0Var2 = com.yandex.passport.sloth.r0.SSL_ERROR;
                    com.yandex.passport.sloth.w0.d.getClass();
                    b1Var.a(new n0(16, r0Var2, defpackage.b6.M(sslError2)));
                    break;
                } else {
                    iVar.h = true;
                    com.yandex.passport.sloth.ui.s sVar = iVar.k;
                    if (sVar != null) {
                        sVar.invoke(new com.yandex.passport.sloth.ui.webview.e(sslError2));
                        break;
                    }
                }
                break;
            default:
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                StringBuilder sb = new StringBuilder();
                sb.append(((com.yandex.plus.core.network.ssl.a) obj2).a);
                sb.append(".resolveSslError() error=");
                SslError sslError3 = (SslError) obj;
                sb.append(sslError3);
                sb.append(" canceled");
                String sb2 = sb.toString();
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, sb2, null);
                ((SslErrorHandler) this.d).cancel();
                ((com.yandex.passport.internal.ui.sloth.ebs.i) this.e).invoke(sslError3);
                break;
        }
    }

    @Override // defpackage.i6s
    public void f(Drawable drawable) {
        com.yandex.plus.core.imageloader.a aVar = (com.yandex.plus.core.imageloader.a) this.e;
        com.yandex.plus.coil.b bVar = (com.yandex.plus.coil.b) this.c;
        aVar.b(drawable);
        bVar.c.remove(aVar);
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        obj.getClass();
        s9fVar.getClass();
        com.yandex.passport.internal.util.storage.a aVar = (com.yandex.passport.internal.util.storage.a) this.e;
        if (aVar == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = (String) this.d;
            if (str == null) {
                str = obj.getClass().getName() + '.' + s9fVar.getName() + ".persistableMap";
            }
            aVar = new com.yandex.passport.internal.util.storage.a(concurrentHashMap, str, (Function1) this.b, (Function1) this.c);
            this.e = aVar;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.yandex.passport.internal.core.accounts.h] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [com.yandex.plus.core.android.extensions.f] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x032c -> B:32:0x033f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0239 -> B:54:0x0248). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(e8 e8Var, Map map, Map map2, Set set, Map map3, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.rest.c cVar;
        Integer num;
        c0 c0Var;
        String str;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar;
        String str2;
        c0 b0Var;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar2;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar2;
        String str3;
        com.yandex.plus.plaquesdk.plaque.api.models.a K;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x N;
        Object H;
        c0 c0Var2;
        String str4;
        c0 L;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar3;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar3;
        ArrayList arrayList;
        Iterator it;
        Map map4;
        com.yandex.plus.home.plaque.repository.rest.c cVar2;
        String str5;
        String str6;
        c0 c0Var3;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar4;
        int i;
        e8 e8Var2;
        Set set2;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar4;
        int i2;
        Map map5;
        Map map6;
        com.yandex.plus.plaquesdk.plaque.api.models.a K2;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x N2;
        ArrayList arrayList2;
        Iterator it2;
        com.yandex.plus.home.plaque.repository.rest.c cVar3;
        String str7;
        String str8;
        c0 c0Var4;
        int i3;
        Map map7;
        e8 e8Var3;
        Set set3;
        int i4;
        Map map8;
        Map map9;
        h hVar;
        Map map10;
        Object obj;
        int i5;
        c0 c0Var5;
        Map map11;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar5;
        Iterator it3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i6;
        Map map12;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar6;
        int i7;
        e8 e8Var4;
        Iterator it4;
        int i8;
        Set set4;
        Map map13;
        c0 c0Var6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Integer num2;
        h hVar2 = this;
        e8 e8Var5 = e8Var;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.rest.c) {
            cVar = (com.yandex.plus.home.plaque.repository.rest.c) cg6Var;
            int i9 = cVar.B;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.B = i9 - Integer.MIN_VALUE;
                Object obj2 = cVar.z;
                nm6 nm6Var = nm6.a;
                switch (cVar.B) {
                    case 0:
                        qgg.h0(obj2);
                        if (set.contains(e8Var5.getId())) {
                            l1j.m(e8Var5.getId(), "Cyclic widgets tree for id=");
                            return null;
                        }
                        if (e8Var5 instanceof com.yandex.plus.home.datasource.openapi.models.g0) {
                            com.yandex.plus.home.datasource.openapi.models.g0 g0Var = (com.yandex.plus.home.datasource.openapi.models.g0) e8Var5;
                            String str9 = g0Var.c;
                            com.yandex.plus.home.datasource.openapi.models.g gVar = g0Var.g;
                            c0 L2 = gVar != null ? L(gVar) : null;
                            K2 = hVar2.K(g0Var.b, map3);
                            N2 = N(g0Var.a, false);
                            List list = g0Var.e;
                            arrayList2 = new ArrayList(v75.o(list, 10));
                            it2 = list.iterator();
                            cVar3 = cVar;
                            str7 = " not found";
                            str8 = str9;
                            c0Var4 = L2;
                            i3 = 0;
                            map7 = map2;
                            e8Var3 = e8Var5;
                            set3 = set;
                            i4 = 0;
                            map8 = map3;
                            map9 = map;
                            if (!it2.hasNext()) {
                                return new com.yandex.plus.plaquesdk.plaque.api.models.m(str8, c0Var4, K2, N2, arrayList2);
                            }
                            String str10 = (String) it2.next();
                            Object obj3 = map9.get(str10);
                            if (obj3 == null) {
                                wb8.h(hrg.q("Widget with id=", str10, str7));
                                return null;
                            }
                            e8 e8Var6 = (e8) obj3;
                            LinkedHashSet j = wop.j(set3, ((com.yandex.plus.home.datasource.openapi.models.g0) e8Var3).c);
                            cVar3.j = e8Var3;
                            cVar3.k = map9;
                            cVar3.l = map7;
                            cVar3.m = set3;
                            cVar3.n = map8;
                            cVar3.o = null;
                            cVar3.p = null;
                            cVar3.q = arrayList2;
                            Iterator it5 = it2;
                            cVar3.r = it5;
                            cVar3.s = str8;
                            cVar3.t = c0Var4;
                            cVar3.u = K2;
                            cVar3.v = N2;
                            cVar3.w = arrayList2;
                            cVar3.x = i4;
                            cVar3.y = i3;
                            cVar3.B = 1;
                            int i10 = i4;
                            int i11 = i3;
                            Object h = h(e8Var6, map9, map7, j, map8, cVar3);
                            Map map14 = map7;
                            hVar = this;
                            if (h == nm6Var) {
                                return nm6Var;
                            }
                            map10 = map14;
                            obj = h;
                            i4 = i10;
                            i5 = i11;
                            c0Var5 = c0Var4;
                            map11 = map8;
                            ArrayList arrayList7 = arrayList2;
                            xVar5 = N2;
                            it3 = it5;
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList7;
                            arrayList4.add((com.yandex.plus.plaquesdk.plaque.api.models.x) obj);
                            hVar2 = hVar;
                            map7 = map10;
                            it2 = it3;
                            N2 = xVar5;
                            map8 = map11;
                            i3 = i5;
                            arrayList2 = arrayList3;
                            c0Var4 = c0Var5;
                            if (!it2.hasNext()) {
                            }
                        } else {
                            if (!(e8Var5 instanceof g4)) {
                                if (e8Var5 instanceof com.yandex.plus.home.datasource.openapi.models.j0) {
                                    com.yandex.plus.home.datasource.openapi.models.j0 j0Var = (com.yandex.plus.home.datasource.openapi.models.j0) e8Var5;
                                    str4 = j0Var.c;
                                    com.yandex.plus.home.datasource.openapi.models.g gVar2 = j0Var.g;
                                    L = gVar2 != null ? L(gVar2) : null;
                                    com.yandex.plus.plaquesdk.plaque.api.models.a K3 = hVar2.K(j0Var.b, map3);
                                    com.yandex.plus.plaquesdk.plaque.api.models.display.x N3 = N(j0Var.a, true);
                                    List list2 = j0Var.e;
                                    List list3 = j0Var.f;
                                    cVar.j = null;
                                    cVar.k = null;
                                    cVar.l = null;
                                    cVar.m = null;
                                    cVar.n = null;
                                    cVar.o = str4;
                                    cVar.p = L;
                                    cVar.q = K3;
                                    cVar.r = N3;
                                    cVar.B = 3;
                                    Object O = hVar2.O(cVar, list2, list3, map3);
                                    if (O != nm6Var) {
                                        aVar3 = K3;
                                        obj2 = O;
                                        xVar3 = N3;
                                        return new com.yandex.plus.plaquesdk.plaque.api.models.n(str4, L, aVar3, xVar3, (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2);
                                    }
                                } else if (e8Var5 instanceof n3) {
                                    n3 n3Var = (n3) e8Var5;
                                    URI uri = n3Var.e;
                                    str3 = n3Var.c;
                                    com.yandex.plus.home.datasource.openapi.models.g gVar3 = n3Var.g;
                                    c0 L3 = gVar3 != null ? L(gVar3) : null;
                                    K = hVar2.K(n3Var.b, map3);
                                    N = N(n3Var.a, false);
                                    Object obj4 = map2.get(uri.toString());
                                    if (obj4 == null) {
                                        throw new IllegalArgumentException((uri + " is absent").toString());
                                    }
                                    cVar.j = e8Var5;
                                    cVar.k = null;
                                    cVar.l = null;
                                    cVar.m = null;
                                    cVar.n = null;
                                    cVar.o = str3;
                                    cVar.p = L3;
                                    cVar.q = K;
                                    cVar.r = N;
                                    cVar.B = 4;
                                    H = ((mu7) obj4).H(cVar);
                                    if (H != nm6Var) {
                                        c0Var2 = L3;
                                        Object obj5 = ((z7o) H).a;
                                        qgg.h0(obj5);
                                        String uri2 = ((n3) e8Var5).e.toString();
                                        uri2.getClass();
                                        return new com.yandex.plus.plaquesdk.plaque.api.models.p(str3, c0Var2, K, N, new com.yandex.plus.plaquesdk.plaque.api.models.q((Drawable) obj5, uri2));
                                    }
                                } else {
                                    if (e8Var5 instanceof j7) {
                                        j7 j7Var = (j7) e8Var5;
                                        String str11 = j7Var.c;
                                        com.yandex.plus.home.datasource.openapi.models.g gVar4 = j7Var.f;
                                        return new com.yandex.plus.plaquesdk.plaque.api.models.t(str11, gVar4 != null ? L(gVar4) : null, hVar2.K(j7Var.b, map3), N(j7Var.a, false));
                                    }
                                    if (e8Var5 instanceof t7) {
                                        t7 t7Var = (t7) e8Var5;
                                        str2 = t7Var.c;
                                        b0Var = new b0(str2);
                                        com.yandex.plus.plaquesdk.plaque.api.models.a K4 = hVar2.K(t7Var.b, map3);
                                        com.yandex.plus.plaquesdk.plaque.api.models.display.x N4 = N(t7Var.a, false);
                                        List list4 = t7Var.g;
                                        if (list4 == null) {
                                            list4 = c5b.a;
                                        }
                                        List list5 = t7Var.e;
                                        cVar.j = null;
                                        cVar.k = null;
                                        cVar.l = null;
                                        cVar.m = null;
                                        cVar.n = null;
                                        cVar.o = str2;
                                        cVar.p = b0Var;
                                        cVar.q = K4;
                                        cVar.r = N4;
                                        cVar.B = 5;
                                        Object O2 = hVar2.O(cVar, list4, list5, map3);
                                        if (O2 != nm6Var) {
                                            aVar2 = K4;
                                            xVar2 = N4;
                                            obj2 = O2;
                                            return new com.yandex.plus.plaquesdk.plaque.api.models.u(str2, b0Var, aVar2, xVar2, (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2, false);
                                        }
                                    } else {
                                        if (!(e8Var5 instanceof z7)) {
                                            b6e.s();
                                            return null;
                                        }
                                        z7 z7Var = (z7) e8Var5;
                                        String str12 = z7Var.c;
                                        com.yandex.plus.home.datasource.openapi.models.g gVar5 = z7Var.g;
                                        c0 L4 = gVar5 != null ? L(gVar5) : null;
                                        com.yandex.plus.plaquesdk.plaque.api.models.a K5 = hVar2.K(z7Var.b, map3);
                                        com.yandex.plus.plaquesdk.plaque.api.models.display.x N5 = N(z7Var.a, false);
                                        List list6 = z7Var.e;
                                        List list7 = z7Var.f;
                                        cVar.j = e8Var5;
                                        num = null;
                                        cVar.k = null;
                                        cVar.l = null;
                                        cVar.m = null;
                                        cVar.n = null;
                                        cVar.o = str12;
                                        cVar.p = L4;
                                        cVar.q = K5;
                                        cVar.r = N5;
                                        cVar.B = 6;
                                        obj2 = hVar2.O(cVar, list6, list7, map3);
                                        if (obj2 != nm6Var) {
                                            c0Var = L4;
                                            str = str12;
                                            aVar = K5;
                                            xVar = N5;
                                            com.yandex.plus.plaquesdk.plaque.api.models.w wVar = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2;
                                            num2 = ((z7) e8Var5).h;
                                            if (num2 == null) {
                                                num2 = num;
                                            }
                                            return new com.yandex.plus.plaquesdk.plaque.api.models.v(str, c0Var, aVar, xVar, wVar, num2 == null ? new com.yandex.plus.core.android.extensions.f(num2) : num);
                                        }
                                    }
                                }
                                return nm6Var;
                            }
                            g4 g4Var = (g4) e8Var5;
                            String str13 = g4Var.c;
                            com.yandex.plus.home.datasource.openapi.models.g gVar6 = g4Var.h;
                            c0 L5 = gVar6 != null ? L(gVar6) : null;
                            com.yandex.plus.plaquesdk.plaque.api.models.a K6 = hVar2.K(g4Var.b, map3);
                            com.yandex.plus.plaquesdk.plaque.api.models.display.x N6 = N(g4Var.a, false);
                            List list8 = g4Var.e;
                            arrayList = new ArrayList(v75.o(list8, 10));
                            it = list8.iterator();
                            map4 = map2;
                            cVar2 = cVar;
                            str5 = " not found";
                            str6 = str13;
                            c0Var3 = L5;
                            xVar4 = N6;
                            i = 0;
                            e8Var2 = e8Var5;
                            set2 = set;
                            aVar4 = K6;
                            i2 = 0;
                            map5 = map3;
                            map6 = map;
                            if (it.hasNext()) {
                                Map map15 = map4;
                                String str14 = (String) it.next();
                                Object obj6 = map6.get(str14);
                                if (obj6 == null) {
                                    wb8.h(hrg.q("Widget with id=", str14, str5));
                                    return null;
                                }
                                e8 e8Var7 = (e8) obj6;
                                LinkedHashSet j2 = wop.j(set2, ((g4) e8Var2).c);
                                cVar2.j = e8Var2;
                                Map map16 = map6;
                                cVar2.k = map16;
                                cVar2.l = map15;
                                cVar2.m = set2;
                                cVar2.n = map5;
                                cVar2.o = null;
                                cVar2.p = null;
                                cVar2.q = arrayList;
                                cVar2.r = it;
                                cVar2.s = str6;
                                cVar2.t = c0Var3;
                                cVar2.u = aVar4;
                                cVar2.v = xVar4;
                                cVar2.w = arrayList;
                                cVar2.x = i;
                                cVar2.y = i2;
                                cVar2.B = 2;
                                com.yandex.plus.plaquesdk.plaque.api.models.a aVar5 = aVar4;
                                map6 = map16;
                                Iterator it6 = it;
                                c0 c0Var7 = c0Var3;
                                Object h2 = h(e8Var7, map6, map15, j2, map5, cVar2);
                                if (h2 != nm6Var) {
                                    map12 = map15;
                                    obj2 = h2;
                                    aVar4 = aVar5;
                                    xVar6 = xVar4;
                                    i7 = i2;
                                    e8Var4 = e8Var2;
                                    it4 = it6;
                                    i8 = i;
                                    set4 = set2;
                                    map13 = map5;
                                    ArrayList arrayList8 = arrayList;
                                    c0Var6 = c0Var7;
                                    arrayList5 = arrayList8;
                                    arrayList6 = arrayList8;
                                    arrayList6.add((com.yandex.plus.plaquesdk.plaque.api.models.x) obj2);
                                    map4 = map12;
                                    it = it4;
                                    map5 = map13;
                                    e8Var2 = e8Var4;
                                    set2 = set4;
                                    c0Var3 = c0Var6;
                                    i2 = i7;
                                    i = i8;
                                    arrayList = arrayList5;
                                    xVar4 = xVar6;
                                    if (it.hasNext()) {
                                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar6 = aVar4;
                                        c0 c0Var8 = c0Var3;
                                        ArrayList arrayList9 = arrayList;
                                        int ordinal = ((g4) e8Var2).f.ordinal();
                                        if (ordinal == 0) {
                                            i6 = 0;
                                        } else {
                                            if (ordinal != 1) {
                                                b6e.s();
                                                return null;
                                            }
                                            i6 = 1;
                                        }
                                        return new com.yandex.plus.plaquesdk.plaque.api.models.r(str6, c0Var8, aVar6, xVar4, arrayList9, i6);
                                    }
                                }
                                return nm6Var;
                            }
                        }
                    case 1:
                        int i12 = cVar.y;
                        int i13 = cVar.x;
                        Collection collection = cVar.w;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar7 = cVar.v;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar7 = cVar.u;
                        c0 c0Var9 = cVar.t;
                        String str15 = cVar.s;
                        it3 = (Iterator) cVar.r;
                        ?? r14 = (Collection) cVar.q;
                        map11 = cVar.n;
                        i5 = i12;
                        Set set5 = cVar.m;
                        Map map17 = cVar.l;
                        Map map18 = cVar.k;
                        e8 e8Var8 = cVar.j;
                        qgg.h0(obj2);
                        hVar = hVar2;
                        obj = obj2;
                        str7 = " not found";
                        c0Var5 = c0Var9;
                        str8 = str15;
                        arrayList3 = r14;
                        set3 = set5;
                        xVar5 = xVar7;
                        K2 = aVar7;
                        e8Var3 = e8Var8;
                        i4 = i13;
                        cVar3 = cVar;
                        map10 = map17;
                        map9 = map18;
                        arrayList4 = collection;
                        arrayList4.add((com.yandex.plus.plaquesdk.plaque.api.models.x) obj);
                        hVar2 = hVar;
                        map7 = map10;
                        it2 = it3;
                        N2 = xVar5;
                        map8 = map11;
                        i3 = i5;
                        arrayList2 = arrayList3;
                        c0Var4 = c0Var5;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 2:
                        int i14 = cVar.y;
                        int i15 = cVar.x;
                        Collection collection2 = cVar.w;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar8 = cVar.v;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar8 = cVar.u;
                        c0Var6 = cVar.t;
                        String str16 = cVar.s;
                        it4 = (Iterator) cVar.r;
                        ?? r12 = (Collection) cVar.q;
                        map13 = cVar.n;
                        Set set6 = cVar.m;
                        Map map19 = cVar.l;
                        Map map20 = cVar.k;
                        e8 e8Var9 = cVar.j;
                        qgg.h0(obj2);
                        i8 = i15;
                        xVar6 = xVar8;
                        str5 = " not found";
                        arrayList5 = r12;
                        str6 = str16;
                        i7 = i14;
                        map6 = map20;
                        e8Var4 = e8Var9;
                        cVar2 = cVar;
                        aVar4 = aVar8;
                        set4 = set6;
                        map12 = map19;
                        arrayList6 = collection2;
                        arrayList6.add((com.yandex.plus.plaquesdk.plaque.api.models.x) obj2);
                        map4 = map12;
                        it = it4;
                        map5 = map13;
                        e8Var2 = e8Var4;
                        set2 = set4;
                        c0Var3 = c0Var6;
                        i2 = i7;
                        i = i8;
                        arrayList = arrayList5;
                        xVar4 = xVar6;
                        if (it.hasNext()) {
                        }
                        break;
                    case 3:
                        xVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) cVar.r;
                        aVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.a) cVar.q;
                        L = cVar.p;
                        str4 = cVar.o;
                        Map map21 = cVar.n;
                        Set set7 = cVar.m;
                        Map map22 = cVar.l;
                        Map map23 = cVar.k;
                        qgg.h0(obj2);
                        return new com.yandex.plus.plaquesdk.plaque.api.models.n(str4, L, aVar3, xVar3, (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2);
                    case 4:
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar9 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) cVar.r;
                        K = (com.yandex.plus.plaquesdk.plaque.api.models.a) cVar.q;
                        c0Var2 = cVar.p;
                        str3 = cVar.o;
                        Map map24 = cVar.n;
                        Set set8 = cVar.m;
                        Map map25 = cVar.l;
                        Map map26 = cVar.k;
                        e8 e8Var10 = cVar.j;
                        qgg.h0(obj2);
                        N = xVar9;
                        e8Var5 = e8Var10;
                        H = obj2;
                        Object obj52 = ((z7o) H).a;
                        qgg.h0(obj52);
                        String uri22 = ((n3) e8Var5).e.toString();
                        uri22.getClass();
                        return new com.yandex.plus.plaquesdk.plaque.api.models.p(str3, c0Var2, K, N, new com.yandex.plus.plaquesdk.plaque.api.models.q((Drawable) obj52, uri22));
                    case 5:
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar10 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) cVar.r;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar9 = (com.yandex.plus.plaquesdk.plaque.api.models.a) cVar.q;
                        b0Var = cVar.p;
                        str2 = cVar.o;
                        Map map27 = cVar.n;
                        Set set9 = cVar.m;
                        Map map28 = cVar.l;
                        Map map29 = cVar.k;
                        qgg.h0(obj2);
                        xVar2 = xVar10;
                        aVar2 = aVar9;
                        return new com.yandex.plus.plaquesdk.plaque.api.models.u(str2, b0Var, aVar2, xVar2, (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2, false);
                    case 6:
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar11 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) cVar.r;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar10 = (com.yandex.plus.plaquesdk.plaque.api.models.a) cVar.q;
                        c0 c0Var10 = cVar.p;
                        String str17 = cVar.o;
                        Map map30 = cVar.n;
                        Set set10 = cVar.m;
                        Map map31 = cVar.l;
                        Map map32 = cVar.k;
                        e8 e8Var11 = cVar.j;
                        qgg.h0(obj2);
                        xVar = xVar11;
                        e8Var5 = e8Var11;
                        c0Var = c0Var10;
                        aVar = aVar10;
                        str = str17;
                        num = null;
                        com.yandex.plus.plaquesdk.plaque.api.models.w wVar2 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2;
                        num2 = ((z7) e8Var5).h;
                        if (num2 == null) {
                        }
                        return new com.yandex.plus.plaquesdk.plaque.api.models.v(str, c0Var, aVar, xVar, wVar2, num2 == null ? new com.yandex.plus.core.android.extensions.f(num2) : num);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        cVar = new com.yandex.plus.home.plaque.repository.rest.c(hVar2, cg6Var);
        Object obj22 = cVar.z;
        nm6 nm6Var2 = nm6.a;
        switch (cVar.B) {
        }
    }

    @Override // defpackage.i6s
    public void j(Drawable drawable) {
        com.yandex.plus.core.imageloader.a aVar = (com.yandex.plus.core.imageloader.a) this.b;
        com.yandex.plus.coil.b bVar = (com.yandex.plus.coil.b) this.c;
        aVar.b(drawable);
        bVar.c.remove(aVar);
    }

    public Object k(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Map map, cg6 cg6Var) {
        Object obj = linkedHashMap.get(str);
        if (obj != null) {
            return h((e8) obj, linkedHashMap, linkedHashMap2, q5b.a, map, cg6Var);
        }
        StringBuilder u = ouj.u("Can't find root widget with id=", str, ", widgetsMapKeys=");
        u.append(linkedHashMap.keySet());
        throw new IllegalStateException(u.toString().toString());
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public com.yandex.plus.home.graphql.panel.mappers.shortcut.b l(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public void m(String str, com.yandex.plus.bdui.shared.b bVar) {
        com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.e;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "PlusDivContentController.HandlerInvoker", "dispatchOnErrorAction(); ".concat(str));
        }
        com.yandex.plus.bdui.action.a a = ((com.yandex.plus.bdui.plus.checkout.o) this.c).a(new IllegalStateException("PlusDivContent: ".concat(str)));
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar2)) {
            bVar2.c(aVar2, "PlusDivContentController.HandlerInvoker", "dispatchOnErrorAction(); dispatch onErrorAction = " + a);
        }
        ((com.yandex.plus.bdui.m) this.b).a.a(a, new com.yandex.plus.bdui.action.h(bVar), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0131 A[Catch: IllegalArgumentException -> 0x0351, TRY_LEAVE, TryCatch #6 {IllegalArgumentException -> 0x0351, blocks: (B:22:0x0118, B:24:0x0131, B:89:0x0353, B:90:0x0358), top: B:21:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0353 A[Catch: IllegalArgumentException -> 0x0351, TRY_ENTER, TryCatch #6 {IllegalArgumentException -> 0x0351, blocks: (B:22:0x0118, B:24:0x0131, B:89:0x0353, B:90:0x0358), top: B:21:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(lah lahVar, oah oahVar, cg6 cg6Var) {
        com.yandex.plus.bdui.flex.factory.f fVar;
        Object obj;
        int i;
        com.yandex.passport.sloth.ui.dependencies.m mVar;
        oah oahVar2;
        com.yandex.passport.sloth.ui.dependencies.m mVar2;
        Object w;
        lah lahVar2;
        Object obj2;
        oah oahVar3;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.log.api.a aVar;
        String str;
        Map map;
        com.yandex.plus.log.api.b bVar2;
        com.yandex.plus.log.api.a aVar2;
        Class<d0o> cls;
        lah lahVar3 = lahVar;
        Class<d0o> cls2 = d0o.class;
        if (cg6Var instanceof com.yandex.plus.bdui.flex.factory.f) {
            fVar = (com.yandex.plus.bdui.flex.factory.f) cg6Var;
            int i2 = fVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.p = i2 - Integer.MIN_VALUE;
                Object obj3 = fVar.n;
                obj = nm6.a;
                i = fVar.p;
                if (i != 0) {
                    qgg.h0(obj3);
                    com.yandex.plus.log.api.b bVar3 = (com.yandex.plus.log.api.b) this.d;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar3.b(aVar3)) {
                        bVar3.c(aVar3, "BasicMapiClientCopyWithLogging", "executeRequest() started");
                    }
                    com.yandex.passport.sloth.ui.dependencies.m mVar3 = new com.yandex.passport.sloth.ui.dependencies.m(lahVar3);
                    try {
                        com.yandex.passport.data.network.l lVar = (com.yandex.passport.data.network.l) this.b;
                        fVar.j = lahVar3;
                        oahVar2 = oahVar;
                        fVar.k = oahVar2;
                        fVar.l = mVar3;
                        fVar.p = 1;
                        Object invoke = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.o) lVar.a).invoke();
                        if (invoke != obj) {
                            mVar2 = mVar3;
                            obj3 = invoke;
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        mVar = mVar3;
                        kah kahVar = new kah("Failed to get data for request.", th, mVar.d(), xye.a);
                        bVar = (com.yandex.plus.log.api.b) this.d;
                        aVar = com.yandex.plus.log.api.a.e;
                        if (!bVar.b(aVar)) {
                        }
                    }
                } else if (i == 1) {
                    mVar2 = fVar.l;
                    oah oahVar4 = fVar.k;
                    lah lahVar4 = fVar.j;
                    try {
                        qgg.h0(obj3);
                        oahVar2 = oahVar4;
                        lahVar3 = lahVar4;
                    } catch (Throwable th2) {
                        th = th2;
                        mVar = mVar2;
                        kah kahVar2 = new kah("Failed to get data for request.", th, mVar.d(), xye.a);
                        bVar = (com.yandex.plus.log.api.b) this.d;
                        aVar = com.yandex.plus.log.api.a.e;
                        if (!bVar.b(aVar)) {
                        }
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = fVar.m;
                    mVar = fVar.l;
                    oahVar3 = fVar.k;
                    lahVar2 = fVar.j;
                    try {
                        qgg.h0(obj3);
                        str = (String) obj2;
                        map = (Map) obj3;
                        bVar2 = (com.yandex.plus.log.api.b) this.d;
                        aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar2.b(aVar2)) {
                            cls = cls2;
                        } else {
                            StringBuilder u = ouj.u("url = ", str, ", headers = ");
                            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                linkedHashMap.put(entry.getKey(), (String) com.yandex.plus.bdui.p.a.invoke((String) entry.getKey(), (String) entry.getValue()));
                                it = it;
                                cls2 = cls2;
                            }
                            cls = cls2;
                            u.append(linkedHashMap);
                            bVar2.c(aVar2, "BasicMapiClientCopyWithLogging", u.toString());
                        }
                        try {
                            b0o b0oVar = new b0o();
                            b0oVar.a = s(str, lahVar2);
                            b0oVar.c = r(map, lahVar2).m();
                            if (lahVar2 instanceof lah) {
                                throw new x7j();
                            }
                            Pattern pattern = twh.e;
                            b0oVar.e(ServiceCommand.TYPE_POST, ybl.b(lahVar2.d, q5g.C("application/json;charset=UTF-8")));
                            d0o b = b0oVar.b();
                            mVar.c = b.a.i;
                            b0o b2 = b.b();
                            ArrayList arrayList = new ArrayList(20);
                            Iterator it2 = b.c.iterator();
                            while (true) {
                                c7 c7Var = (c7) it2;
                                if (!c7Var.hasNext()) {
                                    break;
                                }
                                Pair pair = (Pair) c7Var.next();
                                String str2 = (String) pair.a;
                                String str3 = (String) com.yandex.plus.bdui.p.a.invoke(str2, (String) pair.b);
                                str2.getClass();
                                qwp.D(str2);
                                qwp.G(str3, str2);
                                arrayList.add(str2);
                                arrayList.add(StringsKt.t0(str3).toString());
                            }
                            b2.c = new zvd((String[]) arrayList.toArray(new String[0])).m();
                            d0o b3 = b2.b();
                            com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) this.d;
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                            if (bVar4.b(aVar4)) {
                                bVar4.c(aVar4, "BasicMapiClientCopyWithLogging", "Execute MAPI request " + b3);
                            }
                            OkHttpClient okHttpClient = (OkHttpClient) this.e;
                            okHttpClient.getClass();
                            try {
                                l3o execute = new mkn(okHttpClient, b, false).execute();
                                com.yandex.plus.log.api.b bVar5 = (com.yandex.plus.log.api.b) this.d;
                                if (bVar5.b(aVar4)) {
                                    bVar5.c(aVar4, "BasicMapiClientCopyWithLogging", "Execute MAPI request succeeded; response = " + execute);
                                }
                                com.yandex.plus.log.api.b bVar6 = (com.yandex.plus.log.api.b) this.d;
                                int i3 = execute.d;
                                mVar.d = Integer.valueOf(i3);
                                String str4 = execute.c;
                                mVar.e = str4;
                                zvd zvdVar = execute.f;
                                mVar.f = zvdVar.a("x-market-req-id");
                                long j = execute.k;
                                mVar.g = Long.valueOf(j);
                                long j2 = execute.l;
                                mVar.h = Long.valueOf(j2);
                                mVar.i = Long.valueOf(j2 - j);
                                if (!execute.b()) {
                                    kah kahVar3 = new kah("Request " + t(mVar) + " failed with code " + i3 + " and message " + str4, null, mVar.d(), xye.a);
                                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                                    if (!bVar6.b(aVar5)) {
                                        throw kahVar3;
                                    }
                                    bVar6.a(aVar5, "BasicMapiClientCopyWithLogging", hrg.o("MAPI request failed with code ", i3, '!'), kahVar3);
                                    throw kahVar3;
                                }
                                o3o o3oVar = execute.g;
                                if (o3oVar == null) {
                                    kah kahVar4 = new kah("Empty response for ".concat(t(mVar)), null, mVar.d(), xye.b);
                                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.e;
                                    if (!bVar6.b(aVar6)) {
                                        throw kahVar4;
                                    }
                                    bVar6.a(aVar6, "BasicMapiClientCopyWithLogging", "MAPI response body is empty!", kahVar4);
                                    throw kahVar4;
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                try {
                                    InputStream E0 = o3oVar.z().E0();
                                    try {
                                        Object n = oahVar3.n(uah.n(zvdVar), E0);
                                        E0.close();
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        mVar.j = Long.valueOf(currentTimeMillis2 - currentTimeMillis);
                                        Long l = (Long) mVar.g;
                                        if (l != null) {
                                            mVar.k = Long.valueOf(currentTimeMillis2 - l.longValue());
                                        }
                                        nah nahVar = new nah(n, mVar.d());
                                        com.yandex.plus.log.api.b bVar7 = (com.yandex.plus.log.api.b) this.d;
                                        com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                                        if (bVar7.b(aVar7)) {
                                            bVar7.c(aVar7, "BasicMapiClientCopyWithLogging", "executeRequest() finished");
                                        }
                                        return nahVar;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IllegalArgumentException e) {
                            kah kahVar5 = new kah("Failed to create " + ern.a(cls).f() + " for " + t(mVar), e, mVar.d(), xye.a);
                            com.yandex.plus.log.api.b bVar8 = (com.yandex.plus.log.api.b) this.d;
                            com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.e;
                            if (!bVar8.b(aVar8)) {
                                throw kahVar5;
                            }
                            bVar8.a(aVar8, "BasicMapiClientCopyWithLogging", "Build MAPI request failed!", kahVar5);
                            throw kahVar5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        kah kahVar22 = new kah("Failed to get data for request.", th, mVar.d(), xye.a);
                        bVar = (com.yandex.plus.log.api.b) this.d;
                        aVar = com.yandex.plus.log.api.a.e;
                        if (!bVar.b(aVar)) {
                            throw kahVar22;
                        }
                        bVar.a(aVar, "BasicMapiClientCopyWithLogging", "Get MAPI host or get MAPI headers failed!", kahVar22);
                        throw kahVar22;
                    }
                }
                fVar.j = lahVar3;
                fVar.k = oahVar2;
                fVar.l = mVar2;
                fVar.m = obj3;
                fVar.p = 2;
                w = w(fVar);
                if (w != obj) {
                    lahVar2 = lahVar3;
                    obj2 = obj3;
                    obj3 = w;
                    mVar = mVar2;
                    oahVar3 = oahVar2;
                    str = (String) obj2;
                    map = (Map) obj3;
                    bVar2 = (com.yandex.plus.log.api.b) this.d;
                    aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar2)) {
                    }
                    b0o b0oVar2 = new b0o();
                    b0oVar2.a = s(str, lahVar2);
                    b0oVar2.c = r(map, lahVar2).m();
                    if (lahVar2 instanceof lah) {
                    }
                }
                return obj;
            }
        }
        fVar = new com.yandex.plus.bdui.flex.factory.f(this, cg6Var);
        Object obj32 = fVar.n;
        obj = nm6.a;
        i = fVar.p;
        if (i != 0) {
        }
        fVar.j = lahVar3;
        fVar.k = oahVar2;
        fVar.l = mVar2;
        fVar.m = obj32;
        fVar.p = 2;
        w = w(fVar);
        if (w != obj) {
        }
        return obj;
    }

    public LinkedHashMap o(c5 c5Var, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c5Var != null && (c5Var instanceof k3)) {
            String uri = ((k3) c5Var).c.toString();
            uri.getClass();
            linkedHashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e8 e8Var = (e8) it.next();
            if (e8Var instanceof n3) {
                String uri2 = ((n3) e8Var).e.toString();
                uri2.getClass();
                linkedHashSet.add(uri2);
            }
        }
        int a = tah.a(v75.o(linkedHashSet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(obj, x97.p((mm6) this.d, (kotlinx.coroutines.a) this.e, null, new com.yandex.plus.home.api.prefetch.j(this, (String) obj, (Continuation) null, 20), 2));
        }
        return linkedHashMap;
    }

    @Override // com.yandex.passport.internal.core.accounts.g
    public void onSuccess() {
        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
        com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) this.c;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "removeAndRecreateAccount: remove uid=" + fVar + ": success", 8);
        }
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.i6s
    public void p(Drawable drawable) {
        com.yandex.plus.core.imageloader.a aVar = (com.yandex.plus.core.imageloader.a) this.d;
        com.yandex.plus.coil.b bVar = (com.yandex.plus.coil.b) this.c;
        aVar.b(drawable);
        bVar.c.remove(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(String str, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internalapi.bridge.a) {
            aVar = (com.yandex.plus.home.feature.webviews.internalapi.bridge.a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kotlinx.coroutines.a aVar2 = (kotlinx.coroutines.a) this.b;
                    com.yandex.plus.experiments.impl.cache.b bVar = new com.yandex.plus.experiments.impl.cache.b(this, str, null, 6);
                    aVar.l = 1;
                    obj = x97.V(aVar2, bVar, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        aVar = new com.yandex.plus.home.feature.webviews.internalapi.bridge.a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    @Override // com.yandex.plus.webview.api.javascript.b
    public void v(Object obj) {
        tf6 tf6Var = (tf6) this.d;
        if (tf6Var == null) {
            xq0.q("Coroutine scope needs to be initialized");
            return;
        }
        com.yandex.passport.sloth.ui.c cVar = (com.yandex.passport.sloth.ui.c) this.e;
        if (cVar == null) {
            xq0.q("JSEvaluator needs to be initialized");
        } else {
            x97.y(tf6Var, null, null, new com.yandex.plus.home.api.prefetch.j(this, obj, cVar, null, 27), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:10:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(cg6 cg6Var) {
        com.yandex.plus.bdui.flex.factory.g gVar;
        int i;
        Map linkedHashMap;
        Iterator it;
        List list = (List) this.c;
        if (cg6Var instanceof com.yandex.plus.bdui.flex.factory.g) {
            gVar = (com.yandex.plus.bdui.flex.factory.g) cg6Var;
            int i2 = gVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.q = i2 - Integer.MIN_VALUE;
                Object obj = gVar.o;
                nm6 nm6Var = nm6.a;
                i = gVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        return e5bVar;
                    }
                    linkedHashMap = new LinkedHashMap();
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h hVar = gVar.n;
                    linkedHashMap = gVar.m;
                    Map map = gVar.l;
                    it = gVar.k;
                    Map map2 = gVar.j;
                    qgg.h0(obj);
                    Map map3 = (Map) obj;
                    hVar.getClass();
                    if (!map3.isEmpty()) {
                        linkedHashMap.putAll(map3);
                    }
                    linkedHashMap = map2;
                    if (it.hasNext()) {
                        com.yandex.plus.bdui.flex.factory.j jVar = (com.yandex.plus.bdui.flex.factory.j) it.next();
                        Map map4 = linkedHashMap;
                        gVar.j = map4;
                        gVar.k = it;
                        gVar.l = map4;
                        gVar.m = map4;
                        gVar.n = this;
                        gVar.q = 1;
                        obj = jVar.a.invoke();
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        hVar = this;
                        map2 = linkedHashMap;
                        Map map32 = (Map) obj;
                        hVar.getClass();
                        if (!map32.isEmpty()) {
                        }
                        linkedHashMap = map2;
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                    }
                }
            }
        }
        gVar = new com.yandex.plus.bdui.flex.factory.g(this, cg6Var);
        Object obj2 = gVar.o;
        nm6 nm6Var2 = nm6.a;
        i = gVar.q;
        if (i != 0) {
        }
    }

    public Object x(s9f s9fVar) {
        s9fVar.getClass();
        if (this.d == com.yandex.plus.home.common.utils.n.a) {
            nyf nyfVar = (nyf) ((Function0) this.b).invoke();
            an5 an5Var = new an5(7, this, nyfVar);
            nyfVar.a(an5Var);
            this.e = an5Var;
            this.d = ((Function1) this.c).invoke(s9fVar);
        }
        return this.d;
    }

    public com.yandex.plus.home.graphql.panel.mappers.shortcut.c y(Map map, Map map2) {
        String str;
        List list = (List) map.get("dailyOptionalDescription");
        hb hbVar = list != null ? (hb) CollectionsKt.firstOrNull(list) : null;
        List list2 = (List) map2.get("dailyOptionalDescription");
        b6 b6Var = list2 != null ? (b6) CollectionsKt.firstOrNull(list2) : null;
        if (hbVar == null || (str = hbVar.a) == null) {
            return null;
        }
        if (StringsKt.U(str)) {
            str = null;
        }
        if (str != null) {
            return new com.yandex.plus.home.graphql.panel.mappers.shortcut.c(str, ((com.yandex.passport.data.network.l) this.b).F(hbVar, b6Var), E(hbVar), C(hbVar, b6Var));
        }
        return null;
    }

    @Override // defpackage.zfv
    public void z() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                ((SslErrorHandler) obj).proceed();
                break;
            case 5:
                ((SslErrorHandler) obj).proceed();
                break;
            default:
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                String str = ((com.yandex.plus.core.network.ssl.a) obj).a + ".resolveSslError() error=" + ((SslError) this.c) + " proceeded";
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
                ((SslErrorHandler) this.d).proceed();
                break;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public h(cdk cdkVar, gdk gdkVar, com.yandex.plus.pay.reporter.api.f fVar) {
        this.a = 20;
        cdkVar.getClass();
        gdkVar.getClass();
        fVar.getClass();
        this.b = cdkVar;
        this.c = gdkVar;
        this.d = fVar;
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.a
            public final /* synthetic */ com.yandex.passport.internal.core.accounts.h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new b(0, this.b);
                    default:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) this.b.c);
                }
            }
        });
        final int i2 = 1;
        btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.a
            public final /* synthetic */ com.yandex.passport.internal.core.accounts.h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new b(0, this.b);
                    default:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.a((gdk) this.b.c);
                }
            }
        });
    }

    public h(Context context, com.yandex.plus.log.api.b bVar, kotlinx.coroutines.a aVar) {
        this.a = 18;
        bVar.getClass();
        aVar.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = context.getSharedPreferences("rest_plaque_data_source", 0);
        this.e = quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(9));
    }

    public h(com.yandex.passport.sloth.ui.c cVar, Context context, String str) {
        this.a = 11;
        this.b = context;
        this.c = str;
        this.d = btf.b(new com.yandex.plus.bdui.plus.checkout.h(12, cVar));
        this.e = context.getCacheDir();
    }

    public h(com.yandex.passport.internal.entities.k kVar, ArrayList arrayList, ArrayList arrayList2, com.yandex.passport.internal.d dVar) {
        this.a = 1;
        kVar.getClass();
        dVar.getClass();
        this.b = kVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = dVar;
    }

    public h(com.yandex.plus.home.feature.webviews.internalapi.bridge.c cVar, kotlinx.coroutines.a aVar) {
        this.a = 21;
        aVar.getClass();
        this.b = cVar;
        this.c = aVar;
    }

    public h(com.yandex.plus.pay.a aVar, com.yandex.plus.pay.ui.core.a aVar2, kotlinx.coroutines.a aVar3) {
        this.a = 6;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = btf.b(new com.yandex.passport.internal.ui.sloth.authsdk.h0(24, this));
    }

    public h(Context context, a1 a1Var, n20 n20Var, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.core.dispatcher.b bVar2) {
        this.a = 14;
        context.getClass();
        bVar2.getClass();
        this.b = context;
        this.c = n20Var;
        this.d = bVar;
        this.e = bVar2;
    }

    public h(kotlinx.coroutines.a aVar) {
        this.a = 15;
        aVar.getClass();
        this.b = aVar;
        this.c = quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(1));
        this.d = new com.yandex.plus.home.feature.webviews.internal.bridge.f(r6.Companion.serializer());
        this.e = new com.yandex.plus.home.feature.webviews.internal.bridge.f(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1.Companion.serializer());
    }

    public h(com.yandex.passport.data.network.l lVar, com.yandex.plus.bdui.plus.content.controller.f fVar, a1 a1Var, a1 a1Var2, com.yandex.plus.bdui.plus.content.controller.f fVar2, com.yandex.plus.home.analytics.diagnostic.panel.a aVar) {
        this.a = 16;
        aVar.getClass();
        this.b = lVar;
        this.c = fVar;
        this.d = fVar2;
        this.e = aVar;
    }

    public h(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.plus.checkout.o oVar, LinkedHashMap linkedHashMap, com.yandex.plus.log.api.b bVar) {
        this.a = 9;
        mVar.getClass();
        bVar.getClass();
        this.b = mVar;
        this.c = oVar;
        this.d = linkedHashMap;
        this.e = bVar;
    }

    public h(com.yandex.passport.data.network.l lVar, List list, com.yandex.passport.sloth.ui.c cVar, com.yandex.plus.log.api.b bVar) {
        this.a = 7;
        com.yandex.plus.bdui.p pVar = com.yandex.plus.bdui.p.a;
        list.getClass();
        bVar.getClass();
        this.b = lVar;
        this.c = list;
        this.d = bVar;
        new ArrayList();
        this.e = (OkHttpClient) ((com.yandex.plus.bdui.plus.checkout.h) cVar.b).b;
    }

    public h(com.yandex.plus.bdui.flex.ui.s sVar, com.yandex.plus.core.imageloader.b bVar, mm6 mm6Var, kotlinx.coroutines.a aVar) {
        this.a = 19;
        mm6Var.getClass();
        aVar.getClass();
        this.b = sVar;
        this.c = bVar;
        this.d = mm6Var;
        this.e = aVar;
    }

    public h(Function0 function0, Function1 function1) {
        this.a = 13;
        this.b = function0;
        this.c = function1;
        this.d = com.yandex.plus.home.common.utils.n.a;
    }

    public h(Function1 function1, Function1 function12, String str) {
        this.a = 2;
        this.b = function1;
        this.c = function12;
        this.d = str;
    }
}
