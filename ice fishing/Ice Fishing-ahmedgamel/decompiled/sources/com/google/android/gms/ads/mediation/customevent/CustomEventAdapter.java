package com.google.android.gms.ads.mediation.customevent;

import G3.e;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.C4297ze;
import m2.C4741a;
import m2.h;
import x2.i;
import z2.InterfaceC5227d;
import z2.InterfaceC5231h;
import z2.j;
import z2.l;
import z2.n;

/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final C4741a f24365d = new C4741a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads", null);

    /* renamed from: a, reason: collision with root package name */
    public CustomEventBanner f24366a;

    /* renamed from: b, reason: collision with root package name */
    public CustomEventInterstitial f24367b;

    /* renamed from: c, reason: collision with root package name */
    public CustomEventNative f24368c;

    public static Object a(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            throw null;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            i.f(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f24366a;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f24367b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f24368c;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f24366a;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f24367b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f24368c;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f24366a;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f24367b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f24368c;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, InterfaceC5231h interfaceC5231h, Bundle bundle, h hVar, InterfaceC5227d interfaceC5227d, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f24366a = customEventBanner;
        if (customEventBanner == null) {
            ((C4297ze) interfaceC5231h).g(f24365d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f24366a;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new e(1), bundle.getString("parameter"), hVar, interfaceC5227d, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, j jVar, Bundle bundle, InterfaceC5227d interfaceC5227d, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f24367b = customEventInterstitial;
        if (customEventInterstitial == null) {
            ((C4297ze) jVar).h(f24365d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f24367b;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new O2.i(1), bundle.getString("parameter"), interfaceC5227d, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f24368c = customEventNative;
        if (customEventNative == null) {
            ((C4297ze) lVar).i(f24365d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f24368c;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new c4.e(), bundle.getString("parameter"), nVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f24367b;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
