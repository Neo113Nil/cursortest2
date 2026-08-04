package com.gamericefishpro.space.vb;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.appsflyer.AppsFlyerConversionListener;
import com.gamericefishpro.space.MainActivity;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.b2.m;
import com.gamericefishpro.space.b2.o;
import com.gamericefishpro.space.c1.d;
import com.gamericefishpro.space.d0.p;
import com.gamericefishpro.space.d4.e;
import com.gamericefishpro.space.d4.f;
import com.gamericefishpro.space.e4.h;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.f0.q;
import com.gamericefishpro.space.f0.w;
import com.gamericefishpro.space.f1.g;
import com.gamericefishpro.space.f1.v;
import com.gamericefishpro.space.h0.l0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.y1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.i9.g4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.v8.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c implements com.gamericefishpro.space.d4.c, e, com.gamericefishpro.space.e8.b, AppsFlyerConversionListener, d {
    public static volatile c i;
    public final /* synthetic */ int d;
    public Object e;

    public /* synthetic */ c(int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    public static l0 s(c cVar, int i2) {
        w wVar = (w) cVar.e;
        g gVarE = v.e();
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        g gVarH = v.h(gVarE);
        try {
            q qVar = (q) wVar.f.getValue();
            return wVar.p.a(i2, qVar.j, wVar.d, new p(i2, qVar));
        } finally {
            v.k(gVarE, gVarH, function1E);
        }
    }

    @Override // com.gamericefishpro.space.d4.e
    public ClipData a() {
        return ((ContentInfo) this.e).getClip();
    }

    @Override // com.gamericefishpro.space.d4.e
    public int b() {
        return ((ContentInfo) this.e).getFlags();
    }

    @Override // com.gamericefishpro.space.d4.c
    public f build() {
        return new f(new c(((ContentInfo.Builder) this.e).build()));
    }

    @Override // com.gamericefishpro.space.d4.e
    public ContentInfo c() {
        return (ContentInfo) this.e;
    }

    @Override // com.gamericefishpro.space.d4.c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.e).setLinkUri(uri);
    }

    @Override // com.gamericefishpro.space.d4.e
    public int e() {
        return ((ContentInfo) this.e).getSource();
    }

    @Override // com.gamericefishpro.space.d4.c
    public void f(int i2) {
        ((ContentInfo.Builder) this.e).setFlags(i2);
    }

    public void g(f0 f0Var) {
        if (!f0Var.H()) {
            com.gamericefishpro.space.e2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((y1) this.e).add(f0Var);
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        return new com.gamericefishpro.space.a8.c((Context) ((com.gamericefishpro.space.e4.g) this.e).d, new l(8), new com.gamericefishpro.space.lb.e(8), 5);
    }

    public long i(long j) {
        com.gamericefishpro.space.c2.b bVar = (com.gamericefishpro.space.c2.b) this.e;
        bVar.getClass();
        if (com.gamericefishpro.space.c3.p.b(j) <= 0.0f || com.gamericefishpro.space.c3.p.c(j) <= 0.0f) {
            com.gamericefishpro.space.e2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) com.gamericefishpro.space.c3.p.f(j)));
        }
        return y3.j(((com.gamericefishpro.space.c2.e) bVar.b).b(com.gamericefishpro.space.c3.p.b(j)), ((com.gamericefishpro.space.c2.e) bVar.c).b(com.gamericefishpro.space.c3.p.c(j)));
    }

    public h j(int i2) {
        return null;
    }

    public void k(String str) {
        com.gamericefishpro.space.pi.h hVar = ((com.gamericefishpro.space.e7.g) this.e).b;
        if (hVar == null || !hVar.w()) {
            ((com.gamericefishpro.space.e7.g) this.e).a.set(str);
            return;
        }
        ((com.gamericefishpro.space.e7.g) this.e).b = null;
        n nVar = com.gamericefishpro.space.oh.p.d;
        hVar.resumeWith(str);
    }

    public h l(int i2) {
        return null;
    }

    public void m() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme currentTheme = ((MainActivity) this.e).getTheme();
        currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            currentTheme.getDrawable(typedValue.resourceId);
        }
        currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
        t(currentTheme, typedValue);
    }

    public void n(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.e).notifyViewVisibilityChanged(view, i2, z);
        }
    }

    public boolean o(int i2, int i3, Bundle bundle) {
        return false;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMapI = m0.i(map);
        linkedHashMapI.put("player_id", ((com.gamericefishpro.space.e7.g) this.e).c);
        k(linkedHashMapI.toString());
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        k("{player_id=" + ((com.gamericefishpro.space.e7.g) this.e).c + ", af_attr_error=" + str + "}");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        k("{player_id=" + ((com.gamericefishpro.space.e7.g) this.e).c + ", af_error=" + str + "}");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map map) {
        LinkedHashMap linkedHashMapI = map != null ? m0.i(map) : new LinkedHashMap();
        linkedHashMapI.put("player_id", ((com.gamericefishpro.space.e7.g) this.e).c);
        k(linkedHashMapI.toString());
    }

    public g4 p(com.gamericefishpro.space.u6.c cVar, t tVar) {
        long jH;
        long j;
        boolean z;
        com.gamericefishpro.space.t.q qVar = (com.gamericefishpro.space.t.q) this.e;
        List list = (List) cVar.d;
        com.gamericefishpro.space.t.q qVar2 = new com.gamericefishpro.space.t.q(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            o oVar = (o) list.get(i2);
            long j2 = oVar.a;
            com.gamericefishpro.space.b2.n nVar = (com.gamericefishpro.space.b2.n) qVar.b(j2);
            if (nVar == null) {
                j = oVar.b;
                jH = oVar.d;
                z = false;
            } else {
                long j3 = nVar.a;
                boolean z2 = nVar.c;
                jH = tVar.H(nVar.b);
                j = j3;
                z = z2;
            }
            long j4 = oVar.a;
            List list2 = list;
            int i3 = size;
            qVar2.e(j4, new m(j4, oVar.b, oVar.d, oVar.e, oVar.f, j, jH, z, oVar.g, oVar.i, oVar.j, oVar.k));
            boolean z3 = oVar.e;
            if (z3) {
                qVar.e(j2, new com.gamericefishpro.space.b2.n(oVar.b, oVar.c, z3));
            } else {
                qVar.f(j2);
            }
            i2++;
            list = list2;
            size = i3;
        }
        g4 g4Var = new g4();
        g4Var.b = qVar2;
        g4Var.c = cVar;
        return g4Var;
    }

    public boolean q(f0 f0Var) {
        if (!f0Var.H()) {
            com.gamericefishpro.space.e2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((y1) this.e).remove(f0Var);
    }

    public ArrayList r(int i2) {
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.g0.v vVar = (com.gamericefishpro.space.g0.v) this.e;
        g gVarE = v.e();
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        g gVarH = v.h(gVarE);
        try {
            com.gamericefishpro.space.g0.l lVar = vVar.b ? vVar.c : (com.gamericefishpro.space.g0.l) vVar.e.getValue();
            if (lVar != null) {
                y yVar = new y();
                yVar.d = 1;
                List list = (List) lVar.k.invoke(Integer.valueOf(i2));
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Pair pair = (Pair) list.get(i3);
                    com.gamericefishpro.space.h0.m0 m0Var = vVar.o;
                    int iIntValue = ((Number) pair.d).intValue();
                    long j = ((com.gamericefishpro.space.c3.a) pair.e).a;
                    com.gamericefishpro.space.u6.c cVar = com.gamericefishpro.space.g0.v.w;
                    yVar = yVar;
                    arrayList.add(m0Var.a(iIntValue, j, false, new com.gamericefishpro.space.g0.t((ArrayList) null, yVar, list, i2, lVar)));
                }
                Unit unit = Unit.a;
            }
            return arrayList;
        } finally {
            v.k(gVarE, gVarH, function1E);
        }
    }

    @Override // com.gamericefishpro.space.d4.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.e).setExtras(bundle);
    }

    public void t(Resources.Theme currentTheme, TypedValue typedValue) {
        int i2;
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (!currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            return;
        }
        ((MainActivity) this.e).setTheme(i2);
    }

    public String toString() {
        switch (this.d) {
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.e) + "}";
            case 18:
                return ((y1) this.e).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(int i2, boolean z) {
        this.d = i2;
    }

    public c(int i2) {
        this.d = i2;
        switch (i2) {
            case 2:
                this.e = new com.gamericefishpro.space.t.q((Object) null);
                break;
            case 3:
                this.e = new com.gamericefishpro.space.c2.b();
                break;
            case 9:
                this.e = new com.gamericefishpro.space.e4.i(this);
                break;
            case 10:
                this.e = null;
                break;
            case 18:
                this.e = new y1(k.a);
                break;
            case 23:
                com.gamericefishpro.space.c1.c cVar = new com.gamericefishpro.space.c1.c();
                this.e = cVar;
                if (!cVar.e) {
                    if (cVar.i) {
                        com.gamericefishpro.space.d1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.i = true;
                    break;
                }
                break;
            case 29:
                this.e = new AtomicInteger(0);
                break;
            default:
                this.e = new HashSet();
                break;
        }
    }

    public c(com.gamericefishpro.space.e1.c cVar) {
        this.d = 20;
        this.e = new WeakReference(cVar);
    }

    public c(Runnable runnable) {
        this.d = 7;
        this.e = new CopyOnWriteArrayList();
        new HashMap();
    }

    public c(long[] jArr) {
        com.gamericefishpro.space.t.y yVar;
        int i2;
        this.d = 13;
        if (jArr != null) {
            long[] elements = Arrays.copyOf(jArr, jArr.length);
            yVar = new com.gamericefishpro.space.t.y(elements.length);
            int i3 = yVar.b;
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (i3 >= 0 && i3 <= (i2 = yVar.b)) {
                if (elements.length != 0) {
                    int length = i2 + elements.length;
                    long[] jArr2 = yVar.a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                        yVar.a = jArrCopyOf;
                    }
                    long[] jArr3 = yVar.a;
                    int i4 = yVar.b;
                    if (i3 != i4) {
                        u.e(jArr3, jArr3, elements.length + i3, i3, i4);
                    }
                    u.e(elements, jArr3, i3, 0, elements.length);
                    yVar.b += elements.length;
                }
            } else {
                com.gamericefishpro.space.u.a.d("");
                throw null;
            }
        } else {
            yVar = new com.gamericefishpro.space.t.y(16);
        }
        this.e = yVar;
    }

    public c(MainActivity activity) {
        this.d = 1;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e = activity;
    }

    public c(ContentInfo contentInfo) {
        this.d = 6;
        contentInfo.getClass();
        this.e = com.gamericefishpro.space.a4.b.i(contentInfo);
    }

    public c(ClipData clipData, int i2) {
        this.d = 5;
        this.e = com.gamericefishpro.space.a4.b.g(clipData, i2);
    }

    public void h(int i2, h hVar, String str, Bundle bundle) {
    }
}
