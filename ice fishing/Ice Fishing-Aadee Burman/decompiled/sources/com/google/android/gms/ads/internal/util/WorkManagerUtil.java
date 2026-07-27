package com.google.android.gms.ads.internal.util;

import J0.b;
import J0.d;
import J0.h;
import K0.p;
import M2.i;
import T0.c;
import W2.a;
import Z2.e;
import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import java.util.HashMap;
import java.util.LinkedHashSet;
import s2.C4971a;
import u2.t;
import v7.AbstractC5129j;

/* loaded from: classes.dex */
public class WorkManagerUtil extends AbstractBinderC3336i8 implements t {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public static void U3(Context context) {
        try {
            p.c(context.getApplicationContext(), new b(new i(4)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a w02 = W2.b.w0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AbstractC3388j8.f(parcel);
            boolean zze = zze(w02, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            a w03 = W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            zzf(w03);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        a w04 = W2.b.w0(parcel.readStrongBinder());
        C4971a c4971a = (C4971a) AbstractC3388j8.b(parcel, C4971a.CREATOR);
        AbstractC3388j8.f(parcel);
        boolean zzg = zzg(w04, c4971a);
        parcel2.writeNoException();
        parcel2.writeInt(zzg ? 1 : 0);
        return true;
    }

    @Override // u2.t
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new C4971a(str, str2, ""));
    }

    @Override // u2.t
    public final void zzf(a aVar) {
        Context context = (Context) W2.b.F0(aVar);
        U3(context);
        try {
            p b9 = p.b(context);
            b9.f1535d.i(new c(b9));
            d dVar = new d(2, false, false, false, false, -1L, -1L, AbstractC5129j.P(new LinkedHashSet()));
            e eVar = new e(OfflinePingSender.class);
            ((S0.p) eVar.f4171v).f2816j = dVar;
            ((LinkedHashSet) eVar.f4172w).add("offline_ping_sender_work");
            b9.a(eVar.m());
        } catch (IllegalStateException e9) {
            v2.i.g("Failed to instantiate WorkManager.", e9);
        }
    }

    @Override // u2.t
    public final boolean zzg(a aVar, C4971a c4971a) {
        Context context = (Context) W2.b.F0(aVar);
        U3(context);
        d dVar = new d(2, false, false, false, false, -1L, -1L, AbstractC5129j.P(new LinkedHashSet()));
        HashMap hashMap = new HashMap();
        hashMap.put("uri", c4971a.f40457n);
        hashMap.put("gws_query_id", c4971a.f40458u);
        hashMap.put("image_url", c4971a.f40459v);
        h hVar = new h(hashMap);
        h.c(hVar);
        e eVar = new e(OfflineNotificationPoster.class);
        S0.p pVar = (S0.p) eVar.f4171v;
        pVar.f2816j = dVar;
        pVar.f2812e = hVar;
        ((LinkedHashSet) eVar.f4172w).add("offline_notification_work");
        try {
            p.b(context).a(eVar.m());
            return true;
        } catch (IllegalStateException e9) {
            v2.i.g("Failed to instantiate WorkManager.", e9);
            return false;
        }
    }
}
