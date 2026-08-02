package com.yandex.plus.core.featureflags;

/* loaded from: classes4.dex */
public abstract class k {
    public abstract t a();

    public abstract Object b();

    public abstract t c();

    public abstract t d();

    public final Object e() {
        Object read;
        if (d() != null) {
            t d = d();
            d.getClass();
            read = d.read();
        } else {
            t f = f();
            if (f == null || (read = f.read()) == null) {
                t c = c();
                read = c != null ? c.read() : null;
                if (read == null) {
                    t a = a();
                    read = a != null ? a.read() : null;
                }
            }
        }
        return read == null ? b() : read;
    }

    public abstract t f();

    public Object getValue() {
        return e();
    }
}
