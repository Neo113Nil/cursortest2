package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bq;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    private static final String f17341b = "v";

    /* renamed from: f, reason: collision with root package name */
    private static volatile v f17342f;

    /* renamed from: a, reason: collision with root package name */
    Context f17343a;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f17344c = new ConcurrentHashMap(8);

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, bq> f17345d = new ConcurrentHashMap(8);

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Boolean> f17346e = new ConcurrentHashMap(8);

    private v(Context context) {
        this.f17343a = context.getApplicationContext();
    }

    public static v a(Context context) {
        if (f17342f == null) {
            synchronized (v.class) {
                try {
                    if (f17342f == null) {
                        f17342f = new v(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17342f;
    }

    private boolean c(String str) {
        Boolean bool = this.f17346e.get(str);
        if (bool == null) {
            boolean c9 = af.c(this.f17343a, u.b.f13643l, str);
            Boolean valueOf = Boolean.valueOf(c9);
            if (c9) {
                af.b(this.f17343a, u.b.f13643l, str);
            }
            this.f17346e.put(str, Boolean.FALSE);
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public final int b(String str) {
        Integer num = this.f17344c.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final void a(String str, String str2, boolean z6) {
        bq bqVar;
        if (TextUtils.isEmpty(str) || (bqVar = this.f17345d.get(str)) == null || !TextUtils.equals(str2, bqVar.a())) {
            return;
        }
        bqVar.a(z6);
    }

    public final void a(String str) {
        Integer num = this.f17344c.get(str);
        if (num == null) {
            this.f17344c.put(str, 1);
        } else {
            this.f17344c.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final bq a(String str, String str2) {
        Boolean bool = this.f17346e.get(str);
        if (bool == null) {
            boolean c9 = af.c(this.f17343a, u.b.f13643l, str);
            Boolean valueOf = Boolean.valueOf(c9);
            if (c9) {
                af.b(this.f17343a, u.b.f13643l, str);
            }
            this.f17346e.put(str, Boolean.FALSE);
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        bq remove = this.f17345d.remove(str);
        if (remove == null) {
            remove = new bq("", booleanValue);
        }
        this.f17345d.put(str, new bq(str2, false));
        return remove;
    }
}
