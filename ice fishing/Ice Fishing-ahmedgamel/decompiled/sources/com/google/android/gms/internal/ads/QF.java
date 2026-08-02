package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class QF {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f27795c = Logger.getLogger(QF.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final QF f27796d = new QF();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27797a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27798b = new ConcurrentHashMap();

    public final synchronized void a(XF xf, boolean z6) {
        c(xf, 1, z6);
    }

    public final XF b(Class cls, String str) {
        XF d9 = d(str);
        if (d9.f29289b.equals(cls)) {
            return d9;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d9.getClass());
        String obj = d9.f29289b.toString();
        StringBuilder sb = new StringBuilder(AbstractC5128c.j(name.length() + 53, 23, valueOf) + obj.length());
        AbstractC5128c.h(sb, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(Wv.i(sb, ", which only supports: ", obj));
    }

    public final synchronized void c(XF xf, int i, boolean z6) {
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(xf, z6);
    }

    public final synchronized XF d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f27797a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (XF) concurrentHashMap.get(str);
    }

    public final synchronized void e(XF xf, boolean z6) {
        try {
            String str = xf.f29288a;
            if (z6) {
                ConcurrentHashMap concurrentHashMap = this.f27798b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f27797a;
            XF xf2 = (XF) concurrentHashMap2.get(str);
            if (xf2 != null && !xf2.getClass().equals(xf.getClass())) {
                f27795c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + xf2.getClass().getName() + ", cannot be re-registered with " + xf.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, xf);
            this.f27798b.put(str, Boolean.valueOf(z6));
        } catch (Throwable th) {
            throw th;
        }
    }
}
