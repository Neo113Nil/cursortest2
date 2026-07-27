package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class RD {

    /* renamed from: a, reason: collision with root package name */
    public final C3620nB f27319a = new C3620nB();

    /* renamed from: b, reason: collision with root package name */
    public final String f27320b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f27321c;

    public RD(Class cls) {
        this.f27320b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f27321c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f27319a) {
            try {
                Logger logger2 = this.f27321c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f27320b);
                this.f27321c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
