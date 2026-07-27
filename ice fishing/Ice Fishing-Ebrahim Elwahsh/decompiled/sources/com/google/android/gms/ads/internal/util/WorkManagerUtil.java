package com.google.android.gms.ads.internal.util;

import J0.b;
import J0.d;
import J0.h;
import K0.p;
import T0.c;
import V2.a;
import W3.e;
import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import java.util.HashMap;
import java.util.LinkedHashSet;
import r2.C4957a;
import r7.AbstractC4979j;
import t2.u;
import u2.i;

/* loaded from: classes.dex */
public class WorkManagerUtil extends AbstractBinderC3186f8 implements u {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public static void G3(Context context) {
        try {
            p.c(context.getApplicationContext(), new b(new e(4)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a u02 = V2.b.u0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AbstractC3241g8.f(parcel);
            boolean zze = zze(u02, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            a u03 = V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            zzf(u03);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        a u04 = V2.b.u0(parcel.readStrongBinder());
        C4957a c4957a = (C4957a) AbstractC3241g8.b(parcel, C4957a.CREATOR);
        AbstractC3241g8.f(parcel);
        boolean zzg = zzg(u04, c4957a);
        parcel2.writeNoException();
        parcel2.writeInt(zzg ? 1 : 0);
        return true;
    }

    @Override // t2.u
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new C4957a(str, str2, ""));
    }

    @Override // t2.u
    public final void zzf(a aVar) {
        Context context = (Context) V2.b.A0(aVar);
        G3(context);
        try {
            p b9 = p.b(context);
            b9.f1533d.i(new c(b9));
            d dVar = new d(2, false, false, false, false, -1L, -1L, AbstractC4979j.V(new LinkedHashSet()));
            Y2.e eVar = new Y2.e(OfflinePingSender.class);
            ((S0.p) eVar.f3964v).f2928j = dVar;
            ((LinkedHashSet) eVar.f3965w).add("offline_ping_sender_work");
            b9.a(eVar.n());
        } catch (IllegalStateException e6) {
            i.g("Failed to instantiate WorkManager.", e6);
        }
    }

    @Override // t2.u
    public final boolean zzg(a aVar, C4957a c4957a) {
        Context context = (Context) V2.b.A0(aVar);
        G3(context);
        d dVar = new d(2, false, false, false, false, -1L, -1L, AbstractC4979j.V(new LinkedHashSet()));
        HashMap hashMap = new HashMap();
        hashMap.put("uri", c4957a.f40278n);
        hashMap.put("gws_query_id", c4957a.f40279u);
        hashMap.put("image_url", c4957a.f40280v);
        h hVar = new h(hashMap);
        h.c(hVar);
        Y2.e eVar = new Y2.e(OfflineNotificationPoster.class);
        S0.p pVar = (S0.p) eVar.f3964v;
        pVar.f2928j = dVar;
        pVar.f2924e = hVar;
        ((LinkedHashSet) eVar.f3965w).add("offline_notification_work");
        try {
            p.b(context).a(eVar.n());
            return true;
        } catch (IllegalStateException e6) {
            i.g("Failed to instantiate WorkManager.", e6);
            return false;
        }
    }
}
