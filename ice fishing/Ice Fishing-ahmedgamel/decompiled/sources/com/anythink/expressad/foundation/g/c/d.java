package com.anythink.expressad.foundation.g.c;

import android.util.Log;
import com.anythink.expressad.foundation.h.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19961a = "AnythinkDirManager";

    /* renamed from: d, reason: collision with root package name */
    private static d f19962d;

    /* renamed from: b, reason: collision with root package name */
    private f f19963b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f19964c = new ArrayList<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public com.anythink.expressad.foundation.g.c.a f19965a;

        /* renamed from: b, reason: collision with root package name */
        public File f19966b;

        public a(com.anythink.expressad.foundation.g.c.a aVar, File file) {
            this.f19965a = aVar;
            this.f19966b = file;
        }
    }

    private d(f fVar) {
        this.f19963b = fVar;
    }

    public static synchronized void a(f fVar) {
        synchronized (d.class) {
            if (f19962d == null) {
                f19962d = new d(fVar);
            }
        }
    }

    public static String b(com.anythink.expressad.foundation.g.c.a aVar) {
        File a9 = a(aVar);
        if (a9 != null) {
            return a9.getAbsolutePath();
        }
        return null;
    }

    public final boolean b() {
        return a(this.f19963b.b());
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f19962d == null && com.anythink.expressad.foundation.b.a.c().e() != null) {
                    t.a(com.anythink.expressad.foundation.b.a.c().e());
                }
                if (f19962d == null) {
                    Log.e(f19961a, "mDirectoryManager == null");
                }
                dVar = f19962d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static File a(com.anythink.expressad.foundation.g.c.a aVar) {
        try {
            if (a() == null || a().f19964c == null || a().f19964c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f19964c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f19965a.equals(aVar)) {
                    return next.f19966b;
                }
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private boolean a(e eVar) {
        String str;
        e c9 = eVar.c();
        if (c9 == null) {
            str = eVar.b();
        } else {
            File a9 = a(c9.a());
            if (a9 == null) {
                return false;
            }
            str = a9.getAbsolutePath() + File.separator + eVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f19964c.add(new a(eVar.a(), file));
        List<e> d9 = eVar.d();
        if (d9 != null) {
            Iterator<e> it = d9.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
