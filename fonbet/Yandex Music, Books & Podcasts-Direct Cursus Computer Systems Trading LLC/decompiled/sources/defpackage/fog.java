package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.gson.JsonObject;
import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class fog {
    public final z66 a;
    public final y8s b;
    public final ime c;

    public fog() {
        l18 l18Var = l18.b;
        bdt I = hag.I(z66.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.a = (z66) qdcVar.C(I);
        bdt I2 = hag.I(y8s.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.b = (y8s) qdcVar2.C(I2);
        this.c = new ime(6);
    }

    public static String d(String str) {
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        int length = upperCase.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(upperCase.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String replaceAll = Normalizer.normalize(upperCase.subSequence(i, length + 1).toString(), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        replaceAll.getClass();
        return hrg.q("%", new Regex(StringUtil.SPACE).replace(replaceAll, "%"), "%");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        if (r1 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014c A[LOOP:0: B:12:0x0146->B:14:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, String str2, boolean z, xdh xdhVar, cg6 cg6Var) {
        cog cogVar;
        Object obj;
        nm6 nm6Var;
        int i;
        long a;
        String d;
        String str3;
        xdh xdhVar2;
        boolean z2;
        long j;
        xdh xdhVar3;
        Iterator it;
        boolean contains;
        l18 l18Var = l18.b;
        if (cg6Var instanceof cog) {
            cogVar = (cog) cg6Var;
            int i2 = cogVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cogVar.q = i2 - Integer.MIN_VALUE;
                obj = cogVar.o;
                nm6Var = nm6.a;
                i = cogVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str2)) {
                        return c5b.a;
                    }
                    gis.a.getClass();
                    rdi.a.getClass();
                    a = rdi.a();
                    d = d(str2);
                    bdt I = hag.I(g0p.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String a2 = g0p.a();
                    bdt I2 = hag.I(i5h.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    i5h i5hVar = (i5h) qdcVar2.C(I2);
                    str3 = str;
                    cogVar.j = str3;
                    xdhVar2 = xdhVar;
                    cogVar.k = xdhVar2;
                    cogVar.l = d;
                    z2 = z;
                    cogVar.m = z2;
                    cogVar.n = a;
                    cogVar.q = 1;
                    obj = i5hVar.b(a2, cogVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = cogVar.n;
                        xdhVar3 = cogVar.k;
                        qgg.h0(obj);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(q7g.T((h4m) it.next()));
                        }
                        if (gut.h1(this.a)) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                mqs mqsVar = (mqs) next;
                                bdt I3 = hag.I(h0p.class);
                                qdc qdcVar3 = l18Var.a;
                                qdcVar3.getClass();
                                if (mqsVar == null) {
                                    su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                                    contains = false;
                                } else {
                                    bdt I4 = hag.I(uaa.class);
                                    qdc qdcVar4 = l18Var.a;
                                    qdcVar4.getClass();
                                    contains = ((lja) ((e6q) ((uaa) qdcVar4.C(I4))).e.getValue()).a.contains(mqsVar.a);
                                }
                                if (contains) {
                                    arrayList2.add(next);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        h6i h6iVar = h6i.b;
                        xdhVar3.getClass();
                        String str4 = (String) xdhVar3.a;
                        c0p c0pVar = (c0p) xdhVar3.c;
                        apo apoVar = (apo) xdhVar3.b;
                        p0p p0pVar = (p0p) apoVar.c;
                        String str5 = (String) apoVar.b;
                        t1p t1pVar = (t1p) xdhVar3.d;
                        String name = t1pVar != null ? t1pVar.name() : null;
                        long f = nsa.f(fis.b(j));
                        str4.getClass();
                        c0pVar.getClass();
                        p0pVar.getClass();
                        h6iVar.getClass();
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.u("query", str4);
                        jsonObject.u("context", c0pVar.name());
                        jsonObject.u("entity", p0pVar.name());
                        jsonObject.u("entityId", str5);
                        jsonObject.u("filterId", name);
                        jsonObject.s(Long.valueOf(f), "time");
                        h6iVar.e().b(h6i.h(g6i.LocalSearchElapsed, jsonObject));
                        return arrayList;
                    }
                    a = cogVar.n;
                    boolean z3 = cogVar.m;
                    d = cogVar.l;
                    xdh xdhVar4 = cogVar.k;
                    String str6 = cogVar.j;
                    qgg.h0(obj);
                    xdhVar2 = xdhVar4;
                    str3 = str6;
                    z2 = z3;
                }
                f4m M = ((MainDatabase) obj).M();
                cogVar.j = null;
                cogVar.k = xdhVar2;
                cogVar.l = null;
                cogVar.m = z2;
                cogVar.n = a;
                cogVar.q = 2;
                ysr ysrVar = new ysr("playlist_view");
                um4 um4Var = new um4(pgp.a);
                um4Var.i("playlist_id=?", xz0.X(new Object[]{str3}));
                if (z2) {
                    um4Var.i(f4m.r(), xz0.X(new Object[0]));
                }
                um4Var.i("name_surrogate LIKE ? OR artist_name_surrogate LIKE ?", xz0.X(new Object[]{d, d}));
                tt0.K(ysrVar, um4Var);
                ysrVar.f = !z2 ? "timestamp DESC, position_playlist" : "position_playlist";
                atn a3 = ysrVar.a();
                g4m g4mVar = (g4m) M.b;
                g4mVar.getClass();
                TreeMap treeMap = afo.h;
                j6e a4 = wyf.x(a3).a();
                obj = up6.G(g4mVar.a, true, false, new g20((String) a4.a, a4, 8), cogVar);
                if (obj != nm6Var) {
                    j = a;
                    xdhVar3 = xdhVar2;
                    List list2 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    if (gut.h1(this.a)) {
                    }
                    h6i h6iVar2 = h6i.b;
                    xdhVar3.getClass();
                    String str42 = (String) xdhVar3.a;
                    c0p c0pVar2 = (c0p) xdhVar3.c;
                    apo apoVar2 = (apo) xdhVar3.b;
                    p0p p0pVar2 = (p0p) apoVar2.c;
                    String str52 = (String) apoVar2.b;
                    t1p t1pVar2 = (t1p) xdhVar3.d;
                    if (t1pVar2 != null) {
                    }
                    long f2 = nsa.f(fis.b(j));
                    str42.getClass();
                    c0pVar2.getClass();
                    p0pVar2.getClass();
                    h6iVar2.getClass();
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.u("query", str42);
                    jsonObject2.u("context", c0pVar2.name());
                    jsonObject2.u("entity", p0pVar2.name());
                    jsonObject2.u("entityId", str52);
                    jsonObject2.u("filterId", name);
                    jsonObject2.s(Long.valueOf(f2), "time");
                    h6iVar2.e().b(h6i.h(g6i.LocalSearchElapsed, jsonObject2));
                    return arrayList3;
                }
                return nm6Var;
            }
        }
        cogVar = new cog(this, cg6Var);
        obj = cogVar.o;
        nm6Var = nm6.a;
        i = cogVar.q;
        if (i != 0) {
        }
        f4m M2 = ((MainDatabase) obj).M();
        cogVar.j = null;
        cogVar.k = xdhVar2;
        cogVar.l = null;
        cogVar.m = z2;
        cogVar.n = a;
        cogVar.q = 2;
        ysr ysrVar2 = new ysr("playlist_view");
        um4 um4Var2 = new um4(pgp.a);
        um4Var2.i("playlist_id=?", xz0.X(new Object[]{str3}));
        if (z2) {
        }
        um4Var2.i("name_surrogate LIKE ? OR artist_name_surrogate LIKE ?", xz0.X(new Object[]{d, d}));
        tt0.K(ysrVar2, um4Var2);
        ysrVar2.f = !z2 ? "timestamp DESC, position_playlist" : "position_playlist";
        atn a32 = ysrVar2.a();
        g4m g4mVar2 = (g4m) M2.b;
        g4mVar2.getClass();
        TreeMap treeMap2 = afo.h;
        j6e a42 = wyf.x(a32).a();
        obj = up6.G(g4mVar2.a, true, false, new g20((String) a42.a, a42, 8), cogVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, xdh xdhVar, cg6 cg6Var) {
        dog dogVar;
        int i;
        xdh xdhVar2;
        long j;
        if (cg6Var instanceof dog) {
            dogVar = (dog) cg6Var;
            int i2 = dogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = dogVar.l;
                nm6 nm6Var = nm6.a;
                i = dogVar.n;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str2)) {
                        return c5b.a;
                    }
                    gis.a.getClass();
                    rdi.a.getClass();
                    long a = rdi.a();
                    dogVar.j = xdhVar;
                    dogVar.k = a;
                    dogVar.n = 1;
                    y8s y8sVar = this.b;
                    y8sVar.getClass();
                    Object V = x97.V(dm6.b, new x8s(y8sVar, str, str2, objArr == true ? 1 : 0, 0), dogVar);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    obj = V;
                    xdhVar2 = xdhVar;
                    j = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = dogVar.k;
                    xdhVar2 = dogVar.j;
                    qgg.h0(obj);
                }
                h6i h6iVar = h6i.b;
                xdhVar2.getClass();
                String str3 = (String) xdhVar2.a;
                c0p c0pVar = (c0p) xdhVar2.c;
                apo apoVar = (apo) xdhVar2.b;
                p0p p0pVar = (p0p) apoVar.c;
                String str4 = (String) apoVar.b;
                t1p t1pVar = (t1p) xdhVar2.d;
                String name = t1pVar != null ? t1pVar.name() : null;
                long f = nsa.f(fis.b(j));
                str3.getClass();
                c0pVar.getClass();
                p0pVar.getClass();
                h6iVar.getClass();
                JsonObject jsonObject = new JsonObject();
                jsonObject.u("query", str3);
                jsonObject.u("context", c0pVar.name());
                jsonObject.u("entity", p0pVar.name());
                jsonObject.u("entityId", str4);
                jsonObject.u("filterId", name);
                jsonObject.s(Long.valueOf(f), "time");
                h6iVar.e().b(h6i.h(g6i.LocalCollectionSearchElapsed, jsonObject));
                return obj;
            }
        }
        dogVar = new dog(this, cg6Var);
        Object obj2 = dogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = dogVar.n;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        h6i h6iVar2 = h6i.b;
        xdhVar2.getClass();
        String str32 = (String) xdhVar2.a;
        c0p c0pVar2 = (c0p) xdhVar2.c;
        apo apoVar2 = (apo) xdhVar2.b;
        p0p p0pVar2 = (p0p) apoVar2.c;
        String str42 = (String) apoVar2.b;
        t1p t1pVar2 = (t1p) xdhVar2.d;
        if (t1pVar2 != null) {
        }
        long f2 = nsa.f(fis.b(j));
        str32.getClass();
        c0pVar2.getClass();
        p0pVar2.getClass();
        h6iVar2.getClass();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.u("query", str32);
        jsonObject2.u("context", c0pVar2.name());
        jsonObject2.u("entity", p0pVar2.name());
        jsonObject2.u("entityId", str42);
        jsonObject2.u("filterId", name);
        jsonObject2.s(Long.valueOf(f2), "time");
        h6iVar2.e().b(h6i.h(g6i.LocalCollectionSearchElapsed, jsonObject2));
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, xdh xdhVar, cg6 cg6Var) {
        eog eogVar;
        int i;
        xdh xdhVar2;
        long j;
        if (cg6Var instanceof eog) {
            eogVar = (eog) cg6Var;
            int i2 = eogVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eogVar.n = i2 - Integer.MIN_VALUE;
                Object obj = eogVar.l;
                nm6 nm6Var = nm6.a;
                i = eogVar.n;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    if (StringsKt.U(str2)) {
                        return c5b.a;
                    }
                    gis.a.getClass();
                    rdi.a.getClass();
                    long a = rdi.a();
                    eogVar.j = xdhVar;
                    eogVar.k = a;
                    eogVar.n = 1;
                    y8s y8sVar = this.b;
                    y8sVar.getClass();
                    Object V = x97.V(dm6.b, new x8s(y8sVar, str, str2, objArr == true ? 1 : 0, 1), eogVar);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    obj = V;
                    xdhVar2 = xdhVar;
                    j = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = eogVar.k;
                    xdhVar2 = eogVar.j;
                    qgg.h0(obj);
                }
                h6i h6iVar = h6i.b;
                xdhVar2.getClass();
                String str3 = (String) xdhVar2.a;
                c0p c0pVar = (c0p) xdhVar2.c;
                apo apoVar = (apo) xdhVar2.b;
                p0p p0pVar = (p0p) apoVar.c;
                String str4 = (String) apoVar.b;
                t1p t1pVar = (t1p) xdhVar2.d;
                String name = t1pVar != null ? t1pVar.name() : null;
                long f = nsa.f(fis.b(j));
                str3.getClass();
                c0pVar.getClass();
                p0pVar.getClass();
                h6iVar.getClass();
                JsonObject jsonObject = new JsonObject();
                jsonObject.u("query", str3);
                jsonObject.u("context", c0pVar.name());
                jsonObject.u("entity", p0pVar.name());
                jsonObject.u("entityId", str4);
                jsonObject.u("filterId", name);
                jsonObject.s(Long.valueOf(f), "time");
                h6iVar.e().b(h6i.h(g6i.LocalCollectionSearchElapsed, jsonObject));
                return obj;
            }
        }
        eogVar = new eog(this, cg6Var);
        Object obj2 = eogVar.l;
        nm6 nm6Var2 = nm6.a;
        i = eogVar.n;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        h6i h6iVar2 = h6i.b;
        xdhVar2.getClass();
        String str32 = (String) xdhVar2.a;
        c0p c0pVar2 = (c0p) xdhVar2.c;
        apo apoVar2 = (apo) xdhVar2.b;
        p0p p0pVar2 = (p0p) apoVar2.c;
        String str42 = (String) apoVar2.b;
        t1p t1pVar2 = (t1p) xdhVar2.d;
        if (t1pVar2 != null) {
        }
        long f2 = nsa.f(fis.b(j));
        str32.getClass();
        c0pVar2.getClass();
        p0pVar2.getClass();
        h6iVar2.getClass();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.u("query", str32);
        jsonObject2.u("context", c0pVar2.name());
        jsonObject2.u("entity", p0pVar2.name());
        jsonObject2.u("entityId", str42);
        jsonObject2.u("filterId", name);
        jsonObject2.s(Long.valueOf(f2), "time");
        h6iVar2.e().b(h6i.h(g6i.LocalCollectionSearchElapsed, jsonObject2));
        return obj2;
    }
}
