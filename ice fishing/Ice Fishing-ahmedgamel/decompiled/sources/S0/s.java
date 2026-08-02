package S0;

import J0.t;
import J0.v;
import J0.w;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.lifecycle.C;
import androidx.work.impl.WorkDatabase_Impl;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.GzopArcadegamesActivity;
import com.anythink.core.api.AdError;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.api.ATNativeMaterial;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.api.NativeAd;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.AP;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.B4;
import com.google.android.gms.internal.ads.BinderC2486Ad;
import com.google.android.gms.internal.ads.BinderC3861ra;
import com.google.android.gms.internal.ads.C2528Cl;
import com.google.android.gms.internal.ads.C2550Dq;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3277gh;
import com.google.android.gms.internal.ads.C3280gk;
import com.google.android.gms.internal.ads.C3332hi;
import com.google.android.gms.internal.ads.C3437jh;
import com.google.android.gms.internal.ads.C3504ku;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3557lt;
import com.google.android.gms.internal.ads.C3588mN;
import com.google.android.gms.internal.ads.C3687oE;
import com.google.android.gms.internal.ads.C3699oQ;
import com.google.android.gms.internal.ads.C3754pa;
import com.google.android.gms.internal.ads.C3915sa;
import com.google.android.gms.internal.ads.C3941t;
import com.google.android.gms.internal.ads.C3958tG;
import com.google.android.gms.internal.ads.C4;
import com.google.android.gms.internal.ads.C4036un;
import com.google.android.gms.internal.ads.C4182xO;
import com.google.android.gms.internal.ads.C4256yr;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.Dt;
import com.google.android.gms.internal.ads.F4;
import com.google.android.gms.internal.ads.Hu;
import com.google.android.gms.internal.ads.InterfaceC3068cn;
import com.google.android.gms.internal.ads.InterfaceC3124dq;
import com.google.android.gms.internal.ads.InterfaceC3272gc;
import com.google.android.gms.internal.ads.InterfaceC3534lN;
import com.google.android.gms.internal.ads.InterfaceC3636nH;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import com.google.android.gms.internal.ads.InterfaceC4012uG;
import com.google.android.gms.internal.ads.InterfaceC4022uQ;
import com.google.android.gms.internal.ads.InterfaceC4066vG;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.S0;
import com.google.android.gms.internal.ads.T8;
import com.google.android.gms.internal.ads.VF;
import com.google.android.gms.internal.ads.VG;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.Zv;
import f6.C4522a;
import g4.C4532a;
import i8.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m2.C4741a;
import n.C4757b;
import n.C4759d;
import org.json.JSONException;
import org.json.JSONObject;
import pl.droidsonroids.gif.GifImageView;
import u.AbstractC5050e;
import u0.C5060i;
import w2.z;
import x2.C5189a;
import z2.InterfaceC5226c;

/* loaded from: classes.dex */
public class s implements w, ATNativeNetworkListener, l6.g, Y0.o, B4, InterfaceC5226c, VG, KD, InterfaceC3124dq, Hu, InterfaceC4012uG, InterfaceC3068cn {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2968n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2969u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2970v;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f2968n = i;
        this.f2969u = obj;
        this.f2970v = obj2;
    }

    public void A(int i, int i4, int i6, int i9, float f2, int i10) {
        try {
            ((InterfaceC4084vh) this.f2969u).e("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i4).put("maxSizeWidth", i6).put("maxSizeHeight", i9).put("density", f2).put("rotation", i10));
        } catch (JSONException e9) {
            int i11 = z.f41712b;
            x2.i.d("Error occurred while obtaining screen information.", e9);
        }
    }

    @Override // Y0.o
    public void OnCall() {
        ((GzopArcadegamesActivity) this.f2970v).startActivity((Intent) this.f2969u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3068cn
    /* renamed from: a */
    public /* synthetic */ void mo9a(Object obj) {
        ((InterfaceC4022uQ) obj).a(0, ((AP) this.f2969u).f24455a, (C3699oQ) this.f2970v);
    }

    @Override // l6.g
    public l6.f build() {
        return (b7.l) ((i) this.f2969u).b(C4522a.f37475w, (String) this.f2970v);
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c */
    public /* synthetic */ InterfaceC3636nH mo13c() {
        AtomicInteger atomicInteger = C3437jh.f32063N;
        InterfaceC3636nH mo13c = ((VG) this.f2969u).mo13c();
        byte[] bArr = (byte[]) this.f2970v;
        return new C3277gh(new VF(bArr), bArr.length, mo13c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4012uG
    public Object d(C3687oE c3687oE) {
        return ((C3958tG) this.f2969u).a(c3687oE.f33665a, ((InterfaceC4066vG) this.f2970v).f());
    }

    public File f() {
        if (((File) this.f2969u) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2969u) == null) {
                        Q3.g gVar = (Q3.g) this.f2970v;
                        gVar.a();
                        this.f2969u = new File(gVar.f2661a.getFilesDir(), "PersistedInstallation." + ((Q3.g) this.f2970v).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f2969u;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void g(Cr cr) {
        if (cr.K() != 0 || (cr.K() & 128) == 0) {
            return;
        }
        cr.G(6);
        int B3 = cr.B() / 4;
        int i = 0;
        while (true) {
            D4 d42 = (D4) this.f2970v;
            if (i >= B3) {
                d42.f25078f.remove(0);
                return;
            }
            C4256yr c4256yr = (C4256yr) this.f2969u;
            cr.H(c4256yr.f36016a, 0, 4);
            c4256yr.d(0);
            int h3 = c4256yr.h(16);
            c4256yr.f(3);
            if (h3 == 0) {
                c4256yr.f(13);
            } else {
                int h9 = c4256yr.h(13);
                if (d42.f25078f.get(h9) == null) {
                    d42.f25078f.put(h9, new C4(new C3941t(d42, h9)));
                }
            }
            i++;
        }
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        try {
            String canonicalName = ((BinderC2486Ad) this.f2970v).f24464n.getClass().getCanonicalName();
            int i = c4741a.f39357a;
            String str = c4741a.f39358b;
            String str2 = c4741a.f39359c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            x2.i.a(sb.toString());
            InterfaceC3864rd interfaceC3864rd = (InterfaceC3864rd) this.f2969u;
            interfaceC3864rd.r0(c4741a.a());
            interfaceC3864rd.N3(i, str);
            interfaceC3864rd.j0(i);
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
    }

    public ArrayList i(String str) {
        C5060i a9 = C5060i.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2969u;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m9.getCount());
            while (m9.moveToNext()) {
                arrayList.add(m9.isNull(0) ? null : m9.getString(0));
            }
            return arrayList;
        } finally {
            m9.close();
            a9.j();
        }
    }

    public void j(C4532a c4532a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c4532a.f37671a);
            jSONObject.put("Status", AbstractC5050e.d(c4532a.f37672b));
            jSONObject.put("AuthToken", c4532a.f37673c);
            jSONObject.put("RefreshToken", c4532a.f37674d);
            jSONObject.put("TokenCreationEpochInSecs", c4532a.f37676f);
            jSONObject.put("ExpiresInSecs", c4532a.f37675e);
            jSONObject.put("FisError", c4532a.f37677g);
            Q3.g gVar = (Q3.g) this.f2970v;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f2661a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(f())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void k(X2.a aVar) {
        boolean z6;
        C c9 = (C) this.f2969u;
        synchronized (c9.f5058a) {
            z6 = c9.f5063f == C.f5057k;
            c9.f5063f = aVar;
        }
        if (z6) {
            C4757b z9 = C4757b.z();
            G0.c cVar = c9.f5066j;
            C4759d c4759d = z9.f39604b;
            if (c4759d.f39608d == null) {
                synchronized (c4759d.f39606b) {
                    try {
                        if (c4759d.f39608d == null) {
                            c4759d.f39608d = C4759d.z(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c4759d.f39608d.post(cVar);
        }
        if (aVar instanceof v) {
            ((U0.k) this.f2970v).j((v) aVar);
        } else if (aVar instanceof t) {
            ((U0.k) this.f2970v).k(((t) aVar).f1437z);
        }
    }

    public void l(i8.v vVar) {
        x xVar = vVar.f38377z;
        try {
            ((M6.a) this.f2970v).accept(new S6.d(vVar, xVar));
            if (xVar != null) {
                xVar.close();
            }
        } catch (Throwable th) {
            if (xVar != null) {
                try {
                    xVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C4532a m() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(f());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = AbstractC5050e.e(5)[optInt];
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C4532a(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f2968n) {
            case 17:
                ((InterfaceC4084vh) obj).Z0((String) this.f2969u, (InterfaceC3272gc) this.f2970v);
                break;
            default:
                ((Lu) ((T8) this.f2970v).f28483y).f26982c.M1(new C3557lt(3, (Iu) this.f2969u));
                break;
        }
    }

    public void o(boolean z6, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f2969u)) {
            hashMap = new HashMap((Map) this.f2969u);
        }
        synchronized (((Map) this.f2970v)) {
            hashMap2 = new HashMap((Map) this.f2970v);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((l3.h) entry2.getKey()).c(new P2.f(status));
            }
        }
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public void onNativeAdLoadFail(AdError adError) {
        if (Y0.p.f3878g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2970v);
            ViewGroup viewGroup = (ViewGroup) this.f2969u;
            View inflate = from.inflate(C5248R.layout.qureka_native, viewGroup, false);
            Y0.p.d(inflate.findViewById(C5248R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.gif1);
            TextView textView = (TextView) inflate.findViewById(C5248R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5248R.id.desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(Y0.p.f3872S[nextInt]);
            textView2.setText(Y0.p.f3873T[nextInt]);
            gifImageView.setBackgroundResource(Y0.p.f3874U[nextInt]);
            inflate.findViewById(C5248R.id.nativeclick).setOnClickListener(new N3.n(6, this));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public void onNativeAdLoaded() {
        NativeAd nativeAd = Y0.p.f3857C.getNativeAd();
        if (Y0.p.f3858D.getParent() == null) {
            ((ViewGroup) this.f2969u).addView(Y0.p.f3858D);
        }
        Y0.p.f3868O = new ATNativePrepareInfo();
        if (nativeAd == null) {
            return;
        }
        if (nativeAd.isNativeExpress()) {
            nativeAd.renderAdContainer(Y0.p.f3858D, null);
        } else {
            Context context = (Context) this.f2970v;
            View inflate = LayoutInflater.from(context).inflate(C5248R.layout.topon_native, (ViewGroup) null);
            ATNativeMaterial adMaterial = nativeAd.getAdMaterial();
            ATNativePrepareInfo aTNativePrepareInfo = Y0.p.f3868O;
            TextView textView = (TextView) inflate.findViewById(C5248R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5248R.id.native_ad_desc);
            TextView textView3 = (TextView) inflate.findViewById(C5248R.id.native_ad_install_btn);
            TextView textView4 = (TextView) inflate.findViewById(C5248R.id.native_ad_from);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C5248R.id.native_ad_image);
            FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C5248R.id.native_ad_content_image_area);
            ATNativeImageView aTNativeImageView = (ATNativeImageView) inflate.findViewById(C5248R.id.native_ad_logo);
            ArrayList arrayList = new ArrayList();
            String title = adMaterial.getTitle();
            String descriptionText = adMaterial.getDescriptionText();
            View adIconView = adMaterial.getAdIconView();
            String iconImageUrl = adMaterial.getIconImageUrl();
            String callToActionText = adMaterial.getCallToActionText();
            View adMediaView = adMaterial.getAdMediaView(frameLayout2);
            String adChoiceIconUrl = adMaterial.getAdChoiceIconUrl();
            String adFrom = adMaterial.getAdFrom();
            textView.setText(title);
            aTNativePrepareInfo.setTitleView(textView);
            arrayList.add(textView);
            textView2.setText(descriptionText);
            aTNativePrepareInfo.setDescView(textView2);
            arrayList.add(textView2);
            if (TextUtils.isEmpty(callToActionText)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(callToActionText);
            }
            aTNativePrepareInfo.setCtaView(textView3);
            arrayList.add(textView3);
            ATNativeImageView aTNativeImageView2 = new ATNativeImageView(context);
            if (adIconView == null) {
                frameLayout.addView(aTNativeImageView2);
                aTNativeImageView2.setImage(iconImageUrl);
                aTNativePrepareInfo.setIconView(aTNativeImageView2);
                arrayList.add(aTNativeImageView2);
            } else {
                frameLayout.addView(adIconView);
                aTNativePrepareInfo.setIconView(adIconView);
                arrayList.add(adIconView);
            }
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                adMediaView.setLayoutParams(layoutParams);
                frameLayout2.addView(adMediaView, layoutParams);
                arrayList.add(adMediaView);
            } else if (TextUtils.isEmpty(adMaterial.getVideoUrl())) {
                ATNativeImageView aTNativeImageView3 = new ATNativeImageView(context);
                aTNativeImageView3.setImage(adMaterial.getMainImageUrl());
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                aTNativeImageView3.setLayoutParams(layoutParams2);
                frameLayout2.addView(aTNativeImageView3, layoutParams2);
                aTNativePrepareInfo.setMainImageView(aTNativeImageView3);
                arrayList.add(aTNativeImageView3);
            } else {
                String videoUrl = adMaterial.getVideoUrl();
                VideoView videoView = new VideoView(context);
                videoView.setVideoURI(Uri.parse(videoUrl));
                videoView.setOnPreparedListener(new Y0.d());
                videoView.start();
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                videoView.setLayoutParams(layoutParams3);
                frameLayout2.addView(videoView, layoutParams3);
                arrayList.add(videoView);
            }
            if (TextUtils.isEmpty(adFrom)) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(adFrom);
            }
            aTNativePrepareInfo.setAdFromView(textView4);
            if (!TextUtils.isEmpty(adChoiceIconUrl)) {
                aTNativeImageView.setImage(adChoiceIconUrl);
                aTNativePrepareInfo.setAdLogoView(aTNativeImageView);
            }
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) ((40.0f * context.getResources().getDisplayMetrics().density) + 0.5f), (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
            layoutParams4.gravity = 85;
            aTNativePrepareInfo.setChoiceViewLayoutParams(layoutParams4);
            aTNativePrepareInfo.setClickViewList(arrayList);
            if (aTNativePrepareInfo instanceof ATNativePrepareExInfo) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(textView3);
                ((ATNativePrepareExInfo) aTNativePrepareInfo).setCreativeClickViewList(arrayList2);
            }
            nativeAd = nativeAd;
            nativeAd.renderAdContainer(Y0.p.f3858D, inflate);
        }
        nativeAd.prepare(Y0.p.f3858D, Y0.p.f3868O);
    }

    public void p(InterfaceC3534lN interfaceC3534lN) {
        ((List) this.f2969u).add(interfaceC3534lN);
    }

    public void r(InterfaceC3534lN interfaceC3534lN) {
        ((List) this.f2970v).add(interfaceC3534lN);
    }

    public boolean s(int i) {
        return ((XO) this.f2969u).f29303a.get(i);
    }

    public C3588mN t() {
        return new C3588mN((List) this.f2969u, (List) this.f2970v);
    }

    public Set u(C3280gk c3280gk) {
        return Collections.singleton(new C2528Cl(c3280gk, AbstractC3436jg.f32062h));
    }

    public Set v(C3280gk c3280gk) {
        return Collections.singleton(new C2528Cl(c3280gk, AbstractC3436jg.f32062h));
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f2968n) {
            case 17:
                break;
            default:
                ((Lu) ((T8) this.f2970v).f28483y).f26982c.M1(new C3067cm(22, (Iu) this.f2969u, th));
                break;
        }
    }

    public void x(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put(NativeAdvancedJsUtils.f18693p, (String) this.f2970v);
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f2969u;
            if (interfaceC4084vh != null) {
                interfaceC4084vh.e("onError", put);
            }
        } catch (JSONException e9) {
            int i = z.f41712b;
            x2.i.d("Error occurred while dispatching error event.", e9);
        }
    }

    public void y(int i, int i4, int i6, int i9) {
        try {
            ((InterfaceC4084vh) this.f2969u).e("onSizeChanged", new JSONObject().put("x", i).put("y", i4).put("width", i6).put("height", i9));
        } catch (JSONException e9) {
            int i10 = z.f41712b;
            x2.i.d("Error occurred while dispatching size change.", e9);
        }
    }

    public void z(String str) {
        try {
            ((InterfaceC4084vh) this.f2969u).e("onStateChanged", new JSONObject().put(com.anythink.core.express.b.a.f18313b, str));
        } catch (JSONException e9) {
            int i = z.f41712b;
            x2.i.d("Error occurred while dispatching state change.", e9);
        }
    }

    public s(C3332hi c3332hi, Context context, RD rd) {
        this.f2968n = 18;
        this.f2969u = c3332hi;
        this.f2970v = context;
    }

    public s(IBinder iBinder) {
        this.f2968n = 3;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2969u = new Messenger(iBinder);
            this.f2970v = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f2970v = new N2.g(iBinder);
            this.f2969u = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3124dq
    /* renamed from: c, reason: collision with other method in class */
    public Object mo2c() {
        C5189a c5189a = (C5189a) this.f2969u;
        int i = c5189a.f41846u;
        int length = String.valueOf(i).length();
        int i4 = c5189a.f41847v;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f13164z);
        sb.append(i4);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(sb2)) {
                return new Zv(new C3754pa("Google", sb2), (WebView) this.f2970v);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    public s(D4 d42) {
        this.f2968n = 11;
        Objects.requireNonNull(d42);
        this.f2970v = d42;
        this.f2969u = new C4256yr(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.Hu
    /* renamed from: c, reason: collision with other method in class */
    public void mo3c() {
        C3915sa c3915sa = (C3915sa) ((C2550Dq) this.f2969u).f25230d;
        BinderC3861ra binderC3861ra = (BinderC3861ra) this.f2970v;
        Parcel F02 = c3915sa.F0();
        AbstractC3411j8.e(F02, binderC3861ra);
        c3915sa.d1(F02, 1);
    }

    public s(T8 t82, Iu iu) {
        this.f2968n = 21;
        this.f2969u = iu;
        Objects.requireNonNull(t82);
        this.f2970v = t82;
    }

    public s(BinderC2486Ad binderC2486Ad, InterfaceC3864rd interfaceC3864rd) {
        this.f2968n = 12;
        this.f2969u = interfaceC3864rd;
        Objects.requireNonNull(binderC2486Ad);
        this.f2970v = binderC2486Ad;
    }

    public s(C4036un c4036un, String str, InterfaceC3272gc interfaceC3272gc) {
        this.f2968n = 17;
        this.f2969u = str;
        this.f2970v = interfaceC3272gc;
        Objects.requireNonNull(c4036un);
    }

    public s(C3523lC c3523lC, int[] iArr) {
        this.f2968n = 22;
        this.f2969u = RB.n(c3523lC);
        this.f2970v = iArr;
    }

    public s(XO xo, SparseArray sparseArray) {
        this.f2968n = 26;
        this.f2969u = xo;
        SparseBooleanArray sparseBooleanArray = xo.f29303a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            AbstractC2792Sd.K(i, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i);
            C4182xO c4182xO = (C4182xO) sparseArray.get(keyAt);
            c4182xO.getClass();
            sparseArray2.append(keyAt, c4182xO);
        }
        this.f2970v = sparseArray2;
    }

    public s(Context context) {
        this.f2968n = 27;
        this.f2969u = context == null ? null : context.getApplicationContext();
    }

    public s(c4.e eVar) {
        this.f2968n = 9;
        this.f2969u = new HashMap();
        this.f2970v = eVar;
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f2968n = 0;
        this.f2969u = workDatabase_Impl;
        this.f2970v = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 16);
    }

    private final void q(Throwable th) {
    }

    public s(int i) {
        this.f2968n = i;
        switch (i) {
            case 4:
                this.f2969u = Collections.synchronizedMap(new WeakHashMap());
                this.f2970v = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 23:
                s sVar = MA.f27047H;
                this.f2969u = new C3504ku((C3504ku) sVar.f2969u);
                this.f2970v = Arrays.copyOf((long[]) sVar.f2970v, 10);
                break;
            default:
                this.f2969u = new C();
                this.f2970v = new U0.k();
                k(w.f1439b0);
                break;
        }
    }

    public s(Q3.g gVar) {
        this.f2968n = 29;
        this.f2970v = gVar;
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.f2968n = 1;
        int size = arrayList.size();
        this.f2969u = new int[size];
        this.f2970v = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2969u)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2970v)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public s(int i, int i4, int i6, byte b9) {
        List arrayList;
        Object arrayList2;
        this.f2968n = i6;
        switch (i6) {
            case 25:
                if (i == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList(i);
                }
                this.f2969u = arrayList;
                if (i4 == 0) {
                    arrayList2 = Collections.EMPTY_LIST;
                } else {
                    arrayList2 = new ArrayList(i4);
                }
                this.f2970v = arrayList2;
                break;
            default:
                this.f2969u = new int[]{i, i4};
                this.f2970v = new float[]{0.0f, 1.0f};
                break;
        }
    }

    public s(int i, int i4, int i6) {
        this.f2968n = 1;
        this.f2969u = new int[]{i, i4, i6};
        this.f2970v = new float[]{0.0f, 0.5f, 1.0f};
    }

    public s(GzopArcadegamesActivity gzopArcadegamesActivity, Intent intent) {
        this.f2968n = 8;
        this.f2970v = gzopArcadegamesActivity;
        this.f2969u = intent;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void b(Dt dt, S0 s02, F4 f42) {
    }
}
