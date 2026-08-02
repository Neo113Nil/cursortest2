package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3179er implements InterfaceC3446jq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30775a;

    /* renamed from: b, reason: collision with root package name */
    public final C2785Rn f30776b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30777c;

    public C3179er(C3878rr c3878rr, C2785Rn c2785Rn) {
        this.f30775a = 1;
        this.f30777c = c3878rr;
        this.f30776b = c2785Rn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3446jq
    public final C3500kq a(String str, JSONObject jSONObject) {
        C3500kq c3500kq;
        InterfaceC2741Pd b9;
        switch (this.f30775a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap hashMap = (HashMap) this.f30777c;
                        c3500kq = (C3500kq) hashMap.get(str);
                        if (c3500kq == null) {
                            c3500kq = new C3500kq(this.f30776b.a(str, jSONObject), new BinderC2601Gq(), str);
                            hashMap.put(str, c3500kq);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c3500kq;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33078l2)).booleanValue()) {
                    try {
                        b9 = this.f30776b.b(str);
                    } catch (RemoteException e9) {
                        int i = w2.z.f41712b;
                        x2.i.d("Coundn't create RTB adapter: ", e9);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((C3878rr) this.f30777c).f34529a;
                    if (concurrentHashMap.containsKey(str)) {
                        b9 = (InterfaceC2741Pd) concurrentHashMap.get(str);
                    }
                    b9 = null;
                }
                if (b9 == null) {
                    return null;
                }
                return new C3500kq(b9, new BinderC2584Fq(), str);
        }
    }

    public C3179er(C2785Rn c2785Rn) {
        this.f30775a = 0;
        this.f30777c = new HashMap();
        this.f30776b = c2785Rn;
    }
}
