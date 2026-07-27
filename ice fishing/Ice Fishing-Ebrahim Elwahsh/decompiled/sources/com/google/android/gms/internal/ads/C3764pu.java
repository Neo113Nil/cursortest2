package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.pu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3764pu implements InterfaceC4131wk {

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f33541n = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final Context f33542u;

    /* renamed from: v, reason: collision with root package name */
    public final C2994bg f33543v;

    public C3764pu(Context context, C2994bg c2994bg) {
        this.f33542u = context;
        this.f33543v = c2994bg;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f33541n;
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
        boolean z8;
        int i;
        Bundle bundle2;
        C2994bg c2994bg = this.f33543v;
        Context context = this.f33542u;
        c2994bg.getClass();
        HashSet hashSet = new HashSet();
        synchronized (c2994bg.f29527n) {
            HashSet hashSet2 = c2994bg.f29531x;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        C2939ag c2939ag = c2994bg.f29530w;
        C2881Yl c2881Yl = c2994bg.f29529v;
        synchronized (c2881Yl) {
            str = (String) c2881Yl.f28863v;
        }
        synchronized (c2939ag.f29246f) {
            try {
                bundle = new Bundle();
                if (!c2939ag.i.t()) {
                    bundle.putString("session_id", c2939ag.f29248h);
                }
                bundle.putLong("basets", c2939ag.f29242b);
                bundle.putLong("currts", c2939ag.f29241a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", c2939ag.f29243c);
                bundle.putInt("preqs_in_session", c2939ag.f29244d);
                bundle.putLong("time_in_session", c2939ag.f29245e);
                bundle.putInt("pclick", c2939ag.f29249j);
                bundle.putInt("pimp", c2939ag.f29250k);
                int i4 = AbstractC2789Te.f27792a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                identifier = context.getResources().getIdentifier("Theme.Translucent", com.anythink.expressad.foundation.h.k.f19792e, com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
            } catch (PackageManager.NameNotFoundException unused) {
                int i9 = t2.C.f40822b;
                u2.i.f("Fail to fetch AdActivity theme");
                u2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } finally {
            }
            if (identifier == 0) {
                int i10 = t2.C.f40822b;
                u2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                    z8 = true;
                    bundle.putBoolean("support_transparent_background", z8);
                    synchronized (c2939ag.f29246f) {
                        i = c2939ag.f29251l;
                    }
                    bundle.putInt("consent_form_action_identifier", i);
                } else {
                    int i11 = t2.C.f40822b;
                    u2.i.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            z8 = false;
            bundle.putBoolean("support_transparent_background", z8);
            synchronized (c2939ag.f29246f) {
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = c2994bg.f29532y.iterator();
        if (it.hasNext()) {
            throw D.y.h(it);
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C2824Vf c2824Vf = (C2824Vf) it2.next();
            synchronized (c2824Vf.f28274d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", c2824Vf.f28275e);
                    bundle2.putString("slotid", c2824Vf.f28276f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", c2824Vf.f28279j);
                    bundle2.putLong("tresponse", c2824Vf.f28280k);
                    bundle2.putLong("timp", c2824Vf.f28277g);
                    bundle2.putLong("tload", c2824Vf.f28278h);
                    bundle2.putLong("pcc", c2824Vf.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it3 = c2824Vf.f28273c.iterator();
                    while (it3.hasNext()) {
                        C2807Uf c2807Uf = (C2807Uf) it3.next();
                        c2807Uf.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", c2807Uf.f28052a);
                        bundle5.putLong("tclose", c2807Uf.f28053b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } finally {
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList(com.anythink.expressad.foundation.d.e.f18820h, arrayList);
        a(hashSet);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final synchronized void v(C4927z0 c4927z0) {
        if (c4927z0.f40122n != 3) {
            C2994bg c2994bg = this.f33543v;
            HashSet hashSet = this.f33541n;
            synchronized (c2994bg.f29527n) {
                c2994bg.f29531x.addAll(hashSet);
            }
        }
    }
}
