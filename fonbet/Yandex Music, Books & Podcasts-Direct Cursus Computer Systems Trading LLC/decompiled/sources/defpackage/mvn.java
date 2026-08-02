package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.service.NetcastTVService;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class mvn implements u6c, p7q, b0q, dup, rek, ag6, c20, gn3, r26, spp {
    public static final mvn b = new mvn(0);
    public static final mvn c = new mvn(1);
    public static final mvn d = new mvn(2);
    public static final mvn e = new mvn(3);
    public static final mvn f = new mvn(4);
    public static final String[] g = {"'", "@{"};
    public static final mvn h = new mvn(6);
    public static final mvn i = new mvn(7);
    public static final /* synthetic */ mvn j = new mvn(8);
    public static final /* synthetic */ mvn k = new mvn(10);
    public static final mvn l = new mvn(11);
    public static final mvn m = new mvn(12);
    public final /* synthetic */ int a;

    public /* synthetic */ mvn(int i2) {
        this.a = i2;
    }

    public static Bundle C(qhb qhbVar, View view, View view2) {
        Bundle bundle = new Bundle();
        if (qhbVar != null) {
            List<z5k> unmodifiableList = Collections.unmodifiableList(qhbVar.c);
            unmodifiableList.getClass();
            for (z5k z5kVar : unmodifiableList) {
                String str = z5kVar.b;
                ArrayList arrayList = z5kVar.c;
                String str2 = z5kVar.a;
                if (str != null && str.length() > 0) {
                    bundle.putString(str2, z5kVar.b);
                } else if (arrayList.size() > 0) {
                    Iterator it = (Intrinsics.d(z5kVar.d, "relative") ? j66.R(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : j66.R(view, arrayList, 0, -1, view.getClass().getSimpleName())).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            es4 es4Var = (es4) it.next();
                            if (es4Var.a() != null) {
                                String j2 = qeu.j(es4Var.a());
                                if (j2.length() > 0) {
                                    bundle.putString(str2, j2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static r1l E() {
        return (r1l) hof.h.getValue();
    }

    public static boolean H(mqs mqsVar) {
        r1l E = E();
        E.getClass();
        mqsVar.getClass();
        String str = mqsVar.a;
        Long a = E.a(str);
        long longValue = a != null ? a.longValue() : 0L;
        r1l E2 = E();
        long j2 = mqsVar.e;
        E2.getClass();
        if (!r1l.c(longValue, j2)) {
            r1l E3 = E();
            E3.getClass();
            Boolean d2 = E3.d(str);
            if (!(d2 != null ? d2.booleanValue() : false)) {
                return true;
            }
        }
        return false;
    }

    public static qne K(String str, vtm vtmVar) {
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", str, str, vtmVar);
    }

    public static uhd O(String str) {
        Object obj;
        if (str == null) {
            return uhd.c;
        }
        rdb rdbVar = uhd.e;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((uhd) obj).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        uhd uhdVar = (uhd) obj;
        return uhdVar == null ? uhd.c : uhdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() != true) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(oq oqVar, cg6 cg6Var, List list) {
        gof gofVar;
        int i2;
        Integer num;
        Integer num2;
        if (cg6Var instanceof gof) {
            gofVar = (gof) cg6Var;
            int i3 = gofVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gofVar.l = i3 - Integer.MIN_VALUE;
                Object obj = gofVar.k;
                nm6 nm6Var = nm6.a;
                i2 = gofVar.l;
                boolean z = true;
                if (i2 != 0) {
                    qgg.h0(obj);
                    num = new Integer(u75.g(list));
                    if (oqVar != null) {
                        mvn mvnVar = hof.g;
                        gofVar.j = num;
                        gofVar.l = 1;
                        obj = mvnVar.J(oqVar, gofVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        num2 = num;
                    }
                    z = false;
                    if (!z) {
                        num = null;
                    }
                    return new Integer(num != null ? num.intValue() : 0);
                }
                if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                num2 = gofVar.j;
                qgg.h0(obj);
                num = num2;
            }
        }
        gofVar = new gof(cg6Var);
        Object obj2 = gofVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = gofVar.l;
        boolean z2 = true;
        if (i2 != 0) {
        }
        num = num2;
    }

    public static String Q(String str) {
        str.getClass();
        if (!StringsKt.N(str, '\\')) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) != '\\') {
                sb.append(str.charAt(i2));
                i2++;
            } else {
                int i3 = i2;
                while (i3 < str.length() && str.charAt(i3) == '\\') {
                    i3++;
                }
                int i4 = i3 - i2;
                i2 += i4;
                int i5 = i4 / 2;
                for (int i6 = 0; i6 < i5; i6++) {
                    sb.append('\\');
                }
                if (i4 % 2 == 1) {
                    if (i2 == str.length() || str.charAt(i2) == ' ') {
                        kac.h(hrg.q("Error tokenizing '", str, "'."), new mos("Alone backslash at " + (i2 - 1), null));
                        return null;
                    }
                    for (String str2 : g) {
                        int length = str2.length();
                        for (int i7 = 0; i7 < length; i7++) {
                            int i8 = i2 + i7;
                            if (i8 >= str.length() || str.charAt(i8) != str2.charAt(i7)) {
                            }
                        }
                        sb.append(str2);
                        i2 += str2.length();
                    }
                    kac.h("Incorrect string escape", null);
                    return null;
                }
                continue;
            }
        }
        return sb.toString();
    }

    public static Object S(aur aurVar) {
        FirebaseMessaging firebaseMessaging;
        zt3 zt3Var = new zt3(1, qxe.b(aurVar));
        zt3Var.s();
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(aec.d());
        }
        onx d2 = firebaseMessaging.d();
        d2.getClass();
        int i2 = 0;
        d2.o(new qec(i2, new oec(zt3Var, i2)));
        d2.a(j8s.a, new pec(zt3Var));
        d2.n(new h4b(zt3Var));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public static void T(y yVar, l5t l5tVar, String str, boolean z, kxi kxiVar, gj gjVar) {
        yVar.getClass();
        str.getClass();
        kxiVar.getClass();
        if (yVar.D("TRAILER_DIALOG_TAG") == null) {
            a aVar = new a(yVar);
            g5t g5tVar = new g5t();
            g5tVar.setArguments(cxb.K(new Pair("TRAILER_ENTITY_TYPE_ARG_KEY", l5tVar), new Pair("TRAILER_ENTITY_ID_ARG_KEY", str), new Pair("TRAILER_ENTITY_OPENED_FROM_ENTITY_ARG_KEY", Boolean.valueOf(z)), new Pair("TRAILER_NAVIGATION_DATA_ARG_KEY", kxiVar), new Pair("TRAILER_AD_DATA_ARG_KEY", gjVar)));
            aVar.d(0, g5tVar, "TRAILER_DIALOG_TAG", 1);
            aVar.k(true, true);
        }
    }

    public static k77 i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        eta.s(str, str2, str3, str4, str5);
        eta.s(str6, str7, str8, str9, str10);
        str11.getClass();
        str14.getClass();
        str15.getClass();
        str16.getClass();
        return new k77();
    }

    public static final int k(List list, boolean z) {
        Integer valueOf = Integer.valueOf(u75.g(list));
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public static dpj l(int i2) {
        return new dpj(new hi3(), Math.min(1048576, Math.max(4096, i2)));
    }

    public static final Bundle o(String str, List list, int i2) {
        String str2;
        if (!bp6.a.contains(mvn.class)) {
            try {
                if (i2 == 0) {
                    throw null;
                }
                list.getClass();
                Bundle bundle = new Bundle();
                if (i2 == 1) {
                    str2 = "MOBILE_APP_INSTALL";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str2 = "CUSTOM_APP_EVENTS";
                }
                bundle.putString(NetcastTVService.UDAP_API_EVENT, str2);
                bundle.putString(CommonUrlParts.APP_ID, str);
                if (2 != i2) {
                    return bundle;
                }
                JSONArray r = b.r(str, list);
                if (r.length() != 0) {
                    bundle.putString("custom_events", r.toString());
                    return bundle;
                }
            } catch (Throwable th) {
                bp6.a(mvn.class, th);
                return null;
            }
        }
        return null;
    }

    public static bpp v(ddl ddlVar) {
        return new bpp(System.currentTimeMillis() + 3600000, new jsg(8, 13), new hx1(true, false, false), 10.0d, 1.2d, 60);
    }

    public static qne y(String str) {
        vtm vtmVar = new vtm((Map) new LinkedHashMap());
        vtmVar.w("event_type", "other");
        vtmVar.w("event_source", "error");
        w1g.B((LinkedHashMap) vtmVar.a, "error", new mc3(true));
        vtmVar.w("reason", "Origin eventus id was not found");
        vtmVar.w(NetcastTVService.UDAP_API_EVENT, str);
        return new qne("ERROR", vtmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #2 {all -> 0x0031, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002d, B:15:0x0033, B:21:0x0049, B:22:0x0050, B:28:0x0042, B:33:0x0012, B:30:0x000e, B:25:0x003e, B:11:0x0029), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #2 {all -> 0x0031, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002d, B:15:0x0033, B:21:0x0049, B:22:0x0050, B:28:0x0042, B:33:0x0012, B:30:0x000e, B:25:0x003e, B:11:0x0029), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized gs4 A() {
        gs4 gs4Var;
        gs4 gs4Var2;
        try {
            gs4Var = null;
            if (!bp6.a.contains(gs4.class)) {
                try {
                    gs4Var2 = gs4.f;
                } catch (Throwable th) {
                    bp6.a(gs4.class, th);
                }
                if (gs4Var2 == null) {
                    gs4 gs4Var3 = new gs4(0);
                    if (!bp6.a.contains(gs4.class)) {
                        try {
                            gs4.f = gs4Var3;
                        } catch (Throwable th2) {
                            bp6.a(gs4.class, th2);
                        }
                    }
                }
                if (!bp6.a.contains(gs4.class)) {
                    try {
                        gs4Var = gs4.f;
                    } catch (Throwable th3) {
                        bp6.a(gs4.class, th3);
                    }
                }
                if (gs4Var != null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            }
            gs4Var2 = null;
            if (gs4Var2 == null) {
            }
            if (!bp6.a.contains(gs4.class)) {
            }
            if (gs4Var != null) {
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return gs4Var;
    }

    @Override // defpackage.b0q
    public Object B(aaq aaqVar) {
        aaqVar.getClass();
        return aaqVar.getId();
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return yc5Var.a;
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        throw null;
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return xc5Var.a;
    }

    @Override // defpackage.dup
    public ocg I(long j2, xof xofVar, jx7 jx7Var) {
        float L = jx7Var.L(jp4.a);
        return new ayj(new ynn(0.0f, -L, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) + L));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(oq oqVar, cg6 cg6Var) {
        fof fofVar;
        int i2;
        if (cg6Var instanceof fof) {
            fofVar = (fof) cg6Var;
            int i3 = fofVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fofVar.m = i3 - Integer.MIN_VALUE;
                Object obj = fofVar.k;
                Object obj2 = nm6.a;
                i2 = fofVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    ay ayVar = (ay) hof.i.getValue();
                    fofVar.j = oqVar;
                    fofVar.m = 1;
                    obj = ayVar.b(oqVar, fofVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqVar = fofVar.j;
                    qgg.h0(obj);
                }
                mq mqVar = (mq) obj;
                oqVar.getClass();
                mqVar.getClass();
                return Boolean.valueOf(oqVar.f() != mqVar);
            }
        }
        fofVar = new fof(this, cg6Var);
        Object obj3 = fofVar.k;
        Object obj22 = nm6.a;
        i2 = fofVar.m;
        if (i2 != 0) {
        }
        mq mqVar2 = (mq) obj3;
        oqVar.getClass();
        mqVar2.getClass();
        return Boolean.valueOf(oqVar.f() != mqVar2);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            AtomicBoolean atomicBoolean = vee.a;
            if (bp6.a.contains(vee.class)) {
                return;
            }
            try {
                vee.a.set(true);
                vee.a();
            } catch (Throwable th) {
                bp6.a(vee.class, th);
            }
        }
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        g1qVar.getClass();
        return g1qVar.getId();
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        return w3dVar.a.a();
    }

    @Override // defpackage.gn3
    public byte[] b(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.r26
    public q26 c() {
        return new b3i(18);
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return w6uVar.a;
    }

    @Override // defpackage.spp
    public bpp f(ddl ddlVar, JSONObject jSONObject) {
        return v(ddlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0097, code lost:
    
        if ((r11 != null ? r11.booleanValue() : false) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(oq oqVar, cg6 cg6Var, List list) {
        dof dofVar;
        int i2;
        Object next;
        mqs mqsVar;
        Object J;
        List list2;
        boolean z;
        Object obj;
        int indexOf;
        Object obj2;
        oq oqVar2 = oqVar;
        if (cg6Var instanceof dof) {
            dofVar = (dof) cg6Var;
            int i3 = dofVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dofVar.o = i3 - Integer.MIN_VALUE;
                Object obj3 = dofVar.m;
                Object obj4 = nm6.a;
                i2 = dofVar.o;
                if (i2 != 0) {
                    qgg.h0(obj3);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        mqs mqsVar2 = (mqs) obj5;
                        mvn mvnVar = hof.g;
                        Long a = E().a(mqsVar2.a);
                        long longValue = a != null ? a.longValue() : -1L;
                        if (longValue <= 0) {
                            z = false;
                            if (longValue == 0) {
                                r1l E = E();
                                E.getClass();
                                Boolean d2 = E.d(mqsVar2.a);
                            }
                            if (!z) {
                                arrayList.add(obj5);
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            mqs mqsVar3 = (mqs) next;
                            mvn mvnVar2 = hof.g;
                            r1l E2 = E();
                            E2.getClass();
                            mqsVar3.getClass();
                            String str = mqsVar3.a;
                            d5l d5lVar = E2.a;
                            d5lVar.getClass();
                            str.getClass();
                            d5lVar.f.await();
                            l1l l1lVar = (l1l) d5lVar.d.get(str);
                            Long valueOf = l1lVar != null ? Long.valueOf(l1lVar.d) : null;
                            long longValue2 = currentTimeMillis - (valueOf != null ? valueOf.longValue() : Long.MAX_VALUE);
                            do {
                                Object next2 = it.next();
                                mqs mqsVar4 = (mqs) next2;
                                mvn mvnVar3 = hof.g;
                                r1l E3 = E();
                                E3.getClass();
                                mqsVar4.getClass();
                                String str2 = mqsVar4.a;
                                d5l d5lVar2 = E3.a;
                                d5lVar2.getClass();
                                str2.getClass();
                                d5lVar2.f.await();
                                l1l l1lVar2 = (l1l) d5lVar2.d.get(str2);
                                Long valueOf2 = l1lVar2 != null ? Long.valueOf(l1lVar2.d) : null;
                                long longValue3 = currentTimeMillis - (valueOf2 != null ? valueOf2.longValue() : Long.MAX_VALUE);
                                if (longValue2 > longValue3) {
                                    next = next2;
                                    longValue2 = longValue3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    mqsVar = (mqs) next;
                    dofVar.j = oqVar2;
                    dofVar.k = list;
                    dofVar.l = mqsVar;
                    dofVar.o = 1;
                    J = J(oqVar2, dofVar);
                    if (J == obj4) {
                        return obj4;
                    }
                    list2 = list;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqs mqsVar5 = dofVar.l;
                    list2 = dofVar.k;
                    oq oqVar3 = dofVar.j;
                    qgg.h0(obj3);
                    mqsVar = mqsVar5;
                    oqVar2 = oqVar3;
                    J = obj3;
                }
                boolean booleanValue = ((Boolean) J).booleanValue();
                if (mqsVar != null) {
                    indexOf = k(list2, booleanValue);
                } else if (H(mqsVar)) {
                    indexOf = list2.indexOf(mqsVar);
                } else {
                    List list3 = !booleanValue ? list2 : null;
                    if (list3 == null) {
                        list3 = CollectionsKt.j0(list2);
                    }
                    if (cof.a[oqVar2.d().ordinal()] == 1) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next3 = it2.next();
                            mvn mvnVar4 = hof.g;
                            if (H((mqs) next3)) {
                                obj2 = next3;
                                break;
                            }
                        }
                        mqs mqsVar6 = (mqs) obj2;
                        indexOf = mqsVar6 != null ? list2.indexOf(mqsVar6) : k(list2, booleanValue);
                    } else {
                        Iterator it3 = list3.subList(list3.indexOf(mqsVar) + 1, list3.size()).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next4 = it3.next();
                            mvn mvnVar5 = hof.g;
                            if (H((mqs) next4)) {
                                obj = next4;
                                break;
                            }
                        }
                        mqs mqsVar7 = (mqs) obj;
                        indexOf = mqsVar7 != null ? list2.indexOf(mqsVar7) : k(list2, booleanValue);
                    }
                }
                return new Integer(indexOf);
            }
        }
        dofVar = new dof(this, cg6Var);
        Object obj32 = dofVar.m;
        Object obj42 = nm6.a;
        i2 = dofVar.o;
        if (i2 != 0) {
        }
        boolean booleanValue2 = ((Boolean) J).booleanValue();
        if (mqsVar != null) {
        }
        return new Integer(indexOf);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 2:
                iocVar.getClass();
                return null;
            default:
                iocVar.getClass();
                return j9n.a;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 2:
                szuVar.getClass();
                jzs jzsVar = szuVar.l;
                if (swf.V(jzsVar.g)) {
                    return jzsVar;
                }
                return null;
            default:
                szuVar.getClass();
                return i9n.a;
        }
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        Intent intent = (Intent) ((Bundle) task.h()).getParcelable("notification_data");
        if (intent != null) {
            return new kq4(intent);
        }
        return null;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 2:
                y4dVar.getClass();
                return null;
            default:
                y4dVar.getClass();
                return j9n.a;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 2:
                maqVar.getClass();
                f5q k2 = maqVar.k();
                if (k2 instanceof bbq) {
                    faq b2 = maqVar.b();
                    if (swf.V(rvf.D(b2))) {
                        return b2;
                    }
                } else if (!(k2 instanceof s9q) && !(k2 instanceof baq) && !(k2 instanceof oaq) && !(k2 instanceof taq)) {
                    b6e.s();
                }
                return null;
            default:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    return i9n.a;
                }
                boolean z = maqVar instanceof eaq;
                j9n j9nVar = j9n.a;
                if (z || (maqVar instanceof raq) || (maqVar instanceof vaq)) {
                    return j9nVar;
                }
                b6e.s();
                return null;
        }
    }

    public JSONArray r(String str, List list) {
        boolean d2;
        Set set = bp6.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList y0 = CollectionsKt.y0(list);
            aib.b(y0);
            boolean z = false;
            if (!set.contains(this)) {
                try {
                    n8c f2 = q8c.f(str, false);
                    if (f2 != null) {
                        z = f2.a;
                    }
                } catch (Throwable th) {
                    bp6.a(this, th);
                }
            }
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                ht0 ht0Var = (ht0) it.next();
                String str2 = ht0Var.e;
                JSONObject jSONObject = ht0Var.a;
                if (str2 == null) {
                    d2 = true;
                } else {
                    String jSONObject2 = jSONObject.toString();
                    jSONObject2.getClass();
                    d2 = Intrinsics.d(ehv.b(jSONObject2), str2);
                }
                if (d2) {
                    boolean z2 = ht0Var.b;
                    if (!z2 || (z2 && z)) {
                        jSONArray.put(jSONObject);
                    }
                } else {
                    ht0Var.toString();
                    HashSet hashSet = j3c.a;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            bp6.a(this, th2);
            return null;
        }
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        d0tVar.getClass();
        return StationId.e(d0tVar.a).h();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 2:
                t1qVar.getClass();
                z3q z3qVar = t1qVar.a;
                if (z3qVar instanceof u1q) {
                    return t1qVar.c;
                }
                if (!(z3qVar instanceof c1q) && !(z3qVar instanceof e1q) && !(z3qVar instanceof r1q) && !(z3qVar instanceof h1q) && !(z3qVar instanceof k1q) && !(z3qVar instanceof a2q)) {
                    b6e.s();
                }
                return null;
            default:
                t1qVar.getClass();
                return j9n.a;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 2:
                u7uVar.getClass();
                return null;
            default:
                u7uVar.getClass();
                return j9n.a;
        }
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return bd5Var.getId();
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        aouVar.getClass();
        if (aouVar instanceof tnu) {
            return ((tnu) aouVar).b;
        }
        if (aouVar instanceof unu) {
            return ((unu) aouVar).b;
        }
        if (aouVar instanceof znu) {
            return String.valueOf(((znu) aouVar).c());
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0059, code lost:
    
        if (r2 == r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(se5 se5Var, List list, cg6 cg6Var) {
        eof eofVar;
        int i2;
        List list2;
        int i3;
        int i4;
        oq a;
        Object P;
        int i5;
        List list3;
        se5 se5Var2;
        int i6;
        oq a2;
        hyn hynVar;
        se5 se5Var3 = se5Var;
        if (cg6Var instanceof eof) {
            eofVar = (eof) cg6Var;
            int i7 = eofVar.p;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eofVar.p = i7 - Integer.MIN_VALUE;
                Object obj = eofVar.n;
                Object obj2 = nm6.a;
                i2 = eofVar.p;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (list != null) {
                        list2 = list;
                        if (list2.isEmpty()) {
                            return null;
                        }
                        tb tbVar = se5Var3.k;
                        mqs mqsVar = se5Var3.g;
                        oq a3 = tbVar.a();
                        int i8 = (a3 == null || !a4g.A(a3)) ? 0 : 1;
                        if (i8 == 0) {
                            int i9 = se5Var3.f;
                            if (i9 == 0) {
                                i3 = se5Var3.c.a.getBoolean("is_shuffle", false);
                            } else {
                                int D = ouj.D(i9);
                                if (D == 0) {
                                    i3 = 1;
                                } else if (D != 1) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            eofVar.j = se5Var3;
                            eofVar.k = list2;
                            eofVar.l = i8;
                            eofVar.m = i3;
                            eofVar.p = 2;
                            i4 = se5Var3.h;
                            tb tbVar2 = se5Var3.k;
                            a = tbVar2.a();
                            if (a != null || mqsVar != null || i4 != -1 || (a2 = tbVar2.a()) == null || !u2x.I(a2)) {
                                if (i4 == -1) {
                                    if (i4 < list2.size()) {
                                        if (mqsVar != null && !Intrinsics.d((mqs) list2.get(i4), mqsVar)) {
                                            Integer num = new Integer(list2.indexOf(mqsVar));
                                            int intValue = num.intValue();
                                            mvn mvnVar = hof.g;
                                            String X = CollectionsKt.X(list2, StringUtils.COMMA, null, null, new xjf(6), 30);
                                            StringBuilder l2 = dfi.l("simpleQueueOrNone(): track at position ", i4, intValue, " not matched with its actual position ", " in list [");
                                            l2.append(X);
                                            l2.append("]. queue: ");
                                            l2.append(se5Var3);
                                            Assertions.throwOrSkip$default(new FailedAssertionException(l2.toString()), null, 2, null);
                                            Integer num2 = num.intValue() >= 0 ? num : null;
                                            if (num2 != null) {
                                                i4 = num2.intValue();
                                            }
                                        }
                                        P = new Integer(i4);
                                    } else {
                                        StringBuilder r = k5r.r(i4, "simpleQueueOrNone(): track at position ", " not found in list [", CollectionsKt.X(list2, StringUtils.COMMA, null, null, new xjf(5), 30), "]. queue: ");
                                        r.append(se5Var3);
                                        su4.s(2, null, r.toString(), null);
                                        P = P(a, eofVar, list2);
                                    }
                                } else if (mqsVar != null) {
                                    i4 = list2.indexOf(mqsVar);
                                    if (i4 == -1) {
                                        StringBuilder m2 = f1d.m("simpleQueueOrNone(): track ", mqsVar.a, " not found in list [", CollectionsKt.X(list2, StringUtils.COMMA, null, null, new xjf(4), 30), "]. queue: ");
                                        m2.append(se5Var3);
                                        su4.s(2, null, m2.toString(), null);
                                        P = P(a, eofVar, list2);
                                    }
                                    P = new Integer(i4);
                                } else {
                                    P = P(a, eofVar, list2);
                                }
                                int intValue2 = ((Number) obj).intValue();
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (se5Var2.g == null) {
                                }
                                if (i5 == 0) {
                                }
                                return new hof(r7, r8, r9, hynVar, (mqs) list3.get(intValue2), intValue2);
                            }
                            P = j(a, eofVar, list2);
                            if (P != obj2) {
                                i5 = i8;
                                list3 = list2;
                                obj = P;
                                se5Var2 = se5Var3;
                                i6 = i3;
                                int intValue22 = ((Number) obj).intValue();
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (se5Var2.g == null) {
                                }
                                if (i5 == 0) {
                                }
                                return new hof(r7, r8, r9, hynVar, (mqs) list3.get(intValue22), intValue22);
                            }
                            return obj2;
                        }
                        i3 = 0;
                        eofVar.j = se5Var3;
                        eofVar.k = list2;
                        eofVar.l = i8;
                        eofVar.m = i3;
                        eofVar.p = 2;
                        i4 = se5Var3.h;
                        tb tbVar22 = se5Var3.k;
                        a = tbVar22.a();
                        if (a != null) {
                        }
                        if (i4 == -1) {
                        }
                        int intValue222 = ((Number) obj).intValue();
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (se5Var2.g == null) {
                        }
                        if (i5 == 0) {
                        }
                        return new hof(r7, r8, r9, hynVar, (mqs) list3.get(intValue222), intValue222);
                    }
                    eofVar.j = se5Var3;
                    eofVar.p = 1;
                    obj = se5Var3.d.m(eofVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = eofVar.m;
                        i5 = eofVar.l;
                        list3 = eofVar.k;
                        se5Var2 = eofVar.j;
                        qgg.h0(obj);
                        int intValue2222 = ((Number) obj).intValue();
                        boolean z = i5 == 0;
                        boolean z2 = i6 == 0;
                        boolean z3 = se5Var2.g == null || se5Var2.h != -1;
                        if (i5 == 0) {
                            hynVar = hyn.f;
                        } else {
                            hynVar = se5Var2.e;
                            if (hynVar == null) {
                                hynVar = se5Var2.c.a();
                            }
                        }
                        return new hof(z, z2, z3, hynVar, (mqs) list3.get(intValue2222), intValue2222);
                    }
                    se5Var3 = eofVar.j;
                    qgg.h0(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                }
            }
        }
        eofVar = new eof(this, cg6Var);
        Object obj3 = eofVar.n;
        Object obj22 = nm6.a;
        i2 = eofVar.p;
        if (i2 != 0) {
        }
        list2 = (List) obj3;
        if (list2.isEmpty()) {
        }
    }

    @Override // defpackage.r26
    public void g(us5 us5Var) {
    }

    @Override // defpackage.r26
    public void h(boolean z) {
    }

    @Override // defpackage.r26
    public void a(List list, at5 at5Var) {
    }

    @Override // defpackage.r26
    public void e(us5 us5Var, aw5 aw5Var) {
    }
}
