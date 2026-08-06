package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320c4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0271a7 f5705a;

    /* renamed from: b, reason: collision with root package name */
    public C0740sb f5706b;

    /* renamed from: c, reason: collision with root package name */
    public C0766tb f5707c;

    /* renamed from: d, reason: collision with root package name */
    public Zb f5708d;

    public C0320c4(File file) {
        this.f5705a = new C0271a7(file);
    }

    public final synchronized Ha a(Context context) {
        C0766tb c0766tb;
        c0766tb = this.f5707c;
        if (c0766tb == null) {
            c0766tb = new C0766tb(c(context));
            this.f5707c = c0766tb;
        }
        return c0766tb;
    }

    public final synchronized Ha b(Context context) {
        return c(context);
    }

    public final Ha c(Context context) {
        Zb zb;
        C0740sb c0740sb = this.f5706b;
        if (c0740sb == null) {
            synchronized (this) {
                zb = this.f5708d;
                if (zb == null) {
                    C0271a7 c0271a7 = this.f5705a;
                    String a2 = new Z6(c0271a7.f5559a, c0271a7.f5560b, true).a(context, new N3());
                    M6 m6 = AbstractC0838w5.f7093c;
                    m6.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("preferences", InterfaceC0760t5.f6933a);
                    C0468hn c0468hn = m6.f4738c;
                    W6 w6 = m6.f4736a;
                    S6 s6 = w6.f5284c;
                    T6 t6 = w6.f5285d;
                    C0662pa c0662pa = new C0662pa(false);
                    c0662pa.a(112, new O3());
                    C0545kn c0545kn = new C0545kn("service database", hashMap);
                    c0468hn.getClass();
                    zb = new Zb(context, a2, new Y9(a2), new C0493in(s6, t6, c0662pa, c0545kn));
                    this.f5708d = zb;
                }
            }
            c0740sb = new C0740sb(zb);
            this.f5706b = c0740sb;
        }
        return c0740sb;
    }
}
