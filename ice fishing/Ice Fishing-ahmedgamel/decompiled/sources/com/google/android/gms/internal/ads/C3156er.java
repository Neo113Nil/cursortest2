package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3156er implements InterfaceC3423jq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29986a;

    /* renamed from: b, reason: collision with root package name */
    public final C2748Qn f29987b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f29988c;

    public C3156er(C3855rr c3855rr, C2748Qn c2748Qn) {
        this.f29986a = 1;
        this.f29988c = c3855rr;
        this.f29987b = c2748Qn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jq
    public final C3477kq a(String str, JSONObject jSONObject) {
        C3477kq c3477kq;
        InterfaceC2721Pd b9;
        switch (this.f29986a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap hashMap = (HashMap) this.f29988c;
                        c3477kq = (C3477kq) hashMap.get(str);
                        if (c3477kq == null) {
                            c3477kq = new C3477kq(this.f29987b.a(str, jSONObject), new BinderC2581Gq(), str);
                            hashMap.put(str, c3477kq);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c3477kq;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32299l2)).booleanValue()) {
                    try {
                        b9 = this.f29987b.b(str);
                    } catch (RemoteException e9) {
                        int i = u2.z.f41322b;
                        v2.i.d("Coundn't create RTB adapter: ", e9);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((C3855rr) this.f29988c).f33761a;
                    if (concurrentHashMap.containsKey(str)) {
                        b9 = (InterfaceC2721Pd) concurrentHashMap.get(str);
                    }
                    b9 = null;
                }
                if (b9 == null) {
                    return null;
                }
                return new C3477kq(b9, new BinderC2564Fq(), str);
        }
    }

    public C3156er(C2748Qn c2748Qn) {
        this.f29986a = 0;
        this.f29988c = new HashMap();
        this.f29987b = c2748Qn;
    }
}
