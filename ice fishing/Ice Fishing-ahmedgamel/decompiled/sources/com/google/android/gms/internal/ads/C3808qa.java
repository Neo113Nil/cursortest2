package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.qa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3808qa {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f34025a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f34026b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34027c;

    public C3808qa(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f34026b = linkedHashMap;
        this.f34027c = new Object();
        linkedHashMap.put(NativeAdvancedJsUtils.f18693p, "make_wv");
        linkedHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str);
    }

    public static final C3700oa d() {
        C4906k.f40186C.f40198k.getClass();
        return new C3700oa(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(C3700oa c3700oa, long j6, String... strArr) {
        synchronized (this.f34027c) {
            this.f34025a.add(new C3700oa(j6, strArr[0], c3700oa));
        }
    }

    public final C3754pa b() {
        C3754pa c3754pa;
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f34027c) {
            try {
                LinkedList<C3700oa> linkedList = this.f34025a;
                for (C3700oa c3700oa : linkedList) {
                    long j6 = c3700oa.f33696a;
                    String str = c3700oa.f33697b;
                    C3700oa c3700oa2 = c3700oa.f33698c;
                    if (c3700oa2 != null && j6 > 0) {
                        long j9 = j6 - c3700oa2.f33696a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j9);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(c3700oa2.f33696a))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(c3700oa2.f33696a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                hashMap.put(Long.valueOf(c3700oa2.f33696a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        C4906k c4906k = C4906k.f40186C;
                        c4906k.f40198k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        c4906k.f40198k.getClass();
                        sb3.append(currentTimeMillis + (longValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                c3754pa = new C3754pa(sb.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3754pa;
    }

    public final void c(String str, String str2) {
        C4323b a9;
        if (TextUtils.isEmpty(str2) || (a9 = C4906k.f40186C.f40196h.a()) == null) {
            return;
        }
        synchronized (this.f34027c) {
            C3646na c3646na = (C3646na) ((HashMap) a9.f36419c).get(str);
            if (c3646na == null) {
                c3646na = C3646na.f33520b;
            }
            LinkedHashMap linkedHashMap = this.f34026b;
            linkedHashMap.put(str, c3646na.a((String) linkedHashMap.get(str), str2));
        }
    }
}
