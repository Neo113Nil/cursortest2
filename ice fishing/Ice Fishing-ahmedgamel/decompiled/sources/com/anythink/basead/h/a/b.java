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
    private static b f8992a;

    /* renamed from: b, reason: collision with root package name */
    private Context f8993b;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f8995d = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private SimpleDateFormat f8994c = new SimpleDateFormat("yyyyMMdd");

    private b(Context context) {
        this.f8993b = context.getApplicationContext();
    }

    public final boolean b(ay ayVar) {
        c d2 = d(ayVar);
        int i = ayVar.f13598c;
        return i != -1 && d2.f6136d >= i;
    }

    public final boolean c(ay ayVar) {
        return System.currentTimeMillis() - d(ayVar).f6137e <= ayVar.f13599d;
    }

    public final c d(ay ayVar) {
        String format = this.f8994c.format(new Date(System.currentTimeMillis()));
        c cVar = this.f8995d.get(ayVar.v());
        if (cVar == null) {
            cVar = com.anythink.basead.c.a.a(this.f8993b).a(ayVar.v());
            if (cVar == null) {
                cVar = new c();
                cVar.f6133a = ayVar.v();
                cVar.f6134b = ayVar.f13598c;
                cVar.f6135c = ayVar.f13599d;
                cVar.f6137e = 0L;
                cVar.f6136d = 0;
                cVar.f6138f = format;
            }
            this.f8995d.put(ayVar.v(), cVar);
        }
        if (!TextUtils.equals(format, cVar.f6138f)) {
            cVar.f6138f = format;
            cVar.f6136d = 0;
        }
        return cVar;
    }

    public static b a(Context context) {
        if (f8992a == null) {
            f8992a = new b(context);
        }
        return f8992a;
    }

    public final void a(ay ayVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = this.f8994c.format(new Date(currentTimeMillis));
        final c d2 = d(ayVar);
        if (d2.f6138f.equals(format)) {
            d2.f6136d++;
        } else {
            d2.f6136d = 1;
            d2.f6138f = format;
        }
        d2.f6137e = currentTimeMillis;
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.h.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.c.a.a(b.this.f8993b).c(d2.f6138f);
                com.anythink.basead.c.a.a(b.this.f8993b).a(d2);
            }
        }, 2);
    }

    public final String a() {
        List<c> b9 = com.anythink.basead.c.a.a(this.f8993b).b(this.f8994c.format(new Date(System.currentTimeMillis())));
        JSONArray jSONArray = new JSONArray();
        if (b9 != null) {
            Iterator<c> it = b9.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f6133a);
            }
        }
        return jSONArray.toString();
    }

    public final boolean a(String str) {
        List<ay> aa;
        l a9 = n.a(this.f8993b).a(str);
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
