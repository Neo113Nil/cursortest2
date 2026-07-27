package com.anythink.core.common.u;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f16605a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, InterfaceC0098a> f16606b = new ConcurrentHashMap(2);

    /* renamed from: com.anythink.core.common.u.a$a, reason: collision with other inner class name */
    public interface InterfaceC0098a {
        void a(String str);
    }

    private a() {
    }

    public static a a() {
        if (f16605a == null) {
            synchronized (a.class) {
                try {
                    if (f16605a == null) {
                        f16605a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16605a;
    }

    public final void a(String str, InterfaceC0098a interfaceC0098a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16606b.put(str, interfaceC0098a);
    }

    public final void a(String str) {
        InterfaceC0098a remove;
        if (TextUtils.isEmpty(str) || (remove = this.f16606b.remove(str)) == null) {
            return;
        }
        remove.a(str);
    }
}
