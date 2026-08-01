package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3021cG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3021cG f29439b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f29440a = new HashMap();

    static {
        CE ce = CE.f24072k;
        C3021cG c3021cG = new C3021cG();
        try {
            c3021cG.a(ce, C2914aG.class);
            f29439b = c3021cG;
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException("unexpected error.", e9);
        }
    }

    public final synchronized void a(PF pf, Class cls) {
        try {
            HashMap hashMap = this.f29440a;
            PF pf2 = (PF) hashMap.get(cls);
            if (pf2 != null && !pf2.equals(pf)) {
                String obj = cls.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(obj);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            hashMap.put(cls, pf);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final WC b(AbstractC3825rE abstractC3825rE, Integer num) {
        WC a9;
        synchronized (this) {
            PF pf = (PF) this.f29440a.get(abstractC3825rE.getClass());
            if (pf == null) {
                String obj = abstractC3825rE.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(obj);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            a9 = pf.a(abstractC3825rE, num);
        }
        return a9;
    }
}
