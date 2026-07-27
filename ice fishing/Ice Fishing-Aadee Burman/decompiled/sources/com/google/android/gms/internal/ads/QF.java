package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class QF {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f27008c = Logger.getLogger(QF.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final QF f27009d = new QF();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27010a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27011b = new ConcurrentHashMap();

    public final synchronized void a(XF xf, boolean z3) {
        c(xf, 1, z3);
    }

    public final XF b(Class cls, String str) {
        XF d2 = d(str);
        if (d2.f28509b.equals(cls)) {
            return d2;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d2.getClass());
        String obj = d2.f28509b.toString();
        StringBuilder sb = new StringBuilder(u1.h.a(name.length() + 53, 23, valueOf) + obj.length());
        u1.h.i(sb, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(u1.h.g(sb, ", which only supports: ", obj));
    }

    public final synchronized void c(XF xf, int i, boolean z3) {
        if (!WC.c(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(xf, z3);
    }

    public final synchronized XF d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f27010a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (XF) concurrentHashMap.get(str);
    }

    public final synchronized void e(XF xf, boolean z3) {
        try {
            String str = xf.f28508a;
            if (z3) {
                ConcurrentHashMap concurrentHashMap = this.f27011b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f27010a;
            XF xf2 = (XF) concurrentHashMap2.get(str);
            if (xf2 != null && !xf2.getClass().equals(xf.getClass())) {
                f27008c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + xf2.getClass().getName() + ", cannot be re-registered with " + xf.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, xf);
            this.f27011b.put(str, Boolean.valueOf(z3));
        } catch (Throwable th) {
            throw th;
        }
    }
}
