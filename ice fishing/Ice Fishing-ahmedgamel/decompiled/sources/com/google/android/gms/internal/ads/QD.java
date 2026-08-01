package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class QD {

    /* renamed from: a, reason: collision with root package name */
    public final C3445kB f27003a = new C3445kB();

    /* renamed from: b, reason: collision with root package name */
    public final String f27004b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f27005c;

    public QD(Class cls) {
        this.f27004b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f27005c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f27003a) {
            try {
                Logger logger2 = this.f27005c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f27004b);
                this.f27005c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
