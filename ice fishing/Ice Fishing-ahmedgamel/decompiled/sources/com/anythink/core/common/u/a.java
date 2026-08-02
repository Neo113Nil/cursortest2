package com.anythink.core.common.u;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f17234a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, InterfaceC0099a> f17235b = new ConcurrentHashMap(2);

    /* renamed from: com.anythink.core.common.u.a$a, reason: collision with other inner class name */
    public interface InterfaceC0099a {
        void a(String str);
    }

    private a() {
    }

    public static a a() {
        if (f17234a == null) {
            synchronized (a.class) {
                try {
                    if (f17234a == null) {
                        f17234a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17234a;
    }

    public final void a(String str, InterfaceC0099a interfaceC0099a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17235b.put(str, interfaceC0099a);
    }

    public final void a(String str) {
        InterfaceC0099a remove;
        if (TextUtils.isEmpty(str) || (remove = this.f17235b.remove(str)) == null) {
            return;
        }
        remove.a(str);
    }
}
