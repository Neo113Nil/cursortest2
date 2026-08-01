package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.qa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3785qa {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f33243a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f33244b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33245c;

    public C3785qa(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f33244b = linkedHashMap;
        this.f33245c = new Object();
        linkedHashMap.put(NativeAdvancedJsUtils.f17906p, "make_wv");
        linkedHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str);
    }

    public static final C3677oa d() {
        C4835j.f39733C.f39745k.getClass();
        return new C3677oa(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(C3677oa c3677oa, long j6, String... strArr) {
        synchronized (this.f33245c) {
            this.f33243a.add(new C3677oa(j6, strArr[0], c3677oa));
        }
    }

    public final C3731pa b() {
        C3731pa c3731pa;
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32409x2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f33245c) {
            try {
                LinkedList<C3677oa> linkedList = this.f33243a;
                for (C3677oa c3677oa : linkedList) {
                    long j6 = c3677oa.f32910a;
                    String str = c3677oa.f32911b;
                    C3677oa c3677oa2 = c3677oa.f32912c;
                    if (c3677oa2 != null && j6 > 0) {
                        long j9 = j6 - c3677oa2.f32910a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j9);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(c3677oa2.f32910a))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(c3677oa2.f32910a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                hashMap.put(Long.valueOf(c3677oa2.f32910a), new StringBuilder(str));
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
                        C4835j c4835j = C4835j.f39733C;
                        c4835j.f39745k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        c4835j.f39745k.getClass();
                        sb3.append(currentTimeMillis + (longValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                c3731pa = new C3731pa(sb.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3731pa;
    }

    public final void c(String str, String str2) {
        C4300b a9;
        if (TextUtils.isEmpty(str2) || (a9 = C4835j.f39733C.f39743h.a()) == null) {
            return;
        }
        synchronized (this.f33245c) {
            C3623na c3623na = (C3623na) ((HashMap) a9.f35650c).get(str);
            if (c3623na == null) {
                c3623na = C3623na.f32733b;
            }
            LinkedHashMap linkedHashMap = this.f33244b;
            linkedHashMap.put(str, c3623na.a((String) linkedHashMap.get(str), str2));
        }
    }
}
