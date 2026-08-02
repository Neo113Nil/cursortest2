package com.anythink.basead.ui.e;

import android.text.TextUtils;
import com.anythink.core.basead.b.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f11543a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f11544b = new HashMap();

    private a() {
    }

    public static a a() {
        if (f11543a == null) {
            synchronized (a.class) {
                try {
                    if (f11543a == null) {
                        f11543a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11543a;
    }

    public final void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f11544b.put(str, cVar);
    }

    public final c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f11544b.remove(str);
    }
}
