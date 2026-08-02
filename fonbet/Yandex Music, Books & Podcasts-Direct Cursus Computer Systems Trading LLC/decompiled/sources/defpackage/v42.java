package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.widget.Spinner;
import com.appsflyer.internal.k;
import com.yandex.passport.api.n;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.d0;
import com.yandex.passport.internal.ui.bouncer.model.f;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.middleware.t0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.x0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.z0;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import com.yandex.passport.internal.ui.bouncer.model.p;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.v;
import com.yandex.passport.internal.ui.bouncer.model.x;
import com.yandex.passport.internal.ui.bouncer.model.y;
import com.yandex.passport.sloth.data.j0;
import com.yandex.passport.sloth.data.m;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.core.network.impl.c;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.home.analytics.diagnostic.server.b;
import com.yandex.plus.home.o;
import com.yandex.plus.home.t;
import com.yandex.plus.log.api.a;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.g;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.h;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.i;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class v42 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v42(Function0 function0, aqi aqiVar, aqi aqiVar2, Continuation continuation) {
        super(3, continuation);
        this.j = 16;
        this.k = function0;
        this.l = aqiVar;
        this.m = aqiVar2;
    }

    private final Object k(Object obj) {
        mm6 mm6Var = (mm6) this.k;
        e eVar = (e) this.l;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        t tVar = (t) this.m;
        d dVar = tVar.b.x;
        a aVar = a.c;
        Continuation continuation = null;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "PlusHomeSdkImpl", "New account collected account=" + eVar + ", clear cache", null);
        }
        x97.y(mm6Var, null, null, new o(tVar, continuation, 4), 3);
        x97.y(mm6Var, null, null, new o(tVar, continuation, 5), 3);
        x97.y(mm6Var, null, null, new o(tVar, continuation, 6), 3);
        x97.y(mm6Var, null, null, new o(tVar, continuation, 7), 3);
        x97.y(mm6Var, null, null, new o(tVar, continuation, 8), 3);
        return Unit.a;
    }

    private final Object l(Object obj) {
        ymb ymbVar;
        ymb ymbVar2;
        String str;
        HashMap hashMap;
        String str2;
        Throwable th = (Throwable) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        b bVar = (b) this.l;
        kkp kkpVar = (kkp) this.m;
        HashMap hashMap2 = new HashMap(3);
        if (th instanceof fp0) {
            fp0 fp0Var = (fp0) th;
            String n = u.n(fp0Var.b);
            int i = fp0Var.a;
            ymbVar = ymb.Http;
            hashMap2.put("code", String.valueOf(i));
            if (n == null) {
                n = "";
            }
            hashMap2.put(CommonUrlParts.REQUEST_ID, n);
        } else if (th instanceof hp0) {
            Throwable cause = th.getCause();
            if (cause instanceof com.yandex.plus.core.network.api.exceptions.a) {
                throw th;
            }
            ymbVar = cause instanceof SSLException ? ymb.Ssl : ((cause instanceof SocketTimeoutException) || (cause instanceof UnknownHostException)) ? ymb.Connection : ymb.Unknown;
        } else {
            ymbVar = th instanceof ip0 ? ymb.Parsing : ymb.Unknown;
        }
        ymb ymbVar3 = ymbVar;
        Throwable cause2 = th.getCause();
        String message = cause2 != null ? cause2.getMessage() : null;
        if (message == null) {
            message = "";
        }
        hashMap2.put("cause_message", message);
        String name = ((nuj) kkpVar.b).name();
        String message2 = th.getMessage();
        if (message2 == null) {
            ymbVar2 = ymbVar3;
            str = name;
            hashMap = hashMap2;
            str2 = "";
        } else {
            ymbVar2 = ymbVar3;
            str = name;
            hashMap = hashMap2;
            str2 = message2;
        }
        com.yandex.plus.home.analytics.diagnostic.server.a aVar = new com.yandex.plus.home.analytics.diagnostic.server.a(kkpVar, str, ymbVar2, str2, hashMap);
        String str3 = str;
        ymb ymbVar4 = ymbVar2;
        String str4 = str2;
        HashMap hashMap3 = hashMap;
        LinkedHashMap linkedHashMap = bVar.d;
        ReentrantLock reentrantLock = bVar.c;
        reentrantLock.lock();
        try {
            Long l = (Long) linkedHashMap.get(aVar);
            if (l != null) {
                if (l.longValue() + 60000 < SystemClock.elapsedRealtime()) {
                }
                reentrantLock.unlock();
                throw th;
            }
            bVar.a.a(str3, ymbVar4, str4, hashMap3);
            bVar.b((List) kkpVar.e, str3, ymbVar4, str4, hashMap3);
            z75.x(linkedHashMap.entrySet(), new fn1(SystemClock.elapsedRealtime() - 60000, 21));
            linkedHashMap.put(aVar, Long.valueOf(SystemClock.elapsedRealtime()));
            reentrantLock.unlock();
            throw th;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final Object n(Object obj) {
        String str;
        ij3 ij3Var;
        ArrayList arrayList;
        Throwable th = (Throwable) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        String name = ((nuj) ((kkp) this.m).b).name();
        fp0 fp0Var = th instanceof fp0 ? (fp0) th : null;
        String n = (fp0Var == null || (arrayList = fp0Var.b) == null) ? null : u.n(arrayList);
        if (fp0Var == null || (ij3Var = fp0Var.c) == null) {
            str = null;
        } else {
            try {
                str = ij3Var.B();
                ij3Var.close();
            } finally {
            }
        }
        ep0 ep0Var = th instanceof ep0 ? (ep0) th : null;
        Throwable J = ep0Var != null ? com.yandex.plus.bdui.flex.ui.a.J(ep0Var, name) : null;
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        String b = com.yandex.plus.home.graphql.analytics.a.b(name, str, n);
        if (J == null) {
            J = th;
        }
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, b, J);
        throw th;
    }

    private final Object o(Object obj) {
        Throwable th = (Throwable) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        com.yandex.plus.pay.graphql.analytics.b bVar = (com.yandex.plus.pay.graphql.analytics.b) this.l;
        String name = ((nuj) ((kkp) this.m).b).name();
        String str = null;
        ep0 ep0Var = th instanceof ep0 ? (ep0) th : null;
        com.yandex.plus.core.graphql.exception.a J = ep0Var != null ? com.yandex.plus.bdui.flex.ui.a.J(ep0Var, name) : null;
        if (th instanceof fp0) {
            String n = u.n(((fp0) th).b);
            bVar.d(n, name, n != null ? (com.yandex.plus.pay.graphql.analytics.a) bVar.d.remove(n) : null, th, J);
            str = n;
        } else {
            if (th.getCause() instanceof com.yandex.plus.core.network.api.exceptions.a) {
                throw th;
            }
            bVar.d(null, name, null, th, J);
        }
        bVar.b.e(com.yandex.plus.pay.api.log.b.a, hrg.r("Error during GraphQL operation. operationName = ", name, "; errorMessage = ", th.getMessage()), th, str);
        throw th;
    }

    private final Object p(Object obj) {
        h hVar = (h) this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        g gVar = (g) this.l;
        m8f m8fVar = (m8f) this.m;
        s9f[] s9fVarArr = g.l;
        Pair pair = new Pair(gVar.getString(R.string.pay_sdk_debug_main_puid), hVar.a.a);
        String string = gVar.getString(R.string.pay_sdk_debug_main_device_id);
        com.yandex.plus.pay.ui.core.debug.internal.domain.info.a aVar = hVar.a;
        Pair pair2 = new Pair(string, aVar.b);
        Pair pair3 = new Pair(gVar.getString(R.string.pay_sdk_debug_main_device_model), aVar.c);
        Pair pair4 = new Pair(gVar.getString(R.string.pay_sdk_debug_main_os_version), Build.VERSION.RELEASE);
        Pair pair5 = new Pair(gVar.getString(R.string.pay_sdk_debug_main_app_version), aVar.d);
        Pair pair6 = new Pair(gVar.getString(R.string.pay_sdk_debug_main_sdk_version), "110.0.0");
        Pair pair7 = new Pair(gVar.getString(R.string.pay_sdk_debug_main_service_name), aVar.e);
        Pair pair8 = new Pair(gVar.getString(R.string.pay_sdk_debug_main_use_bdui), String.valueOf(aVar.f));
        String string2 = gVar.getString(R.string.pay_sdk_debug_main_environment);
        String lowerCase = aVar.g.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        m8fVar.v(u75.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(string2, lowerCase)));
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                v42 v42Var = new v42((w42) this.m, (Continuation) obj3, 0);
                v42Var.k = (cvl) obj;
                v42Var.l = (String) obj2;
                return v42Var.invokeSuspend(Unit.a);
            case 1:
                v42 v42Var2 = new v42((h82) this.m, (Continuation) obj3, 1);
                v42Var2.k = (cvl) obj;
                v42Var2.l = (String) obj2;
                return v42Var2.invokeSuspend(Unit.a);
            case 2:
                v42 v42Var3 = new v42((za2) this.m, (Continuation) obj3, 2);
                v42Var3.k = (c5j) obj;
                v42Var3.l = (String) obj2;
                return v42Var3.invokeSuspend(Unit.a);
            case 3:
                v42 v42Var4 = new v42((j04) this.m, (Continuation) obj3, 3);
                v42Var4.k = (wgg) obj;
                v42Var4.l = (rj6) obj2;
                return v42Var4.invokeSuspend(Unit.a);
            case 4:
                v42 v42Var5 = new v42((aea) this.m, (Continuation) obj3, 4);
                v42Var5.k = (List) obj;
                v42Var5.l = (List) obj2;
                return v42Var5.invokeSuspend(Unit.a);
            case 5:
                v42 v42Var6 = new v42((yea) this.m, (Continuation) obj3, 5);
                v42Var6.k = (List) obj;
                v42Var6.l = (List) obj2;
                return v42Var6.invokeSuspend(Unit.a);
            case 6:
                v42 v42Var7 = new v42((zha) this.m, (Continuation) obj3, 6);
                v42Var7.k = (List) obj;
                v42Var7.l = (List) obj2;
                return v42Var7.invokeSuspend(Unit.a);
            case 7:
                v42 v42Var8 = new v42((nmf) this.m, (Continuation) obj3, 7);
                v42Var8.k = (lwu) obj;
                v42Var8.l = (cuu) obj2;
                return v42Var8.invokeSuspend(Unit.a);
            case 8:
                v42 v42Var9 = new v42((pfg) this.m, (Continuation) obj3, 8);
                v42Var9.k = (q3d) obj;
                v42Var9.l = (q3d) obj2;
                return v42Var9.invokeSuspend(Unit.a);
            case 9:
                v42 v42Var10 = new v42((yzk) this.m, (Continuation) obj3, 9);
                v42Var10.k = (czk) obj;
                v42Var10.l = (e6l) obj2;
                return v42Var10.invokeSuspend(Unit.a);
            case 10:
                v42 v42Var11 = new v42((nwh) this.m, (Continuation) obj3, 10);
                v42Var11.k = (aal) obj;
                v42Var11.l = (aal) obj2;
                return v42Var11.invokeSuspend(Unit.a);
            case 11:
                v42 v42Var12 = new v42((mwk) this.m, (Continuation) obj3, 11);
                v42Var12.k = (k1g) obj;
                v42Var12.l = (k1g) obj2;
                return v42Var12.invokeSuspend(Unit.a);
            case 12:
                v42 v42Var13 = new v42((n0m) this.m, (Continuation) obj3, 12);
                v42Var13.k = (m1g) obj;
                v42Var13.l = (nyl) obj2;
                return v42Var13.invokeSuspend(Unit.a);
            case 13:
                v42 v42Var14 = new v42((mmo) this.m, (Continuation) obj3, 13);
                v42Var14.k = (rrl) obj;
                v42Var14.l = (amu) obj2;
                return v42Var14.invokeSuspend(Unit.a);
            case 14:
                v42 v42Var15 = new v42((bjt) this.m, (Continuation) obj3, 14);
                v42Var15.k = (xxq) obj;
                v42Var15.l = (xxq) obj2;
                return v42Var15.invokeSuspend(Unit.a);
            case 15:
                v42 v42Var16 = new v42((x1u) this.m, (Continuation) obj3, 15);
                v42Var16.k = (q4u) obj;
                v42Var16.l = (q4u) obj2;
                return v42Var16.invokeSuspend(Unit.a);
            case 16:
                ((Number) obj2).floatValue();
                return new v42((Function0) this.k, (aqi) this.l, (aqi) this.m, (Continuation) obj3).invokeSuspend(Unit.a);
            case 17:
                v42 v42Var17 = new v42((r4v) this.m, (Continuation) obj3, 17);
                v42Var17.k = (fav) obj;
                v42Var17.l = (k7v) obj2;
                return v42Var17.invokeSuspend(Unit.a);
            case 18:
                v42 v42Var18 = new v42((t0) this.m, (Continuation) obj3, 18);
                v42Var18.k = (v) obj;
                v42Var18.l = (l1) obj2;
                return v42Var18.invokeSuspend(Unit.a);
            case 19:
                v42 v42Var19 = new v42((x0) this.m, (Continuation) obj3, 19);
                v42Var19.k = (x) obj;
                v42Var19.l = (l1) obj2;
                return v42Var19.invokeSuspend(Unit.a);
            case 20:
                v42 v42Var20 = new v42((z0) this.m, (Continuation) obj3, 20);
                v42Var20.k = (y) obj;
                v42Var20.l = (l1) obj2;
                return v42Var20.invokeSuspend(Unit.a);
            case 21:
                v42 v42Var21 = new v42((j0v) this.m, (Continuation) obj3, 21);
                v42Var21.k = (com.yandex.plus.core.network.context.a) obj;
                v42Var21.l = (Pair) obj2;
                return v42Var21.invokeSuspend(Unit.a);
            case 22:
                v42 v42Var22 = new v42((t) this.m, (Continuation) obj3, 22);
                v42Var22.k = (mm6) obj;
                v42Var22.l = (Set) obj2;
                return v42Var22.invokeSuspend(Unit.a);
            case 23:
                v42 v42Var23 = new v42((t) this.m, (Continuation) obj3, 23);
                v42Var23.k = (mm6) obj;
                v42Var23.l = (e) obj2;
                return v42Var23.invokeSuspend(Unit.a);
            case 24:
                v42 v42Var24 = new v42((b) this.l, (kkp) this.m, (Continuation) obj3, 24);
                v42Var24.k = (Throwable) obj2;
                v42Var24.invokeSuspend(Unit.a);
                throw null;
            case 25:
                v42 v42Var25 = new v42((com.yandex.plus.home.graphql.analytics.a) this.l, (kkp) this.m, (Continuation) obj3, 25);
                v42Var25.k = (Throwable) obj2;
                v42Var25.invokeSuspend(Unit.a);
                throw null;
            case 26:
                v42 v42Var26 = new v42((com.yandex.plus.home.plaque.feature.internal.presentation.h) this.m, (Continuation) obj3, 26);
                v42Var26.k = (com.yandex.plus.home.plaque.feature.api.context.b) obj;
                v42Var26.l = (com.yandex.plus.home.plaque.repository.api.model.d) obj2;
                return v42Var26.invokeSuspend(Unit.a);
            case 27:
                v42 v42Var27 = new v42((com.yandex.plus.pay.graphql.analytics.b) this.l, (kkp) this.m, (Continuation) obj3, 27);
                v42Var27.k = (Throwable) obj2;
                v42Var27.invokeSuspend(Unit.a);
                throw null;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                v42 v42Var28 = new v42((g) this.l, (m8f) this.m, (Continuation) obj3, 28);
                v42Var28.k = (h) obj2;
                return v42Var28.invokeSuspend(Unit.a);
            default:
                v42 v42Var29 = new v42((com.yandex.plus.pay.ui.core.debug.internal.ui.log.h) this.l, (m8f) this.m, (Continuation) obj3, 29);
                v42Var29.k = (i) obj2;
                return v42Var29.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r8v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i;
        ?? r8;
        List o0;
        raj a;
        raj a2;
        n7q n7qVar;
        vdr vdrVar;
        aal aalVar;
        int i2;
        String str;
        aal aalVar2;
        nwk p;
        String str2;
        nwk p2;
        String str3;
        String str4;
        String str5;
        mqs a3;
        mqs a4;
        j1g j1gVar;
        String str6;
        j1g j1gVar2;
        String str7;
        t7o t7oVar;
        Object obj2;
        int i3 = 2;
        int i4 = 3;
        boolean z = true;
        z = true;
        switch (this.j) {
            case 0:
                cvl cvlVar = (cvl) this.k;
                String str8 = (String) this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return ((m82) ((w42) this.m).e.getValue()).d(cvlVar, null, str8, false);
            case 1:
                cvl cvlVar2 = (cvl) this.k;
                String str9 = (String) this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return ((m82) ((h82) this.m).e.getValue()).d(cvlVar2, null, str9, true);
            case 2:
                c5j c5jVar = (c5j) this.k;
                String str10 = (String) this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                m82 e = ((za2) this.m).e();
                y02 y02Var = y02.b;
                e.getClass();
                c5jVar.getClass();
                return e.l(c5jVar.a, str10, y02Var);
            case 3:
                wgg wggVar = (wgg) this.k;
                rj6 rj6Var = (rj6) this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                to1 to1Var = (to1) jf0.F(rj6Var);
                List list = wggVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    c01 c01Var = (c01) obj3;
                    if (to1Var != null) {
                        List list2 = to1Var.a;
                        r8 = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            r8.add(((so1) it.next()).a.a);
                        }
                    } else {
                        r8 = c5b.a;
                    }
                    if (!r8.contains(c01Var.a)) {
                        arrayList2.add(obj3);
                    }
                }
                if (to1Var != null) {
                    List list3 = to1Var.a;
                    arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new n54((so1) it2.next(), 0));
                    }
                } else {
                    arrayList = null;
                }
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new ez3((c01) it3.next(), 0));
                }
                j04 j04Var = (j04) this.m;
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (j04.a(j04Var, (c01) listIterator.previous())) {
                        i = listIterator.nextIndex();
                    }
                }
                Integer num = new Integer(i);
                return new sz3(arrayList3, arrayList, num.intValue() >= 0 ? num : 0);
            case 4:
                List list4 = (List) this.k;
                List list5 = (List) this.l;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ((aea) this.m).H().getClass();
                int ordinal = bea.a(list4).ordinal();
                if (ordinal == 0) {
                    o0 = CollectionsKt.o0(list5, new zda(0));
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    o0 = CollectionsKt.o0(list5, new dl4(29));
                }
                List list6 = o0;
                ArrayList arrayList4 = new ArrayList(v75.o(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(aea.J(((pda) it4.next()).a));
                }
                return new dea(arrayList4);
            case 5:
                List list7 = (List) this.k;
                List list8 = (List) this.l;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (list7.isEmpty() && list8.isEmpty()) {
                    return uea.a;
                }
                List<mqs> list9 = list7;
                yea yeaVar = (yea) this.m;
                ArrayList arrayList5 = new ArrayList(v75.o(list9, 10));
                for (mqs mqsVar : list9) {
                    a = ((cej) yeaVar.l.getValue()).a(mqsVar, false);
                    arrayList5.add(new gdj(a, mqsVar));
                }
                List<oq> list10 = list8;
                ArrayList arrayList6 = new ArrayList(v75.o(list10, 10));
                for (oq oqVar : list10) {
                    oqVar.getClass();
                    v1g v1gVar = new v1g(oqVar.b, vz1.w(oqVar.D.a), oqVar.i(), qo6.g);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(k8w.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    arrayList6.add(new nt(oqVar, new x1g(v1gVar, ((m8w) ((k8w) qdcVar.C(I))).a(oqVar))));
                }
                return new vea(arrayList5, arrayList6);
            case 6:
                List list11 = (List) this.k;
                List list12 = (List) this.l;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                if (list11.isEmpty() && list12.isEmpty()) {
                    return aia.a;
                }
                List<mqs> list13 = list11;
                zha zhaVar = (zha) this.m;
                ArrayList arrayList7 = new ArrayList(v75.o(list13, 10));
                for (mqs mqsVar2 : list13) {
                    a2 = ((cej) zhaVar.l.getValue()).a(mqsVar2, false);
                    arrayList7.add(new gdj(a2, mqsVar2));
                }
                List<oq> list14 = list12;
                ArrayList arrayList8 = new ArrayList(v75.o(list14, 10));
                for (oq oqVar2 : list14) {
                    oqVar2.getClass();
                    v1g v1gVar2 = new v1g(oqVar2.b, vz1.w(oqVar2.D.a), oqVar2.i(), qo6.g);
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(k8w.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    arrayList8.add(new nt(oqVar2, new x1g(v1gVar2, ((m8w) ((k8w) qdcVar2.C(I2))).a(oqVar2))));
                }
                return new bia(arrayList7, arrayList8);
            case 7:
                lwu lwuVar = (lwu) this.k;
                cuu cuuVar = (cuu) this.l;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                hwu hwuVar = hwu.a;
                if (!Intrinsics.d(lwuVar, hwuVar) || cuuVar != null) {
                    if (lwuVar instanceof jwu) {
                        return lwuVar;
                    }
                    if (!Intrinsics.d(lwuVar, hwuVar)) {
                        b6e.s();
                        return null;
                    }
                    if (cuuVar != null) {
                        yku ykuVar = cuuVar.a;
                        return new cwu(new iwu(ykuVar.a, ykuVar.e), ykuVar.c);
                    }
                }
                return hwuVar;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                q3d q3dVar = (q3d) this.k;
                q3d q3dVar2 = (q3d) this.l;
                pfg pfgVar = (pfg) this.m;
                q3dVar2.getClass();
                q3dVar.getClass();
                int i5 = q3dVar2.a;
                int i6 = q3dVar.a;
                return i5 > i6 ? true : i5 < i6 ? false : ksw.L(q3dVar2.b, q3dVar.b, pfgVar) ? q3dVar2 : q3dVar;
            case 9:
                czk czkVar = (czk) this.k;
                e6l e6lVar = (e6l) this.l;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                d6l x = p6g.x(e6lVar);
                return Boolean.valueOf(x != null && (n7qVar = x.a) != null && yzk.e(n7qVar, czkVar) && p6g.C(e6lVar));
            case 10:
                nwh nwhVar = (nwh) this.m;
                vdr vdrVar2 = (vdr) nwhVar.c;
                nmb nmbVar = (nmb) nwhVar.h;
                aal aalVar3 = (aal) this.k;
                aal aalVar4 = (aal) this.l;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                aal aalVar5 = aal.b;
                if (aalVar4 == aalVar5) {
                    i2 = 1;
                    if (nwhVar.a) {
                        nwk p3 = nwhVar.p();
                        if (p3 == null || (str3 = p3.a) == null) {
                            str3 = "";
                        }
                        okb w = nwh.w((uz7) vdrVar2.getValue());
                        nmbVar.getClass();
                        vdrVar = vdrVar2;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("page_type", "object");
                        linkedHashMap.put("track_id", str3);
                        dfi.p(2, CommonUrlParts.DEVICE_TYPE, w.a, "_meta", linkedHashMap);
                        nmbVar.C("ExpandedPlayer.Opened", linkedHashMap);
                        nwk p4 = nwhVar.p();
                        if (p4 == null || (str4 = p4.a) == null) {
                            str4 = "";
                        }
                        nwk p5 = nwhVar.p();
                        if (p5 == null || (str5 = p5.b) == null) {
                            str5 = "";
                        }
                        mwk mwkVar = (mwk) nwhVar.k;
                        boolean o = (mwkVar == null || (a4 = mwkVar.a()) == null) ? false : a4.o();
                        str = "";
                        mwk mwkVar2 = (mwk) nwhVar.k;
                        boolean z2 = (mwkVar2 == null || (a3 = mwkVar2.a()) == null) ? false : a3.n;
                        okb w2 = nwh.w((uz7) vdrVar.getValue());
                        boolean booleanValue = ((Boolean) ((vdr) nwhVar.b).getValue()).booleanValue();
                        aalVar = aalVar3;
                        boolean booleanValue2 = ((Boolean) ((vdr) nwhVar.e).getValue()).booleanValue();
                        LinkedHashMap m = dfi.m("page_type", "object", "track_id", str4);
                        eta.u(m, "track_name", str5, o, "with_videoshot");
                        m.put("with_animated_text", String.valueOf(z2));
                        eta.u(m, CommonUrlParts.DEVICE_TYPE, w2.a, booleanValue, "videoshot_on");
                        m.put("animated_text_on", String.valueOf(booleanValue2));
                        m.put("_meta", nmb.u(1));
                        nmbVar.C("ExpandedPlayer.Showed", m);
                        aalVar2 = aal.c;
                        if (aalVar4 == aalVar2 && nwhVar.a) {
                            p2 = nwhVar.p();
                            if (p2 != null || (r2 = p2.a) == null) {
                                String str11 = str;
                            }
                            okb w3 = nwh.w((uz7) vdrVar.getValue());
                            nmbVar.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("page_type", "object");
                            linkedHashMap2.put("track_id", str11);
                            dfi.p(i2, CommonUrlParts.DEVICE_TYPE, w3.a, "_meta", linkedHashMap2);
                            nmbVar.C("CollapsedPlayer.Opened", linkedHashMap2);
                        }
                        if (aalVar == aalVar5 && nwhVar.a) {
                            p = nwhVar.p();
                            if (p != null || (r2 = p.a) == null) {
                                String str12 = str;
                            }
                            nwk p6 = nwhVar.p();
                            String str13 = (p6 != null || (str2 = p6.b) == null) ? str : str2;
                            nmbVar.getClass();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap3.put("page_type", "object");
                            linkedHashMap3.put("track_id", str12);
                            dfi.p(1, "track_name", str13, "_meta", linkedHashMap3);
                            nmbVar.C("ExpandedPlayer.Closed", linkedHashMap3);
                        }
                        if (aalVar4 != aalVar2 || aalVar4 == aal.a) {
                            ((p9l) nwhVar.i).b();
                            ((p2b) nwhVar.j).b();
                        }
                        return aalVar4;
                    }
                    vdrVar = vdrVar2;
                    aalVar = aalVar3;
                } else {
                    vdrVar = vdrVar2;
                    aalVar = aalVar3;
                    i2 = 1;
                }
                str = "";
                aalVar2 = aal.c;
                if (aalVar4 == aalVar2) {
                    p2 = nwhVar.p();
                    if (p2 != null) {
                    }
                    String str112 = str;
                    okb w32 = nwh.w((uz7) vdrVar.getValue());
                    nmbVar.getClass();
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    linkedHashMap22.put("page_type", "object");
                    linkedHashMap22.put("track_id", str112);
                    dfi.p(i2, CommonUrlParts.DEVICE_TYPE, w32.a, "_meta", linkedHashMap22);
                    nmbVar.C("CollapsedPlayer.Opened", linkedHashMap22);
                }
                if (aalVar == aalVar5) {
                    p = nwhVar.p();
                    if (p != null) {
                    }
                    String str122 = str;
                    nwk p62 = nwhVar.p();
                    if (p62 != null) {
                    }
                    nmbVar.getClass();
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                    linkedHashMap32.put("page_type", "object");
                    linkedHashMap32.put("track_id", str122);
                    dfi.p(1, "track_name", str13, "_meta", linkedHashMap32);
                    nmbVar.C("ExpandedPlayer.Closed", linkedHashMap32);
                }
                if (aalVar4 != aalVar2) {
                }
                ((p9l) nwhVar.i).b();
                ((p2b) nwhVar.j).b();
                return aalVar4;
            case 11:
                k1g k1gVar = (k1g) this.k;
                k1g k1gVar2 = (k1g) this.l;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                if (k1gVar != null) {
                    if (gl5.b(Long.valueOf(k1gVar.b), k1gVar2 != null ? Long.valueOf(k1gVar2.b) : null) <= 0) {
                        k1gVar = null;
                    }
                    if (k1gVar != null) {
                        k1gVar2 = k1gVar;
                    }
                }
                if (k1gVar2 == null || (j1gVar = k1gVar2.a) == null) {
                    return null;
                }
                return new igl((mwk) this.m, j1gVar);
            case 12:
                m1g m1gVar = (m1g) this.k;
                nyl nylVar = (nyl) this.l;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                j1g j1gVar3 = m1gVar.a;
                int i7 = m1gVar.b;
                n0m n0mVar = (n0m) this.m;
                xdr xdrVar = n0mVar.z0;
                if (!nylVar.a && j1gVar3 != j1g.a) {
                    z = false;
                }
                v3w.n(z, xdrVar, null);
                xdr xdrVar2 = n0mVar.A0;
                Integer num2 = new Integer(n0mVar.k.a.N() ? 0 : i7);
                xdrVar2.getClass();
                xdrVar2.m(null, num2);
                return Unit.a;
            case 13:
                rrl rrlVar = (rrl) this.k;
                amu amuVar = (amu) this.l;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                if (rrlVar == null) {
                    return null;
                }
                if (!((z66) ((jyr) ((mmo) this.m).f).getValue()).g() || rrlVar.b.isEmpty()) {
                    return new zul(rrlVar.a, rrlVar.c, c5b.a, null, null);
                }
                return new zul(rrlVar.a, rrlVar.c, c5b.a, new r1u(rrlVar.a.b, null, null, (amuVar == null || (str6 = amuVar.a) == null) ? null : new jcv(str6, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(frv.b()), null, amuVar != null ? amuVar.b : null), null);
            case 14:
                bjt bjtVar = (bjt) this.m;
                xxq xxqVar = (xxq) this.k;
                xxq xxqVar2 = (xxq) this.l;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                if (xxqVar != null && !Intrinsics.d(xxqVar2, xxqVar)) {
                    ((q7l) ((jyr) bjtVar.b).getValue()).a();
                    ((taa) ((raa) ((jyr) bjtVar.c).getValue())).a();
                    xdr xdrVar3 = saa.a;
                    String str14 = xxqVar2.a;
                    str14.getClass();
                    ssg.a(3, "DownloadControlBackdoor", "initialized for ".concat(str14), null);
                    xdr xdrVar4 = saa.a;
                    Boolean bool = Boolean.TRUE;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool);
                }
                return xxqVar2;
            case 15:
                x1u x1uVar = (x1u) this.m;
                q4u q4uVar = (q4u) this.k;
                q4u q4uVar2 = (q4u) this.l;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                if (q4uVar != null) {
                    if (gl5.b(Long.valueOf(q4uVar.b), q4uVar2 != null ? Long.valueOf(q4uVar2.b) : null) <= 0 || !Intrinsics.d(q4uVar.a.a, x1uVar)) {
                        q4uVar = null;
                    }
                    if (q4uVar != null) {
                        q4uVar2 = q4uVar;
                    }
                }
                if (q4uVar2 == null || (j1gVar2 = q4uVar2.a.b) == null) {
                    return null;
                }
                return new p4u(x1uVar, j1gVar2);
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                ((Function0) this.k).invoke();
                ((aqi) this.l).setValue(Float.valueOf(0.0f));
                ((aqi) this.m).setValue(Boolean.FALSE);
                return Unit.a;
            case 17:
                fav favVar = (fav) this.k;
                k7v k7vVar = (k7v) this.l;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                if (k7vVar != null) {
                    if (favVar instanceof eav) {
                        q6v q6vVar = ((eav) favVar).b;
                        if (q6vVar.a.a.equals(k7vVar.a)) {
                            int ordinal2 = k7vVar.c.ordinal();
                            if (ordinal2 == 0) {
                                return new aav(q6vVar, k7vVar);
                            }
                            if (ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    return new aav(q6vVar, k7vVar);
                                }
                                b6e.s();
                                return null;
                            }
                        }
                    } else if (!(favVar instanceof aav) && !Intrinsics.d(favVar, bav.b) && !Intrinsics.d(favVar, cav.b) && !(favVar instanceof dav)) {
                        b6e.s();
                        return null;
                    }
                }
                return favVar;
            case 18:
                v vVar = (v) this.k;
                l1 l1Var = (l1) this.l;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                t0 t0Var = (t0) this.m;
                l e2 = t0Var.b.a().e(vVar.a);
                n f = e2 != null ? e2.f() : null;
                if (f == n.PHONISH || f == n.SOCIAL || f == n.MAILISH) {
                    com.yandex.passport.internal.properties.l lVar = l1Var.c;
                    return lVar != null ? new p(new p1(lVar, true, null, e2, true, null, 100)) : new com.yandex.passport.internal.ui.bouncer.model.o("ReloginActor", "No loginProperties in current state", null);
                }
                b1 b1Var = l1Var.d;
                if (b1Var == null) {
                    return new com.yandex.passport.internal.ui.bouncer.model.o("ReloginActor", "No bouncer parameters in current state", null);
                }
                com.yandex.passport.internal.properties.l lVar2 = b1Var.a;
                if (e2 == null || (str7 = e2.e.i) == null) {
                    String str15 = e2 != null ? e2.e.v : null;
                    str7 = str15 == null ? lVar2.k : str15;
                }
                return new g0(new m(new j0(str7, vVar.a, lVar2.p.p, com.yandex.plus.core.network.api.utils.a.h(t0Var.a, lVar2)), com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a), com.yandex.plus.core.network.api.utils.a.J(lVar2.u, ((Boolean) t0Var.c.b(com.yandex.passport.internal.flags.o.y)).booleanValue()), 4));
            case 19:
                x xVar = (x) this.k;
                l1 l1Var2 = (l1) this.l;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.account.a aVar = ((x0) this.m).a;
                b1 b1Var2 = xVar.a;
                com.yandex.passport.internal.properties.l lVar3 = b1Var2.a;
                com.yandex.passport.internal.properties.l lVar4 = b1Var2.a;
                z1 z1Var = lVar3.m;
                List<n2> list15 = b1Var2.b;
                if (!list15.isEmpty()) {
                    int ordinal3 = l1Var2.e.ordinal();
                    if (ordinal3 != 0 && ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                        }
                    }
                    if ((aVar.a() != null && !lVar3.l) || z1Var != null) {
                        if (z1Var != null) {
                            return new f(xVar.a, com.yandex.plus.pay.ui.core.b.L(z1Var), lVar4.e, false);
                        }
                        l a5 = aVar.a();
                        com.yandex.passport.common.core.f fVar = a5 != null ? a5.b : null;
                        return fVar != null ? new f(b1Var2, fVar, lVar4.e, false) : new com.yandex.passport.internal.ui.bouncer.model.o("RouteActor", "Current account is missing", null);
                    }
                }
                if (!list15.isEmpty()) {
                    ?? r0 = (b1Var2.d == null && lVar4.g == null) ? false : true;
                    boolean z3 = lVar4.h;
                    boolean z4 = lVar4.i;
                    com.yandex.passport.internal.properties.h hVar = lVar4.q;
                    ?? r4 = (hVar != null ? hVar.b : null) != null;
                    ?? r5 = lVar4.o.a != null;
                    r7 = lVar4.j != null ? 1 : 0;
                    if (r0 == false && !z3 && !z4 && r4 == false && r5 == false && r7 == 0) {
                        return new d0(new r1(lVar3, list15));
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (n2 n2Var : list15) {
                    if (n2Var instanceof l2) {
                        arrayList9.add(((l2) n2Var).a);
                    }
                }
                return new c0(lVar3, arrayList9, b1Var2.d, b1Var2.e, b1Var2.f, false, null, null, 192);
            case 20:
                y yVar = (y) this.k;
                l1 l1Var3 = (l1) this.l;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                z0 z0Var = (z0) this.m;
                try {
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.d a6 = z0Var.a.a();
                    com.yandex.passport.common.core.f fVar2 = yVar.a;
                    l e3 = a6.e(fVar2);
                    if (e3 != null) {
                        obj2 = new com.yandex.passport.internal.ui.bouncer.model.h(e3, w0.h);
                    } else {
                        com.yandex.passport.internal.entities.n nVar = (com.yandex.passport.internal.entities.n) z0Var.b.a(a6).get(fVar2);
                        if (nVar != null) {
                            obj2 = new com.yandex.passport.internal.ui.bouncer.model.i(nVar.a, nVar.b, w0.h);
                        } else {
                            com.yandex.passport.internal.properties.l lVar5 = l1Var3.c;
                            if (lVar5 == null) {
                                throw new IllegalStateException("No login properties specified.");
                            }
                            obj2 = new c0(com.yandex.passport.internal.properties.l.a(lVar5, com.yandex.plus.pay.ui.core.b.J(fVar2), null, null, 1073741759), null, null, null, false, false, null, null, 254);
                        }
                    }
                } catch (wis e4) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e4);
                    obj2 = t7oVar;
                    if (z7o.a(obj2) == null) {
                    }
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    if (z7o.a(obj2) == null) {
                    }
                }
                return z7o.a(obj2) == null ? obj2 : new com.yandex.passport.internal.ui.bouncer.model.o("SelectAccountByUidActor", k.n(new StringBuilder("Can not select account with uid "), yVar.a, '.'), null);
            case 21:
                com.yandex.plus.core.network.context.a aVar2 = (com.yandex.plus.core.network.context.a) this.k;
                Pair pair = (Pair) this.l;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                return ((c) pair.b).c(aVar2, new we((j0v) this.m, aVar2, pair.a, (Continuation) null, 27));
            case 22:
                mm6 mm6Var = (mm6) this.k;
                Set set = (Set) this.l;
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                t tVar = (t) this.m;
                d dVar = tVar.b.x;
                a aVar3 = a.c;
                if (dVar.b(aVar3)) {
                    dVar.a(aVar3, "PlusHomeSdkImpl", "Collect new target events " + set, null);
                }
                com.yandex.plus.home.state.b bVar = com.yandex.plus.home.state.b.b;
                if (set.contains(bVar) || set.contains(com.yandex.plus.home.state.b.a)) {
                    x97.y(mm6Var, null, null, new o(tVar, r9, r7), 3);
                }
                if (set.contains(com.yandex.plus.home.state.b.d) || set.contains(com.yandex.plus.home.state.b.a)) {
                    x97.y(mm6Var, null, null, new o(tVar, r9, z ? 1 : 0), 3);
                }
                if (set.contains(bVar) || set.contains(com.yandex.plus.home.state.b.a) || set.contains(com.yandex.plus.home.state.b.g)) {
                    x97.y(mm6Var, null, null, new o(tVar, r9, i3), 3);
                }
                if (set.contains(com.yandex.plus.home.state.b.e)) {
                    x97.y(mm6Var, null, null, new o(tVar, r9, i4), 3);
                }
                return Unit.a;
            case 23:
                return k(obj);
            case 24:
                return l(obj);
            case 25:
                return n(obj);
            case 26:
                com.yandex.plus.home.plaque.feature.api.context.b bVar2 = (com.yandex.plus.home.plaque.feature.api.context.b) this.k;
                com.yandex.plus.home.plaque.repository.api.model.d dVar2 = (com.yandex.plus.home.plaque.repository.api.model.d) this.l;
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                List list16 = dVar2.a;
                List list17 = dVar2.b;
                com.yandex.plus.bdui.flex.factory.e eVar = ((com.yandex.plus.home.plaque.feature.internal.presentation.h) this.m).c;
                com.yandex.plus.home.plaque.repository.api.model.a aVar4 = (com.yandex.plus.home.plaque.repository.api.model.a) eVar.i(list16, bVar2);
                com.yandex.plus.home.plaque.repository.api.model.b bVar3 = (com.yandex.plus.home.plaque.repository.api.model.b) eVar.i(list17, bVar2);
                if (bVar3 == null) {
                    bVar3 = com.yandex.plus.home.plaque.repository.api.model.b.g;
                }
                return new vat(bVar2, aVar4, bVar3);
            case 27:
                return o(obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return p(obj);
            default:
                i iVar = (i) this.k;
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.core.debug.internal.ui.log.h hVar2 = (com.yandex.plus.pay.ui.core.debug.internal.ui.log.h) this.l;
                m8f m8fVar = (m8f) this.m;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.debug.internal.ui.log.h.n;
                m8fVar.v(iVar.b);
                ((Spinner) hVar2.j.x(com.yandex.plus.pay.ui.core.debug.internal.ui.log.h.n[1])).setSelection(a.g.indexOf(iVar.a));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v42(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v42(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
