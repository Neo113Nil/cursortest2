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
    private static final String f16554b = "v";

    /* renamed from: f, reason: collision with root package name */
    private static volatile v f16555f;

    /* renamed from: a, reason: collision with root package name */
    Context f16556a;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f16557c = new ConcurrentHashMap(8);

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, bq> f16558d = new ConcurrentHashMap(8);

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Boolean> f16559e = new ConcurrentHashMap(8);

    private v(Context context) {
        this.f16556a = context.getApplicationContext();
    }

    public static v a(Context context) {
        if (f16555f == null) {
            synchronized (v.class) {
                try {
                    if (f16555f == null) {
                        f16555f = new v(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16555f;
    }

    private boolean c(String str) {
        Boolean bool = this.f16559e.get(str);
        if (bool == null) {
            boolean c9 = af.c(this.f16556a, u.b.f12857l, str);
            Boolean valueOf = Boolean.valueOf(c9);
            if (c9) {
                af.b(this.f16556a, u.b.f12857l, str);
            }
            this.f16559e.put(str, Boolean.FALSE);
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public final int b(String str) {
        Integer num = this.f16557c.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final void a(String str, String str2, boolean z3) {
        bq bqVar;
        if (TextUtils.isEmpty(str) || (bqVar = this.f16558d.get(str)) == null || !TextUtils.equals(str2, bqVar.a())) {
            return;
        }
        bqVar.a(z3);
    }

    public final void a(String str) {
        Integer num = this.f16557c.get(str);
        if (num == null) {
            this.f16557c.put(str, 1);
        } else {
            this.f16557c.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final bq a(String str, String str2) {
        Boolean bool = this.f16559e.get(str);
        if (bool == null) {
            boolean c9 = af.c(this.f16556a, u.b.f12857l, str);
            Boolean valueOf = Boolean.valueOf(c9);
            if (c9) {
                af.b(this.f16556a, u.b.f12857l, str);
            }
            this.f16559e.put(str, Boolean.FALSE);
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        bq remove = this.f16558d.remove(str);
        if (remove == null) {
            remove = new bq("", booleanValue);
        }
        this.f16558d.put(str, new bq(str2, false));
        return remove;
    }
}
