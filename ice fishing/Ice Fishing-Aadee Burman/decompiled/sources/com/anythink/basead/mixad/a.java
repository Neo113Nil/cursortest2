package com.anythink.basead.mixad;

import android.text.TextUtils;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.f.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f9492a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.anythink.basead.mixad.c.a.a> f9493b = new HashMap(2);

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, a.InterfaceC0084a> f9494c = new HashMap(2);

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a.InterfaceC0083a> f9495d = new HashMap(2);

    private a() {
    }

    public static a a() {
        if (f9492a == null) {
            synchronized (a.class) {
                try {
                    if (f9492a == null) {
                        f9492a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9492a;
    }

    public final a.InterfaceC0083a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9495d.remove(str);
    }

    public final a.InterfaceC0084a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9494c.remove(str);
    }

    public final void a(String str, com.anythink.basead.mixad.c.a.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9493b.put(str, aVar);
    }

    public final com.anythink.basead.mixad.c.a.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9493b.remove(str);
    }

    public final void a(String str, a.InterfaceC0083a interfaceC0083a) {
        if (interfaceC0083a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9495d.put(str, interfaceC0083a);
    }

    public final void a(String str, a.InterfaceC0084a interfaceC0084a) {
        if (interfaceC0084a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9494c.put(str, interfaceC0084a);
    }
}
