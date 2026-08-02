package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    static final long f16707a = 65536;

    /* renamed from: b, reason: collision with root package name */
    static s f16708b;

    /* renamed from: c, reason: collision with root package name */
    static long f16709c;

    private t() {
    }

    public static s a() {
        synchronized (t.class) {
            s sVar = f16708b;
            if (sVar == null) {
                return new s();
            }
            f16708b = sVar.f16706h;
            sVar.f16706h = null;
            f16709c -= 8192;
            return sVar;
        }
    }

    public static void a(s sVar) {
        if (sVar.f16706h == null && sVar.i == null) {
            if (sVar.f16704f) {
                return;
            }
            synchronized (t.class) {
                try {
                    long j6 = f16709c;
                    if (j6 + 8192 > f16707a) {
                        return;
                    }
                    f16709c = j6 + 8192;
                    sVar.f16706h = f16708b;
                    sVar.f16703e = 0;
                    sVar.f16702d = 0;
                    f16708b = sVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
