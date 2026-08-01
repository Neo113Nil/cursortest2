package com.anythink.basead.b.c;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5950a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static volatile e f5951b;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f5952c = new CopyOnWriteArrayList();

    public interface a {
        void a(String str, int i);

        void a(String str, com.anythink.basead.d.f fVar);
    }

    private e() {
    }

    public static e a() {
        if (f5951b == null) {
            synchronized (e.class) {
                try {
                    if (f5951b == null) {
                        f5951b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5951b;
    }

    public final synchronized void b(a aVar) {
        try {
            int size = this.f5952c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (aVar != this.f5952c.get(i)) {
                    i++;
                }
            }
            if (i != -1) {
                this.f5952c.remove(i);
            }
        } finally {
        }
    }

    public final synchronized void a(a aVar) {
        this.f5952c.add(aVar);
    }

    public final void a(String str, int i) {
        List<a> list = this.f5952c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, i);
            }
        }
    }

    public final void a(String str, com.anythink.basead.d.f fVar) {
        List<a> list = this.f5952c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, fVar);
            }
        }
    }
}
