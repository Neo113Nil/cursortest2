package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.ou, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3697ou implements InterfaceC4172xk {

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f32976n = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final Context f32977u;

    /* renamed from: v, reason: collision with root package name */
    public final C3199fg f32978v;

    public C3697ou(Context context, C3199fg c3199fg) {
        this.f32977u = context;
        this.f32978v = c3199fg;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f32976n;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle b() {
        String str;
        Bundle bundle;
        int identifier;
        boolean z3;
        int i;
        Bundle bundle2;
        C3199fg c3199fg = this.f32978v;
        Context context = this.f32977u;
        c3199fg.getClass();
        HashSet hashSet = new HashSet();
        synchronized (c3199fg.f30280n) {
            HashSet hashSet2 = c3199fg.f30284x;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        C3092dg c3092dg = c3199fg.f30283w;
        S0.c cVar = c3199fg.f30282v;
        synchronized (cVar) {
            str = (String) cVar.f2776v;
        }
        synchronized (c3092dg.f29796f) {
            try {
                bundle = new Bundle();
                if (!c3092dg.i.t()) {
                    bundle.putString("session_id", c3092dg.f29798h);
                }
                bundle.putLong("basets", c3092dg.f29792b);
                bundle.putLong("currts", c3092dg.f29791a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", c3092dg.f29793c);
                bundle.putInt("preqs_in_session", c3092dg.f29794d);
                bundle.putLong("time_in_session", c3092dg.f29795e);
                bundle.putInt("pclick", c3092dg.f29799j);
                bundle.putInt("pimp", c3092dg.f29800k);
                int i6 = AbstractC2837We.f28362a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                identifier = context.getResources().getIdentifier("Theme.Translucent", com.anythink.expressad.foundation.h.k.f19634e, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
            } catch (PackageManager.NameNotFoundException unused) {
                int i9 = u2.z.f41319b;
                v2.i.f("Fail to fetch AdActivity theme");
                v2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } finally {
            }
            if (identifier == 0) {
                int i10 = u2.z.f41319b;
                v2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                    z3 = true;
                    bundle.putBoolean("support_transparent_background", z3);
                    synchronized (c3092dg.f29796f) {
                        i = c3092dg.f29801l;
                    }
                    bundle.putInt("consent_form_action_identifier", i);
                } else {
                    int i11 = u2.z.f41319b;
                    v2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            z3 = false;
            bundle.putBoolean("support_transparent_background", z3);
            synchronized (c3092dg.f29796f) {
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = c3199fg.f30285y.iterator();
        if (it.hasNext()) {
            throw D.y.j(it);
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C2870Yf c2870Yf = (C2870Yf) it2.next();
            synchronized (c2870Yf.f28699d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", c2870Yf.f28700e);
                    bundle2.putString("slotid", c2870Yf.f28701f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", c2870Yf.f28704j);
                    bundle2.putLong("tresponse", c2870Yf.f28705k);
                    bundle2.putLong("timp", c2870Yf.f28702g);
                    bundle2.putLong("tload", c2870Yf.f28703h);
                    bundle2.putLong("pcc", c2870Yf.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it3 = c2870Yf.f28698c.iterator();
                    while (it3.hasNext()) {
                        C2854Xf c2854Xf = (C2854Xf) it3.next();
                        c2854Xf.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", c2854Xf.f28543a);
                        bundle5.putLong("tclose", c2854Xf.f28544b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } finally {
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList(com.anythink.expressad.foundation.d.e.f18662h, arrayList);
        a(hashSet);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final synchronized void v(C4920z0 c4920z0) {
        if (c4920z0.f40210n != 3) {
            C3199fg c3199fg = this.f32978v;
            HashSet hashSet = this.f32976n;
            synchronized (c3199fg.f30280n) {
                c3199fg.f30284x.addAll(hashSet);
            }
        }
    }
}
