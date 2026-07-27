package com.anythink.basead.mixad;

import android.text.TextUtils;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.f.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f9649a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.anythink.basead.mixad.c.a.a> f9650b = new HashMap(2);

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, a.InterfaceC0083a> f9651c = new HashMap(2);

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a.InterfaceC0082a> f9652d = new HashMap(2);

    private a() {
    }

    public static a a() {
        if (f9649a == null) {
            synchronized (a.class) {
                try {
                    if (f9649a == null) {
                        f9649a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9649a;
    }

    public final a.InterfaceC0082a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9652d.remove(str);
    }

    public final a.InterfaceC0083a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9651c.remove(str);
    }

    public final void a(String str, com.anythink.basead.mixad.c.a.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9650b.put(str, aVar);
    }

    public final com.anythink.basead.mixad.c.a.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9650b.remove(str);
    }

    public final void a(String str, a.InterfaceC0082a interfaceC0082a) {
        if (interfaceC0082a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9652d.put(str, interfaceC0082a);
    }

    public final void a(String str, a.InterfaceC0083a interfaceC0083a) {
        if (interfaceC0083a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9651c.put(str, interfaceC0083a);
    }
}
