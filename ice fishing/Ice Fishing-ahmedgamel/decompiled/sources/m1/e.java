package m1;

import L3.q;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.api.ATNativeMaterial;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.api.NativeAd;
import com.google.android.gms.internal.ads.C3279h5;
import com.google.android.gms.internal.ads.InterfaceC3225g5;
import com.icefishingapp.icefishing.C5275R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import o4.C4790c;
import o4.m;
import pl.droidsonroids.gif.GifImageView;
import t0.X;
import u2.p;
import u2.z;
import v2.InterfaceC5112c;
import v2.i;
import v2.k;

/* loaded from: classes.dex */
public final class e implements ATNativeNetworkListener, InterfaceC3225g5, InterfaceC5112c {

    /* renamed from: n, reason: collision with root package name */
    public Object f39301n;

    /* renamed from: u, reason: collision with root package name */
    public Object f39302u;

    public /* synthetic */ e(Object obj, Context context) {
        this.f39302u = obj;
        this.f39301n = context;
    }

    public void a(int i) {
        int[] iArr = (int[]) this.f39302u;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f39302u = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f39302u = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f39302u;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // v2.InterfaceC5112c
    public /* synthetic */ k b(String str) {
        new com.facebook.ads.internal.dynamicloading.a((v2.d) this.f39302u, (Context) this.f39301n, str).start();
        return k.f41418n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3225g5
    public void c(C3279h5 c3279h5) {
        String obj = c3279h5.toString();
        String str = (String) this.f39302u;
        String o6 = f.o(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length()), "Failed to load URL: ", str, "\n", obj);
        int i = z.f41322b;
        i.f(o6);
        ((p) this.f39301n).b(null);
    }

    public File d() {
        if (((File) this.f39302u) == null) {
            this.f39302u = new File(((Context) this.f39301n).getCacheDir(), "volley");
        }
        return (File) this.f39302u;
    }

    public void e(int i, int i6) {
        int[] iArr = (int[]) this.f39302u;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i9 = i + i6;
        a(i9);
        int[] iArr2 = (int[]) this.f39302u;
        System.arraycopy(iArr2, i, iArr2, i9, (iArr2.length - i) - i6);
        Arrays.fill((int[]) this.f39302u, i, i9, -1);
        ArrayList arrayList = (ArrayList) this.f39301n;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x9 = (X) ((ArrayList) this.f39301n).get(size);
            int i10 = x9.f40622n;
            if (i10 >= i) {
                x9.f40622n = i10 + i6;
            }
        }
    }

    public void f(int i, int i6) {
        int[] iArr = (int[]) this.f39302u;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i9 = i + i6;
        a(i9);
        int[] iArr2 = (int[]) this.f39302u;
        System.arraycopy(iArr2, i9, iArr2, i, (iArr2.length - i) - i6);
        int[] iArr3 = (int[]) this.f39302u;
        Arrays.fill(iArr3, iArr3.length - i6, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f39301n;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x9 = (X) ((ArrayList) this.f39301n).get(size);
            int i10 = x9.f40622n;
            if (i10 >= i) {
                if (i10 < i9) {
                    ((ArrayList) this.f39301n).remove(size);
                } else {
                    x9.f40622n = i10 - i6;
                }
            }
        }
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public void onNativeAdLoadFail(AdError adError) {
        if (m.f39615g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f39301n);
            ViewGroup viewGroup = (ViewGroup) this.f39302u;
            View inflate = from.inflate(C5275R.layout.qureka_native, viewGroup, false);
            m.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.gif1);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(m.f39609S[nextInt]);
            textView2.setText(m.f39610T[nextInt]);
            gifImageView.setBackgroundResource(m.f39611U[nextInt]);
            inflate.findViewById(C5275R.id.nativeclick).setOnClickListener(new q(12, this));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public void onNativeAdLoaded() {
        NativeAd nativeAd = m.f39594C.getNativeAd();
        if (m.f39595D.getParent() == null) {
            ((ViewGroup) this.f39302u).addView(m.f39595D);
        }
        m.f39605O = new ATNativePrepareInfo();
        if (nativeAd == null) {
            return;
        }
        if (nativeAd.isNativeExpress()) {
            nativeAd.renderAdContainer(m.f39595D, null);
        } else {
            Context context = (Context) this.f39301n;
            View inflate = LayoutInflater.from(context).inflate(C5275R.layout.topon_native, (ViewGroup) null);
            ATNativeMaterial adMaterial = nativeAd.getAdMaterial();
            ATNativePrepareInfo aTNativePrepareInfo = m.f39605O;
            TextView textView = (TextView) inflate.findViewById(C5275R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.native_ad_desc);
            TextView textView3 = (TextView) inflate.findViewById(C5275R.id.native_ad_install_btn);
            TextView textView4 = (TextView) inflate.findViewById(C5275R.id.native_ad_from);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C5275R.id.native_ad_image);
            FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C5275R.id.native_ad_content_image_area);
            ATNativeImageView aTNativeImageView = (ATNativeImageView) inflate.findViewById(C5275R.id.native_ad_logo);
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
                videoView.setOnPreparedListener(new C4790c());
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
            nativeAd.renderAdContainer(m.f39595D, inflate);
        }
        nativeAd.prepare(m.f39595D, m.f39605O);
    }
}
