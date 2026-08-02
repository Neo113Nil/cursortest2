package com.anythink.basead.h.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d.c;
import com.anythink.core.common.h.ay;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f9778a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9779b;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f9781d = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private SimpleDateFormat f9780c = new SimpleDateFormat("yyyyMMdd");

    private b(Context context) {
        this.f9779b = context.getApplicationContext();
    }

    public final boolean b(ay ayVar) {
        c d9 = d(ayVar);
        int i = ayVar.f14384c;
        return i != -1 && d9.f6922d >= i;
    }

    public final boolean c(ay ayVar) {
        return System.currentTimeMillis() - d(ayVar).f6923e <= ayVar.f14385d;
    }

    public final c d(ay ayVar) {
        String format = this.f9780c.format(new Date(System.currentTimeMillis()));
        c cVar = this.f9781d.get(ayVar.v());
        if (cVar == null) {
            cVar = com.anythink.basead.c.a.a(this.f9779b).a(ayVar.v());
            if (cVar == null) {
                cVar = new c();
                cVar.f6919a = ayVar.v();
                cVar.f6920b = ayVar.f14384c;
                cVar.f6921c = ayVar.f14385d;
                cVar.f6923e = 0L;
                cVar.f6922d = 0;
                cVar.f6924f = format;
            }
            this.f9781d.put(ayVar.v(), cVar);
        }
        if (!TextUtils.equals(format, cVar.f6924f)) {
            cVar.f6924f = format;
            cVar.f6922d = 0;
        }
        return cVar;
    }

    public static b a(Context context) {
        if (f9778a == null) {
            f9778a = new b(context);
        }
        return f9778a;
    }

    public final void a(ay ayVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = this.f9780c.format(new Date(currentTimeMillis));
        final c d9 = d(ayVar);
        if (d9.f6924f.equals(format)) {
            d9.f6922d++;
        } else {
            d9.f6922d = 1;
            d9.f6924f = format;
        }
        d9.f6923e = currentTimeMillis;
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.h.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.c.a.a(b.this.f9779b).c(d9.f6924f);
                com.anythink.basead.c.a.a(b.this.f9779b).a(d9);
            }
        }, 2);
    }

    public final String a() {
        List<c> b9 = com.anythink.basead.c.a.a(this.f9779b).b(this.f9780c.format(new Date(System.currentTimeMillis())));
        JSONArray jSONArray = new JSONArray();
        if (b9 != null) {
            Iterator<c> it = b9.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f6919a);
            }
        }
        return jSONArray.toString();
    }

    public final boolean a(String str) {
        List<ay> aa;
        l a9 = n.a(this.f9779b).a(str);
        if (a9 == null || (aa = a9.aa()) == null || aa.size() <= 0) {
            return false;
        }
        Iterator<ay> it = aa.iterator();
        while (it.hasNext()) {
            if (!b(it.next())) {
                return false;
            }
        }
        return true;
    }
}
