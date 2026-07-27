package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    static final long f15920a = 65536;

    /* renamed from: b, reason: collision with root package name */
    static s f15921b;

    /* renamed from: c, reason: collision with root package name */
    static long f15922c;

    private t() {
    }

    public static s a() {
        synchronized (t.class) {
            s sVar = f15921b;
            if (sVar == null) {
                return new s();
            }
            f15921b = sVar.f15919h;
            sVar.f15919h = null;
            f15922c -= 8192;
            return sVar;
        }
    }

    public static void a(s sVar) {
        if (sVar.f15919h == null && sVar.i == null) {
            if (sVar.f15917f) {
                return;
            }
            synchronized (t.class) {
                try {
                    long j6 = f15922c;
                    if (j6 + 8192 > f15920a) {
                        return;
                    }
                    f15922c = j6 + 8192;
                    sVar.f15919h = f15921b;
                    sVar.f15916e = 0;
                    sVar.f15915d = 0;
                    f15921b = sVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
