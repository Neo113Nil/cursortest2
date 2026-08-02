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
    public final /* synthetic */ int f26971a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26972b;

    public /* synthetic */ Lr(int i, Object obj) {
        this.f26971a = i;
        this.f26972b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        int i = 0;
        int i4 = 2;
        Object obj = this.f26972b;
        switch (this.f26971a) {
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
                return QC.c(new Mr(1, ((C3075cu) obj).f30405q));
            case 3:
                String str = null;
                C3880rt c3880rt = (C3880rt) obj;
                if (c3880rt == null) {
                    return QC.c(new Tr(str, i4));
                }
                int i6 = V2.c.f3404a;
                String str2 = c3880rt.f34539a;
                return (str2 == null || str2.trim().isEmpty()) ? QC.c(new Tr(str, i4)) : QC.c(new Tr(str2, i4));
            case 4:
                return QC.c(new Cs(i, (Rt) obj));
            case 5:
                return QC.c(new C2966as(2, (Bundle) obj));
            case 6:
                return QC.c(new Tr((String) obj, 4));
            default:
                return QC.u(QC.s(QC.c(new Bundle()), ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33007d5)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), L2.f26833o, AbstractC3436jg.f32055a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f26971a) {
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
