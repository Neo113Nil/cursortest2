package com.anythink.core.common.u;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f16447a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, InterfaceC0099a> f16448b = new ConcurrentHashMap(2);

    /* renamed from: com.anythink.core.common.u.a$a, reason: collision with other inner class name */
    public interface InterfaceC0099a {
        void a(String str);
    }

    private a() {
    }

    public static a a() {
        if (f16447a == null) {
            synchronized (a.class) {
                try {
                    if (f16447a == null) {
                        f16447a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16447a;
    }

    public final void a(String str, InterfaceC0099a interfaceC0099a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16448b.put(str, interfaceC0099a);
    }

    public final void a(String str) {
        InterfaceC0099a remove;
        if (TextUtils.isEmpty(str) || (remove = this.f16448b.remove(str)) == null) {
            return;
        }
        remove.a(str);
    }
}
