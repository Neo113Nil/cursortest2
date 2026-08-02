package ru.yandex.taxi.analytics;

import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public abstract class f {
    private static volatile f a;

    public static void a(Task task) {
        c().d(task);
    }

    public static f b(f fVar) {
        a = fVar;
        return fVar;
    }

    public static f c() {
        if (a == null) {
            synchronized (f.class) {
                try {
                    if (a == null) {
                        a = new e();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void d(Task task);
}
