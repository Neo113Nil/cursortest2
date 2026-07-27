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
    private static final String f19332a = "AnythinkDirManager";

    /* renamed from: d, reason: collision with root package name */
    private static d f19333d;

    /* renamed from: b, reason: collision with root package name */
    private f f19334b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f19335c = new ArrayList<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public com.anythink.expressad.foundation.g.c.a f19336a;

        /* renamed from: b, reason: collision with root package name */
        public File f19337b;

        public a(com.anythink.expressad.foundation.g.c.a aVar, File file) {
            this.f19336a = aVar;
            this.f19337b = file;
        }
    }

    private d(f fVar) {
        this.f19334b = fVar;
    }

    public static synchronized void a(f fVar) {
        synchronized (d.class) {
            if (f19333d == null) {
                f19333d = new d(fVar);
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
        return a(this.f19334b.b());
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f19333d == null && com.anythink.expressad.foundation.b.a.c().e() != null) {
                    t.a(com.anythink.expressad.foundation.b.a.c().e());
                }
                if (f19333d == null) {
                    Log.e(f19332a, "mDirectoryManager == null");
                }
                dVar = f19333d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static File a(com.anythink.expressad.foundation.g.c.a aVar) {
        try {
            if (a() == null || a().f19335c == null || a().f19335c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f19335c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f19336a.equals(aVar)) {
                    return next.f19337b;
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
        e c4 = eVar.c();
        if (c4 == null) {
            str = eVar.b();
        } else {
            File a9 = a(c4.a());
            if (a9 == null) {
                return false;
            }
            str = a9.getAbsolutePath() + File.separator + eVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f19335c.add(new a(eVar.a(), file));
        List<e> d2 = eVar.d();
        if (d2 != null) {
            Iterator<e> it = d2.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
