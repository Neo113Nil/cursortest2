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
public final class C3025bx {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f30156h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f30157a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3078cx f30158b;

    /* renamed from: c, reason: collision with root package name */
    public final Cw f30159c;

    /* renamed from: d, reason: collision with root package name */
    public final Bw f30160d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30161e;

    /* renamed from: f, reason: collision with root package name */
    public Xw f30162f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f30163g = new Object();

    public C3025bx(Context context, InterfaceC3078cx interfaceC3078cx, Cw cw, Bw bw, boolean z6) {
        this.f30157a = context;
        this.f30158b = interfaceC3078cx;
        this.f30159c = cw;
        this.f30160d = bw;
        this.f30161e = z6;
    }

    public final boolean a(Uw uw) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Xw xw = new Xw(c(uw).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f30157a, "msa-r", uw.a(), null, new Bundle(), 2), uw, this.f30158b, this.f30159c, this.f30161e);
                if (!xw.k()) {
                    throw new C2971ax(4000, "init failed");
                }
                int m9 = xw.m();
                if (m9 != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(m9).length() + 4);
                    sb.append("ci: ");
                    sb.append(m9);
                    throw new C2971ax(4001, sb.toString());
                }
                synchronized (this.f30163g) {
                    Xw xw2 = this.f30162f;
                    if (xw2 != null) {
                        try {
                            xw2.l();
                        } catch (C2971ax e9) {
                            this.f30159c.c(e9.f29942n, -1L, e9);
                        }
                    }
                    this.f30162f = xw;
                }
                this.f30159c.b(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new C2971ax(AdError.INTERNAL_ERROR_2004, e10);
            }
        } catch (C2971ax e11) {
            this.f30159c.c(e11.f29942n, System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.f30159c.c(4010, System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        }
    }

    public final Xw b() {
        Xw xw;
        synchronized (this.f30163g) {
            xw = this.f30162f;
        }
        return xw;
    }

    public final synchronized Class c(Uw uw) {
        try {
            C3251g8 c3251g8 = uw.f28840a;
            if (c3251g8 == null) {
                throw new C2971ax(4010, "mc");
            }
            String A9 = c3251g8.A();
            HashMap hashMap = f30156h;
            Class cls = (Class) hashMap.get(A9);
            if (cls != null) {
                return cls;
            }
            try {
                Bw bw = this.f30160d;
                File file = uw.f28841b;
                bw.getClass();
                if (!Bw.a(file)) {
                    throw new C2971ax(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = uw.f28842c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(uw.f28841b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f30157a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(A9, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    throw new C2971ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    throw new C2971ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new C2971ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e12) {
                throw new C2971ax(2026, e12);
            }
        } finally {
        }
    }
}
