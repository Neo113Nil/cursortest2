package com.anythink.basead.h.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.c.c;
import com.anythink.basead.b.f;
import com.anythink.basead.d.c;
import com.anythink.basead.d.g;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.az;
import com.anythink.core.common.h.ba;
import com.anythink.core.common.h.x;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f9146a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9147b;

    private a(Context context) {
        this.f9147b = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f9146a == null) {
            f9146a = new a(context);
        }
        return f9146a;
    }

    public final void a(az azVar) {
        List<ay> aa;
        ba Z8;
        l a9 = n.a(this.f9147b).a(azVar.f13759b);
        if (a9 == null || (aa = a9.aa()) == null || (Z8 = a9.Z()) == null) {
            return;
        }
        f.a();
        int size = aa.size();
        for (int i = 0; i < size; i++) {
            x xVar = new x();
            xVar.f14325o = Z8;
            ATAdRequest aTAdRequest = azVar.f13758a;
            if (aTAdRequest != null) {
                xVar.f14331u = aTAdRequest.getChannelSource();
            }
            f.a(azVar.f13759b, true, aa.get(i), xVar, null);
        }
    }

    public final ay a(String str, String str2) {
        l a9 = n.a(this.f9147b).a(str);
        if (a9 == null) {
            return null;
        }
        return a9.b(str2);
    }

    public final String a(String str) {
        l a9 = n.a(this.f9147b).a(str);
        if (a9 == null) {
            return "";
        }
        List<ay> aa = a9.aa();
        ArrayList arrayList = new ArrayList();
        if (aa == null || aa.size() == 0) {
            return "";
        }
        for (int size = aa.size() - 1; size >= 0; size--) {
            ay ayVar = aa.get(size);
            f.a();
            if (!f.a(ayVar, a9.aq(), a9.Z())) {
                aa.remove(size);
            } else {
                arrayList.add(b.a(this.f9147b).d(ayVar));
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        Collections.sort(arrayList, new Comparator<c>() { // from class: com.anythink.basead.h.a.a.1
            private static int a(c cVar, c cVar2) {
                return Integer.valueOf(cVar.f6293d).compareTo(Integer.valueOf(cVar2.f6293d));
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(c cVar, c cVar2) {
                return Integer.valueOf(cVar.f6293d).compareTo(Integer.valueOf(cVar2.f6293d));
            }
        });
        return ((c) arrayList.get(0)).f6290a;
    }

    public final void a(String str, ay ayVar, x xVar, c.b bVar) {
        if (a(ayVar)) {
            bVar.a(g.a(g.f6334h, g.f6314M));
            return;
        }
        if (b.a(this.f9147b).b(ayVar)) {
            bVar.a(g.a(g.f6331e, g.f6308F));
        } else if (b.a(this.f9147b).c(ayVar)) {
            bVar.a(g.a(g.f6332f, g.f6309G));
        } else {
            f.a();
            f.a(str, ayVar, xVar, bVar);
        }
    }

    private static boolean a(ay ayVar) {
        List<String> k6 = t.b().k();
        if (k6 == null) {
            return false;
        }
        Iterator<String> it = k6.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(ayVar.I(), it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(ay ayVar, x xVar, boolean z8) {
        if (this.f9147b == null || ayVar == null || a(ayVar)) {
            return false;
        }
        if (z8) {
            f.a();
            return f.a(ayVar, xVar);
        }
        if (!b.a(this.f9147b).b(ayVar) && !b.a(this.f9147b).c(ayVar)) {
            f.a();
            if (f.a(ayVar, xVar)) {
                return true;
            }
        }
        return false;
    }
}
