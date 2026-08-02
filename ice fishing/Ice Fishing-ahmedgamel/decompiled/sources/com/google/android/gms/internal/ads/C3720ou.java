package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.ou, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3720ou implements InterfaceC4195xk {

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f33762n = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final Context f33763u;

    /* renamed from: v, reason: collision with root package name */
    public final C3222fg f33764v;

    public C3720ou(Context context, C3222fg c3222fg) {
        this.f33763u = context;
        this.f33764v = c3222fg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final synchronized void I(C4969z0 c4969z0) {
        if (c4969z0.f40512n != 3) {
            C3222fg c3222fg = this.f33764v;
            HashSet hashSet = this.f33762n;
            synchronized (c3222fg.f31068n) {
                c3222fg.f31072x.addAll(hashSet);
            }
        }
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f33762n;
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
        boolean z6;
        int i;
        Bundle bundle2;
        C3222fg c3222fg = this.f33764v;
        Context context = this.f33763u;
        c3222fg.getClass();
        HashSet hashSet = new HashSet();
        synchronized (c3222fg.f31068n) {
            HashSet hashSet2 = c3222fg.f31072x;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        C3115dg c3115dg = c3222fg.f31071w;
        S0.c cVar = c3222fg.f31070v;
        synchronized (cVar) {
            str = (String) cVar.f2903v;
        }
        synchronized (c3115dg.f30569f) {
            try {
                bundle = new Bundle();
                if (!c3115dg.i.t()) {
                    bundle.putString("session_id", c3115dg.f30571h);
                }
                bundle.putLong("basets", c3115dg.f30565b);
                bundle.putLong("currts", c3115dg.f30564a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", c3115dg.f30566c);
                bundle.putInt("preqs_in_session", c3115dg.f30567d);
                bundle.putLong("time_in_session", c3115dg.f30568e);
                bundle.putInt("pclick", c3115dg.f30572j);
                bundle.putInt("pimp", c3115dg.f30573k);
                int i4 = AbstractC2860We.f29161a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                identifier = context.getResources().getIdentifier("Theme.Translucent", com.anythink.expressad.foundation.h.k.f20421e, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
            } catch (PackageManager.NameNotFoundException unused) {
                int i6 = w2.z.f41712b;
                x2.i.f("Fail to fetch AdActivity theme");
                x2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } finally {
            }
            if (identifier == 0) {
                int i9 = w2.z.f41712b;
                x2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                    z6 = true;
                    bundle.putBoolean("support_transparent_background", z6);
                    synchronized (c3115dg.f30569f) {
                        i = c3115dg.f30574l;
                    }
                    bundle.putInt("consent_form_action_identifier", i);
                } else {
                    int i10 = w2.z.f41712b;
                    x2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            z6 = false;
            bundle.putBoolean("support_transparent_background", z6);
            synchronized (c3115dg.f30569f) {
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = c3222fg.f31073y.iterator();
        if (it.hasNext()) {
            throw D.x.i(it);
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C2893Yf c2893Yf = (C2893Yf) it2.next();
            synchronized (c2893Yf.f29474d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", c2893Yf.f29475e);
                    bundle2.putString("slotid", c2893Yf.f29476f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", c2893Yf.f29479j);
                    bundle2.putLong("tresponse", c2893Yf.f29480k);
                    bundle2.putLong("timp", c2893Yf.f29477g);
                    bundle2.putLong("tload", c2893Yf.f29478h);
                    bundle2.putLong("pcc", c2893Yf.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it3 = c2893Yf.f29473c.iterator();
                    while (it3.hasNext()) {
                        C2877Xf c2877Xf = (C2877Xf) it3.next();
                        c2877Xf.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", c2877Xf.f29315a);
                        bundle5.putLong("tclose", c2877Xf.f29316b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } finally {
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList(com.anythink.expressad.foundation.d.e.f19449h, arrayList);
        a(hashSet);
        return bundle3;
    }
}
