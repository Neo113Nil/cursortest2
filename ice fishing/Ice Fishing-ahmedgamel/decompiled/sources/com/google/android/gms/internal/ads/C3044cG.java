package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3044cG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3044cG f30222b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f30223a = new HashMap();

    static {
        CE ce = CE.f24835k;
        C3044cG c3044cG = new C3044cG();
        try {
            c3044cG.a(ce, C2937aG.class);
            f30222b = c3044cG;
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException("unexpected error.", e9);
        }
    }

    public final synchronized void a(PF pf, Class cls) {
        try {
            HashMap hashMap = this.f30223a;
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

    public final WC b(AbstractC3848rE abstractC3848rE, Integer num) {
        WC a9;
        synchronized (this) {
            PF pf = (PF) this.f30223a.get(abstractC3848rE.getClass());
            if (pf == null) {
                String obj = abstractC3848rE.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(obj);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            a9 = pf.a(abstractC3848rE, num);
        }
        return a9;
    }
}
