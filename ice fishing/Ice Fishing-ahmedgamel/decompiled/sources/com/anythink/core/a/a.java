package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.p;
import com.anythink.core.common.h.bo;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u;
import com.anythink.core.d.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f11539g;

    /* renamed from: a, reason: collision with root package name */
    p f11540a;

    /* renamed from: d, reason: collision with root package name */
    Context f11543d;

    /* renamed from: f, reason: collision with root package name */
    private final String f11545f = getClass().getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<String, bo> f11544e = new ConcurrentHashMap<>(3);

    /* renamed from: b, reason: collision with root package name */
    SimpleDateFormat f11541b = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: c, reason: collision with root package name */
    SimpleDateFormat f11542c = new SimpleDateFormat("yyyyMMddHH");

    private a(Context context) {
        this.f11540a = p.a(com.anythink.core.common.e.e.a(context));
        this.f11543d = context;
    }

    public static a a(Context context) {
        if (f11539g == null) {
            synchronized (a.class) {
                try {
                    if (f11539g == null) {
                        f11539g = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11539g;
    }

    public final void a() {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.f11540a.a(aVar.f11541b.format(new Date(System.currentTimeMillis())));
            }
        }, 2);
    }

    public final int a(l lVar, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (lVar == null) {
            return b.f11547n;
        }
        int a9 = b.a(t.b().g()).a(str, String.valueOf(lVar.aq()), lVar.av(), lVar.aw());
        if (a9 != b.f11547n) {
            return a9;
        }
        if (!t.b().v()) {
            if (lVar.av() == -1 && lVar.aw() == -1) {
                return b.f11547n;
            }
            bo a10 = a(str, lVar.aq());
            int i = a10 != null ? a10.f13722c : 0;
            int i6 = a10 != null ? a10.f13723d : 0;
            Date date = new Date();
            int parseInt = Integer.parseInt(b.b(date));
            int parseInt2 = Integer.parseInt(b.c(date));
            ConcurrentHashMap<String, Long> concurrentHashMap = b.a(t.b().g()).f11558j;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                Long l9 = concurrentHashMap.get("day_" + parseInt + "_" + str);
                if (l9 != null) {
                    i += l9.intValue();
                }
                Long l10 = concurrentHashMap.get("hour_" + parseInt2 + "_" + str);
                if (l10 != null) {
                    i6 += l10.intValue();
                }
            }
            if (lVar.av() != -1 && i >= lVar.av()) {
                return 2;
            }
            if (lVar.aw() != -1 && i6 >= lVar.aw()) {
                return 2;
            }
        }
        return b.f11547n;
    }

    public final int a(String str, bv bvVar, int i) {
        String z3;
        int a9;
        try {
            int g4 = bvVar.g();
            z3 = bvVar.z();
            b a10 = b.a(t.b().g());
            String valueOf = String.valueOf(g4);
            String valueOf2 = String.valueOf(i);
            long i6 = bvVar.i();
            long j6 = bvVar.j();
            bvVar.y();
            a9 = a10.a(valueOf, z3, valueOf2, i6, j6);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (a9 != b.f11547n) {
            return a9;
        }
        if (!t.b().v()) {
            if (bvVar.j() == -1 && bvVar.i() == -1) {
                return b.f11547n;
            }
            bo.a a11 = a(str, bvVar.z(), i);
            if (a11 == null) {
                return b.f11547n;
            }
            int i9 = a11.f13731d;
            int i10 = a11.f13732e;
            Date date = new Date();
            int parseInt = Integer.parseInt(b.b(date));
            int parseInt2 = Integer.parseInt(b.c(date));
            ConcurrentHashMap<String, Long> concurrentHashMap = b.a(t.b().g()).f11561m;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                Long l9 = concurrentHashMap.get("day_" + parseInt + "_" + z3);
                if (l9 != null) {
                    i9 += l9.intValue();
                }
                Long l10 = concurrentHashMap.get("hour_" + parseInt2 + "_" + z3);
                if (l10 != null) {
                    i10 += l10.intValue();
                }
            }
            if (bvVar.j() != -1 && i10 >= bvVar.j()) {
                return 2;
            }
            if (bvVar.i() != -1 && i9 >= bvVar.i()) {
                return 2;
            }
        }
        return b.f11547n;
    }

    public final bo a(String str, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = this.f11541b.format(new Date(currentTimeMillis));
        String format2 = this.f11542c.format(new Date(currentTimeMillis));
        bo boVar = this.f11544e.get(str);
        if (boVar != null) {
            if (!TextUtils.equals(boVar.f13726g, format)) {
                boVar.f13722c = 0;
                boVar.f13726g = format;
                boVar.f13723d = 0;
                boVar.f13725f = format2;
            } else if (!TextUtils.equals(boVar.f13725f, format2)) {
                boVar.f13723d = 0;
                boVar.f13725f = format2;
            }
        }
        synchronized (u.a().a(str)) {
            if (boVar == null) {
                try {
                    boVar = this.f11540a.a(str, format, format2);
                    if (boVar == null) {
                        boVar = new bo();
                        boVar.f13721b = str;
                        boVar.f13720a = i;
                    }
                    boVar.f13726g = format;
                    boVar.f13725f = format2;
                    this.f11544e.put(str, boVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return boVar;
    }

    public final bo.a a(String str, String str2, int i) {
        bo.a a9;
        bo a10 = a(str, i);
        if (a10 == null || (a9 = a10.a(str2)) == null) {
            return null;
        }
        if (!TextUtils.equals(a9.f13730c, a10.f13726g)) {
            a9.f13730c = a10.f13726g;
            a9.f13731d = 0;
            a9.f13729b = a10.f13725f;
            a9.f13732e = 0;
            return a9;
        }
        if (!TextUtils.equals(a9.f13729b, a10.f13725f)) {
            a9.f13729b = a10.f13725f;
            a9.f13732e = 0;
        }
        return a9;
    }

    public final int[] a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        int[] a9 = this.f11540a.a(i, this.f11541b.format(new Date(currentTimeMillis)), this.f11542c.format(new Date(currentTimeMillis)));
        int i6 = a9[0];
        int i9 = a9[1];
        return a9;
    }

    public static void a(n nVar, String str, String str2, String str3) {
        b.a(t.b().g()).a(nVar.Y(), str, str2, str3);
    }
}
