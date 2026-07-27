package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Or implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26766a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26767b;

    public /* synthetic */ Or(int i, Object obj) {
        this.f26766a = i;
        this.f26767b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        int i = 0;
        int i4 = 2;
        Object obj = this.f26767b;
        switch (this.f26766a) {
            case 0:
                return C3686oN.c(new Pr(0, E.e.a((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return C3686oN.c(new C2951as(0, arrayList));
            case 2:
                return C3686oN.c(new Pr(1, ((C3226fu) obj).f30913q));
            case 3:
                String str = null;
                C3924st c3924st = (C3924st) obj;
                if (c3924st == null) {
                    return C3686oN.c(new Vr(str, i4));
                }
                int i9 = S2.c.f2974a;
                String str2 = c3924st.f34324a;
                return (str2 == null || str2.trim().isEmpty()) ? C3686oN.c(new Vr(str, i4)) : C3686oN.c(new Vr(str2, i4));
            case 4:
                return C3686oN.c(new Ds(i, (Tt) obj));
            case 5:
                return C3686oN.c(new C3060cs(2, (Bundle) obj));
            case 6:
                return C3686oN.c(new Vr((String) obj, 4));
            default:
                return C3686oN.A(C3686oN.w(C3686oN.c(new Bundle()), ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31646d5)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), J2.f25703o, AbstractC3212fg.f30738a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f26766a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            case 6:
                return 31;
            default:
                return 49;
        }
    }
}
