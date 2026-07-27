package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bz;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    private static final String f17297c = "x";

    /* renamed from: d, reason: collision with root package name */
    private static volatile x f17298d;

    /* renamed from: a, reason: collision with root package name */
    Map<String, bz> f17299a;

    /* renamed from: b, reason: collision with root package name */
    Context f17300b;

    private x(Context context) {
        this.f17300b = context.getApplicationContext();
        a();
    }

    public static x a(Context context) {
        if (f17298d == null) {
            synchronized (x.class) {
                try {
                    if (f17298d == null) {
                        f17298d = new x(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17298d;
    }

    private static void b() {
    }

    private bz b(String str) {
        Map<String, bz> map = this.f17299a;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    private void a() {
        if (this.f17299a == null) {
            this.f17299a = new ConcurrentHashMap(5);
            try {
                Map<String, ?> b9 = af.b(this.f17300b, u.b.f13013k);
                if (b9 != null) {
                    for (Map.Entry<String, ?> entry : b9.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            this.f17299a.put(key, bz.a((String) value));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, bz.a aVar, bz.a aVar2) {
        Map<String, bz> map = this.f17299a;
        if (map == null) {
            return;
        }
        bz bzVar = map.get(str);
        if (bzVar == null) {
            synchronized (this) {
                try {
                    bzVar = this.f17299a.get(str);
                    if (bzVar == null) {
                        bzVar = new bz();
                        bzVar.b(str2);
                        this.f17299a.put(str, bzVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (TextUtils.equals(str2, bzVar.b())) {
            if (aVar != null) {
                bzVar.a(aVar);
                bzVar.a(System.currentTimeMillis());
            }
            if (aVar2 != null) {
                bzVar.b(aVar2);
            }
        }
    }

    public final void a(String str) {
        Map<String, bz> map = this.f17299a;
        if (map == null) {
            return;
        }
        try {
            bz bzVar = map.get(str);
            if (bzVar != null) {
                af.b(this.f17300b, u.b.f13013k, str, bzVar.a().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
