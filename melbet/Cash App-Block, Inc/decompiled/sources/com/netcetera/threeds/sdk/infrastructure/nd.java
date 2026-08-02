package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public abstract class nd<T> {
    private static int ThreeDS2Service;
    private static final Object initialize = new Object();
    private volatile T get = (T) initialize;

    static {
        int i = (~0) & 25;
        int i2 = -(-0);
        int i3 = ((i | i2) << 1) - (i2 ^ i);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public T ThreeDS2ServiceInstance() {
        T t;
        T t2 = this.get;
        Object obj = initialize;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = this.get;
                if (t == obj) {
                    t = initialize();
                    this.get = t;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public abstract T initialize();
}
