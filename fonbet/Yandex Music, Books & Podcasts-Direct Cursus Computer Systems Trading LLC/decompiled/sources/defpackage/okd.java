package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import defpackage.hmm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class okd {
    public static wb7 f;
    public final Context a;
    public final AppWidgetManager b;
    public final jyr c = btf.b(new ypb(5, this));
    public static final hkd d = new hkd();
    public static final gmm e = bmm.a("GlanceAppWidgetManager", null, 14);
    public static final hmm.a g = new hmm.a("list::Providers");

    public okd(Context context) {
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Class cls, cg6 cg6Var) {
        lkd lkdVar;
        int i;
        okd okdVar;
        String canonicalName;
        if (cg6Var instanceof lkd) {
            lkdVar = (lkd) cg6Var;
            int i2 = lkdVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lkdVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lkdVar.l;
                nm6 nm6Var = nm6.a;
                i = lkdVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    lkdVar.j = this;
                    lkdVar.k = cls;
                    lkdVar.n = 1;
                    obj = b(lkdVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    okdVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cls = lkdVar.k;
                    okdVar = lkdVar.j;
                    qgg.h0(obj);
                }
                ikd ikdVar = (ikd) obj;
                canonicalName = cls.getCanonicalName();
                if (canonicalName != null) {
                    xq0.x("no canonical provider name");
                    return null;
                }
                List list = (List) ikdVar.b.get(canonicalName);
                if (list == null) {
                    return c5b.a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int[] appWidgetIds = okdVar.b.getAppWidgetIds((ComponentName) it.next());
                    ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
                    for (int i3 : appWidgetIds) {
                        arrayList2.add(new rv0(i3));
                    }
                    z75.t(arrayList, arrayList2);
                }
                return arrayList;
            }
        }
        lkdVar = new lkd(this, cg6Var);
        Object obj2 = lkdVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lkdVar.n;
        if (i != 0) {
        }
        ikd ikdVar2 = (ikd) obj2;
        canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        mkd mkdVar;
        Object obj;
        int i;
        hmm.a aVar;
        okd okdVar;
        okd okdVar2;
        hmm hmmVar;
        okd okdVar3;
        Set<String> set;
        if (cg6Var instanceof mkd) {
            mkdVar = (mkd) cg6Var;
            int i2 = mkdVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mkdVar.n = i2 - Integer.MIN_VALUE;
                obj = mkdVar.l;
                nm6 nm6Var = nm6.a;
                i = mkdVar.n;
                hkd hkdVar = d;
                aVar = g;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) this.c.getValue()).getData();
                    mkdVar.j = this;
                    mkdVar.k = this;
                    mkdVar.n = 1;
                    obj = zsd.g0(data, mkdVar);
                    if (obj != nm6Var) {
                        okdVar = this;
                        okdVar2 = okdVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    okdVar3 = mkdVar.j;
                    qgg.h0(obj);
                    hmmVar = (hmm) obj;
                    okdVar = okdVar3;
                    String packageName = okdVar.a.getPackageName();
                    set = (Set) hmmVar.a(aVar);
                    if (set == null) {
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        return new ikd(e5bVar, e5bVar);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str : set) {
                        ComponentName componentName = new ComponentName(packageName, str);
                        String str2 = (String) ((lpi) hmmVar).a.get(hkd.a(hkdVar, str));
                        Pair pair = str2 == null ? null : new Pair(componentName, str2);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    Map n = uah.n(arrayList);
                    Set<Map.Entry> entrySet = n.entrySet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : entrySet) {
                        String str3 = (String) entry.getValue();
                        Object obj2 = linkedHashMap.get(str3);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str3, obj2);
                        }
                        ((List) obj2).add((ComponentName) entry.getKey());
                    }
                    return new ikd(n, linkedHashMap);
                }
                okdVar = mkdVar.k;
                okdVar2 = mkdVar.j;
                qgg.h0(obj);
                if (((hmm) obj).a(aVar) == null) {
                    obj = null;
                }
                hmmVar = (hmm) obj;
                if (hmmVar == null) {
                    mkdVar.j = okdVar;
                    mkdVar.k = null;
                    mkdVar.n = 2;
                    List<AppWidgetProviderInfo> installedProviders = okdVar2.b.getInstalledProviders();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : installedProviders) {
                        if (Intrinsics.d(((AppWidgetProviderInfo) obj3).provider.getPackageName(), okdVar2.a.getPackageName())) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) it.next();
                        hkdVar.getClass();
                        Object newInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                        pkd pkdVar = newInstance instanceof pkd ? (pkd) newInstance : null;
                        if (pkdVar != null) {
                            arrayList3.add(pkdVar);
                        }
                    }
                    obj = ((wb7) okdVar2.c.getValue()).a(new jkd(arrayList3, null), mkdVar);
                    if (obj != nm6Var) {
                        okdVar3 = okdVar;
                        hmmVar = (hmm) obj;
                        okdVar = okdVar3;
                    }
                    return nm6Var;
                }
                String packageName2 = okdVar.a.getPackageName();
                set = (Set) hmmVar.a(aVar);
                if (set == null) {
                }
            }
        }
        mkdVar = new mkd(this, cg6Var);
        obj = mkdVar.l;
        nm6 nm6Var2 = nm6.a;
        i = mkdVar.n;
        hkd hkdVar2 = d;
        aVar = g;
        if (i != 0) {
        }
        if (((hmm) obj).a(aVar) == null) {
        }
        hmmVar = (hmm) obj;
        if (hmmVar == null) {
        }
        String packageName22 = okdVar.a.getPackageName();
        set = (Set) hmmVar.a(aVar);
        if (set == null) {
        }
    }

    public final Object c(pkd pkdVar, pv0 pv0Var, fzb fzbVar) {
        d.getClass();
        String canonicalName = pkdVar.getClass().getCanonicalName();
        if (canonicalName == null) {
            xq0.x("no receiver name");
            return null;
        }
        String canonicalName2 = pv0Var.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object a = ((wb7) this.c.getValue()).a(new nkd(canonicalName, canonicalName2, null), fzbVar);
            return a == nm6.a ? a : Unit.a;
        }
        xq0.x("no provider name");
        return null;
    }
}
