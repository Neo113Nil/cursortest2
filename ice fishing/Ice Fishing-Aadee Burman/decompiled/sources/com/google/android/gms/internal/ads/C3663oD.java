package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.oD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3663oD extends AbstractC3341iD {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f32872a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f32873b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f32874c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f32875d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f32876e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f32877f;

    static {
        Unsafe s9;
        try {
            try {
                s9 = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    s9 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, C3824rD.f33543a);
                } catch (Exception unused2) {
                    s9 = s();
                    Unsafe unsafe = s9;
                }
            }
            try {
                f32874c = s9.objectFieldOffset(AbstractC3771qD.class.getDeclaredField("v"));
                f32873b = s9.objectFieldOffset(AbstractC3771qD.class.getDeclaredField("u"));
                f32875d = s9.objectFieldOffset(AbstractC3771qD.class.getDeclaredField("n"));
                f32876e = s9.objectFieldOffset(C3717pD.class.getDeclaredField("a"));
                f32877f = s9.objectFieldOffset(C3717pD.class.getDeclaredField("b"));
                f32872a = s9;
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

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final void e(C3717pD c3717pD, Thread thread) {
        f32872a.putObject(c3717pD, f32876e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final void h(C3717pD c3717pD, C3717pD c3717pD2) {
        f32872a.putObject(c3717pD, f32877f, c3717pD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean m(AbstractC3771qD abstractC3771qD, C3717pD c3717pD, C3717pD c3717pD2) {
        return AbstractC3501lD.a(f32872a, abstractC3771qD, f32874c, c3717pD, c3717pD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean o(AbstractC3287hD abstractC3287hD, C3125eD c3125eD, C3125eD c3125eD2) {
        return AbstractC3609nD.a(f32872a, abstractC3287hD, f32873b, c3125eD, c3125eD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final C3717pD p(AbstractC3287hD abstractC3287hD) {
        C3717pD c3717pD;
        C3717pD c3717pD2 = C3717pD.f33042c;
        do {
            c3717pD = abstractC3287hD.f33222v;
            if (c3717pD2 == c3717pD) {
                break;
            }
        } while (!m(abstractC3287hD, c3717pD, c3717pD2));
        return c3717pD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final C3125eD q(AbstractC3287hD abstractC3287hD) {
        C3125eD c3125eD;
        C3125eD c3125eD2 = C3125eD.f29897d;
        do {
            c3125eD = abstractC3287hD.f33221u;
            if (c3125eD2 == c3125eD) {
                break;
            }
        } while (!o(abstractC3287hD, c3125eD, c3125eD2));
        return c3125eD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean r(AbstractC3771qD abstractC3771qD, Object obj, Object obj2) {
        return AbstractC3555mD.a(f32872a, abstractC3771qD, f32875d, obj, obj2);
    }
}
