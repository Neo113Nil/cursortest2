package com.anythink.basead.b;

import com.anythink.basead.b.c.c;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.az;
import com.anythink.core.common.h.ba;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.o;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6812a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f6813b;

    private f() {
    }

    public static f a() {
        if (f6813b == null) {
            synchronized (f.class) {
                try {
                    if (f6813b == null) {
                        f6813b = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6813b;
    }

    private static FileInputStream b(int i, String str) {
        return com.anythink.core.common.res.d.a(t.b().g()).a(i, o.a(str));
    }

    private static boolean a(String str, InputStream inputStream) {
        return a(str, inputStream, 1);
    }

    private static void a(az azVar, List<ay> list, ba baVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x xVar = new x();
            xVar.f14954o = baVar;
            ATAdRequest aTAdRequest = azVar.f14387a;
            if (aTAdRequest != null) {
                xVar.f14960u = aTAdRequest.getChannelSource();
            }
            a(azVar.f14388b, true, list.get(i), xVar, null);
        }
    }

    public static void a(String str, w wVar, x xVar, c.b bVar) {
        a(str, false, wVar, xVar, bVar);
    }

    public static void a(String str, boolean z6, w wVar, x xVar, c.b bVar) {
        new com.anythink.basead.b.c.c(str, z6, wVar, xVar).a(bVar);
    }

    public static boolean a(ay ayVar, x xVar) {
        return com.anythink.basead.b.c.d.a(ayVar, xVar);
    }

    public static boolean a(ay ayVar, int i, y yVar) {
        return com.anythink.basead.b.c.d.a(ayVar, i, yVar);
    }

    public static boolean a(String str, InputStream inputStream, int i) {
        if (str == null || inputStream == null) {
            return false;
        }
        return com.anythink.core.common.res.d.a(t.b().g()).a(i, o.a(str), inputStream);
    }

    public static String a(int i, String str) {
        return com.anythink.core.common.res.d.a(t.b().g()).c(i, o.a(str));
    }
}
