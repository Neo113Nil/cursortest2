package com.anythink.basead.mixad;

import android.text.TextUtils;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.f.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f10278a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.anythink.basead.mixad.c.a.a> f10279b = new HashMap(2);

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, a.InterfaceC0084a> f10280c = new HashMap(2);

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a.InterfaceC0083a> f10281d = new HashMap(2);

    private a() {
    }

    public static a a() {
        if (f10278a == null) {
            synchronized (a.class) {
                try {
                    if (f10278a == null) {
                        f10278a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10278a;
    }

    public final a.InterfaceC0083a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f10281d.remove(str);
    }

    public final a.InterfaceC0084a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f10280c.remove(str);
    }

    public final void a(String str, com.anythink.basead.mixad.c.a.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f10279b.put(str, aVar);
    }

    public final com.anythink.basead.mixad.c.a.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f10279b.remove(str);
    }

    public final void a(String str, a.InterfaceC0083a interfaceC0083a) {
        if (interfaceC0083a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f10281d.put(str, interfaceC0083a);
    }

    public final void a(String str, a.InterfaceC0084a interfaceC0084a) {
        if (interfaceC0084a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f10280c.put(str, interfaceC0084a);
    }
}
