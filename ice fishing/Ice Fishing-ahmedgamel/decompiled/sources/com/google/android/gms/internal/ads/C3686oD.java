package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.oD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3686oD extends AbstractC3364iD {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f33659a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f33660b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f33661c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f33662d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f33663e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f33664f;

    static {
        Unsafe s9;
        try {
            try {
                s9 = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    s9 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, C3847rD.f34311a);
                } catch (Exception unused2) {
                    s9 = s();
                    Unsafe unsafe = s9;
                }
            }
            try {
                f33661c = s9.objectFieldOffset(AbstractC3794qD.class.getDeclaredField("v"));
                f33660b = s9.objectFieldOffset(AbstractC3794qD.class.getDeclaredField("u"));
                f33662d = s9.objectFieldOffset(AbstractC3794qD.class.getDeclaredField("n"));
                f33663e = s9.objectFieldOffset(C3740pD.class.getDeclaredField("a"));
                f33664f = s9.objectFieldOffset(C3740pD.class.getDeclaredField("b"));
                f33659a = s9;
            } catch (NoSuchFieldException e9) {
                throw new RuntimeException(e9);
            }
        } catch (Exception e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10);
        }
    }

    public static /* synthetic */ Unsafe s() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final void e(C3740pD c3740pD, Thread thread) {
        f33659a.putObject(c3740pD, f33663e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final void h(C3740pD c3740pD, C3740pD c3740pD2) {
        f33659a.putObject(c3740pD, f33664f, c3740pD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean m(AbstractC3794qD abstractC3794qD, C3740pD c3740pD, C3740pD c3740pD2) {
        return AbstractC3524lD.a(f33659a, abstractC3794qD, f33661c, c3740pD, c3740pD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean o(AbstractC3310hD abstractC3310hD, C3148eD c3148eD, C3148eD c3148eD2) {
        return AbstractC3632nD.a(f33659a, abstractC3310hD, f33660b, c3148eD, c3148eD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final C3740pD p(AbstractC3310hD abstractC3310hD) {
        C3740pD c3740pD;
        C3740pD c3740pD2 = C3740pD.f33832c;
        do {
            c3740pD = abstractC3310hD.f34006v;
            if (c3740pD2 == c3740pD) {
                break;
            }
        } while (!m(abstractC3310hD, c3740pD, c3740pD2));
        return c3740pD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final C3148eD q(AbstractC3310hD abstractC3310hD) {
        C3148eD c3148eD;
        C3148eD c3148eD2 = C3148eD.f30689d;
        do {
            c3148eD = abstractC3310hD.f34005u;
            if (c3148eD2 == c3148eD) {
                break;
            }
        } while (!o(abstractC3310hD, c3148eD, c3148eD2));
        return c3148eD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean r(AbstractC3794qD abstractC3794qD, Object obj, Object obj2) {
        return AbstractC3578mD.a(f33659a, abstractC3794qD, f33662d, obj, obj2);
    }
}
