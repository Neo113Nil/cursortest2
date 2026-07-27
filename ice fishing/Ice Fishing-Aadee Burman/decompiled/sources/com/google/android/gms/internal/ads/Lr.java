package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Lr implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26180a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26181b;

    public /* synthetic */ Lr(int i, Object obj) {
        this.f26180a = i;
        this.f26181b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        int i = 0;
        int i6 = 2;
        Object obj = this.f26181b;
        switch (this.f26180a) {
            case 0:
                return QC.c(new Mr(0, E.e.a((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return QC.c(new Xr(0, arrayList));
            case 2:
                return QC.c(new Mr(1, ((C3052cu) obj).f29635q));
            case 3:
                String str = null;
                C3857rt c3857rt = (C3857rt) obj;
                if (c3857rt == null) {
                    return QC.c(new Tr(str, i6));
                }
                int i9 = T2.c.f3088a;
                String str2 = c3857rt.f33771a;
                return (str2 == null || str2.trim().isEmpty()) ? QC.c(new Tr(str, i6)) : QC.c(new Tr(str2, i6));
            case 4:
                return QC.c(new Cs(i, (Rt) obj));
            case 5:
                return QC.c(new C2943as(2, (Bundle) obj));
            case 6:
                return QC.c(new Tr((String) obj, 4));
            default:
                return QC.u(QC.s(QC.c(new Bundle()), ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32227d5)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), L2.f26033o, AbstractC3413jg.f31268a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f26180a) {
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
