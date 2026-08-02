package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4193xi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35819n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC4247yi f35820u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f35821v;

    public /* synthetic */ RunnableC4193xi(BinderC4247yi binderC4247yi, Runnable runnable, int i) {
        this.f35819n = i;
        this.f35820u = binderC4247yi;
        this.f35821v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3290gu c3290gu;
        Runnable runnable = this.f35821v;
        BinderC4247yi binderC4247yi = this.f35820u;
        switch (this.f35819n) {
            case 0:
                AbstractC3436jg.f32060f.execute(new RunnableC4193xi(binderC4247yi, runnable, 1));
                return;
            default:
                binderC4247yi.getClass();
                R2.w.d("Adapters must be initialized on the main thread.");
                HashMap hashMap = C4906k.f40186C.f40196h.g().n().f29692c;
                if (hashMap.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        int i = w2.z.f41712b;
                        x2.i.g("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (((InterfaceC3595md) ((AtomicReference) binderC4247yi.f35997v.f28022a.f32447w).get()) != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        for (C3381id c3381id : ((C3433jd) it.next()).f32054a) {
                            String str = c3381id.f31829b;
                            for (String str2 : c3381id.f31828a) {
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
                            C3500kq a9 = binderC4247yi.f35998w.a(str3, jSONObject);
                            if (a9 != null) {
                                C3558lu c3558lu = (C3558lu) a9.f32421b;
                                boolean a10 = c3558lu.a();
                                InterfaceC3703od interfaceC3703od = c3558lu.f32644a;
                                if (!a10) {
                                    try {
                                        if (interfaceC3703od.H()) {
                                            try {
                                                interfaceC3703od.G0(new Y2.b(binderC4247yi.f35995n), (BinderC2601Gq) a9.f32422c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str3);
                                                String sb2 = sb.toString();
                                                int i4 = w2.z.f41712b;
                                                x2.i.a(sb2);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (C3290gu e9) {
                            String p9 = D.x.p(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                            int i6 = w2.z.f41712b;
                            x2.i.g(p9, e9);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
