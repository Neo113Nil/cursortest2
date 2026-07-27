package S0;

import B1.C0260b;
import B1.C0262d;
import a2.C0425d;
import a2.C0426e;
import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0490x;
import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import androidx.fragment.app.C;
import androidx.fragment.app.N;
import androidx.work.impl.WorkDatabase_Impl;
import b2.InterfaceC0525b;
import b6.C0530a;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C2937ae;
import com.google.android.gms.internal.ads.C2992be;
import com.google.android.gms.internal.ads.C4088vv;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.GzopSportsRacinggamesActivity;
import g1.C4523c;
import g2.C4525a;
import h3.InterfaceC4567a;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.C4647b;
import k4.InterfaceC4657l;
import o6.C4839a;
import org.xmlpull.v1.XmlPullParserException;
import p7.InterfaceC4864a;
import t0.X;
import t0.Y;
import u0.C5098i;
import u1.x;
import u8.v;
import u8.w;
import v1.C5119c;
import v1.InterfaceC5117a;
import z2.InterfaceC5272b;

/* loaded from: classes.dex */
public final class c implements s1.k, InterfaceC4567a, h6.g, InterfaceC0525b, InterfaceC4657l, w, InterfaceC5272b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2885n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2886u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2887v;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2885n = i;
        this.f2886u = obj;
        this.f2887v = obj2;
    }

    public void A(v1.g gVar, Object obj) {
        HashMap hashMap = (HashMap) this.f2887v;
        C5119c c5119c = (C5119c) hashMap.get(gVar);
        if (c5119c == null) {
            c5119c = new C5119c(gVar);
            c5119c.f41334d = c5119c;
            C5119c c5119c2 = (C5119c) this.f2886u;
            c5119c.f41334d = c5119c2.f41334d;
            c5119c.f41333c = c5119c2;
            c5119c2.f41334d = c5119c;
            c5119c.f41334d.f41333c = c5119c;
            hashMap.put(gVar, c5119c);
        } else {
            gVar.a();
        }
        if (c5119c.f41332b == null) {
            c5119c.f41332b = new ArrayList();
        }
        c5119c.f41332b.add(obj);
    }

    public Object B() {
        C5119c c5119c = (C5119c) this.f2886u;
        C5119c c5119c2 = c5119c.f41334d;
        while (true) {
            if (c5119c2.equals(c5119c)) {
                return null;
            }
            ArrayList arrayList = c5119c2.f41332b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? c5119c2.f41332b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            C5119c c5119c3 = c5119c2.f41334d;
            c5119c3.f41333c = c5119c2.f41333c;
            c5119c2.f41333c.f41334d = c5119c3;
            HashMap hashMap = (HashMap) this.f2887v;
            v1.g gVar = c5119c2.f41331a;
            hashMap.remove(gVar);
            gVar.a();
            c5119c2 = c5119c2.f41334d;
        }
    }

    public int C(Context context, M2.c cVar) {
        O2.w.h(context);
        O2.w.h(cVar);
        int k6 = cVar.k();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2886u;
        int i = sparseIntArray.get(k6, -1);
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= sparseIntArray.size()) {
                i4 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i9);
            if (keyAt > k6 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i9++;
        }
        if (i4 == -1) {
            i4 = ((L2.f) this.f2887v).c(context, k6);
        }
        sparseIntArray.put(k6, i4);
        return i4;
    }

    public void D(boolean z8, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f2886u)) {
            hashMap = new HashMap((Map) this.f2886u);
        }
        synchronized (((Map) this.f2887v)) {
            hashMap2 = new HashMap((Map) this.f2887v);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((h3.h) entry2.getKey()).c(new M2.f(status));
            }
        }
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        ((GzopSportsRacinggamesActivity) this.f2887v).startActivity((Intent) this.f2886u);
    }

    public void a(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Bundle bundle, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.a(abstractComponentCallbacksC0485s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentActivityCreated(n9, abstractComponentCallbacksC0485s, bundle);
        }
    }

    @Override // s1.InterfaceC4989b
    public boolean b(Object obj, File file, s1.h hVar) {
        return ((C0260b) this.f2887v).b(new C0262d(((BitmapDrawable) ((x) obj).get()).getBitmap(), (InterfaceC5117a) this.f2886u), file, hVar);
    }

    @Override // h6.g
    public h6.f build() {
        return (X6.l) ((i) this.f2886u).h(C0530a.f5557w, (String) this.f2887v);
    }

    @Override // u8.w
    public u8.x c() {
        return (i8.h) this.f2887v;
    }

    public void d(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractActivityC0490x abstractActivityC0490x = n9.f4980t.f5188u;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.d(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentAttached(n9, abstractComponentCallbacksC0485s, abstractActivityC0490x);
        }
    }

    public void e(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Bundle bundle, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.e(abstractComponentCallbacksC0485s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentCreated(n9, abstractComponentCallbacksC0485s, bundle);
        }
    }

    public void f(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.f(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentDestroyed(n9, abstractComponentCallbacksC0485s);
        }
    }

    public void g(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.g(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentDetached(n9, abstractComponentCallbacksC0485s);
        }
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        switch (this.f2885n) {
            case 8:
                return new C0426e((Context) ((C4523c) this.f2886u).f37856u, (C0425d) ((C4523c) this.f2887v).get());
            default:
                return new g2.h(new L2.i(19), new C3.e(), C4525a.f37859f, (g2.j) ((h4.c) this.f2886u).get(), (InterfaceC4864a) this.f2887v);
        }
    }

    public void h(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.h(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentPaused(n9, abstractComponentCallbacksC0485s);
        }
    }

    public void i(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractActivityC0490x abstractActivityC0490x = n9.f4980t.f5188u;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.i(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentPreAttached(n9, abstractComponentCallbacksC0485s, abstractActivityC0490x);
        }
    }

    @Override // u8.w
    public v j() {
        return (i8.g) this.f2886u;
    }

    public void k(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Bundle bundle, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.k(abstractComponentCallbacksC0485s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentPreCreated(n9, abstractComponentCallbacksC0485s, bundle);
        }
    }

    public void l(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.l(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentResumed(n9, abstractComponentCallbacksC0485s);
        }
    }

    public void m(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Bundle bundle, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.m(abstractComponentCallbacksC0485s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentSaveInstanceState(n9, abstractComponentCallbacksC0485s, bundle);
        }
    }

    public void n(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.n(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentStarted(n9, abstractComponentCallbacksC0485s);
        }
    }

    public void o(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.o(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentStopped(n9, abstractComponentCallbacksC0485s);
        }
    }

    @Override // z2.InterfaceC5272b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        LayoutInflater from = LayoutInflater.from((Context) this.f2886u);
        ViewGroup viewGroup = (ViewGroup) this.f2887v;
        NativeAdView nativeAdView = (NativeAdView) from.inflate(C5284R.layout.admob_native, viewGroup, false);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(C5284R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(C5284R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(C5284R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(C5284R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(C5284R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(C5284R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(C5284R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(C5284R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(C5284R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.e());
        nativeAdView.getMediaView().setMediaContent(nativeAd.h());
        if (nativeAd.c() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.c());
        }
        if (nativeAd.d() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.d());
        }
        C2937ae c2937ae = ((C2992be) nativeAd).f29525c;
        if (c2937ae == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(c2937ae.f29237b);
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.i() == null) {
            nativeAdView.getPriceView().setVisibility(4);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(nativeAd.i());
        }
        if (nativeAd.l() == null) {
            nativeAdView.getStoreView().setVisibility(4);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(nativeAd.l());
        }
        if (nativeAd.k() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.k().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.b() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.b());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
        k2.v a9 = nativeAd.h().a();
        if (nativeAd.h() != null && nativeAd.h().b()) {
            a9.a(new C4647b());
        }
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView);
    }

    public void p(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, View view, Bundle bundle, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.p(abstractComponentCallbacksC0485s, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentViewCreated(n9, abstractComponentCallbacksC0485s, view, bundle);
        }
    }

    @Override // s1.k
    public int q(s1.h hVar) {
        return 2;
    }

    public void r(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        N n9 = (N) this.f2887v;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = n9.f4982v;
        if (abstractComponentCallbacksC0485s2 != null) {
            abstractComponentCallbacksC0485s2.f().f4972l.r(abstractComponentCallbacksC0485s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            C c4 = (C) it.next();
            if (z8) {
                c4.getClass();
            }
            c4.f4929a.onFragmentViewDestroyed(n9, abstractComponentCallbacksC0485s);
        }
    }

    @Override // h3.InterfaceC4567a
    public Object s(h3.n nVar) {
        K2.b bVar = (K2.b) this.f2886u;
        bVar.getClass();
        if (!nVar.i()) {
            return nVar;
        }
        Bundle bundle = (Bundle) nVar.g();
        return (bundle == null || !bundle.containsKey("google.messenger")) ? nVar : bVar.a((Bundle) this.f2887v).j(K2.h.f1583v, K2.d.f1578w);
    }

    public View t(int i, int i4, int i9, int i10) {
        Y y6 = (Y) this.f2886u;
        int p6 = y6.p();
        int t9 = y6.t();
        int i11 = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            View z8 = y6.z(i);
            int k6 = y6.k(z8);
            int A8 = y6.A(z8);
            X x3 = (X) this.f2887v;
            x3.f40659b = p6;
            x3.f40660c = t9;
            x3.f40661d = k6;
            x3.f40662e = A8;
            if (i9 != 0) {
                x3.f40658a = i9;
                if (x3.a()) {
                    return z8;
                }
            }
            if (i10 != 0) {
                x3.f40658a = i10;
                if (x3.a()) {
                    view = z8;
                }
            }
            i += i11;
        }
        return view;
    }

    public String toString() {
        switch (this.f2885n) {
            case 19:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C5119c c5119c = (C5119c) this.f2886u;
                C5119c c5119c2 = c5119c.f41333c;
                boolean z8 = false;
                while (!c5119c2.equals(c5119c)) {
                    sb.append('{');
                    sb.append(c5119c2.f41331a);
                    sb.append(':');
                    ArrayList arrayList = c5119c2.f41332b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c5119c2 = c5119c2.f41333c;
                    z8 = true;
                }
                if (z8) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u(v1.g gVar) {
        HashMap hashMap = (HashMap) this.f2887v;
        C5119c c5119c = (C5119c) hashMap.get(gVar);
        if (c5119c == null) {
            c5119c = new C5119c(gVar);
            hashMap.put(gVar, c5119c);
        } else {
            gVar.a();
        }
        C5119c c5119c2 = c5119c.f41334d;
        c5119c2.f41333c = c5119c.f41333c;
        c5119c.f41333c.f41334d = c5119c2;
        C5119c c5119c3 = (C5119c) this.f2886u;
        c5119c.f41334d = c5119c3;
        C5119c c5119c4 = c5119c3.f41333c;
        c5119c.f41333c = c5119c4;
        c5119c4.f41334d = c5119c;
        c5119c.f41334d.f41333c = c5119c;
        ArrayList arrayList = c5119c.f41332b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c5119c.f41332b.remove(size - 1);
        }
        return null;
    }

    public ArrayList v(String str) {
        C5098i a9 = C5098i.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2886u;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m8.getCount());
            while (m8.moveToNext()) {
                arrayList.add(m8.isNull(0) ? null : m8.getString(0));
            }
            return arrayList;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public synchronized List w(String str) {
        List list;
        if (!((ArrayList) this.f2886u).contains(str)) {
            ((ArrayList) this.f2886u).add(str);
        }
        list = (List) ((HashMap) this.f2887v).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f2887v).put(str, list);
        }
        return list;
    }

    public synchronized ArrayList x(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2886u).iterator();
        while (it.hasNext()) {
            List<I1.d> list = (List) ((HashMap) this.f2887v).get((String) it.next());
            if (list != null) {
                for (I1.d dVar : list) {
                    if ((dVar.f1250a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f1251b)) && !arrayList.contains(dVar.f1251b)) {
                        arrayList.add(dVar.f1251b);
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean y(View view) {
        Y y6 = (Y) this.f2886u;
        int p6 = y6.p();
        int t9 = y6.t();
        int k6 = y6.k(view);
        int A8 = y6.A(view);
        X x3 = (X) this.f2887v;
        x3.f40659b = p6;
        x3.f40660c = t9;
        x3.f40661d = k6;
        x3.f40662e = A8;
        x3.f40658a = 24579;
        return x3.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        z.i iVar;
        char c4;
        z.n nVar = new z.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e6) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e6);
                } catch (XmlPullParserException e9) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e9);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c9 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c9 = 6;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c9 = 7;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c9 = 4;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c9 = 5;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c9 = '\t';
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c9 = '\b';
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            switch (c9) {
                                case 0:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f41994d.f42022a = true;
                                    break;
                                case 3:
                                    iVar = z.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f41994d.f42037h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f41992b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f41995e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f41994d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f41993c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    z.b.a(context, xmlResourceParser, iVar.f41996f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            if (c4 == 0) {
                                ((SparseArray) this.f2887v).put(identifier, nVar);
                                return;
                            } else if (c4 == 1 || c4 == 2 || c4 == 3) {
                                nVar.f42092c.put(Integer.valueOf(iVar.f41991a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f2887v).put(identifier, nVar);
                return;
            }
        }
    }

    public c(L2.f fVar) {
        this.f2885n = 6;
        this.f2886u = new SparseIntArray();
        O2.w.h(fVar);
        this.f2887v = fVar;
    }

    public c(int i) {
        this.f2885n = i;
        switch (i) {
            case 5:
                this.f2886u = Collections.synchronizedMap(new WeakHashMap());
                this.f2887v = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 19:
                this.f2886u = new C5119c(null);
                this.f2887v = new HashMap();
                break;
            case 20:
                break;
            default:
                this.f2886u = new ArrayList();
                this.f2887v = new HashMap();
                break;
        }
    }

    public c(C3.e eVar) {
        this.f2885n = 10;
        this.f2886u = new HashMap();
        this.f2887v = eVar;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f2885n = 0;
        this.f2886u = workDatabase_Impl;
        this.f2887v = new b(workDatabase_Impl, 0);
    }

    public c(A6.b bVar, Duration duration) {
        this.f2885n = 16;
        Duration duration2 = C4839a.f39728u;
        this.f2886u = bVar;
        this.f2887v = duration;
    }

    public c(N n9) {
        this.f2885n = 9;
        this.f2886u = new CopyOnWriteArrayList();
        this.f2887v = n9;
    }

    public c(Y y6) {
        this.f2885n = 17;
        this.f2886u = y6;
        X x3 = new X();
        x3.f40658a = 0;
        this.f2887v = x3;
    }

    public c(C4088vv c4088vv) {
        this.f2885n = 13;
        this.f2886u = new i8.g(c4088vv, ((j8.f) c4088vv.f34901x).e().j(), -1L);
        this.f2887v = new i8.h(c4088vv, ((j8.f) c4088vv.f34901x).e().c(), -1L);
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f2885n = 2;
        int size = arrayList.size();
        this.f2886u = new int[size];
        this.f2887v = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2886u)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2887v)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public c(int i, int i4) {
        this.f2885n = 2;
        this.f2886u = new int[]{i, i4};
        this.f2887v = new float[]{0.0f, 1.0f};
    }

    public c(int i, int i4, int i9) {
        this.f2885n = 2;
        this.f2886u = new int[]{i, i4, i9};
        this.f2887v = new float[]{0.0f, 0.5f, 1.0f};
    }

    public c(GzopSportsRacinggamesActivity gzopSportsRacinggamesActivity, Intent intent) {
        this.f2885n = 11;
        this.f2887v = gzopSportsRacinggamesActivity;
        this.f2886u = intent;
    }
}
