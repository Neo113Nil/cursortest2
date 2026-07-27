package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4021ui implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34641n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC4075vi f34642u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f34643v;

    public /* synthetic */ RunnableC4021ui(BinderC4075vi binderC4075vi, Runnable runnable, int i) {
        this.f34641n = i;
        this.f34642u = binderC4075vi;
        this.f34643v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3334hu c3334hu;
        Runnable runnable = this.f34643v;
        BinderC4075vi binderC4075vi = this.f34642u;
        switch (this.f34641n) {
            case 0:
                AbstractC3212fg.f30743f.execute(new RunnableC4021ui(binderC4075vi, runnable, 1));
                return;
            default:
                binderC4075vi.getClass();
                O2.w.d("Adapters must be initialized on the main thread.");
                HashMap hashMap = p2.j.f39798C.f39808h.g().n().f28421c;
                if (hashMap.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        int i = t2.C.f40822b;
                        u2.i.g("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (((InterfaceC3423jd) ((AtomicReference) binderC4075vi.f34846v.f27615a.f32776w).get()) != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        for (C3209fd c3209fd : ((C3263gd) it.next()).f31031a) {
                            String str = c3209fd.f30735b;
                            for (String str2 : c3209fd.f30734a) {
                                if (!hashMap2.containsKey(str2)) {
                                    hashMap2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) hashMap2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            C3598mq a9 = binderC4075vi.f34847w.a(str3, jSONObject);
                            if (a9 != null) {
                                C3656nu c3656nu = (C3656nu) a9.f32761b;
                                boolean a10 = c3656nu.a();
                                InterfaceC3531ld interfaceC3531ld = c3656nu.f33064a;
                                if (!a10) {
                                    try {
                                        if (interfaceC3531ld.G()) {
                                            try {
                                                interfaceC3531ld.N1(new V2.b(binderC4075vi.f34844n), (BinderC2614Iq) a9.f32762c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str3);
                                                String sb2 = sb.toString();
                                                int i4 = t2.C.f40822b;
                                                u2.i.a(sb2);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (C3334hu e6) {
                            String o9 = D.y.o(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                            int i9 = t2.C.f40822b;
                            u2.i.g(o9, e6);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
