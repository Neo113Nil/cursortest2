package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.ac;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12295a = "d";

    /* renamed from: e, reason: collision with root package name */
    private static volatile d f12296e;

    /* renamed from: b, reason: collision with root package name */
    private Context f12297b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, ac> f12298c = new ConcurrentHashMap(8);

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f12299d;

    private d() {
    }

    public static d a() {
        if (f12296e == null) {
            synchronized (d.class) {
                try {
                    if (f12296e == null) {
                        f12296e = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12296e;
    }

    public final void b(String str, String str2, String str3) {
        bv a9;
        ac acVar = this.f12298c.get(str);
        if (acVar == null || (a9 = acVar.a()) == null || !TextUtils.equals(a9.z(), str3) || !TextUtils.equals(acVar.c(), str2)) {
            return;
        }
        acVar.e();
        b(str);
    }

    public final synchronized String c(String str) {
        Map<String, String> map = this.f12299d;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    public final void b(String str) {
        try {
            ac acVar = this.f12298c.get(str);
            if (acVar != null) {
                af.b(this.f12297b, u.b.f12859n, str, acVar.i().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(String str, ac acVar) {
        Objects.toString(acVar);
        this.f12298c.put(str, acVar);
    }

    public final void a(String str, String str2, String str3) {
        bv a9;
        ac acVar = this.f12298c.get(str);
        if (acVar == null || (a9 = acVar.a()) == null || !TextUtils.equals(a9.z(), str3) || !TextUtils.equals(acVar.c(), str2)) {
            return;
        }
        acVar.d();
        b(str);
    }

    public final ac a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ac remove = this.f12298c.remove(str);
        Objects.toString(remove);
        if (remove != null) {
            af.a(this.f12297b, u.b.f12859n, str);
        }
        return remove;
    }

    public final void a(Context context) {
        ac a9;
        this.f12297b = context;
        try {
            Map<String, ?> b9 = af.b(context, u.b.f12859n);
            if (b9 != null) {
                for (Map.Entry<String, ?> entry : b9.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if ((value instanceof String) && (a9 = ac.a((String) value)) != null) {
                        this.f12298c.put(key, a9);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void a(String str, String str2) {
        try {
            if (this.f12299d == null) {
                this.f12299d = new ConcurrentHashMap();
            }
            this.f12299d.put(str, str2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
