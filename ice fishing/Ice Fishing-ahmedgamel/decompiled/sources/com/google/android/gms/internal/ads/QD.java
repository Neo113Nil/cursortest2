package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class QD {

    /* renamed from: a, reason: collision with root package name */
    public final C3468kB f27790a = new C3468kB();

    /* renamed from: b, reason: collision with root package name */
    public final String f27791b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f27792c;

    public QD(Class cls) {
        this.f27791b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f27792c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f27790a) {
            try {
                Logger logger2 = this.f27792c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f27791b);
                this.f27792c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
