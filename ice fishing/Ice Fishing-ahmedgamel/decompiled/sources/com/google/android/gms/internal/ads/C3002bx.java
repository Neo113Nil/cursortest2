package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3002bx {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f29373h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f29374a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3055cx f29375b;

    /* renamed from: c, reason: collision with root package name */
    public final Cw f29376c;

    /* renamed from: d, reason: collision with root package name */
    public final Bw f29377d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29378e;

    /* renamed from: f, reason: collision with root package name */
    public Xw f29379f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29380g = new Object();

    public C3002bx(Context context, InterfaceC3055cx interfaceC3055cx, Cw cw, Bw bw, boolean z3) {
        this.f29374a = context;
        this.f29375b = interfaceC3055cx;
        this.f29376c = cw;
        this.f29377d = bw;
        this.f29378e = z3;
    }

    public final boolean a(Uw uw) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Xw xw = new Xw(c(uw).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f29374a, "msa-r", uw.a(), null, new Bundle(), 2), uw, this.f29375b, this.f29376c, this.f29378e);
                if (!xw.k()) {
                    throw new C2948ax(4000, "init failed");
                }
                int m4 = xw.m();
                if (m4 != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(m4).length() + 4);
                    sb.append("ci: ");
                    sb.append(m4);
                    throw new C2948ax(4001, sb.toString());
                }
                synchronized (this.f29380g) {
                    Xw xw2 = this.f29379f;
                    if (xw2 != null) {
                        try {
                            xw2.l();
                        } catch (C2948ax e9) {
                            this.f29376c.c(e9.f29154n, -1L, e9);
                        }
                    }
                    this.f29379f = xw;
                }
                this.f29376c.b(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new C2948ax(AdError.INTERNAL_ERROR_2004, e10);
            }
        } catch (C2948ax e11) {
            this.f29376c.c(e11.f29154n, System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.f29376c.c(4010, System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        }
    }

    public final Xw b() {
        Xw xw;
        synchronized (this.f29380g) {
            xw = this.f29379f;
        }
        return xw;
    }

    public final synchronized Class c(Uw uw) {
        try {
            C3228g8 c3228g8 = uw.f28043a;
            if (c3228g8 == null) {
                throw new C2948ax(4010, "mc");
            }
            String A9 = c3228g8.A();
            HashMap hashMap = f29373h;
            Class cls = (Class) hashMap.get(A9);
            if (cls != null) {
                return cls;
            }
            try {
                Bw bw = this.f29377d;
                File file = uw.f28044b;
                bw.getClass();
                if (!Bw.a(file)) {
                    throw new C2948ax(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = uw.f28045c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(uw.f28044b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f29374a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(A9, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    throw new C2948ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    throw new C2948ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new C2948ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e12) {
                throw new C2948ax(2026, e12);
            }
        } finally {
        }
    }
}
