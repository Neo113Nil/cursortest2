package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4170xi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35040n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC4224yi f35041u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f35042v;

    public /* synthetic */ RunnableC4170xi(BinderC4224yi binderC4224yi, Runnable runnable, int i) {
        this.f35040n = i;
        this.f35041u = binderC4224yi;
        this.f35042v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3267gu c3267gu;
        Runnable runnable = this.f35042v;
        BinderC4224yi binderC4224yi = this.f35041u;
        switch (this.f35040n) {
            case 0:
                AbstractC3413jg.f31273f.execute(new RunnableC4170xi(binderC4224yi, runnable, 1));
                return;
            default:
                binderC4224yi.getClass();
                P2.w.d("Adapters must be initialized on the main thread.");
                HashMap hashMap = C4835j.f39730C.f39740h.g().n().f28915c;
                if (hashMap.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        int i = u2.z.f41319b;
                        v2.i.g("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (((InterfaceC3572md) ((AtomicReference) binderC4224yi.f35207v.f27078a.f31665w).get()) != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        for (C3358id c3358id : ((C3410jd) it.next()).f31267a) {
                            String str = c3358id.f31058b;
                            for (String str2 : c3358id.f31057a) {
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
                            C3477kq a9 = binderC4224yi.f35208w.a(str3, jSONObject);
                            if (a9 != null) {
                                C3535lu c3535lu = (C3535lu) a9.f31639b;
                                boolean a10 = c3535lu.a();
                                InterfaceC3680od interfaceC3680od = c3535lu.f31864a;
                                if (!a10) {
                                    try {
                                        if (interfaceC3680od.I()) {
                                            try {
                                                interfaceC3680od.M1(new W2.b(binderC4224yi.f35205n), (BinderC2581Gq) a9.f31640c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str3);
                                                String sb2 = sb.toString();
                                                int i6 = u2.z.f41319b;
                                                v2.i.a(sb2);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (C3267gu e9) {
                            String s9 = D.y.s(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                            int i9 = u2.z.f41319b;
                            v2.i.g(s9, e9);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
