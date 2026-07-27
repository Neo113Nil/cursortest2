package com.anythink.basead.b.c;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6107a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static volatile e f6108b;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f6109c = new CopyOnWriteArrayList();

    public interface a {
        void a(String str, int i);

        void a(String str, com.anythink.basead.d.f fVar);
    }

    private e() {
    }

    public static e a() {
        if (f6108b == null) {
            synchronized (e.class) {
                try {
                    if (f6108b == null) {
                        f6108b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6108b;
    }

    public final synchronized void b(a aVar) {
        try {
            int size = this.f6109c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (aVar != this.f6109c.get(i)) {
                    i++;
                }
            }
            if (i != -1) {
                this.f6109c.remove(i);
            }
        } finally {
        }
    }

    public final synchronized void a(a aVar) {
        this.f6109c.add(aVar);
    }

    public final void a(String str, int i) {
        List<a> list = this.f6109c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, i);
            }
        }
    }

    public final void a(String str, com.anythink.basead.d.f fVar) {
        List<a> list = this.f6109c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, fVar);
            }
        }
    }
}
