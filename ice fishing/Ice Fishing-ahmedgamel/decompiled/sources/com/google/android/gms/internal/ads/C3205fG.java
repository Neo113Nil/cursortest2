package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3205fG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3205fG f31026b = new C3205fG();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31027a = new HashMap();

    public final synchronized void a(String str, AbstractC3848rE abstractC3848rE) {
        try {
            HashMap hashMap = this.f31027a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, abstractC3848rE);
                return;
            }
            if (((AbstractC3848rE) hashMap.get(str)).equals(abstractC3848rE)) {
                return;
            }
            String valueOf = String.valueOf(hashMap.get(str));
            String valueOf2 = String.valueOf(abstractC3848rE);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + valueOf.length() + 17 + valueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(valueOf);
            sb.append("), cannot insert ");
            sb.append(valueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (AbstractC3848rE) entry.getValue());
        }
    }
}
