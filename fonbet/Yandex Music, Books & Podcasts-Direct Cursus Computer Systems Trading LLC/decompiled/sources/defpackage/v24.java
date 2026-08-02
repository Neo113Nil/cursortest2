package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.x1;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.account.d;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.core.analytics.logging.a;
import com.yandex.plus.core.analytics.logging.b;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.home.api.prefetch.c;
import com.yandex.plus.home.api.prefetch.l;
import com.yandex.plus.home.datasource.openapi.models.e8;
import com.yandex.plus.home.datasource.openapi.models.j5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import com.yandex.plus.home.plaque.repository.rest.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class v24 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v24(Continuation continuation, cur curVar, zvs zvsVar, nss nssVar, nss nssVar2) {
        super(2, continuation);
        this.j = 15;
        this.n = curVar;
        this.l = zvsVar;
        this.k = nssVar;
        this.m = nssVar2;
    }

    private final Object k(Object obj) {
        r2f r2fVar = (r2f) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        o3o o3oVar = (o3o) this.n;
        if (o3oVar != null) {
            String str = (String) this.l;
            l lVar = (l) this.m;
            b bVar = b.a;
            String g = f1d.g("Loading from getResource() finished earlier than from loadPrefetch() for url = ", str);
            jyr jyrVar = e.a;
            e.e(a.d, bVar, g, null);
            if (r2fVar != null) {
                r2fVar.g(null);
            }
            lVar.getClass();
            com.yandex.plus.home.api.prefetch.e a = l.a(lVar, o3oVar, l.d(str));
            c cVar = a instanceof c ? (c) a : null;
            if (cVar != null) {
                return cVar.a;
            }
        }
        return null;
    }

    private final Object l(Object obj) {
        Object t7oVar;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        com.yandex.plus.home.plaque.plugin.internal.defaults.c cVar = (com.yandex.plus.home.plaque.plugin.internal.defaults.c) this.n;
        com.yandex.plus.home.plaque.repository.graphql.cache.a aVar = (com.yandex.plus.home.plaque.repository.graphql.cache.a) this.l;
        w1 w1Var = (w1) this.m;
        try {
            r7o r7oVar = z7o.b;
            SharedPreferences sharedPreferences = cVar.c;
            sharedPreferences.getClass();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(com.yandex.plus.home.plaque.plugin.internal.defaults.c.a(cVar, aVar), cVar.d.c(w1.Companion.serializer(), w1Var));
            edit.commit();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.log.api.b bVar = cVar.a;
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.a(aVar2, "DefaultPrefsGraphQlPlaqueDataSource", "saveFallbackModel(dao=" + w1Var + ')', a);
            }
        }
        return new z7o(t7oVar);
    }

    private final Object n(Object obj) {
        Object t7oVar;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        h hVar = (h) this.n;
        com.yandex.plus.home.plaque.repository.rest.a aVar = (com.yandex.plus.home.plaque.repository.rest.a) this.l;
        ArrayList arrayList = (ArrayList) this.m;
        try {
            r7o r7oVar = z7o.b;
            SharedPreferences sharedPreferences = (SharedPreferences) hVar.d;
            sharedPreferences.getClass();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String concat = h.H(aVar).concat("_widgets");
            i5f i5fVar = (i5f) hVar.e;
            i5fVar.getClass();
            edit.putString(concat, i5fVar.c(new qy0(e8.Companion.serializer(), 0), arrayList));
            edit.commit();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) hVar.b;
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.a(aVar2, "DefaultPrefsRestPlaqueDataSource", "putWidgets(key=" + h.H(aVar) + ", model=" + arrayList + ')', a);
            }
        }
        return new z7o(t7oVar);
    }

    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, nss] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                v24 v24Var = new v24((m54) this.n, (Function1) this.l, (aqi) this.m, continuation, 0);
                v24Var.k = obj;
                return v24Var;
            case 1:
                v24 v24Var2 = new v24((l54) this.n, (Function1) this.l, (aqi) this.m, continuation, 1);
                v24Var2.k = obj;
                return v24Var2;
            case 2:
                v24 v24Var3 = new v24((pfm) this.n, (has) this.l, (qbs) this.m, continuation, 2);
                v24Var3.k = obj;
                return v24Var3;
            case 3:
                return new v24(continuation, (gc8) this.k, (rv8) this.n, (j23) this.l, (rv8) this.m, 3);
            case 4:
                v24 v24Var4 = new v24((zwa) this.n, (e2o) this.l, (mm6) this.m, continuation, 4);
                v24Var4.k = obj;
                return v24Var4;
            case 5:
                return new v24(this.k, (aqi) this.m, (aqi) this.n, this.l, continuation, 5);
            case 6:
                return new v24(this.k, (aqi) this.m, (aqi) this.n, this.l, continuation, 6);
            case 7:
                return new v24(continuation, (klg) this.k, (Function2) this.n, (String) this.l, (String) this.m, 7);
            case 8:
                return new v24(continuation, (klg) this.k, (String) this.n, (String) this.l, (klg) this.m, 8);
            case 9:
                v24 v24Var5 = new v24((v3n) this.n, (w3n) this.l, (String) this.m, continuation, 9);
                v24Var5.k = obj;
                return v24Var5;
            case 10:
                v24 v24Var6 = new v24((v3n) this.n, (r3n) this.l, (String) this.m, continuation, 10);
                v24Var6.k = obj;
                return v24Var6;
            case 11:
                return new v24((ayg) this.k, (Context) this.n, (String) this.l, (String) this.m, continuation, 11);
            case 12:
                v24 v24Var7 = new v24((luu) this.n, (f4m) this.l, (f3q) this.m, continuation, 12);
                v24Var7.k = obj;
                return v24Var7;
            case 13:
                v24 v24Var8 = new v24((pjc) this.n, (w3q) this.l, (vdr) this.m, continuation, 13);
                v24Var8.k = obj;
                return v24Var8;
            case 14:
                return new v24(continuation, (cur) this.k, (ess) this.n, (nss) this.l, (bzf) this.m, 14);
            case 15:
                return new v24(continuation, (cur) this.n, (zvs) this.l, (nss) this.k, (nss) this.m);
            case 16:
                v24 v24Var9 = new v24((xqn) this.n, (xqn) this.l, (ixr) this.m, continuation, 16);
                v24Var9.k = obj;
                return v24Var9;
            case 17:
                return new v24((List) this.k, (i9u) this.n, (u5l) this.l, (wmn) this.m, continuation, 17);
            case 18:
                v24 v24Var10 = new v24((sbu) this.n, (aqi) this.m, (aqi) this.l, continuation);
                v24Var10.k = obj;
                return v24Var10;
            case 19:
                return new v24((com.yandex.passport.internal.ui.social.mail.c) this.k, (String) this.n, (String) this.l, (a0) this.m, continuation, 19);
            case 20:
                v24 v24Var11 = new v24((xpi) this.n, (WebView) this.l, (com.yandex.passport.sloth.ui.a) this.m, continuation, 20);
                v24Var11.k = obj;
                return v24Var11;
            case 21:
                v24 v24Var12 = new v24((o3o) this.n, (String) this.l, (l) this.m, continuation, 21);
                v24Var12.k = obj;
                return v24Var12;
            case 22:
                v24 v24Var13 = new v24((com.yandex.plus.home.plaque.plugin.internal.defaults.c) this.n, (com.yandex.plus.home.plaque.repository.graphql.cache.a) this.l, (w1) this.m, continuation, 22);
                v24Var13.k = obj;
                return v24Var13;
            case 23:
                v24 v24Var14 = new v24((h) this.n, (com.yandex.plus.home.plaque.repository.rest.a) this.l, (ArrayList) this.m, continuation, 23);
                v24Var14.k = obj;
                return v24Var14;
            default:
                v24 v24Var15 = new v24((o) this.n, (com.yandex.plus.home.plaque.repository.rest.a) this.l, (j5) this.m, continuation, 24);
                v24Var15.k = obj;
                return v24Var15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((v24) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x05e3, code lost:
    
        if (r6.b >= r0.b) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0822, code lost:
    
        if (r13 < 0) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object, qss] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ic8 histogramReporter;
        ic8 histogramReporter2;
        boolean z;
        long j;
        boolean contains;
        Long valueOf;
        Object obj2;
        boolean z2;
        boolean z3;
        t7o t7oVar;
        Object obj3;
        Throwable a;
        int i = 12;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                Function1 function1 = (Function1) this.l;
                whm whmVar = (whm) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (!((m54) this.n).b.a((p14) ((aqi) this.m).getValue())) {
                    return Unit.a;
                }
                int ordinal = whmVar.ordinal();
                if (ordinal == 0) {
                    function1.invoke(yur.b);
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    function1.invoke(yur.a);
                }
                return Unit.a;
            case 1:
                Function1 function12 = (Function1) this.l;
                d44 d44Var = (d44) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (!((l54) this.n).b.a((o14) ((aqi) this.m).getValue())) {
                    return Unit.a;
                }
                int ordinal2 = d44Var.ordinal();
                if (ordinal2 == 0) {
                    function12.invoke(xur.b);
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                    function12.invoke(xur.a);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.k;
                pm6 pm6Var = pm6.d;
                pfm pfmVar = (pfm) this.n;
                x97.y(mm6Var, null, pm6Var, new tl6(pfmVar, (has) this.l, continuation, 0), 1);
                x97.y(mm6Var, null, pm6Var, new vv4(pfmVar, (qbs) this.m, continuation, 28), 1);
                return Unit.a;
            case 3:
                j23 j23Var = (j23) this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                gc8 gc8Var = (gc8) this.k;
                rv8 rv8Var = (rv8) this.n;
                int i2 = gc8.D0;
                qv8 D = gc8Var.D(rv8Var);
                if (D == null) {
                    j23Var.getClass();
                } else {
                    histogramReporter = gc8Var.getHistogramReporter();
                    histogramReporter.getClass();
                    histogramReporter.h = Long.valueOf(vp4.a());
                    gc8Var.set_divData(rv8Var);
                    kln klnVar = gc8Var.E;
                    if (klnVar == null) {
                        klnVar = gc8.f(gc8Var, j23Var);
                        gc8Var.E = klnVar;
                    }
                    gc8Var.getDiv2Component$div_release().n().c(gc8Var.getDataTag(), D.b, false);
                    rv8 rv8Var2 = (rv8) this.m;
                    View childAt = gc8Var.getView().getChildAt(0);
                    childAt.getClass();
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    long j2 = D.b;
                    jc8 jc8Var = D.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j2);
                    dp8 d = jc8Var.d();
                    String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                    sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                    if (klnVar.b(rv8Var2, rv8Var, viewGroup, new pm9(c5b.a, 8, t75.c(sb.toString()), j2))) {
                        gc8Var.requestLayout();
                        histogramReporter2 = gc8Var.getHistogramReporter();
                        histogramReporter2.d();
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                e2o e2oVar = (e2o) this.l;
                pjc b0 = zsd.b0(szf.s0(new ita(1, e2oVar)));
                zwa zwaVar = (zwa) this.n;
                ox6.B(b0, mm6Var2, new u58(14, zwaVar));
                ox6.B(zwaVar.L(), mm6Var2, new t58(7, (mm6) this.m, e2oVar));
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (!((ayn) this.k).g()) {
                    sj2.k((aqi) this.m, (aqi) this.n, (sub) this.l);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                a7g a7gVar = (a7g) this.k;
                boolean booleanValue = ((Boolean) ((aqi) this.m).getValue()).booleanValue();
                float floatValue = ((Number) ((aqi) this.n).getValue()).floatValue();
                long longValue = ((Number) ((aqi) this.l).getValue()).longValue();
                t6k t6kVar = a7gVar.d;
                v6k v6kVar = a7gVar.e;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (a7gVar.j) {
                    j = uptimeMillis - v6kVar.h();
                    break;
                }
                j = 0;
                t6kVar.h(yhn.c(t6kVar.e() + (longValue > 0 ? (j * a7gVar.k) / longValue : 0.0f), 0.0f, 1.0f));
                v6kVar.i(uptimeMillis);
                a7gVar.j = booleanValue;
                a7gVar.k = floatValue;
                a7gVar.g = uptimeMillis;
                a7gVar.h = booleanValue;
                a7gVar.i = floatValue;
                return Unit.a;
            case 7:
                String str = (String) this.m;
                String str2 = (String) this.l;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                try {
                    klg klgVar = (klg) this.k;
                    cvl i3 = klgVar.c.i(str2, str);
                    if (i3 == null) {
                        return null;
                    }
                    klgVar.b.getClass();
                    ArrayList a2 = cus.a(i3);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Boolean) ((Function2) this.n).invoke(i3, (mqs) next)).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new t2m(((mqs) it2.next()).d(), null));
                    }
                    rrl rrlVar = new rrl(i3, arrayList2, arrayList);
                    if (!ivf.I(i3)) {
                        if (arrayList2.isEmpty()) {
                            return null;
                        }
                    }
                    return rrlVar;
                } catch (IllegalStateException e) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist uid ", str2, ", kind ", str), e));
                    return null;
                }
            case 8:
                String str3 = (String) this.l;
                String str4 = (String) this.n;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                try {
                    klg klgVar2 = (klg) this.k;
                    cvl i4 = klgVar2.c.i(str4, str3);
                    if (i4 == null) {
                        return null;
                    }
                    klgVar2.b.getClass();
                    ArrayList a3 = cus.a(i4);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = a3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        mqs mqsVar = (mqs) next2;
                        if (((Boolean) ((klg) this.m).g.invoke(i4, mqsVar)).booleanValue()) {
                            if (mqsVar == null) {
                                Assertions.throwOrSkip$default(new FailedAssertionException("PermanentCachedTrackPredicate: track is null"), null, 2, null);
                                contains = false;
                            } else {
                                l18 l18Var = l18.b;
                                bdt I = hag.I(uaa.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                            }
                            if (contains) {
                                arrayList3.add(next2);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new t2m(((mqs) it4.next()).d(), null));
                    }
                    rrl rrlVar2 = new rrl(i4, arrayList4, arrayList3);
                    if (!ivf.I(i4)) {
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                    }
                    return rrlVar2;
                } catch (IllegalStateException e2) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist uid ", str4, ", kind ", str3), e2));
                    return null;
                }
            case 9:
                lpi lpiVar = (lpi) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                v3n v3nVar = (v3n) this.n;
                q3n a4 = v3n.a(v3nVar, lpiVar);
                if (a4 == null) {
                    String e3 = eta.e();
                    r3n r3nVar = r3n.f;
                    a4 = new q3n(e3, r3nVar, null, null);
                    v3nVar.d(e3, r3nVar, null, null);
                }
                w3n w3nVar = a4.c;
                float f = w3nVar != null ? w3nVar.b : 0.0f;
                w3n w3nVar2 = (w3n) this.l;
                if (w3nVar2.b > f) {
                    a4.c = w3nVar2;
                    a4.d = (String) this.m;
                    v3n.b(v3nVar, lpiVar, a4);
                }
                return Unit.a;
            case 10:
                r3n r3nVar2 = (r3n) this.l;
                boolean z4 = r3nVar2.d;
                lpi lpiVar2 = (lpi) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                v3n v3nVar2 = (v3n) this.n;
                q3n a5 = v3n.a(v3nVar2, lpiVar2);
                if (a5 != null) {
                    r3n r3nVar3 = a5.b;
                    if (!r3nVar3.c) {
                        break;
                    }
                }
                String e4 = eta.e();
                r3n r3nVar4 = r3n.f;
                a5 = new q3n(e4, r3nVar4, null, null);
                v3nVar2.d(e4, r3nVar4, null, null);
                String str5 = (String) this.m;
                if (z4) {
                    w3n w3nVar3 = a5.c;
                    int i5 = w3nVar3 == null ? -1 : t3n.a[w3nVar3.ordinal()];
                    if (i5 == 1) {
                        r3nVar2 = r3n.m;
                    } else if (i5 != 2) {
                        r3nVar2 = i5 != 3 ? r3n.l : r3n.o;
                    } else {
                        r3nVar2 = r3n.n;
                        str5 = a5.d;
                    }
                }
                if (z4) {
                    a5.c = null;
                    a5.d = null;
                }
                v3nVar2.d(a5.a, r3nVar2, a5.b, str5);
                a5.b = r3nVar2;
                v3n.b(v3nVar2, lpiVar2, a5);
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                for (lpc lpcVar : ((ayg) this.k).f.values()) {
                    Context context = (Context) this.n;
                    lpcVar.getClass();
                    String str6 = lpcVar.a;
                    String str7 = (String) this.l;
                    String str8 = (String) this.m;
                    String str9 = lpcVar.c;
                    try {
                        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), ouj.o(str7, str6, str8));
                        try {
                            createFromAsset.getClass();
                            str9.getClass();
                            boolean M = StringsKt.M(str9, "Italic", false);
                            boolean M2 = StringsKt.M(str9, "Bold", false);
                            int i6 = (M && M2) ? 3 : M ? 2 : M2 ? 1 : 0;
                            if (createFromAsset.getStyle() != i6) {
                                createFromAsset = Typeface.create(createFromAsset, i6);
                            }
                            lpcVar.d = createFromAsset;
                        } catch (Exception unused) {
                            psg.a.getClass();
                        }
                    } catch (Exception unused2) {
                        psg.a.getClass();
                    }
                }
                return Unit.a;
            case 12:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                f3q f3qVar = (f3q) this.m;
                x97.y(mm6Var3, null, null, new z2q(f3qVar, continuation, 0), 3);
                ((ysu) ((luu) this.n).b.getValue()).c.K0();
                f4m f4mVar = (f4m) this.l;
                tf6 tf6Var = f3qVar.b;
                tf6Var.getClass();
                Iterator it5 = ((List) f4mVar.b).iterator();
                while (it5.hasNext()) {
                    ((f4q) ((arf) it5.next()).getValue()).a(tf6Var);
                }
                return Unit.a;
            case 13:
                ltm ltmVar = (ltm) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                AtomicReference atomicReference = new AtomicReference(null);
                x97.y(ltmVar, null, null, new v5p((pjc) this.n, atomicReference, continuation, 11), 3);
                x97.y(ltmVar, null, null, new lco((w3q) this.l, (vdr) this.m, atomicReference, ltmVar, (Continuation) null, 9), 3);
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                q3t q3tVar = ((cur) this.k).a;
                ess essVar = (ess) this.n;
                nss nssVar = (nss) this.l;
                bzf bzfVar = (bzf) this.m;
                essVar.getClass();
                String a6 = q3tVar.n.a();
                a6.getClass();
                StringBuilder sb2 = new StringBuilder("updatePermanentFlag(");
                sb2.append(essVar);
                sb2.append(", ");
                sb2.append(nssVar);
                v3w.m(sb2, ")", 3, "TracksCacheRepositoryImpl", null);
                if (bzfVar instanceof pjs) {
                    valueOf = null;
                } else {
                    if (!(bzfVar instanceof qjs)) {
                        b6e.s();
                        return null;
                    }
                    valueOf = Long.valueOf(((qjs) bzfVar).b);
                }
                j3t j3tVar = q3tVar.a;
                css E = lsq.E(nssVar);
                E.getClass();
                StringBuilder sb3 = new StringBuilder("updatePermanent ");
                sb3.append(essVar);
                sb3.append(" with ");
                sb3.append(E);
                ssg.a(4, "TracksCacheDatabaseImpl", su4.o(sb3, ", for user ", a6), null);
                i3t a7 = j3tVar.a.a(a6);
                zvs zvsVar = essVar.a;
                o5n o5nVar = essVar.b;
                thr thrVar = essVar.c;
                a7.getClass();
                zvsVar.getClass();
                o5nVar.getClass();
                thrVar.getClass();
                up6.F(a7.a, false, true, new r90(E, valueOf, zvsVar, o5nVar, thrVar, 8));
                q3tVar.h(zvsVar.a, nssVar.a(), bzfVar);
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                q3t q3tVar2 = ((cur) this.n).a;
                zvs zvsVar2 = (zvs) this.l;
                ?? r3 = this.k;
                nss nssVar2 = (nss) this.m;
                String a8 = q3tVar2.n.a();
                a8.getClass();
                ssg.a(3, "TracksCacheRepositoryImpl", "updatePermanentFlag(" + zvsVar2 + ", " + ((Object) r3) + " -> " + nssVar2 + ")", null);
                j3t j3tVar2 = q3tVar2.a;
                css E2 = lsq.E((nss) r3);
                css E3 = lsq.E(nssVar2);
                E2.getClass();
                E3.getClass();
                ssg.a(4, "TracksCacheDatabaseImpl", "updatePermanent " + zvsVar2 + " from " + E2 + ", to: " + E3 + ", for user " + a8, null);
                i3t a9 = j3tVar2.a.a(a8);
                a9.getClass();
                up6.F(a9.a, false, true, new zzq(9, E3, zvsVar2, E2));
                if (r3.a() != nssVar2.a()) {
                    q3tVar2.h(zvsVar2.a, nssVar2.a(), pjs.b);
                }
                return Unit.a;
            case 16:
                mm6 mm6Var4 = (mm6) this.k;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                xqn xqnVar = (xqn) this.n;
                ixr ixrVar = (ixr) this.m;
                xqnVar.a = x97.p(mm6Var4, null, null, new glp(ixrVar, continuation, 20), 3);
                ((xqn) this.l).a = x97.p(mm6Var4, null, null, new fpq(ixrVar, continuation, i), 3);
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                List list = (List) this.k;
                boolean isEmpty = list.isEmpty();
                i9u i9uVar = (i9u) this.n;
                if (isEmpty) {
                    g0l.r((g0l) i9uVar.q.getValue(), "default", null, wmn.a, i9uVar.k, (u5l) this.l, hcr.a, null, 896);
                } else {
                    w5u w5uVar = i9uVar.o;
                    x1u x1uVar = (x1u) CollectionsKt.Q(list);
                    wmn wmnVar = (wmn) this.m;
                    u5l u5lVar = (u5l) this.l;
                    w5uVar.getClass();
                    x1uVar.getClass();
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(Context.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    Context context2 = (Context) qdcVar2.C(I2);
                    ea eaVar = ea.a;
                    bdt I3 = hag.I(qqs.class);
                    qdc qdcVar3 = l18Var2.a;
                    qdcVar3.getClass();
                    qqs qqsVar = (qqs) qdcVar3.C(I3);
                    List h = u75.h(new fp4(0, qqsVar.b), new fp4(1, qqsVar.a));
                    ArrayList arrayList5 = new ArrayList(v75.o(h, 10));
                    Iterator it6 = h.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(((fp4) it6.next()).a(x1uVar));
                    }
                    Iterator it7 = arrayList5.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj2 = it7.next();
                            if (!(((ia) obj2) instanceof ea)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ia iaVar = (ia) obj2;
                    if (iaVar == null) {
                        iaVar = eaVar;
                    }
                    if (iaVar.equals(eaVar)) {
                        g0l.r((g0l) i9uVar.q.getValue(), "other", list, wmnVar, i9uVar.k, u5lVar, new icr(0), null, 896);
                    } else {
                        ayk aykVar = new ayk(context2);
                        if (((gp4) aykVar.f.getValue()).a(x1uVar.i)) {
                            if (!((z66) aykVar.b.getValue()).a().a) {
                                hld.I(context2, (z66) aykVar.b.getValue());
                            }
                        } else if (frc.a.a()) {
                            t a10 = aykVar.a();
                            if (a10 != null) {
                                String str10 = x1uVar.a;
                                y supportFragmentManager = a10.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                str10.getClass();
                                xyb xybVar = new xyb();
                                xybVar.setArguments(cxb.K(new Pair("ARG_CLIP_ID", str10)));
                                x7f.B(xybVar, supportFragmentManager, "CLIP_EXPLICIT_WARNING");
                            } else {
                                ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
                                hag.x(context2, R.string.bottom_sheet_track_explicit_title, 0);
                            }
                        } else {
                            hag.x(context2, R.string.bottom_sheet_track_explicit_title, 0);
                        }
                    }
                }
                return Unit.a;
            case 18:
                qcu qcuVar = (qcu) this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                sbu sbuVar = (sbu) this.n;
                u7g u7gVar = qcuVar != null ? qcuVar.a : null;
                nyf nyfVar = sbuVar.b;
                x6k x6kVar = sbuVar.c;
                if (!Intrinsics.d(sbuVar.f, u7gVar)) {
                    sbuVar.f = u7gVar;
                    if (u7gVar == null) {
                        lbu lbuVar = lbu.a;
                        x6kVar.setValue(lbuVar);
                        x6kVar.setValue(lbuVar);
                        paw pawVar = sbuVar.e;
                        if (pawVar != null) {
                            rbu rbuVar = sbuVar.h;
                            if (rbuVar != null) {
                                pawVar.F(rbuVar);
                            }
                            an5 an5Var = sbuVar.g;
                            if (an5Var != null) {
                                nyfVar.d(an5Var);
                            }
                            pawVar.a();
                        }
                        sbuVar.h = null;
                        sbuVar.g = null;
                        sbuVar.e = null;
                        sbuVar.f = null;
                    } else {
                        x6kVar.setValue(nbu.a);
                        paw pawVar2 = sbuVar.e;
                        if (pawVar2 == null) {
                            pawVar2 = (paw) sbuVar.a.invoke();
                            pawVar2.t(0.0f);
                            sbuVar.e = pawVar2;
                        }
                        dcu dcuVar = dcu.One;
                        an5 an5Var2 = sbuVar.g;
                        if (an5Var2 != null) {
                            nyfVar.d(an5Var2);
                        }
                        an5 an5Var3 = new an5(4, u7gVar, pawVar2);
                        nyfVar.a(an5Var3);
                        sbuVar.g = an5Var3;
                        if (sbuVar.h == null) {
                            rbu rbuVar2 = new rbu(sbuVar);
                            pawVar2.I(rbuVar2);
                            sbuVar.h = rbuVar2;
                        }
                    }
                }
                aqi aqiVar = (aqi) this.m;
                if (qcuVar != null) {
                    z2 = true;
                    if (qcuVar.b) {
                        z3 = true;
                        aqiVar.setValue(Boolean.valueOf(z3));
                        ((aqi) this.l).setValue(Boolean.valueOf(qcuVar == null && qcuVar.c == z2));
                        return Unit.a;
                    }
                } else {
                    z2 = true;
                }
                z3 = false;
                aqiVar.setValue(Boolean.valueOf(z3));
                ((aqi) this.l).setValue(Boolean.valueOf(qcuVar == null && qcuVar.c == z2));
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.ui.social.mail.c cVar = (com.yandex.passport.internal.ui.social.mail.c) this.k;
                String str11 = (String) this.n;
                String str12 = (String) this.l;
                a0 a0Var = (a0) this.m;
                try {
                    r7o r7oVar = z7o.b;
                    d dVar = cVar.r;
                    com.yandex.passport.common.core.b bVar = cVar.q;
                    x1 d2 = a0Var.d();
                    com.yandex.passport.internal.analytics.a aVar = com.yandex.passport.internal.analytics.a.r;
                    dVar.getClass();
                    bVar.getClass();
                    aVar.getClass();
                    Object A = com.yandex.passport.internal.ui.a.A(new xg(dVar, bVar, str11, str12, d2, aVar, null, 25));
                    qgg.h0(A);
                    obj3 = (com.yandex.passport.internal.l) A;
                } catch (wis e5) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e5);
                    obj3 = t7oVar;
                    if (!(obj3 instanceof t7o)) {
                    }
                    a = z7o.a(obj3);
                    if (a != null) {
                    }
                    return Unit.a;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                    obj3 = t7oVar;
                    if (!(obj3 instanceof t7o)) {
                    }
                    a = z7o.a(obj3);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                if (!(obj3 instanceof t7o)) {
                    cVar.t.m((com.yandex.passport.internal.l) obj3);
                    cVar.l.m(Boolean.FALSE);
                }
                a = z7o.a(obj3);
                if (a != null) {
                    cVar.k.m(cVar.u.a(a));
                    cVar.l.m(Boolean.FALSE);
                }
                return Unit.a;
            case 20:
                mm6 mm6Var5 = (mm6) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                zsd.r0(mm6Var5, new ub7(i, (xpi) this.n, new l1p((WebView) this.l, (com.yandex.passport.sloth.ui.a) this.m, continuation, 23)));
                return Unit.a;
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                return n(obj);
            default:
                mm6 mm6Var6 = (mm6) this.k;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                o oVar = (o) this.n;
                com.yandex.plus.home.plaque.repository.rest.a aVar2 = (com.yandex.plus.home.plaque.repository.rest.a) this.l;
                j5 j5Var = (j5) this.m;
                Continuation continuation2 = null;
                x97.y(mm6Var6, null, null, new com.yandex.plus.home.plaque.repository.rest.h(oVar, aVar2, j5Var, continuation2, 0), 3);
                x97.y(mm6Var6, null, null, new com.yandex.plus.home.plaque.repository.rest.h(oVar, aVar2, j5Var, continuation2, 1), 3);
                return x97.y(mm6Var6, null, null, new com.yandex.plus.home.plaque.repository.rest.h(oVar, j5Var, aVar2, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v24(Object obj, aqi aqiVar, aqi aqiVar2, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.m = aqiVar;
        this.n = aqiVar2;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v24(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.n = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v24(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v24(sbu sbuVar, aqi aqiVar, aqi aqiVar2, Continuation continuation) {
        super(2, continuation);
        this.j = 18;
        this.n = sbuVar;
        this.m = aqiVar;
        this.l = aqiVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v24(Continuation continuation, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.n = obj2;
        this.l = obj3;
        this.m = obj4;
    }
}
